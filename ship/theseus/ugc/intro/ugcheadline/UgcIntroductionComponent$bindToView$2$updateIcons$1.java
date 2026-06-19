package com.bilibili.ship.theseus.ugc.intro.ugcheadline;

import com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcIntroductionComponent;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcIntroductionComponent$bindToView$2$updateIcons$1.class */
public final class UgcIntroductionComponent$bindToView$2$updateIcons$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    Object result;

    public UgcIntroductionComponent$bindToView$2$updateIcons$1(Continuation<? super UgcIntroductionComponent$bindToView$2$updateIcons$1> continuation) {
        super(continuation);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return UgcIntroductionComponent.AnonymousClass2.invokeSuspend$updateIcons(null, null, null, null, null, null, null, null, null, null, null, null, null, this);
    }
}
