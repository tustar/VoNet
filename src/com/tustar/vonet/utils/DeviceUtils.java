package com.tustar.vonet.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class DeviceUtils {
	
	public static boolean checkNet(Context context) {
		ConnectivityManager manager = (ConnectivityManager) context
				.getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo info = manager.getActiveNetworkInfo();
		if (info != null) {
			return true;
		}
		return false;
	}
}
