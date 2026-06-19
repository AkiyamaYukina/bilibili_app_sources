package com.bilibili.playerbizcommonv2.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.playerbizcommonv2.delegate.IDelegateStoreService;
import com.bilibili.playerbizcommonv2.utils.r;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.videoplayer.core.log.PlayerLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/utils/B.class */
@StabilityInferred(parameters = 0)
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final IDelegateStoreService f81889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LifecycleCoroutineScope f81890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f81891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Function1<WindowSizeClass, Unit> f81892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Job f81893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public WindowSizeClass f81894f;

    public B(IDelegateStoreService iDelegateStoreService, LifecycleCoroutineScope lifecycleCoroutineScope, String str, Function1 function1) {
        this.f81889a = iDelegateStoreService;
        this.f81890b = lifecycleCoroutineScope;
        this.f81891c = str;
        this.f81892d = function1;
    }

    public final void a() {
        r rVar = (r) this.f81889a.get(r.a.f81944a);
        String str = this.f81891c;
        if (rVar == null) {
            PlayerLog.w("BiliPlayerV2", "[" + str + "] PlayerWindowSizeDelegate is null, skip window size monitoring");
            return;
        }
        if (this.f81893e != null) {
            PlayerLog.w("BiliPlayerV2", "[" + str + "] window size monitoring is already running, stop it first");
            Job job = this.f81893e;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.f81893e = null;
            this.f81894f = null;
        }
        this.f81894f = (WindowSizeClass) rVar.getWindowSizeFlow().getValue();
        this.f81893e = BuildersKt.launch$default(this.f81890b, (CoroutineContext) null, (CoroutineStart) null, new WindowSizeMonitor$start$1(rVar, this, null), 3, (Object) null);
    }
}
