package com.example.yidiantong.util;

import org.apache.commons.text.StringEscapeUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonUtil {

    //将服务器返回的String类型转化为JsonObject类型
    public static JSONObject getJsonObjectFromString(String str) throws JSONException {
        //去除转义字符
        str = StringEscapeUtils.unescapeJava(str);
        //去除前后双引号
        str = str.substring(1, str.length() - 1);
        return new JSONObject(str);
    }
}
