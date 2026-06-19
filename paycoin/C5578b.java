package com.bilibili.paycoin;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.okdownloader.DownloadListenerAdapter;
import java.io.File;
import java.util.List;
import kotlin.jvm.JvmStatic;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.paycoin.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/paycoin/b.class */
public final class C5578b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f74751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f74752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f74753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f74754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f74755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f74756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f74757g;

    @NotNull
    public static final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f74758i;

    /* JADX INFO: renamed from: com.bilibili.paycoin.b$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/paycoin/b$a.class */
    public static final class a extends DownloadListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f74759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f74760b;

        public a(String str, String str2) {
            this.f74759a = str;
            this.f74760b = str2;
        }

        public final void onCancel(String str) {
            super.onCancel(str);
            defpackage.a.b("onCancel: ", str, "PayCoinFileUtils");
        }

        public final void onError(String str, List<Integer> list, long j7, long j8) {
            super.onError(str, list, j7, j8);
            StringBuilder sbB = I01.b.b("onError: ", str, ", ", ", ", list);
            sbB.append(j7);
            com.bilibili.app.comment3.utils.r.b(j8, ", ", "PayCoinFileUtils", sbB);
        }

        public final void onFinish(String str, String str2, String str3) {
            super.onFinish(str, str2, str3);
            bilibili.live.app.service.resolver.b.a(G0.b.a("onFinish: ", str, ", ", str2, ", "), str3, "PayCoinFileUtils");
            String str4 = C5578b.f74751a;
            StringBuilder sb = new StringBuilder("unzip, ");
            String str5 = this.f74759a;
            sb.append(str5);
            sb.append(", ");
            String str6 = this.f74760b;
            bilibili.live.app.service.resolver.b.a(sb, str6, "PayCoinFileUtils");
            BuildersKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), (CoroutineStart) null, new PayCoinFileUtils$unzip$1(str5, str6, null), 2, (Object) null);
        }

        public final void onStart(String str) {
            super.onStart(str);
            defpackage.a.b("onStart: ", str, "PayCoinFileUtils");
        }
    }

    static {
        String str = File.separator;
        f74751a = android.support.v4.media.a.a("AppPlaypage", str, "ic_pay_not_enough_22_playpage.png");
        f74752b = android.support.v4.media.a.a("AppPlaypage", str, "ic_pay_1coin_22_playpage.png");
        f74753c = android.support.v4.media.a.a("AppPlaypage", str, "ic_pay_2coin_22_playpage.png");
        f74754d = android.support.v4.media.a.a("AppPlaypage", str, "brick.png");
        f74755e = android.support.v4.media.a.a("AppPlaypage", str, "ani_thunder_1.png");
        f74756f = android.support.v4.media.a.a("AppPlaypage", str, "ani_thunder_2.png");
        f74757g = android.support.v4.media.a.a("AppPlaypage", str, "ani_thunder_3.png");
        h = android.support.v4.media.a.a("AppPlaypage", str, "1coin.png");
        f74758i = android.support.v4.media.a.a("AppPlaypage", str, "2coin.png");
    }

    @Nullable
    public static String a() {
        Context applicationContext;
        File externalCacheDir;
        Application application = BiliContext.application();
        String absolutePath = (application == null || (applicationContext = application.getApplicationContext()) == null || (externalCacheDir = applicationContext.getExternalCacheDir()) == null) ? null : externalCacheDir.getAbsolutePath();
        if (absolutePath == null) {
            return null;
        }
        return B0.a.a(absolutePath, File.separator, "pay_coin");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        r8 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(@org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.paycoin.C5578b.b(java.lang.String, java.lang.String):void");
    }

    @JvmStatic
    @Nullable
    public static final String c(@Nullable String str) {
        if (str == null) {
            return null;
        }
        try {
            File file = new File(str);
            if (file.exists()) {
                return Uri.fromFile(file).toString();
            }
            return null;
        } catch (Exception e7) {
            return null;
        }
    }
}
