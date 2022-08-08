package com.demo.tao.control.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.demo.tao.bean.UserCollecting;

public class CollectingAndThenCtrl
{

    public static void main(String[] args)
    {
        // 数据准备
        UserCollecting user1 = new UserCollecting(1, "hangman", 100d);
        UserCollecting user2 = new UserCollecting(1, "list", 200d);
        UserCollecting user3 = new UserCollecting(2, "wing", 200d);
        UserCollecting user4 = new UserCollecting(2, "zeal", 100d);
        UserCollecting user5 = new UserCollecting(3, "tuba", 300d);
        List<UserCollecting> userList = new ArrayList<>();
        userList.add(user1);
         userList.add(user2);
         userList.add(user3);
         userList.add(user4);
         userList.add(user5);
        String outBizNo = userList.stream().map(o -> String.valueOf(o.getUserId())).collect(Collectors.joining(","));
        JSONObject aliTicketJson = new JSONObject();
        aliTicketJson.put("operType", "1");
        JSONObject aliTicketActivityInfoBean = new JSONObject();
        aliTicketActivityInfoBean.put("fStock", -1);
        aliTicketActivityInfoBean.put("fMer", "LSSC");
        aliTicketActivityInfoBean.put("outBizNo", outBizNo);

        aliTicketJson.put("aliTicketActivityInfoBean", aliTicketActivityInfoBean);
        //System.out.println(JSON.toJSONString(aliTicketJson));

       System.out.println(userList.stream().anyMatch(i->i.getUserName().equals("wing")));
        
    }

}
