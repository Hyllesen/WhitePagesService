/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.dtu.dk;

import java.util.ArrayList;
import javax.jws.WebService;
import org.netbeans.j2ee.wsdl.whitepages.java.whitepageswsdl.Fault;
import org.netbeans.j2ee.wsdl.whitepages.java.whitepageswsdl.FaultType;
import org.netbeans.j2ee.wsdl.whitepages.java.whitepageswsdl.Person;

/**
 *
 * @author mogens
 */
@WebService(serviceName = "whitepagesWSDLService", portName = "whitepagesWSDLPortTypeBindingPort", endpointInterface = "org.netbeans.j2ee.wsdl.whitepages.java.whitepageswsdl.WhitepagesWSDLPortType", targetNamespace = "http://j2ee.netbeans.org/wsdl/WhitePages/java/whitepagesWSDL", wsdlLocation = "WEB-INF/wsdl/WhitePagesServiceFromWSDL/whitepagesWSDL.wsdl")
public class WhitePagesServiceFromWSDL {

    ArrayList<Person> phoneBook;
    public java.lang.String addPerson(org.netbeans.j2ee.wsdl.whitepages.java.whitepageswsdl.Person person) throws Fault {
        for(Person personInBook : phoneBook) {
            if(personInBook.getFirstName().equals(person.getFirstName()) && (personInBook.getLastName().equals(person.getLastName()))) {
                FaultType faultInfo = new FaultType();
                faultInfo.setPerson(person);
                Fault fault = new Fault("Person already exists", faultInfo);
                throw fault;
            }
        }
        phoneBook.add(person);
        return "done";
    }

    public WhitePagesServiceFromWSDL() {
        phoneBook = new ArrayList<Person>();
    }
    
    
}
