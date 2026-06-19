package com.bilibili.magicasakura.widgets;

import Wg0.C3040a;
import Wg0.b;
import Wg0.i;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.bilibili.magicasakura.utils.TintManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/magicasakura/widgets/TintView.class */
public class TintView extends View implements Tintable, i {
    private C3040a mBackgroundHelper;
    private boolean mIsTintable;
    private int mViewThemeId;

    public TintView(Context context) {
        this(context, null);
    }

    public TintView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [Wg0.a, Wg0.b] */
    public TintView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.mIsTintable = true;
        if (isInEditMode()) {
            return;
        }
        ?? bVar = new b(this, TintManager.get(context));
        this.mBackgroundHelper = bVar;
        bVar.b(attributeSet, i7);
    }

    @Override // Wg0.i
    public int getViewThemeId() {
        return this.mViewThemeId;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        super.setBackgroundColor(i7);
        C3040a c3040a = this.mBackgroundHelper;
        if (c3040a != null) {
            c3040a.e(i7);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3040a c3040a = this.mBackgroundHelper;
        if (c3040a != null) {
            c3040a.g(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        C3040a c3040a = this.mBackgroundHelper;
        if (c3040a != null) {
            c3040a.h(i7);
        } else {
            super.setBackgroundResource(i7);
        }
    }

    public void setBackgroundTintList(int i7) {
        C3040a c3040a = this.mBackgroundHelper;
        if (c3040a != null) {
            c3040a.i(i7, null);
        }
    }

    public void setBackgroundTintList(int i7, PorterDuff.Mode mode) {
        C3040a c3040a = this.mBackgroundHelper;
        if (c3040a != null) {
            c3040a.i(i7, mode);
        }
    }

    public void setTintable(boolean z6) {
        this.mIsTintable = z6;
    }

    @Override // Wg0.i
    public void setViewThemeId(int i7) {
        this.mViewThemeId = i7;
        C3040a c3040a = this.mBackgroundHelper;
        if (c3040a != null) {
            c3040a.f26845d = i7;
        }
    }

    @Override // com.bilibili.magicasakura.widgets.Tintable
    public void tint() {
        C3040a c3040a;
        if (this.mIsTintable && (c3040a = this.mBackgroundHelper) != null) {
            c3040a.k();
        }
    }
}
