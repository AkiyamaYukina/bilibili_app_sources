package com.bilibili.ogv.infra.jsb;

import com.alibaba.fastjson.JSONObject;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/jsb/JsBridgeClassRecord$1$1.class */
public final class JsBridgeClassRecord$1$1 extends SuspendLambda implements Function3<Object, JSONObject, Continuation<? super JsonElement>, Object> {
    final Method $function;
    final int $paramCount;
    private Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsBridgeClassRecord$1$1(Method method, int i7, Continuation<? super JsBridgeClassRecord$1$1> continuation) {
        super(3, continuation);
        this.$function = method;
        this.$paramCount = i7;
    }

    public final Object invoke(Object obj, JSONObject jSONObject, Continuation<? super JsonElement> continuation) {
        JsBridgeClassRecord$1$1 jsBridgeClassRecord$1$1 = new JsBridgeClassRecord$1$1(this.$function, this.$paramCount, continuation);
        jsBridgeClassRecord$1$1.L$0 = obj;
        jsBridgeClassRecord$1$1.L$1 = jSONObject;
        return jsBridgeClassRecord$1$1.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Object obj3 = this.L$0;
            JSONObject jSONObject = (JSONObject) this.L$1;
            Method method = this.$function;
            Object[] objArrA = JsBridgeClassRecord.a(this.$paramCount, method, jSONObject);
            this.L$0 = null;
            this.label = 1;
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.addSpread(objArrA);
            spreadBuilder.add(this);
            Object objInvoke = method.invoke(obj3, spreadBuilder.toArray(new Object[spreadBuilder.size()]));
            if (objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            obj2 = objInvoke;
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            obj2 = obj;
        }
        JsonElement jsonTree = null;
        if (obj2 != null) {
            jsonTree = null;
            if (!Intrinsics.areEqual(obj2, Unit.INSTANCE)) {
                jsonTree = obj2 instanceof JsonNull ? null : obj2 instanceof JsonElement ? (JsonElement) obj2 : JsonUtilKt.toJsonTree(obj2);
            }
        }
        return jsonTree;
    }
}
