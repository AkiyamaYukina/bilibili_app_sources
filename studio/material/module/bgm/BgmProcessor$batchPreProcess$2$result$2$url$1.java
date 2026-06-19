package com.bilibili.studio.material.module.bgm;

import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.studio.material.internal.ProcessorItem;
import com.bilibili.studio.material.internal.net.Bgm;
import java.util.HashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nA0.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/module/bgm/BgmProcessor$batchPreProcess$2$result$2$url$1.class */
public final class BgmProcessor$batchPreProcess$2$result$2$url$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final ProcessorItem $item;
    private Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BgmProcessor$batchPreProcess$2$result$2$url$1(ProcessorItem processorItem, Continuation<? super BgmProcessor$batchPreProcess$2$result$2$url$1> continuation) {
        super(2, continuation);
        this.$item = processorItem;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BgmProcessor$batchPreProcess$2$result$2$url$1 bgmProcessor$batchPreProcess$2$result$2$url$1 = new BgmProcessor$batchPreProcess$2$result$2$url$1(this.$item, continuation);
        bgmProcessor$batchPreProcess$2$result$2$url$1.L$0 = obj;
        return bgmProcessor$batchPreProcess$2$result$2$url$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                HashMap map = new HashMap();
                map.put(EditCustomizeSticker.TAG_MID, String.valueOf(BiliAccounts.get(BiliContext.application()).mid()));
                map.put("sid", this.$item.getRequest().getMaterialId());
                map.put("platform", Constant.SDK_OS);
                Result.Companion companion = Result.Companion;
                a aVar = (a) ServiceGenerator.createService(a.class);
                String accessKey = BiliAccounts.get(BiliContext.application()).getAccessKey();
                this.label = 1;
                Object objQueryBgmById = aVar.queryBgmById(accessKey, map, this);
                obj = objQueryBgmById;
                if (objQueryBgmById == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            obj2 = Result.constructor-impl(((Bgm) ((GeneralResponse) obj).data).getUrl());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Object obj3 = obj2;
        if (Result.isFailure-impl(obj2)) {
            obj3 = "";
        }
        return obj3;
    }
}
