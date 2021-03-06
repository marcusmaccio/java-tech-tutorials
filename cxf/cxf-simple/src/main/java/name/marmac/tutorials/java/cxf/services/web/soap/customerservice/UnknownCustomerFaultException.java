
package name.marmac.tutorials.java.cxf.services.web.soap.customerservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.6
 * 2013-11-27T14:53:49.596+01:00
 * Generated source version: 2.7.6
 */

@WebFault(name = "UnknownCustomerFaultElement", targetNamespace = "http://marmac.name/tutorials/java/cxf/services/web/soap/customerservice/model/to/")
public class UnknownCustomerFaultException extends Exception {

    private name.marmac.tutorials.java.cxf.services.web.soap.personservice.model.to.UnknownPersonFaultType unknownCustomerFaultElement;

    public UnknownCustomerFaultException() {
        super();
    }

    public UnknownCustomerFaultException(String message) {
        super(message);
    }

    public UnknownCustomerFaultException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnknownCustomerFaultException(String message, name.marmac.tutorials.java.cxf.services.web.soap.personservice.model.to.UnknownPersonFaultType unknownPersonFaultElement) {
        super(message);
        this.unknownCustomerFaultElement = unknownPersonFaultElement;
    }

    public UnknownCustomerFaultException(String message, name.marmac.tutorials.java.cxf.services.web.soap.personservice.model.to.UnknownPersonFaultType unknownPersonFaultElement, Throwable cause) {
        super(message, cause);
        this.unknownCustomerFaultElement = unknownPersonFaultElement;
    }

    public name.marmac.tutorials.java.cxf.services.web.soap.personservice.model.to.UnknownPersonFaultType getFaultInfo() {
        return this.unknownCustomerFaultElement;
    }
}
