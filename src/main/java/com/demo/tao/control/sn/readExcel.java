package com.demo.tao.control.sn;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class readExcel
{
    String filePath = "";

    readExcel(String s)
    {
        filePath = s;
    }

    public static void main(String[] args)
    {
        readExcel test = new readExcel("E:\\KzUser\\LS\\eclipseWorkSpace\\delSomeThing\\111.xls");

        // test.createHashTable("LOBAUSER", "MAPPING_DELIVERY_REFTASKID" + i,
        // "TBS_TAB0_32K", "TBS_IDX_32K",

        // 
        /**
         * int type 1实体列 2.sql 3.sql参数 4.resultMap, int total 列总数, int sheetNum 第几个
         */
        test.createsql(2, 37, 0);

        // test.createTimeTable("LOBAUSER", "LOBA_PAY_DELIVERY_COST_BILL_" +
        // date + i, "TBS_TAB0_32K", "TBS_IDX_32K",

        // test.createHtml();

        //test.formatJson(17,1);

    }

    public void createsql(int type, int total, int sheetNum)
    {
        try
        {
            List<String[]> list = readFileExcel(sheetNum);

            for (int i = 0; i < total; i++)
            {

                String s = list.get(i)[0].toLowerCase();
                String[] w = s.split("_");
                String f = w[0];
                if (w.length > 1)
                {
                    for (int n = 1; n < w.length; n++)
                    {
                        f += w[n].substring(0, 1).toUpperCase() + w[n].substring(1, w[n].length());
                    }
                }
                StringBuffer out = new StringBuffer("");
                switch (type)
                {
                    case 1:
                        if (list.get(i)[2].contains("big"))
                        {
                            out.append("private  Long ");
                        }
                        else if (list.get(i)[2].contains("int"))
                        {
                            out.append("private  Integer ");
                        }
                        else
                        {
                            out.append("private  String ");
                        }

                        out.append("" + f + "");
                        out.append(";//" + list.get(i)[1]);
                        break;
                    case 2:
                        out.append("t1." + list.get(i)[0] + ",");
                        break;
                    case 3:
                        out.append("#{item.");
                        out.append("" + f + "},");
                        break;
                    case 4:
                        out.append("<result column=\"");
                        out.append("" + list.get(i)[0] + "");
                        out.append("\" property=\"");
                        out.append("" + f + "");
                        if (list.get(i)[2].contains("big"))
                        {
                            out.append("\" jdbcType=\"BIGINT\" /> ");
                        }
                        else if (list.get(i)[2].contains("int"))
                        {
                            out.append("\" jdbcType=\"INTEGER\" /> ");
                        }
                        else
                        {
                            out.append("\" jdbcType=\"VARCHAR\" /> ");
                        }
                        break;

                    default:
                        break;
                }
                System.out.println(out.toString());
            }
        }
        catch (BiffException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void createHashTable(String schema, String tablename, String in, String index, String tips, int size)
    {
        try
        {
            List<String[]> list = readFileExcel(0);
            System.out.println("CREATE TABLE \"" + schema + "\".\"" + tablename + "\"(");

            for (int i = 0; i < size; i++)
            {
                String[] w = list.get(i);
                StringBuffer out = new StringBuffer("");
                out.append(w[0] + "");
                out.append("  ");
                out.append("" + w[2]);
                if (i != size - 1)
                {
                    out.append(",");
                }
                System.out.println(out.toString());
            }
            System.out.println(" )");
            System.out.println("IN \"" + in + " \"");
            System.out.println("INDEX IN \"" + index + "\"");
            System.out.println("COMPRESS YES;");
            System.out.println("COMMENT ON TABLE \"" + schema + "\".\"" + tablename + "\" IS '" + tips + "';");
            System.out.println("COMMENT ON LOBAUSER.\"" + tablename + "\"(");
            for (int i = 0; i < size; i++)
            {
                String[] w = list.get(i);
                StringBuffer out = new StringBuffer("");
                out.append("\"" + w[0] + "\"");
                out.append(" IS ");
                out.append("'" + w[1] + "'");
                if (i != size - 1)
                {
                    out.append(",");
                }
                System.out.println(out.toString());
            }
            System.out.println(" );");
            System.out.println("ALTER TABLE \"" + schema + "\".\"" + tablename + "\" ADD CONSTRAINT \"P_Key_1\" PRIMARY KEY (\"ID\");");

        }
        catch (BiffException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void createTimeTable(String schema, String tablename, String in, String index, String tips, int size)
    {
        try
        {
            List<String[]> list = readFileExcel(0);
            System.out.println("CREATE TABLE \"" + schema + "\".\"" + tablename + "\"(");

            for (int i = 0; i < size; i++)
            {
                String[] w = list.get(i);
                StringBuffer out = new StringBuffer("");
                out.append(w[0]);
                // out.append(w[2] + "(");
                out.append(" " + w[2]);
                // out.append(")");
                if (i != size - 1)
                {
                    out.append(",");
                }
                System.out.println(out.toString());
            }
            System.out.println(" )");
            System.out.println("IN \"" + in + " \"");
            System.out.println("INDEX IN \"" + index + "\"");
            System.out.println("COMPRESS YES;");
            System.out.println("COMMENT ON TABLE \"" + schema + "\".\"" + tablename + "\" IS '" + tips + "';");
            System.out.println("COMMENT ON LOBAUSER.\"" + tablename + "\"(");
            for (int i = 0; i < size; i++)
            {
                String[] w = list.get(i);
                StringBuffer out = new StringBuffer("");
                out.append("\"" + w[0] + "\"");
                out.append(" IS ");
                out.append("'" + w[1] + "'");
                if (i != size - 1)
                {
                    out.append(",");
                }
                System.out.println(out.toString());
            }
            System.out.println(" );");
            System.out.println("ALTER TABLE \"" + schema + "\".\"" + tablename + "\" ADD CONSTRAINT \"P_Key_1\" PRIMARY KEY (\"ID\");");

        }
        catch (BiffException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void createHtml()
    {
        try
        {
            List<String[]> list = readFileExcel(0);
            for (int i = 0; i < 71; i++)
            {
                String s = list.get(i)[0].toLowerCase();
                String[] w = s.split("_");
                String f = w[0];
                if (w.length > 1)
                {
                    for (int n = 1; n < w.length; n++)
                    {
                        f += w[n].substring(0, 1).toUpperCase() + w[n].substring(1, w[n].length());
                    }
                }
                StringBuffer out = new StringBuffer("");
                out.append("{field:'");
                out.append(f);
                out.append("',title:'");
                out.append(list.get(i)[1]);
                out.append("',align:'center',width:120},");

                System.out.println(out.toString());
            }
        }
        catch (BiffException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void formatJson(int total, int sheetNum)
    {
        try
        {
            JSONArray jsonArray = new JSONArray();

            List<String[]> list = readFileExcel(sheetNum);

            for (int i = 0; i < total; i++)
            {

                JSONObject jsonObject = new JSONObject();

                jsonObject.put(list.get(i)[0], list.get(i)[1]);
                jsonObject.put(list.get(i)[2], list.get(i)[3]);
                jsonObject.put(list.get(i)[4], list.get(i)[5]);

                jsonArray.add(jsonObject);

            }
            System.out.println(JSONObject.toJSON(jsonArray));

        }
        catch (BiffException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public List<String[]> readFileExcel(int sheetNum) throws IOException, BiffException
    {
        List<String[]> list = new ArrayList<String[]>();
        // 创建输入流
        InputStream stream = new FileInputStream(filePath);
        // 获取Excel文件对象
        Workbook rwb = Workbook.getWorkbook(stream);
        // 获取文件的指定工作表 默认的第一个
        Sheet sheet = rwb.getSheet(sheetNum);
        // 行数(表头的目录不需要，从1开始)
        for (int i = 0; i < sheet.getRows(); i++)
        {
            // 创建一个数组 用来存储每一列的值 ֵ
            String[] str = new String[sheet.getColumns()];
            Cell cell = null;
            // 列数
            for (int j = 0; j < sheet.getColumns(); j++)
            {
                // 获取第i行，第j列的值 ֵ
                cell = sheet.getCell(j, i);
                str[j] = cell.getContents();
            }
            // 把刚获取的列存入list
            list.add(str);
        }

        return list;
    }
}
