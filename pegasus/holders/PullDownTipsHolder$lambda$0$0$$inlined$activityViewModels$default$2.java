package com.bilibili.pegasus.holders;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/PullDownTipsHolder$lambda$0$0$$inlined$activityViewModels$default$2.class */
public final class PullDownTipsHolder$lambda$0$0$$inlined$activityViewModels$default$2 extends Lambda implements Function0<CreationExtras> {
    final Function0 $extrasProducer;
    final Fragment $this_activityViewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullDownTipsHolder$lambda$0$0$$inlined$activityViewModels$default$2(Function0 function0, Fragment fragment) {
        super(0);
        this.$extrasProducer = function0;
        this.$this_activityViewModels = fragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.lifecycle.viewmodel.CreationExtras m8114invoke() {
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
            if (r0 != 0) goto L24
        L19:
            r0 = r2
            androidx.fragment.app.Fragment r0 = r0.$this_activityViewModels
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
            androidx.lifecycle.viewmodel.CreationExtras r0 = r0.getDefaultViewModelCreationExtras()
            r3 = r0
        L24:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.holders.PullDownTipsHolder$lambda$0$0$$inlined$activityViewModels$default$2.m8114invoke():androidx.lifecycle.viewmodel.CreationExtras");
    }
}
