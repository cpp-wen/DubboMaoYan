package com.stylefeng.guns.rest.modular.cinema.vo;

import com.stylefeng.guns.api.cinema.vo.CinemaVO;

import java.util.List;

import lombok.Data;

/**
 * @description:
 * @author:maidang
 * @date:2021/01/07
 **/

@Data
public class CinemaListResponseVO {

  private List<CinemaVO> cinemas;

}
