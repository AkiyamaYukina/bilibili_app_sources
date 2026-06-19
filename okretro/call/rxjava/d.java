package com.bilibili.okretro.call.rxjava;

import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.observers.CallbackCompletableObserver;
import kotlin.PublishedApi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/call/rxjava/d.class */
public final class d {
    @PublishedApi
    @NotNull
    public static final CallbackCompletableObserver a(@NotNull aY0.a aVar, @NotNull Action action, @NotNull Consumer consumer) {
        CallbackCompletableObserver callbackCompletableObserver;
        if (consumer == Functions.f) {
            aVar.getClass();
            CallbackCompletableObserver callbackCompletableObserver2 = new CallbackCompletableObserver(action);
            aVar.a(callbackCompletableObserver2);
            callbackCompletableObserver = callbackCompletableObserver2;
        } else {
            aVar.getClass();
            CallbackCompletableObserver callbackCompletableObserver3 = new CallbackCompletableObserver(consumer, action);
            aVar.a(callbackCompletableObserver3);
            callbackCompletableObserver = callbackCompletableObserver3;
        }
        return callbackCompletableObserver;
    }
}
