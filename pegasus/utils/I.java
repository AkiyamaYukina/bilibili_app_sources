package com.bilibili.pegasus.utils;

import Up0.C2912a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.playerbizcommon.IVideoLikeRouteService;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/utils/I.class */
@StabilityInferred(parameters = 0)
public final class I implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C2912a<?, ?> f78863a;

    public I(@NotNull C2912a<?, ?> c2912a) {
        this.f78863a = c2912a;
    }

    @Override // com.bilibili.pegasus.utils.l
    public final void a(boolean z6) {
        Vp0.e.c(this.f78863a, IVideoLikeRouteService.ACTION_LIKE, z6 ? "1" : CaptureSchema.OLD_INVALID_ID_STRING, null, 12);
    }
}
