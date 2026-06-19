package com.bilibili.lib.projection.internal.search.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.bilibili.droid.ScreenUtil;
import com.bilibili.lib.image2.view.BiliImageView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/view/ProjectionCircleImageView.class */
public final class ProjectionCircleImageView extends BiliImageView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final float[] f63817m;

    public ProjectionCircleImageView(@NotNull Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProjectionCircleImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        float fDip2px = ScreenUtil.dip2px(getContext(), 8.0f);
        this.f63817m = new float[]{fDip2px, fDip2px, fDip2px, fDip2px, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDraw(@NotNull Canvas canvas) {
        Path path = new Path();
        path.addRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), this.f63817m, Path.Direction.CW);
        canvas.clipPath(path);
        super/*com.bilibili.lib.image2.view.InnerInsulateImageView*/.onDraw(canvas);
    }
}
