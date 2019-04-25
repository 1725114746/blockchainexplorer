package io.wangjie.blockchainexplorer2.controller;

import io.wangjie.blockchainexplorer2.api.BitcoinApi;
import io.wangjie.blockchainexplorer2.api.BitcoinJsonRpcClient;
import io.wangjie.blockchainexplorer2.dao.BlockMapper;
import io.wangjie.blockchainexplorer2.dto.BlockDetailDTO;
import io.wangjie.blockchainexplorer2.dto.BlockListDTO;
import io.wangjie.blockchainexplorer2.pojo.Block;
import io.wangjie.blockchainexplorer2.service.BlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/block")
@CrossOrigin
public class BlockController {

    @Autowired(required = false)
    private BitcoinApi bitcoinApi;

    @Autowired
    private BitcoinJsonRpcClient bitcoinJsonRpcClient;


    /*@Autowired
    private BlockMapper blockMapper;*/

    @Autowired(required = false)
    private BlockService blockService;

    @Value("${blockchain.recentCount}")
    private Integer recentCount;

    @GetMapping("/getRecentBlocksByNameType")
    public List<BlockListDTO> getRecentBlocksByNameType(@RequestParam String name,
                                                        @RequestParam String type){
        return null;
    }

    @GetMapping("/getBlockDetailByHash")
    public BlockDetailDTO getBlockDetailByHash(@RequestParam String blockhash){
        return null;
    }

    @GetMapping("/getBlockDetailByHeight")
    public BlockDetailDTO getBlockDetailByHeight(@RequestParam Integer blockheight){
        return null;
    }

    @GetMapping("/getRecentBlocks")
    public List<BlockListDTO> getRecentBlocks() throws Throwable {
        List<Block> blocks = blockService.selectRecent();
        List<BlockListDTO> blockListDTOS = blocks.stream().map(block -> {
            BlockListDTO blockListDTO = new BlockListDTO();
            blockListDTO.setHeight(block.getHeight());
            blockListDTO.setTime(block.getTime().getTime());
            blockListDTO.setTxSize(block.getTxSize());
            blockListDTO.setSizeOnDisk(block.getSizeOnDisk());
            return blockListDTO;
        }).collect(Collectors.toList());

        return blockListDTOS;
    }
}
