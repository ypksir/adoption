package cn.spicis.adoption.repository;

import cn.spicis.adoption.domain.Applications;

public interface ApplicationsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Applications record);

    int insertSelective(Applications record);

    Applications selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Applications record);

    int updateByPrimaryKey(Applications record);
}