package com.bilibili.upper.module.template.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.bilibili.studio.template.data.VideoTemplateBean;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/template/vm/j.class */
@StabilityInferred(parameters = 0)
public final class j extends ZA0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final NI0.d f114057b = new NI0.d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f114058c = new MutableLiveData<>(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f114059d = new MutableLiveData<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f114060e = new MutableLiveData<>(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f114061f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<VideoTemplateBean> f114062g = new MutableLiveData<>();
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f114063i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public Job f114064j;

    public j() {
        new MutableLiveData();
        this.h = true;
    }

    public final boolean I0() {
        Integer value = this.f114058c.getValue();
        boolean z6 = false;
        if ((value != null ? value.intValue() : 0) == 3) {
            z6 = true;
        }
        return z6;
    }

    public final void J0(int i7) {
        MutableLiveData<Integer> mutableLiveData = this.f114058c;
        Integer value = mutableLiveData.getValue();
        if (((value != null ? value.intValue() : 0) & i7) != i7) {
            Integer value2 = mutableLiveData.getValue();
            int iIntValue = 0;
            if (value2 != null) {
                iIntValue = value2.intValue();
            }
            mutableLiveData.setValue(Integer.valueOf(i7 | iIntValue));
        }
    }

    public final void K0() {
        if (this.h) {
            this.f114059d.setValue(3);
            this.f114061f = 3;
            this.f114063i = false;
            Job job = this.f114064j;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                this.f114064j = null;
            }
            if (I0()) {
                this.f114057b.f17106a.pause();
            }
        }
    }

    public final void L0() {
        if (this.h) {
            this.f114059d.setValue(2);
            this.f114061f = 2;
            if (!this.f114063i) {
                this.f114063i = true;
                this.f114064j = BuildersKt.launch$default(this.f29514a, (CoroutineContext) null, (CoroutineStart) null, new TemplatePreviewViewModel$startLoopForProgress$1(this, null), 3, (Object) null);
            }
            if (!this.f114057b.f17106a.isPlaying() && I0()) {
                this.f114057b.f17106a.start();
            }
        }
    }

    @Override // ZA0.a, androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.f114057b.a();
        super.onCleared();
    }
}
