package com.demo.tao.control.sn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tps {
    public static void main(String[] args) {
        Tps tps = new Tps();
        try {// 8300064
            tps.bc("2018-06-27 14:29:32", "2018-06-27 14:41:00", 570738);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    // 1142959
    // 572221
    /**
     * 有偿派费 耗时：28800m TPS:694 有偿 耗时：8428m TPS:601 5070092
     * 
     * 称重费 耗时：124m TPS:1769 219363 CPU 15% 分拨费 耗时：528m TPS:389 205758 CPU 5% 快递费 耗时：2610m TPS:1915
     * 
     */

    protected void bc(String start, String end, Integer total) throws ParseException {
        SimpleDateFormat SDF1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date startInt = SDF1.parse(start);
        Date endInt = SDF1.parse(end);
        long between = (endInt.getTime() - startInt.getTime()) / 1000;

        System.out.println("耗时：" + between + "m");
        System.out.println("TPS:" + (total / between));
    }
}
