package com.bilibili.ogv.operation3.filmlisthub;

import androidx.compose.runtime.MutableState;
import com.bilibili.ktor.KApiResponse;
import com.bilibili.ogv.operation3.filmlisthub.l;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/filmlisthub/FilmListHubPageModel$komponent$1$refreshData$1.class */
public final class FilmListHubPageModel$komponent$1$refreshData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Toaster $toaster;
    final MutableState<l> $uiState$delegate;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final FilmListHubPageModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilmListHubPageModel$komponent$1$refreshData$1(FilmListHubPageModel filmListHubPageModel, MutableState<l> mutableState, Toaster toaster, Continuation<? super FilmListHubPageModel$komponent$1$refreshData$1> continuation) {
        super(2, continuation);
        this.this$0 = filmListHubPageModel;
        this.$uiState$delegate = mutableState;
        this.$toaster = toaster;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FilmListHubPageModel$komponent$1$refreshData$1(this.this$0, this.$uiState$delegate, this.$toaster, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        Object obj2;
        Toaster toaster;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            l value = this.$uiState$delegate.getValue();
            if (value instanceof l.c) {
                ((l.c) value).f71116b.setValue(Boolean.TRUE);
            } else {
                this.$uiState$delegate.setValue(l.b.f71114a);
            }
            com.bilibili.ogv.operation3.filmlisthub.api.f fVar = this.this$0.f71028a;
            this.label = 1;
            Object objA = fVar.a("", this);
            obj = objA;
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                toaster = (Toaster) this.L$2;
                ResultKt.throwOnFailure(obj);
                obj2 = obj;
                Toaster.showToast$default(toaster, (String) obj2, (ToastDuration) null, (ToastGravity) null, 6, (Object) null);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        KApiResponse.ServiceUnavailable serviceUnavailable = (KApiResponse) obj;
        MutableState<l> mutableState = this.$uiState$delegate;
        Toaster toaster2 = this.$toaster;
        if (serviceUnavailable instanceof KApiResponse.a) {
            mutableState.setValue(new l.a(false));
        } else if (serviceUnavailable instanceof KApiResponse.ServiceUnavailable) {
            Exception exception = serviceUnavailable.getException();
            ILogger kLog = KLog_androidKt.getKLog();
            String message = exception.getMessage();
            if (message == null) {
                message = "";
            }
            kLog.e("FilmListHubPageModel", message, exception);
            mutableState.setValue(new l.a(true));
            StringResource stringResource = (StringResource) O3.a.f17697J.getValue();
            this.L$0 = SpillingKt.nullOutSpilledVariable(serviceUnavailable);
            this.L$1 = SpillingKt.nullOutSpilledVariable(exception);
            this.L$2 = toaster2;
            this.I$0 = 0;
            this.I$1 = 0;
            this.label = 2;
            Object string = StringResourcesKt.getString(stringResource, this);
            if (string == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj2 = string;
            toaster = toaster2;
            Toaster.showToast$default(toaster, (String) obj2, (ToastDuration) null, (ToastGravity) null, 6, (Object) null);
        } else {
            if (!(serviceUnavailable instanceof KApiResponse.c)) {
                throw new NoWhenBranchMatchedException();
            }
            com.bilibili.ogv.operation3.filmlisthub.api.b bVar = (com.bilibili.ogv.operation3.filmlisthub.api.b) ((KApiResponse.c) serviceUnavailable).a;
            mutableState.setValue((!bVar.f71078a.isEmpty() || (mutableState.getValue() instanceof l.c)) ? new l.c(bVar) : new l.a(false));
        }
        return Unit.INSTANCE;
    }
}
