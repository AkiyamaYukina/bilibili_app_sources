package com.bilibili.pegasus.page;

import M3.C2577f;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.inline.control.IInlineControl;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/x.class */
@StabilityInferred(parameters = 0)
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TimeMachinePegasusFragment f78444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final RecyclerView f78445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.pegasus.vm.o f78446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final TimeMachinePegasusFragment f78447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f78448e = LazyKt.lazy(new C2577f(5));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Lazy f78449f = LazyKt.lazy(new K9.h(this, 4));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Lazy f78450g = LazyKt.lazy(new com.bilibili.bililive.biz.pkv2.ui.p(this, 1));

    @Nullable
    public IInlineControl h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f78451i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public Job f78452j;

    public x(@NotNull TimeMachinePegasusFragment timeMachinePegasusFragment, @NotNull RecyclerView recyclerView, @NotNull com.bilibili.pegasus.vm.o oVar, @NotNull TimeMachinePegasusFragment timeMachinePegasusFragment2) {
        this.f78444a = timeMachinePegasusFragment;
        this.f78445b = recyclerView;
        this.f78446c = oVar;
        this.f78447d = timeMachinePegasusFragment2;
    }

    public static void b(x xVar) {
        Job job = xVar.f78452j;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        xVar.f78452j = null;
        RecyclerView recyclerView = xVar.f78445b;
        if (recyclerView.isShown()) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if ((adapter != null ? adapter.getItemCount() : 0) > 1) {
                BLog.i("TimeMachineInlineHelper", "startDelayAutoPlay -> startAutoPlay now");
                IInlineControl iInlineControl = xVar.h;
                if (iInlineControl != null) {
                    IInlineControl.startAutoPlay$default(iInlineControl, false, 1, (Object) null);
                }
            }
        }
        xVar.f78452j = BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(xVar.f78444a.getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new TimeMachineInlineHelper$startDelayAutoPlay$1(xVar, null), 3, (Object) null);
    }

    public final void a() {
        if (this.f78451i) {
            this.f78451i = false;
            Job job = this.f78452j;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.f78452j = null;
            IInlineControl iInlineControl = this.h;
            if (iInlineControl != null) {
                iInlineControl.stopPlay();
            }
            this.f78446c.f79076e = null;
            this.h = null;
        }
    }
}
