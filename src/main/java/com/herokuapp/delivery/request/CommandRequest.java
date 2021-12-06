package com.herokuapp.delivery.request;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class CommandRequest implements Serializable {

    private Date iniDate;
    private Date finalDate;
    private String commandStatus;
}
