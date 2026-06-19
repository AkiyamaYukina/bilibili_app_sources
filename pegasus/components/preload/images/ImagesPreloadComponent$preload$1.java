package com.bilibili.pegasus.components.preload.images;

import com.bilibili.pegasus.PegasusHolderData;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/preload/images/ImagesPreloadComponent$preload$1.class */
final class ImagesPreloadComponent$preload$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final List<PegasusHolderData> $response;
    Object L$0;
    Object L$1;
    int label;
    final ImagesPreloadComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagesPreloadComponent$preload$1(List<? extends PegasusHolderData> list, ImagesPreloadComponent imagesPreloadComponent, Continuation<? super ImagesPreloadComponent$preload$1> continuation) {
        super(2, continuation);
        this.$response = list;
        this.this$0 = imagesPreloadComponent;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ImagesPreloadComponent$preload$1(this.$response, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ImagesPreloadComponent imagesPreloadComponent;
        Iterator it;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            List<PegasusHolderData> list = this.$response;
            imagesPreloadComponent = this.this$0;
            it = list.iterator();
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) this.L$1;
            ImagesPreloadComponent imagesPreloadComponent2 = (ImagesPreloadComponent) this.L$0;
            ResultKt.throwOnFailure(obj);
            imagesPreloadComponent = imagesPreloadComponent2;
        }
        while (it.hasNext()) {
            PegasusHolderData pegasusHolderData = (PegasusHolderData) it.next();
            Map<Class<? extends PegasusHolderData>, a> map = imagesPreloadComponent.f77114l;
            a aVar = (a) ((LinkedHashMap) map).get(pegasusHolderData.getClass());
            if (aVar != null) {
                this.L$0 = imagesPreloadComponent;
                this.L$1 = it;
                this.label = 1;
                if (aVar.a(pegasusHolderData) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
