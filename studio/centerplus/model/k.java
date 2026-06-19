package com.bilibili.studio.centerplus.model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.studio.config.UpperFawkesDeviceDecision;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/model/k.class */
public final class k {
    public static boolean a() {
        String str = (String) UpperFawkesDeviceDecision.f105502r.getValue();
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            JSONArray array = JSON.parseArray(str);
            int size = array.size();
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (int i7 = 0; i7 < size; i7++) {
                JSONObject jSONObject = array.getJSONObject(i7);
                Long l7 = (Long) jSONObject.get("start_time");
                Long l8 = (Long) jSONObject.get("end_time");
                if (l7 != null && l8 != null) {
                    long jLongValue = l7.longValue();
                    if (jCurrentTimeMillis < l8.longValue() && jLongValue <= jCurrentTimeMillis) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e7) {
            e7.printStackTrace();
            return false;
        }
    }
}
