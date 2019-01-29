package com.desafio.desafiob2w.resource.response;

public class Response {
    private Object response;
    private String status;
    private Status message;

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Status getMessage() {
        return message;
    }

    public void setMessage(Status message) {
        this.message = message;
    }

    public Response(Object response, String status, Status message) {
        this.response = response;
        this.status = status;
        this.message = message;
    }


}
