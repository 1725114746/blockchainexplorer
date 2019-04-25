package io.wangjie.blockchainexplorer2.dao;

import io.wangjie.blockchainexplorer2.pojo.Blockchain;

public interface BlockchainMapper {
    int deleteByPrimaryKey(Integer blockchainId);

    int insert(Blockchain record);

    int insertSelective(Blockchain record);

    Blockchain selectByPrimaryKey(Integer blockchainId);

    int updateByPrimaryKeySelective(Blockchain record);

    int updateByPrimaryKey(Blockchain record);
}