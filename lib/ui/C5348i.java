package com.bilibili.lib.ui;

import Qf0.InterfaceC2826a;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.AbstractC4557a;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.bilibili.api.utils.c;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.lib.ui.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/i.class */
public final class C5348i extends FrameLayout implements InterfaceC2826a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SimpleDraweeView f64845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f64846b;

    /* JADX INFO: renamed from: com.bilibili.lib.ui.i$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/i$a.class */
    public static final class a extends AbstractC4557a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f64847c;

        public a(@NotNull Context context, @Nullable String str) {
            super(context);
            this.f64847c = str;
        }

        @Override // androidx.core.view.AbstractC4557a
        @NotNull
        public final View c() {
            C5348i c5348i = new C5348i(this.f47416a, 0);
            c5348i.setIcon(this.f64847c);
            return c5348i;
        }
    }

    @JvmOverloads
    public C5348i(@NotNull Context context) {
        this(context, 0);
    }

    public C5348i(Context context, int i7) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(2131494562, this);
        this.f64845a = findViewById(2131301546);
    }

    public final void a(@ColorInt int i7) {
        String str = this.f64846b;
        if (str == null) {
            return;
        }
        Drawable drawableCreate = VectorDrawableCompat.create(getContext().getResources(), 2131236644, null);
        DrawableCompat.setTint(DrawableCompat.wrap(drawableCreate.mutate()), i7);
        if (TextUtils.isDigitsOnly(str)) {
            Drawable drawable = ResourcesCompat.getDrawable(getContext().getResources(), Integer.parseInt(str), null);
            if (drawable != null) {
                DrawableCompat.setTint(DrawableCompat.wrap(drawable.mutate()), i7);
                drawableCreate = drawable;
            }
            this.f64845a.setImageDrawable(drawableCreate);
            return;
        }
        this.f64845a.setHierarchy(GenericDraweeHierarchyBuilder.newInstance(getContext().getResources()).setActualImageColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN)).setFadeDuration(0).setPlaceholderImage(drawableCreate).setFailureImage(drawableCreate).build());
        this.f64845a.setImageURI(com.bilibili.api.utils.a.a.a(c.a.a(str, 0, 0, ".webp", false)));
    }

    public final void setIcon(@Nullable String str) {
        this.f64846b = str;
        a(ThemeUtils.getColorById(getContext(), 2131103911));
    }

    @Override // Qf0.InterfaceC2826a
    public final void tint(@ColorInt int i7) {
        a(i7);
    }
}
