package com.bilibili.search2.result.all;

import android.widget.PopupWindow;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.ghost.api.Invocation;
import com.bilibili.lib.ghost.api.InvocationCategory;
import com.bilibili.lib.neuron.api.Neurons;
import kotlin.Pair;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.search2.result.all.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/e.class */
public final class RunnableC6051e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6052f f87277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CancellableContinuationImpl f87278b;

    public RunnableC6051e(C6052f c6052f, CancellableContinuationImpl cancellableContinuationImpl) {
        this.f87277a = c6052f;
        this.f87278b = cancellableContinuationImpl;
    }

    @Invocation(category = InvocationCategory.INVOKE_NONE_STATIC, name = "dismiss", owner = {"android.widget.PopupWindow"}, scope = {})
    public static void a(@NotNull Object obj) {
        Contract contractAb = ConfigManager.Companion.ab();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(contractAb.get("bgthread_ui_access_detect_enable", bool), bool)) {
            Thread threadCurrentThread = Thread.currentThread();
            if (!androidx.appcompat.app.n.a(threadCurrentThread)) {
                IllegalStateException illegalStateException = new IllegalStateException(Pb.F.b("PopupWindow.dismiss() called from non-UI thread: ", threadCurrentThread, ", 请联系 Jackin"));
                Neurons.trackT(false, "app.bgthread.ui.access", MapsKt.mapOf(new Pair[]{TuplesKt.to("stacktrace", Pb.G.b("PopupWindow.dismiss() called from non-UI thread: ", threadCurrentThread, "BgThreadUIAccess", illegalStateException, illegalStateException)), TuplesKt.to("threadName", threadCurrentThread.getName())}), 1, new AT0.c(8));
            }
        }
        ((PopupWindow) obj).dismiss();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            PopupWindow popupWindow = this.f87277a.f87281b;
            if (popupWindow != null) {
                a(popupWindow);
            }
            this.f87277a.f87281b = null;
        } catch (IllegalArgumentException e7) {
            e7.printStackTrace();
            CancellableContinuationImpl cancellableContinuationImpl = this.f87278b;
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.constructor-impl(Unit.INSTANCE));
        }
    }
}
