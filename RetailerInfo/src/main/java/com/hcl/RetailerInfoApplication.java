package com.hcl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.entity.ShopInfoEntityBean;
import com.hcl.geo.GeodecodingTest;
import com.hcl.model.ShopAddress;
import com.hcl.model.ShopInfo;
import com.hcl.service.ShopDtlService;

@SpringBootApplication
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class RetailerInfoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		System.out.println("1");
		SpringApplication.run(RetailerInfoApplication.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		System.out.println("2");
		return application.sources(	applicationClass);
	}
	private static Class<RetailerInfoApplication> applicationClass = RetailerInfoApplication.class;
}
@RestController
@RequestMapping("/shops")
class ShopController {

	GeodecodingTest  geo = new GeodecodingTest();
	
	@Autowired
	ShopDtlService service ;
		
	@RequestMapping("/all")
	public Iterable<ShopInfoEntityBean> getAllShops(){
		System.out.println("Inside Controller");
		return service.getAllShops();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/add")
	public String getShopDtl(@RequestParam(value="ShopId") String ShopId,@RequestParam(value="ShopName") String ShopName,@RequestParam(value="ShopNumber") String ShopNumber,@RequestParam(value="ShopPostalCode") String ShopPostalCode){
		ShopInfo info = new ShopInfo();
		info.setShopId(ShopId);
		info.setShopName(ShopName);
		ShopAddress shopAddress = new ShopAddress();
		shopAddress.setShopNumber(ShopNumber);
		shopAddress.setPostalCode(ShopPostalCode);
		String latLng = geo.getLatLng(ShopName,ShopNumber,ShopPostalCode);
		String[] arr = latLng.split("/");
		String latitude = arr[0];
		String longitude = arr[1];
		shopAddress.setLatitude(latitude);
		shopAddress.setLongitude(longitude);
		info.setShopAddress(shopAddress);
		
		String result = service.addShop(info);
		return result;
	}
	
	@RequestMapping(value="/getshops")
	public HashMap<String,String> getNearestShops(@RequestParam(value="custLat") double custLat,@RequestParam(value="custLng") double custLng){
		HashMap<String,String> shopsMap = geo.getNearestShops(custLat,custLng);
		return shopsMap;
	}
	
	
	
	
	
	
}