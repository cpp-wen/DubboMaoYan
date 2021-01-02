package com.stylefeng.guns.rest.modular.film.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.stylefeng.guns.api.film.FilmServiceApi;
import com.stylefeng.guns.api.film.vo.ActorVO;
import com.stylefeng.guns.api.film.vo.BannerVO;
import com.stylefeng.guns.api.film.vo.CatVO;
import com.stylefeng.guns.api.film.vo.FilmDescVO;
import com.stylefeng.guns.api.film.vo.FilmDetailVO;
import com.stylefeng.guns.api.film.vo.FilmInfo;
import com.stylefeng.guns.api.film.vo.FilmVO;
import com.stylefeng.guns.api.film.vo.ImgVO;
import com.stylefeng.guns.api.film.vo.SourceVO;
import com.stylefeng.guns.api.film.vo.YearVO;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @description:
 * @author:maidang
 * @date:2021/01/02
 **/
@Component
@Service(interfaceClass = FilmServiceApi.class)
public class DefaultFilmServiceImpl implements FilmServiceApi {

  @Override
  public List<BannerVO> getBanners() {
    return null;
  }

  @Override
  public FilmVO getHotFilms(boolean isLimit, int nums, int nowPage, int sortId, int sourceId,
                            int yearId, int catId) {
    return null;
  }

  @Override
  public FilmVO getSoonFilms(boolean isLimit, int nums, int nowPage, int sortId, int sourceId,
                             int yearId, int catId) {
    return null;
  }

  @Override
  public FilmVO getClassicFilms(int nums, int nowPage, int sortId, int sourceId, int yearId,
                                int catId) {
    return null;
  }

  @Override
  public List<FilmInfo> getBoxRanking() {
    return null;
  }

  @Override
  public List<FilmInfo> getExpectRanking() {
    return null;
  }

  @Override
  public List<FilmInfo> getTop() {
    return null;
  }

  @Override
  public List<CatVO> getCats() {
    return null;
  }

  @Override
  public List<SourceVO> getSources() {
    return null;
  }

  @Override
  public List<YearVO> getYears() {
    return null;
  }

  @Override
  public FilmDetailVO getFilmDetail(int searchType, String searchParam) {
    return null;
  }

  @Override
  public FilmDescVO getFilmDesc(String filmId) {
    return null;
  }

  @Override
  public ImgVO getImgs(String filmId) {
    return null;
  }

  @Override
  public ActorVO getDectInfo(String filmId) {
    return null;
  }

  @Override
  public List<ActorVO> getActors(String filmId) {
    return null;
  }
}
