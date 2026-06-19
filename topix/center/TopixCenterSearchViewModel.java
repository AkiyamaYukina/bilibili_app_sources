package com.bilibili.topix.center;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bilibili.topix.LoadListStatus;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/TopixCenterSearchViewModel.class */
@StabilityInferred(parameters = 0)
public final class TopixCenterSearchViewModel extends ViewModel {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f112387d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public String f112389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Job f112390g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f112384a = new MutableLiveData<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<LoadListStatus> f112385b = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Pair<Boolean, List<com.bilibili.topix.model.TopicItem>>> f112386c = new MutableLiveData<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f112388e = true;

    public final void I0(String str, boolean z6) {
        Job job = this.f112390g;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f112389f = str;
        if (z6) {
            this.f112387d = 0L;
            this.f112384a.setValue(0);
        } else if (!this.f112388e) {
            return;
        } else {
            this.f112385b.setValue(LoadListStatus.LOADING);
        }
        this.f112390g = BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new TopixCenterSearchViewModel$load$1(str, this, z6, null), 3, (Object) null);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        Job job = this.f112390g;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }
}
