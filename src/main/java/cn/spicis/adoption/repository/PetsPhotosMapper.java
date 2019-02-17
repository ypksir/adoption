package cn.spicis.adoption.repository;

import cn.spicis.adoption.domain.PetsPhotos;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PetsPhotosMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PetsPhotos record);

    int insertCodeBatch(@Param("list") List<PetsPhotos> list);

    int insertSelective(PetsPhotos record);

    PetsPhotos selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PetsPhotos record);

    int updateByPrimaryKey(PetsPhotos record);
}