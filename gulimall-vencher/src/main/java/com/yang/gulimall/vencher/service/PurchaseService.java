package com.yang.gulimall.vencher.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yang.common.utils.PageUtils;
import com.yang.gulimall.vencher.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author durant
 * @email 1977337091@qq.com
 * @date 2025-11-24 19:57:24
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

