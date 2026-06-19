package com.bilibili.upper.module.manuscript.vm;

import M3.A1;
import M3.C2638z1;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bilibili.upper.api.bean.uppercenter.AppealReason;
import com.bilibili.upper.module.manuscript.bean.ManuscriptOpenEntity;
import com.bilibili.upper.module.manuscript.bean.ManuscriptReviewEntity;
import com.bilibili.upper.module.manuscript.bean.ManuscriptTranscodingEntity;
import com.bilibili.upper.module.manuscript.bean.ManuscriptVideosEntity;
import com.bilibili.upper.module.manuscript.repository.e;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/vm/ManuscriptProgressDetailsViewModel.class */
@StabilityInferred(parameters = 0)
public final class ManuscriptProgressDetailsViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lazy f113679a = LazyKt.lazy(new C2638z1(8));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<ManuscriptVideosEntity> f113680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final StateFlow<ManuscriptVideosEntity> f113681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Result<ManuscriptVideosEntity>> f113682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final StateFlow<Result<ManuscriptVideosEntity>> f113683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Result<ManuscriptTranscodingEntity>> f113684f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final StateFlow<Result<ManuscriptTranscodingEntity>> f113685g;

    @NotNull
    public final MutableStateFlow<Long> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final StateFlow<Long> f113686i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public Job f113687j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Result<ManuscriptReviewEntity>> f113688k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final StateFlow<Result<ManuscriptReviewEntity>> f113689l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Result<ManuscriptOpenEntity>> f113690m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final StateFlow<Result<ManuscriptOpenEntity>> f113691n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f113692o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f113693p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f113694q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public String f113695r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Pair<Boolean, String>> f113696s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f113697t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Boolean> f113698u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Boolean> f113699v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<AppealReason> f113700w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final Lazy f113701x;

    public ManuscriptProgressDetailsViewModel() {
        MutableStateFlow<ManuscriptVideosEntity> MutableStateFlow = StateFlowKt.MutableStateFlow((Object) null);
        this.f113680b = MutableStateFlow;
        this.f113681c = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Result<ManuscriptVideosEntity>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(Result.box-impl(Result.constructor-impl((Object) null)));
        this.f113682d = MutableStateFlow2;
        this.f113683e = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Result<ManuscriptTranscodingEntity>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(Result.box-impl(Result.constructor-impl((Object) null)));
        this.f113684f = MutableStateFlow3;
        this.f113685g = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<Long> MutableStateFlow4 = StateFlowKt.MutableStateFlow(0L);
        this.h = MutableStateFlow4;
        this.f113686i = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<Result<ManuscriptReviewEntity>> MutableStateFlow5 = StateFlowKt.MutableStateFlow(Result.box-impl(Result.constructor-impl((Object) null)));
        this.f113688k = MutableStateFlow5;
        this.f113689l = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<Result<ManuscriptOpenEntity>> MutableStateFlow6 = StateFlowKt.MutableStateFlow(Result.box-impl(Result.constructor-impl((Object) null)));
        this.f113690m = MutableStateFlow6;
        this.f113691n = FlowKt.asStateFlow(MutableStateFlow6);
        this.f113692o = true;
        this.f113693p = true;
        this.f113694q = true;
        this.f113695r = "";
        this.f113696s = new MutableLiveData<>();
        this.f113697t = new MutableLiveData<>();
        MutableSharedFlow<Boolean> MutableSharedFlow = SharedFlowKt.MutableSharedFlow(1, 0, BufferOverflow.DROP_OLDEST);
        this.f113698u = MutableSharedFlow;
        this.f113699v = FlowKt.asSharedFlow(MutableSharedFlow);
        this.f113700w = new MutableLiveData<>();
        this.f113701x = LazyKt.lazy(new A1(6));
    }

    public static final e I0(ManuscriptProgressDetailsViewModel manuscriptProgressDetailsViewModel) {
        return (e) manuscriptProgressDetailsViewModel.f113679a.getValue();
    }

    public static final int J0(ManuscriptProgressDetailsViewModel manuscriptProgressDetailsViewModel, Integer num) {
        manuscriptProgressDetailsViewModel.getClass();
        return ((num != null && num.intValue() == 3) || (num != null && num.intValue() == 11) || (num != null && num.intValue() == 10)) ? 1003 : (num != null && num.intValue() == 7) ? 1002 : 1001;
    }

    public static void T0(ManuscriptProgressDetailsViewModel manuscriptProgressDetailsViewModel) {
        Job job = manuscriptProgressDetailsViewModel.f113687j;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        manuscriptProgressDetailsViewModel.f113687j = null;
        manuscriptProgressDetailsViewModel.f113687j = BuildersKt.launch$default(ViewModelKt.getViewModelScope(manuscriptProgressDetailsViewModel), (CoroutineContext) null, (CoroutineStart) null, new ManuscriptProgressDetailsViewModel$startTimer$1(1000L, manuscriptProgressDetailsViewModel, 1000L, null), 3, (Object) null);
    }

    public final void K0(long j7, long j8, long j9, long j10) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new ManuscriptProgressDetailsViewModel$getMoreVideosData$1(j7, this, j8, j9, j10, null), 3, (Object) null);
    }

    public final void L0(long j7) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new ManuscriptProgressDetailsViewModel$getOpenData$1(j7, this, null), 3, (Object) null);
    }

    public final void M0(long j7) {
        if (j7 <= 0) {
            return;
        }
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new ManuscriptProgressDetailsViewModel$getOpenLimitDesc$1(this, j7, null), 3, (Object) null);
    }

    public final void N0(long j7) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new ManuscriptProgressDetailsViewModel$getReviewData$1(j7, this, null), 3, (Object) null);
    }

    public final void O0(long j7, long j8) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new ManuscriptProgressDetailsViewModel$getTranscodingData$1(j8, j7, this, null), 3, (Object) null);
    }

    public final void P0(long j7) {
        if (j7 <= 0) {
            return;
        }
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new ManuscriptProgressDetailsViewModel$openManuscript$1(j7, this, null), 3, (Object) null);
    }

    public final void Q0(long j7) {
        if (j7 <= 0) {
            return;
        }
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new ManuscriptProgressDetailsViewModel$queryAppealState$1(this, j7, null), 3, (Object) null);
    }

    public final void R0(long j7, long j8, long j9) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new ManuscriptProgressDetailsViewModel$refreshVideosData$1(j8, this, j9, 500L, j7, null), 3, (Object) null);
    }

    public final void S0(int i7, long j7, long j8) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new ManuscriptProgressDetailsViewModel$requestAllData$1(this, i7, j7, j8, 1L, 500L, null), 3, (Object) null);
    }
}
