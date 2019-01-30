package com.desafio.desafiob2w.resource.response;

public enum  Status {
    SUCCESS("Sucess"),
    INTERNAL_ERROR("An error occurred"),
    NOT_FOUND("The requested resource was not found");

    private final String statusCode;
    Status(String statusCode){
        this.statusCode = statusCode;
    }

    public String getStatusCode() {
        return statusCode;
    }

    @Override
    public String toString() {
        return this.getStatusCode().toString();
    }
}
