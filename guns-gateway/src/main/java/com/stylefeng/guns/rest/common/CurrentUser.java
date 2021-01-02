package com.stylefeng.guns.rest.common;

/**
 * @description:
 * @author:maidang
 * @date:2020/12/12
 **/
public class CurrentUser {
    private static final ThreadLocal<String> threadLocal=new ThreadLocal<>();

    //将用户信息放入存贮空间里面
  public static void saveUserInfo(String userId){
    threadLocal.set(userId);
  }
  public static String getUserInfo(){
    return threadLocal.get();
  }
}
