package com.bilibili.pegasus.components;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/HeaderViewModel.class */
@StabilityInferred(parameters = 0)
public final class HeaderViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f75784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Job f75785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<AlertMessage> f75786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final StateFlow<AlertMessage> f75787d;

    public HeaderViewModel() {
        MutableStateFlow<AlertMessage> MutableStateFlow = StateFlowKt.MutableStateFlow((Object) null);
        this.f75786c = MutableStateFlow;
        this.f75787d = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void I0() {
        Job job;
        boolean zB = o.b();
        boolean z6 = r0.a() - this.f75784a >= 1800000;
        if (!zB || !z6 || ((job = this.f75785b) != null && job.isActive())) {
            BLog.i("PegasusMemberNoticeHeader", "load cancel");
        } else {
            this.f75784a = r0.a();
            this.f75785b = BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new HeaderViewModel$loadMemberNotice$1(this, null), 3, (Object) null);
        }
    }
}
