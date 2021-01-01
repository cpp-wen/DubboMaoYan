package com.stylefeng.guns.rest.modular.auth.controller;

import com.stylefeng.guns.api.user.UserAPI;
import com.stylefeng.guns.core.exception.GunsException;
import com.stylefeng.guns.rest.common.exception.BizExceptionEnum;
import com.stylefeng.guns.rest.modular.auth.VO.ReponseVO;
import com.stylefeng.guns.rest.modular.auth.controller.dto.AuthRequest;
import com.stylefeng.guns.rest.modular.auth.controller.dto.AuthResponse;
import com.stylefeng.guns.rest.modular.auth.util.JwtTokenUtil;
import com.stylefeng.guns.rest.modular.auth.validator.IReqValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import jdk.nashorn.internal.ir.annotations.Reference;

/**
 * 请求验证的
 *
 * @author fengshuonan
 * @Date 2017/8/24 14:22
 */
@RestController
public class AuthController {

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Resource(name = "simpleValidator")
    private IReqValidator reqValidator;

    @Reference
    private UserAPI userApi;

    @RequestMapping(value = "${jwt.auth-path}")
    public ReponseVO createAuthenticationToken(AuthRequest authRequest) {

        //boolean validate = reqValidator.validate(authRequest);
        boolean validate = true;
        int userId = userApi.login(authRequest.getUserName(), authRequest.getPassword());
        if(userId ==0){
            validate = false;
        }
        if (validate) {
            final String randomKey = jwtTokenUtil.getRandomKey();
            final String token = jwtTokenUtil.generateToken(userId+"", randomKey);
            return ReponseVO.success(new AuthResponse(token, randomKey));
        } else {
            return ReponseVO.serviceFail("用户名或者密码错误");
        }
    }
}
