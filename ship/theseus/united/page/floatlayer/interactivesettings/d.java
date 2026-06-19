package com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import javax.inject.Inject;
import kotlin.collections.CollectionsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/d.class */
@StabilityInferred(parameters = 0)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f99806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f99807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<List<InteractionSection>> f99808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final StateFlow<List<InteractionSection>> f99809d;

    @Inject
    public d(@NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull Context context) {
        this.f99806a = aVar;
        this.f99807b = context;
        MutableStateFlow<List<InteractionSection>> MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.f99808c = MutableStateFlow;
        this.f99809d = FlowKt.asStateFlow(MutableStateFlow);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.d.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(boolean r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.d.b(boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
