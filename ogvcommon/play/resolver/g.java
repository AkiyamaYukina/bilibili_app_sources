package com.bilibili.ogvcommon.play.resolver;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.service.resolve.AbsMediaResourceResolveTask;
import tv.danmaku.biliplayerv2.service.resolve.CommonResolveTaskProvider;
import tv.danmaku.biliplayerv2.service.resolve.DownloadParams;
import tv.danmaku.biliplayerv2.service.resolve.NormalMediaResourceResolveTask;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/resolver/g.class */
@StabilityInferred(parameters = 1)
public final class g implements CommonResolveTaskProvider {
    @NotNull
    public final AbsMediaResourceResolveTask provideMediaSourceResolveTask(@NotNull Context context, boolean z6, boolean z7, @NotNull Video.PlayableParams playableParams) {
        return Intrinsics.areEqual(playableParams.getFrom(), "bangumi") ? new f(context.getApplicationContext(), playableParams) : new NormalMediaResourceResolveTask(true, context.getApplicationContext(), false, playableParams.getResolveParams(), (DownloadParams) null);
    }
}
