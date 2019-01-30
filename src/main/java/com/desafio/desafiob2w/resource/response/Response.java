package com.desafio.desafiob2w.resource.response;

public class Response {
    private Object response;
    private Status status;
    private String message;

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Response(Object response, Status status, String message) {
        this.response = response;
        this.status = status;
        this.message = message;
    }


}
