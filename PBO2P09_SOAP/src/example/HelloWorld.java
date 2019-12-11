package example;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * Steven Rumanto
 * 1772026
 */
@WebService()
public class HelloWorld {
    @WebMethod
    public String sayHelloWorldFrom(String from) {
        String result = "Hello, world, from " + from;
        System.out.println(result);
        return result;
    }

    @WebMethod
    public String sayYourProfile(String name) {
        String result = "Nama Saya: " + name ;
        System.out.println(result);
        return result;
    }

    @WebMethod
    public String sum(String a,String b) {
        int x= Integer.parseInt(a);
        int y= Integer.parseInt(b);
        int total=x+y;
        return String.valueOf(total);
    }

}
