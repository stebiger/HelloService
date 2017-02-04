package de.brainoverload;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by stefan on 29.01.17.
 */
@WebService
public class Hello {

    @WebMethod
    public String sayHello(String name) {
        System.out.println("Webservice sayHello called...");
        return "Hello " + name;
    }
}
