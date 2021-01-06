package com.stylefeng.guns.api.cinema.vo;

import java.io.Serializable;

import lombok.Data;

/**
 * @description:
 * @author:maidang
 * @date:2021/01/06
 **/
@Data
public class HallInfoVO implements Serializable {

  private String hallFieldId;
  private String hallName;
  private String price;
  private String seatFile;
  // 已售座位必须关联订单才能查询
  private String soldSeats;

}
