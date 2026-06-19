package com.bilibili.pegasus.request;

import Ax.A;
import Lh.n;
import android.app.Application;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Base64;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.common.inline.config.pegasus.PegasusInlineConfigKt;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.biliid.api.EnvironmentManager;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.oaid.MsaHelper;
import com.bilibili.lib.performance.BootOpt;
import com.bilibili.moduleservice.list.IInlineVolumeService;
import com.bilibili.moduleservice.list.IPegasusInlineConfig;
import com.bilibili.pegasus.PegasusInlineVolumeMode;
import com.bilibili.playerbizcommon.utils.PlayerSettingHelper;
import com.google.gson.JsonObject;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import tv.danmaku.videoplayer.core.media.ijk.IjkOptionsHelper;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/request/g.class */
@StabilityInferred(parameters = 0)
public final class g extends com.bilibili.app.comm.list.common.api.d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f78828f = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final IInlineVolumeService f78829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final com.bilibili.pegasus.k f78830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final com.bilibili.pegasus.f f78831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Lazy f78832e;

    public g() {
        BLRouter bLRouter = BLRouter.INSTANCE;
        this.f78829b = (IInlineVolumeService) bLRouter.get(IInlineVolumeService.class, "pegasus_inline_volume_key");
        this.f78830c = (com.bilibili.pegasus.k) BLRouter.get$default(bLRouter, com.bilibili.pegasus.k.class, (String) null, 2, (Object) null);
        this.f78831d = (com.bilibili.pegasus.f) BLRouter.get$default(bLRouter, com.bilibili.pegasus.f.class, (String) null, 2, (Object) null);
        this.f78832e = LazyKt.lazy(LazyThreadSafetyMode.NONE, new A(8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Pair b() {
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
            int r0 = Pp0.a.f19041a
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
            Pp0.a.f19041a = r0
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
            Pp0.a.f19041a = r0
            java.lang.String r0 = com.bilibili.lib.biliid.api.BuvidHelper.getLocalBuvid()
            r7 = r0
            goto L67
        L63:
            r0 = 1
            Pp0.a.f19041a = r0
        L67:
            kotlin.Pair r0 = new kotlin.Pair
            r1 = r0
            r2 = r9
            r3 = r7
            r1.<init>(r2, r3)
            r8 = r0
            r0 = r8
            java.lang.Object r0 = r0.getFirst()
            r9 = r0
            r0 = r8
            java.lang.Object r0 = r0.getSecond()
            r10 = r0
            int r0 = Pp0.a.f19041a
            r5 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "header_buvid: "
            r1.<init>(r2)
            r7 = r0
            r0 = r7
            r1 = r9
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            java.lang.String r1 = ", local_buvid: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            r1 = r10
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
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.request.g.b():kotlin.Pair");
    }

    private final String c(String str) {
        String strA;
        try {
            strA = Pp0.c.a(str.getBytes(Charset.forName("UTF-8")));
        } catch (Exception e7) {
            BLog.e("IndexParamInterceptor", "Fail to encrypt id string!!!");
            strA = "";
        }
        return strA;
    }

    private final String d() {
        return String.valueOf(PegasusInlineConfigKt.getReportInt((IPegasusInlineConfig) BLRouter.get$default(BLRouter.INSTANCE, IPegasusInlineConfig.class, (String) null, 2, (Object) null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String e() {
        /*
            r3 = this;
            r0 = r3
            com.bilibili.pegasus.f r0 = r0.f78831d
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L16
            r0 = r4
            com.bilibili.pegasus.PegasusAutoRefreshMode r0 = r0.b()
            r5 = r0
            r0 = r5
            r4 = r0
            r0 = r5
            if (r0 != 0) goto L1a
        L16:
            com.bilibili.pegasus.PegasusAutoRefreshMode r0 = com.bilibili.pegasus.PegasusAutoRefreshMode.MODE_SERVER_OPEN
            r4 = r0
        L1a:
            r0 = r4
            r5 = r0
            r0 = r4
            com.bilibili.pegasus.PegasusAutoRefreshMode r1 = com.bilibili.pegasus.PegasusAutoRefreshMode.MODE_DEFAULT
            if (r0 != r1) goto L27
            com.bilibili.pegasus.PegasusAutoRefreshMode r0 = com.bilibili.pegasus.PegasusAutoRefreshMode.MODE_SERVER_OPEN
            r5 = r0
        L27:
            r0 = r5
            int r0 = r0.getValue()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.request.g.e():java.lang.String");
    }

    private final Pair<String, String> f() {
        return (Pair) this.f78832e.getValue();
    }

    private final String g() {
        int i7 = (EnvironmentManager.getInstance().isFirstStart() && b.f78804a) ? 1 : 0;
        b.f78808e = i7;
        return String.valueOf(i7);
    }

    private final String h() {
        return c(k());
    }

    private final String i() {
        return String.valueOf((EnvironmentManager.getInstance().isFirstStart() && b.f78805b) ? 1 : 0);
    }

    private final String j() {
        return String.valueOf(PlayerSettingHelper.enablePlayUrlHTTPS() ? 1 : 0);
    }

    private final String k() {
        JsonObject jsonObject = new JsonObject();
        String imei = EnvironmentManager.getInstance().getImei();
        String str = imei;
        if (imei == null) {
            str = "";
        }
        String androidId = EnvironmentManager.getInstance().getAndroidId();
        String str2 = androidId != null ? androidId : "";
        String oaid = MsaHelper.getOaid();
        s(str, str2, oaid);
        jsonObject.addProperty("imei", str);
        jsonObject.addProperty("androidid", str2);
        jsonObject.addProperty("oaid", oaid);
        return jsonObject.toString();
    }

    private final String m() {
        int i7 = 1;
        if (IPlayerSettingService.Companion.getBoolean("inline_danmaku_switch", true)) {
            i7 = 2;
        }
        return String.valueOf(i7);
    }

    private final String n() {
        IInlineVolumeService iInlineVolumeService = this.f78829b;
        return String.valueOf((iInlineVolumeService == null || !iInlineVolumeService.isMuteState()) ? 2 : 1);
    }

    private final String o() {
        PegasusInlineVolumeMode pegasusInlineVolumeModeA;
        com.bilibili.pegasus.k kVar = this.f78830c;
        return String.valueOf((kVar == null || (pegasusInlineVolumeModeA = kVar.a()) == null) ? 0 : pegasusInlineVolumeModeA.getValue());
    }

    private final String p() {
        String str = b.f78806c;
        if (str == null || !StringsKt.n(str, "h5awaken")) {
            return null;
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("h5awaken");
            if (queryParameter != null && !StringsKt.isBlank(queryParameter)) {
                Charset charset = Charsets.UTF_8;
                String str2 = str + "&" + new String(Base64.decode(queryParameter.getBytes(charset), 0), charset);
                BLog.i("IndexParamInterceptor", "deep link:" + str2);
                return Uri.parse(str2).getQueryParameter("open_app_url");
            }
            return null;
        } catch (Exception e7) {
            BLog.i("IndexParamInterceptor", "decode deep link error:".concat(str));
            return null;
        }
    }

    private final String q() {
        return String.valueOf(n.f() ? 1 : 0);
    }

    private final String r() {
        return String.valueOf(IjkOptionsHelper.getVolumeBalance() ? 1 : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void s(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            Pp0.d r0 = Pp0.d.a()
            r10 = r0
            r0 = 0
            r9 = r0
            r0 = r5
            if (r0 == 0) goto L1e
            r0 = r5
            int r0 = r0.length()
            if (r0 != 0) goto L18
            goto L1e
        L18:
            r0 = 0
            r8 = r0
            goto L21
        L1e:
            r0 = 1
            r8 = r0
        L21:
            r0 = r10
            r1 = r8
            r2 = 1
            r1 = r1 ^ r2
            r0.f19053i = r1
            Pp0.d r0 = Pp0.d.a()
            r5 = r0
            r0 = r6
            if (r0 == 0) goto L44
            r0 = r6
            int r0 = r0.length()
            if (r0 != 0) goto L3e
            goto L44
        L3e:
            r0 = 0
            r8 = r0
            goto L47
        L44:
            r0 = 1
            r8 = r0
        L47:
            r0 = r5
            r1 = r8
            r2 = 1
            r1 = r1 ^ r2
            r0.f19055k = r1
            Pp0.d r0 = Pp0.d.a()
            r5 = r0
            r0 = r7
            if (r0 == 0) goto L64
            r0 = r9
            r8 = r0
            r0 = r7
            int r0 = r0.length()
            if (r0 != 0) goto L67
        L64:
            r0 = 1
            r8 = r0
        L67:
            r0 = r5
            r1 = r8
            r2 = 1
            r1 = r1 ^ r2
            r0.f19054j = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.request.g.s(java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void addCommonParam(@org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> r6) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.request.g.addCommonParam(java.util.Map):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addHeader(@Nullable Request.Builder builder) {
        String str;
        super/*com.bilibili.okretro.interceptor.DefaultRequestInterceptor*/.addHeader(builder);
        if (h.a()) {
            BLog.i("InstalledAppListUtil", "add device info & applist");
            if (builder != null) {
                builder.addHeader("DeviceInfo", h());
            }
            List<String> list = Pp0.c.f19042a;
            Application application = BiliContext.application();
            if (application == null || Pp0.c.f19044c == null) {
                BLog.i("InstalledAppListUtil", "return null ctx:" + application + " sGetInstallAppListTask:" + Pp0.c.f19044c);
                str = null;
            } else {
                Pp0.c.f19043b = SystemClock.elapsedRealtime();
                Pp0.d dVarA = Pp0.d.a();
                try {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    str = Pp0.c.f19044c.get(1L, TimeUnit.SECONDS);
                    long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                    BLog.i("InstalledAppListUtil", "getResultDuration: " + jUptimeMillis2);
                    Pp0.c.c(true, jUptimeMillis2, null);
                } catch (InterruptedException e7) {
                    e = e7;
                    BLog.i("InstalledAppListUtil", "InterruptedException", e);
                    dVarA.f19050e = 4;
                    Pp0.c.c(false, 0L, e);
                    str = null;
                } catch (ExecutionException e8) {
                    e = e8;
                    BLog.i("InstalledAppListUtil", "ExecutionException", e);
                    dVarA.f19050e = 5;
                    Pp0.c.c(false, 0L, e);
                    str = null;
                } catch (TimeoutException e9) {
                    e = e9;
                    BLog.i("InstalledAppListUtil", "TimeoutException", e);
                    dVarA.f19050e = 1;
                    Pp0.c.c(false, 0L, e);
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

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public Request intercept(@Nullable Request request) {
        BootOpt bootOpt = BootOpt.INSTANCE;
        bootOpt.record();
        Request requestIntercept = super/*com.bilibili.okretro.interceptor.DefaultRequestInterceptor*/.intercept(request);
        bootOpt.record();
        return requestIntercept;
    }
}
