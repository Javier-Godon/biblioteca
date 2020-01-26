package com.montarelo.biblioteca.model.response;

public class CommonResponse {
    public static final String MAP_CODE_VALUE = "code";
    public static final String MAP_VALUE_VALUE = "value";

    private Integer code;
    private Object value;

    public CommonResponse(ResponseCodeEnum responseCode, Object value) {
        this.code = responseCode.getCode();
        this.value = value;
    }

    public Integer getCode() {
        return code;
    }

    public Object getValue() {
        return value;
    }
}
