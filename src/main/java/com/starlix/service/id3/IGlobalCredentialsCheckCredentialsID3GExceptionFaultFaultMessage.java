
package com.starlix.service.id3;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.1
 * Generated source version: 3.0
 * 
 */
@WebFault(name = "ID3gException", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
public class IGlobalCredentialsCheckCredentialsID3GExceptionFaultFaultMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ID3GException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public IGlobalCredentialsCheckCredentialsID3GExceptionFaultFaultMessage(String message, ID3GException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public IGlobalCredentialsCheckCredentialsID3GExceptionFaultFaultMessage(String message, ID3GException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.starlix.service.id3.ID3GException
     */
    public ID3GException getFaultInfo() {
        return faultInfo;
    }

}
