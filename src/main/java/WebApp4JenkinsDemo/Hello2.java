package WebApp4JenkinsDemo;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello2 {

    @RequestMapping("/hello2")
    public String sayHello2(){
    	//修改返回的字符串的内容
        return "Hello2:" + new Date();
    }
}