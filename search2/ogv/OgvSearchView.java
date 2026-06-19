package com.bilibili.search2.ogv;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.magicasakura.widgets.TintTextView;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.SearchView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/ogv/OgvSearchView.class */
@StabilityInferred(parameters = 0)
public final class OgvSearchView extends SearchView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TintImageView f86945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TintTextView f86946b;

    @JvmOverloads
    public OgvSearchView(@Nullable Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public OgvSearchView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OgvSearchView(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f86945a = (TintImageView) findViewById(2131310902);
        this.f86946b = (TintTextView) findViewById(2131310909);
    }

    @Nullable
    public final Drawable getCancelDrawable() {
        return this.f86945a.getDrawable();
    }

    @ColorInt
    public final int getQueryTextColor() {
        return ((SearchView) this).mQueryTextView.getCurrentTextColor();
    }

    public final void setCancelDrawable(@Nullable Drawable drawable) {
        this.f86945a.setImageDrawable(drawable);
    }

    public final void setHintTextColor(@ColorInt int i7) {
        ((SearchView) this).mQueryTextView.setHintTextColor(i7);
    }

    public final void setQueryTextColor(int i7) {
        ((SearchView) this).mQueryTextView.setTextColor(i7);
        this.f86946b.setTextColor(i7);
    }

    public final void setTextSize(float f7) {
        ((SearchView) this).mQueryTextView.setTextSize(2, f7);
        this.f86946b.setTextSize(2, f7);
    }
}
