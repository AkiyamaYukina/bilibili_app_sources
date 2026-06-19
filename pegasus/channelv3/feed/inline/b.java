package com.bilibili.pegasus.channelv3.feed.inline;

import I3.C2204b2;
import Ua.T;
import Ua.U;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.inline.control.IInlineControl;
import com.bilibili.pegasus.channelv3.movie.video.ChannelMovieVideoFragment;
import kotlin.Lazy;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/feed/inline/b.class */
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ChannelMovieVideoFragment f75321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f75322b = ListExtentionsKt.lazyUnsafe(new C2204b2(9));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f75323c = ListExtentionsKt.lazyUnsafe(new T(this, 2));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f75324d = ListExtentionsKt.lazyUnsafe(new U(this, 2));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public IInlineControl f75325e;

    public b(@NotNull ChannelMovieVideoFragment channelMovieVideoFragment) {
        this.f75321a = channelMovieVideoFragment;
    }
}
