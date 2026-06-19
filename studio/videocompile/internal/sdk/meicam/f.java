package com.bilibili.studio.videocompile.internal.sdk.meicam;

import LA0.d;
import com.bilibili.studio.kaleidoscope.sdk.StreamingContext;
import com.bilibili.studio.kaleidoscope.sdk.Timeline;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/internal/sdk/meicam/f.class */
public final class f implements StreamingContext.CompileCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d.b f108777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f108778b;

    public f(d.b bVar, g gVar) {
        this.f108777a = bVar;
        this.f108778b = gVar;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext.CompileCallback
    public final void onCompileFailed(Timeline timeline) {
        OA0.b.c(this.f108778b, "setCompileCallback:onCompileFailed: " + timeline);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext.CompileCallback
    public final void onCompileFinished(Timeline timeline) {
        OA0.b.c(this.f108778b, "setCompileCallback:onCompileFinished: " + timeline);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.StreamingContext.CompileCallback
    public final void onCompileProgress(Timeline timeline, int i7) {
        this.f108777a.onCompileProgress2(i7);
    }
}
