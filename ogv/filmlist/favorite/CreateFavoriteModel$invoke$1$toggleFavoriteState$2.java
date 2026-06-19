package com.bilibili.ogv.filmlist.favorite;

import X1.F;
import com.bilibili.ktor.KApiResponse;
import com.bilibili.ogv.filmlist.api.b;
import kntr.base.log.ILogger;
import kntr.base.log.KLog_androidKt;
import kntr.common.trio.toast.ToastDuration;
import kntr.common.trio.toast.ToastGravity;
import kntr.common.trio.toast.Toaster;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/favorite/CreateFavoriteModel$invoke$1$toggleFavoriteState$2.class */
public final class CreateFavoriteModel$invoke$1$toggleFavoriteState$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $filmListId;
    final Toaster $toaster;
    int label;
    final a this$0;
    final CreateFavoriteModel$invoke$1 this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateFavoriteModel$invoke$1$toggleFavoriteState$2(a aVar, String str, CreateFavoriteModel$invoke$1 createFavoriteModel$invoke$1, Toaster toaster, Continuation<? super CreateFavoriteModel$invoke$1$toggleFavoriteState$2> continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$filmListId = str;
        this.this$1 = createFavoriteModel$invoke$1;
        this.$toaster = toaster;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateFavoriteModel$invoke$1$toggleFavoriteState$2(this.this$0, this.$filmListId, this.this$1, this.$toaster, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            b bVar = this.this$0.f67701a;
            String str = this.$filmListId;
            this.label = 1;
            Object objA = bVar.a(str, this);
            obj = objA;
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        KApiResponse.a aVar = (KApiResponse) obj;
        CreateFavoriteModel$invoke$1 createFavoriteModel$invoke$1 = this.this$1;
        Toaster toaster = this.$toaster;
        if (aVar instanceof KApiResponse.a) {
            KApiResponse.a aVar2 = aVar;
            StringBuilder sbB = F.b(aVar2.a, "code:", ",message:");
            sbB.append(aVar2.b);
            IllegalStateException illegalStateException = new IllegalStateException(sbB.toString());
            Toaster.showToast$default(toaster, "出错啦，等一会儿再试试看~", (ToastDuration) null, (ToastGravity) null, 6, (Object) null);
            ILogger kLog = KLog_androidKt.getKLog();
            String message = illegalStateException.getMessage();
            kLog.e("CreateFeedbackModel", message != null ? message : "", illegalStateException);
        } else if (aVar instanceof KApiResponse.ServiceUnavailable) {
            Exception exception = ((KApiResponse.ServiceUnavailable) aVar).getException();
            Toaster.showToast$default(toaster, "出错啦，等一会儿再试试看~", (ToastDuration) null, (ToastGravity) null, 6, (Object) null);
            ILogger kLog2 = KLog_androidKt.getKLog();
            String message2 = exception.getMessage();
            kLog2.e("CreateFeedbackModel", message2 != null ? message2 : "", exception);
        } else {
            if (!(aVar instanceof KApiResponse.c)) {
                throw new NoWhenBranchMatchedException();
            }
            createFavoriteModel$invoke$1.f67697a.setValue(Boolean.valueOf(!createFavoriteModel$invoke$1.a()));
            Toaster.showToast$default(toaster, "要记得到收藏-专题-片单中找我哦", (ToastDuration) null, (ToastGravity) null, 6, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
