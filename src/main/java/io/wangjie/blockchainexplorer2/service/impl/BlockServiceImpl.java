package io.wangjie.blockchainexplorer2.service.impl;

import io.wangjie.blockchainexplorer2.dao.BlockMapper;
import io.wangjie.blockchainexplorer2.pojo.Block;
import io.wangjie.blockchainexplorer2.service.BlockService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BlockServiceImpl implements BlockService {

    @Autowired
    private BlockMapper blockMapper;

    @Override
    public List<Block> selectRecent() {
        List<Block> blocks = blockMapper.selectRecent();
        return blocks;
    }
}
