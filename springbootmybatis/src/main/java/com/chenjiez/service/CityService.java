package com.chenjiez.service;


import com.chenjiez.model.City;

/**
 * 城市业务逻辑接口类
 *
 * Created by zcj on 07/02/2017.
 */
public interface CityService {

    /**
     * 根据城市名称，查询城市信息
     * @param cityName
     */
    City findCityByName(String cityName);
}
