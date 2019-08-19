/**
 * ProductMapper  2019/3/27
 *
 * Copyright (c) 2018, DEEPEXI Inc. All rights reserved.
 * DEEPEXI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.deepde.paq.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.deepde.paq.domain.ProductDO;
import com.deepde.paq.domain.ProductDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description: 商品持久层mapper
 * @program:
 * @author: donh
 * @mail: hudong@deepexi.com
 * @create: 2019/3/27 下午1:45
 **/
public interface ProductMapper extends BaseMapper<ProductDO> {

    /**
     * @param price : 根据价格分页查询部分商品信息
     * @description:
     * @return: java.util.List<com.deepexi.demo.domain.ProductDTO>
     * @author: donh
     * @Date: 2019/3/27 下午1:22
     */
    List<ProductDTO> selectPageVo(@Param("price") Integer price);
}
