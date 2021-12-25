package com.liujun.listener;
import javax.servlet.ServletContext;
import javax.servlet.http.*;

/**
 * @author liujun
 */
public class MySessionListener implements HttpSessionListener {
    private static int userCount = 0;
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        userCount++;
        ServletContext context = httpSessionEvent.getSession().getServletContext();
        context.setAttribute("count",userCount);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        userCount--;
        ServletContext context = httpSessionEvent.getSession().getServletContext();
        context.setAttribute("count",userCount);
    }
}