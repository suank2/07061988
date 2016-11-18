package com.hcl.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.entity.ShopInfoEntityBean;
import com.hcl.model.ShopAddress;
import com.hcl.model.ShopInfo;
import com.hcl.repository.ShopInfoRepository;

@Service
@Transactional
public class ShopDtlService {
	
	@Autowired
	ShopInfoRepository repository;
	
	HashMap<String,ShopInfo> shops = new HashMap<>();
	public ShopDtlService() {
		shops.put("1",new ShopInfo("1","Sudha",new ShopAddress("1","412307","11","11")));
		shops.put("2",new ShopInfo("2","Pooja",new ShopAddress("2","412308","12","12")));
	}

	public Iterable<ShopInfoEntityBean> getAllShops(){
		return repository.findAll();
		
	}
	
	public String addShop(ShopInfo shopInfo){
		ShopInfoEntityBean bean = new ShopInfoEntityBean();
		bean.setShopId(shopInfo.getShopId());
		bean.setShopName(shopInfo.getShopName());
		bean.setShopNumber(shopInfo.getShopAddress().getShopNumber());
		bean.setLatitude(shopInfo.getShopAddress().getLatitude());
		bean.setLongitude(shopInfo.getShopAddress().getLongitude());
		bean.setPostalCode(shopInfo.getShopAddress().getPostalCode());
		
		repository.save(bean);
		return "Added successfully "+shopInfo.toString();
	}
	
	 
}
