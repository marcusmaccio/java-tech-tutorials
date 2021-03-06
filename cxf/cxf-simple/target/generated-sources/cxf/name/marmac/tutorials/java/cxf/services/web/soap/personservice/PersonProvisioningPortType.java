package name.marmac.tutorials.java.cxf.services.web.soap.personservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.6
 * 2014-08-18T12:37:05.672+02:00
 * Generated source version: 2.7.6
 * 
 */
@WebService(targetNamespace = "http://marmac.name/tutorials/java/cxf/services/web/soap/personservice/", name = "PersonProvisioningPortType")
@XmlSeeAlso({name.marmac.tutorials.java.cxf.services.web.soap.personservice.model.to.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface PersonProvisioningPortType {

    @WebResult(name = "GetPersonResponseElement", targetNamespace = "http://marmac.name/tutorials/java/cxf/services/web/soap/personservice/model/to/", partName = "personTO")
    @WebMethod(action = "http://marmac.name/tutorials/java/cxf/web/services/soap/personprovisioningservice/getPerson")
    public name.marmac.tutorials.java.cxf.services.web.soap.personservice.model.to.PersonTO getPerson(
        @WebParam(partName = "searchparams", name = "GetPersonRequestElement", targetNamespace = "http://marmac.name/tutorials/java/cxf/services/web/soap/personservice/model/to/")
        name.marmac.tutorials.java.cxf.services.web.soap.personservice.model.to.SearchParamsType searchparams
    ) throws UnknownPersonFaultException;
}
