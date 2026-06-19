package com.bilibili.pegasus.utils;

import G3.C1916f;
import android.app.Application;
import android.os.SystemClock;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.base.BiliContext;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.lib.biliid.api.EnvironmentManager;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.lib.oaid.MsaHelper;
import com.bilibili.moduleservice.list.IInlineVolumeService;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/utils/G.class */
@StabilityInferred(parameters = 0)
public final class G extends m {

    @NotNull
    public static final a h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f78856i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static volatile boolean f78857j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final IInlineVolumeService f78858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final com.bilibili.pegasus.k f78859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final com.bilibili.pegasus.f f78860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f78861f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Lazy f78862g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/utils/G$a.class */
    public static final class a {
        public static boolean a() {
            Application application = BiliContext.application();
            if (application == null) {
                return false;
            }
            return FoundationAlias.getFapps().getVersionCode() > BiliGlobalPreferenceHelper.getBLKVSharedPreference(application).getInt("pegasus_last_request_version_code", 0);
        }
    }

    public G() {
        BLRouter bLRouter = BLRouter.INSTANCE;
        this.f78858c = (IInlineVolumeService) bLRouter.get(IInlineVolumeService.class, "pegasus_inline_volume_key");
        this.f78859d = (com.bilibili.pegasus.k) BLRouter.get$default(bLRouter, com.bilibili.pegasus.k.class, (String) null, 2, (Object) null);
        this.f78860e = (com.bilibili.pegasus.f) BLRouter.get$default(bLRouter, com.bilibili.pegasus.f.class, (String) null, 2, (Object) null);
        this.f78861f = "TMIndexParamInterceptor";
        this.f78862g = LazyKt.lazy(LazyThreadSafetyMode.NONE, new C1916f(11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Pair d() {
        /*
            java.lang.String r0 = com.bilibili.lib.biliid.api.BuvidHelper.getBuvid()
            r9 = r0
            com.bilibili.lib.biliid.api.EnvironmentManager r0 = com.bilibili.lib.biliid.api.EnvironmentManager.getInstance()
            boolean r0 = r0.isFirstStart()
            r6 = r0
            java.lang.String r0 = ""
            r7 = r0
            r0 = r6
            if (r0 != 0) goto L16
            goto L67
        L16:
            int r0 = com.bilibili.pegasus.utils.C5759c.f78868a
            r5 = r0
            r0 = r5
            r1 = -1
            if (r0 == r1) goto L4f
            r0 = r5
            if (r0 == 0) goto L26
            goto L67
        L26:
            java.lang.String r0 = com.bilibili.lib.biliid.api.BuvidHelper.getRemoteBuvid()
            r10 = r0
            java.lang.String r0 = com.bilibili.lib.biliid.api.BuvidHelper.getLocalBuvid()
            r8 = r0
            r0 = r10
            int r0 = r0.length()
            if (r0 != 0) goto L3a
            goto L4a
        L3a:
            r0 = 1
            com.bilibili.pegasus.utils.C5759c.f78868a = r0
            r0 = r10
            r1 = r8
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L4a
            goto L67
        L4a:
            r0 = r8
            r7 = r0
            goto L67
        L4f:
            java.lang.String r0 = com.bilibili.lib.biliid.api.BuvidHelper.getRemoteBuvid()
            int r0 = r0.length()
            if (r0 != 0) goto L63
            r0 = 0
            com.bilibili.pegasus.utils.C5759c.f78868a = r0
            java.lang.String r0 = com.bilibili.lib.biliid.api.BuvidHelper.getLocalBuvid()
            r7 = r0
            goto L67
        L63:
            r0 = 1
            com.bilibili.pegasus.utils.C5759c.f78868a = r0
        L67:
            kotlin.Pair r0 = new kotlin.Pair
            r1 = r0
            r2 = r9
            r3 = r7
            r1.<init>(r2, r3)
            r9 = r0
            r0 = r9
            java.lang.Object r0 = r0.getFirst()
            r10 = r0
            r0 = r9
            java.lang.Object r0 = r0.getSecond()
            r8 = r0
            int r0 = com.bilibili.pegasus.utils.C5759c.f78868a
            r5 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "header_buvid: "
            r1.<init>(r2)
            r7 = r0
            r0 = r7
            r1 = r10
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            java.lang.String r1 = ", local_buvid: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            r1 = r8
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            java.lang.String r1 = ", status: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            java.lang.String r0 = r0.toString()
            tv.danmaku.android.log.BLog.i(r0)
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.utils.G.d():kotlin.Pair");
    }

    private final String e(String str) {
        String strA;
        try {
            strA = s.a(str.getBytes(Charset.forName("UTF-8")));
        } catch (Exception e7) {
            BLog.e(this.f78861f, "Fail to encrypt id string!!!");
            strA = "";
        }
        return strA;
    }

    private final Pair<String, String> f() {
        return (Pair) this.f78862g.getValue();
    }

    private final String g() {
        return e(h());
    }

    private final String h() {
        JSONObject jSONObject = new JSONObject();
        String imei = EnvironmentManager.getInstance().getImei();
        String str = imei;
        if (imei == null) {
            str = "";
        }
        String androidId = EnvironmentManager.getInstance().getAndroidId();
        String str2 = androidId != null ? androidId : "";
        String oaid = MsaHelper.getOaid();
        j(str, str2, oaid);
        jSONObject.put("imei", str);
        jSONObject.put("androidid", str2);
        jSONObject.put("oaid", oaid);
        return jSONObject.toJSONString();
    }

    private final String i() {
        return null;
    }

    private final void j(String str, String str2, String str3) {
        F fA = F.a();
        if (str != null) {
            str.length();
        }
        fA.getClass();
        F fA2 = F.a();
        if (str2 != null) {
            str2.length();
        }
        fA2.getClass();
        F fA3 = F.a();
        if (str3 != null) {
            str3.length();
        }
        fA3.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0105  */
    @Override // com.bilibili.pegasus.utils.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void addCommonParam(@org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> r6) {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.utils.G.addCommonParam(java.util.Map):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addHeader(@Nullable Request.Builder builder) {
        String str;
        super/*com.bilibili.okretro.interceptor.DefaultRequestInterceptor*/.addHeader(builder);
        h.getClass();
        if (a.a()) {
            BLog.i("InstalledAppListUtil", "add device info & applist");
            if (builder != null) {
                builder.addHeader("DeviceInfo", g());
            }
            List<String> list = s.f78886a;
            Application application = BiliContext.application();
            if (application == null || s.f78887b == null) {
                BLog.i("InstalledAppListUtil", "return null ctx:" + application + " sGetInstallAppListTask:" + s.f78887b);
                str = null;
            } else {
                SystemClock.elapsedRealtime();
                F fA = F.a();
                try {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    str = s.f78887b.get(1L, TimeUnit.SECONDS);
                    long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                    BLog.i("InstalledAppListUtil", "getResultDuration: " + jUptimeMillis2);
                    s.b(true, jUptimeMillis2, null);
                } catch (InterruptedException e7) {
                    e = e7;
                    BLog.i("InstalledAppListUtil", "InterruptedException", e);
                    fA.getClass();
                    s.b(false, 0L, e);
                    str = null;
                } catch (ExecutionException e8) {
                    e = e8;
                    BLog.i("InstalledAppListUtil", "ExecutionException", e);
                    fA.getClass();
                    s.b(false, 0L, e);
                    str = null;
                } catch (TimeoutException e9) {
                    e = e9;
                    BLog.i("InstalledAppListUtil", "TimeoutException", e);
                    fA.getClass();
                    s.b(false, 0L, e);
                    str = null;
                }
            }
            if (str != null) {
                BLog.i("InstalledAppListUtil", " add header:".concat(str));
                if (builder != null) {
                    builder.addHeader("AppList", str);
                }
            }
            if (builder != null) {
                builder.header("Buvid", (String) f().getFirst());
            }
        }
    }
}
