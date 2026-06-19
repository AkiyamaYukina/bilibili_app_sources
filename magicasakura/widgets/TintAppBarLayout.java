package com.bilibili.magicasakura.widgets;

import Wg0.C3040a;
import Wg0.b;
import Wg0.i;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bilibili.magicasakura.utils.TintManager;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/magicasakura/widgets/TintAppBarLayout.class */
public class TintAppBarLayout extends AppBarLayout implements Tintable, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3040a f65511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f65512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f65513c;

    public TintAppBarLayout(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [Wg0.a, Wg0.b] */
    public TintAppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f65512b = true;
        if (isInEditMode()) {
            return;
        }
        ?? bVar = new b(this, TintManager.get(context));
        this.f65511a = bVar;
        bVar.b(attributeSet, 0);
    }

    @Override // Wg0.i
    public int getViewThemeId() {
        return this.f65513c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBackgroundColor(int i7) {
        super/*android.widget.LinearLayout*/.setBackgroundColor(i7);
        C3040a c3040a = this.f65511a;
        if (c3040a != null) {
            c3040a.e(i7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBackgroundDrawable(Drawable drawable) {
        super/*android.widget.LinearLayout*/.setBackgroundDrawable(drawable);
        C3040a c3040a = this.f65511a;
        if (c3040a != null) {
            c3040a.g(drawable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBackgroundResource(int i7) {
        C3040a c3040a = this.f65511a;
        if (c3040a != null) {
            c3040a.h(i7);
        } else {
            super/*android.widget.LinearLayout*/.setBackgroundResource(i7);
        }
    }

    public void setBackgroundTintList(int i7) {
        C3040a c3040a = this.f65511a;
        if (c3040a != null) {
            c3040a.i(i7, null);
        }
    }

    public void setBackgroundTintList(int i7, PorterDuff.Mode mode) {
        C3040a c3040a = this.f65511a;
        if (c3040a != null) {
            c3040a.i(i7, mode);
        }
    }

    public void setTintable(boolean z6) {
        this.f65512b = z6;
    }

    @Override // Wg0.i
    public void setViewThemeId(int i7) {
        this.f65513c = i7;
        C3040a c3040a = this.f65511a;
        if (c3040a != null) {
            c3040a.f26845d = i7;
        }
    }

    @Override // com.bilibili.magicasakura.widgets.Tintable
    public void tint() {
        C3040a c3040a;
        if (this.f65512b && (c3040a = this.f65511a) != null) {
            c3040a.k();
        }
    }
}
