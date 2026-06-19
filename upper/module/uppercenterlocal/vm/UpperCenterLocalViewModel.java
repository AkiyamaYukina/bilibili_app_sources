package com.bilibili.upper.module.uppercenterlocal.vm;

import Yv0.c;
import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/vm/UpperCenterLocalViewModel.class */
@StabilityInferred(parameters = 0)
public final class UpperCenterLocalViewModel extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.upper.module.uppercenterlocal.repository.a f114299c;

    public UpperCenterLocalViewModel(@NotNull Application application) {
        super(application);
        this.f114299c = new com.bilibili.upper.module.uppercenterlocal.repository.a();
    }

    public final void I0() {
        BuildersKt.launch$default(((c) this).b, (CoroutineContext) null, (CoroutineStart) null, new UpperCenterLocalViewModel$initModelData$1(this, null), 3, (Object) null);
    }

    public final void J0() {
        BuildersKt.launch$default(((c) this).b, (CoroutineContext) null, (CoroutineStart) null, new UpperCenterLocalViewModel$disableCache$1(this, null), 3, (Object) null);
    }
}
