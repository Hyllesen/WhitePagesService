/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.dtu.dk;

import javax.jws.WebService;
import org.netbeans.j2ee.wsdl.whitepages.java.whitepageswsdl.Fault;

/**
 *
 * @author mogens
 */
@WebService(serviceName = "whitepagesWSDLService", portName = "whitepagesWSDLPortTypeBindingPort", endpointInterface = "org.netbeans.j2ee.wsdl.whitepages.java.whitepageswsdl.WhitepagesWSDLPortType", targetNamespace = "http://j2ee.netbeans.org/wsdl/WhitePages/java/whitepagesWSDL", wsdlLocation = "WEB-INF/wsdl/WhitePagesServiceFromWSDL/whitepagesWSDL.wsdl")
public class WhitePagesServiceFromWSDL {

    public java.lang.String addPerson(org.netbeans.j2ee.wsdl.whitepages.java.whitepageswsdl.Person person) throws Fault {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public org.netbeans.j2ee.wsdl.whitepages.java.whitepageswsdl.Personarray findPerson(org.netbeans.j2ee.wsdl.whitepages.java.whitepageswsdl.Person person) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
