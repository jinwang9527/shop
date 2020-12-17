package com.shop.service.impl;

import com.shop.entity.ClientAccountDo;
import com.shop.mapper.ClientAccountDoMapper;
import com.shop.service.ClientAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 客户资金账户表 服务实现类
 * </p>
 *
 * @author 靳 旺
 * @since 2020-12-17
 */
@Service
public class ClientAccountServiceImpl extends ServiceImpl<ClientAccountDoMapper, ClientAccountDo> implements ClientAccountService {

}
