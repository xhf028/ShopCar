package com.ssm.common.util.interfaces;



/**
* @author 向鸿飞 
* @version 创建时间：2020年4月15日 下午12:01:56
* 类说明
*/
/*
 * 日志文件
 */
public interface Log{
	
	
	public void debug(String message);
	/*
	 * info������־
	 */
	public void info(String message);
	/*
	 *warn������־
	 */
	public void warn(String message);
	/*
	 * error������־
	 */
	public void error(String message);
	/*
	 * fatal������־
	 */
	public void fatal(String message);

}
