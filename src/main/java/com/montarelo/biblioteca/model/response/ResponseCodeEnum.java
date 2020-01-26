package com.montarelo.biblioteca.model.response;

import java.util.Arrays;
import java.util.Optional;

public enum ResponseCodeEnum {
    OK(200), NOK(201), FORBIDDEN(403), USER_ALREADY_EXIST(801), CRITICAL_NOT_FOUND(1);

    private Integer code;

    ResponseCodeEnum(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public static ResponseCodeEnum findByCode(Integer code){
        Optional<ResponseCodeEnum> optionalResponse = Arrays.stream(ResponseCodeEnum.values()).filter(v -> v.getCode() == code).findFirst();
        return optionalResponse.isPresent()?optionalResponse.get():ResponseCodeEnum.CRITICAL_NOT_FOUND;
    }
}
