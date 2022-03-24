package com.kafein.error;

import java.util.ArrayList;
import java.util.List;

public class BaseError {

    private List<BaseError> subErrors;
    private String         message;
    private int            errorCode;

    public static BaseError newInstance() {
        return new BaseError();
    }

    public BaseError addSubError(final BaseError errorObjParam) {
        if (this.subErrors == null) {
            this.subErrors = new ArrayList<>();
        }
        this.subErrors.add(errorObjParam);
        return this;
    }

    public List<BaseError> getSubErrors() {
        return this.subErrors;
    }

    public BaseError setSubErrors(final List<BaseError> subErrorsParam) {
        this.subErrors = subErrorsParam;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public BaseError setMessage(final String messageParam) {
        this.message = messageParam;
        return this;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public BaseError setErrorCode(final int errorCodeParam) {
        this.errorCode = errorCodeParam;
        return this;
    }

}
