package com.bilibili.pegasus.channelv3.feed.holder;

import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/feed/holder/BaseChannelDetailHolder$getViewModel$$inlined$viewModels$default$1.class */
public final class BaseChannelDetailHolder$getViewModel$$inlined$viewModels$default$1 extends Lambda implements Function0<Fragment> {
    final Fragment $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseChannelDetailHolder$getViewModel$$inlined$viewModels$default$1(Fragment fragment) {
        super(0);
        this.$this_viewModels = fragment;
    }

    @NotNull
    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final Fragment m7943invoke() {
        return this.$this_viewModels;
    }
}
