package com.bilibili.pegasus.components;

import com.bilibili.api.PhoneDeviceId;
import com.bilibili.lib.arch.lifecycle.Resource;
import com.bilibili.lib.arch.lifecycle.Status;
import com.bilibili.lib.coroutineextension.BiliCallExtKt;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.okretro.ServiceGenerator;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/HeaderViewModel$loadMemberNotice$1.class */
public final class HeaderViewModel$loadMemberNotice$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final HeaderViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderViewModel$loadMemberNotice$1(HeaderViewModel headerViewModel, Continuation<? super HeaderViewModel$loadMemberNotice$1> continuation) {
        super(2, continuation);
        this.this$0 = headerViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HeaderViewModel$loadMemberNotice$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object result;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            HeaderViewModel headerViewModel = this.this$0;
            this.label = 1;
            headerViewModel.getClass();
            if (EntryPointKt.getNetRequestOptEnable()) {
                Resource.a aVar = Resource.Companion;
                CancellationException cancellationException = new CancellationException("request was skip for netRequestOptEnable");
                aVar.getClass();
                result = Resource.a.a(cancellationException);
            } else {
                result = BiliCallExtKt.getResult(((AlertService) ServiceGenerator.createService(AlertService.class)).getAlertMessage(w8.y.a(), PhoneDeviceId.get()), this);
            }
            obj2 = result;
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            obj2 = obj;
        }
        Resource resource = (Resource) obj2;
        HeaderViewModel headerViewModel2 = this.this$0;
        if (resource.getStatus() == Status.SUCCESS) {
            headerViewModel2.f75786c.setValue((AlertMessage) resource.getData());
        }
        HeaderViewModel headerViewModel3 = this.this$0;
        if (resource.getStatus() == Status.ERROR && resource.getError() != null) {
            resource.getError();
            headerViewModel3.f75786c.setValue((Object) null);
        }
        this.this$0.f75785b = null;
        return Unit.INSTANCE;
    }
}
