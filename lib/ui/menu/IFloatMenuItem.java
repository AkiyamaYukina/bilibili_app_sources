package com.bilibili.lib.ui.menu;

import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/menu/IFloatMenuItem.class */
public interface IFloatMenuItem {
    int getType();

    View getView(@Nullable View view, @NonNull ViewGroup viewGroup);

    void onBindDialog(Dialog dialog);

    void onBindPopupWindow(PopupWindow popupWindow);

    void toggleDivider(int i7);
}
