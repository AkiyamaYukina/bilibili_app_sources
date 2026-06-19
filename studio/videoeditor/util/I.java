package com.bilibili.studio.videoeditor.util;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.bilibili.base.SharedPreferencesHelper;
import java.util.ArrayList;
import java.util.List;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/I.class */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<String> f110202a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f110203b = false;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/I$a.class */
    public class a extends TypeReference<ArrayList<String>> {
    }

    public final void a(Context context) {
        synchronized (this) {
            String strOptString = new SharedPreferencesHelper(context).optString("capture_videos_out", "");
            BLog.e("I", "readFromSp json=" + strOptString);
            try {
            } catch (JSONException e7) {
                e7.printStackTrace();
            }
            if (TextUtils.isEmpty(strOptString)) {
                this.f110203b = true;
            } else {
                this.f110202a = (List) JSON.parseObject(strOptString, new a(), new Feature[0]);
                this.f110203b = true;
            }
        }
    }

    public final void b(Context context) {
        synchronized (this) {
            if (!this.f110203b) {
                throw new IllegalArgumentException("You must call readFromSp before writeToSp");
            }
            String jSONString = JSON.toJSONString(this.f110202a);
            BLog.e("I", "writeToSp json=" + jSONString);
            new SharedPreferencesHelper(context).edit().putString("capture_videos_out", jSONString).apply();
        }
    }
}
