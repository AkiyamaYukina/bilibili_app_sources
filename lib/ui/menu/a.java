package com.bilibili.lib.ui.menu;

import android.view.View;
import com.bilibili.lib.ui.menu.BottomDialogMenu;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/menu/a.class */
public final class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BottomDialogMenu f64890a;

    public a(BottomDialogMenu bottomDialogMenu) {
        this.f64890a = bottomDialogMenu;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f64890a.dismiss();
        BottomDialogMenu.OnCloseClickListener onCloseClickListener = this.f64890a.f64850b;
        if (onCloseClickListener != null) {
            onCloseClickListener.onCloseClick();
        }
    }
}
