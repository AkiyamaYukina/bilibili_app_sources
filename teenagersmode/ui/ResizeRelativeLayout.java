package com.bilibili.teenagersmode.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/ResizeRelativeLayout.class */
public class ResizeRelativeLayout extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f110603a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/ResizeRelativeLayout$a.class */
    public interface a {
        void onSizeChanged(int i7, int i8);
    }

    public ResizeRelativeLayout(Context context) {
        this(context, null);
    }

    public ResizeRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        a aVar = this.f110603a;
        if (aVar != null) {
            aVar.onSizeChanged(i10, i8);
        }
    }

    public void setOnSizeChangedListener(a aVar) {
        this.f110603a = aVar;
    }
}
