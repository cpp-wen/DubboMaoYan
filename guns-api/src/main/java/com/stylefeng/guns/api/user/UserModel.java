package com.stylefeng.guns.api.user;

/**
 * @description:
 * @author:maidang
 * @date:2020/12/12
 **/
import java.io.Serializable;

public class UserModel  implements Serializable{

  private String username;
  private String password;
  private String email;
  private String phone;
  private String address;
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }
  @Override
  public String toString() {
    return "UserModel [username=" + username + ", password=" + password + ", email=" + email + ", phone=" + phone
           + ", address=" + address + "]";
  }



}
