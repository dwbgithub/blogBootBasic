package com.dwb.blog.controller.common.model;

import lombok.Data;

@Data
public class Result {
	private String code;
	private String message;
	private Object data;

	public Result(Object data) {
		this.data = data;
		this.code = "0000";
		this.message = "success";
	}

	public Result(String code, String message, Object data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}

	public Result(boolean code, String message) {
		this.code = code ? "0000" : "9999";
		this.message = message;
		this.data = null;
	}

	public Result(boolean code, Object data) {
		this.code = code ? "0000" : "9999";
		this.message = null;
		this.data = data;
	}

	public Result() {
		this.code = "0000";
		this.message = "success";
		this.data = null;
	}

	public String getCode() {
		return code;
	}

	public Result setCode(String code) {
		this.code = code;
		return this;
	}

	public String getMessage() {
		return message;
	}

	public Result setMessage(String message) {
		this.message = message;
		return this;
	}

	public Object getData() {
		return data;
	}

	public Result setData(Object data) {
		this.data = data;
		return this;
	}

	public Result addSuccess(String message) {
		this.message = message;
		this.code = "0000";
		this.data = null;
		return this;
	}

	public Result addError(String message) {
		this.message = message;
		this.code = "9999";
		this.data = null;
		return this;
	}

	public Result addError(String code, Object data) {
		this.message = "调用失败";
		this.code = code;
		this.data = data;
		return this;
	}

	public Result addError(String code, String message) {
		this.message = message;
		this.code = code;
		this.data = null;
		return this;
	}

	public Result success(Object data) {
		this.message = "success";
		this.data = data;
		this.code = "0000";
		return this;
	}

	/** 将message和code翻译成json字符串返回 */
	public String toJsonOfMessageAndCode(){
    	StringBuilder builder = new StringBuilder();
    	builder.append("{\"code\":\"");
    	builder.append(getCode());
    	builder.append("\",\"message\":\"");
    	builder.append(getMessage());
    	builder.append("\"}");
    	String result = builder.toString();
    	return result;
    }

	@Override
	public String toString(){
    	StringBuilder builder = new StringBuilder();
    	builder.append("{\"code\":\"");
    	builder.append(getCode());
    	builder.append("\",\"message\":\"");
    	builder.append(getMessage());
    	builder.append("\",\"data\":\"");
    	builder.append(getData());
    	builder.append("\"}");
    	String result = builder.toString();
    	return result;
    }
}
