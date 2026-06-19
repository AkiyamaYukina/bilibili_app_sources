package com.bilibili.tgwt.match.ui;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/match/ui/TogetherWatchMatchFragment$checkIsLoginAndPerform$1.class */
final class TogetherWatchMatchFragment$checkIsLoginAndPerform$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final TogetherWatchMatchFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogetherWatchMatchFragment$checkIsLoginAndPerform$1(TogetherWatchMatchFragment togetherWatchMatchFragment, Continuation<? super TogetherWatchMatchFragment$checkIsLoginAndPerform$1> continuation) {
        super(2, continuation);
        this.this$0 = togetherWatchMatchFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TogetherWatchMatchFragment$checkIsLoginAndPerform$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
            this.label = 1;
            Object objA = com.bilibili.ogv.infra.account.b.a(fragmentActivityRequireActivity, this);
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
        if (((Boolean) obj).booleanValue()) {
            JD0.d dVar = this.this$0.f111478b;
            JD0.d dVar2 = dVar;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mVm");
                dVar2 = null;
            }
            if (!dVar2.f11252f) {
                TogetherWatchMatchFragment togetherWatchMatchFragment = this.this$0;
                togetherWatchMatchFragment.getClass();
                BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(togetherWatchMatchFragment), (CoroutineContext) null, (CoroutineStart) null, new TogetherWatchMatchFragment$requestTogetherWatchAuthorize$1(togetherWatchMatchFragment, new e(togetherWatchMatchFragment), null), 3, (Object) null);
            }
        } else {
            this.this$0.requireActivity().finish();
        }
        return Unit.INSTANCE;
    }
}
