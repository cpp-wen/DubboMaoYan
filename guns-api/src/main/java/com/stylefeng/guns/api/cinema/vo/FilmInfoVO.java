package com.stylefeng.guns.api.cinema.vo;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * @description:
 * @author:maidang
 * @date:2021/01/06
 **/

@Data
public class FilmInfoVO implements Serializable {

  private String filmId;
  private String filmName;
  private String filmLength;
  private String filmType;
  private String filmCats;
  private String actors;
  private String imgAddress;
  private List<FilmFieldVO> filmFields;

}