package com.bilibili.magicasakura.widgets;

import Wg0.C3040a;
import Wg0.b;
import Wg0.i;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.bilibili.magicasakura.utils.TintManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/magicasakura/widgets/TintRelativeLayout.class */
public class TintRelativeLayout extends RelativeLayout implements Tintable, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3040a f65560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f65561b;

    public TintRelativeLayout(Context context) {
        this(context, null);
    }

    public TintRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [Wg0.a, Wg0.b] */
    public TintRelativeLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        if (isInEditMode()) {
            return;
        }
        ?? bVar = new b(this, TintManager.get(context));
        this.f65560a = bVar;
        bVar.b(attributeSet, i7);
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
        return this.f65561b;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        super.setBackgroundColor(i7);
        C3040a c3040a = this.f65560a;
        if (c3040a != null) {
            c3040a.e(i7);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3040a c3040a = this.f65560a;
        if (c3040a != null) {
            c3040a.g(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        C3040a c3040a = this.f65560a;
        if (c3040a != null) {
            c3040a.h(i7);
        } else {
            super.setBackgroundResource(i7);
        }
    }

    public void setBackgroundTintList(int i7) {
        C3040a c3040a = this.f65560a;
        if (c3040a != null) {
            c3040a.i(i7, null);
        }
    }

    public void setBackgroundTintList(int i7, PorterDuff.Mode mode) {
        C3040a c3040a = this.f65560a;
        if (c3040a != null) {
            c3040a.i(i7, mode);
        }
    }

    @Override // Wg0.i
    public void setViewThemeId(int i7) {
        this.f65561b = i7;
        C3040a c3040a = this.f65560a;
        if (c3040a != null) {
            c3040a.f26845d = i7;
        }
    }

    @Override // com.bilibili.magicasakura.widgets.Tintable
    public void tint() {
        C3040a c3040a = this.f65560a;
        if (c3040a != null) {
            c3040a.k();
        }
    }
}
