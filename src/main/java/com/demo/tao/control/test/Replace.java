package com.demo.tao.control.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.alibaba.fastjson.JSONObject;

public class Replace
{
    public static void main(String[] args)
    {

        String srString = "10065456456456";

        /*
         * System.out.println(srString.replace(".", ""));
         * 
         * System.out.println(srString.replaceAll("/.", ""));
         * 
         * List<String> aList = new ArrayList<String>() { { add("11"); } };
         * System.out.println(JSONObject.toJSON(aList));
         * System.out.println(JSONObject.toJSON(Arrays.asList("11")));
         */
        System.out.println(srString.substring(srString.length() - 6, srString.length()));

    }
}
