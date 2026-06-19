package com.bilibili.ship.theseus.united.page.charge;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.restrictionlayer.ChargingPlusOperationAction;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/charge/ChargeRepository.class */
@StabilityInferred(parameters = 0)
public final class ChargeRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f99148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f99149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Unit> f99150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Pair<String, ChargingPlusOperationAction.TYPE>> f99151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Pair<String, ChargingPlusOperationAction.TYPE>> f99152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f99153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Unit> f99154g;

    @NotNull
    public final MutableStateFlow<Boolean> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f99155i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<ChargingPlusOperationAction.TYPE> f99156j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final SharedFlow<ChargingPlusOperationAction.TYPE> f99157k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f99158l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f99159m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f99160n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f99161o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f99162p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f99163q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f99164r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Unit> f99165s;

    @Inject
    public ChargeRepository(@NotNull CoroutineScope coroutineScope) {
        this.f99148a = coroutineScope;
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f99149b = mutableSharedFlowMutableSharedFlow$default;
        this.f99150c = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<Pair<String, ChargingPlusOperationAction.TYPE>> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f99151d = mutableSharedFlowMutableSharedFlow$default2;
        this.f99152e = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, (BufferOverflow) null, 7, (Object) null);
        this.f99153f = mutableSharedFlowMutableSharedFlow$default3;
        this.f99154g = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        Boolean bool = Boolean.FALSE;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this.h = MutableStateFlow;
        this.f99155i = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<ChargingPlusOperationAction.TYPE> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f99156j = mutableSharedFlowMutableSharedFlow$default4;
        this.f99157k = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default4);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(bool);
        this.f99158l = MutableStateFlow2;
        this.f99159m = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Integer> MutableStateFlow3 = StateFlowKt.MutableStateFlow(-1);
        this.f99160n = MutableStateFlow3;
        this.f99161o = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<Integer> MutableStateFlow4 = StateFlowKt.MutableStateFlow(-1);
        this.f99162p = MutableStateFlow4;
        this.f99163q = FlowKt.asStateFlow(MutableStateFlow4);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f99164r = mutableSharedFlowMutableSharedFlow$default5;
        this.f99165s = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default5);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1 r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.charge.ChargeRepository$keepChargeAdUnlocking$1
            if (r0 == 0) goto L29
            r0 = r7
            com.bilibili.ship.theseus.united.page.charge.ChargeRepository$keepChargeAdUnlocking$1 r0 = (com.bilibili.ship.theseus.united.page.charge.ChargeRepository$keepChargeAdUnlocking$1) r0
            r9 = r0
            r0 = r9
            int r0 = r0.label
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L29
            r0 = r9
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r9
            r7 = r0
            goto L33
        L29:
            com.bilibili.ship.theseus.united.page.charge.ChargeRepository$keepChargeAdUnlocking$1 r0 = new com.bilibili.ship.theseus.united.page.charge.ChargeRepository$keepChargeAdUnlocking$1
            r1 = r0
            r2 = r5
            r3 = r7
            r1.<init>(r2, r3)
            r7 = r0
        L33:
            r0 = r7
            java.lang.Object r0 = r0.result
            r11 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r7
            int r0 = r0.label
            r8 = r0
            r0 = r5
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> r0 = r0.h
            r9 = r0
            r0 = r8
            if (r0 == 0) goto L68
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L5e
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L5a
            goto L8e
        L5a:
            r6 = move-exception
            goto L9d
        L5e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L68:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r9
            r1 = 1
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
            r0.setValue(r1)
            r0 = r7
            r1 = 1
            r0.label = r1     // Catch: java.lang.Throwable -> L5a
            r0 = r6
            r1 = r7
            java.lang.Object r0 = r0.invoke(r1)     // Catch: java.lang.Throwable -> L5a
            r6 = r0
            r0 = r6
            r1 = r10
            if (r0 != r1) goto L8e
            r0 = r10
            return r0
        L8e:
            r0 = r9
            r1 = 0
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
            r0.setValue(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L9d:
            r0 = r9
            r1 = 0
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
            r0.setValue(r1)
            r0 = r6
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.charge.ChargeRepository.a(kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void b(boolean z6) {
        BLog.i("[ChargeBloc]", "showResidentBar " + z6);
        this.f99162p.setValue(Integer.valueOf(z6 ? 1 : 0));
    }

    public final void c() {
        BuildersKt.launch$default(this.f99148a, (CoroutineContext) null, (CoroutineStart) null, new ChargeRepository$triggerChargeAdUnlock$1(this, null), 3, (Object) null);
    }
}
