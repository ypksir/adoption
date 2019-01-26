package cn.spicis.adoption.dao;

import cn.spicis.adoption.domain.DogApplications;

public interface DogApplicationsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DogApplications record);

    int insertSelective(DogApplications record);

    DogApplications selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DogApplications record);

    int updateByPrimaryKey(DogApplications record);
}