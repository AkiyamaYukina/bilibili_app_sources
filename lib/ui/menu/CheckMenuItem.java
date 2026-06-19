package com.bilibili.lib.ui.menu;

import Tf0.ViewOnClickListenerC2895a;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.menu.FloatMenuWindow;
import com.bilibili.magicasakura.widgets.TintImageView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/menu/CheckMenuItem.class */
public class CheckMenuItem implements IFloatMenuItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @DrawableRes
    public final int f64853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f64854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f64855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public OnMenuClickListener f64856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PopupWindow f64857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Dialog f64858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TintImageView f64859g;
    public View h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f64860i;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/menu/CheckMenuItem$OnMenuClickListener.class */
    public interface OnMenuClickListener {
        void onMenuClick(View view);
    }

    public CheckMenuItem(@DrawableRes int i7, String str, boolean z6, @Nullable OnMenuClickListener onMenuClickListener) {
        this.f64853a = i7;
        this.f64854b = str;
        this.f64855c = z6;
        this.f64856d = onMenuClickListener;
    }

    public CheckMenuItem(String str, boolean z6, @Nullable OnMenuClickListener onMenuClickListener) {
        this.f64853a = 0;
        this.f64854b = str;
        this.f64855c = z6;
        this.f64856d = onMenuClickListener;
    }

    public CheckMenuItem(String str, boolean z6, boolean z7, @Nullable OnMenuClickListener onMenuClickListener) {
        this.f64853a = 0;
        this.f64854b = str;
        this.f64855c = z6;
        this.f64856d = onMenuClickListener;
        this.f64860i = z7;
    }

    @Nullable
    public String getTitle() {
        return this.f64854b;
    }

    @Override // com.bilibili.lib.ui.menu.IFloatMenuItem
    public int getType() {
        return FloatMenuWindow.MenuType.TYPE_NORMAL.ordinal();
    }

    @Override // com.bilibili.lib.ui.menu.IFloatMenuItem
    public View getView(@Nullable View view, @NonNull ViewGroup viewGroup) {
        View viewA = view;
        if (view == null) {
            viewA = p.a(viewGroup, 2131494621, viewGroup, false);
            viewA.setOnClickListener(new ViewOnClickListenerC2895a(this, 0));
        }
        TintImageView tintImageView = (TintImageView) viewA.findViewById(2131307381);
        int i7 = this.f64853a;
        if (i7 != 0) {
            tintImageView.setVisibility(0);
            tintImageView.setImageResource(i7);
        } else {
            tintImageView.setVisibility(8);
        }
        tintImageView.setImageTintList(2131103284);
        TextView textView = (TextView) viewA.findViewById(2131307409);
        textView.setText(this.f64854b);
        TintImageView tintImageView2 = (TintImageView) viewA.findViewById(2131307368);
        this.f64859g = tintImageView2;
        if (this.f64855c) {
            tintImageView2.setVisibility(0);
        } else {
            tintImageView2.setVisibility(8);
        }
        if (this.f64860i) {
            if (this.f64855c) {
                textView.setTextColor(ContextCompat.getColor(viewGroup.getContext(), R$color.Pi5_u));
            } else {
                textView.setTextColor(ContextCompat.getColor(viewGroup.getContext(), R$color.Ga10));
            }
        }
        this.f64859g.setImageTintList(2131103284);
        this.h = viewA.findViewById(2131299397);
        return viewA;
    }

    @Override // com.bilibili.lib.ui.menu.IFloatMenuItem
    public void onBindDialog(Dialog dialog) {
        this.f64858f = dialog;
    }

    @Override // com.bilibili.lib.ui.menu.IFloatMenuItem
    public void onBindPopupWindow(PopupWindow popupWindow) {
        this.f64857e = popupWindow;
    }

    public void setCheck(boolean z6) {
        if (z6) {
            this.f64859g.setVisibility(0);
        } else {
            this.f64859g.setVisibility(8);
        }
    }

    public void setCheckedState(boolean z6) {
        this.f64855c = z6;
    }

    public void setOnClickListener(@Nullable OnMenuClickListener onMenuClickListener) {
        this.f64856d = onMenuClickListener;
    }

    @Override // com.bilibili.lib.ui.menu.IFloatMenuItem
    public void toggleDivider(int i7) {
        View view = this.h;
        if (view != null) {
            view.setVisibility(i7);
        }
    }
}
