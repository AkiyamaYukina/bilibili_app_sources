package com.bilibili.pegasus.components.customreporter;

import F3.Z0;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.common.PlaybackException;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.PegasusHeaderManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/customreporter/c.class */
@StabilityInferred(parameters = 0)
public final class c extends BasePegasusComponent {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f75925l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f75926m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f75929p;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f75924k = "PegasusFrameMonitorPlugin";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final List<Long> f75927n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f75928o = PlaybackException.CUSTOM_ERROR_CODE_BASE;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final a f75930q = new a(this);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final b f75931r = new b(this);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Lazy f75932s = LazyKt.lazy(new Z0(12));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/customreporter/c$a.class */
    public static final class a implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f75933a;

        public a(c cVar) {
            this.f75933a = cVar;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j7) {
            c cVar = this.f75933a;
            long j8 = cVar.f75926m;
            if (j8 != 0) {
                ((ArrayList) cVar.f75927n).add(Long.valueOf(j7 - j8));
            }
            c cVar2 = this.f75933a;
            cVar2.f75926m = j7;
            if (cVar2.f75925l) {
                Choreographer.getInstance().postFrameCallback(this);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/customreporter/c$b.class */
    public static final class b extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f75934a;

        public b(c cVar) {
            this.f75934a = cVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
            super.onScrollStateChanged(recyclerView, i7);
            c cVar = this.f75934a;
            if (i7 == 0) {
                cVar.b();
                return;
            }
            if ((i7 == 1 || i7 == 2) && !cVar.f75925l) {
                cVar.f75925l = true;
                cVar.f75926m = 0L;
                Choreographer.getInstance().postFrameCallback(cVar.f75930q);
            }
        }
    }

    public final void b() {
        Choreographer.getInstance().removeFrameCallback(this.f75930q);
        this.f75925l = false;
        this.f75926m = 0L;
        final com.bilibili.pegasus.components.customreporter.b bVar = new com.bilibili.pegasus.components.customreporter.b(0, CollectionsKt.toLongArray(this.f75927n), this);
        ((ThreadPoolExecutor) l.f75948a.getValue()).submit(new Runnable(bVar) { // from class: com.bilibili.pegasus.components.customreporter.k

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f75947a;

            {
                this.f75947a = bVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f75947a.invoke();
            }
        });
        ((ArrayList) this.f75927n).clear();
    }

    public final boolean getComponentEnable() {
        return ((Boolean) this.f75932s.getValue()).booleanValue();
    }

    @NotNull
    public final String getComponentName() {
        return this.f75924k;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        b();
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.f75931r);
        }
    }

    public final void onViewCreated(@NotNull View view, @NotNull RecyclerView recyclerView, @NotNull PegasusHeaderManager pegasusHeaderManager) {
        super.onViewCreated(view, recyclerView, pegasusHeaderManager);
        this.f75929p = SystemClock.uptimeMillis();
        RecyclerView recyclerView2 = getRecyclerView();
        b bVar = this.f75931r;
        if (recyclerView2 != null) {
            recyclerView2.removeOnScrollListener(bVar);
        }
        RecyclerView recyclerView3 = getRecyclerView();
        if (recyclerView3 != null) {
            recyclerView3.addOnScrollListener(bVar);
        }
    }
}
