package com.bilibili.upper.module.manuscript.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.bilibili.upper.api.bean.manuscript.VideoViolationPic;
import com.bilibili.upper.module.manuscript.bean.AuditReason;
import com.bilibili.upper.module.manuscript.bean.ProblemDetailBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/model/AggregatedAuditProblemShowViewModel.class */
@StabilityInferred(parameters = 0)
public final class AggregatedAuditProblemShowViewModel extends ArchiveAppealViewModel {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f113657g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public ProblemDetailBean f113658i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f113655e = new MutableLiveData<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Pair<Boolean, String>> f113656f = new MutableLiveData<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public String f113659j = "";

    public static void N0(AuditReason auditReason, List list) {
        auditReason.f113572i = new ArrayList();
        int i7 = 0;
        for (Object obj : list) {
            if (i7 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            VideoViolationPic videoViolationPic = (VideoViolationPic) obj;
            AuditReason.ViolationPic violationPic = new AuditReason.ViolationPic();
            violationPic.url = videoViolationPic.url;
            violationPic.timeStr = videoViolationPic.time;
            ((ArrayList) auditReason.f113572i).add(violationPic);
            i7++;
        }
    }

    public final void L0() {
        ProblemDetailBean problemDetailBean = this.f113658i;
        if (problemDetailBean != null) {
            BuildersKt.launch$default(this.f29514a, (CoroutineContext) null, (CoroutineStart) null, new AggregatedAuditProblemShowViewModel$getOpenLimitDesc$1(this, problemDetailBean.aid, null), 3, (Object) null);
        }
    }

    public final void M0() {
        ProblemDetailBean problemDetailBean = this.f113658i;
        if (problemDetailBean != null) {
            BuildersKt.launch$default(this.f29514a, (CoroutineContext) null, (CoroutineStart) null, new AggregatedAuditProblemShowViewModel$openLimit$1(problemDetailBean.aid, this, null), 3, (Object) null);
        }
    }
}
