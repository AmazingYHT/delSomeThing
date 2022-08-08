package com.demo.tao;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App2
{

    public static void main(String[] args)
    {
        // String aString = "{charset=UTF-8,
        // biz_content={\"audit_text\":\"其他:\r\n"
        // +
        // "1.当前标准服务不符合平台规范要求，您提报的地址与标准服务页面上的地址不一致，建议更改为与实际经营地址相符的服务地址后重新提交。\r\n"
        // +
        // "\",\"service_code\":\"2021110821000358301145\",\"audit_status\":\"REJECT\"},
        // utc_timestamp=1636394965801,
        // sign=epEYT5i9r/DUb/DnS9GaAsJFouVNicuzxjCeEHWEziSi8ecKAYt7yxt0hsa5a7UVdOS2bTUFjHpMjUJpD6zp8NOjEUZCsYAebj4k6McV1aX/du7RaIDijp5yvFNGzbZUUPiJs2NTB4MD/W/BNBeym73GvUE5eW37QX9111NitTHvqULR6do21fQKNRGtwU4xN4IiPQCmlbunKBVKachY9cAcdiGGRP/mjH8B+QMoiDKjNShAqj/aeEQis2KKIT6O078ZIiUHGRjH46CBURaf2VnK71pPeBspbDSQ5eXN/h1Vqs1MLUN1zMqE7rqVPe57KzYp5MRqF4zDyr8wSUcvLg==,
        // app_id=2021002145629992, version=1.1, sign_type=RSA2,
        // notify_id=2021110800262164720056205972702726,
        // msg_method=alipay.open.app.service.audit.notify}";
        //
        // Map<String, Object> stringToMap = getValue(aString);
        //
        // System.out.println(stringToMap.get("biz_content"));
        Long phone = 18003500600L;
        for (int i = 0; i < 300; i++)
        {
            System.out.println(phone + i);
        }

    }

    public static Map<String, Object> getValue(String param)
    {
        Map<String, Object> map = new HashMap<>();
        String str = "";
        String key = "";
        Object value = "";
        char[] charList = param.toCharArray();
        boolean valueBegin = false;
        for (int i = 0; i < charList.length; i++)
        {
            char c = charList[i];
            if (c == '{')
            {
                if (valueBegin == true)
                {
                    value = getValue(param.substring(i, param.length()));
                    i = param.indexOf('}', i) + 1;
                    map.put(key, value);
                }
            }
            else if (c == '=')
            {
                valueBegin = true;
                key = str;
                str = "";
            }
            else if (c == ',')
            {
                valueBegin = false;
                value = str;
                str = "";
                map.put(key, value);
            }
            else if (c == '}')
            {
                if (str != "")
                {
                    value = str;
                }
                map.put(key, value);
                return map;
            }
            else if (c != ' ')
            {
                str += c;
            }
        }
        return map;
    }
}
