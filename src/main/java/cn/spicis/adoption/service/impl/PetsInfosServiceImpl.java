package cn.spicis.adoption.service.impl;

import cn.spicis.adoption.domain.PetsInfos;
import cn.spicis.adoption.repository.PetsInfosMapper;
import cn.spicis.adoption.service.PetsInfosService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PetsInfosServiceImpl implements PetsInfosService {
    @Resource
    private PetsInfosMapper petsInfosMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return petsInfosMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PetsInfos record) {
        return petsInfosMapper.insert(record);
    }

    @Override
    public int insertSelective(PetsInfos record) {
        return petsInfosMapper.insertSelective(record);
    }

    @Override
    public PetsInfos selectByPrimaryKey(Integer id) {
        return petsInfosMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PetsInfos record) {
        return petsInfosMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PetsInfos record) {
        return petsInfosMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<PetsInfos> getAll() {
        return petsInfosMapper.getAll();
    }
}
