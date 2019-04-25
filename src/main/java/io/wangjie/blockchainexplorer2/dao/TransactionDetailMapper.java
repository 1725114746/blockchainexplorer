package io.wangjie.blockchainexplorer2.dao;

import io.wangjie.blockchainexplorer2.pojo.TransactionDetail;
import io.wangjie.blockchainexplorer2.pojo.TransactionDetailKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TransactionDetailMapper {
    int deleteByPrimaryKey(TransactionDetailKey key);

    int insert(TransactionDetail record);

    int insertSelective(TransactionDetail record);

    TransactionDetail selectByPrimaryKey(TransactionDetailKey key);

    int updateByPrimaryKeySelective(TransactionDetail record);

    int updateByPrimaryKey(TransactionDetail record);

    List<TransactionDetail> selectByAddress(@Param("address") String address);

    int truncate();
}