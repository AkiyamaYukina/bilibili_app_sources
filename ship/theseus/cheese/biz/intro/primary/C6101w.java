package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.cheese.pay.model.PayCouponVo;
import eu0.C6978A;
import eu0.C7007z;
import java.util.List;
import javax.inject.Inject;
import kotlin.Unit;
import kotlinx.coroutines.CoroutineScope;
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

/* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/w.class */
@StabilityInferred(parameters = 0)
public final class C6101w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f89779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C6978A f89780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<C7007z> f89781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final StateFlow<C7007z> f89782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f89783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Unit> f89784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<List<PayCouponVo>> f89785g;

    @NotNull
    public final StateFlow<List<PayCouponVo>> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<V> f89786i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final StateFlow<V> f89787j;

    @Inject
    public C6101w(@NotNull CoroutineScope coroutineScope, @NotNull C7007z c7007z, @NotNull C6978A c6978a) {
        this.f89779a = coroutineScope;
        this.f89780b = c6978a;
        MutableStateFlow<C7007z> MutableStateFlow = StateFlowKt.MutableStateFlow(c7007z);
        this.f89781c = MutableStateFlow;
        this.f89782d = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_OLDEST, 1, (Object) null);
        this.f89783e = mutableSharedFlowMutableSharedFlow$default;
        this.f89784f = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableStateFlow<List<PayCouponVo>> MutableStateFlow2 = StateFlowKt.MutableStateFlow((Object) null);
        this.f89785g = MutableStateFlow2;
        this.h = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<V> MutableStateFlow3 = StateFlowKt.MutableStateFlow((Object) null);
        this.f89786i = MutableStateFlow3;
        this.f89787j = FlowKt.asStateFlow(MutableStateFlow3);
    }

    @NotNull
    public final C7007z a() {
        return (C7007z) this.f89782d.getValue();
    }

    public final void b(int i7) {
        BLog.d("primaryRepo updateCouponStatus status = " + i7);
        MutableStateFlow<C7007z> mutableStateFlow = this.f89781c;
        C7007z c7007z = (C7007z) mutableStateFlow.getValue();
        String str = c7007z.f117601a;
        String str2 = c7007z.f117602b;
        String str3 = c7007z.f117603c;
        String str4 = c7007z.f117604d;
        double d7 = c7007z.f117605e;
        String str5 = c7007z.f117606f;
        int i8 = c7007z.f117607g;
        int i9 = c7007z.h;
        String str6 = c7007z.f117608i;
        String str7 = c7007z.f117609j;
        String str8 = c7007z.f117610k;
        String str9 = c7007z.f117611l;
        long j7 = c7007z.f117612m;
        long j8 = c7007z.f117613n;
        String str10 = c7007z.f117614o;
        String str11 = c7007z.f117615p;
        String str12 = c7007z.f117616q;
        boolean z6 = c7007z.f117617r;
        boolean z7 = c7007z.f117618s;
        c7007z.getClass();
        C7007z c7007z2 = new C7007z(str, str2, str3, str4, d7, str5, i8, i9, str6, str7, str8, str9, j7, j8, str10, str11, str12, z6, z7);
        c7007z2.f117607g = i7;
        mutableStateFlow.setValue(c7007z2);
    }
}
