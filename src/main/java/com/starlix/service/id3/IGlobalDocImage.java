
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
@WebService(name = "IGlobalDocImage", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IGlobalDocImage {


    /**
     * 
     * @param docImage
     * @return
     *     returns com.starlix.service.id3.GlobalDIVData
     * @throws IGlobalDocImageUploadID3GExceptionFaultFaultMessage
     */
    @WebMethod(operationName = "Upload", action = "http://www.id3global.com/ID3gWS/2013/04/IGlobalDocImage/Upload")
    @WebResult(name = "UploadResult", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
    @RequestWrapper(localName = "Upload", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.Upload")
    @ResponseWrapper(localName = "UploadResponse", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.UploadResponse")
    public GlobalDIVData upload(
        @WebParam(name = "DocImage", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        byte[] docImage)
        throws IGlobalDocImageUploadID3GExceptionFaultFaultMessage
    ;

    /**
     * 
     * @param docImage
     * @return
     *     returns com.starlix.service.id3.GlobalDIVData
     * @throws IGlobalDocImageUploadAndProcessID3GExceptionFaultFaultMessage
     */
    @WebMethod(operationName = "UploadAndProcess", action = "http://www.id3global.com/ID3gWS/2013/04/IGlobalDocImage/UploadAndProcess")
    @WebResult(name = "UploadAndProcessResult", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
    @RequestWrapper(localName = "UploadAndProcess", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.UploadAndProcess")
    @ResponseWrapper(localName = "UploadAndProcessResponse", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.UploadAndProcessResponse")
    public GlobalDIVData uploadAndProcess(
        @WebParam(name = "DocImage", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        byte[] docImage)
        throws IGlobalDocImageUploadAndProcessID3GExceptionFaultFaultMessage
    ;

    /**
     * 
     * @param docImage
     * @param profileID
     * @param version
     * @param revision
     * @return
     *     returns com.starlix.service.id3.GlobalDIVData
     * @throws IGlobalDocImageUploadAndProcessByProfilePropertiesID3GExceptionFaultFaultMessage
     */
    @WebMethod(operationName = "UploadAndProcessByProfileProperties", action = "http://www.id3global.com/ID3gWS/2013/04/IGlobalDocImage/UploadAndProcessByProfileProperties")
    @WebResult(name = "UploadAndProcessByProfilePropertiesResult", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
    @RequestWrapper(localName = "UploadAndProcessByProfileProperties", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.UploadAndProcessByProfileProperties")
    @ResponseWrapper(localName = "UploadAndProcessByProfilePropertiesResponse", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.UploadAndProcessByProfilePropertiesResponse")
    public GlobalDIVData uploadAndProcessByProfileProperties(
        @WebParam(name = "ProfileID", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String profileID,
        @WebParam(name = "Version", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        Long version,
        @WebParam(name = "Revision", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        Long revision,
        @WebParam(name = "DocImage", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        byte[] docImage)
        throws IGlobalDocImageUploadAndProcessByProfilePropertiesID3GExceptionFaultFaultMessage
    ;

    /**
     * 
     * @param imageID
     * @param synchronous
     * @param orgID
     * @return
     *     returns com.starlix.service.id3.GlobalDIVData
     * @throws IGlobalDocImageProcessStoredImageID3GExceptionFaultFaultMessage
     */
    @WebMethod(operationName = "ProcessStoredImage", action = "http://www.id3global.com/ID3gWS/2013/04/IGlobalDocImage/ProcessStoredImage")
    @WebResult(name = "ProcessStoredImageResult", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
    @RequestWrapper(localName = "ProcessStoredImage", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.ProcessStoredImage")
    @ResponseWrapper(localName = "ProcessStoredImageResponse", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.ProcessStoredImageResponse")
    public GlobalDIVData processStoredImage(
        @WebParam(name = "OrgID", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String orgID,
        @WebParam(name = "ImageID", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String imageID,
        @WebParam(name = "Synchronous", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        Boolean synchronous)
        throws IGlobalDocImageProcessStoredImageID3GExceptionFaultFaultMessage
    ;

    /**
     * 
     * @param authenticationID
     * @param orgID
     * @return
     *     returns com.starlix.service.id3.GlobalDIVData
     * @throws IGlobalDocImageGetImageResultsID3GExceptionFaultFaultMessage
     */
    @WebMethod(operationName = "GetImageResults", action = "http://www.id3global.com/ID3gWS/2013/04/IGlobalDocImage/GetImageResults")
    @WebResult(name = "GetImageResultsResult", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
    @RequestWrapper(localName = "GetImageResults", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.GetImageResults")
    @ResponseWrapper(localName = "GetImageResultsResponse", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.GetImageResultsResponse")
    public GlobalDIVData getImageResults(
        @WebParam(name = "OrgID", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String orgID,
        @WebParam(name = "AuthenticationID", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String authenticationID)
        throws IGlobalDocImageGetImageResultsID3GExceptionFaultFaultMessage
    ;

    /**
     * 
     * @param authenticationID
     * @param orgID
     * @return
     *     returns byte[]
     * @throws IGlobalDocImageDownloadID3GExceptionFaultFaultMessage
     */
    @WebMethod(operationName = "Download", action = "http://www.id3global.com/ID3gWS/2013/04/IGlobalDocImage/Download")
    @WebResult(name = "DownloadResult", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
    @RequestWrapper(localName = "Download", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.Download")
    @ResponseWrapper(localName = "DownloadResponse", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.DownloadResponse")
    public byte[] download(
        @WebParam(name = "OrgID", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String orgID,
        @WebParam(name = "AuthenticationID", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String authenticationID)
        throws IGlobalDocImageDownloadID3GExceptionFaultFaultMessage
    ;

    /**
     * 
     * @param docImage
     * @return
     *     returns java.lang.String
     * @throws IGlobalDocImageStoreDocumentImageID3GExceptionFaultFaultMessage
     */
    @WebMethod(operationName = "StoreDocumentImage", action = "http://www.id3global.com/ID3gWS/2013/04/IGlobalDocImage/StoreDocumentImage")
    @WebResult(name = "StoreDocumentImageResult", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
    @RequestWrapper(localName = "StoreDocumentImage", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.StoreDocumentImage")
    @ResponseWrapper(localName = "StoreDocumentImageResponse", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.StoreDocumentImageResponse")
    public String storeDocumentImage(
        @WebParam(name = "DocImage", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        byte[] docImage)
        throws IGlobalDocImageStoreDocumentImageID3GExceptionFaultFaultMessage
    ;

    /**
     * 
     * @param imageID
     * @param orgID
     * @return
     *     returns byte[]
     * @throws IGlobalDocImageDownloadStoredImageID3GExceptionFaultFaultMessage
     */
    @WebMethod(operationName = "DownloadStoredImage", action = "http://www.id3global.com/ID3gWS/2013/04/IGlobalDocImage/DownloadStoredImage")
    @WebResult(name = "DownloadStoredImageResult", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
    @RequestWrapper(localName = "DownloadStoredImage", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.DownloadStoredImage")
    @ResponseWrapper(localName = "DownloadStoredImageResponse", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.DownloadStoredImageResponse")
    public byte[] downloadStoredImage(
        @WebParam(name = "OrgID", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String orgID,
        @WebParam(name = "ImageID", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String imageID)
        throws IGlobalDocImageDownloadStoredImageID3GExceptionFaultFaultMessage
    ;

    /**
     * 
     * @param descendingOrder
     * @param endDate
     * @param sortType
     * @param searchType
     * @param pageSize
     * @param page
     * @param searchValue
     * @param orgID
     * @param startDate
     * @return
     *     returns com.starlix.service.id3.GlobalImages
     * @throws IGlobalDocImageGetImagesID3GExceptionFaultFaultMessage
     */
    @WebMethod(operationName = "GetImages", action = "http://www.id3global.com/ID3gWS/2013/04/IGlobalDocImage/GetImages")
    @WebResult(name = "GetImagesResult", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
    @RequestWrapper(localName = "GetImages", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.GetImages")
    @ResponseWrapper(localName = "GetImagesResponse", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.GetImagesResponse")
    public GlobalImages getImages(
        @WebParam(name = "OrgID", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String orgID,
        @WebParam(name = "StartDate", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        XMLGregorianCalendar startDate,
        @WebParam(name = "EndDate", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        XMLGregorianCalendar endDate,
        @WebParam(name = "Page", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        Long page,
        @WebParam(name = "PageSize", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        Long pageSize,
        @WebParam(name = "SortType", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        Long sortType,
        @WebParam(name = "DescendingOrder", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        Boolean descendingOrder,
        @WebParam(name = "SearchType", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String searchType,
        @WebParam(name = "SearchValue", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String searchValue)
        throws IGlobalDocImageGetImagesID3GExceptionFaultFaultMessage
    ;

    /**
     * 
     * @param imgID
     * @param orgID
     * @return
     *     returns com.starlix.service.id3.GlobalImageDetails
     * @throws IGlobalDocImageGetImageDetailsID3GExceptionFaultFaultMessage
     */
    @WebMethod(operationName = "GetImageDetails", action = "http://www.id3global.com/ID3gWS/2013/04/IGlobalDocImage/GetImageDetails")
    @WebResult(name = "GetImageDetailsResult", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
    @RequestWrapper(localName = "GetImageDetails", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.GetImageDetails")
    @ResponseWrapper(localName = "GetImageDetailsResponse", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.GetImageDetailsResponse")
    public GlobalImageDetails getImageDetails(
        @WebParam(name = "OrgID", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String orgID,
        @WebParam(name = "ImgID", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String imgID)
        throws IGlobalDocImageGetImageDetailsID3GExceptionFaultFaultMessage
    ;

    /**
     * 
     * @param endDate
     * @param searchType
     * @param format
     * @param searchValue
     * @param orgID
     * @param startDate
     * @return
     *     returns byte[]
     * @throws IGlobalDocImageGetDocumentExtractID3GExceptionFaultFaultMessage
     */
    @WebMethod(operationName = "GetDocumentExtract", action = "http://www.id3global.com/ID3gWS/2013/04/IGlobalDocImage/GetDocumentExtract")
    @WebResult(name = "GetDocumentExtractResult", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
    @RequestWrapper(localName = "GetDocumentExtract", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.GetDocumentExtract")
    @ResponseWrapper(localName = "GetDocumentExtractResponse", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04", className = "com.starlix.service.id3.GetDocumentExtractResponse")
    public byte[] getDocumentExtract(
        @WebParam(name = "OrgID", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String orgID,
        @WebParam(name = "StartDate", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        XMLGregorianCalendar startDate,
        @WebParam(name = "EndDate", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        XMLGregorianCalendar endDate,
        @WebParam(name = "SearchType", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        Long searchType,
        @WebParam(name = "SearchValue", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        String searchValue,
        @WebParam(name = "Format", targetNamespace = "http://www.id3global.com/ID3gWS/2013/04")
        Long format)
        throws IGlobalDocImageGetDocumentExtractID3GExceptionFaultFaultMessage
    ;

}