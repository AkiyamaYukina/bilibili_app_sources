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
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.menu.FloatMenuWindow;
import com.bilibili.magicasakura.widgets.TintImageView;
import java.util.List;
import kntr.base.localization.Localization;
import kntr.base.localization.q;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/menu/TitleListMenuItem.class */
public class TitleListMenuItem implements IFloatMenuItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @DrawableRes
    public final int f64880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f64881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f64882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<String> f64883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f64884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PopupWindow f64885f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Dialog f64886g;
    public View h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final OnMenuClickListener f64887i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f64888j;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/menu/TitleListMenuItem$OnMenuClickListener.class */
    public interface OnMenuClickListener {
        void onMenuClick(View view, int i7);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/menu/TitleListMenuItem$a.class */
    public final class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TitleListMenuItem f64889a;

        public a(TitleListMenuItem titleListMenuItem) {
            this.f64889a = titleListMenuItem;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PopupWindow popupWindow = this.f64889a.f64885f;
            if (popupWindow != null && popupWindow.isShowing()) {
                PopupWindow popupWindow2 = this.f64889a.f64885f;
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
            Dialog dialog = this.f64889a.f64886g;
            if (dialog != null && dialog.isShowing()) {
                Dialog dialog2 = this.f64889a.f64886g;
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
            this.f64889a.f64887i.onMenuClick(view, ((Integer) view.getTag()).intValue());
        }
    }

    public TitleListMenuItem(@DrawableRes int i7, String str, String str2, List<String> list, @Nullable OnMenuClickListener onMenuClickListener) {
        this.f64880a = 0;
        this.f64884e = !q.c(Localization.INSTANCE.getCurrent());
        this.f64888j = new a(this);
        this.f64880a = i7;
        this.f64881b = str;
        this.f64882c = str2;
        if (list == null || list.size() <= 8) {
            this.f64883d = list;
        } else {
            this.f64883d = list.subList(0, 8);
        }
        this.f64887i = onMenuClickListener;
    }

    public TitleListMenuItem(String str, String str2, List<String> list, @Nullable OnMenuClickListener onMenuClickListener) {
        this.f64880a = 0;
        this.f64884e = !q.c(Localization.INSTANCE.getCurrent());
        this.f64888j = new a(this);
        this.f64881b = str;
        this.f64882c = str2;
        if (list == null || list.size() <= 8) {
            this.f64883d = list;
        } else {
            this.f64883d = list.subList(0, 8);
        }
        this.f64887i = onMenuClickListener;
    }

    @Override // com.bilibili.lib.ui.menu.IFloatMenuItem
    public int getType() {
        return FloatMenuWindow.MenuType.TYPE_TITLE_LIST.ordinal();
    }

    @Override // com.bilibili.lib.ui.menu.IFloatMenuItem
    public View getView(@Nullable View view, @NonNull ViewGroup viewGroup) {
        View view2;
        List<String> list = this.f64883d;
        String str = this.f64881b;
        int i7 = this.f64880a;
        if (list == null || list.isEmpty()) {
            View viewA = view;
            if (view == null) {
                viewA = p.a(viewGroup, 2131494633, viewGroup, false);
                viewA.setOnClickListener(new b(this));
            }
            TintImageView tintImageView = (TintImageView) viewA.findViewById(2131307381);
            if (i7 != 0) {
                tintImageView.setVisibility(0);
                tintImageView.setImageResource(i7);
            } else {
                tintImageView.setVisibility(8);
            }
            tintImageView.setImageTintList(2131103284);
            ((TextView) viewA.findViewById(2131307409)).setText(str);
            this.h = viewA.findViewById(2131299397);
            return viewA;
        }
        boolean z6 = this.f64884e;
        String str2 = this.f64882c;
        if (!z6) {
            View viewA2 = view;
            if (view == null) {
                viewA2 = p.a(viewGroup, 2131495039, viewGroup, false);
            }
            TintImageView tintImageView2 = (TintImageView) viewA2.findViewById(2131307381);
            if (i7 != 0) {
                tintImageView2.setVisibility(0);
                tintImageView2.setImageResource(i7);
            } else {
                tintImageView2.setVisibility(8);
            }
            tintImageView2.setImageTintList(2131103284);
            ((TextView) viewA2.findViewById(2131307409)).setText(str);
            ((TextView) viewA2.findViewById(2131307410)).setText(str2);
            ViewGroup viewGroup2 = (ViewGroup) viewA2.findViewById(2131300195);
            viewGroup2.removeAllViews();
            int size = this.f64883d.size();
            int i8 = 0;
            while (true) {
                view2 = viewA2;
                if (i8 > (size - 1) / 2) {
                    break;
                }
                View viewA3 = p.a(viewGroup, 2131495037, viewGroup, false);
                TextView textView = (TextView) viewA3.findViewById(2131309936);
                int i9 = i8 * 2;
                textView.setText(this.f64883d.get(i9));
                viewA3.findViewById(2131309937).setTag(Integer.valueOf(i9));
                viewA3.findViewById(2131309937).setOnClickListener(this.f64888j);
                int i10 = i9 + 1;
                if (i10 >= size) {
                    viewA3.findViewById(2131309939).setVisibility(4);
                } else {
                    viewA3.findViewById(2131309939).setTag(Integer.valueOf(i10));
                    viewA3.findViewById(2131309939).setVisibility(0);
                    viewA3.findViewById(2131309939).setOnClickListener(this.f64888j);
                    ((TextView) viewA3.findViewById(2131309938)).setText(this.f64883d.get(i10));
                }
                viewGroup2.addView(viewA3);
                i8++;
            }
        } else {
            View viewA4 = view;
            if (view == null) {
                viewA4 = p.a(viewGroup, 2131502775, viewGroup, false);
            }
            TintImageView tintImageView3 = (TintImageView) viewA4.findViewById(2131307381);
            if (i7 != 0) {
                tintImageView3.setVisibility(0);
                tintImageView3.setImageResource(i7);
            } else {
                tintImageView3.setVisibility(8);
            }
            tintImageView3.setImageTintList(2131103284);
            ((TextView) viewA4.findViewById(2131307409)).setText(str);
            TextView textView2 = (TextView) viewA4.findViewById(2131307410);
            if (TextUtils.isEmpty(str2)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(str2);
            }
            ViewGroup viewGroup3 = (ViewGroup) viewA4.findViewById(2131300195);
            viewGroup3.removeAllViews();
            int size2 = this.f64883d.size();
            int i11 = 0;
            while (true) {
                view2 = viewA4;
                if (i11 >= size2) {
                    break;
                }
                View viewA5 = p.a(viewGroup, 2131502774, viewGroup, false);
                ((TextView) viewA5.findViewById(2131309936)).setText(this.f64883d.get(i11));
                viewA5.findViewById(2131309937).setTag(Integer.valueOf(i11));
                viewA5.findViewById(2131309937).setOnClickListener(this.f64888j);
                viewGroup3.addView(viewA5);
                i11++;
            }
        }
        return view2;
    }

    @Override // com.bilibili.lib.ui.menu.IFloatMenuItem
    public void onBindDialog(Dialog dialog) {
        this.f64886g = dialog;
    }

    @Override // com.bilibili.lib.ui.menu.IFloatMenuItem
    public void onBindPopupWindow(PopupWindow popupWindow) {
        this.f64885f = popupWindow;
    }

    public void setSingleColumn(boolean z6) {
        this.f64884e = z6;
    }

    @Override // com.bilibili.lib.ui.menu.IFloatMenuItem
    public void toggleDivider(int i7) {
        View view = this.h;
        if (view != null) {
            view.setVisibility(i7);
        }
    }
}
