
package com.starlix.service.id3;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.1
 * Generated source version: 3.0
 * 
 */
@WebService(name = "IGlobalProfile", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IGlobalProfile {


    /**
     * 
     * @param orgID
     * @return
     *     returns com.starlix.service.id3.ArrayOfGlobalProfileVersion
     * @throws IGlobalProfileGetProfileVersionsID3GExceptionFaultFaultMessage
     */
    @WebMethod(operationName = "GetProfileVersions", action = "http://www.id3global.com/ID3gWS/2013/04/IGlobalProfile/GetProfileVersions")
    @WebResult(name = "GetProfileVersionsResult", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
    @RequestWrapper(localName = "GetProfileVersions", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.GetProfileVersions")
    @ResponseWrapper(localName = "GetProfileVersionsResponse", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.GetProfileVersionsResponse")
    public ArrayOfGlobalProfileVersion getProfileVersions(
        @WebParam(name = "OrgID", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String orgID)
        throws IGlobalProfileGetProfileVersionsID3GExceptionFaultFaultMessage
    ;

    /**
     * 
     * @param orgID
     * @return
     *     returns com.starlix.service.id3.ArrayOfGlobalProfileVersionsFlag
     * @throws IGlobalProfileGetProfileVersionFlagsID3GExceptionFaultFaultMessage
     */
    @WebMethod(operationName = "GetProfileVersionFlags", action = "http://www.id3global.com/ID3gWS/2013/04/IGlobalProfile/GetProfileVersionFlags")
    @WebResult(name = "GetProfileVersionFlagsResult", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
    @RequestWrapper(localName = "GetProfileVersionFlags", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.GetProfileVersionFlags")
    @ResponseWrapper(localName = "GetProfileVersionFlagsResponse", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.GetProfileVersionFlagsResponse")
    public ArrayOfGlobalProfileVersionsFlag getProfileVersionFlags(
        @WebParam(name = "OrgID", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String orgID)
        throws IGlobalProfileGetProfileVersionFlagsID3GExceptionFaultFaultMessage
    ;

    /**
     * 
     * @param profileIdVersion
     * @param orgID
     * @return
     *     returns com.starlix.service.id3.ArrayOfunsignedInt
     * @throws IGlobalProfileGetProfileVersionItemIDsID3GExceptionFaultFaultMessage
     */
    @WebMethod(operationName = "GetProfileVersionItemIDs", action = "http://www.id3global.com/ID3gWS/2013/04/IGlobalProfile/GetProfileVersionItemIDs")
    @WebResult(name = "GetProfileVersionItemIDsResult", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
    @RequestWrapper(localName = "GetProfileVersionItemIDs", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.GetProfileVersionItemIDs")
    @ResponseWrapper(localName = "GetProfileVersionItemIDsResponse", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.GetProfileVersionItemIDsResponse")
    public ArrayOfunsignedInt getProfileVersionItemIDs(
        @WebParam(name = "OrgID", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String orgID,
        @WebParam(name = "ProfileIdVersion", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        GlobalProfileIDVersion profileIdVersion)
        throws IGlobalProfileGetProfileVersionItemIDsID3GExceptionFaultFaultMessage
    ;

    /**
     * 
     * @param profileIDVersion
     * @param orgID
     * @return
     *     returns com.starlix.service.id3.ArrayOfGlobalCardType
     * @throws IGlobalProfileGetCardTypesID3GExceptionFaultFaultMessage
     */
    @WebMethod(operationName = "GetCardTypes", action = "http://www.id3global.com/ID3gWS/2013/04/IGlobalProfile/GetCardTypes")
    @WebResult(name = "GetCardTypesResult", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
    @RequestWrapper(localName = "GetCardTypes", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.GetCardTypes")
    @ResponseWrapper(localName = "GetCardTypesResponse", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.GetCardTypesResponse")
    public ArrayOfGlobalCardType getCardTypes(
        @WebParam(name = "OrgID", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String orgID,
        @WebParam(name = "ProfileIDVersion", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        GlobalProfileIDVersion profileIDVersion)
        throws IGlobalProfileGetCardTypesID3GExceptionFaultFaultMessage
    ;

    /**
     * 
     * @param profileIDVersions
     * @param orgID
     * @return
     *     returns com.starlix.service.id3.ArrayOfGlobalCardType
     * @throws IGlobalProfileGetCardTypesMPID3GExceptionFaultFaultMessage
     */
    @WebMethod(operationName = "GetCardTypesMP", action = "http://www.id3global.com/ID3gWS/2013/04/IGlobalProfile/GetCardTypesMP")
    @WebResult(name = "GetCardTypesMPResult", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
    @RequestWrapper(localName = "GetCardTypesMP", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.GetCardTypesMP")
    @ResponseWrapper(localName = "GetCardTypesMPResponse", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.GetCardTypesMPResponse")
    public ArrayOfGlobalCardType getCardTypesMP(
        @WebParam(name = "OrgID", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String orgID,
        @WebParam(name = "ProfileIDVersions", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        ArrayOfGlobalProfileIDVersion profileIDVersions)
        throws IGlobalProfileGetCardTypesMPID3GExceptionFaultFaultMessage
    ;

    /**
     * 
     * @param profileIDVersions
     * @param orgID
     * @return
     *     returns com.starlix.service.id3.GlobalSupportedFields
     * @throws IGlobalProfileSupportedFieldsID3GExceptionFaultFaultMessage
     */
    @WebMethod(operationName = "SupportedFields", action = "http://www.id3global.com/ID3gWS/2013/04/IGlobalProfile/SupportedFields")
    @WebResult(name = "SupportedFieldsResult", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
    @RequestWrapper(localName = "SupportedFields", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.SupportedFields")
    @ResponseWrapper(localName = "SupportedFieldsResponse", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.SupportedFieldsResponse")
    public GlobalSupportedFields supportedFields(
        @WebParam(name = "OrgID", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String orgID,
        @WebParam(name = "ProfileIDVersions", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        ArrayOfGlobalProfileIDVersion profileIDVersions)
        throws IGlobalProfileSupportedFieldsID3GExceptionFaultFaultMessage
    ;

    /**
     * 
     * @param includeEffective
     * @param includeRetired
     * @param includePreEffective
     * @param includeTest
     * @param orgID
     * @return
     *     returns com.starlix.service.id3.ArrayOfGlobalProfile
     * @throws IGlobalProfileGetProfilesID3GExceptionFaultFaultMessage
     */
    @WebMethod(operationName = "GetProfiles", action = "http://www.id3global.com/ID3gWS/2013/04/IGlobalProfile/GetProfiles")
    @WebResult(name = "GetProfilesResult", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
    @RequestWrapper(localName = "GetProfiles", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.GetProfiles")
    @ResponseWrapper(localName = "GetProfilesResponse", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.GetProfilesResponse")
    public ArrayOfGlobalProfile getProfiles(
        @WebParam(name = "OrgID", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String orgID,
        @WebParam(name = "IncludeTest", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        Boolean includeTest,
        @WebParam(name = "IncludePreEffective", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        Boolean includePreEffective,
        @WebParam(name = "IncludeEffective", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        Boolean includeEffective,
        @WebParam(name = "IncludeRetired", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        Boolean includeRetired)
        throws IGlobalProfileGetProfilesID3GExceptionFaultFaultMessage
    ;

    /**
     * 
     * @param includeEffective
     * @param includeRetired
     * @param profileID
     * @param includePreEffective
     * @param includeTest
     * @param orgID
     * @return
     *     returns com.starlix.service.id3.ArrayOfGlobalProfileVersion
     * @throws IGlobalProfileGetProfileChainID3GExceptionFaultFaultMessage
     */
    @WebMethod(operationName = "GetProfileChain", action = "http://www.id3global.com/ID3gWS/2013/04/IGlobalProfile/GetProfileChain")
    @WebResult(name = "GetProfileChainResult", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
    @RequestWrapper(localName = "GetProfileChain", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.GetProfileChain")
    @ResponseWrapper(localName = "GetProfileChainResponse", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.GetProfileChainResponse")
    public ArrayOfGlobalProfileVersion getProfileChain(
        @WebParam(name = "OrgID", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String orgID,
        @WebParam(name = "ProfileID", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String profileID,
        @WebParam(name = "IncludeTest", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        Boolean includeTest,
        @WebParam(name = "IncludePreEffective", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        Boolean includePreEffective,
        @WebParam(name = "IncludeEffective", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        Boolean includeEffective,
        @WebParam(name = "IncludeRetired", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        Boolean includeRetired)
        throws IGlobalProfileGetProfileChainID3GExceptionFaultFaultMessage
    ;

    /**
     * 
     * @param itemIDs
     * @param name
     * @param description
     * @param orgID
     * @return
     *     returns com.starlix.service.id3.GlobalProfileDetails
     * @throws IGlobalProfileCreateProfileID3GExceptionFaultFaultMessage
     */
    @WebMethod(operationName = "CreateProfile", action = "http://www.id3global.com/ID3gWS/2013/04/IGlobalProfile/CreateProfile")
    @WebResult(name = "CreateProfileResult", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
    @RequestWrapper(localName = "CreateProfile", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.CreateProfile")
    @ResponseWrapper(localName = "CreateProfileResponse", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.CreateProfileResponse")
    public GlobalProfileDetails createProfile(
        @WebParam(name = "OrgID", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String orgID,
        @WebParam(name = "Name", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String name,
        @WebParam(name = "Description", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String description,
        @WebParam(name = "ItemIDs", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        ArrayOfunsignedInt itemIDs)
        throws IGlobalProfileCreateProfileID3GExceptionFaultFaultMessage
    ;

    /**
     * 
     * @param itemIDs
     * @param name
     * @param description
     * @param scoringMethod
     * @param orgID
     * @return
     *     returns com.starlix.service.id3.GlobalProfileDetails
     * @throws IGlobalProfileCreateProfileWithScoringMethodID3GExceptionFaultFaultMessage
     */
    @WebMethod(operationName = "CreateProfileWithScoringMethod", action = "http://www.id3global.com/ID3gWS/2013/04/IGlobalProfile/CreateProfileWithScoringMethod")
    @WebResult(name = "CreateProfileWithScoringMethodResult", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
    @RequestWrapper(localName = "CreateProfileWithScoringMethod", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.CreateProfileWithScoringMethod")
    @ResponseWrapper(localName = "CreateProfileWithScoringMethodResponse", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.CreateProfileWithScoringMethodResponse")
    public GlobalProfileDetails createProfileWithScoringMethod(
        @WebParam(name = "OrgID", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String orgID,
        @WebParam(name = "Name", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String name,
        @WebParam(name = "Description", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String description,
        @WebParam(name = "ItemIDs", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        ArrayOfunsignedInt itemIDs,
        @WebParam(name = "ScoringMethod", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        GlobalScoringMethod scoringMethod)
        throws IGlobalProfileCreateProfileWithScoringMethodID3GExceptionFaultFaultMessage
    ;

    /**
     * 
     * @param name
     * @param description
     * @param profileIDVersion
     * @param orgID
     * @return
     *     returns com.starlix.service.id3.GlobalProfileDetails
     * @throws IGlobalProfileCopyProfileID3GExceptionFaultFaultMessage
     */
    @WebMethod(operationName = "CopyProfile", action = "http://www.id3global.com/ID3gWS/2013/04/IGlobalProfile/CopyProfile")
    @WebResult(name = "CopyProfileResult", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
    @RequestWrapper(localName = "CopyProfile", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.CopyProfile")
    @ResponseWrapper(localName = "CopyProfileResponse", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.CopyProfileResponse")
    public GlobalProfileDetails copyProfile(
        @WebParam(name = "OrgID", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String orgID,
        @WebParam(name = "ProfileIDVersion", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        GlobalProfileIDVersion profileIDVersion,
        @WebParam(name = "Name", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String name,
        @WebParam(name = "Description", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String description)
        throws IGlobalProfileCopyProfileID3GExceptionFaultFaultMessage
    ;

    /**
     * 
     * @param profile
     * @param orgID
     * @throws IGlobalProfileUpdateProfileID3GExceptionFaultFaultMessage
     */
    @WebMethod(operationName = "UpdateProfile", action = "http://www.id3global.com/ID3gWS/2013/04/IGlobalProfile/UpdateProfile")
    @RequestWrapper(localName = "UpdateProfile", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.UpdateProfile")
    @ResponseWrapper(localName = "UpdateProfileResponse", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.UpdateProfileResponse")
    public void updateProfile(
        @WebParam(name = "OrgID", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String orgID,
        @WebParam(name = "Profile", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        GlobalProfile profile)
        throws IGlobalProfileUpdateProfileID3GExceptionFaultFaultMessage
    ;

    /**
     * 
     * @param endDate
     * @param profileIDVersion
     * @param orgID
     * @param startDate
     * @throws IGlobalProfileUpdateProfileStateID3GExceptionFaultFaultMessage
     */
    @WebMethod(operationName = "UpdateProfileState", action = "http://www.id3global.com/ID3gWS/2013/04/IGlobalProfile/UpdateProfileState")
    @RequestWrapper(localName = "UpdateProfileState", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.UpdateProfileState")
    @ResponseWrapper(localName = "UpdateProfileStateResponse", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.UpdateProfileStateResponse")
    public void updateProfileState(
        @WebParam(name = "OrgID", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String orgID,
        @WebParam(name = "ProfileIDVersion", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        GlobalProfileIDVersion profileIDVersion,
        @WebParam(name = "StartDate", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        XMLGregorianCalendar startDate,
        @WebParam(name = "EndDate", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        XMLGregorianCalendar endDate)
        throws IGlobalProfileUpdateProfileStateID3GExceptionFaultFaultMessage
    ;

    /**
     * 
     * @param profileID
     * @param version
     * @param orgID
     * @param revision
     * @return
     *     returns com.starlix.service.id3.GlobalProfileDetails
     * @throws IGlobalProfileGetProfileDetailsID3GExceptionFaultFaultMessage
     */
    @WebMethod(operationName = "GetProfileDetails", action = "http://www.id3global.com/ID3gWS/2013/04/IGlobalProfile/GetProfileDetails")
    @WebResult(name = "GetProfileDetailsResult", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
    @RequestWrapper(localName = "GetProfileDetails", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.GetProfileDetails")
    @ResponseWrapper(localName = "GetProfileDetailsResponse", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.GetProfileDetailsResponse")
    public GlobalProfileDetails getProfileDetails(
        @WebParam(name = "OrgID", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String orgID,
        @WebParam(name = "ProfileID", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String profileID,
        @WebParam(name = "Version", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        Long version,
        @WebParam(name = "Revision", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        Long revision)
        throws IGlobalProfileGetProfileDetailsID3GExceptionFaultFaultMessage
    ;

    /**
     * 
     * @param profileID
     * @param version
     * @param orgID
     * @return
     *     returns com.starlix.service.id3.GlobalProfileDetails
     * @throws IGlobalProfileGetProfileDetailsWithLatestRevisionID3GExceptionFaultFaultMessage
     */
    @WebMethod(operationName = "GetProfileDetailsWithLatestRevision", action = "http://www.id3global.com/ID3gWS/2013/04/IGlobalProfile/GetProfileDetailsWithLatestRevision")
    @WebResult(name = "GetProfileDetailsWithLatestRevisionResult", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
    @RequestWrapper(localName = "GetProfileDetailsWithLatestRevision", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.GetProfileDetailsWithLatestRevision")
    @ResponseWrapper(localName = "GetProfileDetailsWithLatestRevisionResponse", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.GetProfileDetailsWithLatestRevisionResponse")
    public GlobalProfileDetails getProfileDetailsWithLatestRevision(
        @WebParam(name = "OrgID", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String orgID,
        @WebParam(name = "ProfileID", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String profileID,
        @WebParam(name = "Version", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        Long version)
        throws IGlobalProfileGetProfileDetailsWithLatestRevisionID3GExceptionFaultFaultMessage
    ;

    /**
     * 
     * @param profileFull
     * @param orgID
     * @param newVersion
     * @throws IGlobalProfileUpdateProfileDetailsID3GExceptionFaultFaultMessage
     */
    @WebMethod(operationName = "UpdateProfileDetails", action = "http://www.id3global.com/ID3gWS/2013/04/IGlobalProfile/UpdateProfileDetails")
    @RequestWrapper(localName = "UpdateProfileDetails", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.UpdateProfileDetails")
    @ResponseWrapper(localName = "UpdateProfileDetailsResponse", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.UpdateProfileDetailsResponse")
    public void updateProfileDetails(
        @WebParam(name = "OrgID", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String orgID,
        @WebParam(name = "ProfileFull", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        GlobalProfileDetails profileFull,
        @WebParam(name = "NewVersion", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        Boolean newVersion)
        throws IGlobalProfileUpdateProfileDetailsID3GExceptionFaultFaultMessage
    ;

    /**
     * 
     * @param orgID
     * @return
     *     returns com.starlix.service.id3.GlobalLicence
     * @throws IGlobalProfileGetLicenceID3GExceptionFaultFaultMessage
     */
    @WebMethod(operationName = "GetLicence", action = "http://www.id3global.com/ID3gWS/2013/04/IGlobalProfile/GetLicence")
    @WebResult(name = "GetLicenceResult", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
    @RequestWrapper(localName = "GetLicence", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.GetLicence")
    @ResponseWrapper(localName = "GetLicenceResponse", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.GetLicenceResponse")
    public GlobalLicence getLicence(
        @WebParam(name = "OrgID", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String orgID)
        throws IGlobalProfileGetLicenceID3GExceptionFaultFaultMessage
    ;

    /**
     * 
     * @param licence
     * @param orgID
     * @throws IGlobalProfileUpdateLicenceID3GExceptionFaultFaultMessage
     */
    @WebMethod(operationName = "UpdateLicence", action = "http://www.id3global.com/ID3gWS/2013/04/IGlobalProfile/UpdateLicence")
    @RequestWrapper(localName = "UpdateLicence", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.UpdateLicence")
    @ResponseWrapper(localName = "UpdateLicenceResponse", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.UpdateLicenceResponse")
    public void updateLicence(
        @WebParam(name = "OrgID", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String orgID,
        @WebParam(name = "Licence", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        GlobalLicence licence)
        throws IGlobalProfileUpdateLicenceID3GExceptionFaultFaultMessage
    ;

    /**
     * 
     * @param itemCheckID
     * @param orgID
     * @return
     *     returns com.starlix.service.id3.ArrayOfGlobalProperty
     * @throws IGlobalProfileGetItemCheckPropertiesID3GExceptionFaultFaultMessage
     */
    @WebMethod(operationName = "GetItemCheckProperties", action = "http://www.id3global.com/ID3gWS/2013/04/IGlobalProfile/GetItemCheckProperties")
    @WebResult(name = "GetItemCheckPropertiesResult", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
    @RequestWrapper(localName = "GetItemCheckProperties", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.GetItemCheckProperties")
    @ResponseWrapper(localName = "GetItemCheckPropertiesResponse", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.GetItemCheckPropertiesResponse")
    public ArrayOfGlobalProperty getItemCheckProperties(
        @WebParam(name = "OrgID", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String orgID,
        @WebParam(name = "ItemCheckID", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        Long itemCheckID)
        throws IGlobalProfileGetItemCheckPropertiesID3GExceptionFaultFaultMessage
    ;

    /**
     * 
     * @return
     *     returns com.starlix.service.id3.ArrayOfGlobalItemCheckConfig
     * @throws IGlobalProfileGetItemChecksID3GExceptionFaultFaultMessage
     */
    @WebMethod(operationName = "GetItemChecks", action = "http://www.id3global.com/ID3gWS/2013/04/IGlobalProfile/GetItemChecks")
    @WebResult(name = "GetItemChecksResult", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
    @RequestWrapper(localName = "GetItemChecks", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.GetItemChecks")
    @ResponseWrapper(localName = "GetItemChecksResponse", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.GetItemChecksResponse")
    public ArrayOfGlobalItemCheckConfig getItemChecks()
        throws IGlobalProfileGetItemChecksID3GExceptionFaultFaultMessage
    ;

    /**
     * 
     * @param itemCheckIDs
     * @return
     *     returns com.starlix.service.id3.ArrayOfGlobalItemCheckConfig
     * @throws IGlobalProfileGetInputFieldByItemCheckIdID3GExceptionFaultFaultMessage
     */
    @WebMethod(operationName = "GetInputFieldByItemCheckId", action = "http://www.id3global.com/ID3gWS/2013/04/IGlobalProfile/GetInputFieldByItemCheckId")
    @WebResult(name = "GetInputFieldByItemCheckIdResult", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
    @RequestWrapper(localName = "GetInputFieldByItemCheckId", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.GetInputFieldByItemCheckId")
    @ResponseWrapper(localName = "GetInputFieldByItemCheckIdResponse", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.GetInputFieldByItemCheckIdResponse")
    public ArrayOfGlobalItemCheckConfig getInputFieldByItemCheckId(
        @WebParam(name = "ItemCheckIDs", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        ArrayOfunsignedInt itemCheckIDs)
        throws IGlobalProfileGetInputFieldByItemCheckIdID3GExceptionFaultFaultMessage
    ;

    /**
     * 
     * @param licence
     * @param orgID
     * @return
     *     returns com.starlix.service.id3.ArrayOfGlobalProfileDetails
     * @throws IGlobalProfileGetRetiringProfilesID3GExceptionFaultFaultMessage
     */
    @WebMethod(operationName = "GetRetiringProfiles", action = "http://www.id3global.com/ID3gWS/2013/04/IGlobalProfile/GetRetiringProfiles")
    @WebResult(name = "GetRetiringProfilesResult", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
    @RequestWrapper(localName = "GetRetiringProfiles", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.GetRetiringProfiles")
    @ResponseWrapper(localName = "GetRetiringProfilesResponse", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.GetRetiringProfilesResponse")
    public ArrayOfGlobalProfileDetails getRetiringProfiles(
        @WebParam(name = "OrgID", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String orgID,
        @WebParam(name = "Licence", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        GlobalLicence licence)
        throws IGlobalProfileGetRetiringProfilesID3GExceptionFaultFaultMessage
    ;

    /**
     * 
     * @param supplierAccountID
     * @param orgID
     * @throws IGlobalProfileUpdateLicenceItemToPendingID3GExceptionFaultFaultMessage
     */
    @WebMethod(operationName = "UpdateLicenceItemToPending", action = "http://www.id3global.com/ID3gWS/2013/04/IGlobalProfile/UpdateLicenceItemToPending")
    @RequestWrapper(localName = "UpdateLicenceItemToPending", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.UpdateLicenceItemToPending")
    @ResponseWrapper(localName = "UpdateLicenceItemToPendingResponse", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.UpdateLicenceItemToPendingResponse")
    public void updateLicenceItemToPending(
        @WebParam(name = "OrgID", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String orgID,
        @WebParam(name = "SupplierAccountID", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String supplierAccountID)
        throws IGlobalProfileUpdateLicenceItemToPendingID3GExceptionFaultFaultMessage
    ;

}
