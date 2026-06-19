package com.bilibili.upper.module.draft.vm;

import android.app.Application;
import bilibili.live.app.service.resolver.c;
import cF0.C5234a;
import com.bilibili.upper.db.table.DraftBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/draft/vm/DraftViewModel$getInnerDraftsData$1.class */
final class DraftViewModel$getInnerDraftsData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Application $application;
    int label;
    final DraftViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraftViewModel$getInnerDraftsData$1(Application application, DraftViewModel draftViewModel, Continuation<? super DraftViewModel$getInnerDraftsData$1> continuation) {
        super(2, continuation);
        this.$application = application;
        this.this$0 = draftViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DraftViewModel$getInnerDraftsData$1(this.$application, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List<DraftBean> listC = C5234a.f(this.$application).c();
        List<DraftBean> arrayList = listC;
        if (listC == null) {
            arrayList = new ArrayList();
        }
        c.a(arrayList.size(), "getInnerDraftsData, size=", "DraftViewModel");
        this.this$0.f113121d.postValue(YH0.c.a(arrayList));
        return Unit.INSTANCE;
    }
}
