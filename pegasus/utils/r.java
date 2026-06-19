package com.bilibili.pegasus.utils;

import android.os.SystemClock;
import com.bilibili.droid.StringUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import tv.danmaku.android.log.BLog;
import tv.danmaku.android.util.AppInfo;
import tv.danmaku.android.util.InstalledAppsUtils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/utils/r.class */
public final /* synthetic */ class r implements Callable {
    @Override // java.util.concurrent.Callable
    public final Object call() {
        List installedApps;
        String str;
        F fA = F.a();
        System.currentTimeMillis();
        fA.getClass();
        SystemClock.elapsedRealtime();
        JSONArray jSONArray = new JSONArray();
        try {
            installedApps = InstalledAppsUtils.getInstalledApps();
        } catch (NullPointerException e7) {
            BLog.w(e7.getMessage(), e7);
            installedApps = null;
        }
        if (installedApps != null && !installedApps.isEmpty()) {
            F fA2 = F.a();
            installedApps.size();
            fA2.getClass();
            int size = installedApps.size();
            for (int i7 = 0; i7 < size; i7++) {
                AppInfo appInfo = (AppInfo) installedApps.get(i7);
                if ((appInfo.flags & 1) == 0) {
                    try {
                        String str2 = appInfo.packageName;
                        if (StringUtil.isNotBlank(str2) && !((ArrayList) s.f78886a).contains(str2)) {
                            jSONArray.put(str2);
                        }
                        if (jSONArray.length() >= 100) {
                            break;
                        }
                    } catch (Exception e8) {
                    }
                }
            }
        }
        if (jSONArray.length() != 0) {
            jSONArray.length();
        }
        try {
            F fA3 = F.a();
            jSONArray.length();
            fA3.getClass();
            String strA = s.a(jSONArray.toString().getBytes("UTF-8"));
            while (true) {
                str = strA;
                if (strA.length() <= 262144) {
                    break;
                }
                if (jSONArray.length() > 0) {
                    jSONArray.remove(0);
                }
                strA = s.a(jSONArray.toString().getBytes("UTF-8"));
            }
        } catch (Exception e9) {
            BLog.e("InstalledAppListUtil", e9);
            str = "";
        }
        SystemClock.elapsedRealtime();
        return str;
    }
}
