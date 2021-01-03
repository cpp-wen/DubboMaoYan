package com.stylefeng.guns.rest.modular.film.vo;

import com.stylefeng.guns.api.film.vo.CatVO;
import com.stylefeng.guns.api.film.vo.SourceVO;
import com.stylefeng.guns.api.film.vo.YearVO;

import java.util.List;

import lombok.Data;

/**
 * @description:
 * @author:maidang
 * @date:2021/01/04
 **/
@Data
public class FilmConditionVO {

  private List<CatVO> catInfo;
  private List<SourceVO> sourceInfo;
  private List<YearVO> yearInfo;

}
