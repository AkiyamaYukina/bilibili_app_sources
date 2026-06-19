package com.bilibili.ship.theseus.ugc.intro.upguardian;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upguardian/UpGuardianService$autoPopupGuardianSignLayer$1.class */
final class UpGuardianService$autoPopupGuardianSignLayer$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    Object result;
    final UpGuardianService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpGuardianService$autoPopupGuardianSignLayer$1(UpGuardianService upGuardianService, Continuation<? super UpGuardianService$autoPopupGuardianSignLayer$1> continuation) {
        super(continuation);
        this.this$0 = upGuardianService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return UpGuardianService.a(this.this$0, false, this);
    }
}
