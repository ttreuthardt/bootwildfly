package springbootopenshiftsample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HelloController {

    @RequestMapping("hello")
    public String sayHello(){

        String hostName = "N/A";
        try {
            hostName = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        return ("Hello, SpringBoot on Wildfly 10.1 from " + hostName);
    }

}
