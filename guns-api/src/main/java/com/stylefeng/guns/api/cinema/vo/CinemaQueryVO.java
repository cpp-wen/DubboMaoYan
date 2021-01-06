package com.stylefeng.guns.api.cinema.vo;

import java.io.Serializable;

import lombok.Data;

/**
 * @description:
 * @author:maidang
 * @date:2021/01/05
 **/
@Data
public class CinemaQueryVO implements Serializable {

  /**
   * 默认是全查询   默认值为99
   */
  private Integer brandId=99;
  private Integer districtId=99;
  private Integer hallType=99;
  private Integer pageSize=12;
  private Integer nowPage=1;
}

