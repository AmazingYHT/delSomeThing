package com.demo.tao.control.sn;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class readPgExcel {
    String filePath = "";

    readPgExcel(String s) {
        filePath = s;
    }

    public static void main(String[] args) {
        readPgExcel test = new readPgExcel("C:\\Users\\17021683\\Desktop\\123.xls");
        // -价格明细
        // test.createTable("lobauser", "loba_pay_dispatch_scale_detail", 10, "天天-有偿派费收派量表_明细");

        test.createsql();

        // for (int i = 2014; i <= 2021; i++) {
        // for (int j = 1; j <= 12; j++) {
        // String tmp = "";
        // if (j < 10) {
        // tmp = "0" + j;
        // } else {
        // tmp = "" + j;
        // }
        // System.out.println("\r");
        // test.createTimeTable("LOBAUSER", "LOBA_DWMS_OUT_IW_BILL_HEAD_" + i + tmp, "TBS_SSA_32K", "TBS_IDX_32K",
        // "对外收入-仓库出入库计费抬头", 18);
        // }
        // }

        /**
         * 增加字段
         */
        // for (int i = 2014; i <= 2021; i++) {
        // for (int j = 1; j <= 12; j++) {
        // String tmp = "";
        // if (j < 10) {
        // tmp = "0" + j;
        // } else {
        // tmp = "" + j;
        // }
        // test.addColumnTimeTable("LOBAUSER", "LOBA_BIZ_INOUT_WAREHOUSE_" + i + tmp, 1);
        // System.out.println("");
        // }
        // }
        //
        // for (int i = 2014; i <= 2021; i++) {
        // for (int j = 1; j <= 12; j++) {
        // String tmp = "";
        // if (j < 10) {
        // tmp = "0" + j;
        // } else {
        // tmp = "" + j;
        // }
        // for (int j = 0; j < 16; j++) {
        // test.dropColumnTimeTable("LOBAUSER", "LOBA_DWMS_OUT_IW_WORK_DETAIL_" + i + tmp, 3);
        // System.out.println("");
        // // }
        // }
        // }

        // String date = "20210";
        // int j = 10;
        // for (int i = 1; i < 13; i++) {
        // System.out.println("");
        // if (j == i) {
        // date = "2021";
        // }
        // test.createTimeTable("LOBAUSER", "MAPPING_DFJF_ZJSDATE_" + date + i, "TBS_TAB0_32K", "TBS_IDX_32K",
        // "到付件计费-时间映射表-对账", 10);
        // }

        // test.createHtml();

        // for (int i = 2021; i > 2013; i--) {
        // for (int j = 12; j > 0; j--) {
        // String tmp = "";
        // if (j < 10) {
        // tmp = "0" + j;
        // } else {
        // tmp = "" + j;
        // }
        // test.createIndex("LOBAUSER", "LOBA_DWMS_OUT_IW_BILL_HEAD_" + Integer.valueOf(i + tmp), 1);
        // }
        // }

        // for (int i = 0; i < 16; i++) {
        // test.createIndex("LOBAUSER", "LOBA_DWMS_OUT_IW_BILL_HEAD" + i, 1);
        // }

        // test.deleteTimeData("LOBAUSER", "LOBA_SP_COST_BILL_DETAIL_201711", 4976);

        // test.deleteHashData("LOBAUSER", "LOBA_SP_COST_HEAD_DEAL", 36816);

    }

    public void createsql() {
        try {
            List<String[]> list = readFileExcel();

            for (int i = 0; i < 9; i++) {

                String s = list.get(i)[0].toLowerCase();
                String[] w = s.split("_");
                String f = w[0];
                if (w.length > 1) {
                    for (int n = 1; n < w.length; n++) {
                        f += w[n].substring(0, 1).toUpperCase() + w[n].substring(1, w[n].length());
                    }
                }

                StringBuffer out = new StringBuffer("");
                // out.append("private  String ");
                // out.append(f + ";");
                // out.append("//" + list.get(i)[2]);

                // out.append(list.get(i)[0] + " AS");
                // out.append(" \"" + f + "\",");

                out.append(list.get(i)[0] + "=");
                out.append(":" + f + ",");

                System.out.println(out.toString());
            }
        } catch (BiffException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createTable(String schema, String tablename, int size, String comment) {
        try {
            List<String[]> list = readFileExcel();
            System.out.println("CREATE TABLE IF NOT EXISTS \"" + schema + "\".\"" + tablename + "\"(");

            for (int i = 0; i < size; i++) {
                String[] w = list.get(i);
                StringBuffer out = new StringBuffer("");
                out.append("\"" + w[0].toLowerCase() + "\"");
                out.append("  ");
                out.append("" + w[1]);
                // if (i == 0) {
                // if (!EmptyUtil.isEmpty(w[3])) {
                // out.append("(" + w[3] + ") NOT NULL");
                // }
                // } else {
                // if (!EmptyUtil.isEmpty(w[3])) {
                // out.append("(" + w[3] + ")");
                // }
                // }
                if (i != size) {
                    out.append(",");
                }
                System.out.println(out.toString());
            }
            System.out.println("PRIMARY KEY(\"id\")");
            System.out.println(" );");
            System.out.println("COMMENT ON TABLE \"" + schema + "\".\"" + tablename + "\" IS '" + comment + "';");
            for (int i = 0; i < size; i++) {
                String[] w = list.get(i);
                StringBuffer out = new StringBuffer("");
                out.append("COMMENT ON COLUMN \"" + schema + "\".\"" + tablename + "\".");
                out.append("\"" + w[0].toLowerCase() + "\"");
                out.append(" IS ");
                out.append("'" + w[2] + "'");
                if (i != size) {
                    out.append(";");
                }
                System.out.println(out.toString());
            }

        } catch (BiffException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createTimeTable(String schema, String tablename, String in, String index, String tips, int size) {
        try {
            List<String[]> list = readFileExcel();
            System.out.println("CREATE TABLE \"" + schema + "\".\"" + tablename + "\"(");

            for (int i = 0; i < size; i++) {
                String[] w = list.get(i);
                StringBuffer out = new StringBuffer("");
                out.append(w[0]);
                // out.append(w[2] + "(");
                out.append(" " + w[1]);
                // out.append(")");
                if (i != size - 1) {
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
            for (int i = 0; i < size; i++) {
                String[] w = list.get(i);
                StringBuffer out = new StringBuffer("");
                out.append("\"" + w[0] + "\"");
                out.append(" IS ");
                out.append("'" + w[2] + "'");
                if (i != size - 1) {
                    out.append(",");
                }
                System.out.println(out.toString());
            }
            System.out.println(" );");
            System.out.println("ALTER TABLE \"" + schema + "\".\"" + tablename + "\" ADD CONSTRAINT \"P_Key_1\" PRIMARY KEY (\"ID\");");

        } catch (BiffException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addColumnTimeTable(String schema, String tablename, int size) {
        try {
            List<String[]> list = readFileExcel();

            for (int i = 0; i < size; i++) {
                String[] w = list.get(i);
                StringBuffer out = new StringBuffer("");
                out.append("ALTER TABLE " + schema + "." + tablename + " ADD COLUMN");
                out.append(" " + w[0]);
                if (i == 0) {
                    out.append(" " + w[1] + ";");
                } else {
                    out.append(" " + w[1] + ";");
                }
                System.out.print(out.toString());
            }
            System.out.println("");
            for (int i = 0; i < size; i++) {
                String[] w = list.get(i);
                StringBuffer out = new StringBuffer("");
                out.append("COMMENT ON " + schema + "." + tablename + "(\"" + w[0] + "\"");
                out.append(" IS ");
                out.append("'" + w[2] + "');");
                System.out.println(out.toString());
            }

        } catch (BiffException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void dropColumnTimeTable(String schema, String tablename, int size) {
        try {
            List<String[]> list = readFileExcel();

            StringBuffer out = new StringBuffer("");
            for (int i = 0; i < size; i++) {
                String[] w = list.get(i);
                out.append("ALTER TABLE " + schema + "." + tablename + " drop COLUMN");
                out.append(" " + w[0] + ";");
                // out.append(" " + w[0] + " SET DATA TYPE");
                // out.append(" " + w[1] + ";");
                out.append("\r\n");
            }
            out.append("REORG TABLE " + schema + ".");
            out.append(tablename + ";");
            System.out.println(out.toString());

        } catch (BiffException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createHtml() {
        try {
            List<String[]> list = readFileExcel();
            for (int i = 0; i < 54; i++) {
                String s = list.get(i)[0].toLowerCase();
                String[] w = s.split("_");
                String f = w[0];
                if (w.length > 1) {
                    for (int n = 1; n < w.length; n++) {
                        f += w[n].substring(0, 1).toUpperCase() + w[n].substring(1, w[n].length());
                    }
                }
                StringBuffer out = new StringBuffer("");
                // out.append("{field:'");
                // out.append(f);
                // out.append("',title:'");
                // out.append(list.get(i)[2]);
                // out.append("',align:'center',width:120},");

                out.append("<th data-options=\"field:'");
                out.append(f);
                out.append("',width:120,align:'center'\">");
                out.append(list.get(i)[1]);
                out.append("</th>");

                System.out.println(out.toString());
            }
        } catch (BiffException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createIndex(String schema, String tablename, int size) {
        try {
            List<String[]> list = readFileExcel();
            System.out.print("CREATE INDEX " + schema + "." + "INX_BIZ_" + tablename + "_");
            for (int i = 0; i < size; i++) {
                String[] w = list.get(i);
                StringBuffer out = new StringBuffer("");
                out.append(w[0]);
                if (i < size - 1) {
                    out.append("_");
                }
                System.out.print(out.toString());
            }
            System.out.print(" ON " + schema + "." + tablename + "(");
            for (int i = 0; i < size; i++) {
                String[] w = list.get(i);
                StringBuffer out = new StringBuffer();
                out.append(w[0] + " ASC");
                if (i < size - 1) {
                    out.append(",");
                }
                System.out.print(out.toString());
            }
            System.out.println(");");

        } catch (BiffException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteTimeData(String schema, String tablename, int size) {
        try {
            List<String[]> list = readFileExcel();
            for (int i = 0; i < size; i++) {
                StringBuffer out = new StringBuffer();
                System.out.print("DELETE FROM " + schema + "." + tablename + " ");
                String[] w = list.get(i);
                out.append("WHERE ZYCB_NO =" + "'" + w[0] + "'");
                System.out.println(out.toString() + ";");

            }

        } catch (BiffException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String[]> readFileExcel() throws IOException, BiffException {
        List<String[]> list = new ArrayList<String[]>();
        // 创建输入流
        InputStream stream = new FileInputStream(filePath);
        // 获取Excel文件对象
        Workbook rwb = Workbook.getWorkbook(stream);
        // 获取文件的指定工作表 默认的第一个
        Sheet sheet = rwb.getSheet("Sheet3");
        // 行数(表头的目录不需要，从1开始)
        for (int i = 0; i < sheet.getRows(); i++) {
            // 创建一个数组 用来存储每一列的值 ֵ
            String[] str = new String[sheet.getColumns()];
            Cell cell = null;
            // 列数
            for (int j = 0; j < sheet.getColumns(); j++) {
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
