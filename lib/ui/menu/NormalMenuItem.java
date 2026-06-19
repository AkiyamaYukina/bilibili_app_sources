package com.bilibili.lib.ui.menu;

import AT0.c;
import Pb.F;
import Pb.G;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.n;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.menu.FloatMenuWindow;
import com.bilibili.magicasakura.widgets.TintImageView;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/menu/NormalMenuItem.class */
public class NormalMenuItem implements IFloatMenuItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @DrawableRes
    public final int f64865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f64866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OnMenuClickListener f64867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PopupWindow f64868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Dialog f64869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f64870f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/menu/NormalMenuItem$OnMenuClickListener.class */
    public interface OnMenuClickListener {
        void onMenuClick(View view);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/menu/NormalMenuItem$a.class */
    public final class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NormalMenuItem f64871a;

        public a(NormalMenuItem normalMenuItem) {
            this.f64871a = normalMenuItem;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PopupWindow popupWindow = this.f64871a.f64868d;
            if (popupWindow != null && popupWindow.isShowing()) {
                PopupWindow popupWindow2 = this.f64871a.f64868d;
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
            Dialog dialog = this.f64871a.f64869e;
            if (dialog != null && dialog.isShowing()) {
                Dialog dialog2 = this.f64871a.f64869e;
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
            OnMenuClickListener onMenuClickListener = this.f64871a.f64867c;
            if (onMenuClickListener != null) {
                onMenuClickListener.onMenuClick(view);
            }
        }
    }

    public NormalMenuItem(@DrawableRes int i7, String str, @Nullable OnMenuClickListener onMenuClickListener) {
        this.f64865a = i7;
        this.f64866b = str;
        this.f64867c = onMenuClickListener;
    }

    public NormalMenuItem(String str, @Nullable OnMenuClickListener onMenuClickListener) {
        this.f64865a = 0;
        this.f64866b = str;
        this.f64867c = onMenuClickListener;
    }

    @Override // com.bilibili.lib.ui.menu.IFloatMenuItem
    public int getType() {
        return FloatMenuWindow.MenuType.TYPE_NORMAL.ordinal();
    }

    @Override // com.bilibili.lib.ui.menu.IFloatMenuItem
    public View getView(@Nullable View view, @NonNull ViewGroup viewGroup) {
        View viewA = view;
        if (view == null) {
            viewA = p.a(viewGroup, 2131494633, viewGroup, false);
            viewA.setOnClickListener(new a(this));
        }
        TintImageView tintImageView = (TintImageView) viewA.findViewById(2131307381);
        int i7 = this.f64865a;
        if (i7 != 0) {
            tintImageView.setVisibility(0);
            tintImageView.setImageResource(i7);
        } else {
            tintImageView.setVisibility(8);
        }
        tintImageView.setImageTintList(2131103284);
        ((TextView) viewA.findViewById(2131307409)).setText(this.f64866b);
        this.f64870f = viewA.findViewById(2131299397);
        return viewA;
    }

    @Override // com.bilibili.lib.ui.menu.IFloatMenuItem
    public void onBindDialog(Dialog dialog) {
        this.f64869e = dialog;
    }

    @Override // com.bilibili.lib.ui.menu.IFloatMenuItem
    public void onBindPopupWindow(PopupWindow popupWindow) {
        this.f64868d = popupWindow;
    }

    @Override // com.bilibili.lib.ui.menu.IFloatMenuItem
    public void toggleDivider(int i7) {
        View view = this.f64870f;
        if (view != null) {
            view.setVisibility(i7);
        }
    }
}
