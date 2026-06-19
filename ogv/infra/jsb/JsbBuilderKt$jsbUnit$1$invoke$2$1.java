package com.bilibili.ogv.infra.jsb;

import com.alibaba.fastjson.JSONObject;
import com.bilibili.common.webview.js.JsBridgeCallHandlerV2;
import com.google.gson.JsonElement;
import java.lang.reflect.InvocationTargetException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/jsb/JsbBuilderKt$jsbUnit$1$invoke$2$1.class */
final class JsbBuilderKt$jsbUnit$1$invoke$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Function3<Object, JSONObject, Continuation<? super JsonElement>, Object> $asyncCallable;
    final String $callbackId;
    final JSONObject $data;
    final Object $obj;
    final JsBridgeCallHandlerV2 $this_invoke;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public JsbBuilderKt$jsbUnit$1$invoke$2$1(Function3<Object, ? super JSONObject, ? super Continuation<? super JsonElement>, ? extends Object> function3, Object obj, JSONObject jSONObject, JsBridgeCallHandlerV2 jsBridgeCallHandlerV2, String str, Continuation<? super JsbBuilderKt$jsbUnit$1$invoke$2$1> continuation) {
        super(2, continuation);
        this.$asyncCallable = function3;
        this.$obj = obj;
        this.$data = jSONObject;
        this.$this_invoke = jsBridgeCallHandlerV2;
        this.$callbackId = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new JsbBuilderKt$jsbUnit$1$invoke$2$1(this.$asyncCallable, this.$obj, this.$data, this.$this_invoke, this.$callbackId, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws InvocationTargetException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Function3<Object, JSONObject, Continuation<? super JsonElement>, Object> function3 = this.$asyncCallable;
                Object obj2 = this.$obj;
                JSONObject jSONObject = this.$data;
                this.label = 1;
                Object objInvoke = function3.invoke(obj2, jSONObject, this);
                obj = objInvoke;
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            JsonElement jsonElement = (JsonElement) obj;
            if (jsonElement != null) {
                this.$this_invoke.callbackToJs(new Object[]{this.$callbackId, jsonElement});
            } else {
                this.$this_invoke.callbackToJs(new Object[]{this.$callbackId});
            }
            return Unit.INSTANCE;
        } catch (InvocationTargetException e7) {
            Throwable cause = e7.getCause();
            InvocationTargetException invocationTargetException = e7;
            if (cause != null) {
                invocationTargetException = cause;
            }
            throw invocationTargetException;
        }
    }
}
