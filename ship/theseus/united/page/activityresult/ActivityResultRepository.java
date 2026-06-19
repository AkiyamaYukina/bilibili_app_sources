package com.bilibili.ship.theseus.united.page.activityresult;

import android.content.Intent;
import androidx.compose.runtime.internal.StabilityInferred;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activityresult/ActivityResultRepository.class */
@StabilityInferred(parameters = 0)
public final class ActivityResultRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f98827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<a> f98828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SharedFlow<a> f98829c;

    @Inject
    public ActivityResultRepository(@NotNull CoroutineScope coroutineScope) {
        this.f98827a = coroutineScope;
        MutableSharedFlow<a> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, (BufferOverflow) null, 7, (Object) null);
        this.f98828b = mutableSharedFlowMutableSharedFlow$default;
        this.f98829c = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    public final void a(int i7, int i8, @Nullable Intent intent) {
        BuildersKt.launch$default(this.f98827a, (CoroutineContext) null, (CoroutineStart) null, new ActivityResultRepository$onActivityResult$1(this, i7, i8, intent, null), 3, (Object) null);
    }
}
