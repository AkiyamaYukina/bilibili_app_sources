package com.bilibili.ship.theseus.united.page.videoquality;

import android.graphics.Canvas;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import com.bilibili.ship.theseus.united.page.videoquality.L;
import com.opensource.svgaplayer.SVGACanvasDrawer;
import com.opensource.svgaplayer.SVGADynamicEntity;
import com.opensource.svgaplayer.SVGARect;
import com.opensource.svgaplayer.SVGAVideoEntity;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/N.class */
@StabilityInferred(parameters = 0)
public abstract class N extends Painter {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final a f103733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f103734g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/N$a.class */
    public static final class a extends SVGACanvasDrawer {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public long f103735o;

        public final void performScaleType(Canvas canvas, ImageView.ScaleType scaleType) {
            getScaleEntity().performScaleType(Float.intBitsToFloat((int) (this.f103735o >> 32)), Float.intBitsToFloat((int) (this.f103735o & 4294967295L)), (float) getVideoItem().getVideoSize().getWidth(), (float) getVideoItem().getVideoSize().getHeight(), scaleType);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bilibili.ship.theseus.united.page.videoquality.N$a, com.opensource.svgaplayer.SVGACanvasDrawer] */
    public N(@NotNull SVGAVideoEntity sVGAVideoEntity) {
        ?? sVGACanvasDrawer = new SVGACanvasDrawer(sVGAVideoEntity, new SVGADynamicEntity());
        sVGACanvasDrawer.f103735o = Size.Companion.m2535getUnspecifiedNHjbRc();
        this.f103733f = sVGACanvasDrawer;
        SVGARect videoSize = sVGAVideoEntity.getVideoSize();
        this.f103734g = Size.m2518constructorimpl((((long) Float.floatToRawIntBits((float) videoSize.getWidth())) << 32) | (((long) Float.floatToRawIntBits((float) videoSize.getHeight())) & 4294967295L));
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo286getIntrinsicSizeNHjbRc() {
        return this.f103734g;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void onDraw(@NotNull DrawScope drawScope) {
        androidx.compose.ui.graphics.Canvas canvas = drawScope.getDrawContext().getCanvas();
        long jMo2935getSizeNHjbRc = drawScope.mo2935getSizeNHjbRc();
        a aVar = this.f103733f;
        aVar.f103735o = jMo2935getSizeNHjbRc;
        aVar.drawFrame(AndroidCanvas_androidKt.getNativeCanvas(canvas), (int) (Math.nextAfter(r0.f103732j.getFrames(), Double.NEGATIVE_INFINITY) * ((L.a) this).h.getValue().floatValue()), ImageView.ScaleType.MATRIX);
    }
}
