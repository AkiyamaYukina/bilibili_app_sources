package com.bilibili.opd.app.bizcommon.imageselector.widget;

import android.content.Context;
import android.graphics.ColorMatrixColorFilter;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.image2.view.legacy.ScalableImageView2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/widget/MallMediaImageView.class */
@StabilityInferred(parameters = 0)
public final class MallMediaImageView extends ScalableImageView2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f73944n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final float[] f73945o;

    public MallMediaImageView(@NotNull Context context) {
        super(context);
        this.f73945o = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
    }

    public MallMediaImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f73945o = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
    }

    public final int getViewHeight() {
        return this.f73944n;
    }

    public final void m(float f7) {
        float[] fArr = this.f73945o;
        fArr[0] = 1.0f;
        fArr[6] = 1.0f;
        fArr[12] = 1.0f;
        fArr[18] = f7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onWindowFocusChanged(boolean z6) {
        super/*android.widget.ImageView*/.onWindowFocusChanged(z6);
        this.f73944n = getTop();
    }

    public final void setCover(boolean z6) {
        if (z6) {
            m(0.5f);
        } else {
            m(0.7f);
        }
        setColorFilter(new ColorMatrixColorFilter(this.f73945o));
    }

    public final void setCover2(boolean z6) {
        m(0.5f);
        setColorFilter(new ColorMatrixColorFilter(this.f73945o));
    }

    public final void setFitNightMode(boolean z6) {
        if (z6) {
            m(0.9f);
        } else {
            float[] fArr = this.f73945o;
            fArr[0] = 1.0f;
            fArr[6] = 1.0f;
            fArr[12] = 1.0f;
            fArr[18] = 1.0f;
        }
        setColorFilter(new ColorMatrixColorFilter(this.f73945o));
    }

    public final void setViewHeight(int i7) {
        this.f73944n = i7;
    }
}
