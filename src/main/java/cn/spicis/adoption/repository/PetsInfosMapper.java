package cn.spicis.adoption.repository;

import cn.spicis.adoption.domain.PetsInfos;

import java.util.List;

public interface PetsInfosMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PetsInfos record);

    int insertSelective(PetsInfos record);

    PetsInfos selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PetsInfos record);

    int updateByPrimaryKey(PetsInfos record);

    List<PetsInfos> getAll();
}