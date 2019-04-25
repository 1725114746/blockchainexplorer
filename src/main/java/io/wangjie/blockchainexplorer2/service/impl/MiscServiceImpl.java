package io.wangjie.blockchainexplorer2.service.impl;

import io.wangjie.blockchainexplorer2.service.MiscService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class MiscServiceImpl implements MiscService {
    @Async
    @Override
    public void importFromHeight(Integer blockHeight, Boolean isClean) {

    }

    @Override
    public void importFromHash(String blockHash, Boolean isClean) {

    }


}
