package com.yang.gulimall.store.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yang.common.utils.PageUtils;
import com.yang.gulimall.store.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author durant
 * @email 1977337091@qq.com
 * @date 2025-11-24 19:47:03
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

