package ssm.service;

import ssm.pojo.Admin;

import javax.servlet.http.HttpServletRequest;

public interface AdminService {
    //完成登陆判断
    Admin login(String name, String pwd , HttpServletRequest request);
}
