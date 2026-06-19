package com.bilibili.lib.projection.internal.control;

import com.bilibili.lib.projection.internal.control.NewBubbleHelper;
import io.reactivex.rxjava3.functions.BiFunction;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/control/b.class */
public final class b<T1, T2, R> implements BiFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b<T1, T2, R> f63067a = (b<T1, T2, R>) new Object();

    public final Object apply(Object obj, Object obj2) {
        return TuplesKt.to((com.bilibili.lib.projection.internal.device.a) obj, (NewBubbleHelper.NeedShowNewBubble) obj2);
    }
}
