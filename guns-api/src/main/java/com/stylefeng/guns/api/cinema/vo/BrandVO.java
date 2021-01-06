package com.stylefeng.guns.api.cinema.vo;

import java.io.Serializable;

import lombok.Data;

/**
 * @description:
 * @author:maidang
 * @date:2021/01/05
 **/
@Data
public class BrandVO implements Serializable {

  private String brandId;
  private String brandName;
  private boolean isActive;
}