package com.bilibili.pegasus.channelv3.feed.holder;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/feed/holder/BaseChannelDetailHolder$getViewModel$$inlined$viewModels$default$5.class */
public final class BaseChannelDetailHolder$getViewModel$$inlined$viewModels$default$5 extends Lambda implements Function0<ViewModelProvider.Factory> {
    final Lazy $owner$delegate;
    final Fragment $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseChannelDetailHolder$getViewModel$$inlined$viewModels$default$5(Fragment fragment, Lazy lazy) {
        super(0);
        this.$this_viewModels = fragment;
        this.$owner$delegate = lazy;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.lifecycle.ViewModelProvider.Factory m7947invoke() {
        /*
            r2 = this;
            r0 = r2
            kotlin.Lazy r0 = r0.$owner$delegate
            androidx.lifecycle.ViewModelStoreOwner r0 = androidx.fragment.app.FragmentViewModelLazyKt.m4417access$viewModels$lambda1(r0)
            r3 = r0
            r0 = r3
            boolean r0 = r0 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
            if (r0 == 0) goto L17
            r0 = r3
            androidx.lifecycle.HasDefaultViewModelProviderFactory r0 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r0
            r3 = r0
            goto L19
        L17:
            r0 = 0
            r3 = r0
        L19:
            r0 = r3
            if (r0 == 0) goto L2a
            r0 = r3
            androidx.lifecycle.ViewModelProvider$Factory r0 = r0.getDefaultViewModelProviderFactory()
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L32
        L2a:
            r0 = r2
            androidx.fragment.app.Fragment r0 = r0.$this_viewModels
            androidx.lifecycle.ViewModelProvider$Factory r0 = r0.getDefaultViewModelProviderFactory()
            r3 = r0
        L32:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv3.feed.holder.BaseChannelDetailHolder$getViewModel$$inlined$viewModels$default$5.m7947invoke():androidx.lifecycle.ViewModelProvider$Factory");
    }
}
