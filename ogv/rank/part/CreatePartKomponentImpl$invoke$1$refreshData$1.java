package com.bilibili.ogv.rank.part;

import androidx.compose.runtime.MutableState;
import com.bilibili.ktor.KApiResponse;
import com.bilibili.ogv.rank.part.r;
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
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.compose.resources.StringResource;
import org.jetbrains.compose.resources.StringResourcesKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/part/CreatePartKomponentImpl$invoke$1$refreshData$1.class */
final class CreatePartKomponentImpl$invoke$1$refreshData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final MutableStateFlow<com.bilibili.ogv.rank.api.a> $currentPageDataFlow;
    final String $oid;
    final String $rankId;
    final Toaster $toaster;
    final MutableState<r> $uiState$delegate;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatePartKomponentImpl$invoke$1$refreshData$1(l lVar, String str, String str2, MutableState<r> mutableState, MutableStateFlow<com.bilibili.ogv.rank.api.a> mutableStateFlow, Toaster toaster, Continuation<? super CreatePartKomponentImpl$invoke$1$refreshData$1> continuation) {
        super(2, continuation);
        this.this$0 = lVar;
        this.$oid = str;
        this.$rankId = str2;
        this.$uiState$delegate = mutableState;
        this.$currentPageDataFlow = mutableStateFlow;
        this.$toaster = toaster;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreatePartKomponentImpl$invoke$1$refreshData$1(this.this$0, this.$oid, this.$rankId, this.$uiState$delegate, this.$currentPageDataFlow, this.$toaster, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        r value;
        Object cVar;
        Object string;
        Toaster toaster;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            value = this.$uiState$delegate.getValue();
            if (value instanceof r.c) {
                ((r.c) value).f72120b.setValue(Boolean.TRUE);
            } else {
                this.$uiState$delegate.setValue(r.b.f72118a);
            }
            l lVar = this.this$0;
            com.bilibili.ogv.rank.api.d dVar = lVar.f72092a;
            String str = this.$oid;
            String str2 = this.$rankId;
            this.L$0 = value;
            this.label = 1;
            Object objA = dVar.a(str, str2, lVar.f72094c, this);
            obj = objA;
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                toaster = (Toaster) this.L$3;
                ResultKt.throwOnFailure(obj);
                string = obj;
                Toaster.showToast$default(toaster, (String) string, (ToastDuration) null, (ToastGravity) null, 6, (Object) null);
                return Unit.INSTANCE;
            }
            value = (r) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        KApiResponse.a aVar = (KApiResponse) obj;
        MutableStateFlow<com.bilibili.ogv.rank.api.a> mutableStateFlow = this.$currentPageDataFlow;
        MutableState<r> mutableState = this.$uiState$delegate;
        Toaster toaster2 = this.$toaster;
        if (aVar instanceof KApiResponse.a) {
            KApiResponse.a aVar2 = aVar;
            mutableState.setValue((r) new Object());
            ILogger kLog = KLog_androidKt.getKLog();
            String str3 = aVar2.b;
            String str4 = str3;
            if (str3 == null) {
                str4 = "";
            }
            kLog.e("BetaPageModel", str4);
        } else if (aVar instanceof KApiResponse.ServiceUnavailable) {
            Exception exception = ((KApiResponse.ServiceUnavailable) aVar).getException();
            if (value instanceof r.c) {
                StringResource stringResource = (StringResource) O3.a.f17697J.getValue();
                this.L$0 = SpillingKt.nullOutSpilledVariable(value);
                this.L$1 = SpillingKt.nullOutSpilledVariable(aVar);
                this.L$2 = SpillingKt.nullOutSpilledVariable(exception);
                this.L$3 = toaster2;
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 2;
                string = StringResourcesKt.getString(stringResource, this);
                if (string == coroutine_suspended) {
                    return coroutine_suspended;
                }
                toaster = toaster2;
                Toaster.showToast$default(toaster, (String) string, (ToastDuration) null, (ToastGravity) null, 6, (Object) null);
            } else {
                mutableState.setValue((r) new Object());
            }
        } else {
            if (!(aVar instanceof KApiResponse.c)) {
                throw new NoWhenBranchMatchedException();
            }
            com.bilibili.ogv.rank.api.a aVar3 = (com.bilibili.ogv.rank.api.a) ((KApiResponse.c) aVar).a;
            if (!aVar3.f71908a.isEmpty() || (mutableState.getValue() instanceof r.c)) {
                mutableStateFlow.setValue(aVar3);
                cVar = new r.c(aVar3);
            } else {
                cVar = new Object();
            }
            mutableState.setValue((r) cVar);
        }
        return Unit.INSTANCE;
    }
}
