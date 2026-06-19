package com.bilibili.magicasakura.widgets;

import Sg0.C2862a;
import Wg0.C3040a;
import Wg0.c;
import Wg0.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.widget.CompoundButtonCompat;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.utils.TintManager;
import com.bilibili.magicasakura.widgets.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/magicasakura/widgets/TintSwitchCompat.class */
public class TintSwitchCompat extends SwitchCompat implements Tintable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3040a f65562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f65563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f65564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.bilibili.magicasakura.widgets.a f65565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.bilibili.magicasakura.widgets.a f65566e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/magicasakura/widgets/TintSwitchCompat$a.class */
    public final class a implements a.InterfaceC0366a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TintSwitchCompat f65567a;

        public a(TintSwitchCompat tintSwitchCompat) {
            this.f65567a = tintSwitchCompat;
        }

        @Override // com.bilibili.magicasakura.widgets.a.InterfaceC0366a
        public final Drawable getDrawable() {
            return this.f65567a.getThumbDrawable();
        }

        @Override // com.bilibili.magicasakura.widgets.a.InterfaceC0366a
        public final void setDrawable(Drawable drawable) {
            this.f65567a.setThumbDrawable(drawable);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/magicasakura/widgets/TintSwitchCompat$b.class */
    public final class b implements a.InterfaceC0366a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TintSwitchCompat f65568a;

        public b(TintSwitchCompat tintSwitchCompat) {
            this.f65568a = tintSwitchCompat;
        }

        @Override // com.bilibili.magicasakura.widgets.a.InterfaceC0366a
        public final Drawable getDrawable() {
            return this.f65568a.getTrackDrawable();
        }

        @Override // com.bilibili.magicasakura.widgets.a.InterfaceC0366a
        public final void setDrawable(Drawable drawable) {
            this.f65568a.setTrackDrawable(drawable);
        }
    }

    public TintSwitchCompat(Context context) {
        this(context, null);
    }

    public TintSwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130971075);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [Wg0.a, Wg0.b] */
    /* JADX WARN: Type inference failed for: r0v14, types: [Wg0.b, Wg0.c] */
    /* JADX WARN: Type inference failed for: r0v17, types: [Wg0.b, Wg0.h] */
    public TintSwitchCompat(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        if (isInEditMode()) {
            return;
        }
        TintManager tintManager = TintManager.get(context);
        com.bilibili.magicasakura.widgets.a aVar = new com.bilibili.magicasakura.widgets.a(this, tintManager, C2862a.f22932f, new a(this));
        this.f65565d = aVar;
        aVar.b(attributeSet, i7);
        com.bilibili.magicasakura.widgets.a aVar2 = new com.bilibili.magicasakura.widgets.a(this, tintManager, C2862a.f22933g, new b(this));
        this.f65566e = aVar2;
        aVar2.b(attributeSet, i7);
        ?? bVar = new Wg0.b(this, tintManager);
        this.f65562a = bVar;
        bVar.b(attributeSet, i7);
        ?? bVar2 = new Wg0.b(this, tintManager);
        this.f65563b = bVar2;
        bVar2.b(attributeSet, i7);
        ?? bVar3 = new Wg0.b(this, tintManager);
        this.f65564c = bVar3;
        bVar3.b(attributeSet, i7);
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
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

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        c cVar = this.f65563b;
        if (cVar != null) {
            cVar.getClass();
        }
        return compoundPaddingLeft;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        super.setBackgroundColor(i7);
        C3040a c3040a = this.f65562a;
        if (c3040a != null) {
            c3040a.e(i7);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3040a c3040a = this.f65562a;
        if (c3040a != null) {
            c3040a.g(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        C3040a c3040a = this.f65562a;
        if (c3040a != null) {
            c3040a.h(i7);
        } else {
            super.setBackgroundResource(i7);
        }
    }

    public void setBackgroundTintList(int i7) {
        C3040a c3040a = this.f65562a;
        if (c3040a != null) {
            c3040a.i(i7, null);
        }
    }

    public void setBackgroundTintList(int i7, PorterDuff.Mode mode) {
        C3040a c3040a = this.f65562a;
        if (c3040a != null) {
            c3040a.i(i7, mode);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(@DrawableRes int i7) {
        c cVar = this.f65563b;
        if (cVar != null) {
            cVar.c(i7);
        } else {
            super.setButtonDrawable(i7);
        }
    }

    @Override // android.widget.CompoundButton
    @Nullable
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        c cVar = this.f65563b;
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
        c cVar = this.f65563b;
        if (cVar != null) {
            cVar.e(i7, null);
        }
    }

    public void setCompoundButtonTintList(int i7, PorterDuff.Mode mode) {
        c cVar = this.f65563b;
        if (cVar != null) {
            cVar.e(i7, mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i7) {
        super.setTextAppearance(i7);
        h hVar = this.f65564c;
        if (hVar != null) {
            hVar.e(i7, true);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        h hVar = this.f65564c;
        if (hVar != null) {
            hVar.e(i7, true);
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(int i7) {
        super.setTextColor(i7);
        h hVar = this.f65564c;
        if (hVar != null) {
            hVar.f();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        h hVar = this.f65564c;
        if (hVar != null) {
            hVar.f();
        }
    }

    public void setTextColorById(@ColorRes int i7) {
        h hVar = this.f65564c;
        if (hVar != null) {
            hVar.g(i7);
        }
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(Drawable drawable) {
        super.setThumbDrawable(drawable);
        com.bilibili.magicasakura.widgets.a aVar = this.f65565d;
        if (aVar != null) {
            if (aVar.f65575d) {
                aVar.f65575d = false;
                return;
            }
            aVar.f65575d = true;
            aVar.f65578g = 0;
            aVar.h = 0;
            aVar.f65579i = null;
            Ug0.h hVar = aVar.f65577f;
            if (hVar != null) {
                hVar.f24726d = false;
                hVar.f24723a = null;
                hVar.f24725c = false;
                hVar.f24724b = null;
            }
            aVar.f65575d = false;
        }
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbResource(int i7) {
        com.bilibili.magicasakura.widgets.a aVar = this.f65565d;
        if (aVar != null) {
            aVar.d(i7);
        } else {
            super.setThumbResource(i7);
        }
    }

    public void setThumbTintList(int i7) {
        com.bilibili.magicasakura.widgets.a aVar = this.f65565d;
        if (aVar != null) {
            aVar.c(i7, null);
        }
    }

    public void setThumbTintList(int i7, PorterDuff.Mode mode) {
        com.bilibili.magicasakura.widgets.a aVar = this.f65565d;
        if (aVar != null) {
            aVar.c(i7, mode);
        }
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(@Nullable ColorStateList colorStateList) {
        com.bilibili.magicasakura.widgets.a aVar = this.f65565d;
        if (aVar != null) {
            aVar.e(colorStateList);
        } else {
            super.setThumbTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(@Nullable PorterDuff.Mode mode) {
        com.bilibili.magicasakura.widgets.a aVar = this.f65565d;
        if (aVar == null) {
            super.setThumbTintMode(mode);
            return;
        }
        if (mode == null || mode == aVar.f65579i) {
            return;
        }
        Ug0.h hVar = aVar.f65577f;
        if (hVar != null) {
            hVar.f24726d = false;
            hVar.f24723a = null;
        }
        aVar.g(mode);
        aVar.f(aVar.h);
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(Drawable drawable) {
        super.setTrackDrawable(drawable);
        com.bilibili.magicasakura.widgets.a aVar = this.f65566e;
        if (aVar != null) {
            if (aVar.f65575d) {
                aVar.f65575d = false;
                return;
            }
            aVar.f65575d = true;
            aVar.f65578g = 0;
            aVar.h = 0;
            aVar.f65579i = null;
            Ug0.h hVar = aVar.f65577f;
            if (hVar != null) {
                hVar.f24726d = false;
                hVar.f24723a = null;
                hVar.f24725c = false;
                hVar.f24724b = null;
            }
            aVar.f65575d = false;
        }
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackResource(int i7) {
        com.bilibili.magicasakura.widgets.a aVar = this.f65566e;
        if (aVar != null) {
            aVar.d(i7);
        } else {
            super.setTrackResource(i7);
        }
    }

    public void setTrackTintList(int i7) {
        com.bilibili.magicasakura.widgets.a aVar = this.f65566e;
        if (aVar != null) {
            aVar.c(i7, null);
        }
    }

    public void setTrackTintList(int i7, PorterDuff.Mode mode) {
        com.bilibili.magicasakura.widgets.a aVar = this.f65566e;
        if (aVar != null) {
            aVar.c(i7, mode);
        }
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(@Nullable ColorStateList colorStateList) {
        com.bilibili.magicasakura.widgets.a aVar = this.f65566e;
        if (aVar != null) {
            aVar.e(colorStateList);
        } else {
            super.setTrackTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(@Nullable PorterDuff.Mode mode) {
        com.bilibili.magicasakura.widgets.a aVar = this.f65566e;
        if (aVar == null) {
            super.setTrackTintMode(mode);
            return;
        }
        if (mode == null || mode == aVar.f65579i) {
            return;
        }
        Ug0.h hVar = aVar.f65577f;
        if (hVar != null) {
            hVar.f24726d = false;
            hVar.f24723a = null;
        }
        aVar.g(mode);
        aVar.f(aVar.h);
    }

    @Override // com.bilibili.magicasakura.widgets.Tintable
    public void tint() {
        h hVar = this.f65564c;
        if (hVar != null) {
            hVar.h();
        }
        c cVar = this.f65563b;
        if (cVar != null) {
            cVar.g();
        }
        C3040a c3040a = this.f65562a;
        if (c3040a != null) {
            c3040a.k();
        }
        com.bilibili.magicasakura.widgets.a aVar = this.f65566e;
        if (aVar != null) {
            aVar.h();
        }
        com.bilibili.magicasakura.widgets.a aVar2 = this.f65565d;
        if (aVar2 != null) {
            aVar2.h();
        }
    }
}
