package com.demo.tao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.alibaba.fastjson.JSONObject;
import com.demo.tao.bean.TTicketInfoBean;

public class test3
{
    public static void main(String[] args)
    {
        List<TTicketInfoBean> ticketList = new ArrayList<TTicketInfoBean>();
        TTicketInfoBean TTicketInfoBean1 = new TTicketInfoBean();
        TTicketInfoBean1.setfTicketCode("1");
        TTicketInfoBean1.setfSource(10);
        TTicketInfoBean1.setfFee(BigDecimal.ZERO);
        TTicketInfoBean TTicketInfoBean2 = new TTicketInfoBean();
        TTicketInfoBean2.setfTicketCode("2");
        TTicketInfoBean2.setfSource(50);
        TTicketInfoBean2.setfFee(BigDecimal.ZERO);
        TTicketInfoBean TTicketInfoBean3 = new TTicketInfoBean();
        TTicketInfoBean3.setfTicketCode("2");
        TTicketInfoBean3.setfSource(20);
        TTicketInfoBean3.setfFee(BigDecimal.ZERO);
        TTicketInfoBean TTicketInfoBean4 = new TTicketInfoBean();
        TTicketInfoBean4.setfTicketCode("4");
        TTicketInfoBean4.setfSource(50);
        TTicketInfoBean4.setfFee(BigDecimal.ZERO);

        ticketList.add(TTicketInfoBean1);
        ticketList.add(TTicketInfoBean2);
        ticketList.add(TTicketInfoBean3);
        ticketList.add(TTicketInfoBean4);


        Integer deliveryDays = ticketList.stream().map(TTicketInfoBean::getfSource).distinct().max((e1, e2) -> e1.compareTo(e2)).get();

        System.out.println(deliveryDays);

        Stream<TTicketInfoBean> ticketInfoBeans=ticketList.stream().skip(2);
        System.out.println(JSONObject.toJSON(ticketInfoBeans));
        
        
        Map<String, List<TTicketInfoBean>> groupbyInfo=ticketList.stream().collect(Collectors.groupingBy(TTicketInfoBean::getfTicketCode));
        System.out.println(JSONObject.toJSON(groupbyInfo));
        
        String aString = ticketList.stream().map(i -> i.getfTicketCode()).collect(Collectors.joining(","));
        System.out.println(aString);
        System.out.println(JSONObject.toJSONString(ticketList));

        List<TTicketInfoBean> ailiTicketList = ticketList.stream().filter(i -> 50 == i.getfSource()).collect(Collectors.toList());

        System.out.println(JSONObject.toJSONString(ailiTicketList));

        List<String> fTicketCodes = ailiTicketList.stream().map(o -> o.getfTicketCode()).collect(Collectors.toList());
        System.out.println(JSONObject.toJSONString(fTicketCodes));
        // 调用之前需要判断当前订单是否已经核销成功过。
        List<String> ailiOutTicketInfoLogs = new ArrayList<String>()
        {
            {
                add("4");
            }
        };

        ailiTicketList.removeIf(i -> ailiOutTicketInfoLogs.contains(i.getfTicketCode()));

        System.out.println("===" + JSONObject.toJSONString(ailiTicketList));

        // 筛选出未核销的券信息
        List<TTicketInfoBean> aa = ailiTicketList.stream().filter(o -> !ailiOutTicketInfoLogs.contains(o.getfTicketCode()))
                .collect(Collectors.toList());

        System.out.println(JSONObject.toJSONString(aa));

        for (Iterator<TTicketInfoBean> it = ailiTicketList.iterator(); it.hasNext();)
        {

            TTicketInfoBean aBean = it.next();
            if (ailiOutTicketInfoLogs.contains(aBean.getfTicketCode()))
            {
                it.remove();
            }

        }
        System.out.println(JSONObject.toJSONString(ailiTicketList));
    }
}
