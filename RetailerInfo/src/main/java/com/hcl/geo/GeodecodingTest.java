/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hcl.geo;

import java.util.HashMap;

import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.model.GeocodingResult;
import com.google.maps.model.LatLng;


public class GeodecodingTest {
    
    static String  API_KEY = "AIzaSyCWOsIxFxh3x_YGNYbAeV6pXxfEhBvmQDU";
    //String map_url = "https://maps.googleapis.com/maps/api/geocode/json?address=1600+Amphitheatre+Parkway,+Mountain+View,+CA&key=AIzaSyCWOsIxFxh3x_YGNYbAeV6pXxfEhBvmQDU";
    //String console = "https://console.developers.google.com/apis/credentials?project=retailinfo-149208";
    
    
    public String getLatLng(String ShopName,String ShopNumber,String ShopPostalCode){
    	System.out.println("Inside getLatlng method");
    	GeoApiContext context = new GeoApiContext().setApiKey(API_KEY);
        GeocodingResult[] results;
		try {
			results = GeocodingApi.geocode(context,ShopName+" "+ShopNumber+" "+ShopPostalCode).await();
			double lat  =results[0].geometry.location.lat;
	        double lng  =results[0].geometry.location.lng;
	        System.out.println(lat+"   "+lng);
	        return lat+"/"+lng;
		} catch (Exception e) {
			System.out.println("******ERROR MESSAGE*******"+e.getMessage());
		}
		return null;
    	
    }
    
    public HashMap<String,String> getNearestShops(double Lat,double lng){
    	HashMap<String,String> map = new HashMap<>();
    	GeoApiContext context = new GeoApiContext().setApiKey(API_KEY);
    	LatLng latLng = new LatLng(Lat , lng);
    	
    	GeocodingResult[] results;
		try {
			results = GeocodingApi.reverseGeocode(context, latLng).await();
			for(int i =0;i<results.length;i++){
	    		map.put(""+i,results[i].formattedAddress);	
	    	}
	    	return map;
		} catch (Exception e) {
			System.out.println("******ERROR MESSAGE*******"+e.getMessage());
		}
		return map;
    	
    }
   public static void main(String args[]) throws Exception{
    	GeoApiContext context = new GeoApiContext().setApiKey(API_KEY);
    	/*GeocodingResult[] results =  GeocodingApi.geocode(context,"1600 Amphitheatre Parkway Mountain View, CA 94043 ").await();
        System.out.println(results[0].formattedAddress);
    	double lat  =results[0].geometry.location.lat;
    	double lng  =results[0].geometry.location.lng;
        System.out.println(lat+"   "+lng);*/
    	LatLng latLng = new LatLng(37.4223664 ,  -122.084406);
    	
    	GeocodingResult[] results = GeocodingApi.reverseGeocode(context, latLng).await();
    	for(int i =0;i<results.length;i++){
    		System.out.println(results[i].formattedAddress);	
    	}
    	
    	
    }
} 