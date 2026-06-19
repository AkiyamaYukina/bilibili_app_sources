package com.bilibili.mediastreaming.audio.croutine;

import CR0.n;
import androidx.compose.ui.text.font.C4496a;
import com.bilibili.ad.reward.test.K;
import com.bilibili.app.comm.ugc.miniplayer.common.f;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import nh0.InterfaceC8094b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/croutine/d.class */
public final class d implements InterfaceC8094b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bilibili.mediastreaming.audio.b f65707a = new com.bilibili.mediastreaming.audio.b("BiliAudioCoroutine");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f65708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f65709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f65710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ExecutorCoroutineDispatcher f65711e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f65712f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final ExecutorCoroutineDispatcher f65713g;

    @Nullable
    public final CoroutineScope h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f65714i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f65715j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f65716k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f65717l;

    public d(String str) {
        this.f65708b = str;
        ExecutorCoroutineDispatcher executorCoroutineDispatcherFrom = ExecutorsKt.from(Executors.newScheduledThreadPool(1, new ThreadFactory(this) { // from class: com.bilibili.mediastreaming.audio.croutine.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d f65703a;

            {
                this.f65703a = this;
            }

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                d dVar = this.f65703a;
                Thread thread = new Thread(runnable, dVar.f65708b.concat("-Native-Thread-Context"));
                thread.setDaemon(true);
                InterfaceC8094b.b(dVar, androidx.core.content.c.b(thread.getId(), "mAudioCoroutineThreadCtx name:", thread.getName(), ", threadID:"), null, 14);
                return thread;
            }
        }));
        this.f65711e = executorCoroutineDispatcherFrom;
        this.f65712f = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(executorCoroutineDispatcherFrom));
        this.f65714i = f.a(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null));
        this.f65715j = com.bilibili.adcommon.utils.ext.b.a(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null));
        this.f65716k = com.bilibili.adcommon.utils.ext.c.a(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null));
        InterfaceC8094b.b(this, K.a("name:", str, ", isNeedWorkThread:", true), null, 14);
        f("getAudioNativeThreadID", new n(this, 3));
        ExecutorCoroutineDispatcher executorCoroutineDispatcherFrom2 = ExecutorsKt.from(Executors.newScheduledThreadPool(1, new ThreadFactory(this) { // from class: com.bilibili.mediastreaming.audio.croutine.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d f65704a;

            {
                this.f65704a = this;
            }

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                d dVar = this.f65704a;
                Thread thread = new Thread(runnable, dVar.f65708b.concat("-Work-Thread-Context"));
                thread.setDaemon(true);
                InterfaceC8094b.b(dVar, androidx.core.content.c.b(thread.getId(), "mAudioWorkCoroutineThreadCtx name:", thread.getName(), ", threadID:"), null, 14);
                return thread;
            }
        }));
        this.f65713g = executorCoroutineDispatcherFrom2;
        if (executorCoroutineDispatcherFrom2 != null) {
            this.h = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(executorCoroutineDispatcherFrom2));
        }
        c cVar = new c(this, 0);
        CoroutineScope coroutineScope = this.h;
        if (coroutineScope != null) {
        }
    }

    public static void e(d dVar, Function0 function0) {
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        dVar.getClass();
        try {
            BiliAudioCoroutineKt.b(Thread.currentThread().getId() == dVar.f65709c, null, dVar.f65712f, coroutineStart, function0);
        } catch (Exception e7) {
            InterfaceC8094b.c(dVar, "job exception, msg:" + e7.getMessage(), e7, 6);
        }
    }

    public static void g(d dVar, Function0 function0) {
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        dVar.getClass();
        try {
            CoroutineScope coroutineScope = dVar.h;
            if (coroutineScope != null) {
                BiliAudioCoroutineKt.b(Thread.currentThread().getId() == dVar.f65710d, null, coroutineScope, coroutineStart, function0);
            }
        } catch (Exception e7) {
            InterfaceC8094b.c(dVar, "job exception, msg:" + e7.getMessage(), e7, 6);
        }
    }

    public static void h(d dVar, Function2 function2) {
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        if (dVar.f65717l) {
            InterfaceC8094b.c(dVar, "!!!!! runOnDefaultCoroutine is isRelease !!!!!", new Throwable(), 6);
        } else {
            CoroutineScope coroutineScope = dVar.f65715j;
            BuildersKt.launch(coroutineScope, coroutineScope.getCoroutineContext(), coroutineStart, new BiliAudioCoroutineKt$innerPostTask$2(function2, null));
        }
    }

    public static void i(d dVar, Function2 function2) {
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        if (dVar.f65717l) {
            InterfaceC8094b.c(dVar, "!!!!! runOnIOCoroutine is isRelease !!!!!", new Throwable(), 6);
        } else {
            CoroutineScope coroutineScope = dVar.f65716k;
            BuildersKt.launch(coroutineScope, coroutineScope.getCoroutineContext(), coroutineStart, new BiliAudioCoroutineKt$innerPostTask$2(function2, null));
        }
    }

    public final void d() {
        StringBuilder sbA = com.bilibili.playerbizcommon.features.background.b.a(Thread.currentThread().getId(), "name:", Thread.currentThread().getName(), ", ThreadID:");
        sbA.append(", release!!!!");
        InterfaceC8094b.a(this, sbA.toString(), null, null, 14);
        if (this.f65717l) {
            return;
        }
        this.f65717l = true;
        try {
            CoroutineScope coroutineScope = this.h;
            if (coroutineScope != null) {
                CoroutineScopeKt.cancel$default(coroutineScope, (CancellationException) null, 1, (Object) null);
            }
        } catch (Exception e7) {
            InterfaceC8094b.a(this, C4496a.a("mAudioWorkCoroutineScope, exception, message:", e7.getMessage()), null, null, 14);
        }
        ExecutorCoroutineDispatcher executorCoroutineDispatcher = this.f65713g;
        if (executorCoroutineDispatcher != null) {
            executorCoroutineDispatcher.close();
        }
        try {
            CoroutineScopeKt.cancel$default(this.f65712f, (CancellationException) null, 1, (Object) null);
        } catch (Exception e8) {
            InterfaceC8094b.a(this, C4496a.a("mAudioNativeCoroutineScope, exception, message:", e8.getMessage()), null, null, 14);
        }
        this.f65711e.close();
        this.f65709c = 0L;
        this.f65710d = 0L;
        try {
            CoroutineScopeKt.cancel$default(this.f65714i, (CancellationException) null, 1, (Object) null);
        } catch (Exception e9) {
            InterfaceC8094b.a(this, C4496a.a("mainCoroutineScope, exception, message:", e9.getMessage()), null, null, 14);
        }
        try {
            CoroutineScopeKt.cancel$default(this.f65715j, (CancellationException) null, 1, (Object) null);
        } catch (Exception e10) {
            InterfaceC8094b.a(this, C4496a.a("defaultCoroutineScope, exception, message:", e10.getMessage()), null, null, 14);
        }
        try {
            CoroutineScopeKt.cancel$default(this.f65716k, (CancellationException) null, 1, (Object) null);
        } catch (Exception e11) {
            InterfaceC8094b.a(this, C4496a.a("ioCoroutineScope, exception, message:", e11.getMessage()), null, null, 14);
        }
    }

    public final void f(@Nullable String str, @NotNull Function0<Unit> function0) {
        BiliAudioCoroutineKt.d(this.f65712f, str, this.f65709c, function0);
    }

    @Override // nh0.InterfaceC8094b
    public final void logError(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        this.f65707a.logError(str, str2, str3, th);
    }

    @Override // nh0.InterfaceC8094b
    public final void logInfo(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        this.f65707a.logInfo(str, str2, str3, th);
    }

    @Override // nh0.InterfaceC8094b
    public final void logWarning(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        this.f65707a.logWarning(str, str2, str3, th);
    }
}
