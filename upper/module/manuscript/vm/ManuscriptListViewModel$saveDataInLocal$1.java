package com.bilibili.upper.module.manuscript.vm;

import android.app.Application;
import com.alibaba.fastjson.JSON;
import com.bilibili.base.BiliContext;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.upper.api.bean.manuscript.ArchivePre;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/vm/ManuscriptListViewModel$saveDataInLocal$1.class */
final class ManuscriptListViewModel$saveDataInLocal$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final ManuscriptListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManuscriptListViewModel$saveDataInLocal$1(ManuscriptListViewModel manuscriptListViewModel, Continuation<? super ManuscriptListViewModel$saveDataInLocal$1> continuation) {
        super(2, continuation);
        this.this$0 = manuscriptListViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ManuscriptListViewModel$saveDataInLocal$1(this.this$0, continuation);
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
        ArchivePre value = this.this$0.f113678c.getValue();
        if (value != null) {
            ManuscriptListViewModel manuscriptListViewModel = this.this$0;
            Application application = BiliContext.application();
            if (application == null) {
                return Unit.INSTANCE;
            }
            BiliGlobalPreferenceHelper.getInstance(application).setString(manuscriptListViewModel.f113677b, JSON.toJSONString(value));
        }
        return Unit.INSTANCE;
    }
}
