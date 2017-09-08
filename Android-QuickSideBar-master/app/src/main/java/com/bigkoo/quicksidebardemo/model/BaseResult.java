package com.bigkoo.quicksidebardemo.model;

import java.io.Serializable;

/**
 * Created by syhuang on 2017/7/10.
 */

public class BaseResult implements Serializable {
    private int Status;
    private String Message;


    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}
