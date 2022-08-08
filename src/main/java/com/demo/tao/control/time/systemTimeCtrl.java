package com.demo.tao.control.time;

public class systemTimeCtrl implements Runnable
{
    public static void main(String[] args)
    {

        /*
         * List<MemberDBMarketingInfoBean> memberDBMarketingInfoBeanList = new
         * ArrayList<MemberDBMarketingInfoBean>(); List<CusInfoBean> cusCodeList
         * = new ArrayList<CusInfoBean>(); CusInfoBean a1 = new CusInfoBean();
         * a1.setfCusCode("1"); cusCodeList.add(a1); CusInfoBean a2 = new
         * CusInfoBean(); a2.setfCusCode("2"); cusCodeList.add(a2); CusInfoBean
         * a3 = new CusInfoBean(); a3.setfCusCode("3"); cusCodeList.add(a3);
         * CusInfoBean a4 = new CusInfoBean(); a4.setfCusCode("4");
         * cusCodeList.add(a4); CusInfoBean a5 = new CusInfoBean();
         * a5.setfCusCode("5"); cusCodeList.add(a5); CusInfoBean a6 = new
         * CusInfoBean(); a6.setfCusCode("6"); cusCodeList.add(a6);
         * List<CusInfoBean> cusCodeList2SendOneTime = new LinkedList<>(); int
         * step = 2; MemberDBMarketingInfoBean memberDBMarketingInfoBean = null;
         * for (int i = 0; i < cusCodeList.size(); i++) {
         * cusCodeList2SendOneTime.add(cusCodeList.get(i)); if (i != 0 && (i %
         * (step - 1) == 0)) { memberDBMarketingInfoBean = new
         * MemberDBMarketingInfoBean(); memberDBMarketingInfoBean.setStep(step);
         * memberDBMarketingInfoBean.setCusInfoList(cusCodeList2SendOneTime);
         * memberDBMarketingInfoBean.setfMarketId("");
         * memberDBMarketingInfoBean.setfMer(null);
         * memberDBMarketingInfoBean.setfShopId(null);
         * memberDBMarketingInfoBean.setfShopName(null);
         * memberDBMarketingInfoBean.setfOprtCode(null);
         * memberDBMarketingInfoBean.setfMarketExecuteId(null);
         * memberDBMarketingInfoBeanList.add(memberDBMarketingInfoBean);
         * cusCodeList2SendOneTime = new ArrayList<>(); } }
         */
        Long aLong = 18951802241L;
        for (int i = 0; i < 250; i++)
        {
            System.out.println(aLong + i);
        }

    }

    @Override
    public void run()
    {
        System.out.println("666666");

    }
}
