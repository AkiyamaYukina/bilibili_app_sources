package com.bilibili.opd.app.sentinel.report;

import C0.d;
import android.net.Uri;
import android.support.v4.media.session.a;
import android.text.TextUtils;
import androidx.compose.runtime.C4277b;
import com.alibaba.fastjson.JSON;
import com.bilibili.lib.infoeyes.InfoEyesManager;
import com.bilibili.opd.app.sentinel.Log;
import com.bilibili.opd.app.sentinel.Reporter;
import java.util.Map;
import org.json.JSONObject;
import zn0.b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/sentinel/report/InfoEyesReporter.class */
public class InfoEyesReporter implements Reporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f74701a;

    public InfoEyesReporter(boolean z6) {
        this.f74701a = z6;
    }

    public String getErrorMsg(Throwable th) {
        StringBuilder sb = new StringBuilder();
        if (th.getCause() != null) {
            sb.append(th.getCause().getMessage());
        } else {
            sb.append(th.getMessage());
        }
        return sb.toString();
    }

    public String getSubProduct(Log log) {
        String str = log.subProduct;
        String valueByExtJsonAndRemoveElement = str;
        if (TextUtils.isEmpty(str)) {
            valueByExtJsonAndRemoveElement = getValueByExtJsonAndRemoveElement("sub_product", log.mExtras);
        }
        return valueByExtJsonAndRemoveElement;
    }

    public String getTraceIdEnd(Log log) {
        String str = log.traceIdEnd;
        String valueByExtJsonAndRemoveElement = str;
        if (TextUtils.isEmpty(str)) {
            valueByExtJsonAndRemoveElement = getValueByExtJsonAndRemoveElement("traceid_end", log.mExtras);
        }
        return valueByExtJsonAndRemoveElement;
    }

    public String getValueByExtJsonAndRemoveElement(String str, Map<String, String> map) {
        if (map == null || !map.containsKey(str)) {
            return "";
        }
        String str2 = map.get(str);
        map.remove(str);
        return str2;
    }

    @Override // com.bilibili.opd.app.sentinel.Reporter
    public void report(Log log) {
        String string;
        String str = log.mProductKey;
        String strA = a.a(new StringBuilder(), log.createTime, "");
        String str2 = log.mEvent;
        String str3 = log.mSubEvent;
        String binaryString = Integer.toBinaryString(log.mLogType);
        String strA2 = a.a(new StringBuilder(), log.mDuration, "");
        String strB = log.mNeedTruncation ? b.b(log.mMsg) : log.mMsg;
        String str4 = log.mResult;
        String str5 = log.mTraceId;
        String strB2 = log.mNeedTruncation ? b.b(log.mDesc) : log.mDesc;
        String string2 = strB;
        if (log.mTr != null) {
            StringBuilder sbA = d.a(strB, ",");
            sbA.append(getErrorMsg(log.mTr));
            string2 = sbA.toString();
        }
        String traceIdEnd = getTraceIdEnd(log);
        String strA3 = b.a(log);
        String subProduct = getSubProduct(log);
        Map<String, String> map = log.mExtras;
        if (map != null) {
            string = Uri.encode(log.mNeedTruncation ? b.b(JSON.toJSONString(map)) : JSON.toJSONString(map));
        } else {
            JSONObject jSONObject = log.mJsonExtra;
            string = jSONObject != null ? jSONObject.toString() : null;
        }
        if (this.f74701a) {
            JSON.toJSONString(log);
        }
        InfoEyesManager.getInstance().report2(log.isForceReport(), "000738", new String[]{str, strA, str2, str3, binaryString, strA2, string2, str4, string, str5, strB2, C4277b.a(log.mNetwork, "", new StringBuilder()), traceIdEnd, strA3, subProduct});
    }
}
