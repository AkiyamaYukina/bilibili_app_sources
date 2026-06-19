package com.bilibili.ship.theseus.united.page;

import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/ReloadOnAccountInfoChangeService$reloadRequestFlow$3.class */
public final /* synthetic */ class ReloadOnAccountInfoChangeService$reloadRequestFlow$3 extends AdaptedFunctionReference implements Function4<Boolean, Boolean, Boolean, Continuation<? super Triple<? extends Boolean, ? extends Boolean, ? extends Boolean>>, Object>, SuspendFunction {
    public static final ReloadOnAccountInfoChangeService$reloadRequestFlow$3 INSTANCE = new ReloadOnAccountInfoChangeService$reloadRequestFlow$3();

    public ReloadOnAccountInfoChangeService$reloadRequestFlow$3() {
        super(4, Triple.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", 4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return invoke(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), (Continuation<? super Triple<Boolean, Boolean, Boolean>>) obj4);
    }

    public final Object invoke(boolean z6, boolean z7, boolean z8, Continuation<? super Triple<Boolean, Boolean, Boolean>> continuation) {
        return new Triple(Boxing.boxBoolean(z6), Boxing.boxBoolean(z7), Boxing.boxBoolean(z8));
    }
}
