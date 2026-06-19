package com.bilibili.ogv.infra.coroutine;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/coroutine/c.class */
public interface c<R> {
    void a(@NotNull Flow<? extends R> flow);

    void b(@NotNull Function1<? super Continuation<? super R>, ? extends Object> function1);
}
