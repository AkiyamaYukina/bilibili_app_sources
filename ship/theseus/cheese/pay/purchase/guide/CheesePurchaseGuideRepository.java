package com.bilibili.ship.theseus.cheese.pay.purchase.guide;

import I3.C2283x1;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.C4496a;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/pay/purchase/guide/CheesePurchaseGuideRepository.class */
@StabilityInferred(parameters = 0)
public final class CheesePurchaseGuideRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f90522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f90523b = LazyKt.lazy(new C2283x1(9));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<String> f90524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final SharedFlow<String> f90525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f90526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f90527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f90528g;
    public long h;

    @Inject
    public CheesePurchaseGuideRepository(@NotNull CoroutineScope coroutineScope) {
        this.f90522a = coroutineScope;
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_OLDEST, 1, (Object) null);
        this.f90524c = mutableSharedFlowMutableSharedFlow$default;
        this.f90525d = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    public final void a(@NotNull String str) {
        BuildersKt.launch$default(this.f90522a, Dispatchers.getIO(), (CoroutineStart) null, new CheesePurchaseGuideRepository$checkPurchaseFavoriteGuideEnable$1(this, str, null), 2, (Object) null);
    }

    public final void b(@NotNull String str) {
        defpackage.a.b("[theseus-cheese-CheesePurchaseGuideRepository-onPurchaseFavoriteGuideShown] ", C4496a.a("onPurchaseFavoriteGuideShown: ", str), "CheesePurchaseGuideRepository-onPurchaseFavoriteGuideShown");
        this.f90527f = true;
        BuildersKt.launch$default(this.f90522a, Dispatchers.getIO(), (CoroutineStart) null, new CheesePurchaseGuideRepository$onPurchaseFavoriteGuideShown$1(this, str, null), 2, (Object) null);
    }
}
