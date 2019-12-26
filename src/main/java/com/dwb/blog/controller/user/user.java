package com.dwb.blog.controller.user;

import com.dwb.blog.controller.common.model.ControllerBaseResp;
import com.dwb.blog.controller.common.model.Result;
import com.dwb.blog.controller.user.req.UserReq;
import com.dwb.blog.controller.user.resp.UserResp;
import com.dwb.blog.controller.user.vo.UserVo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class user {

    @RequestMapping(name = "登录接口",value = "/user/login",method = RequestMethod.POST)
    public Result userLogin(@RequestBody UserReq userReq){
        if (userReq != null && "1".equals(userReq.username) && "1".equals(userReq.password)){
            return new Result();
        }else {
            return new Result(false,"用户名或密码错误");
        }
    }
    @RequestMapping(name = "profile",value = "/profile",method = RequestMethod.GET)
    public Result profile(){
        return new Result();
    }

}
