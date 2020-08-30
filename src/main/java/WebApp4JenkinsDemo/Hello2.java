package WebApp4JenkinsDemo;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello2 {

    @RequestMapping("/hello2")
    public String sayHello2(){
    	//修改返回的字符串的内容x
        return "Hello22:" + new Date();
    }
}