package com.bilibili.pegasus.channelv3.feed.holder;

import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/feed/holder/BaseChannelDetailHolder$getViewModel$$inlined$viewModels$default$4.class */
public final class BaseChannelDetailHolder$getViewModel$$inlined$viewModels$default$4 extends Lambda implements Function0<CreationExtras> {
    final Function0 $extrasProducer;
    final Lazy $owner$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseChannelDetailHolder$getViewModel$$inlined$viewModels$default$4(Function0 function0, Lazy lazy) {
        super(0);
        this.$extrasProducer = function0;
        this.$owner$delegate = lazy;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.lifecycle.viewmodel.CreationExtras m7946invoke() {
        /*
            r2 = this;
            r0 = r2
            kotlin.jvm.functions.Function0 r0 = r0.$extrasProducer
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L19
            r0 = r3
            java.lang.Object r0 = r0.invoke()
            androidx.lifecycle.viewmodel.CreationExtras r0 = (androidx.lifecycle.viewmodel.CreationExtras) r0
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L44
        L19:
            r0 = r2
            kotlin.Lazy r0 = r0.$owner$delegate
            androidx.lifecycle.ViewModelStoreOwner r0 = androidx.fragment.app.FragmentViewModelLazyKt.m4417access$viewModels$lambda1(r0)
            r3 = r0
            r0 = r3
            boolean r0 = r0 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
            if (r0 == 0) goto L30
            r0 = r3
            androidx.lifecycle.HasDefaultViewModelProviderFactory r0 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r0
            r3 = r0
            goto L32
        L30:
            r0 = 0
            r3 = r0
        L32:
            r0 = r3
            if (r0 == 0) goto L40
            r0 = r3
            androidx.lifecycle.viewmodel.CreationExtras r0 = r0.getDefaultViewModelCreationExtras()
            r3 = r0
            goto L44
        L40:
            androidx.lifecycle.viewmodel.CreationExtras$Empty r0 = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE
            r3 = r0
        L44:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv3.feed.holder.BaseChannelDetailHolder$getViewModel$$inlined$viewModels$default$4.m7946invoke():androidx.lifecycle.viewmodel.CreationExtras");
    }
}
