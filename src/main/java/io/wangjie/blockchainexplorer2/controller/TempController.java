package io.wangjie.blockchainexplorer2.controller;

import com.alibaba.fastjson.JSONObject;
import io.wangjie.blockchainexplorer2.api.BitcoinApi;
import io.wangjie.blockchainexplorer2.api.BitcoinJsonRpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/temp")
public class TempController {

    @Autowired(required = false)
    private BitcoinApi bitcoinApi;

    @Autowired
    private BitcoinJsonRpcClient bitcoinJsonRpcClient;

    @GetMapping("/test")
    public void test() throws Throwable {
        String txid = "e70822bf60e7b7c4f6eb5ca4c1f19e8bcf7c10f5f6981a5f205ef22c8a43abe6";
        JSONObject rawTransaxtion = bitcoinJsonRpcClient.getRawTransaxtion(txid);
    }

}
