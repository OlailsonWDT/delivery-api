package com.herokuapp.delivery.response;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class CommandResponse implements Serializable {

    private Long id;
    private Date iniDate;
    private Date finalDate;
    private String commandStatus;
}
