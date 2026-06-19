package com.bilibili.tgwt.im.ui;

import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/PlayerChatFragment$subscribeData$8.class */
final /* synthetic */ class PlayerChatFragment$subscribeData$8 extends AdaptedFunctionReference implements Function3<Integer, Boolean, Continuation<? super Pair<? extends Integer, ? extends Boolean>>, Object>, SuspendFunction {
    public static final PlayerChatFragment$subscribeData$8 INSTANCE = new PlayerChatFragment$subscribeData$8();

    public PlayerChatFragment$subscribeData$8() {
        super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
    }

    public final Object invoke(int i7, boolean z6, Continuation<? super Pair<Integer, Boolean>> continuation) {
        return new Pair(Boxing.boxInt(i7), Boxing.boxBoolean(z6));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke(((Number) obj).intValue(), ((Boolean) obj2).booleanValue(), (Continuation<? super Pair<Integer, Boolean>>) obj3);
    }
}
