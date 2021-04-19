package com.macro.cloud.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.macro.cloud.domain.CommonResult;

/**
 * 自定义限流处理逻辑类
 */
public class CustomBlockHandler {

    public CommonResult handleException(BlockException exception){
        return new CommonResult("自定义限流信息",200);
    }
}
