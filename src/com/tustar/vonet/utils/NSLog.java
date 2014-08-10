package com.tustar.vonet.utils;

import android.util.Log;

import com.tustar.vonet.BuildConfig;

public class NSLog {

	public static boolean DEBUG = BuildConfig.DEBUG;

	public static void v(String tag, String msg) {
		if (DEBUG) {
			try {
				Log.v(tag, msg);
			} catch (Exception e) {

			}
		}
	}

	public static void i(String tag, String msg, Throwable tr) {
		if (DEBUG) {
			try {
				Log.i(tag, msg, tr);
			} catch (Exception e) {

			}
		}
	}

	public static void i(String tag, String msg) {
		if (DEBUG) {
			try {
				Log.i(tag, msg);
			} catch (Exception e) {

			}
		}
	}

	public static void d(String tag, String msg) {
		if (DEBUG) {
			try {
				Log.d(tag, msg);
			} catch (Exception e) {

			}
		}
	}

	public static void d(String tag, String msg, Throwable tr) {
		if (DEBUG) {
			try {
				Log.d(tag, msg, tr);

			} catch (Exception e) {

			}
		}
	}

	public static void w(String tag, String msg) {
		if (DEBUG) {
			try {

				Log.w(tag, msg);

			} catch (Exception e) {

			}
		}
	}

	public static void w(String tag, String msg, Throwable tr) {
		if (DEBUG) {
			try {
				Log.w(tag, msg, tr);

			} catch (Exception e) {

			}
		}
	}

	public static void e(String tag, String msg) {
		if (DEBUG) {
			try {
				Log.e(tag, msg);
			} catch (Exception e) {

			}
		}
	}

	public static void e(String tag, String msg, Throwable tr) {
		if (DEBUG) {
			try {
				Log.e(tag, msg, tr);
			} catch (Exception e) {

			}
		}
	}
}
