package com.dwb.blog.controller.common.model;

import lombok.Data;
import lombok.Setter;

@Data
@Setter
public class ControllerBaseResp {

    public Integer code;
    public String msg;

    public void respIsok(){
        this.msg = "ok";
    }
}
