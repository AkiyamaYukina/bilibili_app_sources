package com.bilibili.lib.storage;

import H9.e;
import androidx.compose.ui.text.font.C4496a;
import androidx.core.content.c;
import com.bilibili.gripper.container.storagemanager.d;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.lib.storage.StorageConfig;
import com.tencent.connect.common.Constants;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf0.C8654b;
import tf0.InterfaceC8659g;
import uf0.AbstractC8725a;
import vf0.C8803f;
import vf0.C8804g;
import vf0.C8805h;
import vf0.C8806i;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/storage/b.class */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static String f64597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public static String f64598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public static String f64599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public static String f64600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public static String f64601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public static HashSet<String> f64602g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public static d.b f64603i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public static d.c f64604j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f64596a = new Object();

    @NotNull
    public static final HashSet<InterfaceC8659g> h = new HashSet<>();

    public static void a(@NotNull StorageConfig storageConfig, @Nullable Function2 function2) {
        if (f()) {
            return;
        }
        C8654b.f127503a.i("StorageManager", "start each list by code");
        ArrayList<StorageConfig.ConfigItem> configList = storageConfig.getConfigList();
        if (configList != null) {
            for (StorageConfig.ConfigItem configItem : configList) {
                if (!d(configItem)) {
                    c(configItem, function2, 1);
                }
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String[] b(String str) {
        String str2;
        C8654b.f127503a.d("StorageManager", C4496a.a("start changeStr2PathArray ", str));
        List<String> listR = str != null ? StringsKt.R(str, new String[]{","}, 0, 6) : null;
        List list = listR;
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str3 : listR) {
            List listR2 = StringsKt.R(str3, new String[]{":"}, 0, 6);
            if (listR2.size() == 2) {
                String str4 = (String) listR2.get(0);
                int iHashCode = str4.hashCode();
                if (iHashCode != 1567) {
                    if (iHashCode != 1568) {
                        switch (iHashCode) {
                            case 1536:
                                if (str4.equals("00")) {
                                    String str5 = f64600e;
                                    str2 = str5;
                                    if (str5 == null) {
                                        str2 = "";
                                    }
                                } else {
                                    str2 = "";
                                }
                                break;
                            case 1537:
                                if (str4.equals("01")) {
                                    String str6 = f64599d;
                                    str2 = str6;
                                    if (str6 == null) {
                                        str2 = "";
                                    }
                                } else {
                                    str2 = "";
                                }
                                break;
                            case 1538:
                                if (str4.equals("02")) {
                                    String str7 = f64601f;
                                    str2 = str7;
                                    if (str7 == null) {
                                        str2 = "";
                                    }
                                } else {
                                    str2 = "";
                                }
                                break;
                            default:
                                str2 = "";
                                break;
                        }
                    } else if (str4.equals(Constants.VIA_REPORT_TYPE_SHARE_TO_QZONE)) {
                        String str8 = f64597b;
                        str2 = str8;
                        if (str8 == null) {
                            str2 = "";
                        }
                    } else {
                        str2 = "";
                    }
                } else if (str4.equals(Constants.VIA_REPORT_TYPE_SHARE_TO_QQ)) {
                    String str9 = f64598c;
                    str2 = str9;
                    if (str9 == null) {
                        str2 = "";
                    }
                } else {
                    str2 = "";
                }
                str3 = str2 + File.separator + listR2.get(1);
            }
            C8654b.f127503a.d("StorageManager", C4496a.a("changeStr2PathArray ", str3));
            arrayList.add(str3);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.bilibili.lib.storage.a$a, java.lang.Object] */
    public static void c(StorageConfig.ConfigItem configItem, Function2 function2, int i7) {
        StorageConfig.ConfigItem.StrategyInfo strategyInfo = configItem.getStrategyInfo();
        AbstractC8725a c8805h = null;
        if (strategyInfo != null) {
            int expireStrategy = configItem.getExpireStrategy();
            c8805h = expireStrategy != 0 ? expireStrategy != 1 ? expireStrategy != 2 ? expireStrategy != 3 ? null : new C8805h(strategyInfo, i7) : new C8803f(strategyInfo, i7) : configItem.getFake() ? new C8805h(strategyInfo, i7) : new C8806i(strategyInfo, i7) : configItem.getFake() ? new C8803f(configItem.getStrategyInfo(), i7) : new C8804g(strategyInfo, i7);
        }
        if (c8805h != null) {
            String name = configItem.getName();
            ?? obj = new Object();
            obj.f64589a = name;
            obj.f64590b = c8805h;
            obj.f64595g = Boolean.FALSE;
            obj.f64591c = b(configItem.getPath());
            obj.f64592d = b(configItem.getWhiteList());
            obj.f64593e = b(configItem.getBlackList());
            obj.f64594f = new e(function2, 4);
            obj.f64595g = Boolean.valueOf(configItem.getHighPriority());
            new a(obj).a();
        }
    }

    public static boolean d(StorageConfig.ConfigItem configItem) {
        if (e(configItem.getName())) {
            return true;
        }
        if (configItem.getMaxVersion() > 0 && FoundationAlias.getFapps().getVersionCode() > configItem.getMaxVersion()) {
            C8654b.f127503a.i("StorageManager", c.b(configItem.getMaxVersion(), "current version is > ", configItem.getName(), " max_version "));
            return true;
        }
        if (configItem.getMinVersion() <= 0 || FoundationAlias.getFapps().getVersionCode() >= configItem.getMinVersion()) {
            return false;
        }
        C8654b.f127503a.i("StorageManager", c.b(configItem.getMinVersion(), "current version is < ", configItem.getName(), " min_version "));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean e(java.lang.String r4) {
        /*
            java.util.HashSet<java.lang.String> r0 = com.bilibili.lib.storage.b.f64602g
            if (r0 != 0) goto L87
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r1.<init>()
            r7 = r0
            com.bilibili.lib.storage.StorageConfig$a r0 = com.bilibili.lib.storage.StorageConfig.Companion
            r8 = r0
            com.bilibili.gripper.container.storagemanager.d$b r0 = com.bilibili.lib.storage.b.f64603i
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L36
            r0 = r5
            com.bilibili.gripper.storagemanager.GStorageManager$a r0 = r0.a
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L2e
            r0 = r5
            java.lang.String r0 = r0.a()
            r5 = r0
            goto L30
        L2e:
            r0 = 0
            r5 = r0
        L30:
            r0 = r5
            r6 = r0
            r0 = r5
            if (r0 != 0) goto L39
        L36:
            java.lang.String r0 = ""
            r6 = r0
        L39:
            r0 = r8
            java.lang.Class r0 = r0.getClass()
            r0 = r6
            com.bilibili.lib.storage.StorageConfig r0 = com.bilibili.lib.storage.StorageConfig.a.a(r0)
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L83
            r0 = r5
            java.util.ArrayList r0 = r0.getConfigList()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L83
            r0 = r5
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
        L59:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L83
            r0 = r8
            java.lang.Object r0 = r0.next()
            com.bilibili.lib.storage.StorageConfig$ConfigItem r0 = (com.bilibili.lib.storage.StorageConfig.ConfigItem) r0
            java.lang.String r0 = r0.getName()
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L7a
            java.lang.String r0 = ""
            r5 = r0
        L7a:
            r0 = r7
            r1 = r5
            boolean r0 = r0.add(r1)
            goto L59
        L83:
            r0 = r7
            com.bilibili.lib.storage.b.f64602g = r0
        L87:
            r0 = r4
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L9d
            tf0.a r0 = tf0.C8654b.f127503a
            java.lang.String r1 = "StorageManager"
            java.lang.String r2 = "empty name, skip!"
            r0.i(r1, r2)
            r0 = 1
            return r0
        L9d:
            java.util.HashSet<java.lang.String> r0 = com.bilibili.lib.storage.b.f64602g
            r1 = r4
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto Lbc
            r0 = r4
            java.lang.String r1 = " is closed!"
            java.lang.String r0 = G.p.a(r0, r1)
            r4 = r0
            tf0.a r0 = tf0.C8654b.f127503a
            java.lang.String r1 = "StorageManager"
            r2 = r4
            r0.i(r1, r2)
            r0 = 1
            return r0
        Lbc:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.storage.b.e(java.lang.String):boolean");
    }

    public static boolean f() {
        d.c cVar = f64604j;
        if (cVar != null && cVar.a.ffWithDefault("storage_allow_file_auto_clear", true)) {
            return false;
        }
        C8654b.f127503a.i("StorageManager", "storage is disable");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Type inference failed for: r0v31, types: [com.bilibili.lib.storage.a$a, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(@org.jetbrains.annotations.NotNull com.bilibili.lib.storage.StorageEvent r6, @org.jetbrains.annotations.Nullable tf0.InterfaceC8660h r7) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.storage.b.g(com.bilibili.lib.storage.StorageEvent, tf0.h):void");
    }
}
