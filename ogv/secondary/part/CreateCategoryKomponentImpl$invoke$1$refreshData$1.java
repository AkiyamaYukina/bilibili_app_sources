package com.bilibili.ogv.secondary.part;

import androidx.compose.runtime.MutableState;
import com.bilibili.ktor.KApiResponse;
import com.bilibili.ogv.secondary.part.InterfaceC5531a;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/CreateCategoryKomponentImpl$invoke$1$refreshData$1.class */
final class CreateCategoryKomponentImpl$invoke$1$refreshData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $pageName;
    final String $tabId;
    final Toaster $toaster;
    final MutableState<InterfaceC5531a> $uiState$delegate;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final CreateCategoryKomponentImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateCategoryKomponentImpl$invoke$1$refreshData$1(CreateCategoryKomponentImpl createCategoryKomponentImpl, String str, String str2, MutableState<InterfaceC5531a> mutableState, Toaster toaster, Continuation<? super CreateCategoryKomponentImpl$invoke$1$refreshData$1> continuation) {
        super(2, continuation);
        this.this$0 = createCategoryKomponentImpl;
        this.$tabId = str;
        this.$pageName = str2;
        this.$uiState$delegate = mutableState;
        this.$toaster = toaster;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateCategoryKomponentImpl$invoke$1$refreshData$1(this.this$0, this.$tabId, this.$pageName, this.$uiState$delegate, this.$toaster, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        InterfaceC5531a value;
        Object string;
        Toaster toaster;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            value = this.$uiState$delegate.getValue();
            if (value instanceof InterfaceC5531a.c) {
                ((InterfaceC5531a.c) value).f72807b.setValue(Boolean.TRUE);
            } else {
                this.$uiState$delegate.setValue(InterfaceC5531a.b.f72805a);
            }
            CreateCategoryKomponentImpl createCategoryKomponentImpl = this.this$0;
            com.bilibili.ogv.secondary.api.e eVar = createCategoryKomponentImpl.f72732a;
            String str = this.$tabId;
            String str2 = this.$pageName;
            String str3 = createCategoryKomponentImpl.f72734c.f72673a;
            this.L$0 = value;
            this.label = 1;
            Object objA = eVar.a(true, str, str2, str3, this);
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
            value = (InterfaceC5531a) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        KApiResponse.a aVar = (KApiResponse) obj;
        CreateCategoryKomponentImpl createCategoryKomponentImpl2 = this.this$0;
        MutableState<InterfaceC5531a> mutableState = this.$uiState$delegate;
        Toaster toaster2 = this.$toaster;
        if (aVar instanceof KApiResponse.a) {
            KApiResponse.a aVar2 = aVar;
            mutableState.setValue((InterfaceC5531a) new Object());
            ILogger kLog = KLog_androidKt.getKLog();
            String str4 = aVar2.b;
            String str5 = str4;
            if (str4 == null) {
                str5 = "";
            }
            kLog.e("BetaPageModel", str5);
        } else if (aVar instanceof KApiResponse.ServiceUnavailable) {
            Exception exception = ((KApiResponse.ServiceUnavailable) aVar).getException();
            if (value instanceof InterfaceC5531a.c) {
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
                mutableState.setValue((InterfaceC5531a) new Object());
            }
        } else {
            if (!(aVar instanceof KApiResponse.c)) {
                throw new NoWhenBranchMatchedException();
            }
            com.bilibili.ogv.secondary.api.c cVar = (com.bilibili.ogv.secondary.api.c) ((KApiResponse.c) aVar).a;
            if (cVar.f72638c) {
                createCategoryKomponentImpl2.f72734c.f72673a = cVar.f72639d;
            } else {
                createCategoryKomponentImpl2.f72734c.f72673a = null;
            }
            mutableState.setValue((InterfaceC5531a) ((!cVar.f72636a.isEmpty() || (mutableState.getValue() instanceof InterfaceC5531a.c)) ? new InterfaceC5531a.c(cVar) : new Object()));
        }
        return Unit.INSTANCE;
    }
}
