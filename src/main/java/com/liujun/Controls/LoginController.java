package com.liujun.Controls;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author
 */
@Controller
public class LoginController {
    @PostMapping("/login")
    public String login( HttpServletRequest request, HttpServletResponse response){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if("admin".equals(username) && "123456".equals(password)){
            // 创建cookie并将成功登陆的用户保存在里面
            //一个浏览器只有一个用户
            Cookie cookie1 = new Cookie("username" , username);
            Cookie cookie2 = new Cookie("password",password);

            //有效时长为24h
            cookie1.setMaxAge(24*60*60);
            cookie2.setMaxAge(24*60*60);

            response.addCookie(cookie1);
            response.addCookie(cookie2); // 服务器返回给浏览器cookie以便下次判断

            //创建session
            HttpSession session=request.getSession();
            session.setAttribute("username",session.getId());
            return "redirect:/stuManager/all";
        }else{
            return "login";
        }
    }
    @GetMapping("/logout")
    public String logout(HttpServletRequest request){
        //销毁session
        request.getSession().invalidate();
        return "login";
    }
    @GetMapping("/loginPage")
    public String logPage(){
        return "login";
    }
    @GetMapping("/listener")
    public String listener(HttpServletRequest request){
        return "listener";
    }
}
