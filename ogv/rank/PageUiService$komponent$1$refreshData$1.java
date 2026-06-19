package com.bilibili.ogv.rank;

import androidx.compose.runtime.MutableState;
import com.bilibili.ktor.KApiResponse;
import com.bilibili.ogv.rank.T;
import java.util.ArrayList;
import java.util.List;
import kntr.base.log.ILogger;
import kntr.base.log.KLog_androidKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/PageUiService$komponent$1$refreshData$1.class */
public final class PageUiService$komponent$1$refreshData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final MutableState<T> $uiState$delegate;
    int label;
    final PageUiService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageUiService$komponent$1$refreshData$1(PageUiService pageUiService, MutableState<T> mutableState, Continuation<? super PageUiService$komponent$1$refreshData$1> continuation) {
        super(2, continuation);
        this.this$0 = pageUiService;
        this.$uiState$delegate = mutableState;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PageUiService$komponent$1$refreshData$1(this.this$0, this.$uiState$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        T cVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            T value = this.$uiState$delegate.getValue();
            if (value instanceof T.c) {
                ((T.c) value).f71896b.setValue(Boolean.TRUE);
            } else {
                this.$uiState$delegate.setValue(T.b.f71894a);
            }
            PageUiService pageUiService = this.this$0;
            com.bilibili.ogv.rank.api.e eVar = pageUiService.f71875b;
            this.label = 1;
            Object objA = eVar.a(pageUiService.f71874a, this);
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
        MutableState<T> mutableState = this.$uiState$delegate;
        if (aVar instanceof KApiResponse.a) {
            KApiResponse.a aVar2 = aVar;
            ILogger kLog = KLog_androidKt.getKLog();
            String str = aVar2.b;
            kLog.e("AlphaPageModel", str != null ? str : "");
            T value2 = mutableState.getValue();
            if (value2 instanceof T.c) {
                ((T.c) value2).f71896b.setValue(Boolean.FALSE);
            } else {
                mutableState.setValue(new T.a(false));
            }
        } else if (aVar instanceof KApiResponse.ServiceUnavailable) {
            Exception exception = ((KApiResponse.ServiceUnavailable) aVar).getException();
            ILogger kLog2 = KLog_androidKt.getKLog();
            String message = exception.getMessage();
            kLog2.e("AlphaPageModel", message != null ? message : "");
            T value3 = mutableState.getValue();
            if (value3 instanceof T.c) {
                ((T.c) value3).f71896b.setValue(Boolean.FALSE);
            } else {
                mutableState.setValue(new T.a(true));
            }
        } else {
            if (!(aVar instanceof KApiResponse.c)) {
                throw new NoWhenBranchMatchedException();
            }
            List list = (List) ((KApiResponse.c) aVar).a;
            if (!list.isEmpty() || (mutableState.getValue() instanceof T.c)) {
                List list2 = list;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (((com.bilibili.ogv.rank.api.f) obj2).f71949b.length() != 0) {
                        arrayList.add(obj2);
                    }
                }
                cVar = new T.c(arrayList);
            } else {
                cVar = new T.a(false);
            }
            mutableState.setValue(cVar);
        }
        return Unit.INSTANCE;
    }
}
