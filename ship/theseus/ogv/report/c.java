package com.bilibili.ship.theseus.ogv.report;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerVo;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/report/c.class */
@StabilityInferred(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f94396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final h f94397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Flow<PlayViewUniteReply> f94398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Flow<RestrictionLayerVo> f94399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final d f94400e;

    @Inject
    public c(@NotNull CoroutineScope coroutineScope, @NotNull h hVar, @NotNull Flow<PlayViewUniteReply> flow, @NotNull Flow<RestrictionLayerVo> flow2, long j7, long j8, boolean z6, @NotNull d dVar) {
        this.f94396a = coroutineScope;
        this.f94397b = hVar;
        this.f94398c = flow;
        this.f94399d = flow2;
        this.f94400e = dVar;
        if (!z6) {
            dVar.f94404d = false;
            return;
        }
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new MediaQuitReportService$subscribe$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new MediaQuitReportService$subscribe$2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new MediaQuitReportService$subscribe$3(this, null), 3, (Object) null);
        int i7 = dVar.f94405e;
        if (i7 > 0) {
            dVar.f94404d = false;
        }
        dVar.f94405e = i7 + 1;
        dVar.a(Long.valueOf(j7), Long.valueOf(j8));
        if (dVar.f94404d) {
            dVar.f94403c.f94416c = Intrinsics.areEqual("ogv", "ogv");
        }
    }
}
