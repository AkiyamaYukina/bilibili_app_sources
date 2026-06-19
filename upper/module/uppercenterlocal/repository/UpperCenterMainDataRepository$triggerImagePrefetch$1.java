package com.bilibili.upper.module.uppercenterlocal.repository;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.upper.api.bean.centerv4.UpperCenterIndexResV4;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import q4.M;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/repository/UpperCenterMainDataRepository$triggerImagePrefetch$1.class */
final class UpperCenterMainDataRepository$triggerImagePrefetch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final byte[] $bytes;
    final com.bilibili.upper.module.uppercenterlocal.b $fetcher;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpperCenterMainDataRepository$triggerImagePrefetch$1(byte[] bArr, com.bilibili.upper.module.uppercenterlocal.b bVar, Continuation<? super UpperCenterMainDataRepository$triggerImagePrefetch$1> continuation) {
        super(2, continuation);
        this.$bytes = bArr;
        this.$fetcher = bVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UpperCenterMainDataRepository$triggerImagePrefetch$1(this.$bytes, this.$fetcher, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        JSONObject object;
        JSONObject jSONObject;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            object = JSON.parseObject(new String(this.$bytes, Charsets.UTF_8));
        } catch (Exception e7) {
            M.b("triggerImagePrefetch error: ", e7.getMessage(), "MainDataRepository");
        }
        if (object == null || (jSONObject = object.getJSONObject("data")) == null) {
            return Unit.INSTANCE;
        }
        UpperCenterIndexResV4 upperCenterIndexResV4 = (UpperCenterIndexResV4) JSON.parseObject(jSONObject.toJSONString(), UpperCenterIndexResV4.class);
        if (upperCenterIndexResV4 == null) {
            return Unit.INSTANCE;
        }
        List modules = upperCenterIndexResV4.getModules();
        BLog.i("MainDataRepository", "triggerImagePrefetch: modules=" + (modules != null ? Boxing.boxInt(modules.size()) : null));
        this.$fetcher.c(upperCenterIndexResV4);
        return Unit.INSTANCE;
    }
}
