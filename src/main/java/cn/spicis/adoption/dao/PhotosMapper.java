package cn.spicis.adoption.dao;

import cn.spicis.adoption.domain.Photos;

public interface PhotosMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Photos record);

    int insertSelective(Photos record);

    Photos selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Photos record);

    int updateByPrimaryKey(Photos record);
}