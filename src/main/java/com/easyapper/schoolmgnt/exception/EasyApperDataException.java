package com.easyapper.schoolmgnt.exception;

public class EasyApperDataException extends RuntimeException {

    public EasyApperDataException() {
    }

    public EasyApperDataException(String message) {
        super(message);
    }

    public EasyApperDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public EasyApperDataException(Throwable cause) {
        super(cause);
    }

    public EasyApperDataException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
