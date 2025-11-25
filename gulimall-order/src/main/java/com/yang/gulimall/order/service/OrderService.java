package com.yang.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yang.common.utils.PageUtils;
import com.yang.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author durant
 * @email 1977337091@qq.com
 * @date 2025-11-24 19:17:23
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

