package com.bilibili.lib.push;

import android.content.Context;
import android.net.Uri;
import com.bilibili.droid.thread.HandlerThreads;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/s.class */
public class s implements B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f64260a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f64261b = true;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    @Override // com.bilibili.lib.push.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(@org.jetbrains.annotations.NotNull android.content.Context r7) {
        /*
            r6 = this;
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Exception -> L31
            r11 = r0
            r0 = r11
            r0.<init>()     // Catch: java.lang.Exception -> L31
            com.bilibili.lib.push.BPushConfig r0 = com.bilibili.lib.push.C5334b.c()     // Catch: java.lang.Exception -> L31
            r12 = r0
            r0 = r11
            java.lang.String r1 = "package"
            r2 = r7
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Exception -> L31
            r0.putString(r1, r2)     // Catch: java.lang.Exception -> L31
            r0 = r12
            if (r0 == 0) goto L35
            r0 = r12
            java.lang.String r0 = r0.getStartActivityName()     // Catch: java.lang.Exception -> L31
            r10 = r0
            r0 = r10
            r9 = r0
            r0 = r10
            if (r0 != 0) goto L50
            goto L35
        L31:
            r7 = move-exception
            goto L9a
        L35:
            r0 = r12
            if (r0 == 0) goto L4e
            r0 = r12
            com.bilibili.lib.push.IPushParams r0 = r0.getPushParams()     // Catch: java.lang.Exception -> L31
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L4e
            r0 = r9
            java.lang.String r0 = r0.dotClassName()     // Catch: java.lang.Exception -> L31
            r9 = r0
            goto L50
        L4e:
            r0 = 0
            r9 = r0
        L50:
            r0 = r11
            java.lang.String r1 = "class"
            r2 = r9
            r0.putString(r1, r2)     // Catch: java.lang.Exception -> L31
            r0 = r7
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Exception -> L31
            java.lang.String r1 = "content://com.huawei.android.launcher.settings/badge/"
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch: java.lang.Exception -> L31
            java.lang.String r2 = "getbadgeNumber"
            r3 = 0
            r4 = r11
            android.os.Bundle r0 = r0.call(r1, r2, r3, r4)     // Catch: java.lang.Exception -> L31
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L78
            java.lang.String r0 = "HuaweiRedDotCleaner"
            java.lang.String r1 = "getbadgeNumber bundle null"
            com.bilibili.lib.push.BPushLog.i(r0, r1)     // Catch: java.lang.Exception -> L31
            goto Lb8
        L78:
            r0 = r7
            java.lang.String r1 = "badgenumber"
            int r0 = r0.getInt(r1)     // Catch: java.lang.Exception -> L31
            r8 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L31
            r7 = r0
            r0 = r7
            java.lang.String r1 = "getbadgeNumber "
            r0.<init>(r1)     // Catch: java.lang.Exception -> L31
            r0 = r7
            r1 = r8
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L31
            java.lang.String r0 = "HuaweiRedDotCleaner"
            r1 = r7
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L31
            com.bilibili.lib.push.BPushLog.i(r0, r1)     // Catch: java.lang.Exception -> L31
            r0 = r8
            return r0
        L9a:
            r0 = r7
            java.lang.String r0 = kotlin.ExceptionsKt.stackTraceToString(r0)
            r7 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "getHuaweiBadgeNumber error "
            r1.<init>(r2)
            r9 = r0
            r0 = r9
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = "HuaweiRedDotCleaner"
            r1 = r9
            java.lang.String r1 = r1.toString()
            com.bilibili.lib.push.BPushLog.e(r0, r1)
        Lb8:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.push.s.a(android.content.Context):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    @Override // com.bilibili.lib.push.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(int r7, @org.jetbrains.annotations.NotNull android.content.Context r8) {
        /*
            Method dump skipped, instruction units count: 814
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.push.s.b(int, android.content.Context):void");
    }

    @NotNull
    public String c() {
        return "content://com.huawei.android.launcher.settings/badge/";
    }

    public final void d(@NotNull Context context, @NotNull String str) {
        if (this.f64260a) {
            this.f64260a = false;
            Uri uri = Uri.parse(str);
            if (C5334b.c().getPushParams().reportReddotNumber()) {
                HandlerThreads.postDelayed(3, new WO.c(uri, 1, this, context), 1000L);
            }
        }
    }
}
