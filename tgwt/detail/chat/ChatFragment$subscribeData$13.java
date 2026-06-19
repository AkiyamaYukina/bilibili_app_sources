package com.bilibili.tgwt.detail.chat;

import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/ChatFragment$subscribeData$13.class */
final /* synthetic */ class ChatFragment$subscribeData$13 extends AdaptedFunctionReference implements Function3<Boolean, Integer, Continuation<? super Pair<? extends Boolean, ? extends Integer>>, Object>, SuspendFunction {
    public static final ChatFragment$subscribeData$13 INSTANCE = new ChatFragment$subscribeData$13();

    public ChatFragment$subscribeData$13() {
        super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke(((Boolean) obj).booleanValue(), ((Number) obj2).intValue(), (Continuation<? super Pair<Boolean, Integer>>) obj3);
    }

    public final Object invoke(boolean z6, int i7, Continuation<? super Pair<Boolean, Integer>> continuation) {
        return new Pair(Boxing.boxBoolean(z6), Boxing.boxInt(i7));
    }
}
