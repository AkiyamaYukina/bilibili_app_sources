package com.bilibili.ship.theseus.detail;

import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import tv.danmaku.bili.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/UnitedBizDetailsActivity$prepareFallbackOnBackPressed$1.class */
final class UnitedBizDetailsActivity$prepareFallbackOnBackPressed$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private Object L$0;
    int label;
    final UnitedBizDetailsActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitedBizDetailsActivity$prepareFallbackOnBackPressed$1(UnitedBizDetailsActivity unitedBizDetailsActivity, Continuation<? super UnitedBizDetailsActivity$prepareFallbackOnBackPressed$1> continuation) {
        super(2, continuation);
        this.this$0 = unitedBizDetailsActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(UnitedBizDetailsActivity unitedBizDetailsActivity) {
        super/*com.bilibili.lib.ui.BaseAppCompatActivity*/.onBackPressed();
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UnitedBizDetailsActivity$prepareFallbackOnBackPressed$1 unitedBizDetailsActivity$prepareFallbackOnBackPressed$1 = new UnitedBizDetailsActivity$prepareFallbackOnBackPressed$1(this.this$0, continuation);
        unitedBizDetailsActivity$prepareFallbackOnBackPressed$1.L$0 = obj;
        return unitedBizDetailsActivity$prepareFallbackOnBackPressed$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        a.T1 t12 = this.this$0.f90861F;
        a.T1 t13 = t12;
        if (t12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("component");
            t13 = null;
        }
        BackActionRepository backActionRepository = (BackActionRepository) t13.K0.get();
        final UnitedBizDetailsActivity unitedBizDetailsActivity = this.this$0;
        backActionRepository.f99048c = new Function0(unitedBizDetailsActivity) { // from class: com.bilibili.ship.theseus.detail.i

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UnitedBizDetailsActivity f91069a;

            {
                this.f91069a = unitedBizDetailsActivity;
            }

            public final Object invoke() {
                return UnitedBizDetailsActivity$prepareFallbackOnBackPressed$1.invokeSuspend$lambda$0(this.f91069a);
            }
        };
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new UnitedBizDetailsActivity$prepareFallbackOnBackPressed$1$invokeSuspend$$inlined$awaitCancel$1(null, unitedBizDetailsActivity), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
