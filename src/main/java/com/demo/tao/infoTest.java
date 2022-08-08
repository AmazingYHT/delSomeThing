package com.demo.tao;

import java.math.BigInteger;

public class infoTest
{
    public static void main(String[] args)
    {
        String startNo = "99";
        Long fLastno = 200L;
        String fStep = "5";
        int i = 1;
        for (String validateCode = startNo.toString(); "1".equals("1") ? 1 < 2
                : Long.valueOf(validateCode)
                        .longValue() < 300; validateCode = (new BigInteger(validateCode).add(new BigInteger(fStep.toString())).toString()))
        {
            //System.out.println(validateCode);
            i++;

            if (i == 50)
            {
                break;
            }
        }
        OrderStatus ost = OrderStatus.TWO;
        System.out.println(ost.getInfo());
    }
    
    
    enum OrderStatus{
        //定义枚举的值
        ZERO(0,"已取消"),ONE(1,"待付款"),TWO(2,"已付款"),TREE(3, "取消");

        private int state;
        private String info;

        //构造方法（枚举的构造方法只允许private类型）
        private OrderStatus(int state, String info){
            this.state = state;
            this.info = info;
        }

        public int getState(){
            return state;
        }

        public String getInfo(){
            return info;
        }
    }
}
