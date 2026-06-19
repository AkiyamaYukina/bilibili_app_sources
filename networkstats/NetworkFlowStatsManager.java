package com.bilibili.networkstats;

import Iq.k;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.net.TrafficStats;
import androidx.core.content.ContextCompat;
import com.bilibili.base.BiliContext;
import com.bilibili.droid.PackageManagerHelper;
import com.bilibili.droid.ProcessUtils;
import com.bilibili.droid.thread.HandlerThreads;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jj0.C7688a;
import jj0.C7689b;
import jj0.C7702o;
import jj0.w;
import jj0.x;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/networkstats/NetworkFlowStatsManager.class */
public final class NetworkFlowStatsManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static final C7702o f67365b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f67368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public static C7688a f67369f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public static w f67370g;
    public static long h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static boolean f67373k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final NetworkFlowStatsManager f67364a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static NetworkMode f67366c = NetworkMode.NO_CONNECT;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f67367d = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static String f67371i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static String f67372j = "";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/networkstats/NetworkFlowStatsManager$NetworkMode.class */
    public static final class NetworkMode {
        private static final EnumEntries $ENTRIES;
        private static final NetworkMode[] $VALUES;
        public static final NetworkMode WIFI = new NetworkMode("WIFI", 0);
        public static final NetworkMode MOBILE = new NetworkMode("MOBILE", 1);
        public static final NetworkMode NO_CONNECT = new NetworkMode("NO_CONNECT", 2);

        private static final /* synthetic */ NetworkMode[] $values() {
            return new NetworkMode[]{WIFI, MOBILE, NO_CONNECT};
        }

        static {
            NetworkMode[] networkModeArr$values = $values();
            $VALUES = networkModeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(networkModeArr$values);
        }

        private NetworkMode(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<NetworkMode> getEntries() {
            return $ENTRIES;
        }

        public static NetworkMode valueOf(String str) {
            return (NetworkMode) Enum.valueOf(NetworkMode.class, str);
        }

        public static NetworkMode[] values() {
            return (NetworkMode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.networkstats.NetworkFlowStatsManager, java.lang.Object] */
    static {
        Context applicationContext;
        if (!ProcessUtils.isMainProcess()) {
            BLog.e("NetworkFlowStatsManager", "NetworkFlowStatsManager should not run in subprocess");
        }
        Application application = BiliContext.application();
        if (application == null || (applicationContext = application.getApplicationContext()) == null) {
            return;
        }
        ContextCompat.registerReceiver(applicationContext, new BroadcastReceiver(), new IntentFilter("com.bilibili.networkstats.NETWORK_STATS_ACTION"), 4);
        f67365b = new C7702o(applicationContext);
    }

    public static String a(long j7) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(Locale.getDefault(), "%.3f", Arrays.copyOf(new Object[]{Float.valueOf(j7 / 1048576)}, 1));
    }

    @NotNull
    public static String b() throws Throwable {
        String string;
        List listF = f();
        if (listF == null || listF.isEmpty()) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder("日期/前台wifi用量(MB)/后台wifi用量(MB)/wifi总用量(MB)/前台移动数据用量(MB)/后台移动数据用量(MB)/移动数据总用量(MB)/数据总用量(MB)\n");
            Iterator it = listF.iterator();
            while (it.hasNext()) {
                sb.append(((C7688a) it.next()).toString());
                sb.append('\n');
            }
            string = sb.toString();
        }
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020e  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String c() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 531
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.networkstats.NetworkFlowStatsManager.c():java.lang.String");
    }

    public static long d() {
        Context applicationContext;
        ApplicationInfo applicationInfo;
        long j7 = 0;
        try {
            Application application = BiliContext.application();
            if (application == null || (applicationContext = application.getApplicationContext()) == null) {
                return 0L;
            }
            PackageInfo packageInfo = PackageManagerHelper.getPackageInfo(applicationContext, applicationContext.getPackageName(), 128);
            int i7 = (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null) ? -1 : applicationInfo.uid;
            long uidRxBytes = TrafficStats.getUidRxBytes(i7) + TrafficStats.getUidTxBytes(i7);
            if (uidRxBytes >= 0) {
                j7 = uidRxBytes;
            }
            return j7;
        } catch (Exception e7) {
            BLog.e("NetworkFlowStatsManager", "Get network stats error", e7);
            return 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e() {
        /*
            Method dump skipped, instruction units count: 776
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.networkstats.NetworkFlowStatsManager.e():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List f() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.networkstats.NetworkFlowStatsManager.f():java.util.List");
    }

    public static void g() {
        C7689b c7689b;
        if (f67368e) {
            long jD = d();
            long jD2 = d() - h;
            if (jD2 > 0) {
                C7688a c7688a = f67369f;
                if (c7688a != null) {
                    if (!Intrinsics.areEqual(c7688a.f122434a, x.b(System.currentTimeMillis()))) {
                        if (f67368e) {
                            h(new k(1));
                        }
                        f67369f = null;
                    }
                }
                if (f67369f == null) {
                    f67369f = new C7688a(x.b(System.currentTimeMillis()));
                }
                C7688a c7688a2 = f67369f;
                if (c7688a2 != null && (c7689b = c7688a2.f122435b) != null) {
                    i(c7689b, jD2);
                }
                if (f67370g == null) {
                    f67370g = new w(0);
                }
                w wVar = f67370g;
                if (wVar != null) {
                    i(wVar.f122453c, jD2);
                }
                h = jD;
                if (jD < 0) {
                    h = 0L;
                }
            }
        }
    }

    public static void h(Runnable runnable) {
        if (Intrinsics.areEqual(Thread.currentThread().getName(), HandlerThreads.getThreadName(1))) {
            runnable.run();
        } else {
            HandlerThreads.post(1, runnable);
        }
    }

    public static void i(C7689b c7689b, long j7) {
        if (f67366c == NetworkMode.WIFI) {
            if (f67367d) {
                c7689b.f122436a += j7;
                return;
            } else {
                c7689b.f122437b += j7;
                return;
            }
        }
        if (f67366c == NetworkMode.MOBILE) {
            if (f67367d) {
                c7689b.f122438c += j7;
            } else {
                c7689b.f122439d += j7;
            }
        }
    }
}
