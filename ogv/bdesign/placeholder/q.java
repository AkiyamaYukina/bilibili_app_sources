package com.bilibili.ogv.bdesign.placeholder;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.painter.Painter;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.search2.api.SearchBangumiItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.compose.resources.DrawableResource;
import org.jetbrains.compose.resources.ImageResourcesKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/bdesign/placeholder/q.class */
public final class q {
    @Composable
    @NotNull
    public static final Painter a(@Nullable Composer composer) {
        DrawableResource drawableResource;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1914387104, 0, -1, "com.bilibili.ogv.bdesign.placeholder.tvLoadingPainter (TvLoading.kt:17)");
        }
        switch (((Number) InfiniteTransitionKt.animateValue(InfiniteTransitionKt.rememberInfiniteTransition(null, composer, 0, 1), 0, 7, VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.p.a), AnimationSpecKt.m1137infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(SearchBangumiItem.TYPE_FULLNET_DOCUMENTARY, SearchBangumiItem.TYPE_FULLNET_DOCUMENTARY, null, 4, null), RepeatMode.Restart, 0L, 4, null), null, composer, InfiniteTransition.$stable | BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKIN_SEGMENT_MIN_THRESHOLD | (InfiniteRepeatableSpec.$stable << 12), 16).getValue()).intValue()) {
            case 0:
                drawableResource = (DrawableResource) Sa1.a.f.getValue();
                break;
            case 1:
                drawableResource = (DrawableResource) Sa1.a.g.getValue();
                break;
            case 2:
                drawableResource = (DrawableResource) Sa1.a.h.getValue();
                break;
            case 3:
                drawableResource = (DrawableResource) Sa1.a.i.getValue();
                break;
            case 4:
                drawableResource = (DrawableResource) Sa1.a.j.getValue();
                break;
            case 5:
                drawableResource = (DrawableResource) Sa1.a.k.getValue();
                break;
            case 6:
                drawableResource = (DrawableResource) Sa1.a.l.getValue();
                break;
            case 7:
                drawableResource = (DrawableResource) Sa1.a.m.getValue();
                break;
            default:
                throw new IllegalStateException("Not feasible.");
        }
        Painter painterPainterResource = ImageResourcesKt.painterResource(drawableResource, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return painterPainterResource;
    }
}
