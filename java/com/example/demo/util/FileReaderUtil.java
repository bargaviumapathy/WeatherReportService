//package com.example.demo.util;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.util.List;
//
//import com.example.demo.DTO.WeatherReportEntity;
//
//public class FileReaderUtil {
//	
//	public static List<WeatherReportEntity> getWeatherReportEntity(String fileName){
//	
//	BufferedReader br=new BufferedReader(new FileReader("rdu-weather-history.csv"));
//	String newline=br.readLine();
//	//System.out.println(newline.length());
//	
//	while(newline!=null)
//	{
//		List<String> values = new ArrayList<String>();
//		String arr[]=newline.split(";");
//
//		for(int i=0;i<arr.length;i++)
//		{
//			values.add(arr[i]);
//		}
//		map.put(arr[0],values); ringmap<STring,List<>st> <>
//		newline=br.readLine();	
//		
//	}
//	if(map.containsKey(d))
//	{
//		System.out.println(map.get(d));
//	}
//	else {
//		System.out.println("data not found");
//}
//}
//}