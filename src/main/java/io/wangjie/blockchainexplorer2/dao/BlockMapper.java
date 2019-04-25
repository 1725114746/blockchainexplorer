package io.wangjie.blockchainexplorer2.dao;

import io.wangjie.blockchainexplorer2.pojo.Block;

import java.util.List;

public interface BlockMapper {
    int deleteByPrimaryKey(String blockhash);

    int insert(Block record);

    int insertSelective(Block record);

    Block selectByPrimaryKey(String blockhash);

    int updateByPrimaryKeySelective(Block record);

    int updateByPrimaryKey(Block record);

    int truncate();

    List<Block> selectRecent();
}