package com.bilibili.lib.videoupload.speeddetect;

import Xf0.InterfaceC3111q;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vg0.C8808b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/speeddetect/UploadSpeedDetect.class */
public final class UploadSpeedDetect {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile long f65124b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public static volatile Job f65126d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ConcurrentHashMap<Long, Long> f65123a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile int f65125c = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Set<com.bilibili.lib.videoupload.speeddetect.a> f65127e = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final CoroutineScope f65128f = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()).plus(new AbstractCoroutineContextElement(CoroutineExceptionHandler.Key)));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/speeddetect/UploadSpeedDetect$a.class */
    public static final class a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public final void handleException(CoroutineContext coroutineContext, Throwable th) {
            C8808b.a("[BiliUpload] UploadSpeedDetect exception: " + th.getMessage());
            th.printStackTrace();
        }
    }

    @JvmStatic
    public static final void a() {
        synchronized (UploadSpeedDetect.class) {
            try {
                if (((Boolean) vg0.c.f128234x.getValue()).booleanValue()) {
                    com.bilibili.lib.uploadengine.a aVar = com.bilibili.lib.uploadengine.a.f65021a;
                    for (InterfaceC3111q interfaceC3111q : com.bilibili.lib.uploadengine.a.f()) {
                        if (interfaceC3111q.getTaskInfo() != null) {
                            f65123a.put(Long.valueOf(interfaceC3111q.getTaskInfo().f124196a), Long.valueOf(interfaceC3111q.getTaskInfo().y()));
                        }
                    }
                    Job job = f65126d;
                    if (job == null || !job.isActive()) {
                        f65126d = BuildersKt.launch$default(f65128f, (CoroutineContext) null, (CoroutineStart) null, new UploadSpeedDetect$startSpeedDetect$2(null), 3, (Object) null);
                    }
                }
            } finally {
            }
        }
    }
}
