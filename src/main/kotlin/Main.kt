import com.starlix.service.id3.*
import jakarta.xml.bind.JAXBContext
import jakarta.xml.bind.Marshaller
import jakarta.xml.ws.BindingProvider
import java.io.StringWriter

class Main

fun gbgCred(username: String, password: String): String {
    val id3GlobalService = ID3Global()
    val factory = ObjectFactory()
    val globalAccount = id3GlobalService.basicHttpBindingGlobalCredentials

    val account = globalAccount.checkCredentials(username, password)

    val jaxbAccountContext: JAXBContext = JAXBContext.newInstance(GlobalAccount::class.java)
    val jaxbAccountMarshaller: Marshaller = jaxbAccountContext.createMarshaller()

    val accountSW = StringWriter()
    jaxbAccountMarshaller.marshal(factory.createGlobalAccount(account), accountSW)
    val accountXmlString = accountSW.toString()

    return (accountXmlString)
}

fun gbgAuthSP(username: String, password: String, profileId: String, profileVersion: Long): String {
    val id3GlobalService = ID3Global()
    val port = id3GlobalService.basicHttpBindingGlobalAuthenticate
    val factory = ObjectFactory()
    (port as BindingProvider).requestContext[BindingProvider.USERNAME_PROPERTY] = username
    (port as BindingProvider).requestContext[BindingProvider.PASSWORD_PROPERTY] = password

    try {
        val result = port.authenticateSP(
            GlobalProfileIDVersion().apply {
                id = profileId
                version = factory.createLong(profileVersion)
            },
            null,

            GlobalInputData().apply {
                personal = factory.createGlobalPersonal(
                    GlobalPersonal().apply {
                        personalDetails = factory.createGlobalPersonalDetails(
                            GlobalPersonalDetails().apply {
                                forename = factory.createString("Donald")
                                surname = factory.createString("Trump")
                                dobDay = factory.createInt(14)
                                dobMonth = factory.createInt(6)
                                dobYear = factory.createInt(1946)
                            }
                        )
                    }
                )
            }
        )


        val jaxbResultContext: JAXBContext = JAXBContext.newInstance(GlobalResultData::class.java)
        val jaxbResultMarshaller: Marshaller = jaxbResultContext.createMarshaller()

        val resultSW = StringWriter()
        jaxbResultMarshaller.marshal(factory.createGlobalResultData(result), resultSW)
        val resultXmlString = resultSW.toString()

        return resultXmlString
    }catch (e: Exception){
        e.printStackTrace()
        return ""
    }
}


fun main(args: Array<String>) {
    // Please provide the testing credentials

    // This function works fine
    println("")
    print(gbgCred("", ""))

    // This function doesn't work
    println("gbgAuthSP output: ")
    print(gbgAuthSP("", "", "", 0))
}
