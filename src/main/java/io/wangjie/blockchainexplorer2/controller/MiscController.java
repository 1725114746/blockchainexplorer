package io.wangjie.blockchainexplorer2.controller;

import io.wangjie.blockchainexplorer2.dto.ImportStateDTO;
import io.wangjie.blockchainexplorer2.service.MiscService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/misc")
@EnableAutoConfiguration
public class MiscController {

    @Autowired
    private MiscService miscService;

    @GetMapping("/search")
    public Object search(@RequestParam String keyword){
        return null;
    }

    @GetMapping("/importFromHeight")
    public void importFromHeight(Integer blockHeight,Boolean isClean){
        miscService.importFromHeight(blockHeight,isClean);
    }

    @GetMapping("/importFromHash")
    public void importFromHash(String blockhash,Boolean isClean){
        miscService.importFromHash(blockhash,isClean);
    }

    @GetMapping("/getImportState")
    public ImportStateDTO getImportState(){
        return null;
    }
}