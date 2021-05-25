package Multi.frame.work.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testapis/")
public class TestController {
    @GetMapping("authtest")
    public String authTest(){
        return "u r seening this bech auth was sucess";
    }
}
