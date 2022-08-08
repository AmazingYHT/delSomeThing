package com.demo.tao.control.sn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class PGSQLconn {
    /** 设置参数 **/
    private static Connection conn = null;

    private static Statement  stmt = null;

    private static ResultSet  rs   = null;

    /** 构造方法，链接数据库 **/
    public PGSQLconn() {
        try {
            System.out.println("正在连接数据库..........");
            Class.forName("org.postgresql.Driver");// 加载mysql驱动程序类
            String url = "jdbc:postgresql://10.27.201.34:5432/lpssdbpg";// url为连接字符串
            String user = "lpssdevusr";// 数据库用户名
            String pwd = "mRDVj7o42a1F";// 数据库密码
            conn = (Connection) DriverManager.getConnection(url, user, pwd);
            System.out.println("数据库连接成功！！！");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws SQLException {
        PGSQLconn a = new PGSQLconn();// 实例化对象，作用是调用构造方法
        a.getClass();// 无意义
        /** 查询语句 **/

        String hql = "INSERT INTO LOBA_ALLOT_COST_BILL_201401 (ID, BILL_NO, ZLYXT, WAYBILL_NO, SCAN_TYPE, SCAN_DATE, INPUT_ORG, INPUT_ORG_ATTR, INPUT_ORG_TYPE, INPUT_ORG_COMPANY, SETTLEMENT_FALSE_FLAG, TRANSFER_COST, OPERAT_COST, SCAN_COST, PACKAGE_COST, COIN_UNIT, WEIGHT, WEIGHT_UNIT, LIGHT_CARGO_WEIGHT, LIGHT_CARGO_VOLUME_WEIGHT, PRICE_WEIGHT, PRICE_WEIGHT_UNIT, GOODS_TYPE, TRANS_TYPE, BAG_NO, BAG_FEN_COMPANY, SEND_BAG_NAO, SEND_BAGNO_DEST, SEND_SITE, SEND_SITE_ATTR, SEND_SITE_COMPANY, SEND_SITE_CITY, SEND_SITE_PROVINCE, SITE, SITE_TYPE, SITE_ATTR, SITE_COMPANY, SITE_CITY, SITE_PROVINCE, NEXT_SITE, DEST_SITE, DEST_SITE_CITY, DEST_SITE_PROVINCE, DISPATCH_SITE, DISPATCH_SITE_ATTR, DISPATCH_SITE_COMPANY, WAYBILL_OFFICE, WAYBILL_BRANCH, DEDUCT_WEB, DEDUCT_FLAG, CREATE_ID, CREATE_TIME, ACCOUNT_FLAG) VALUES (?, ?, 'LDCS', ?, '03', '2017-11-13', ?, '0', '02', '6610', '', 1.0, 1.0, 1.0, 1.0, 'CNY', '42.300', 'KG', '4.300', '5.300', 42.300, 'KG', '0', '01', '', '', '', null, 'K510070202', '1', '6620', '510', '100', 'K000010000', '01', '0', 'K510080601', '510', '100', 'LS90', 'LS90', '南京市', '江苏省', 'K510070202', '510', '100', 'K510070202', '6630', null, null, 'SYSADMIN', CURRENT TIMESTAMP, '0')";
        String sql = "INSERT INTO LOBA_ALLOT_COST_ACCOUNT_201401 (ID,CREATE_TIME) VALUES (?,CURRENT TIMESTAMP)";//
        String sql2 = "update tb1 set c1=?";
        // 执行的SQL语句(含?号)
        stmt = (Statement) conn.createStatement();
        PreparedStatement stmt = conn.prepareStatement(sql2);

        long currentTimeMillis = System.currentTimeMillis();

        // for (int i = 0; i < 100000; i++) {
        // String id = "20171118" + i;
        stmt.setString(1, "222");

        // stmt.setString(2, currentTimeMillis + i + "");
        // if (i % 4 == 0) {
        // stmt.setString(3, "189999990416");
        // } else {
        // stmt.setString(3, "189999990418");
        // }
        // if (i % 2 == 0) {
        // stmt.setString(4, "K001000000");
        // } else {
        // stmt.setString(4, "K001000001");
        // }
        int result = stmt.executeUpdate();
        System.out.println(result);
        // System.out.println(result);
        // }

        // stmt.execute(sql);// 执行select语句用executeQuery()方法，执行insert、update、delete语句用executeUpdate()方法。
        // int result = stmt.executeUpdate(sql);// executeUpdate语句会返回一个受影响的行数，如果返回-1就没有成功
        // rs.close();// 后定义，先关闭
        stmt.close();
        conn.close();// 先定义，后关闭
    }
}
