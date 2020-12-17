package com.shop.service.impl;

import com.shop.entity.BaseOrderDo;
import com.shop.mapper.BaseOrderDoMapper;
import com.shop.service.BaseOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author 靳 旺
 * @since 2020-12-17
 */
@Service
public class BaseOrderServiceImpl extends ServiceImpl<BaseOrderDoMapper, BaseOrderDo> implements BaseOrderService {

}
