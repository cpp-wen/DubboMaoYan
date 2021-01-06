package com.stylefeng.guns.rest.modular.cinema.vo;

import com.stylefeng.guns.api.cinema.vo.CinemaInfoVO;
import com.stylefeng.guns.api.cinema.vo.FilmInfoVO;

import java.util.List;

import lombok.Data;

/**
 * @description:
 * @author:maidang
 * @date:2021/01/07
 **/
@Data
public class CinemaFieldsResponseVO {

  private CinemaInfoVO cinemaInfo;
  private List<FilmInfoVO> filmList;

}
