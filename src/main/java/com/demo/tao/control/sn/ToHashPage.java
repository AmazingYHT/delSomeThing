package com.demo.tao.control.sn;

import java.awt.*;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 * 查询分表分库小工具<br>
 * 〈功能详细描述〉
 *
 * @author 17050410
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public abstract class ToHashPage implements ActionListener {
    JFrame                   frame;

    JButton                  btn[]      = new JButton[12];

    String                   value;

    JLabel                   label;

    JTextField               field;

    JButton                  seach;

    JTable                   table;

    JPanel                   xiaBufen;

    JScrollPane              scrollPane;

    Object[][]               playerInfo = {// 创建表格中的数据
                                        { "", "", "", "", "", "", "", "" } };

    String[]                 Names      = { "分表依据", "100张分表", "50张分表", "32张分表", "16张分表", "8张分表", "16NEW", "32NEW" };

    private static final int NUM0       = 0;

    private static final int NUM1       = 1;

    private static final int NUM2       = 2;

    private static final int NUM3       = 3;

    private static final int NUM4       = 4;

    private static final int NUM8       = 8;

    private static final int NUM16      = 16;

    private static final int NUM24      = 24;

    private static final int NUM_0XFF   = 0xFF;

    String                   filePath   = "";

    void readExcel(String s) {
        filePath = s;
    }

    public static void main(String[] args) {
        readExcel test = new readExcel("C:\\Users\\17021683\\Desktop\\888.xls");

    }

    public ToHashPage() {
        frame = new JFrame("HASH分区");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 关闭gui时关程序
        frame.getContentPane(); // 获得面板内容

        JPanel shangBufen = new JPanel(); // 上半部分的面板
        xiaBufen = new JPanel(); // 下半部分的面板

        label = new JLabel("分表依据：");
        label.setHorizontalAlignment(JLabel.LEFT);

        // 下面编辑上半部分的面板
        field = new JTextField(20); // 20字宽的文本框用于显示(可能要改一下显示字体大小)
        field.setHorizontalAlignment(JTextField.RIGHT); // 文本对齐右边
        field.setEditable(true);

        seach = new JButton("查询");
        seach.addActionListener(this);
        shangBufen.add(label);
        shangBufen.add(field);
        shangBufen.add(seach);
        shangBufen.setLayout(new FlowLayout()); // 两行一列

        frame.add(shangBufen);

        table = new JTable(playerInfo, Names);
        table.setPreferredScrollableViewportSize(new Dimension(650, 100));
        scrollPane = new JScrollPane(table);
        xiaBufen.add(scrollPane);
        frame.add(xiaBufen);
        frame.setLayout(new BorderLayout()); // 顺序排列
        frame.getContentPane().add("North", shangBufen);
        frame.getContentPane().add("South", xiaBufen);

        frame.setSize(700, 250);
        frame.setResizable(false); // 禁止修改窗口大小
        frame.setVisible(true);

    }

    public static enum HashAlgorithm {
        KETAMA_HASH;
        public long hash(byte[] digest, int nTime) {
            long rv = ((long) (digest[NUM3 + nTime * NUM4] & NUM_0XFF) << NUM24) | ((long) (digest[NUM2 + nTime * NUM4] & NUM_0XFF) << NUM16)
                    | ((long) (digest[NUM1 + nTime * NUM4] & NUM_0XFF) << NUM8) | (digest[NUM0 + nTime * NUM4] & NUM_0XFF);

            return rv & 0xffffffffL; /* Truncate to 32-bits */
        }
    }

    public List<String[]> readFileExcel() throws IOException, BiffException {
        List<String[]> list = new ArrayList<String[]>();
        // 创建输入流
        InputStream stream = new FileInputStream(filePath);
        // 获取Excel文件对象
        Workbook rwb = Workbook.getWorkbook(stream);
        // 获取文件的指定工作表 默认的第一个
        Sheet sheet = rwb.getSheet("Sheet4");
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
