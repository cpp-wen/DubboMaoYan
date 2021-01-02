package com.stylefeng.guns.api.film.vo;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * @description: 
 * @author:maidang
 * @date:2021/01/02
 **/
@Data
public class FilmVO implements Serializable {

  private int filmNum;
  private int nowPage;
  private int totalPage;
  private List<FilmInfo> filmInfo;

}

