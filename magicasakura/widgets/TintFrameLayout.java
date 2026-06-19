package com.bilibili.magicasakura.widgets;

import Ug0.h;
import Wg0.C3040a;
import Wg0.b;
import Wg0.e;
import Wg0.i;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bilibili.magicasakura.utils.TintManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/magicasakura/widgets/TintFrameLayout.class */
public class TintFrameLayout extends FrameLayout implements Tintable, i {
    private C3040a mBackgroundHelper;
    private e mForegroundHelper;
    private boolean mIsTintable;
    private int mViewThemeId;

    public TintFrameLayout(Context context) {
        this(context, null);
    }

    public TintFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [Wg0.a, Wg0.b] */
    /* JADX WARN: Type inference failed for: r0v9, types: [Wg0.b, Wg0.e] */
    public TintFrameLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.mIsTintable = true;
        if (isInEditMode()) {
            return;
        }
        TintManager tintManager = TintManager.get(context);
        ?? bVar = new b(this, tintManager);
        this.mBackgroundHelper = bVar;
        bVar.b(attributeSet, i7);
        ?? bVar2 = new b(this, tintManager);
        this.mForegroundHelper = bVar2;
        bVar2.b(attributeSet, i7);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (getBackground() != null) {
            invalidateDrawable(getBackground());
        }
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

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        super.setForeground(drawable);
        e eVar = this.mForegroundHelper;
        if (eVar == null || eVar.a()) {
            return;
        }
        eVar.f26853f = 0;
        eVar.f26854g = 0;
        h hVar = eVar.f26852e;
        if (hVar != null) {
            hVar.f24726d = false;
            hVar.f24723a = null;
            hVar.f24725c = false;
            hVar.f24724b = null;
        }
        eVar.f26844c = false;
    }

    public void setForegroundResource(int i7) {
        e eVar = this.mForegroundHelper;
        if (eVar != null) {
            eVar.c(i7);
        }
    }

    public void setForegroundTintList(int i7) {
        e eVar = this.mForegroundHelper;
        if (eVar != null) {
            eVar.d(i7, null);
        }
    }

    public void setForegroundTintList(int i7, PorterDuff.Mode mode) {
        e eVar = this.mForegroundHelper;
        if (eVar != null) {
            eVar.d(i7, mode);
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
        e eVar = this.mForegroundHelper;
        if (eVar != null) {
            eVar.f26845d = i7;
        }
    }

    public void tint() {
        if (this.mIsTintable) {
            C3040a c3040a = this.mBackgroundHelper;
            if (c3040a != null) {
                c3040a.k();
            }
            e eVar = this.mForegroundHelper;
            if (eVar != null) {
                eVar.f();
            }
        }
    }
}
