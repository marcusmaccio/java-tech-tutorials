//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.18 at 12:36:52 PM CEST 
//


package name.marmac.tutorials.java.jaxb.jaxbsimple.example2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the name.marmac.tutorials.java.jaxb.jaxbsimple.example2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Customer_QNAME = new QName("http://marmac.name/tutorials/java/jaxb/jaxbsimple/example2/", "customer");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: name.marmac.tutorials.java.jaxb.jaxbsimple.example2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PersonInfoType }
     * 
     */
    public PersonInfoType createPersonInfoType() {
        return new PersonInfoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marmac.name/tutorials/java/jaxb/jaxbsimple/example2/", name = "customer")
    public JAXBElement<PersonInfoType> createCustomer(PersonInfoType value) {
        return new JAXBElement<PersonInfoType>(_Customer_QNAME, PersonInfoType.class, null, value);
    }

}