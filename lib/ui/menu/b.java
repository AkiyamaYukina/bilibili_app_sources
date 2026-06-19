package com.bilibili.lib.ui.menu;

import AT0.c;
import Pb.F;
import Pb.G;
import android.app.Dialog;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.app.n;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.menu.TitleListMenuItem;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/menu/b.class */
public final class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TitleListMenuItem f64891a;

    public b(TitleListMenuItem titleListMenuItem) {
        this.f64891a = titleListMenuItem;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PopupWindow popupWindow = this.f64891a.f64885f;
        if (popupWindow != null && popupWindow.isShowing()) {
            PopupWindow popupWindow2 = this.f64891a.f64885f;
            Contract contractAb = ConfigManager.Companion.ab();
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.areEqual(contractAb.get("bgthread_ui_access_detect_enable", bool), bool)) {
                Thread threadCurrentThread = Thread.currentThread();
                if (!n.a(threadCurrentThread)) {
                    IllegalStateException illegalStateException = new IllegalStateException(F.b("PopupWindow.dismiss() called from non-UI thread: ", threadCurrentThread, ", 请联系 Jackin"));
                    Neurons.trackT(false, "app.bgthread.ui.access", MapsKt.mapOf(new Pair[]{TuplesKt.to("stacktrace", G.b("PopupWindow.dismiss() called from non-UI thread: ", threadCurrentThread, "BgThreadUIAccess", illegalStateException, illegalStateException)), TuplesKt.to("threadName", threadCurrentThread.getName())}), 1, new c(8));
                }
            }
            popupWindow2.dismiss();
        }
        Dialog dialog = this.f64891a.f64886g;
        if (dialog != null && dialog.isShowing()) {
            Dialog dialog2 = this.f64891a.f64886g;
            Contract contractAb2 = ConfigManager.Companion.ab();
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.areEqual(contractAb2.get("bgthread_ui_access_detect_enable", bool2), bool2)) {
                Thread threadCurrentThread2 = Thread.currentThread();
                if (!n.a(threadCurrentThread2)) {
                    IllegalStateException illegalStateException2 = new IllegalStateException(F.b("Dialog.dismiss() called from non-UI thread: ", threadCurrentThread2, ", 请联系 Jackin"));
                    Neurons.trackT(false, "app.bgthread.ui.access", MapsKt.mapOf(new Pair[]{TuplesKt.to("stacktrace", G.b("Dialog.dismiss() called from non-UI thread: ", threadCurrentThread2, "BgThreadUIAccess", illegalStateException2, illegalStateException2)), TuplesKt.to("threadName", threadCurrentThread2.getName())}), 1, new c(8));
                }
            }
            dialog2.dismiss();
        }
        TitleListMenuItem.OnMenuClickListener onMenuClickListener = this.f64891a.f64887i;
        if (onMenuClickListener != null) {
            onMenuClickListener.onMenuClick(view, 0);
        }
    }
}
