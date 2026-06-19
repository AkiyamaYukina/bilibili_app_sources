package com.bilibili.pegasus.widgets;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.statefulbutton.StatefulButton;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/widgets/ChannelStateFulButton.class */
@StabilityInferred(parameters = 0)
public final class ChannelStateFulButton extends StatefulButton {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f79167A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f79168B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @ColorInt
    public int f79169C;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f79170z;

    public ChannelStateFulButton(@NotNull Context context) {
        super(context);
    }

    public ChannelStateFulButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final float getDx() {
        return this.f79170z;
    }

    public final float getDy() {
        return this.f79167A;
    }

    public final int getMShadowColor() {
        return this.f79169C;
    }

    public final float getShadowRadius() {
        return this.f79168B;
    }

    public final void setDx(float f7) {
        this.f79170z = f7;
    }

    public final void setDy(float f7) {
        this.f79167A = f7;
    }

    public final void setMShadowColor(int i7) {
        this.f79169C = i7;
    }

    public final void setShadowRadius(float f7) {
        this.f79168B = f7;
    }

    public final void updateUI(boolean z6) {
        super.updateUI(z6);
        if (z6) {
            getText().setShadowLayer(this.f79168B, this.f79170z, this.f79167A, this.f79169C);
        } else {
            getText().setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        }
    }
}
