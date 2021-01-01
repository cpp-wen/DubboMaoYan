package com.stylefeng.guns.rest.modular.auth.VO;

/**
 * @description:
 * @author:maidang
 * @date:2020/12/12
 **/
public class ReponseVO<T> {


  private  int status;


  private String msg;

  private T data;

  private ReponseVO(){

  }



  public int getStatus() {
    return status;
  }



  public void setStatus(int status) {
    this.status = status;
  }



  public String getMsg() {
    return msg;
  }



  public void setMsg(String msg) {
    this.msg = msg;
  }



  public T getData() {
    return data;
  }



  public void setData(T data) {
    this.data = data;
  }


  public static<T> ReponseVO serviceFail(String msg){

    ReponseVO reponseVO =new ReponseVO();
    reponseVO.setStatus(1);
    reponseVO.setMsg(msg);
    return reponseVO;
  }


  public static<T> ReponseVO success(T data){

    ReponseVO reponseVO =new ReponseVO();
    reponseVO.setStatus(0);
    reponseVO.setData(data);
    return reponseVO;
  }

  public static<T> ReponseVO appFail(String msg){

    ReponseVO reponseVO =new ReponseVO();
    reponseVO.setStatus(999);
    reponseVO.setMsg(msg);
    return reponseVO;
  }
}
