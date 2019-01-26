package cn.spicis.adoption.dao;

import cn.spicis.adoption.domain.CatApplications;

public interface CatApplicationsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CatApplications record);

    int insertSelective(CatApplications record);

    CatApplications selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CatApplications record);

    int updateByPrimaryKey(CatApplications record);
}