package com.stylefeng.guns.api.user;

import com.stylefeng.guns.api.user.vo.UserInfoModel;
import com.stylefeng.guns.api.user.vo.UserModel;

/**
 * @description:
 * @author:maidang
 * @date:2020/12/12
 **/
public interface UserAPI {

  int login(String username, String password);

  boolean register(UserModel userModel);

  boolean checkUsername(String username);

  UserInfoModel getUserInfo(int uuid);

  UserInfoModel updateUserInfo(UserInfoModel userInfoModel);
}
