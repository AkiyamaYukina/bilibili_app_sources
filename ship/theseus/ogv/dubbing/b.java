package com.bilibili.ship.theseus.ogv.dubbing;

import Pb.F;
import Pb.G;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import dagger.assisted.AssistedInject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.IControlContainerService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/dubbing/b.class */
@StabilityInferred(parameters = 0)
public final class b extends PopupWindow {
    public static final int h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f91837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f91838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final d f91839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f91840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PageReportService f91841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final L9.n f91842f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ArrayList<Job> f91843g;

    @AssistedInject
    public b(@NotNull Context context, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull IControlContainerService iControlContainerService, @NotNull d dVar, @NotNull CoroutineScope coroutineScope, @NotNull PageReportService pageReportService, @NotNull L9.n nVar) {
        super(context);
        this.f91837a = cVar;
        this.f91838b = iControlContainerService;
        this.f91839c = dVar;
        this.f91840d = coroutineScope;
        this.f91841e = pageReportService;
        this.f91842f = nVar;
        this.f91843g = new ArrayList<>();
        View viewInflate = LayoutInflater.from(context).inflate(2131500455, (ViewGroup) null);
        setContentView(viewInflate);
        ImageView imageView = (ImageView) viewInflate.findViewById(2131304197);
        boolean z6 = cVar.h().f102988b;
        setWidth(Uj0.c.b(z6 ? 154 : 166, context));
        setHeight(Uj0.c.b(40, context));
        viewInflate.setOnClickListener(new a(this, 0));
        setOutsideTouchable(true);
        setBackgroundDrawable(new ColorDrawable(0));
        setClippingEnabled(false);
        setFocusable(false);
        if (z6) {
            imageView.setImageResource(2131240908);
        } else {
            imageView.setImageResource(2131240909);
        }
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        Iterator<T> it = this.f91843g.iterator();
        while (it.hasNext()) {
            Job.DefaultImpls.cancel$default((Job) it.next(), (CancellationException) null, 1, (Object) null);
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
