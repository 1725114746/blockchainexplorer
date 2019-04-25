package io.wangjie.blockchainexplorer2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableCaching
@MapperScan("io.wangjie.blockchainexplorer2.dao")
@EnableAsync
public class Blockchainexplorer2Application {

    public static void main(String[] args) {
        SpringApplication.run(Blockchainexplorer2Application.class, args);
    }

}
