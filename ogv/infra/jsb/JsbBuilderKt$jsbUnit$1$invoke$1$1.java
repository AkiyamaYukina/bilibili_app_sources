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
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/jsb/JsbBuilderKt$jsbUnit$1$invoke$1$1.class */
final class JsbBuilderKt$jsbUnit$1$invoke$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $callbackId;
    final JSONObject $data;
    final Object $obj;
    final Function2<Object, JSONObject, JsonElement> $syncCallable;
    final JsBridgeCallHandlerV2 $this_invoke;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public JsbBuilderKt$jsbUnit$1$invoke$1$1(Function2<Object, ? super JSONObject, ? extends JsonElement> function2, Object obj, JSONObject jSONObject, JsBridgeCallHandlerV2 jsBridgeCallHandlerV2, String str, Continuation<? super JsbBuilderKt$jsbUnit$1$invoke$1$1> continuation) {
        super(2, continuation);
        this.$syncCallable = function2;
        this.$obj = obj;
        this.$data = jSONObject;
        this.$this_invoke = jsBridgeCallHandlerV2;
        this.$callbackId = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new JsbBuilderKt$jsbUnit$1$invoke$1$1(this.$syncCallable, this.$obj, this.$data, this.$this_invoke, this.$callbackId, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws InvocationTargetException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            JsonElement jsonElement = (JsonElement) this.$syncCallable.invoke(this.$obj, this.$data);
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
