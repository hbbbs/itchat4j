package cn.zhouyafeng.itchat4j.utils;

import java.io.File;
import java.io.IOException;

public class Config {
	public static final String picDir = "D://itchat4j";
	public static final String VERSION = "1.2.18";
	public static final String BASE_URL = "https://login.weixin.qq.com";
	public static final String OS = "";
	public static final String DIR = "";
	public static final String DEFAULT_QR = "QR.jpg";
	public static final String USER_AGENT = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.71 Safari/537.36";

	/**
	 * 获取文件目录
	 * 
	 * @author Email:zhouyaphone@163.com
	 * @date 2017年4月8日 下午10:27:42
	 * @return
	 */
	public static String getLocalPath() {
		String localPath = null;
		try {
			localPath = new File("").getCanonicalPath();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return localPath;
	}

	/**
	 * 获取工作平台
	 * 
	 * @author Email:zhouyaphone@163.com
	 * @date 2017年4月8日 下午10:27:53
	 */
	public static OsName getOsName() {
		String os = System.getProperty("os.name").toUpperCase();
		if (os.indexOf(OsName.DARWIN.toString()) >= 0) {
			return OsName.DARWIN;
		} else if (os.indexOf(OsName.WINDOWS.toString()) >= 0) {
			return OsName.WINDOWS;
		} else if (os.indexOf(OsName.LINUX.toString()) >= 0) {
			return OsName.LINUX;
		}
		return OsName.OTHER;
	}

}
