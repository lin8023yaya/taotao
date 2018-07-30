package com.taotao.service.impl;

import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 商品管理服务
 *
 * @ClassName: ItemServiceImpl
 * @author: Mr.Li
 * @create: 2018-07-31 00:08
 **/
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private TbItemMapper tbItemMapper;

    @Override
    public TbItem getItemById(long itemId) {
        TbItem item = tbItemMapper.selectByPrimaryKey(itemId);
        return item;
    }
}
