package com.yang.gulimall.order.feign;

import com.yang.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("gulimall-product")
public interface ProductFeign {
    @GetMapping("/product/attr/returnProduct")
    R returnProduct(@RequestParam("id") Long id);
}
