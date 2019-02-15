package cn.spicis.adoption.service.impl;

import cn.spicis.adoption.domain.PetsPhotos;
import cn.spicis.adoption.repository.PetsPhotosMapper;
import cn.spicis.adoption.service.PetsPhotosService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PetsPhotosServiceImpl implements PetsPhotosService {
    @Resource
    private PetsPhotosMapper petsPhotosMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return petsPhotosMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PetsPhotos record) {
        return petsPhotosMapper.insert(record);
    }

    @Override
    public int insertCodeBatch(List<PetsPhotos> list) {
        return petsPhotosMapper.insertCodeBatch(list);
    }

    @Override
    public int insertSelective(PetsPhotos record) {
        return petsPhotosMapper.insertSelective(record);
    }

    @Override
    public PetsPhotos selectByPrimaryKey(Integer id) {
        return petsPhotosMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PetsPhotos record) {
        return petsPhotosMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PetsPhotos record) {
        return petsPhotosMapper.updateByPrimaryKey(record);
    }
}
