package com.stylefeng.guns.api.cinema.vo;

import java.io.Serializable;

import lombok.Data;

/**
 * @description:
 * @author:maidang
 * @date:2021/01/05
 **/
@Data
public class CinemaVO implements Serializable {

  private String uuid;
  private String cinemaName;
  private String address;
  private String minimumPrice;
}
