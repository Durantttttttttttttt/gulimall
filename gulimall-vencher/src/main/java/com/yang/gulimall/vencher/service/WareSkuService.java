package com.yang.gulimall.vencher.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yang.common.utils.PageUtils;
import com.yang.gulimall.vencher.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author durant
 * @email 1977337091@qq.com
 * @date 2025-11-24 19:57:25
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

