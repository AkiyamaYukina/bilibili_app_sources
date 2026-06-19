package com.bilibili.ship.theseus.ogv.intro.role;

import androidx.collection.ArrayMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/role/CreateOgvRoleUIComponent$buildRoleVm$vm$1$1.class */
public final class CreateOgvRoleUIComponent$buildRoleVm$vm$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final boolean $hasFollowed;
    final ArrayMap<String, String> $params;
    final com.bilibili.community.follow.j $request;
    int label;
    final CreateOgvRoleUIComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateOgvRoleUIComponent$buildRoleVm$vm$1$1(boolean z6, CreateOgvRoleUIComponent createOgvRoleUIComponent, com.bilibili.community.follow.j jVar, ArrayMap<String, String> arrayMap, Continuation<? super CreateOgvRoleUIComponent$buildRoleVm$vm$1$1> continuation) {
        super(2, continuation);
        this.$hasFollowed = z6;
        this.this$0 = createOgvRoleUIComponent;
        this.$request = jVar;
        this.$params = arrayMap;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateOgvRoleUIComponent$buildRoleVm$vm$1$1(this.$hasFollowed, this.this$0, this.$request, this.$params, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.role.CreateOgvRoleUIComponent$buildRoleVm$vm$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
