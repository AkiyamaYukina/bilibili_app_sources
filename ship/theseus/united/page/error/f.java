package com.bilibili.ship.theseus.united.page.error;

import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.BindingAdapter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/error/f.class */
public final class f {
    @BindingAdapter({"layout_height"})
    public static final void a(int i7, @NotNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i7;
        }
        view.requestLayout();
    }
}
