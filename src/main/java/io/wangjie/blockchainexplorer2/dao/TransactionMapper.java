package io.wangjie.blockchainexplorer2.dao;

import io.wangjie.blockchainexplorer2.pojo.Transaction;

public interface TransactionMapper {
    int deleteByPrimaryKey(String txid);

    int insert(Transaction record);

    int insertSelective(Transaction record);

    Transaction selectByPrimaryKey(String txid);

    int updateByPrimaryKeySelective(Transaction record);

    int updateByPrimaryKey(Transaction record);

    int truncate();
}