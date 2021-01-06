package com.stylefeng.guns.rest.modular.cinema.vo;

import com.stylefeng.guns.api.cinema.vo.AreaVO;
import com.stylefeng.guns.api.cinema.vo.BrandVO;
import com.stylefeng.guns.api.cinema.vo.HallTypeVO;

import java.util.List;

import lombok.Data;

/**
 * @description:
 * @author:maidang
 * @date:2021/01/06
 **/
@Data
public class CinemaConditionResponseVO {

  private List<BrandVO> brandList;
  private List<AreaVO> areaList;
  private List<HallTypeVO> halltypeList;

}
