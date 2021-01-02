package com.stylefeng.guns.api.user.vo;
import java.io.Serializable;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UserModel  implements Serializable{

  private String username;
  private String password;
  private String email;
  private String phone;
  private String address;
  @Override
  public String toString() {
    return "UserModel [username=" + username + ", password=" + password + ", email=" + email + ", phone=" + phone
           + ", address=" + address + "]";
  }



}
