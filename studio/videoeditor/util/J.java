package com.bilibili.studio.videoeditor.util;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.bilibili.base.SharedPreferencesHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/J.class */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, List<Long>> f110204a = new HashMap();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/J$a.class */
    public class a extends TypeReference<Map<String, List<Long>>> {
    }

    public final void a(long j7, String str) {
        synchronized (this) {
            if (this.f110204a.containsKey(str)) {
                List<Long> list = this.f110204a.get(str);
                if (!list.contains(Long.valueOf(j7))) {
                    list.add(Long.valueOf(j7));
                }
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(j7));
                this.f110204a.put(str, arrayList);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(java.lang.String r4) {
        /*
            r3 = this;
            r0 = r3
            monitor-enter(r0)
            r0 = r3
            java.util.Map<java.lang.String, java.util.List<java.lang.Long>> r0 = r0.f110204a     // Catch: java.lang.Throwable -> L31
            r1 = r4
            boolean r0 = r0.containsKey(r1)     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L35
            r0 = r3
            java.util.Map<java.lang.String, java.util.List<java.lang.Long>> r0 = r0.f110204a     // Catch: java.lang.Throwable -> L31
            r1 = r4
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L31
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L31
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L35
            r0 = r4
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L31
            r5 = r0
            r0 = r5
            if (r0 <= 0) goto L35
            r0 = 1
            r6 = r0
            goto L37
        L31:
            r4 = move-exception
            goto L3b
        L35:
            r0 = 0
            r6 = r0
        L37:
            r0 = r3
            monitor-exit(r0)
            r0 = r6
            return r0
        L3b:
            r0 = r3
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            r0 = r4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.util.J.b(java.lang.String):boolean");
    }

    public final boolean c(String str) {
        synchronized (this) {
            if (this.f110204a.isEmpty()) {
                return false;
            }
            return this.f110204a.containsKey(str);
        }
    }

    public final void d(Context context) {
        synchronized (this) {
            String strOptString = new SharedPreferencesHelper(context).optString("capture_videos", "");
            try {
                if (!TextUtils.isEmpty(strOptString)) {
                    this.f110204a = (Map) JSON.parseObject(strOptString, new a(), new Feature[0]);
                }
            } catch (JSONException e7) {
                e7.printStackTrace();
            }
        }
    }

    public final void e(long j7, String str) {
        synchronized (this) {
            if (this.f110204a.containsKey(str)) {
                List<Long> list = this.f110204a.get(str);
                if (list.contains(Long.valueOf(j7))) {
                    list.remove(Long.valueOf(j7));
                }
            }
        }
    }

    public final void f(Context context) {
        synchronized (this) {
            new SharedPreferencesHelper(context).edit().putString("capture_videos", JSON.toJSONString(this.f110204a)).apply();
        }
    }
}
