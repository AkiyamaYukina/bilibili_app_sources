package com.bilibili.playerbizcommon.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.InterfaceC4571o;
import androidx.core.widget.OpenNestedScrollView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/view/FixNestedScrollView.class */
public class FixNestedScrollView extends OpenNestedScrollView {
    public FixNestedScrollView(@NotNull Context context) {
        super(context);
    }

    public FixNestedScrollView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.core.widget.NestedScrollView, androidx.core.view.InterfaceC4572p
    public final void onNestedScroll(@NotNull View view, int i7, int i8, int i9, int i10, int i11) {
        super.onNestedScroll(view, i7, i8, i9, i10, i11);
        if (i10 <= 0 || getScrollY() < getScrollRange() || !(view instanceof InterfaceC4571o)) {
            return;
        }
        ((InterfaceC4571o) view).stopNestedScroll(i11);
    }
}
