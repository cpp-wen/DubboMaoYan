package com.stylefeng.guns.api.cinema.vo;

import java.io.Serializable;

import lombok.Data;

/**
 * @description: api vo存放请求都会用到的实体
 * @author:maidang
 * @date:2021/01/06
 **/
@Data
public class FilmFieldVO implements Serializable {

  private String fieldId;
  private String beginTime;
  private String endTime;
  private String language;
  private String hallName;
  private String price;


}

