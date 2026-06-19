package com.bilibili.pegasus.channelv3.feed.holder;

import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelStore;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/feed/holder/BaseChannelDetailHolder$getViewModel$$inlined$viewModels$default$3.class */
public final class BaseChannelDetailHolder$getViewModel$$inlined$viewModels$default$3 extends Lambda implements Function0<ViewModelStore> {
    final Lazy $owner$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseChannelDetailHolder$getViewModel$$inlined$viewModels$default$3(Lazy lazy) {
        super(0);
        this.$owner$delegate = lazy;
    }

    @NotNull
    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final ViewModelStore m7945invoke() {
        return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
    }
}
