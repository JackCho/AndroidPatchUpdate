package com.dodola.patcher.utils;

import java.io.File;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/**
 *应用程序的工具类
 * @author Administrator
 *
 */
public class AppUtils {

	/**
	 * 安装一个应用程序
	 * @param context
	 * @param apkfile
	 */
	public static void installApplication(Context context,File apkfile){
	  /*   <action android:name="android.intent.action.VIEW" />
         <category android:name="android.intent.category.DEFAULT" />
         <data android:scheme="content" />
         <data android:scheme="file" />
         <data android:mimeType="application/vnd.android.package-archive" />*/
		Intent intent = new Intent();
		intent.setAction("android.intent.action.VIEW");
		intent.addCategory("android.intent.category.DEFAULT");
//		intent.setType("application/vnd.android.package-archive");
//		intent.setData(Uri.fromFile(apkfile));
		intent.setDataAndType(Uri.fromFile(apkfile), "application/vnd.android.package-archive");
		context.startActivity(intent);
	}
	
	/**
	 * 调用.so库中的方法,合并apk
	 * 
	 * @param old
	 *            旧Apk地址
	 * @param newapk
	 *            新apk地址(名字)
	 * @param patch
	 *            增量包地址
	 */
	public static native void patcher(String old, String newapk, String patch);
}
