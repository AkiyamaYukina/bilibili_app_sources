package com.bilibili.pegasus.components.interestv2.host;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.bilibili.biligame.ui.feed.widget.bottomtip.t;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.vm.PegasusViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import lp0.C7879b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.interest.v2.entry.InterestChooseEntrySource;
import tv.danmaku.bili.interest.v2.entry.InterestChooseHostRefreshMode;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interestv2/host/d.class */
@StabilityInferred(parameters = 0)
public final class d implements tv.danmaku.bili.interest.v2.runtime.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f77043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final BasePegasusComponent f77044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PegasusViewModel f77045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.pegasus.components.cny.a f77046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Fp0.b f77047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final g f77048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final c f77049g;

    @Nullable
    public j h;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interestv2/host/d$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f77050a;

        static {
            int[] iArr = new int[InterestChooseHostRefreshMode.values().length];
            try {
                iArr[InterestChooseHostRefreshMode.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[InterestChooseHostRefreshMode.ONESHOT.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[InterestChooseHostRefreshMode.NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[InterestChooseHostRefreshMode.INTEREST.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            f77050a = iArr;
        }
    }

    public d(@NotNull FragmentActivity fragmentActivity, @NotNull BasePegasusComponent basePegasusComponent, @NotNull PegasusViewModel pegasusViewModel, @NotNull com.bilibili.pegasus.components.cny.a aVar, @Nullable Fp0.b bVar, @NotNull g gVar, @NotNull c cVar) {
        this.f77043a = fragmentActivity;
        this.f77044b = basePegasusComponent;
        this.f77045c = pegasusViewModel;
        this.f77046d = aVar;
        this.f77047e = bVar;
        this.f77048f = gVar;
        this.f77049g = cVar;
    }

    public final boolean a() {
        if (!((Boolean) this.f77048f.f77055d.invoke()).booleanValue()) {
            return false;
        }
        this.f77049g.f77038c.invoke();
        return true;
    }

    public final boolean b() {
        j jVar = this.h;
        boolean z6 = false;
        if (jVar != null) {
            z6 = false;
            if (jVar.f77063f != null) {
                z6 = true;
            }
        }
        return z6;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void c(kp0.f fVar, InterestChooseHostRefreshMode interestChooseHostRefreshMode, boolean z6) throws NoWhenBranchMatchedException {
        c cVar = this.f77049g;
        cVar.f77036a.invoke();
        if (z6 && fVar != null) {
            fVar.a();
        }
        int i7 = a.f77050a[interestChooseHostRefreshMode.ordinal()];
        if (i7 != 1) {
            PegasusViewModel pegasusViewModel = this.f77045c;
            if (i7 == 2) {
                pegasusViewModel.M0(fVar);
            } else {
                if (i7 != 3 && i7 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                t tVar = new t(this, 1, interestChooseHostRefreshMode, fVar);
                if (this.f77048f.f77052a) {
                    BuildersKt.launch$default(ViewModelKt.getViewModelScope(pegasusViewModel), (CoroutineContext) null, (CoroutineStart) null, new AndroidInterestChoosePlatformPort$refreshPegasus$1(this, tVar, null), 3, (Object) null);
                } else {
                    tVar.invoke();
                }
            }
        }
        cVar.f77037b.invoke();
        MutableLiveData<Integer> mutableLiveData = Ao0.a.f371a;
        Integer value = mutableLiveData.getValue();
        if (value == null || value.intValue() != 1) {
            mutableLiveData.setValue(1);
        }
        if (this.f77047e != null) {
            Fp0.b.a(false, false);
        }
    }

    public final void d(@NotNull InterestChooseEntrySource interestChooseEntrySource) {
        this.f77049g.f77041f.invoke(interestChooseEntrySource);
    }

    public final void e(boolean z6) {
        PegasusViewModel pegasusViewModel = this.f77045c;
        pegasusViewModel.getClass();
        pegasusViewModel.z(pegasusViewModel, new C7879b(z6));
    }

    public final void f() throws Exception {
        j jVar = this.h;
        if (jVar != null) {
            jVar.a();
        }
        if (this.f77047e != null) {
            Fp0.b.a(false, false);
        }
    }
}
