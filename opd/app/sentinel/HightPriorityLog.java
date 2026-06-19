package com.bilibili.opd.app.sentinel;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.alibaba.fastjson.JSON;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.okretro.ServiceGenerator;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/sentinel/HightPriorityLog.class */
@Keep
public class HightPriorityLog extends Log {
    public HightPriorityLog(Log log) {
        if (log == null || TextUtils.isEmpty(log.mProductKey) || TextUtils.isEmpty(log.mEvent)) {
            return;
        }
        this.mEvent = log.mEvent;
        this.mProductKey = log.mProductKey;
        this.httpCode = log.httpCode;
        putExtras(log.mExtras);
        putExtraJson(log.mJsonExtra);
        subEvent(log.mSubEvent);
    }

    public HightPriorityLog(String str, String str2) {
        this.mProductKey = str;
        this.mEvent = str2;
    }

    public HightPriorityLog httpCode(HashMap<String, String> map) {
        this.httpCode = map;
        return this;
    }

    @Override // com.bilibili.opd.app.sentinel.Log
    public void report() {
        String strEncode;
        An0.a aVar = (An0.a) ServiceGenerator.createService(An0.a.class);
        String strA = zn0.b.a(this);
        Map<String, String> map = this.mExtras;
        if (map != null) {
            boolean z6 = this.mNeedTruncation;
            String jSONString = JSON.toJSONString(map);
            String strB = jSONString;
            if (z6) {
                strB = zn0.b.b(jSONString);
            }
            strEncode = Uri.encode(strB);
        } else {
            strEncode = "";
        }
        aVar.report(this.mProductKey, this.mEvent, strA, strEncode, this.mSubEvent).enqueue(new BiliApiDataCallback());
    }
}
