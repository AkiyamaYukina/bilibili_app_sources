package com.bilibili.playerbizcommon.cloudconfig;

import aW.e;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/cloudconfig/SelectorFrameLayout.class */
public class SelectorFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f79561a = 0;

    public SelectorFrameLayout(@NotNull Context context) {
        this(context, null);
    }

    public SelectorFrameLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SelectorFrameLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, 0);
        setOnClickListener(new e(this, 5));
    }

    public static void a(View view, boolean z6) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = viewGroup.getChildAt(i7);
                childAt.setSelected(z6);
                a(childAt, z6);
            }
        }
    }

    @Override // android.view.View
    public void setSelected(boolean z6) {
        super.setSelected(z6);
        a(this, z6);
    }
}
