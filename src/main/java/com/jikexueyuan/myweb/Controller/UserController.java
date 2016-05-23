package main.java.com.jikexueyuan.myweb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Jimy on 2016/5/21.
 */
@Controller
public class UserController {

    @RequestMapping("")
    public String getUser() {
        return "";
    }
}
