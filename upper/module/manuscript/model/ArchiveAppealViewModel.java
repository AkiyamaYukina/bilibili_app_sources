package com.bilibili.upper.module.manuscript.model;

import androidx.compose.foundation.text.C0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.bilibili.upper.api.bean.uppercenter.AppealReason;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/model/ArchiveAppealViewModel.class */
@StabilityInferred(parameters = 0)
public class ArchiveAppealViewModel extends ZA0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f113660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<a> f113661c = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<AppealReason> f113662d = new MutableLiveData<>();

    public final void I0() {
        C0.c(this.f113660b, "queryArchiveAppealState, aid = ", "ArchiveAppealViewModel");
        long j7 = this.f113660b;
        if (j7 == 0) {
            return;
        }
        BuildersKt.launch$default(this.f29514a, (CoroutineContext) null, (CoroutineStart) null, new ArchiveAppealViewModel$queryAppealState$1(j7, this, null), 3, (Object) null);
    }

    public final void J0() {
        C0.c(this.f113660b, "queryArchiveAppealState, aid = ", "ArchiveAppealViewModel");
        long j7 = this.f113660b;
        if (j7 == 0) {
            return;
        }
        BuildersKt.launch$default(this.f29514a, (CoroutineContext) null, (CoroutineStart) null, new ArchiveAppealViewModel$queryArchiveAppealState$1(j7, this, null), 3, (Object) null);
    }

    public final void K0(long j7) {
        C0.c(j7, "saveAidBeforeJump, aid = ", "ArchiveAppealViewModel");
        this.f113660b = j7;
    }

    @Override // ZA0.a, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.f113660b = 0L;
    }
}
