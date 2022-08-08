package com.demo.tao.control.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.alibaba.fastjson.JSONObject;
import com.demo.tao.bean.Student;
import com.demo.tao.bean.UnifiedPayUsePayResult;

public class test
{
    public static void main(String[] args)
    {
        List<UnifiedPayUsePayResult> resultList = new ArrayList<UnifiedPayUsePayResult>();
        List<UnifiedPayUsePayResult> resultList1 = new ArrayList<UnifiedPayUsePayResult>();
        UnifiedPayUsePayResult aPayResult = new UnifiedPayUsePayResult();
        aPayResult.setPayMoney(10);
        aPayResult.setUseType("1");
        aPayResult.setPayType("1");
        resultList.add(aPayResult);
        UnifiedPayUsePayResult aPayResult1 = new UnifiedPayUsePayResult();
        aPayResult1.setPayMoney(50);
        aPayResult1.setUseType("2");
        aPayResult1.setPayType("5");
        resultList.add(aPayResult1);
        UnifiedPayUsePayResult aPayResult2 = new UnifiedPayUsePayResult();
        aPayResult2.setPayMoney(50);
        aPayResult2.setUseType("1");
        aPayResult2.setPayType("2");
        resultList.add(aPayResult2);

        // 1.对返回金额进行排序
        if (null != resultList)
        {
            System.out.println(JSONObject.toJSONString(resultList));

            resultList1 = resultList.stream().filter(i -> "5".equals(i.getPayType()) || "7".equals(i.getPayType())).collect(Collectors.toList());

            resultList = resultList.stream().filter(i -> "5".equals(i.getPayType()) || "7".equals(i.getPayType()))
                    .sorted(Comparator.comparing(UnifiedPayUsePayResult::getPayMoney).reversed().thenComparing(UnifiedPayUsePayResult::getUseType))
                    .collect(Collectors.toList());
            // resultList.stream().sorted(Comparator.comparing(UnifiedPayUsePayResult::getPayMoney).reversed()).collect(Collectors.toList());
        }

        System.out.println(JSONObject.toJSONString(resultList1));
        System.out.println(JSONObject.toJSONString(resultList));

        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Mahesh", 12));
        list.add(new Student(2, "Suresh", 15));
        list.add(new Student(1, "Nilesh", 15));

        /*
         * System.out.println("---Natural Sorting by Name---"); List<Student>
         * slist = list.stream().sorted().collect(Collectors.toList());
         * slist.forEach(e -> System.out.println("Id:" + e.getId() + ", Name: "
         * + e.getName() + ", Age:" + e.getAge()));
         */

        /*
         * System.out.println("---Natural Sorting by Name in reverse order---");
         * slist =
         * list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.
         * toList()); slist.forEach(e -> System.out.println("Id:" + e.getId() +
         * ", Name: " + e.getName() + ", Age:" + e.getAge()));
         */

        /*
         * System.out.println("---Sorting using Comparator by Age---"); slist =
         * list.stream().sorted(Comparator.comparing(Student::getAge)).collect(
         * Collectors.toList()); slist.forEach(e -> System.out.println("Id:" +
         * e.getId() + ", Name: " + e.getName() + ", Age:" + e.getAge()));
         */

        System.out.println("---Sorting using Comparator by Age with reverse order---");
        list = list.stream().sorted(Comparator.comparing(Student::getAge).reversed().thenComparing(Student::getId)).collect(Collectors.toList());
        System.out.println(JSONObject.toJSONString(list));

    }
}
