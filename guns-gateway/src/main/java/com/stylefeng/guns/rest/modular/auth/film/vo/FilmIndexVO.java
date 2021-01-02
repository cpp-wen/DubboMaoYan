package com.stylefeng.guns.rest.modular.auth.film.vo;

import com.stylefeng.guns.api.film.vo.BannerVO;
import com.stylefeng.guns.api.film.vo.FilmInfo;
import com.stylefeng.guns.api.film.vo.FilmVO;

import java.util.List;

/**
 * @description: 首页信息
 * @author:maidang
 * @date:2021/01/02
 **/
public class FilmIndexVO {
  private List<BannerVO> banners;
  private FilmVO hotFilms;
  private FilmVO soonFilms;
  private List<FilmInfo> boxRanking;
  private List<FilmInfo> expectRanking;
  private List<FilmInfo> top100;
}
