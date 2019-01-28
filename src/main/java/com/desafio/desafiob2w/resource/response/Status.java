package com.desafio.desafiob2w.resource.response;

public enum  Status {
    SUCCESS(200),
    INTERNAL_ERROR(500),
    NOT_FOUND(404);

    private final Integer statusCode;
    Status(Integer statusCode){
        this.statusCode = statusCode;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    @Override
    public String toString() {
        return this.getStatusCode().toString();
    }
}
