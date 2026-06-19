package com.bilibili.ogv.kmm.operation.vippreview;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.MediaStrategyItem;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/vippreview/t.class */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f68975a;

    public /* synthetic */ t(int i7) {
        this.f68975a = i7;
    }

    public final Object invoke(Object obj) {
        switch (this.f68975a) {
            case 0:
                ContentDrawScope contentDrawScope = (ContentDrawScope) obj;
                Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
                canvas.saveLayer(RectKt.m2496Recttz77jQw(Offset.Companion.m2471getZeroF1C5BW0(), contentDrawScope.mo2935getSizeNHjbRc()), AndroidPaint_androidKt.Paint());
                contentDrawScope.drawContent();
                Brush.Companion companion = Brush.Companion;
                Color.Companion companion2 = Color.Companion;
                DrawScope.m2910drawRectAsUm42w$default(contentDrawScope, Brush.Companion.m2579verticalGradient8A3gB4$default(companion, CollectionsKt.listOf(new Color[]{Color.m2619boximpl(companion2.m2655getBlack0d7_KjU()), Color.m2619boximpl(companion2.m2664getTransparent0d7_KjU()), Color.m2619boximpl(companion2.m2664getTransparent0d7_KjU())}), Float.intBitsToFloat((int) (contentDrawScope.mo2935getSizeNHjbRc() & 4294967295L)) * 0.6f, Float.intBitsToFloat((int) (4294967295L & contentDrawScope.mo2935getSizeNHjbRc())), 0, 8, (Object) null), 0L, contentDrawScope.mo2935getSizeNHjbRc(), 0.0f, null, null, 6, 58, null);
                canvas.restore();
                return Unit.INSTANCE;
            case 1:
                return ((MediaStrategyItem) obj).getMaterialKey();
            default:
                return String.valueOf(((Integer) obj).intValue());
        }
    }
}
