package com.stylefeng.guns.api.film;

import com.stylefeng.guns.api.film.vo.ActorVO;
import com.stylefeng.guns.api.film.vo.FilmDescVO;
import com.stylefeng.guns.api.film.vo.ImgVO;

import java.util.List;

/**
 * @description: 异步接口这边用来 获取全部的信息
 * @author:maidang
 * @date:2021/01/04
 **/
public interface FilmAsyncServiceApi {

  // 获取影片描述信息
  FilmDescVO getFilmDesc(String filmId);

  // 获取图片信息
  ImgVO getImgs(String filmId);

  // 获取导演信息
  ActorVO getDectInfo(String filmId);

  // 获取演员信息
  List<ActorVO> getActors(String filmId);
}
