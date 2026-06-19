package com.bilibili.lib.push;

import com.alipay.alipaysecuritysdk.rds.constant.DictionaryKeys;
import com.bilibili.nativelibrary.SignedQuery;
import com.bilibili.okretro.interceptor.DefaultRequestInterceptor;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/y.class */
public class y extends DefaultRequestInterceptor {
    private String a(String str) {
        return Utils.md5(str + C5334b.c().getPushParams().getSecretKey());
    }

    @Override // com.bilibili.okretro.interceptor.DefaultRequestInterceptor
    public void addCommonParam(Map<String, String> map) throws JSONException {
        super.addCommonParam(map);
        map.put(DictionaryKeys.V2_APPKEY, getAppKey());
        JSONObject jSONObjectA = Ue0.k.a(BPushFoundation.getApp());
        if (jSONObjectA != null) {
            map.put("channel", jSONObjectA.toString());
        }
    }

    @Override // com.bilibili.okretro.interceptor.DefaultRequestInterceptor
    public String getAppKey() {
        return C5334b.c().getPushParams().getAppKey();
    }

    @Override // com.bilibili.okretro.interceptor.DefaultRequestInterceptor
    public SignedQuery signQuery(Map<String, String> map) {
        String strRawParams = Utils.rawParams(map);
        return new SignedQuery(strRawParams, a(strRawParams));
    }
}
