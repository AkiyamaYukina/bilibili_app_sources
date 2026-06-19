package com.bilibili.ship.theseus.cheese.pay.purchase;

import androidx.compose.runtime.internal.StabilityInferred;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/pay/purchase/CheesePurchaseRepository.class */
@StabilityInferred(parameters = 0)
public final class CheesePurchaseRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f90495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Integer> f90496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Integer> f90497c;

    @Inject
    public CheesePurchaseRepository(@NotNull CoroutineScope coroutineScope) {
        this.f90495a = coroutineScope;
        MutableSharedFlow<Integer> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_OLDEST, 1, (Object) null);
        this.f90496b = mutableSharedFlowMutableSharedFlow$default;
        this.f90497c = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    public final void a(int i7) {
        BuildersKt.launch$default(this.f90495a, (CoroutineContext) null, (CoroutineStart) null, new CheesePurchaseRepository$onClickPay$1(this, i7, null), 3, (Object) null);
    }
}
