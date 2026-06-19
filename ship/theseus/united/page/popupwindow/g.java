package com.bilibili.ship.theseus.united.page.popupwindow;

import Pb.F;
import Pb.G;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import androidx.appcompat.app.n;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bililive.room.ui.roomv3.player.container.q;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.neuron.api.Neurons;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/popupwindow/g.class */
@StabilityInferred(parameters = 0)
public final class g extends PopupWindow {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f102439l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f102440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Rect f102441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public View f102442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public WeakReference<View> f102443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f102444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f102445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public q f102446g;

    @Nullable
    public d h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public c f102447i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public e f102448j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final CopyOnWriteArrayList<PopupWindow.OnDismissListener> f102449k;

    public g() {
        this.f102440a = -1;
        this.f102449k = new CopyOnWriteArrayList<>();
    }

    public g(@NotNull Context context) {
        super(context, (AttributeSet) null, 0, 0);
        this.f102440a = -1;
        this.f102449k = new CopyOnWriteArrayList<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.bilibili.ship.theseus.united.page.popupwindow.d] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    public final void a() {
        ?? r02 = this.f102442c;
        if (r02 == 0) {
            return;
        }
        d dVar = this.h;
        ?? r52 = dVar;
        if (dVar == null) {
            ?? r53 = new Runnable(this) { // from class: com.bilibili.ship.theseus.united.page.popupwindow.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final g f102435a;

                {
                    this.f102435a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    View view;
                    View view2;
                    g gVar = this.f102435a;
                    WeakReference<View> weakReference = gVar.f102443d;
                    if (weakReference == null || (view = weakReference.get()) == null || (view2 = gVar.f102442c) == null) {
                        return;
                    }
                    if (gVar.f102441b == null) {
                        gVar.f102441b = new Rect();
                    }
                    Rect rect = gVar.f102441b;
                    if (rect == null) {
                        return;
                    }
                    if (view.getGlobalVisibleRect(rect) && view.isAttachedToWindow()) {
                        view2.setVisibility(0);
                    } else {
                        view2.setVisibility(4);
                    }
                }
            };
            this.h = r53;
            r52 = r53;
        }
        r02.removeCallbacks(r52);
        r02.post(r52);
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        View view;
        ViewTreeObserver viewTreeObserver;
        View view2 = this.f102442c;
        if (view2 != null) {
            view2.removeCallbacks(this.f102446g);
        }
        View view3 = this.f102442c;
        if (view3 != null) {
            view3.removeCallbacks(this.h);
        }
        WeakReference<View> weakReference = this.f102443d;
        if (weakReference != null && (view = weakReference.get()) != null) {
            c cVar = this.f102447i;
            if (cVar != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnScrollChangedListener(cVar);
            }
            e eVar = this.f102448j;
            if (eVar != null) {
                view.getViewTreeObserver().removeOnWindowAttachListener(eVar);
            }
        }
        Contract contractAb = ConfigManager.Companion.ab();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(contractAb.get("bgthread_ui_access_detect_enable", bool), bool)) {
            Thread threadCurrentThread = Thread.currentThread();
            if (!n.a(threadCurrentThread)) {
                IllegalStateException illegalStateException = new IllegalStateException(F.b("PopupWindow.dismiss() called from non-UI thread: ", threadCurrentThread, ", 请联系 Jackin"));
                Neurons.trackT(false, "app.bgthread.ui.access", MapsKt.mapOf(new Pair[]{TuplesKt.to("stacktrace", G.b("PopupWindow.dismiss() called from non-UI thread: ", threadCurrentThread, "BgThreadUIAccess", illegalStateException, illegalStateException)), TuplesKt.to("threadName", threadCurrentThread.getName())}), 1, new AT0.c(8));
            }
        }
        super.dismiss();
        Iterator<PopupWindow.OnDismissListener> it = this.f102449k.iterator();
        while (it.hasNext()) {
            it.next().onDismiss();
        }
        this.f102449k.clear();
        this.f102443d = null;
    }

    @Override // android.widget.PopupWindow
    public final void setContentView(@Nullable View view) {
        super.setContentView(view);
        this.f102442c = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [android.view.ViewTreeObserver$OnScrollChangedListener, com.bilibili.ship.theseus.united.page.popupwindow.c] */
    @Override // android.widget.PopupWindow
    public final void showAsDropDown(@Nullable View view, int i7, int i8, int i9) {
        WeakReference<View> weakReference;
        View view2;
        super.showAsDropDown(view, i7, i8, i9);
        this.f102443d = new WeakReference<>(view);
        View view3 = this.f102442c;
        if (view3 != null) {
            view3.setVisibility(4);
        }
        View view4 = this.f102442c;
        if (view4 != null && (weakReference = this.f102443d) != null && (view2 = weakReference.get()) != null) {
            view4.getViewTreeObserver().addOnGlobalLayoutListener(new f(view4, this));
            if (this.f102445f) {
                ?? r02 = new ViewTreeObserver.OnScrollChangedListener(this) { // from class: com.bilibili.ship.theseus.united.page.popupwindow.c

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final g f102434a;

                    {
                        this.f102434a = this;
                    }

                    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                    public final void onScrollChanged() {
                        g gVar = this.f102434a;
                        int i10 = g.f102439l;
                        gVar.a();
                    }
                };
                view2.getViewTreeObserver().addOnScrollChangedListener(r02);
                this.f102447i = r02;
                e eVar = new e(this);
                view2.getViewTreeObserver().addOnWindowAttachListener(eVar);
                this.f102448j = eVar;
            }
        }
        long j7 = this.f102444e;
        if (j7 > 0) {
            Runnable qVar = new q(this, 1);
            this.f102446g = qVar;
            View view5 = this.f102442c;
            if (view5 != null) {
                view5.postDelayed(qVar, j7);
            }
        }
    }
}
