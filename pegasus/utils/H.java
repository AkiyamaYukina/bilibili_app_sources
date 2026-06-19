package com.bilibili.pegasus.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.lib.biliid.api.EnvironmentManager;
import com.bilibili.lib.oaid.MsaHelper;
import java.nio.charset.Charset;
import javax.inject.Singleton;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/utils/H.class */
@Singleton
@StabilityInferred(parameters = 1)
public final class H implements u00.w {
    @NotNull
    public final String getDeviceInfo() {
        String strA;
        JSONObject jSONObject = new JSONObject();
        String imei = EnvironmentManager.getInstance().getImei();
        String str = imei;
        if (imei == null) {
            str = "";
        }
        jSONObject.put("imei", (Object) str);
        String androidId = EnvironmentManager.getInstance().getAndroidId();
        String str2 = androidId;
        if (androidId == null) {
            str2 = "";
        }
        jSONObject.put("androidid", (Object) str2);
        jSONObject.put("oaid", (Object) MsaHelper.getOaid());
        try {
            strA = s.a(jSONObject.toJSONString().getBytes(Charset.forName("UTF-8")));
        } catch (Exception e7) {
            BLog.e("UmengDeviceInfoServiceImpl", "Fail to encrypt id string!!!");
            strA = "";
        }
        return strA;
    }
}
