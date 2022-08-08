/*
 * Copyright (C), 2002-2017, 苏宁易购电子商务有限公司
 * FileName: qianting.java
 * Author:   17021683
 * Date:     2017年11月15日 下午7:00:31
 * Description: //模块目的、功能描述      
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package com.demo.tao.control.sn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author 17021683
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选） 创建时间：2017年11月15日 下午7:00:31
 *
 */
/*
 * 进图游戏的主界面面板
 */
public class MainPanel {
    private Connection con;

    public int init() throws Throwable {
        try {
            System.out.println("连接数据库");

            String sqldriver = "com.ibm.db2.jcc.DB2Driver";
            Class.forName(sqldriver);// 加载驱动
            String url = "jdbc:db2://10.37.126.200:60006/LOBA_S11";
            String username = "lobauser";// 数据库用户名
            String password = "gohnohzeguri";// 数据库密码
            con = DriverManager.getConnection(url, username, password);// 连接数据库

            System.out.println("连接数据库");

        } catch (ClassNotFoundException e) {
            System.out.println("数据库连接异常！");
            e.printStackTrace();
        }// 加载MySql的驱动类

        return 0;
    }// end of init

    public int action() throws Throwable {

        try {

            System.out.println("预编译");

            String sql = "INSERT INTO lobauser.LOBA_PAY_DELIVERY_COST_BILL_201609 (ID, WAYBILL_NO, BAG_NO, WAYBILL_SITE, BUILD_PACK_SITE, SEND_SITE, SEND_SITE_ATTR, SEND_SITE_COMPANY, SEND_SITE_PROVINCE, SEND_SITE_CITY, SEND_SITE_DISTRICT, SEND_SITE_WERKS, DISPATCH_DISTRIBUTER, DISPATCH_DISTRIBUTER_TYPE, DISPATCH_DISTRIBUTER_ATTR, PDA_SIGN, SIGN_TIME, SIGN_SITE, SIGN_SITE_ATTR, SIGN_SITE_COMPANY, SIGN_SITE_PROVINCE, SIGN_SITE_CITY, SIGN_SITE_DISTRICT, SIGN_SITE_WERKS, PIECES_WEB, PIECES_TIME, WEIGHT, EFFIC_WEIGHT, WEIGHT_UNIT, BUSINESS_TYPE, SEND_CHECK_CODE, SIGN_TYPE, SIGN_DISCOUNT, SEND_PAY, DISPATCH_INCOME, HEAD_PAY, COIN_UNIT, NOPDA_LOSS, SEND_PAY_BASIC_COST, KG_FEE, HEAD_SUBSIDY, SEND_PAY_CONTINUE_COST, SEND_PAY_EXCEED_ADD_COST, SEND_PAY_REMOTE_COST, DISPATCH_DISTRIBUTED_COST, HEAD_YS_TYPE, HEAD_YS_BRANCH_COST, FUND_POOL_SUBSIDY, FUND_POOL_INCOME, INSURANCE, NO_PIECE_LOSS, SALES_WALLET, NO_SAES_WALLET_LOSS, BASIC_COST_LOSS, ESHEET_FLAG, SEND_SINGLE_RETURN_PRICE, KG_SUBSIDY, NEW_OPEND_AREA_SIDY, SPERCIAL_FUND_FEE_NAME, SPERCIAL_FUND_FEE, KG3_FACE_SUBSIDY, ZJSDAT, BILL_NO, ACCOUNT_FLAG, ACCOUNT_DATE, ACCOUNT_NO, CREATE_ID, CREATE_TIME, DEL_FLAG, DEL_ID, DEL_TIME, CLIENT_NAME, CLIENT_NAME_ATTR, DR_USER, SALES_WALLET_SUBSIDY, ACCOUNT_NO_TYPE2, ACCOUNT_NO_TYPE3, ACCOUNT_NO_TYPE4) VALUES (?, ?, '', '', '', ?, '0', ?, '100', '021', '02101', '', 'L025', '02', '1', '1', '2017-08-24', ?, '0', ?, '100', '025', '02501', '', 'KY02590000', '2017-08-24', 10.400, 10.100, 'KG', '', '', '01', 1.000, 333.940, 310.000, 2394.0, 'CNY', 0.000, 4.500, 1.200, 0.300, 304.000, 0.000, 4.040, 20.200, 1.000, 0.000, 0.000, 0.000, 0.040, 0.000, 0.600, 0.000, 0.000, '02', 0.000, 0.000, 0.000, '', 0.000, 0.000, ?, '20170827172153825314', '0', null, null, 'System', '2017-08-27 17:21:53', null, null, null, null, 'TT', ?, '600', null, null, null)";// 执行的SQL语句(含?号)

            PreparedStatement pstmt = con.prepareStatement(sql);

            System.out.println("预编译");

            int m = 10;

            System.out.println("执行" + m + "条SQL");

            long currentTimeMillis = System.currentTimeMillis();

            for (int i = 0; i < m; i++) {

                String id = "<VuserID>" + currentTimeMillis + i + "<random3>";
                // String knote="<Kdian>";
                // pstmt.setString(1,id);
                // pstmt.setString(2,"HI99<random3><random3>");
                // pstmt.setString(3,"<date>");
                // pstmt.setString(4,knote);
                // pstmt.setString(5,knote);
                // pstmt.setString(6,knote);
                String ite = "<random100>";

                pstmt.setString(1, "2017" + id);
                pstmt.setString(2, "99" + id);
                pstmt.setString(3, "KY021990" + ite);
                pstmt.setString(4, "KY021999<random20>");
                pstmt.setString(5, "KY025990<random20>");
                pstmt.setString(6, "KY025999<random20>");
                pstmt.setString(7, "<date>");
                pstmt.setString(8, "9" + ite);
                pstmt.executeUpdate();

            }

            System.out.println("执行" + m + "条SQL");
            con.commit();
            pstmt.close();

        } catch (Exception e) {
            System.out.println("数据库查询异常！");
            e.printStackTrace();
        }// 加载MySql的驱动类

        return 0;
    }

    public int end() throws Throwable {
        try {
            con.close();
        } catch (Exception e) {
            System.out.println("数据库关闭异常！");
            e.printStackTrace();
        }// 加载MySql的驱动类
        return 0;
    }
}
