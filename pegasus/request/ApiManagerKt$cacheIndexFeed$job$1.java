package com.bilibili.pegasus.request;

import com.bilibili.lib.arch.lifecycle.Resource;
import com.bilibili.lib.coroutineextension.BiliCallExtKt;
import com.bilibili.lib.performance.BootOpt;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.okretro.converter.IParser;
import com.bilibili.pegasus.data.base.PegasusResponse;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/request/ApiManagerKt$cacheIndexFeed$job$1.class */
final class ApiManagerKt$cacheIndexFeed$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Resource<? extends PegasusResponse>>, Object> {
    final d $api;
    final f $cacheKey;
    final lp0.c $param;
    final Function0<i> $parser;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiManagerKt$cacheIndexFeed$job$1(f fVar, lp0.c cVar, d dVar, Function0<i> function0, Continuation<? super ApiManagerKt$cacheIndexFeed$job$1> continuation) {
        super(2, continuation);
        this.$cacheKey = fVar;
        this.$param = cVar;
        this.$api = dVar;
        this.$parser = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object invokeSuspend$lambda$0(Function0 function0, ResponseBody responseBody) {
        BootOpt bootOpt = BootOpt.INSTANCE;
        bootOpt.record();
        GeneralResponse<PegasusResponse> generalResponseConvert = ((i) function0.invoke()).convert(responseBody);
        bootOpt.record();
        return generalResponseConvert;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ApiManagerKt$cacheIndexFeed$job$1(this.$cacheKey, this.$param, this.$api, this.$parser, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Resource<PegasusResponse>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            f fVar = this.$cacheKey;
            BiliCall<GeneralResponse<PegasusResponse>> indexList = this.$api.getIndexList(fVar.f78813a, fVar.f78814b, fVar.f78815c, fVar.f78817e, fVar.f78816d, fVar.f78818f, fVar.f78819g, fVar.h, fVar.f78820i, fVar.f78821j, fVar.f78822k, fVar.f78823l, fVar.f78824m, fVar.f78825n, fVar.f78827p, null, null, fVar.f78826o, this.$param.f123318k);
            final Function0<i> function0 = this.$parser;
            BiliCall<GeneralResponse<PegasusResponse>> parser = indexList.setParser(new IParser(function0) { // from class: com.bilibili.pegasus.request.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Function0 f78812a;

                {
                    this.f78812a = function0;
                }

                @Override // com.bilibili.okretro.converter.IParser
                public final Object convert(Object obj2) {
                    return ApiManagerKt$cacheIndexFeed$job$1.invokeSuspend$lambda$0(this.f78812a, (ResponseBody) obj2);
                }

                @Override // com.bilibili.okretro.converter.IParser
                public final Object convert(ResponseBody responseBody) {
                    return ApiManagerKt$cacheIndexFeed$job$1.invokeSuspend$lambda$0(this.f78812a, responseBody);
                }
            });
            this.label = 1;
            Object result = BiliCallExtKt.getResult(parser, this);
            obj = result;
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BootOpt.INSTANCE.record();
        return obj;
    }
}
