package com.bilibili.mall.kmm.common;

import com.bilibili.mall.kmm.common.c;
import kotlin.Result;
import kotlin.ResultKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/common/b.class */
public final class b {
    @NotNull
    public static final <T> Object a(@NotNull c<? extends T> cVar) {
        Object obj;
        if (cVar instanceof c.C0367c) {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(((c.C0367c) cVar).f65591a);
        } else if (cVar instanceof c.a) {
            Result.Companion companion2 = Result.Companion;
            c.a aVar = (c.a) cVar;
            obj = Result.constructor-impl(ResultKt.createFailure(new MallBusinessFailureException(aVar.f65589a, aVar.f65590b)));
        } else {
            Result.Companion companion3 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(new IllegalStateException("illegal MallKtBiliApiResponse type:" + cVar + ".toString()")));
        }
        return obj;
    }
}
