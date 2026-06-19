package com.bilibili.lib.projection.internal.search.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.bilibili.lib.image2.view.BiliImageView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/view/ProjectionFullCircleImageView.class */
public final class ProjectionFullCircleImageView extends BiliImageView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final float[] f63818m;

    public ProjectionFullCircleImageView(@NotNull Context context) {
        this(context, null);
    }

    public ProjectionFullCircleImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        float floatPx = NewPlayerUtilsKt.toFloatPx(8.0f);
        this.f63818m = new float[]{floatPx, floatPx, floatPx, floatPx, floatPx, floatPx, floatPx, floatPx};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDraw(@NotNull Canvas canvas) {
        Path path = new Path();
        path.addRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), this.f63818m, Path.Direction.CW);
        canvas.clipPath(path);
        super/*com.bilibili.lib.image2.view.InnerInsulateImageView*/.onDraw(canvas);
    }
}
