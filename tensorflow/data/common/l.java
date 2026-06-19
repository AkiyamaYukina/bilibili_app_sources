package com.bilibili.tensorflow.data.common;

import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/data/common/l.class */
public final class l {
    public static void a(@NotNull String str, @NotNull String str2) {
        a aVar = TfDatabase.f110720a;
        long jMid = com.bilibili.ogv.infra.account.a.f67852b.mid();
        BuildersKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO().plus(new AbstractCoroutineContextElement(CoroutineExceptionHandler.Key)), (CoroutineStart) null, new TfRepository$insertTfData$1(new h("ogv_open_membership_event", str, 0L, str2, jMid > 0 ? String.valueOf(jMid) : "guest", System.currentTimeMillis(), 0L), null), 2, (Object) null);
    }
}
