package com.bilibili.pegasus.channelv3.feed.holder;

import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/feed/holder/BaseChannelDetailHolder$getViewModel$$inlined$viewModels$default$2.class */
public final class BaseChannelDetailHolder$getViewModel$$inlined$viewModels$default$2 extends Lambda implements Function0<ViewModelStoreOwner> {
    final Function0 $ownerProducer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseChannelDetailHolder$getViewModel$$inlined$viewModels$default$2(Function0 function0) {
        super(0);
        this.$ownerProducer = function0;
    }

    @NotNull
    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final ViewModelStoreOwner m7944invoke() {
        return (ViewModelStoreOwner) this.$ownerProducer.invoke();
    }
}
