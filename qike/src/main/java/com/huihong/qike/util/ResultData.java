package com.huihong.qike.util;

import java.io.Serializable;

public class ResultData implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Object data;
	
	private String errMsg;
	
	private String errCode;
	
	public ResultData(Object data, String errMsg, String errCode) {
		super();
		this.data = data;
		this.errMsg = errMsg;
		this.errCode = errCode;
	}

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	
}
