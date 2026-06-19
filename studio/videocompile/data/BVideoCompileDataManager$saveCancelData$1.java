package com.bilibili.studio.videocompile.data;

import android.app.Application;
import com.alibaba.fastjson.JSON;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.blkv.BLKV;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/data/BVideoCompileDataManager$saveCancelData$1.class */
public final class BVideoCompileDataManager$saveCancelData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final BVideoCompileCancelData $cancelData;
    final boolean $syncSave;
    int label;
    final BVideoCompileDataManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BVideoCompileDataManager$saveCancelData$1(BVideoCompileDataManager bVideoCompileDataManager, boolean z6, BVideoCompileCancelData bVideoCompileCancelData, Continuation<? super BVideoCompileDataManager$saveCancelData$1> continuation) {
        super(2, continuation);
        this.this$0 = bVideoCompileDataManager;
        this.$syncSave = z6;
        this.$cancelData = bVideoCompileCancelData;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BVideoCompileDataManager$saveCancelData$1(this.this$0, this.$syncSave, this.$cancelData, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        OA0.b.c(this.this$0, "saveCancelData start syncSave : " + this.$syncSave);
        Application application = BiliContext.application();
        if (application == null) {
            QA0.a.b("saveCancelData fail context is null", null);
            OA0.b.b(this.this$0, "saveCancelData fail context is null");
            return Unit.INSTANCE;
        }
        String jSONString = JSON.toJSONString(this.$cancelData.createMapData());
        if (jSONString != null && jSONString.length() == 0) {
            QA0.a.b("saveCancelData fail toJsonString is null", null);
            OA0.b.b(this.this$0, "saveCancelData fail toJsonString is null");
            return Unit.INSTANCE;
        }
        OA0.b.c(this.this$0, "saveCancelData toJSONString success " + jSONString);
        if (!BLKV.getKvs$default(application, "BVideoCompileDataGroup", false, 0, 6, (Object) null).putString("BVideoCompileCancelData", jSONString)) {
            QA0.a.b("saveCancelData fail kv result is false", null);
            OA0.b.b(this.this$0, "saveCancelData fail kv result is false");
        }
        OA0.b.c(this.this$0, "saveCancelData  syncSave: " + this.$syncSave + " success");
        return Unit.INSTANCE;
    }
}
