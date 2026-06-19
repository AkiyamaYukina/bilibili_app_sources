package com.bilibili.ship.theseus.ogv.intro.floatlayer;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/OgvActorInfoFragment$loadPersonInfo$1.class */
final class OgvActorInfoFragment$loadPersonInfo$1 extends ContinuationImpl {
    long J$0;
    int label;
    Object result;
    final OgvActorInfoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvActorInfoFragment$loadPersonInfo$1(OgvActorInfoFragment ogvActorInfoFragment, Continuation<? super OgvActorInfoFragment$loadPersonInfo$1> continuation) {
        super(continuation);
        this.this$0 = ogvActorInfoFragment;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return OgvActorInfoFragment.jf(this.this$0, 0L, this);
    }
}
