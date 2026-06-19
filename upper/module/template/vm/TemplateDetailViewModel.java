package com.bilibili.upper.module.template.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.bilibili.studio.template.data.VideoTemplateBean;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/template/vm/TemplateDetailViewModel.class */
@StabilityInferred(parameters = 0)
public final class TemplateDetailViewModel extends ZA0.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f114025g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f114026i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f114027j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f114029l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<List<VideoTemplateBean>> f114020b = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f114021c = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Long> f114022d = new MutableLiveData<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f114023e = 2114474;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public String f114024f = "";

    @NotNull
    public String h = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public String f114028k = "";

    public final long I0() {
        Long value = this.f114022d.getValue();
        return value != null ? value.longValue() : -1L;
    }

    public final void J0() {
        if (this.f114023e <= 0) {
            return;
        }
        BuildersKt.launch$default(this.f29514a, (CoroutineContext) null, (CoroutineStart) null, new TemplateDetailViewModel$getData$1(this, null), 3, (Object) null);
    }
}
