package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionComponent2;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionComponent2$DisLikeComponent$bind$1.class */
public final class KingPositionComponent2$DisLikeComponent$bind$1 extends ContinuationImpl {
    int label;
    Object result;
    final KingPositionComponent2.DisLikeComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KingPositionComponent2$DisLikeComponent$bind$1(KingPositionComponent2.DisLikeComponent disLikeComponent, Continuation<? super KingPositionComponent2$DisLikeComponent$bind$1> continuation) {
        super(continuation);
        this.this$0 = disLikeComponent;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
