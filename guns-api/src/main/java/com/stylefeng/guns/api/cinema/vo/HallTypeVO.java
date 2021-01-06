package com.stylefeng.guns.api.cinema.vo;

import java.io.Serializable;

import lombok.Data;

/**
 * @description: 影院类型vo
 * @author:maidang
 * @date:2021/01/06
 **/
@Data
public class HallTypeVO implements Serializable {

  private String halltypeId;
  private String halltypeName;
  private boolean isActive;


}

