package com.stylefeng.guns.api.film.vo;

import java.io.Serializable;

import lombok.Data;

/**
 * @description:
 * @author:maidang
 * @date:2021/01/02
 **/
@Data
public class ActorVO implements Serializable {

  private String imgAddress;
  private String directorName;
  private String roleName;

}
