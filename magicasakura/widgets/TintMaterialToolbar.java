package com.bilibili.magicasakura.widgets;

import Sg0.C2862a;
import Wg0.C3040a;
import Wg0.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.Nullable;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.utils.TintManager;
import com.google.android.material.appbar.MaterialToolbar;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/magicasakura/widgets/TintMaterialToolbar.class */
public class TintMaterialToolbar extends MaterialToolbar implements Tintable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3040a f65534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f65535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f65536c;

    public TintMaterialToolbar(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [Wg0.a, Wg0.b] */
    public TintMaterialToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130971227);
        this.f65535b = 0;
        this.f65536c = 0;
        if (isInEditMode()) {
            return;
        }
        ?? bVar = new b(this, TintManager.get(getContext()));
        this.f65534a = bVar;
        bVar.b(attributeSet, 2130971227);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2862a.f22934i, 2130971227, 0);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            this.f65536c = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f65535b = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.drawable.Drawable d(@androidx.annotation.ColorInt int r3, @androidx.annotation.NonNull android.graphics.drawable.Drawable r4) {
        /*
            r0 = r4
            boolean r0 = r0 instanceof S0.b
            if (r0 == 0) goto L25
            r0 = r4
            S0.b r0 = (S0.b) r0
            r5 = r0
            r0 = r5
            android.graphics.drawable.Drawable r0 = r0.b()
            if (r0 == 0) goto L25
            r0 = r5
            android.graphics.drawable.Drawable r0 = r0.b()
            android.graphics.drawable.Drawable r0 = r0.mutate()
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r0)
            r4 = r0
            goto L2d
        L25:
            r0 = r4
            android.graphics.drawable.Drawable r0 = r0.mutate()
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r0)
            r4 = r0
        L2d:
            r0 = r4
            r1 = r3
            androidx.core.graphics.drawable.DrawableCompat.setTint(r0, r1)
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.magicasakura.widgets.TintMaterialToolbar.d(int, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        if (this.f65536c != 0) {
            setNavigationIcon(getNavigationIcon());
            setOverflowIcon(getOverflowIcon());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        if (this.f65535b != 0) {
            setTitleTextColor(ThemeUtils.getColorById(getContext(), this.f65535b));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable c(@androidx.annotation.NonNull android.graphics.drawable.Drawable r4) {
        /*
            r3 = this;
            r0 = r3
            android.content.Context r0 = r0.getContext()
            r1 = r3
            int r1 = r1.f65536c
            int r0 = com.bilibili.magicasakura.utils.ThemeUtils.getColorById(r0, r1)
            r5 = r0
            r0 = r4
            boolean r0 = r0 instanceof S0.b
            if (r0 == 0) goto L31
            r0 = r4
            S0.b r0 = (S0.b) r0
            r6 = r0
            r0 = r6
            android.graphics.drawable.Drawable r0 = r0.b()
            if (r0 == 0) goto L31
            r0 = r6
            android.graphics.drawable.Drawable r0 = r0.b()
            android.graphics.drawable.Drawable r0 = r0.mutate()
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r0)
            r4 = r0
            goto L39
        L31:
            r0 = r4
            android.graphics.drawable.Drawable r0 = r0.mutate()
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r0)
            r4 = r0
        L39:
            r0 = r4
            r1 = r5
            androidx.core.graphics.drawable.DrawableCompat.setTint(r0, r1)
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.magicasakura.widgets.TintMaterialToolbar.c(android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onFinishInflate() {
        super/*android.view.ViewGroup*/.onFinishInflate();
        if (this.f65536c != 0) {
            a();
        }
        if (this.f65535b != 0) {
            b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBackgroundColor(int i7) {
        super/*android.view.ViewGroup*/.setBackgroundColor(i7);
        C3040a c3040a = this.f65534a;
        if (c3040a != null) {
            c3040a.e(i7);
        }
    }

    public void setBackgroundColorWithGarb(@ColorInt int i7) {
        setBackgroundColor(i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBackgroundDrawable(Drawable drawable) {
        super/*android.view.ViewGroup*/.setBackgroundDrawable(drawable);
        C3040a c3040a = this.f65534a;
        if (c3040a != null) {
            c3040a.g(drawable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBackgroundResource(int i7) {
        C3040a c3040a = this.f65534a;
        if (c3040a != null) {
            c3040a.h(i7);
        } else {
            super/*android.view.ViewGroup*/.setBackgroundResource(i7);
        }
    }

    public void setBackgroundTintList(int i7) {
        C3040a c3040a = this.f65534a;
        if (c3040a != null) {
            c3040a.i(i7, null);
        }
    }

    public void setIconTintColorResource(@ColorRes int i7) {
        this.f65536c = i7;
        if (i7 != 0) {
            a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setIconTintColorWithGarb(@ColorInt int i7) {
        if (i7 == 0) {
            a();
            return;
        }
        Drawable navigationIcon = getNavigationIcon();
        if (i7 == 0) {
            setNavigationIcon(navigationIcon);
        } else if (navigationIcon != null) {
            super.setNavigationIcon(d(i7, navigationIcon));
        } else {
            super.setNavigationIcon((Drawable) null);
        }
        Drawable overflowIcon = getOverflowIcon();
        if (i7 == 0) {
            setOverflowIcon(overflowIcon);
        } else if (overflowIcon != null) {
            super/*androidx.appcompat.widget.Toolbar*/.setOverflowIcon(d(i7, overflowIcon));
        } else {
            super/*androidx.appcompat.widget.Toolbar*/.setOverflowIcon(overflowIcon);
        }
    }

    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (this.f65536c == 0 || drawable == null) {
            super.setNavigationIcon(drawable);
        } else {
            super.setNavigationIcon(c(drawable));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setOverflowIcon(@Nullable Drawable drawable) {
        if (this.f65536c == 0 || drawable == null) {
            super/*androidx.appcompat.widget.Toolbar*/.setOverflowIcon(drawable);
        } else {
            super/*androidx.appcompat.widget.Toolbar*/.setOverflowIcon(c(drawable));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTitleColorWithGarb(@ColorInt int i7) {
        if (i7 == 0) {
            b();
        } else {
            setTitleTextColor(i7);
        }
    }

    public void setTitleTintColorResource(@ColorRes int i7) {
        this.f65535b = i7;
        if (i7 != 0) {
            b();
        }
    }

    @Override // com.bilibili.magicasakura.widgets.Tintable
    public final void tint() {
        C3040a c3040a = this.f65534a;
        if (c3040a != null) {
            c3040a.k();
        }
        if (this.f65536c != 0) {
            a();
        }
        if (this.f65535b != 0) {
            b();
        }
    }
}
