package com.f1ne.springboot.learn.biz;

import com.alibaba.dubbo.config.annotation.Service;

@Service
public class DubboProviderTestBiz implements DubboProviderTestFacede  {
    
    @Override
    public String testDubbo(){
        return "bingo!!!!!!!!!!!";
    }
}
