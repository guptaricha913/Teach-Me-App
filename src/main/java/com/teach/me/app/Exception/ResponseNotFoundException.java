package com.teach.me.app.Exception;

public class ResponseNotFoundException extends Throwable {

    /**
     * @param message Exception message to be thrown.
     */
    private String message;

    public ResponseNotFoundException() {

        this.message = message;
    }

    /**
     * @return the error message to the service.
     */
    @Override
    public String getMessage() {
        return message;
    }
}
