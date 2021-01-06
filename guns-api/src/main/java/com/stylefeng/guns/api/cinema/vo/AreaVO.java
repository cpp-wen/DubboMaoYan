package com.stylefeng.guns.api.cinema.vo;

import java.io.Serializable;

import lombok.Data;

/**
 * @description:
 * @author:maidang
 * @date:2021/01/05
 **/
@Data
public class AreaVO implements Serializable {

  private String areaId;
  private String areaName;
  private boolean isActive;


}
