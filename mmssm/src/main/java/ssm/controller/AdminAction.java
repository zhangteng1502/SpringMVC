package ssm.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ssm.pojo.Admin;
import ssm.service.AdminService;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/admin")
public class AdminAction {
    //切记:在所有的界面层,一定会有业务逻辑层的对象
    @Autowired
    AdminService adminService;

    Logger logger = Logger.getLogger(Logger.class);

    //实现登判断,并进行相应的跳转
    @RequestMapping("/login")
    public String login(String name , String pwd, HttpServletRequest request){

        Admin admin = adminService.login (name,pwd,request);
        System.out.println(admin);
        if(admin != null){
            request.setAttribute("admin",admin);
            System.out.println("登录成功");
            logger.info("nihao");
            //登录成功
            return "main";
        }else{
            //登录失败
            request.setAttribute("errmsg","用户名或密码不正确!");
            System.out.println("登录失败");
            return "login";
        }

    }

}
