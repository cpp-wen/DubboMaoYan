package com.stylefeng.guns.rest.modular.user;

import com.alibaba.dubbo.config.annotation.Service;
import com.stylefeng.guns.api.user.UserAPI;
import com.stylefeng.guns.api.user.UserInfoModel;
import com.stylefeng.guns.api.user.UserModel;
import com.stylefeng.guns.core.util.MD5Util;
import com.stylefeng.guns.rest.common.persistence.dao.MoocUserTMapper;
import com.stylefeng.guns.rest.common.persistence.model.MoocUserT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author:maidang
 * @date:2020/12/12
 **/
@Component
@Service(interfaceClass= UserAPI.class)
public class UserServiceImpl implements UserAPI{


  //注入数据库的自动扫描类
  @Autowired
  private MoocUserTMapper userMapper;
  @Override
  public int  login(String username, String password) {
    return 0;
  }

  @Override
  public boolean register(UserModel userModel) {
    // TODO Auto-generated method stub
    //userModel是用户在页面上输入的数据，密码为123456，存储在数据库中需要进行加密处理
    //将注册实体转换成数据实体
    MoocUserT moocUserT = new MoocUserT();
    moocUserT.setUserName(userModel.getUsername());
    String md5Passwd= MD5Util.encrypt(userModel.getPassword());
    moocUserT.setUserPwd(md5Passwd);
    moocUserT.setEmail(userModel.getEmail());
    moocUserT.setAddress(userModel.getAddress());
    moocUserT.setUserPhone(userModel.getPhone());

    //将实体存储到数据库中
    Integer insert = userMapper.insert(moocUserT);
    if(insert>0){
      return true;
    }else{
      return false;
    }
  }

  @Override
  public boolean checkUsername(String username) {
    return false;
  }

  @Override
  public UserInfoModel getUserInfo(int uuid) {
    return null;
  }

  @Override
  public UserInfoModel updateUserInfo(UserInfoModel userInfoModel) {
    return null;
  }
}
