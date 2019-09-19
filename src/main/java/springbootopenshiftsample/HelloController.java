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

        return ("Hello Docker Academy Sept 2019. You hit the pod -> " + hostName);
    }

}
