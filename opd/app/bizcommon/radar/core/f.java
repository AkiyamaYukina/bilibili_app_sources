package com.bilibili.opd.app.bizcommon.radar.core;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.api.base.Config;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.opd.app.bizcommon.radar.data.RadarReportEvent;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;
import tv.danmaku.android.util.DigitsUtil;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/core/f.class */
@StabilityInferred(parameters = 0)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public RadarReportEvent f74200a;

    public f(String str) {
        String str2;
        String queryParameter;
        JSONObject jSONObject = new JSONObject();
        try {
            String strDecode = Uri.decode(str);
            String str3 = "url2Extra-url:" + strDecode;
            if (Config.isDebuggable()) {
                BLog.d("nov_test", str3 == null ? "null" : str3);
            }
            str2 = "";
            String str4 = str2;
            try {
                Uri uri = Uri.parse(strDecode);
                String queryParameter2 = uri.getQueryParameter("from");
                str2 = queryParameter2 != null ? queryParameter2 : "";
                queryParameter = str2;
                if (str2.length() == 0) {
                    str4 = str2;
                    queryParameter = DigitsUtil.getQueryParameter(uri.getFragment(), "from");
                }
            } catch (Exception e7) {
                queryParameter = str4;
            }
            jSONObject.put(GameCardButton.extraParamSource, queryParameter);
            jSONObject.put("pageUrl", strDecode);
        } catch (Exception e8) {
            BLog.e(e8.getLocalizedMessage());
        }
        this.f74200a = new RadarReportEvent("", null, null, jSONObject, false, 0, null, null, null, false, null, null, 4086, null);
    }
}
