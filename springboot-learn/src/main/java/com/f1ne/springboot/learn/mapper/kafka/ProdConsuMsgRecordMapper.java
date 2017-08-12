package com.f1ne.springboot.learn.mapper.kafka;


import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.f1ne.springboot.learn.domain.kafka.TblProdConsuMsgRecord;

@Repository("prodConsuMsgRecordMapper")
public interface ProdConsuMsgRecordMapper {

    int insert(TblProdConsuMsgRecord record);

    int insertSelective(TblProdConsuMsgRecord record);

    TblProdConsuMsgRecord selectById(Long id);

    int updateByIdSelective(TblProdConsuMsgRecord record);

    int updateByIdWithBLOBs(TblProdConsuMsgRecord record);

    int updateById(TblProdConsuMsgRecord record);
    
    List<TblProdConsuMsgRecord> queryByStatusAndType(@Param("status")Integer status, @Param("type")Integer type);
    
    int batchUpdateList(@Param("list") List<TblProdConsuMsgRecord> msgRecordList);

}