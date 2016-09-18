/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.dtu.dk;

import java.util.ArrayList;
import javax.jws.WebService;
import org.netbeans.j2ee.wsdl.whitepages.java.whitepageswsdl.Person;

/**
 *
 * @author mogens
 */
@WebService(serviceName = "whitepagesWSDLService", portName = "whitepagesWSDLPortTypeBindingPort", endpointInterface = "org.netbeans.j2ee.wsdl.whitepages.java.whitepageswsdl.WhitepagesWSDLPortType", targetNamespace = "http://j2ee.netbeans.org/wsdl/WhitePages/java/whitepagesWSDL", wsdlLocation = "WEB-INF/wsdl/WhitePagesWebServiceFromWSDL/whitepagesWSDL.wsdl")
public class WhitePagesWebServiceFromWSDL {

    ArrayList<Person> phoneBook;

    public WhitePagesWebServiceFromWSDL() {
         phoneBook = new ArrayList<Person>();
    }    
    
    public java.lang.String addPerson(org.netbeans.j2ee.wsdl.whitepages.java.whitepageswsdl.Person person) {
        phoneBook.add(person);
        return "done";
    }
    
}
