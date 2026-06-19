package com.bilibili.magicasakura.widgets;

import Wg0.C3040a;
import Wg0.b;
import Wg0.c;
import Wg0.h;
import Wg0.i;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.widget.CompoundButtonCompat;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.utils.TintManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/magicasakura/widgets/TintCheckBox.class */
public class TintCheckBox extends AppCompatCheckBox implements Tintable, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3040a f65517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f65518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f65519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f65520d;

    public TintCheckBox(Context context) {
        this(context, null);
    }

    public TintCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [Wg0.b, Wg0.h] */
    /* JADX WARN: Type inference failed for: r0v6, types: [Wg0.a, Wg0.b] */
    /* JADX WARN: Type inference failed for: r0v9, types: [Wg0.b, Wg0.c] */
    public TintCheckBox(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        if (isInEditMode()) {
            return;
        }
        TintManager tintManager = TintManager.get(getContext());
        ?? bVar = new b(this, tintManager);
        this.f65517a = bVar;
        bVar.b(attributeSet, i7);
        ?? bVar2 = new b(this, tintManager);
        this.f65518b = bVar2;
        bVar2.b(attributeSet, i7);
        ?? bVar3 = new b(this, tintManager);
        this.f65519c = bVar3;
        bVar3.b(attributeSet, i7);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (ThemeUtils.isSkipAnimatedSelector()) {
            Drawable buttonDrawable = CompoundButtonCompat.getButtonDrawable(this);
            try {
                if (!(ThemeUtils.getWrapperDrawable(buttonDrawable) instanceof AnimatedStateListDrawable) || buttonDrawable == null) {
                    return;
                }
                buttonDrawable.jumpToCurrentState();
            } catch (NoClassDefFoundError e7) {
                e7.printStackTrace();
            }
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        c cVar = this.f65518b;
        if (cVar != null) {
            cVar.getClass();
        }
        return compoundPaddingLeft;
    }

    @Override // Wg0.i
    public int getViewThemeId() {
        return this.f65520d;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        super.setBackgroundColor(i7);
        C3040a c3040a = this.f65517a;
        if (c3040a != null) {
            c3040a.e(i7);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3040a c3040a = this.f65517a;
        if (c3040a != null) {
            c3040a.g(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i7) {
        C3040a c3040a = this.f65517a;
        if (c3040a != null) {
            c3040a.h(i7);
        } else {
            super.setBackgroundResource(i7);
        }
    }

    public void setBackgroundTintList(int i7) {
        C3040a c3040a = this.f65517a;
        if (c3040a != null) {
            c3040a.i(i7, null);
        }
    }

    public void setBackgroundTintList(int i7, PorterDuff.Mode mode) {
        C3040a c3040a = this.f65517a;
        if (c3040a != null) {
            c3040a.i(i7, mode);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(@DrawableRes int i7) {
        c cVar = this.f65518b;
        if (cVar != null) {
            cVar.c(i7);
        } else {
            super.setButtonDrawable(i7);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    @Nullable
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        c cVar = this.f65518b;
        if (cVar == null || cVar.a()) {
            return;
        }
        cVar.f26847f = 0;
        cVar.f26848g = 0;
        Ug0.h hVar = cVar.f26846e;
        if (hVar != null) {
            hVar.f24726d = false;
            hVar.f24723a = null;
        }
        cVar.f26844c = false;
    }

    public void setCompoundButtonTintList(int i7) {
        c cVar = this.f65518b;
        if (cVar != null) {
            cVar.e(i7, null);
        }
    }

    public void setCompoundButtonTintList(int i7, PorterDuff.Mode mode) {
        c cVar = this.f65518b;
        if (cVar != null) {
            cVar.e(i7, mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i7) {
        super.setTextAppearance(i7);
        h hVar = this.f65519c;
        if (hVar != null) {
            hVar.e(i7, true);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        h hVar = this.f65519c;
        if (hVar != null) {
            hVar.e(i7, true);
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(int i7) {
        super.setTextColor(i7);
        h hVar = this.f65519c;
        if (hVar != null) {
            hVar.f();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        h hVar = this.f65519c;
        if (hVar != null) {
            hVar.f();
        }
    }

    public void setTextColorById(@ColorRes int i7) {
        h hVar = this.f65519c;
        if (hVar != null) {
            hVar.g(i7);
        }
    }

    @Override // Wg0.i
    public void setViewThemeId(int i7) {
        this.f65520d = i7;
        h hVar = this.f65519c;
        if (hVar != null) {
            hVar.f26845d = i7;
        }
        c cVar = this.f65518b;
        if (cVar != null) {
            cVar.f26845d = i7;
        }
        C3040a c3040a = this.f65517a;
        if (c3040a != null) {
            c3040a.f26845d = i7;
        }
    }

    @Override // com.bilibili.magicasakura.widgets.Tintable
    public void tint() {
        h hVar = this.f65519c;
        if (hVar != null) {
            hVar.h();
        }
        c cVar = this.f65518b;
        if (cVar != null) {
            cVar.g();
        }
        C3040a c3040a = this.f65517a;
        if (c3040a != null) {
            c3040a.k();
        }
    }
}
