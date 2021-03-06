package com.danfeng.service;

import java.util.List;

import com.danfeng.entity.CollectAddressEntity;
import com.danfeng.entity.GoodsEntity;
import com.danfeng.entity.OrderEntity;

public interface GoodsService {

	List<GoodsEntity> getGoodsList();

	void insert(GoodsEntity goodsEntity);

	void update(GoodsEntity goodsEntity);

	void delete(Integer goodsId);

}
