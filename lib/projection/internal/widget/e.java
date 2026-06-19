package com.bilibili.lib.projection.internal.widget;

import Pb.F;
import Pb.G;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.transformer.RunnableC4737c0;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.projection.internal.widget.e;
import he0.C7432a;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/e.class */
public final class e extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f63907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public b f63908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f63909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f63910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public View f63911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public c f63912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public RunnableC4737c0 f63913g;

    @NotNull
    public final d h;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/e$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f63914a;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/e$b.class */
    public interface b {
        void a();

        void b();

        boolean c();

        void d();

        void e();

        void f();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.bilibili.lib.projection.internal.widget.d] */
    public e(View view, View view2, int i7, int i8) {
        Lifecycle lifecycle;
        super(view, -2, -2);
        this.h = new LifecycleEventObserver(this) { // from class: com.bilibili.lib.projection.internal.widget.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final e f63879a;

            {
                this.f63879a = this;
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                Lifecycle.Event event2 = Lifecycle.Event.ON_DESTROY;
                if (event == event2) {
                    BLog.i("PopupGuideBubble", "lifecycle change to: " + event2);
                    this.f63879a.a();
                }
            }
        };
        this.f63911e = view2;
        this.f63909c = i7;
        this.f63910d = i8;
        ContextWrapper contextWrapperFindActivityOrNull = ContextUtilKt.findActivityOrNull(getContentView().getContext());
        if (contextWrapperFindActivityOrNull != null) {
            while (true) {
                lifecycle = null;
                if (contextWrapperFindActivityOrNull == null) {
                    break;
                }
                if (contextWrapperFindActivityOrNull instanceof LifecycleOwner) {
                    lifecycle = ((LifecycleOwner) contextWrapperFindActivityOrNull).getLifecycle();
                    break;
                } else {
                    Context baseContext = contextWrapperFindActivityOrNull.getBaseContext();
                    contextWrapperFindActivityOrNull = baseContext instanceof ContextWrapper ? (ContextWrapper) baseContext : null;
                }
            }
            if (lifecycle != null) {
                lifecycle.addObserver(this.h);
            }
        }
    }

    public static void b(e eVar, int i7, int i8, long j7, int i9) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        if ((i9 & 4) != 0) {
            j7 = 0;
        }
        if (eVar.f63907a) {
            return;
        }
        b bVar = eVar.f63908b;
        if (bVar == null || !bVar.c()) {
            b bVar2 = eVar.f63908b;
            if (bVar2 != null) {
                bVar2.d();
                return;
            }
            return;
        }
        if (eVar.f63907a || Ie0.d.g()) {
            return;
        }
        eVar.f63907a = true;
        eVar.c(j7, i7, i8, true);
    }

    public final void a() {
        BLog.i("PopupGuideBubble", "removeAllRunnableMessage");
        c cVar = this.f63912f;
        if (cVar != null) {
            HandlerThreads.getHandler(0).removeCallbacks(cVar);
        }
        RunnableC4737c0 runnableC4737c0 = this.f63913g;
        if (runnableC4737c0 != null) {
            HandlerThreads.getHandler(0).removeCallbacks(runnableC4737c0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.bilibili.lib.projection.internal.widget.c, java.lang.Runnable] */
    public final void c(long j7, final int i7, final int i8, final boolean z6) {
        this.f63913g = new RunnableC4737c0(this, 2);
        ?? r02 = new Runnable(this, i7, i8, z6) { // from class: com.bilibili.lib.projection.internal.widget.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final e f63876a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f63877b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f63878c;

            {
                this.f63876a = this;
                this.f63877b = i7;
                this.f63878c = i8;
            }

            @Override // java.lang.Runnable
            public final void run() {
                e eVar = this.f63876a;
                int i9 = this.f63877b;
                int i10 = this.f63878c;
                e.b bVar = eVar.f63908b;
                if (bVar != null) {
                    bVar.e();
                }
                e.b bVar2 = eVar.f63908b;
                if (bVar2 != null) {
                    bVar2.f();
                }
                View view = eVar.f63911e;
                if (view == null) {
                    return;
                }
                Rect rect = new Rect();
                if (!view.getGlobalVisibleRect(rect) || rect.isEmpty()) {
                    return;
                }
                int i11 = eVar.f63910d;
                int[] iArr = {i11 == 3 ? rect.right : rect.left, i11 == 1 ? rect.bottom : rect.top};
                eVar.getContentView().measure(-2, -2);
                int measuredHeight = eVar.getContentView().getMeasuredHeight();
                int measuredWidth = eVar.getContentView().getMeasuredWidth();
                int iA = (int) C7432a.a(eVar.getContentView().getContext(), i9);
                int iA2 = (int) C7432a.a(eVar.getContentView().getContext(), i10);
                int i12 = eVar.f63910d == 2 ? (iArr[0] - measuredWidth) + iA : iArr[0] + iA;
                RangesKt.coerceAtLeast(0, i12);
                Unit unit = Unit.INSTANCE;
                int i13 = (eVar.f63910d == 0 ? iArr[1] - measuredHeight : iArr[1]) + iA2;
                RangesKt.coerceAtLeast(0, i13);
                int[] iArr2 = {i12, i13};
                BLog.i("PopupGuideBubble", androidx.compose.runtime.collection.d.a(iArr2[0], iArr2[1], "showBubble PopupWindow showAtLocation: [", ", ", "]"));
                if (view.getWindowToken() == null) {
                    return;
                }
                eVar.showAtLocation(view, 8388659, iArr2[0], iArr2[1]);
                e.b bVar3 = eVar.f63908b;
                if (bVar3 != null) {
                    bVar3.a();
                }
                int i14 = eVar.f63909c;
                if (i14 != 3 && Ie0.d.e(i14)) {
                    Ie0.d.j(eVar.f63909c);
                }
                RunnableC4737c0 runnableC4737c0 = eVar.f63913g;
                if (runnableC4737c0 != null) {
                    HandlerThreads.getHandler(0).removeCallbacks(runnableC4737c0);
                }
                RunnableC4737c0 runnableC4737c02 = eVar.f63913g;
                if (runnableC4737c02 != null) {
                    HandlerThreads.getHandler(0).postDelayed(runnableC4737c02, 5000L);
                }
            }
        };
        this.f63912f = r02;
        HandlerThreads.getHandler(0).removeCallbacks(r02);
        c cVar = this.f63912f;
        if (cVar != null) {
            HandlerThreads.getHandler(0).postDelayed(cVar, j7);
        }
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        b bVar = this.f63908b;
        if (bVar != null) {
            bVar.b();
        }
        a();
        this.f63911e = null;
        this.f63908b = null;
        setTouchInterceptor(null);
        BLog.i("PopupGuideBubble", "PopupGuideBubble call dismiss, firstActivity: " + ContextUtilKt.findActivityOrNull(getContentView().getContext()));
        Activity activityFindActivityOrNull = ContextUtilKt.findActivityOrNull(getContentView().getContext());
        if (activityFindActivityOrNull == null || activityFindActivityOrNull.isDestroyed() || activityFindActivityOrNull.isFinishing()) {
            return;
        }
        Contract contractAb = ConfigManager.Companion.ab();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(contractAb.get("bgthread_ui_access_detect_enable", bool), bool)) {
            Thread threadCurrentThread = Thread.currentThread();
            if (!androidx.appcompat.app.n.a(threadCurrentThread)) {
                IllegalStateException illegalStateException = new IllegalStateException(F.b("PopupWindow.dismiss() called from non-UI thread: ", threadCurrentThread, ", 请联系 Jackin"));
                Neurons.trackT(false, "app.bgthread.ui.access", MapsKt.mapOf(new Pair[]{TuplesKt.to("stacktrace", G.b("PopupWindow.dismiss() called from non-UI thread: ", threadCurrentThread, "BgThreadUIAccess", illegalStateException, illegalStateException)), TuplesKt.to("threadName", threadCurrentThread.getName())}), 1, new AT0.c(8));
            }
        }
        super.dismiss();
    }
}
