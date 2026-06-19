package com.bilibili.studio.material.internal;

import com.bilibili.studio.material.IMaterialProcessor;
import com.bilibili.studio.material.Request;
import com.bilibili.studio.material.Result;
import com.bilibili.studio.material.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.SendChannel;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/internal/MaterialDispatcher$dispatch$deferredResults$1$1.class */
final class MaterialDispatcher$dispatch$deferredResults$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Result>>, Object> {
    final com.bilibili.studio.material.d $groupRequest;
    final SendChannel<h> $progressChannel;
    int label;
    final c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MaterialDispatcher$dispatch$deferredResults$1$1(c cVar, com.bilibili.studio.material.d dVar, SendChannel<? super h> sendChannel, Continuation<? super MaterialDispatcher$dispatch$deferredResults$1$1> continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$groupRequest = dVar;
        this.$progressChannel = sendChannel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MaterialDispatcher$dispatch$deferredResults$1$1(this.this$0, this.$groupRequest, this.$progressChannel, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<Result>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            IMaterialProcessor<? extends ProcessorData> iMaterialProcessor = this.this$0.f108542f.get(this.$groupRequest.f108516a);
            IMaterialProcessor<? extends ProcessorData> iMaterialProcessor2 = iMaterialProcessor;
            if (iMaterialProcessor == null) {
                iMaterialProcessor2 = (com.bilibili.studio.material.module.a) this.this$0.f108543g.getValue();
            }
            ProcessorData processorData = new ProcessorData();
            com.bilibili.studio.material.d dVar = this.$groupRequest;
            List<ProcessorItem> items = processorData.getItems();
            List<Request> list = dVar.f108517b;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new ProcessorItem((Request) it.next()));
            }
            items.addAll(arrayList);
            SendChannel<h> sendChannel = this.$progressChannel;
            this.label = 1;
            Object objProcessInternal = iMaterialProcessor2.processInternal(processorData, sendChannel, this);
            obj = objProcessInternal;
            if (objProcessInternal == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
