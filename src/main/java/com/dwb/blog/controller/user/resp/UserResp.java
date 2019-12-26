package com.dwb.blog.controller.user.resp;

import com.dwb.blog.controller.common.model.ControllerBaseResp;
import com.dwb.blog.controller.user.vo.UserVo;
import lombok.Data;
import lombok.Setter;

@Data
@Setter
public class UserResp extends ControllerBaseResp {
    public UserVo userInfo;
}
