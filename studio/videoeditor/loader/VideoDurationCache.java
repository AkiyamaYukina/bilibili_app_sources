package com.bilibili.studio.videoeditor.loader;

import M3.C2624v;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/loader/VideoDurationCache.class */
public final class VideoDurationCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final VideoDurationCache f109773a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final ConcurrentHashMap<String, Long> f109774b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final ConcurrentHashMap<String, Boolean> f109775c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final CoroutineScope f109776d = com.bilibili.adcommon.utils.ext.c.a(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Lazy f109777e = LazyKt.lazy(new C2624v(6));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final List<String> f109778f = CollectionsKt.listOf(new String[]{"/screenrecorder/", "/screen_record", "/screencapture", "/screencast"});

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final List<String> f109779g = CollectionsKt.listOf(new String[]{"screenrecorder-", "screenrec_", "screen_recording_", "screencapture_", "录屏"});

    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.studio.videoeditor.loader.VideoDurationCache r7, java.lang.String r8, kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.loader.VideoDurationCache.a(com.bilibili.studio.videoeditor.loader.VideoDurationCache, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static void b(@NotNull String str) {
        if (StringsKt.isBlank(str) || f109774b.containsKey(str) || f109775c.putIfAbsent(str, Boolean.TRUE) != null) {
            return;
        }
        BuildersKt.launch$default(f109776d, (CoroutineContext) null, (CoroutineStart) null, new VideoDurationCache$asyncLoadDuration$1(str, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.loader.VideoDurationCache.c(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
