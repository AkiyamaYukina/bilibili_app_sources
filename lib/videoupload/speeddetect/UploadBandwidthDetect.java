package com.bilibili.lib.videoupload.speeddetect;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.TrafficStats;
import com.bilibili.lib.foundation.FoundationAlias;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmStatic;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vg0.C8808b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/speeddetect/UploadBandwidthDetect.class */
public final class UploadBandwidthDetect {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public static Job f65118d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f65115a = TrafficStats.getTotalTxBytes();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final CopyOnWriteArrayList<Long> f65116b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Mutex f65117c = MutexKt.Mutex$default(false, 1, (Object) null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final CoroutineScope f65119e = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()).plus(new AbstractCoroutineContextElement(CoroutineExceptionHandler.Key)));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/speeddetect/UploadBandwidthDetect$a.class */
    public static final class a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public final void handleException(CoroutineContext coroutineContext, Throwable th) {
            C8808b.a("[BiliUpload] UploadBandwidthDetect: exception:" + th.getMessage());
            th.printStackTrace();
        }
    }

    public static void a(@NotNull Map map) {
        if (((Boolean) vg0.c.f128222l.getValue()).booleanValue()) {
            try {
                map.put("upstream_bandwidth", String.valueOf(b()));
                CopyOnWriteArrayList<Long> copyOnWriteArrayList = f65116b;
                if ((!copyOnWriteArrayList.isEmpty() ? copyOnWriteArrayList : null) != null) {
                    map.put("latest_upstream_speed", String.valueOf((int) ((Number) CollectionsKt.last(copyOnWriteArrayList)).longValue()));
                    map.put("avg_upstream_speed", String.valueOf((int) CollectionsKt.averageOfLong(copyOnWriteArrayList)));
                }
            } catch (Exception e7) {
                e7.printStackTrace();
                C8808b.a("[BiliUpload] appendSpeedParam, " + e7.getMessage());
            }
        }
    }

    public static int b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) FoundationAlias.getFapp().getSystemService("connectivity");
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return ((networkCapabilities != null ? networkCapabilities.getLinkUpstreamBandwidthKbps() : 0) * 1024) / 8;
    }

    @JvmStatic
    public static final void c() {
        if (((Boolean) vg0.c.f128222l.getValue()).booleanValue()) {
            Job job = f65118d;
            if (job == null || !job.isActive()) {
                f65118d = BuildersKt.launch$default(f65119e, (CoroutineContext) null, (CoroutineStart) null, new UploadBandwidthDetect$startBandwidthDetect$1(null), 3, (Object) null);
            }
        }
    }
}
