package com.bilibili.upper.module.uppercenter.model;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.bilibili.upper.api.bean.centerv4.BCutToolsTab;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/model/a.class */
@StabilityInferred(parameters = 0)
public final class a extends Yv0.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f114116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Integer f114117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final List<BCutToolsTab> f114118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f114119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f114120g;

    public a(@NotNull Application application) {
        super(application);
        this.f114116c = 1;
        this.f114118e = new ArrayList();
        this.f114119f = new MutableLiveData<>(0);
        this.f114120g = 2131104254;
    }

    public final void onCleared() {
        super.onCleared();
        ZF0.a.f29540a.evictAll();
    }
}
