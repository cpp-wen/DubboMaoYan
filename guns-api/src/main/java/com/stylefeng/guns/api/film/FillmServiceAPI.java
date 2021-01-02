package com.stylefeng.guns.api.film;

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

import java.util.List;

/**
 * @description:
 * @author:maidang
 * @date:2021/01/02
 **/
public interface FillmServiceAPI {
  /**
   *  获取banners
   *  */
  List<BannerVO> getBanners();

  /**
   * 获取热映影片
   * @param isLimit
   * @param nums
   * @param nowPage
   * @param sortId
   * @param sourceId
   * @param yearId
   * @param catId
   * @return
   */
  FilmVO getHotFilms(boolean isLimit, int nums, int nowPage, int sortId, int sourceId, int yearId, int catId);

  /**
   * 获取即将上映影片[受欢迎程度做排序]
   * @param isLimit
   * @param nums
   * @param nowPage
   * @param sortId
   * @param sourceId
   * @param yearId
   * @param catId
   * @return
   */
  FilmVO getSoonFilms(boolean isLimit,int nums,int nowPage,int sortId,int sourceId,int yearId,int catId);

  /**
   * 获取经典影片
   * @param nums
   * @param nowPage
   * @param sortId
   * @param sourceId
   * @param yearId
   * @param catId
   * @return
   */
  FilmVO getClassicFilms(int nums,int nowPage,int sortId,int sourceId,int yearId,int catId);
    /*
        在正式项目中，推荐大家使用的做法
     */
//    // 获取热映影片
//    FilmVO getHotFilms(int nowPage,int nums ...);

  /**
   * 获取票房排行榜
   * @return
   */
  List<FilmInfo> getBoxRanking();

  /**
   * 获取人气排行榜
   * @return
   */
  List<FilmInfo> getExpectRanking();

  /**
   * 获取Top100
   * @return
   */
  List<FilmInfo> getTop();

  /**
   * 获取影片条件接口
   * @return
   */
  List<CatVO> getCats();

  /**
   * 片源条件
   * @return
   */
  List<SourceVO> getSources();

  /**
   * 获取年代条件
   * @return
   */
  List<YearVO> getYears();

  /**
   * 根据影片ID或者名称获取影片信息
   * @param searchType
   * @param searchParam
   * @return
   */
  FilmDetailVO getFilmDetail(int searchType, String searchParam);

  /**
   * 获取影片描述信息
   * @param filmId
   * @return
   */
  FilmDescVO getFilmDesc(String filmId);

  /**
   * 获取影片图片信息
   * @param filmId
   * @return
   */
  ImgVO getImgs(String filmId);

  /**
   * 获取导演信息
   * @param filmId
   * @return
   */
  ActorVO getDectInfo(String filmId);

  /**
   * 获取演员信息
   * @param filmId
   * @return
   */
  List<ActorVO> getActors(String filmId);


}
