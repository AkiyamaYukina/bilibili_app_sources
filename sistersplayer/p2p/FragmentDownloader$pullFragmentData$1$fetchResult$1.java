package com.bilibili.sistersplayer.p2p;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/FragmentDownloader$pullFragmentData$1$fetchResult$1.class */
public final /* synthetic */ class FragmentDownloader$pullFragmentData$1$fetchResult$1 extends FunctionReferenceImpl implements Function0<Boolean> {
    public FragmentDownloader$pullFragmentData$1$fetchResult$1(Object obj) {
        super(0, obj, FragmentDownloader.class, "canRetry", "canRetry()Z", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final Boolean m9738invoke() {
        return Boolean.valueOf(((FragmentDownloader) ((CallableReference) this).receiver).canRetry());
    }
}
