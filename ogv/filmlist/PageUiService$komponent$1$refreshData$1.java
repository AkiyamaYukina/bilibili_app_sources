package com.bilibili.ogv.filmlist;

import androidx.compose.runtime.MutableState;
import com.bilibili.ktor.KApiResponse;
import com.bilibili.ogv.filmlist.s;
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
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.compose.resources.StringResource;
import org.jetbrains.compose.resources.StringResourcesKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/PageUiService$komponent$1$refreshData$1.class */
final class PageUiService$komponent$1$refreshData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Toaster $toaster;
    final MutableState<s> $uiState$delegate;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final B this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageUiService$komponent$1$refreshData$1(B b7, MutableState<s> mutableState, Toaster toaster, Continuation<? super PageUiService$komponent$1$refreshData$1> continuation) {
        super(2, continuation);
        this.this$0 = b7;
        this.$uiState$delegate = mutableState;
        this.$toaster = toaster;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PageUiService$komponent$1$refreshData$1(this.this$0, this.$uiState$delegate, this.$toaster, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        s value;
        Toaster toaster;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            value = this.$uiState$delegate.getValue();
            if (value instanceof s.c) {
                ((s.c) value).f67796b.setValue(Boolean.TRUE);
            } else {
                this.$uiState$delegate.setValue(s.b.f67794a);
            }
            B b7 = this.this$0;
            com.bilibili.ogv.filmlist.api.b bVar = b7.f67611b;
            this.L$0 = value;
            this.label = 1;
            Object objC = bVar.c(b7.f67610a, this);
            obj = objC;
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                toaster = (Toaster) this.L$3;
                ResultKt.throwOnFailure(obj);
                Toaster.showToast$default(toaster, (String) obj, (ToastDuration) null, (ToastGravity) null, 6, (Object) null);
                return Unit.INSTANCE;
            }
            value = (s) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        KApiResponse.a aVar = (KApiResponse) obj;
        MutableState<s> mutableState = this.$uiState$delegate;
        Toaster toaster2 = this.$toaster;
        if (aVar instanceof KApiResponse.a) {
            KApiResponse.a aVar2 = aVar;
            mutableState.setValue((s) new Object());
            ILogger kLog = KLog_androidKt.getKLog();
            String str = aVar2.b;
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            kLog.e("BetaPageModel", str2);
        } else if (aVar instanceof KApiResponse.ServiceUnavailable) {
            Exception exception = ((KApiResponse.ServiceUnavailable) aVar).getException();
            if (value instanceof s.c) {
                StringResource stringResource = (StringResource) O3.a.f17697J.getValue();
                this.L$0 = SpillingKt.nullOutSpilledVariable(value);
                this.L$1 = SpillingKt.nullOutSpilledVariable(aVar);
                this.L$2 = SpillingKt.nullOutSpilledVariable(exception);
                this.L$3 = toaster2;
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 2;
                Object string = StringResourcesKt.getString(stringResource, this);
                if (string == coroutine_suspended) {
                    return coroutine_suspended;
                }
                toaster = toaster2;
                obj = string;
                Toaster.showToast$default(toaster, (String) obj, (ToastDuration) null, (ToastGravity) null, 6, (Object) null);
            } else {
                mutableState.setValue((s) new Object());
            }
        } else {
            if (!(aVar instanceof KApiResponse.c)) {
                throw new NoWhenBranchMatchedException();
            }
            com.bilibili.ogv.filmlist.api.c cVar = (com.bilibili.ogv.filmlist.api.c) ((KApiResponse.c) aVar).a;
            mutableState.setValue((s) ((!cVar.f67640b.isEmpty() || (mutableState.getValue() instanceof s.c)) ? new s.c(cVar) : new Object()));
        }
        return Unit.INSTANCE;
    }
}
