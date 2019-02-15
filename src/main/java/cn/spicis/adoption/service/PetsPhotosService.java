package cn.spicis.adoption.service;

import cn.spicis.adoption.domain.PetsPhotos;

import java.util.List;

public interface PetsPhotosService {
    int deleteByPrimaryKey(Integer id);

    int insert(PetsPhotos record);

    int insertCodeBatch(List<PetsPhotos> list);

    int insertSelective(PetsPhotos record);

    PetsPhotos selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PetsPhotos record);

    int updateByPrimaryKey(PetsPhotos record);
}
