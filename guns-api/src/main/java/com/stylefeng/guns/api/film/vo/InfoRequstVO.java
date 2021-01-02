package com.stylefeng.guns.api.film.vo;

import lombok.Data;

/**
 * @description:
 * @author:maidang
 * @date:2021/01/02
 **/
@Data
public class InfoRequstVO {

  // 分类
  private String biography;
  //演员信息
  private ActorRequestVO actors;
  //图片信息
  private ImgVO imgVO;
  private String filmId;

}
