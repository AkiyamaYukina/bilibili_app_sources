package com.bilibili.ship.theseus.united.page.intro.module.tags;

import com.bilibili.ship.theseus.united.page.intro.module.tags.f;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/tags/TagsComponent$CellAdapter$onBindViewHolder$3$1.class */
final class TagsComponent$CellAdapter$onBindViewHolder$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $endIconUrl;
    final f.b $holder;
    final Ref.IntRef $iconTint;
    final String $startIconUrl;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagsComponent$CellAdapter$onBindViewHolder$3$1(f.b bVar, String str, Ref.IntRef intRef, String str2, Continuation<? super TagsComponent$CellAdapter$onBindViewHolder$3$1> continuation) {
        super(2, continuation);
        this.$holder = bVar;
        this.$startIconUrl = str;
        this.$iconTint = intRef;
        this.$endIconUrl = str2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TagsComponent$CellAdapter$onBindViewHolder$3$1(this.$holder, this.$startIconUrl, this.$iconTint, this.$endIconUrl, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.tags.TagsComponent$CellAdapter$onBindViewHolder$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
