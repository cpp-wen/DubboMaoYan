package com.stylefeng.guns.api.film.vo;

import java.io.Serializable;

import lombok.Data;

/**
 * @description:
 * @author:maidang
 * @date:2021/01/02
 **/
@Data
public class FilmInfo implements Serializable {

  private String filmId;
  private int filmType;
  private String imgAddress;
  private String filmName;
  private String filmScore;
  private int expectNum;
  private String showTime;
  private int boxNum;
  private String score;

}
