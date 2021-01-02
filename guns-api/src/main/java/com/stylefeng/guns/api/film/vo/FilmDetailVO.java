package com.stylefeng.guns.api.film.vo;

import java.io.Serializable;

import lombok.Data;

/**
 * @description:
 * @author:maidang
 * @date:2021/01/02
 **/
@Data
public class FilmDetailVO implements Serializable {

  private String filmId;
  private String filmName;
  private String filmEnName;
  private String imgAddress;
  private String score;
  private String scoreNum;
  private String totalBox;
  private String info01;
  private String info02;
  private String info03;
  private InfoRequstVO info04;
}

