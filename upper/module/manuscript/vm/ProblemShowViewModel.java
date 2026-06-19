package com.bilibili.upper.module.manuscript.vm;

import TE0.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.bilibili.upper.api.bean.uppercenter.AppealReason;
import com.bilibili.upper.api.bean.uppercenter.UpperLimitReasons;
import com.bilibili.upper.api.bean.uppercenter.UpperMusicReasons;
import com.bilibili.upper.api.bean.uppercenter.UpperTranscodeReasons;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/vm/ProblemShowViewModel.class */
@StabilityInferred(parameters = 0)
public final class ProblemShowViewModel extends ZA0.a {
    public long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f113708i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f113710k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f113711l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f113712m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<UpperLimitReasons> f113702b = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<UpperTranscodeReasons> f113703c = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<UpperMusicReasons> f113704d = new MutableLiveData<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f113705e = new MutableLiveData<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f113706f = new MutableLiveData<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<AppealReason> f113707g = new MutableLiveData<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f113709j = true;

    public final void I0() {
        BuildersKt.launch$default(this.f29514a, (CoroutineContext) null, (CoroutineStart) null, new ProblemShowViewModel$getData$1(this, null), 3, (Object) null);
    }

    public final void J0() {
        BuildersKt.launch$default(this.f29514a, (CoroutineContext) null, (CoroutineStart) null, new ProblemShowViewModel$getMusicData$1(this, null), 3, (Object) null);
    }

    public final void K0() {
        BuildersKt.launch$default(this.f29514a, (CoroutineContext) null, (CoroutineStart) null, new ProblemShowViewModel$getTranscodeData$1(this, null), 3, (Object) null);
    }

    public final void L0() {
        BuildersKt.launch$default(this.f29514a, (CoroutineContext) null, (CoroutineStart) null, new ProblemShowViewModel$queryAppealState$1(this, null), 3, (Object) null);
    }

    public final void M0(int i7, @Nullable String str, @Nullable String str2, boolean z6) {
        List list;
        UpperLimitReasons.LimitReason limitReason;
        UpperLimitReasons value = this.f113702b.getValue();
        if (value == null || (list = value.reasons) == null || (limitReason = (UpperLimitReasons.LimitReason) CollectionsKt.getOrNull(list, i7)) == null) {
            return;
        }
        long j7 = limitReason.reasonId;
        if (this.f113712m) {
            return;
        }
        int i8 = 1;
        this.f113712m = true;
        if (z6) {
            b bVar = b.f24088a;
            long j8 = this.h;
            bVar.getClass();
            b.W(4, j8, j7);
        } else {
            b bVar2 = b.f24088a;
            long j9 = this.h;
            bVar2.getClass();
            b.X(4, j9, j7);
            i8 = 2;
        }
        BuildersKt.launch$default(this.f29514a, (CoroutineContext) null, (CoroutineStart) null, new ProblemShowViewModel$submitStatus$1(this, j7, i8, str, str2, i7, null), 3, (Object) null);
    }
}
