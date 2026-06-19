package com.bilibili.upper.module.uppercenter.model;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.bilibili.upper.api.bean.uppercenter.UpperInspirationCategory;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/model/InspirationViewModel.class */
@StabilityInferred(parameters = 0)
public final class InspirationViewModel extends Yv0.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<UpperInspirationCategory> f114108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f114109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<String> f114110e;

    public InspirationViewModel(@NotNull Application application) {
        super(application);
        this.f114108c = new ArrayList();
        this.f114109d = new MutableLiveData<>();
        this.f114110e = new MutableLiveData<>();
    }

    public final void J0(int i7) {
        BuildersKt.launch$default(((Yv0.c) this).b, (CoroutineContext) null, (CoroutineStart) null, new InspirationViewModel$refreshInspirationCard$1(this, i7, null), 3, (Object) null);
    }

    public final void onCleared() {
        super.onCleared();
        ((ArrayList) this.f114108c).clear();
    }
}
