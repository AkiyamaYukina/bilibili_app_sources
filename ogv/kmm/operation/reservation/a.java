package com.bilibili.ogv.kmm.operation.reservation;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/reservation/a.class */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableState f68649a = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f68650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f68651c;

    public a(CoroutineScope coroutineScope, b bVar) {
        this.f68650b = coroutineScope;
        this.f68651c = bVar;
    }

    public final void a(long j7) {
        BuildersKt.launch$default(this.f68650b, (CoroutineContext) null, (CoroutineStart) null, new CreateReservationModel$invoke$1$reserve$1(this.f68651c, j7, "SPOT_SCREENING", this, null), 3, (Object) null);
    }
}
