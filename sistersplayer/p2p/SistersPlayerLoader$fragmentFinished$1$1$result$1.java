package com.bilibili.sistersplayer.p2p;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/SistersPlayerLoader$fragmentFinished$1$1$result$1.class */
public final /* synthetic */ class SistersPlayerLoader$fragmentFinished$1$1$result$1 extends FunctionReferenceImpl implements Function0<Boolean> {
    public SistersPlayerLoader$fragmentFinished$1$1$result$1(Object obj) {
        super(0, obj, SistersPlayerLoader.class, "canRetry", "canRetry()Z", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final Boolean m9753invoke() {
        return Boolean.valueOf(((SistersPlayerLoader) ((CallableReference) this).receiver).canRetry());
    }
}
