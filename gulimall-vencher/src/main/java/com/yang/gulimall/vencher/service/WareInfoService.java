package com.yang.gulimall.vencher.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yang.common.utils.PageUtils;
import com.yang.gulimall.vencher.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author durant
 * @email 1977337091@qq.com
 * @date 2025-11-24 19:57:25
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

