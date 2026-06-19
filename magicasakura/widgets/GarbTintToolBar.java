package com.bilibili.magicasakura.widgets;

import Sg0.C2862a;
import Wg0.C3040a;
import Wg0.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.utils.TintManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/magicasakura/widgets/GarbTintToolBar.class */
@Deprecated
public class GarbTintToolBar extends Toolbar implements Tintable {
    public static final int INVALID_ID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3040a f65506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f65507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f65508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f65509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f65510e;

    public GarbTintToolBar(Context context) {
        this(context, null);
    }

    public GarbTintToolBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130971227);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [Wg0.a, Wg0.b] */
    public GarbTintToolBar(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f65507b = 0;
        this.f65508c = 0;
        if (isInEditMode()) {
            return;
        }
        ?? bVar = new b(this, TintManager.get(getContext()));
        this.f65506a = bVar;
        bVar.b(attributeSet, i7);
        this.f65509d = bVar.f26837f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2862a.f22927a, i7, 0);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f65508c = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(4)) {
            this.f65507b = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            this.f65510e = typedArrayObtainStyledAttributes.getBoolean(2, false);
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
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.magicasakura.widgets.GarbTintToolBar.d(int, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }

    public final void a() {
        if (hasIconTint()) {
            setNavigationIcon(getNavigationIcon());
            setOverflowIcon(getOverflowIcon());
        }
    }

    public final void b() {
        if (hasTitleTint()) {
            setTitleTextColor(ThemeUtils.getColorById(getContext(), this.f65507b));
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
            int r1 = r1.f65508c
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
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.magicasakura.widgets.GarbTintToolBar.c(android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }

    public void clearCustomValue() {
        this.f65508c = 0;
        this.f65507b = 0;
    }

    public boolean hasIconTint() {
        return this.f65508c != 0;
    }

    public boolean hasTitleTint() {
        return this.f65507b != 0;
    }

    public boolean isGarbMode() {
        return this.f65510e;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (hasIconTint()) {
            a();
        }
        if (hasTitleTint()) {
            b();
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        super.setBackgroundColor(i7);
        C3040a c3040a = this.f65506a;
        if (c3040a != null) {
            c3040a.e(i7);
        }
    }

    public void setBackgroundColorWithGarb(@ColorInt int i7) {
        setBackgroundColor(i7);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3040a c3040a = this.f65506a;
        if (c3040a != null) {
            c3040a.g(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        C3040a c3040a = this.f65506a;
        if (c3040a != null) {
            c3040a.h(i7);
        } else {
            super.setBackgroundResource(i7);
        }
    }

    public void setBackgroundTintList(int i7) {
        C3040a c3040a = this.f65506a;
        if (c3040a != null) {
            c3040a.i(i7, null);
        }
    }

    public void setBackgroundTintList(int i7, PorterDuff.Mode mode) {
        C3040a c3040a = this.f65506a;
        if (c3040a != null) {
            c3040a.i(i7, mode);
        }
    }

    public void setGarbMode(boolean z6) {
        this.f65510e = z6;
    }

    public void setIconTintColorResource(@ColorRes int i7) {
        this.f65508c = i7;
        if (hasIconTint()) {
            a();
        }
    }

    public void setIconTintColorWithGarb(@ColorInt int i7) {
        if (i7 == 0) {
            a();
        } else {
            setNavigationIcon(getNavigationIcon(), i7);
            setOverflowIcon(getOverflowIcon(), i7);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (!hasIconTint() || drawable == null) {
            super.setNavigationIcon(drawable);
        } else {
            super.setNavigationIcon(c(drawable));
        }
    }

    public void setNavigationIcon(@Nullable Drawable drawable, @ColorInt int i7) {
        if (i7 == 0) {
            setNavigationIcon(drawable);
        } else if (drawable != null) {
            super.setNavigationIcon(d(i7, drawable));
        } else {
            super.setNavigationIcon((Drawable) null);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setOverflowIcon(@Nullable Drawable drawable) {
        if (!hasIconTint() || drawable == null) {
            super.setOverflowIcon(drawable);
        } else {
            super.setOverflowIcon(c(drawable));
        }
    }

    public void setOverflowIcon(@Nullable Drawable drawable, @ColorInt int i7) {
        if (i7 == 0) {
            setOverflowIcon(drawable);
        } else if (drawable != null) {
            super.setOverflowIcon(d(i7, drawable));
        } else {
            super.setOverflowIcon(drawable);
        }
    }

    public void setTitleColorWithGarb(@ColorInt int i7) {
        if (i7 == 0) {
            b();
        } else {
            setTitleTextColor(i7);
        }
    }

    public void setTitleTintColorResource(@ColorRes int i7) {
        this.f65507b = i7;
        if (hasTitleTint()) {
            b();
        }
    }

    @Override // com.bilibili.magicasakura.widgets.Tintable
    public void tint() {
        C3040a c3040a = this.f65506a;
        if (c3040a != null) {
            if (this.f65510e) {
                c3040a.h(this.f65509d);
            }
            this.f65506a.k();
        }
        if (hasIconTint()) {
            a();
        }
        if (hasTitleTint()) {
            b();
        }
    }
}
