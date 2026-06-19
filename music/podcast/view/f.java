package com.bilibili.music.podcast.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.GravityCompat;
import com.bilibili.lib.image2.bean.RoundingParams;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.facebook.drawee.drawable.RoundedColorDrawable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.utils.DpUtils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/f.class */
public final class f extends RoundedColorDrawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f67232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f67233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Rect f67234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Drawable f67235d;

    public f(@NotNull Context context, @ColorInt int i7, int i8, int i9, @Nullable RoundingParams roundingParams, boolean z6) {
        Drawable drawable;
        super(i7);
        this.f67232a = i8;
        this.f67233b = i9;
        this.f67234c = new Rect();
        if (i8 == 0 && i9 == 0) {
            int iDp2px = (int) DpUtils.dp2px(context, 72.0f);
            this.f67232a = iDp2px;
            this.f67233b = iDp2px;
        }
        boolean zIsNightTheme = z6 ? true : MultipleThemeUtils.isNightTheme(context);
        Drawable drawable2 = ContextCompat.getDrawable(context, 2131236331);
        if (drawable2 != null) {
            DrawableCompat.setTint(drawable2, ContextCompat.getColor(context, zIsNightTheme ? 2131103227 : 2131103226));
            drawable = drawable2;
        } else {
            drawable = null;
        }
        this.f67235d = drawable;
        if (roundingParams != null) {
            setCircle(roundingParams.getRoundAsCircle());
            setRadii(roundingParams.getCornersRadii());
            setBorder(roundingParams.getBorderColor(), roundingParams.getBorderWidth());
            setPadding(roundingParams.getPadding());
            setScaleDownInsideBorders(roundingParams.getScaleDownInsideBorders());
        }
    }

    public /* synthetic */ f(Context context, int i7, int i8, int i9, RoundingParams roundingParams, boolean z6, int i10) {
        this(context, i7, (i10 & 4) != 0 ? 0 : i8, (i10 & 8) != 0 ? 0 : i9, roundingParams, (i10 & 32) != 0 ? false : z6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void draw(@NotNull Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f67235d;
        if (drawable != null) {
            GravityCompat.apply(17, this.f67232a, this.f67233b, getBounds(), this.f67234c, 0);
            drawable.setBounds(this.f67234c);
            drawable.draw(canvas);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Drawable mutate() {
        return this;
    }
}
