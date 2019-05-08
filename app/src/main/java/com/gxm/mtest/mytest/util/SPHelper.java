package com.gxm.mtest.mytest.util;

import android.content.Context;
import android.content.SharedPreferences;


public class SPHelper {
	static String mAppName= Constants.APP_NAME;
	public static boolean getBoolean(Context context,String key,boolean defaultValue)
	{
		SharedPreferences sp=context.getSharedPreferences(mAppName,0);
		return sp.getBoolean(key, defaultValue);
	}
	
	public static Float getFloat(Context context,String key,float defaultValue)
	{
		SharedPreferences sp=context.getSharedPreferences(mAppName,0);
		return sp.getFloat(key, defaultValue);
	}
	
	public static int getInt(Context context,String key,int defaultValue)
	{
		SharedPreferences sp=context.getSharedPreferences(mAppName,0);
		return sp.getInt(key, defaultValue);
	}
	
	public static long getLong(Context context,String key,long defaultValue)
	{
		SharedPreferences sp=context.getSharedPreferences(mAppName,0);
		return sp.getLong(key, defaultValue);
	}
	
	public static String getString(Context context,String key,String defaultValue)
	{
		SharedPreferences sp=context.getSharedPreferences(mAppName,0);
		return sp.getString(key, defaultValue);
	}
	
	public static void putBoolean(Context context,String key,boolean value)
	{
		SharedPreferences sp=context.getSharedPreferences(mAppName,0);
		SharedPreferences.Editor editor=sp.edit();
		editor.putBoolean(key, value);
		editor.commit();
	}
	
	public static void putFloat(Context context,String key,float value)
	{
		SharedPreferences sp=context.getSharedPreferences(mAppName,0);
		SharedPreferences.Editor editor=sp.edit();
		editor.putFloat(key, value);
		editor.commit();
	}
	
	public static void putInt(Context context,String key,int value)
	{
		SharedPreferences sp=context.getSharedPreferences(mAppName,0);
		SharedPreferences.Editor editor=sp.edit();
		editor.putInt(key, value);
		editor.commit();
	}
	
	public static void putLong(Context context,String key,long value)
	{
		SharedPreferences sp=context.getSharedPreferences(mAppName,0);
		SharedPreferences.Editor editor=sp.edit();
		editor.putLong(key, value);
		editor.commit();
	}
	
	public static void putString(Context context,String key,String value)
	{
		SharedPreferences sp=context.getSharedPreferences(mAppName,0);
		SharedPreferences.Editor editor=sp.edit();
		editor.putString(key, value);
		editor.commit();
	}


}
