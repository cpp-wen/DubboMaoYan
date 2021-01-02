package com.stylefeng.guns.api.film.vo;

import java.util.List;

import lombok.Data;

/**
 * @description: 导演和演员request
 * @author:maidang
 * @date:2021/01/02
 **/

@Data
public class ActorRequestVO {

  //导演
  private ActorVO director;
  //演员
  private List<ActorVO> actors;

}
