package com.bilibili.lib.videoupload.speeddetect;

import Di0.C1600d;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.lib.gson.GsonKt;
import com.bilibili.lib.videoupload.bean.UploadClientTimeoutConfig;
import com.google.gson.Gson;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmStatic;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ug0.C8730c;
import vg0.C8808b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/speeddetect/UploadLineSpeedDetect.class */
public final class UploadLineSpeedDetect {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ConcurrentHashMap<String, Line> f65120a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Mutex f65121b = MutexKt.Mutex$default(false, 1, (Object) null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final CoroutineScope f65122c = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()).plus(new AbstractCoroutineContextElement(CoroutineExceptionHandler.Key)));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/speeddetect/UploadLineSpeedDetect$a.class */
    public static final class a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public final void handleException(CoroutineContext coroutineContext, Throwable th) {
            C8808b.a(th.getMessage());
            th.printStackTrace();
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [com.bilibili.base.connectivity.ConnectivityMonitor$OnNetworkChangedListener, java.lang.Object] */
    static {
        if (((Boolean) vg0.c.f128218g.getValue()).booleanValue()) {
            ConnectivityMonitor.getInstance().register((ConnectivityMonitor.OnNetworkChangedListener) new Object());
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, okhttp3.Interceptor] */
    public static final ProbeResponse a() {
        UploadClientTimeoutConfig uploadClientTimeoutConfigF = C8730c.b(FoundationAlias.getFapp()).f();
        OkHttpClient.Builder builderAddInterceptor = C8730c.b(FoundationAlias.getFapp()).f127860b.newBuilder().addInterceptor((Interceptor) new Object());
        long j7 = uploadClientTimeoutConfigF.lineProbeWriteTimeout;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Response responseExecute = builderAddInterceptor.writeTimeout(j7, timeUnit).readTimeout(uploadClientTimeoutConfigF.lineProbeReadTimeout, timeUnit).connectTimeout(uploadClientTimeoutConfigF.lineProbeConnectTimeout, timeUnit).build().newCall(new Request.Builder().url("https://member.bilibili.com/preupload?r=probe").build()).execute();
        ProbeResponse probeResponse = null;
        if (responseExecute.isSuccessful()) {
            probeResponse = null;
            if (responseExecute.body() != null) {
                Gson gson = com.bilibili.lib.gson.Gson.Companion.get();
                ResponseBody responseBodyBody = responseExecute.body();
                String strString = null;
                if (responseBodyBody != null) {
                    strString = responseBodyBody.string();
                }
                probeResponse = (ProbeResponse) gson.fromJson(strString, ProbeResponse.class);
            }
        }
        return probeResponse;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(com.bilibili.lib.videoupload.speeddetect.Line r2) {
        /*
            r0 = 0
            r5 = r0
            r0 = r2
            if (r0 == 0) goto Le
            r0 = r2
            java.lang.String r0 = r0.getQuery()
            r4 = r0
            goto L10
        Le:
            r0 = 0
            r4 = r0
        L10:
            r0 = r4
            if (r0 == 0) goto L58
            r0 = r4
            int r0 = r0.length()
            if (r0 != 0) goto L1e
            goto L58
        L1e:
            r0 = r2
            if (r0 == 0) goto L2a
            r0 = r2
            java.lang.String r0 = r0.getOs()
            r4 = r0
            goto L2c
        L2a:
            r0 = 0
            r4 = r0
        L2c:
            r0 = r4
            if (r0 == 0) goto L58
            r0 = r4
            int r0 = r0.length()
            if (r0 != 0) goto L3a
            goto L58
        L3a:
            r0 = r5
            r4 = r0
            r0 = r2
            if (r0 == 0) goto L45
            r0 = r2
            java.lang.String r0 = r0.getProbeUrl()
            r4 = r0
        L45:
            r0 = r4
            if (r0 == 0) goto L58
            r0 = r4
            int r0 = r0.length()
            if (r0 != 0) goto L53
            goto L58
        L53:
            r0 = 1
            r3 = r0
            goto L5a
        L58:
            r0 = 0
            r3 = r0
        L5a:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.videoupload.speeddetect.UploadLineSpeedDetect.b(com.bilibili.lib.videoupload.speeddetect.Line):boolean");
    }

    @JvmStatic
    public static final void c() {
        if (((Boolean) vg0.c.f128218g.getValue()).booleanValue()) {
            BuildersKt.launch$default(f65122c, (CoroutineContext) null, (CoroutineStart) null, new UploadLineSpeedDetect$detectLines$1(null), 3, (Object) null);
        }
    }

    @Nullable
    public static String d() {
        Network activeNetwork;
        LinkProperties linkProperties;
        String hostAddress;
        Object systemService = FoundationAlias.getFapp().getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) == null) {
            return null;
        }
        String hostAddress2 = null;
        for (LinkAddress linkAddress : linkProperties.getLinkAddresses()) {
            if (!linkAddress.getAddress().isLoopbackAddress() && !linkAddress.getAddress().isLinkLocalAddress() && !linkAddress.getAddress().isAnyLocalAddress() && (linkAddress.getAddress() instanceof Inet4Address)) {
                return linkAddress.getAddress().getHostAddress();
            }
            if (!linkAddress.getAddress().isLoopbackAddress() && !linkAddress.getAddress().isLinkLocalAddress() && !linkAddress.getAddress().isAnyLocalAddress() && (linkAddress.getAddress() instanceof Inet6Address) && (hostAddress = linkAddress.getAddress().getHostAddress()) != null && hostAddress.length() != 0 && !StringsKt.Z(linkAddress.getAddress().getHostAddress(), "fe80")) {
                hostAddress2 = linkAddress.getAddress().getHostAddress();
            }
        }
        return hostAddress2;
    }

    public static boolean e(String str) {
        ConcurrentHashMap<String, Line> concurrentHashMap = f65120a;
        Line line = concurrentHashMap.get(str);
        boolean z6 = false;
        if (line != null) {
            z6 = false;
            if (System.currentTimeMillis() - line.getDetectTime() < ((Number) vg0.c.h.getValue()).intValue() * 1000) {
                z6 = true;
            }
            Line line2 = concurrentHashMap.get(str);
            String jsonString = line2 != null ? GsonKt.toJsonString(line2) : null;
            StringBuilder sbB = C1600d.b("[BiliUpload] detectLines useCache=", " ip=", str, " ", z6);
            sbB.append(jsonString);
            C8808b.b(sbB.toString());
        }
        return z6;
    }
}
