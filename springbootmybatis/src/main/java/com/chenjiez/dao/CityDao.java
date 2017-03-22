package com.chenjiez.dao;

import com.chenjiez.model.City;
import org.apache.ibatis.annotations.Param;

/**
 * Created by zcj on 2017/2/10.
 */
public interface CityDao {

    City findByName(@Param("cityName") String cityName);
}
