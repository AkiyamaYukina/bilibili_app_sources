package com.bilibili.ogv.operation2;

import com.opensource.svgaplayer.SVGAParser;
import com.opensource.svgaplayer.SVGAVideoEntity;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/g.class */
public final class g implements SVGAParser.ParseCompletion {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f70837a;

    public g(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f70837a = cancellableContinuationImpl;
    }

    public final void onCacheExist() {
    }

    public final void onComplete(SVGAVideoEntity sVGAVideoEntity) {
        this.f70837a.resumeWith(Result.constructor-impl(sVGAVideoEntity));
    }

    public final void onError() {
        this.f70837a.resumeWith(Result.constructor-impl((Object) null));
    }
}
