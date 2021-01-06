package com.stylefeng.guns.api.cinema.vo;

import java.io.Serializable;

import lombok.Data;

/**
 * @description:
 * @author:maidang
 * @date:2021/01/05
 **/
@Data
public class CinemaInfoVO implements Serializable {

  private String cinemaId;
  private String imgUrl;
  private String cinemaName;
  private String cinemaAdress;
  private String cinemaPhone;

}

