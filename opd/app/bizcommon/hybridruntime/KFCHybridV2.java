package com.bilibili.opd.app.bizcommon.hybridruntime;

import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import vm0.C8834a;
import vm0.C8836c;
import vm0.d;
import xm0.c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/KFCHybridV2.class */
public class KFCHybridV2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<String> f73561a = new ArrayList();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/KFCHybridV2$Configuration.class */
    public static class Configuration {
        public static final String ABILITY_DOMAIN = "ability";
        public static final String BASE_NATIVEACTIONS_NAMESPACE = "bilikfc";
        public static final String BLE_DOMAIN = "mall";
        public static final String MALL_DOWNLOAD_DOMAIN = "download";
        public static final String MALL_LIVE_DOMAIN = "malllive";
        public static final String ROUTER_DOMAIN = "router";
        public static final String SYSTEM_DOMAIN = "system";
        public static final String UI_DOMAIN = "ui";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f73562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<String, C8834a> f73563b = new HashMap();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, vm0.d, xm0.v] */
        /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, vm0.d, xm0.f] */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, vm0.d] */
        /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, vm0.d] */
        /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, vm0.d] */
        /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, vm0.d] */
        public Configuration() {
            C8834a c8834a = new C8834a();
            c8834a.a(ROUTER_DOMAIN, new Object());
            ?? obj = new Object();
            obj.f129367a = 684;
            c8834a.a(SYSTEM_DOMAIN, obj);
            ?? obj2 = new Object();
            ArrayList arrayList = new ArrayList();
            obj2.f129317a = arrayList;
            arrayList.add("shareBlindBoxResult");
            arrayList.add("webviewApmReport");
            arrayList.add("getWebviewBaseInfo");
            arrayList.add("shareImage");
            arrayList.add("closeMessageDialog");
            arrayList.add("makeMessageDialogVisable");
            arrayList.add("showMessageDialog");
            arrayList.add("messageDialogShareComplete");
            arrayList.add("onMessageDialogCallback");
            arrayList.add("showIPRushingRank");
            arrayList.add("getShareEnv");
            arrayList.add("shareContentByChannel");
            arrayList.add("switchScreenOrientation");
            arrayList.add("getDeviceInfo");
            arrayList.add("adReportFee");
            arrayList.add("adReportUI");
            arrayList.add("macroReplace");
            arrayList.add("getActivityState");
            arrayList.add("openThirdApp");
            arrayList.add("getNewUserCouponPackageDetailsBarCloseTS");
            arrayList.add("setNewUserCouponPackageDetailsBarCloseTS");
            c8834a.a(UI_DOMAIN, obj2);
            c8834a.a(ABILITY_DOMAIN, new c());
            c8834a.a("mall", new Object());
            c8834a.a(MALL_LIVE_DOMAIN, new Object());
            c8834a.a(MALL_DOWNLOAD_DOMAIN, new Object());
            replaceHybridAblity(c8834a);
        }

        public static Configuration create() {
            return new Configuration();
        }

        public Configuration debug(boolean z6) {
            this.f73562a = z6;
            return this;
        }

        public Configuration registerService(String str, String str2, d dVar) {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && dVar != null) {
                C8834a c8834a = (C8834a) ((HashMap) this.f73563b).get(str);
                if (c8834a == null) {
                    return this;
                }
                c8834a.a(str2, dVar);
            }
            return this;
        }

        public Configuration replaceHybridAblity(C8834a c8834a) {
            String str = c8834a.f128292a;
            if (((HashMap) this.f73563b).containsKey(str)) {
                Log.w("kfchybrid", "namespace:" + str + " already exist! hybrid ablity's configration will be replaced. please check it!");
            }
            ((HashMap) this.f73563b).put(c8834a.f128292a, c8834a);
            return this;
        }
    }

    public static void init(String str) {
        synchronized (KFCHybridV2.class) {
            try {
                init(str, Configuration.create());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void init(String str, Configuration configuration) {
        synchronized (KFCHybridV2.class) {
            if (configuration != null) {
                try {
                    if (!TextUtils.isEmpty(str)) {
                        List<String> list = f73561a;
                        if (((ArrayList) list).contains(str)) {
                            return;
                        }
                        ((ArrayList) list).add(str);
                        C8836c.f128301b = configuration.f73562a;
                        C8836c.b(str, configuration.f73563b);
                    }
                } finally {
                }
            }
        }
    }
}
