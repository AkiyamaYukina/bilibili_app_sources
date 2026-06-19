package com.bilibili.upper.module.topic.vm;

import ZA0.a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.bilibili.upper.api.bean.topic.Topic;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/topic/vm/TopicSearchViewModel.class */
@StabilityInferred(parameters = 0)
public final class TopicSearchViewModel extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f114071c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f114074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f114075g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public String f114076i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public Job f114077j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f114078k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Pair<Integer, List<Topic>>> f114070b = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f114072d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public String f114073e = "";
    public int h = -1;

    public final void I0(@NotNull String str, boolean z6) {
        Job job = this.f114077j;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        if (!z6) {
            this.f114071c = 0;
        }
        this.f114077j = BuildersKt.launch$default(this.f29514a, (CoroutineContext) null, (CoroutineStart) null, new TopicSearchViewModel$search$1(str, this, null), 3, (Object) null);
    }
}
