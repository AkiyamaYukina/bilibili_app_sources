package com.bilibili.ship.theseus.ogv.intro.section.floatlayer;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvSectionFloatLayerService$requestFeatureEpisodes$1.class */
final class OgvSectionFloatLayerService$requestFeatureEpisodes$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    Object result;
    final OgvSectionFloatLayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvSectionFloatLayerService$requestFeatureEpisodes$1(OgvSectionFloatLayerService ogvSectionFloatLayerService, Continuation<? super OgvSectionFloatLayerService$requestFeatureEpisodes$1> continuation) {
        super(continuation);
        this.this$0 = ogvSectionFloatLayerService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return OgvSectionFloatLayerService.b(this.this$0, 0L, null, null, null, this);
    }
}
