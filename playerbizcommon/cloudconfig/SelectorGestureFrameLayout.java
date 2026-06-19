package com.bilibili.playerbizcommon.cloudconfig;

import Nh1.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.magicasakura.widgets.TintTextView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/cloudconfig/SelectorGestureFrameLayout.class */
public class SelectorGestureFrameLayout extends FrameLayout {
    public SelectorGestureFrameLayout(@NotNull Context context) {
        this(context, null);
    }

    public SelectorGestureFrameLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View viewInflate = LayoutInflater.from(context).inflate(2131496507, (ViewGroup) this, true);
        TintImageView tintImageView = (TintImageView) viewInflate.findViewById(2131311087);
        TintTextView tintTextView = (TintTextView) viewInflate.findViewById(2131311088);
        if (tintImageView == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.n, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        if (resourceId > 0) {
            tintImageView.setPadding(typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(4, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0));
            tintImageView.setImageResource(resourceId);
        } else {
            tintImageView.setVisibility(8);
            if (tintTextView != null) {
                tintTextView.setVisibility(0);
            }
            if (tintTextView != null) {
                tintTextView.setText(typedArrayObtainStyledAttributes.getString(5));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
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
