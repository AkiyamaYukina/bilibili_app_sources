package com.bilibili.pegasus.channelv2.detail.tab.baike.inline;

import I3.C2289z1;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.bililive.room.biz.shopping.view.B0;
import com.bilibili.inline.control.IInlineControl;
import com.bilibili.pegasus.channelv2.detail.tab.baike.ChannelBaikeSelectFragment;
import kotlin.Lazy;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/inline/e.class */
@StabilityInferred(parameters = 0)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ChannelBaikeSelectFragment f75153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f75154b = ListExtentionsKt.lazyUnsafe(new C2289z1(7));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f75155c = ListExtentionsKt.lazyUnsafe(new d(this, 0));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f75156d = ListExtentionsKt.lazyUnsafe(new B0(this, 1));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public IInlineControl f75157e;

    public e(@NotNull ChannelBaikeSelectFragment channelBaikeSelectFragment) {
        this.f75153a = channelBaikeSelectFragment;
    }
}
