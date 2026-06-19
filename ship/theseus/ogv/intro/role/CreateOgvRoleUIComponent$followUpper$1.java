package com.bilibili.ship.theseus.ogv.intro.role;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/role/CreateOgvRoleUIComponent$followUpper$1.class */
final class CreateOgvRoleUIComponent$followUpper$1 extends ContinuationImpl {
    int label;
    Object result;
    final CreateOgvRoleUIComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateOgvRoleUIComponent$followUpper$1(CreateOgvRoleUIComponent createOgvRoleUIComponent, Continuation<? super CreateOgvRoleUIComponent$followUpper$1> continuation) {
        super(continuation);
        this.this$0 = createOgvRoleUIComponent;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return CreateOgvRoleUIComponent.a(this.this$0, null, this);
    }
}
