package com.f1ne.springboot.learn;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSONObject;
import com.f1ne.springboot.learn.domain.kafka.TblProdConsuMsgRecord;
import com.f1ne.springboot.learn.mapper.kafka.ProdConsuMsgRecordMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
@ImportResource(locations="classpath:dubbo.xml")
public class SpringbootLearnApplicationTests {
    @Autowired
    private ProdConsuMsgRecordMapper prodConsuMsgRecordMapper;
	@SuppressWarnings("unused")
    @Test
	public void contextLoads() {
	    List<TblProdConsuMsgRecord> list = prodConsuMsgRecordMapper.queryByStatusAndType(2, 1);
	    List<TblProdConsuMsgRecord> list2 = prodConsuMsgRecordMapper.queryByStatusAndType(2, 0);
	    System.out.println(JSONObject.toJSONString(list));

	}
	
	

}
