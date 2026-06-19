package com.bilibili.magicasakura.widgets;

import Ug0.C2905c;
import Ug0.h;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.utils.TintManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/magicasakura/widgets/a.class */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f65572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TintSwitchCompat f65573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TintManager f65574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f65575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC0366a f65576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h f65577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f65578g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f65579i;

    /* JADX INFO: renamed from: com.bilibili.magicasakura.widgets.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/magicasakura/widgets/a$a.class */
    public interface InterfaceC0366a {
        Drawable getDrawable();

        void setDrawable(Drawable drawable);
    }

    public a(TintSwitchCompat tintSwitchCompat, TintManager tintManager, int[] iArr, @NonNull InterfaceC0366a interfaceC0366a) {
        this.f65572a = iArr;
        this.f65574c = tintManager;
        this.f65573b = tintSwitchCompat;
        this.f65576e = interfaceC0366a;
    }

    public final boolean a() {
        h hVar;
        Drawable drawable = this.f65576e.getDrawable();
        if (drawable == null || (hVar = this.f65577f) == null || !hVar.f24726d) {
            return false;
        }
        Drawable drawableWrap = DrawableCompat.wrap(drawable.mutate());
        h hVar2 = this.f65577f;
        if (hVar2.f24726d) {
            DrawableCompat.setTintList(drawableWrap, hVar2.f24723a);
        }
        h hVar3 = this.f65577f;
        if (hVar3.f24725c) {
            DrawableCompat.setTintMode(drawableWrap, hVar3.f24724b);
        }
        if (drawableWrap.isStateful()) {
            drawableWrap.setState(this.f65573b.getDrawableState());
        }
        if (this.f65575d) {
            this.f65575d = false;
        } else {
            this.f65575d = true;
            this.f65576e.setDrawable(drawableWrap);
        }
        if (drawable != drawableWrap) {
            return true;
        }
        drawableWrap.invalidateSelf();
        return true;
    }

    public final void b(AttributeSet attributeSet, int i7) {
        TypedArray typedArrayObtainStyledAttributes = this.f65573b.getContext().obtainStyledAttributes(attributeSet, this.f65572a, i7, 0);
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.h = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            if (typedArrayObtainStyledAttributes.hasValue(2)) {
                PorterDuff.Mode modeK = C2905c.k(typedArrayObtainStyledAttributes.getInt(2, 0), null);
                this.f65579i = modeK;
                g(modeK);
            }
            f(this.h);
        } else {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            this.f65578g = resourceId;
            Drawable drawable = this.f65574c.getDrawable(resourceId, 0);
            if (drawable != null) {
                if (this.f65575d) {
                    this.f65575d = false;
                } else {
                    this.f65575d = true;
                    this.f65576e.setDrawable(drawable);
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void c(int i7, PorterDuff.Mode mode) {
        if (this.h != i7) {
            this.h = i7;
            h hVar = this.f65577f;
            if (hVar != null) {
                hVar.f24726d = false;
                hVar.f24723a = null;
                hVar.f24725c = false;
                hVar.f24724b = null;
            }
            g(mode);
            f(i7);
        }
    }

    public final void d(int i7) {
        if (this.f65578g != i7) {
            this.f65578g = i7;
            this.h = 0;
            this.f65579i = null;
            h hVar = this.f65577f;
            if (hVar != null) {
                hVar.f24726d = false;
                hVar.f24723a = null;
                hVar.f24725c = false;
                hVar.f24724b = null;
            }
            if (i7 != 0) {
                Drawable drawable = this.f65574c.getDrawable(i7, 0);
                if (drawable == null) {
                    drawable = ContextCompat.getDrawable(this.f65573b.getContext(), i7);
                }
                if (this.f65575d) {
                    this.f65575d = false;
                } else {
                    this.f65575d = true;
                    this.f65576e.setDrawable(drawable);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [Ug0.h, java.lang.Object] */
    public final void e(ColorStateList colorStateList) {
        ColorStateList themeColorStateList = ThemeUtils.getThemeColorStateList(this.f65573b.getContext(), colorStateList);
        if (this.f65577f == null) {
            this.f65577f = new Object();
        }
        h hVar = this.f65577f;
        hVar.f24726d = true;
        hVar.f24723a = themeColorStateList;
        a();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [Ug0.h, java.lang.Object] */
    public final boolean f(int i7) {
        if (i7 != 0) {
            if (this.f65577f == null) {
                this.f65577f = new Object();
            }
            h hVar = this.f65577f;
            hVar.f24726d = true;
            hVar.f24723a = this.f65574c.getColorStateList(i7, 0);
        }
        return a();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [Ug0.h, java.lang.Object] */
    public final void g(PorterDuff.Mode mode) {
        if (mode != null) {
            if (this.f65577f == null) {
                this.f65577f = new Object();
            }
            h hVar = this.f65577f;
            hVar.f24725c = true;
            hVar.f24724b = mode;
        }
    }

    public final void h() {
        int i7 = this.h;
        if (i7 == 0 || !f(i7)) {
            Drawable drawable = this.f65574c.getDrawable(this.f65578g, 0);
            Drawable drawable2 = drawable;
            if (drawable == null) {
                drawable2 = this.f65578g == 0 ? null : ContextCompat.getDrawable(this.f65573b.getContext(), this.f65578g);
            }
            if (this.f65575d) {
                this.f65575d = false;
            } else {
                this.f65575d = true;
                this.f65576e.setDrawable(drawable2);
            }
        }
    }
}
