package com.yang.gulimall.vencher.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yang.common.utils.PageUtils;
import com.yang.gulimall.vencher.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author durant
 * @email 1977337091@qq.com
 * @date 2025-11-24 19:57:25
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

