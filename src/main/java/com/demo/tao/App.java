package com.demo.tao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * Hello world!
 *
 */
public class App
{

    public static void main(String[] args)
    {
       String aString="{\r\n" + 
               "    \"merchantId\":\"LSGQ\",\r\n" + 
               "    \"cusCode\":\"21070809192327739\",\r\n" + 
               "    \"orderNum\":\"4546545645\",\r\n" + 
               "    \"opeType\":\"2\",\r\n" + 
               "    \"shopCode\":\"777701\",\r\n" + 
               "    \"ticketCodeList\":[\r\n" + 
               "        {\r\n" + 
               "            \"ticketCode\":\"5012021070815013310000431223\",\r\n" + 
               "            \"payFee\":10\r\n" + 
               "        },\r\n" + 
               "        {\r\n" + 
               "            \"ticketCode\":\"5012021070815013310000431229\",\r\n" + 
               "            \"payFee\":10\r\n" + 
               "        }\r\n" + 
               "    ]\r\n" + 
               "\r\n" + 
               "}";
       
       JSONObject aa=JSONObject.parseObject(aString);
       String ticketCodeList = aa.getString("ticketCodeList");
       List<Map> ticketCode = JSONArray.parseArray(ticketCodeList, Map.class);
       String ticketIds=ticketCode.stream().map(String::valueOf).collect(Collectors.joining(","));
       
       StringBuffer signKey = new StringBuffer();
       Map<String, Object> paramMap=new HashMap<String, Object>();
       paramMap.put("key", "444");
       
       for (Map.Entry<String, Object> entry : paramMap.entrySet()){
           signKey.append(entry.getKey()).append("&").append(entry.getValue()).append("&").append("");
       }
       
      System.out.println(signKey.toString());
      
      
      System.out.println("2020061717411910910SQYD".length());
    }
}
