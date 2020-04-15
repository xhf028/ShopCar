package com.ssm.web.filter;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.springframework.web.context.support.WebApplicationContextUtils;

import com.ssm.common.bean.Book;
import com.ssm.common.bean.Category;
import com.ssm.common.util.LogImpl;
import com.ssm.common.util.interfaces.Log;
import com.ssm.service.serviceImpl.BookServiceImpl;
import com.ssm.service.serviceImpl.CategoryServiceImpl;

/**
 * Application Lifecycle Listener implementation class ApplicationListener
 *
 */
/*
 * 监听器
 */
@WebListener
public class ApplicationListener implements ServletContextListener {
	private Log log = new LogImpl();
    /**
     * Default constructor. 
     */
    public ApplicationListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    /*
     * (non-Javadoc)
     * @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent)
     * 
     * 服务器启动时启动，初始化页面信息
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
   
    	//获取service层对象，无法采用自动注入，采用WebApplicationContextUtils
    	BookServiceImpl bookServiceImpl = WebApplicationContextUtils.getWebApplicationContext(arg0.getServletContext()).getBean(BookServiceImpl.class);
    	CategoryServiceImpl categoryServiceImpl=WebApplicationContextUtils.getWebApplicationContext(arg0.getServletContext()).getBean(CategoryServiceImpl.class);
    	
    	
    	log.info("监听器初始化运行");
    	
    	List<Book> list = bookServiceImpl.findAllBooks();
    	List<Category> list2 = categoryServiceImpl.findAllCategory();
    	ServletContext application = arg0.getServletContext();
    	log.info("页面初始化完成");
    	application.setAttribute("categorys", list2);
    	application.setAttribute("books",list);

    }
	
}
