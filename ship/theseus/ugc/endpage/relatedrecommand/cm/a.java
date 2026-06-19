package com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.cm;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import com.bilibili.framework.exposure.core.transformer.ExposureAreaVisibilityTransformerKt;
import com.bilibili.framework.exposure.core.transformer.ExposureVisibleDurationTransformerKt;
import kotlin.jvm.functions.Function1;
import kotlin.time.Duration;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/relatedrecommand/cm/a.class */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f96883a;

    public /* synthetic */ a(int i7) {
        this.f96883a = i7;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    public final Object invoke(Object obj) {
        switch (this.f96883a) {
            case 0:
                return FlowKt.take(ExposureVisibleDurationTransformerKt.exposeIfNoticeableFor-HG0u8IE(ExposureAreaVisibilityTransformerKt.noticeableWhenAreaRatioIsAtLeast((Flow) obj, 0.0f), Duration.Companion.getZERO-UwyO8pc()), 1);
            default:
                return ((AnimatedContentTransitionScope) obj).using(AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 200, null, 4, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null)), AnimatedContentKt.SizeTransform(false, new Object()));
        }
    }
}
