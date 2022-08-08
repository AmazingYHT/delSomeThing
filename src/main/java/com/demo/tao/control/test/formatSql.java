package com.demo.tao.control.test;

import java.util.Arrays;
import java.util.List;

public class formatSql
{

    public static void main(String[] args)
    {

        String sme = "INSERT INTO `t_sms_templet_info` (`F_PRIMARY_KEY`, `F_ID`, `F_TEMPLET_NAME`, `F_TEMPLET_CONTENT`, `F_MER`, `F_OPERATOR`, `F_OPER_TIME`, `F_TYPE_ID`) VALUES ('F@MER_26', 26, '配送恢复提醒', '亲爱的顾客，尾号[会员尾号]的订单恢复配送申请成功，订单将于[恢复日期]继续配送', 'F@MER', 'F@MER_admin', '20211115000000', 1);";

        String fMer = "LSPNNY\r\n" + "LSYZRJ\r\n" + "LSFYGM\r\n" + "LSHZTXD\r\n" + "LSJSDSF\r\n" + "LSWHST\r\n" + "LSLYJB\r\n" + "LSYALSJ\r\n"
                + "LSSGDM\r\n" + "LSYCAL\r\n" + "LSCQMGC\r\n" + "LSKZ\r\n" + "LSSJ\r\n" + "LSDEV\r\n" + "LSPRO\r\n" + "LSLKD\r\n" + "LSZLJC\r\n"
                + "LSLSUAT\r\n" + "LSJCB\r\n" + "LSLYDF\r\n" + "LSDB\r\n" + "LSYZLKD\r\n" + "LSYAL\r\n" + "LSLKD1\r\n" + "LSCZYBL\r\n"
                + "LSXZHCTS\r\n" + "LSHEBLS\r\n" + "LSSZLY\r\n" + "LSLZCS\r\n" + "LSLLZ\r\n" + "LSNXXRGY\r\n" + "LSBZB\r\n" + "LSZZBH\r\n"
                + "LSUAT\r\n" + "LSCSYY\r\n" + "LSGZTY\r\n" + "LSJZTT\r\n" + "LSNBXHL\r\n" + "LSJNL\r\n" + "LSHSAPHX\r\n" + "LSSJZBG\r\n"
                + "LSYAJJ\r\n" + "LSRRCS\r\n" + "LSLLBR";

        List<String> fMerList = Arrays.asList(fMer.split("\\r\\n"));

        for (String fMers : fMerList)
        {
            if (fMers.equals("LSKZ") || fMers.equals("LSUAT"))
            {
                continue;
            }
            System.out.println(sme.replace("F@MER", fMers));
        }

    }

}
