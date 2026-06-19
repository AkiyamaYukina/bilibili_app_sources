package com.bilibili.lib.ui.menu;

import AT0.c;
import Pb.F;
import Pb.G;
import android.app.Dialog;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.n;
import com.bilibili.app.qrcode.QRcodeCaptureActivity;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.menu.FloatMenuWindow;
import com.bilibili.lib.ui.menu.TitleCheckMenuItem;
import com.bilibili.magicasakura.widgets.TintImageView;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/menu/TitleCheckMenuItem.class */
public class TitleCheckMenuItem implements IFloatMenuItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @DrawableRes
    public final int f64872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f64873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f64874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public OnMenuClickListener f64875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PopupWindow f64876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Dialog f64877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TintImageView f64878g;
    public View h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final String f64879i;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/menu/TitleCheckMenuItem$OnMenuClickListener.class */
    public interface OnMenuClickListener {
        void onMenuClick(View view);
    }

    public TitleCheckMenuItem(@DrawableRes int i7, String str, boolean z6, @Nullable String str2, @Nullable OnMenuClickListener onMenuClickListener) {
        this.f64872a = i7;
        this.f64873b = str;
        this.f64874c = z6;
        this.f64879i = str2;
        this.f64875d = onMenuClickListener;
    }

    public TitleCheckMenuItem(String str, boolean z6, @Nullable String str2, @Nullable OnMenuClickListener onMenuClickListener) {
        this.f64872a = 0;
        this.f64873b = str;
        this.f64874c = z6;
        this.f64879i = str2;
        this.f64875d = onMenuClickListener;
    }

    @Nullable
    public String getText() {
        return this.f64873b;
    }

    @Override // com.bilibili.lib.ui.menu.IFloatMenuItem
    public int getType() {
        return FloatMenuWindow.MenuType.TYPE_NORMAL.ordinal();
    }

    @Override // com.bilibili.lib.ui.menu.IFloatMenuItem
    public View getView(@Nullable View view, @NonNull ViewGroup viewGroup) {
        View viewA = view;
        if (view == null) {
            viewA = p.a(viewGroup, 2131494651, viewGroup, false);
            final int i7 = 0;
            viewA.findViewById(2131298361).setOnClickListener(new View.OnClickListener(this, i7) { // from class: Tf0.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f24167a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f24168b;

                {
                    this.f24167a = i7;
                    this.f24168b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (this.f24167a) {
                        case 0:
                            TitleCheckMenuItem titleCheckMenuItem = (TitleCheckMenuItem) this.f24168b;
                            PopupWindow popupWindow = titleCheckMenuItem.f64876e;
                            if (popupWindow != null && popupWindow.isShowing()) {
                                PopupWindow popupWindow2 = titleCheckMenuItem.f64876e;
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
                            TitleCheckMenuItem.OnMenuClickListener onMenuClickListener = titleCheckMenuItem.f64875d;
                            if (onMenuClickListener != null) {
                                onMenuClickListener.onMenuClick(view2);
                            }
                            Dialog dialog = titleCheckMenuItem.f64877f;
                            if (dialog != null && dialog.isShowing()) {
                                Dialog dialog2 = titleCheckMenuItem.f64877f;
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
                                break;
                            }
                            break;
                        default:
                            QRcodeCaptureActivity qRcodeCaptureActivity = (QRcodeCaptureActivity) this.f24168b;
                            QRcodeCaptureActivity.a aVar = QRcodeCaptureActivity.Companion;
                            qRcodeCaptureActivity.onBackPressed();
                            break;
                    }
                }
            });
        }
        TextView textView = (TextView) viewA.findViewById(2131308958);
        String str = this.f64879i;
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
            textView.setVisibility(0);
        }
        TintImageView tintImageView = (TintImageView) viewA.findViewById(2131307381);
        int i8 = this.f64872a;
        if (i8 != 0) {
            tintImageView.setVisibility(0);
            tintImageView.setImageResource(i8);
        } else {
            tintImageView.setVisibility(8);
        }
        tintImageView.setImageTintList(2131103284);
        ((TextView) viewA.findViewById(2131307409)).setText(this.f64873b);
        TintImageView tintImageView2 = (TintImageView) viewA.findViewById(2131307368);
        this.f64878g = tintImageView2;
        if (this.f64874c) {
            tintImageView2.setVisibility(0);
        } else {
            tintImageView2.setVisibility(8);
        }
        this.f64878g.setImageTintList(2131103284);
        this.h = viewA.findViewById(2131299397);
        return viewA;
    }

    @Override // com.bilibili.lib.ui.menu.IFloatMenuItem
    public void onBindDialog(Dialog dialog) {
        this.f64877f = dialog;
    }

    @Override // com.bilibili.lib.ui.menu.IFloatMenuItem
    public void onBindPopupWindow(PopupWindow popupWindow) {
        this.f64876e = popupWindow;
    }

    public void setCheck(boolean z6) {
        if (z6) {
            this.f64878g.setVisibility(0);
        } else {
            this.f64878g.setVisibility(8);
        }
    }

    public void setCheckedState(boolean z6) {
        this.f64874c = z6;
    }

    public void setOnClickListener(@Nullable OnMenuClickListener onMenuClickListener) {
        this.f64875d = onMenuClickListener;
    }

    public void setText(String str) {
        this.f64873b = str;
    }

    @Override // com.bilibili.lib.ui.menu.IFloatMenuItem
    public void toggleDivider(int i7) {
        View view = this.h;
        if (view != null) {
            view.setVisibility(i7);
        }
    }
}
