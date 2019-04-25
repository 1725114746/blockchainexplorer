package io.wangjie.blockchainexplorer2.service;

import io.wangjie.blockchainexplorer2.pojo.Block;

import java.util.List;

public interface BlockService {

    List<Block> selectRecent();
}
