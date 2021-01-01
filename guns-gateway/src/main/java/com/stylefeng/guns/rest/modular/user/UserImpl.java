package com.stylefeng.guns.rest.modular.user;


import com.alibaba.dubbo.config.annotation.Service;

import org.springframework.stereotype.Component;

/**
 * @description:
 * @author:maidang
 * @date:2020/12/12
 **/
@Component
@Service(interfaceClass = UserAPI.class)
public class UserImpl implements UserAPI {

  @Override
  public boolean login(String username, String password) {
    return false;
  }
}
