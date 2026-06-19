package com.bilibili.sistersplayer.hls;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/Hls7Player$fetchM3u8$1$fetchResult$1.class */
public final /* synthetic */ class Hls7Player$fetchM3u8$1$fetchResult$1 extends FunctionReferenceImpl implements Function0<Boolean> {
    public Hls7Player$fetchM3u8$1$fetchResult$1(Object obj) {
        super(0, obj, Hls7Player.class, "canRetry", "canRetry()Z", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final Boolean m9720invoke() {
        return Boolean.valueOf(((Hls7Player) ((CallableReference) this).receiver).canRetry());
    }
}
