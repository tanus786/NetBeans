
package com.Tanu;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class MyFilter implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Before Filter");
        //...
        //..
         HttpServletRequest req = (HttpServletRequest)request;
         HttpSession =req.getSession();
        chain.doFilts er(request, response);
        System.out.println("After Filter");
        //..
        //..
        
    }

    @Override
    public void destroy() {
        
    }
    
}
