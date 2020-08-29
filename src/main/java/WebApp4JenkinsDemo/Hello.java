package WebApp4JenkinsDemo;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping("/hello")
    public String sayHello(){
    	//修改返回的字符串的内容
        return "Change by github push 1:Hello jenkins, " + new Date();
    }
}