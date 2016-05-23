package main.java.com.jikexueyuan.myweb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Jimy on 2016/5/16.
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/userInfo")
    public String getUser(ModelMap map) {

        return "user";
    }
}
