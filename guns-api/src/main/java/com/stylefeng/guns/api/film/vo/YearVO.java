package com.stylefeng.guns.api.film.vo;

import java.io.Serializable;

import lombok.Data;

/**
 * @description: 年代信息
 * @author:maidang
 * @date:2021/01/02
 **/
@Data
public class YearVO implements Serializable {

  private String yearId;
  private String yearName;
  private boolean isActive;

}
