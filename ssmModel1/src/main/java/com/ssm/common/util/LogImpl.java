package com.ssm.common.util;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.ssm.common.util.interfaces.Log;

/**
* @author 向鸿飞 
* @version 创建时间：2020年4月15日 下午12:02:12
* 类说明
*/
public class LogImpl implements Log{
	
	private static LogImpl log; 
	private static Logger logger;
	
	public static LogImpl getInstance() {
		if(log==null) {
			log =new LogImpl();
			
		}
		return log;
	}
	static {
		logger = Logger.getRootLogger();
		PropertyConfigurator.configure("classpath:log4j.properties");
	}
	
	@Override
	public void debug(String message) {
		// TODO Auto-generated method stub
		logger.debug(message);
		
	}

	@Override
	public void info(String message) {
		// TODO Auto-generated method stub
		logger.info(message);
	}

	@Override
	public void warn(String message) {
		// TODO Auto-generated method stub
		logger.warn(message);
		
	}

	@Override
	public void error(String message) {
		// TODO Auto-generated method stub
		logger.error(message);
		
	}

	@Override
	public void fatal(String message) {
		// TODO Auto-generated method stub
		logger.fatal(message);
		
	}

}
