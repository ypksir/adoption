package cn.spicis.adoption.repository;

import cn.spicis.adoption.domain.ApplicationPhotos;

public interface ApplicationPhotosMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ApplicationPhotos record);

    int insertSelective(ApplicationPhotos record);

    ApplicationPhotos selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ApplicationPhotos record);

    int updateByPrimaryKey(ApplicationPhotos record);
}