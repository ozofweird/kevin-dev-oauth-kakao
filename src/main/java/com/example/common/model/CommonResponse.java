package com.example.common.model;

public enum CommonResponse {

    SUCCESS(0, "성공하였습니디."),
    FAIL(-1, "실패하였습니다.");

    int code;
    String message;

    CommonResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
