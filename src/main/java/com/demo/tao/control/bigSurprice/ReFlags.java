package com.demo.tao.control.bigSurprice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReFlags
{
    public static void main(String[] args)
    {

//        Pattern p = Pattern.compile("(<td align=\"center\">\\d{4}-\\d{2}(-\\d{2})?</td>)\r\n(<td align=\"center\">\\d{7}?</td>)",
//                Pattern.DOTALL | Pattern.MULTILINE);
        String regexN ="<td align=\"center\">\\d{4}-\\d{2}(-\\d{2})+?</td>\r\n" + 
                       "<td align=\"center\">\\d{7}?</td>\r\n"+ 
                       "<td align=\"center\" style=\"padding-left:10px;\">[\\s\\S]+?</em></td>";
        Pattern p = Pattern.compile(regexN,
                Pattern.DOTALL | Pattern.MULTILINE);
        /*
         * 使用Pattern.CASE_INSENSITIVE（大小写不敏感的匹配）和Pattern.MULTILINE（多行模式）标记，
         * 忽略大小写地匹配所有以java开头的行
         */

        Matcher m = p.matcher("<tr>\r\n" + "          <td align=\"center\">2022-01-06</td>\r\n" + "          <td align=\"center\">2022003</td>\r\n"
                + "          <td align=\"center\" style=\"padding-left:10px;\">\r\n" + "          \r\n" + "          <em class=\"rr\">02</em>\r\n"
                + "          \r\n" + "          <em class=\"rr\">05</em>\r\n" + "          \r\n" + "          <em class=\"rr\">16</em>\r\n"
                + "          \r\n" + "          <em class=\"rr\">17</em>\r\n" + "          \r\n" + "          <em class=\"rr\">18</em>\r\n"
                + "          \r\n" + "          <em class=\"rr\">30</em>\r\n" + "                    \r\n" + "          <em>06</em></td>\r\n"
                + "          <td><strong>410,382,612</strong></td>\r\n" + "          <td align=\"left\" style=\"color:#999;\"><strong>7</strong>\r\n"
                + "          \r\n" + "          </td>\r\n" + "          <td align=\"center\"><strong class=\"rc\">181</strong></td>\r\n"
                + "          <td align=\"center\">\r\n"
                + "          <a href=\"http://www.zhcw.com/ssq/kjgg/\" target=\"_blank\"><img src=\"http://images.zhcw.com/zhcw2010/kaijiang/zhcw/ssqpd_42.jpg\" width=\"16\" height=\"16\" align=\"absmiddle\" title=\"详细信息\"/></a>\r\n"
                + "          <a href=\"http://www.zhcw.com/video/kaijiangshipin/\" target=\"_blank\"><img src=\"http://images.zhcw.com/zhcw2010/kaijiang/zhcw/ssqpd_43.jpg\" width=\"16\" height=\"16\" align=\"absmiddle\" title=\"开奖视频\"/></a>\r\n"
                + "          </td>\r\n" + "        </tr>");
        while (m.find())
        {
            System.out.println(m.group());// 输出已匹配的部分
        }

        String html = "<span color='red' style='display:none;'>颜色\r\n是红的</span>";
        Pattern patt = Pattern.compile("(<span.*?>)([\\s\\S]+?)(</span>)", Pattern.DOTALL);
        Matcher matc = patt.matcher(html);
        String startStr = "";
        String htmlStr = "";
        String endStr = "";
        while (matc.find())
        {
            startStr = matc.group(1);
            htmlStr = matc.group(2);
            endStr = matc.group(3);
        }
        // System.out.println(startStr);
        // System.out.println(htmlStr);
        // System.out.println(endStr);
    }
}
