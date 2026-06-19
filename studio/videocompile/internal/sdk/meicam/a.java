package com.bilibili.studio.videocompile.internal.sdk.meicam;

import com.bilibili.studio.kaleidoscope.sdk.StreamingContext;
import com.bilibili.studio.kaleidoscope.sdk.Timeline;
import com.bilibili.studio.kaleidoscope.sdk.VideoResolution;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/internal/sdk/meicam/a.class */
public final class a implements OA0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public Timeline f108764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public StreamingContext f108765b;

    public final void a(int i7) {
        this.f108764a.changeVideoBitDepth(i7);
    }

    public final int b() {
        VideoResolution videoRes = this.f108764a.getVideoRes();
        return videoRes != null ? videoRes.getImageHeight() : 1920;
    }

    public final int c() {
        VideoResolution videoRes = this.f108764a.getVideoRes();
        return videoRes != null ? videoRes.getImageWidth() : 1080;
    }

    @Override // OA0.a
    @NotNull
    public final String getClassTag() {
        return "BVideoCompileMeicamSDK";
    }
}
