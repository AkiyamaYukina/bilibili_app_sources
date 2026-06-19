package com.bilibili.biligame.api.interceptor;

import O4.b;
import android.text.TextUtils;
import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.bilibili.base.BiliContext;
import com.bilibili.biligame.api.call.KeySign;
import com.bilibili.biligame.utils.a;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.biliid.api.BuvidHelper;
import com.bilibili.okretro.interceptor.DefaultRequestInterceptor;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import okhttp3.Request;
import tv.danmaku.bili.ui.main2.W;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/interceptor/BiligameRequestInterceptor.class */
public class BiligameRequestInterceptor extends DefaultRequestInterceptor {
    public static final BiligameRequestInterceptor INSTANCE = new BiligameRequestInterceptor();

    @Override // com.bilibili.okretro.interceptor.DefaultRequestInterceptor
    public void addCommonParam(Map<String, String> map) {
        super.addCommonParam(map);
        map.putAll(commonParam(map));
    }

    @Override // com.bilibili.okretro.interceptor.DefaultRequestInterceptor
    public void addHeader(Request.Builder builder) {
        super.addHeader(builder);
        for (Map.Entry<String, String> entry : commonHeader().entrySet()) {
            builder.header(entry.getKey(), entry.getValue());
        }
    }

    public Map<String, String> commonHeader() {
        return b.c("referer", "https://www.biligame.com");
    }

    public Map<String, String> commonParam(Map<String, String> map) {
        HashMap mapA = W.a("sdk_type", "1", "cur_host", "app");
        mapA.put("request_id", UUID.randomUUID().toString());
        if (map != null && TextUtils.isEmpty(map.get("source_from"))) {
            String str = a.a;
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            mapA.put("source_from", str2);
        }
        mapA.put("client", Constant.SDK_OS);
        String accessKey = BiliAccounts.get(BiliContext.application()).getAccessKey();
        if (!TextUtils.isEmpty(accessKey)) {
            mapA.put(Tm0.a.f24206c, accessKey);
        }
        long jA = com.bilibili.adcommon.utils.a.a();
        if (jA > 0 && map != null && !map.containsKey(KeySign.UID)) {
            mapA.put(KeySign.UID, String.valueOf(jA));
        }
        if (map != null && !map.containsKey("buvid")) {
            String buvid = BuvidHelper.getBuvid();
            if (!TextUtils.isEmpty(buvid)) {
                mapA.put("buvid", buvid);
            }
        }
        return mapA;
    }
}
