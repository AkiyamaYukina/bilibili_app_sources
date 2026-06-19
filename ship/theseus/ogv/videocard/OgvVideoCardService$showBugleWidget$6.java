package com.bilibili.ship.theseus.ogv.videocard;

import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videocard/OgvVideoCardService$showBugleWidget$6.class */
final /* synthetic */ class OgvVideoCardService$showBugleWidget$6 extends AdaptedFunctionReference implements Function3<Boolean, Boolean, Continuation<? super Pair<? extends Boolean, ? extends Boolean>>, Object>, SuspendFunction {
    public static final OgvVideoCardService$showBugleWidget$6 INSTANCE = new OgvVideoCardService$showBugleWidget$6();

    public OgvVideoCardService$showBugleWidget$6() {
        super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (Continuation<? super Pair<Boolean, Boolean>>) obj3);
    }

    public final Object invoke(boolean z6, boolean z7, Continuation<? super Pair<Boolean, Boolean>> continuation) {
        return new Pair(Boxing.boxBoolean(z6), Boxing.boxBoolean(z7));
    }
}
