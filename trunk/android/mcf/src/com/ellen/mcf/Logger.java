/*
 * Copyright (C) 2012 The Mobile Develop Common Framework Project
 *
 * @package  com.ellen.mcf;
 * @brief    写日志的类
 * 
 * @author   ellen
 * @date     2011-12-31
 * 
 */
package com.ellen.mcf;

import android.util.Log;

public class Logger {
	private static boolean debug = true;
	private static String[] hides = new String[] { //
	// com.yuike.yuikemall.download.protocol.RemoteService.TAG
	};

	/**
	 * @brief 写一个 {@link #VERBOSE} 的日志信息	  
	 * @param tag 信息
	 * @param msg 输出的日志信息	  
	 * @note  
	 */
	public static int v(String tag, String msg) {
		if (debug) {
			for (String hide : hides) {
				if (hide.equals(tag))
					return 0;
			}
			return Log.v(tag, msg);
		}
		return 0;
	}

	/**
	 * @brief 写一个 {@link #DEBUG} 的日志信息	  
	 * @param tag 信息
	 * @param msg 输出的日志信息	  
	 * @note  
	 */
	public static int d(String tag, String msg) {
		if (debug) {
			for (String hide : hides) {
				if (hide.equals(tag))
					return 0;
			}
			return Log.d(tag, msg);
		}
		return 0;
	}

	/**
	 * @brief 写一个 {@link #INFO} 的日志信息	  
	 * @param tag 信息
	 * @param msg 输出的日志信息	  
	 * @note  
	 */
	public static int i(String tag, String msg) {
		if (debug) {
			for (String hide : hides) {
				if (hide.equals(tag))
					return 0;
			}
			return Log.i(tag, msg);
		}
		return 0;
	}

	/**
	 * @brief 写一个 {@link #WARN} 的日志信息	  
	 * @param tag 信息
	 * @param msg 输出的日志信息	  
	 * @note  
	 */
	public static int w(String tag, String msg) {
		if (debug) {
			for (String hide : hides) {
				if (hide.equals(tag))
					return 0;
			}
			return Log.w(tag, msg);
		}
		return 0;
	}

	/**
	 * @brief 写一个 {@link #ERROR} 的日志信息	  
	 * @param tag 信息
	 * @param msg 输出的日志信息	  
	 * @note  
	 */
	public static int e(String tag, String msg) {
		if (debug) {
			for (String hide : hides) {
				if (hide.equals(tag))
					return 0;
			}
			return Log.e(tag, msg);
		}
		return 0;
	}
}
