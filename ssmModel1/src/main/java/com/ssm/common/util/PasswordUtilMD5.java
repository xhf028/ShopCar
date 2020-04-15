package com.ssm.common.util;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;



/**
* @author 向鸿飞 
* @version 创建时间：2020年4月15日 下午12:00:25
* 类说明
*/
public class PasswordUtilMD5  {

	
	public static String addLockForPassword(String str) {
		// TODO Auto-generated method stub
		StringBuffer hexString = new StringBuffer();
		
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(str.getBytes());
			byte[] hash = md.digest();
			for (int i = 0; i < hash.length; i++) {
				if ((0xff & hash[i]) < 0x10) {
					hexString.append("0" + Integer.toHexString((0xFF & hash[i])));
				} else {
					hexString.append(Integer.toHexString(0xFF & hash[i]));
				}
			}
			
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return hexString.toString();
	}

}
