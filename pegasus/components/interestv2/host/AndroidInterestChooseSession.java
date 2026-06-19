package com.bilibili.pegasus.components.interestv2.host;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.bilibili.app.dialogmanager.MainDialogManager;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.PegasusVisibleState;
import com.bilibili.pegasus.vm.PegasusViewModel;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.interest.v2.domain.InterestChooseV2Process;
import tv.danmaku.bili.interest.v2.entry.InterestChooseEntrySource;
import tv.danmaku.bili.interest.v2.entry.InterestChooseFailureCode;
import tv.danmaku.bili.interest.v2.entry.d;
import tv.danmaku.bili.interest.v2.entry.k;
import tv.danmaku.bili.interest.v2.entry.n;
import tv.danmaku.bili.interest.v2.entry.o;
import tv.danmaku.bili.interest.v2.entry.p;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interestv2/host/AndroidInterestChooseSession.class */
@StabilityInferred(parameters = 0)
public final class AndroidInterestChooseSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BasePegasusComponent f77027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LifecycleCoroutineScope f77028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Rg0.c f77029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Fp0.b f77030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final d f77031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final tv.danmaku.bili.interest.v2.runtime.c f77032f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f77033g;

    @Nullable
    public f h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f77034i;

    public AndroidInterestChooseSession(@NotNull BasePegasusComponent basePegasusComponent, @NotNull FragmentActivity fragmentActivity, @NotNull LifecycleCoroutineScope lifecycleCoroutineScope, @NotNull PegasusViewModel pegasusViewModel, @NotNull com.bilibili.pegasus.components.cny.a aVar, @Nullable Rg0.c cVar, @Nullable Fp0.b bVar, @NotNull g gVar, @NotNull c cVar2) {
        this.f77027a = basePegasusComponent;
        this.f77028b = lifecycleCoroutineScope;
        this.f77029c = cVar;
        this.f77030d = bVar;
        d dVar = new d(fragmentActivity, basePegasusComponent, pegasusViewModel, aVar, bVar, gVar, cVar2);
        this.f77031e = dVar;
        this.f77032f = new tv.danmaku.bili.interest.v2.runtime.c(lifecycleCoroutineScope, dVar);
        this.f77033g = PegasusVisibleState.constructor-impl(0);
    }

    public final void a(int i7) {
        StateFlow stateFlowAsStateFlow;
        StateFlow<Rg0.b> state;
        this.f77033g = i7;
        if (this.h == null) {
            f fVar = new f(this);
            this.h = fVar;
            MainDialogManager.addOnDialogEmptyListener(fVar);
        }
        Rg0.c cVar = this.f77029c;
        if (cVar != null && (state = cVar.getState()) != null) {
            BuildersKt.launch$default(this.f77028b, (CoroutineContext) null, (CoroutineStart) null, new AndroidInterestChooseSession$bind$1$1(state, this, null), 3, (Object) null);
        }
        if (this.f77030d != null && (stateFlowAsStateFlow = FlowKt.asStateFlow(Fp0.c.f6388a)) != null) {
            BuildersKt.launch$default(this.f77028b, (CoroutineContext) null, (CoroutineStart) null, new AndroidInterestChooseSession$bind$2$1(stateFlowAsStateFlow, this, null), 3, (Object) null);
        }
        c();
    }

    public final void b() throws Exception {
        if (this.f77034i) {
            return;
        }
        this.f77034i = true;
        f fVar = this.h;
        if (fVar != null) {
            MainDialogManager.removeDialogEmptyListener(fVar);
        }
        d.a aVar = null;
        this.h = null;
        tv.danmaku.bili.interest.v2.runtime.c cVar = this.f77032f;
        d dVar = cVar.a;
        dVar.f();
        dVar.e(false);
        o oVar = cVar.b;
        p pVar = oVar.a;
        InterestChooseFailureCode interestChooseFailureCode = InterestChooseFailureCode.HOST_DESTROYED;
        p.a aVar2 = pVar.p;
        if (aVar2 != null && !pVar.q) {
            pVar.q = true;
            pVar.g.setValue(k.b.a);
            tv.danmaku.bili.interest.v2.domain.d dVar2 = pVar.b.b;
            InterestChooseV2Process interestChooseV2Process = InterestChooseV2Process.ERROR;
            tv.danmaku.bili.interest.v2.entry.e eVar = aVar2.b;
            InterestChooseEntrySource interestChooseEntrySource = eVar.a;
            fd1.k kVar = aVar2.c;
            tv.danmaku.bili.interest.v2.domain.d.b(dVar2, interestChooseV2Process, interestChooseEntrySource, false, kVar != null ? kVar.d : null, interestChooseFailureCode, eVar.d.c, 32);
            pVar.e(aVar2);
            long j7 = pVar.n;
            pVar.n = 1 + j7;
            int i7 = n.a[interestChooseFailureCode.ordinal()];
            tv.danmaku.bili.interest.v2.entry.c cVar2 = eVar.j;
            aVar = new d.a(j7, aVar2.a, eVar.a, (tv.danmaku.bili.interest.v2.entry.f) null, interestChooseFailureCode, new tv.danmaku.bili.interest.v2.entry.g((i7 == 1 || i7 == 2) ? cVar2.e : cVar2.c, cVar2.f));
        }
        if (aVar != null) {
            dVar.d(aVar.c);
            cVar.a(aVar);
            oVar.a.getClass();
        } else {
            dVar.d(InterestChooseEntrySource.LOW_ACTIVE_TIANMA);
        }
        Job job = cVar.d;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        cVar.d = null;
        d dVar3 = this.f77031e;
        j jVar = dVar3.h;
        if (jVar != null) {
            jVar.a();
        }
        dVar3.h = null;
        if (dVar3.f77047e != null) {
            Fp0.b.a(false, false);
        }
        dVar3.f77049g.f77042g.invoke();
    }

    public final void c() {
        Lifecycle lifecycle;
        Lifecycle.State currentState;
        StateFlow stateFlowAsStateFlow;
        com.bilibili.moduleservice.main.g gVar;
        StateFlow<Rg0.b> state;
        Rg0.b bVar;
        if (this.f77034i) {
            return;
        }
        int i7 = this.f77033g;
        boolean z6 = PegasusVisibleState.getVisibleFromSplash-impl(i7);
        BasePegasusComponent basePegasusComponent = this.f77027a;
        Fragment fragment = basePegasusComponent.getFragment();
        boolean z7 = PegasusVisibleState.isVisible-impl(i7) || (z6 && PegasusVisibleState.getVisibleInViewPager-impl(i7) && PegasusVisibleState.getVisibleInLifecycle-impl(i7) && PegasusVisibleState.getVisibleFromObscured-impl(i7)) || (z6 && (fragment != null && fragment.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED) && fragment.isVisible()));
        Rg0.c cVar = this.f77029c;
        boolean z8 = (cVar == null || (state = cVar.getState()) == null || (bVar = (Rg0.b) state.getValue()) == null || !bVar.f20817a) ? false : true;
        boolean zIsDialogShowing = MainDialogManager.isDialogShowing();
        tv.danmaku.bili.interest.v2.runtime.c cVar2 = this.f77032f;
        boolean z9 = zIsDialogShowing && !cVar2.a.b();
        boolean z10 = (this.f77030d == null || (stateFlowAsStateFlow = FlowKt.asStateFlow(Fp0.c.f6388a)) == null || (gVar = (com.bilibili.moduleservice.main.g) stateFlowAsStateFlow.getValue()) == null || !gVar.f66325a || cVar2.a.b()) ? false : true;
        Fragment fragment2 = basePegasusComponent.getFragment();
        tv.danmaku.bili.interest.v2.entry.h hVar = new tv.danmaku.bili.interest.v2.entry.h(z7, z6, z8, z9, z10, (z8 || z9 || z10) ? false : true, (fragment2 == null || (lifecycle = fragment2.getLifecycle()) == null || (currentState = lifecycle.getCurrentState()) == null || !currentState.isAtLeast(Lifecycle.State.STARTED)) ? false : true, basePegasusComponent.getActivity() != null, false, (String) null, new tv.danmaku.bili.interest.v2.entry.i(0));
        p pVar = cVar2.b.a;
        pVar.e.setValue(hVar);
        p.a aVar = pVar.p;
        if (aVar != null && !pVar.q && aVar.d && !((tv.danmaku.bili.interest.v2.entry.h) pVar.f.getValue()).a()) {
            tv.danmaku.bili.interest.v2.entry.e eVar = aVar.b;
            pVar.g.setValue(new k.c(eVar.a));
            pVar.p = p.a.a(aVar, (fd1.k) null, false, false, false, false, 119);
            long j7 = pVar.n;
            pVar.n = j7 + 1;
            pVar.b(new d.k(j7, aVar.a, eVar.a));
            long j8 = pVar.n;
            pVar.n = j8 + 1;
            pVar.b(new d.g(j8, aVar.a, eVar.a));
            long j9 = pVar.n;
            pVar.n = 1 + j9;
            pVar.b(new d.h(j9, aVar.a, eVar.a, false));
        }
        pVar.h();
    }
}
