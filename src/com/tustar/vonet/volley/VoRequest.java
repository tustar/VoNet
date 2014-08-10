package com.tustar.vonet.volley;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.http.protocol.HTTP;

import android.text.TextUtils;

import com.android.volley.Request.Method;

public abstract class VoRequest<T extends VoResponse> {

	private static final String DEFAULT_REQUEST_CHARSET = HTTP.UTF_8;
	private String requestBody;
	private Map<String, String> headers = new HashMap<String, String>();
	private Map<String, Object> params = new HashMap<String, Object>();
	private boolean shouldCache;
	private String tag;
	private String url;

	public abstract String getApi();

	public String getRequestBody() {
		return requestBody;
	}

	public Map<String, String> getHeaders() {
		return headers;
	}

	public int getMethod() {
		return Method.GET;
	}

	public Map<String, Object> getParams() {
		return params;
	}

	public String getRequestEncoding() {
		return DEFAULT_REQUEST_CHARSET;
	}

	public abstract Class<T> getResponseClass();

	public String getTag() {
		return tag;
	}

	public String getUrl() {
		return url;
	}

	public boolean isShouldCache() {
		return shouldCache;
	}

	public void setHeaders(Map<String, String> headers) {
		this.headers = headers;
	}

	public void setParams(Map<String, Object> params) {
		this.params = params;
	}

	public void setShouldCache(boolean shouldCache) {
		this.shouldCache = shouldCache;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getCacheKey() {
		
		if (getMethod() == Method.GET && params != null && params.size() > 0) {
			
			Map<String, String> tmp = new HashMap<String, String>();
			Map<String, Object> requestParams = getParams();
			if (requestParams != null) {
				for (Entry<String, Object> entry : requestParams.entrySet()) {
					tmp.put(entry.getKey(), entry.getValue().toString());
				}
			}
			return getUrl()
					+ VoHttpUtils.genrateUrlparams(getUrl(), tmp,
							getRequestEncoding());
		}

		return getUrl();
	}
}
