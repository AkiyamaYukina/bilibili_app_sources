package com.bilibili.magicasakura.widgets;

import Wg0.C3040a;
import Wg0.b;
import Wg0.h;
import Wg0.i;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.ColorRes;
import androidx.appcompat.widget.AppCompatButton;
import com.bilibili.magicasakura.utils.TintManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/magicasakura/widgets/TintButton.class */
public class TintButton extends AppCompatButton implements Tintable, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f65514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3040a f65515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f65516c;

    public TintButton(Context context) {
        this(context, null);
    }

    public TintButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [Wg0.a, Wg0.b] */
    /* JADX WARN: Type inference failed for: r0v8, types: [Wg0.b, Wg0.h] */
    public TintButton(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        if (isInEditMode()) {
            return;
        }
        TintManager tintManager = TintManager.get(context);
        ?? bVar = new b(this, tintManager);
        this.f65515b = bVar;
        bVar.b(attributeSet, i7);
        ?? bVar2 = new b(this, tintManager);
        this.f65514a = bVar2;
        bVar2.b(attributeSet, i7);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (getBackground() != null) {
            invalidateDrawable(getBackground());
        }
    }

    @Override // Wg0.i
    public int getViewThemeId() {
        return this.f65516c;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        super.setBackgroundColor(i7);
        C3040a c3040a = this.f65515b;
        if (c3040a != null) {
            c3040a.e(i7);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3040a c3040a = this.f65515b;
        if (c3040a != null) {
            c3040a.g(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i7) {
        C3040a c3040a = this.f65515b;
        if (c3040a != null) {
            c3040a.h(i7);
        } else {
            super.setBackgroundResource(i7);
        }
    }

    public void setBackgroundTintList(int i7) {
        C3040a c3040a = this.f65515b;
        if (c3040a != null) {
            c3040a.i(i7, null);
        }
    }

    public void setBackgroundTintList(int i7, PorterDuff.Mode mode) {
        C3040a c3040a = this.f65515b;
        if (c3040a != null) {
            c3040a.i(i7, mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i7) {
        super.setTextAppearance(i7);
        h hVar = this.f65514a;
        if (hVar != null) {
            hVar.e(i7, true);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        h hVar = this.f65514a;
        if (hVar != null) {
            hVar.e(i7, true);
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(int i7) {
        super.setTextColor(i7);
        h hVar = this.f65514a;
        if (hVar != null) {
            hVar.f();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        h hVar = this.f65514a;
        if (hVar != null) {
            hVar.f();
        }
    }

    public void setTextColorById(@ColorRes int i7) {
        h hVar = this.f65514a;
        if (hVar != null) {
            hVar.g(i7);
        }
    }

    @Override // Wg0.i
    public void setViewThemeId(int i7) {
        this.f65516c = i7;
        h hVar = this.f65514a;
        if (hVar != null) {
            hVar.f26845d = i7;
        }
        C3040a c3040a = this.f65515b;
        if (c3040a != null) {
            c3040a.f26845d = i7;
        }
    }

    @Override // com.bilibili.magicasakura.widgets.Tintable
    public void tint() {
        h hVar = this.f65514a;
        if (hVar != null) {
            hVar.h();
        }
        C3040a c3040a = this.f65515b;
        if (c3040a != null) {
            c3040a.k();
        }
    }
}
