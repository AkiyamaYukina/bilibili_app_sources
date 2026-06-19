package com.bilibili.ship.theseus.ogv.intro.floatlayer;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/OgvActorInfoFragment$loadWorksData$1.class */
final class OgvActorInfoFragment$loadWorksData$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    Object result;
    final OgvActorInfoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvActorInfoFragment$loadWorksData$1(OgvActorInfoFragment ogvActorInfoFragment, Continuation<? super OgvActorInfoFragment$loadWorksData$1> continuation) {
        super(continuation);
        this.this$0 = ogvActorInfoFragment;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.kf(0L, this);
    }
}
