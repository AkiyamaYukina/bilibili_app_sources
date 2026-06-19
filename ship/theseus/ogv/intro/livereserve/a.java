package com.bilibili.ship.theseus.ogv.intro.livereserve;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.okretro.ServiceGenerator;
import javax.inject.Inject;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/livereserve/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final OgvLiveReserveOperationApiService f93297a = (OgvLiveReserveOperationApiService) ServiceGenerator.createService(OgvLiveReserveOperationApiService.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<OgvLiveReserveVo> f93298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow f93299c;

    @Inject
    public a(@Nullable OgvLiveReserveVo ogvLiveReserveVo) {
        MutableStateFlow<OgvLiveReserveVo> MutableStateFlow = StateFlowKt.MutableStateFlow(ogvLiveReserveVo);
        this.f93298b = MutableStateFlow;
        this.f93299c = MutableStateFlow;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r10, @org.jetbrains.annotations.NotNull com.bilibili.ogv.pub.season.a r12, long r13, int r15, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r16) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.livereserve.a.a(long, com.bilibili.ogv.pub.season.a, long, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(long r7, @org.jetbrains.annotations.NotNull com.bilibili.ogv.pub.season.a r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.livereserve.a.b(long, com.bilibili.ogv.pub.season.a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
