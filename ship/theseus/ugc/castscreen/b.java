package com.bilibili.ship.theseus.ugc.castscreen;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository;
import com.bilibili.ship.theseus.united.page.castscreen.BusinessCastScreenService;
import com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonDetailRepository;
import ev0.InterfaceC7008a;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/castscreen/b.class */
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f96380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Av0.a f96381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final rW0.a<InterfaceC7008a> f96382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final UGCPlaybackRepository f96383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final BusinessCastScreenService f96384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final C8043a f96385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final UnitedSeasonDetailRepository f96386g;

    @Inject
    public b(@NotNull CoroutineScope coroutineScope, @NotNull Av0.a aVar, @NotNull rW0.a<InterfaceC7008a> aVar2, @NotNull UGCPlaybackRepository uGCPlaybackRepository, @NotNull BusinessCastScreenService businessCastScreenService, @NotNull C8043a c8043a, @NotNull UnitedSeasonDetailRepository unitedSeasonDetailRepository) {
        this.f96380a = coroutineScope;
        this.f96381b = aVar;
        this.f96382c = aVar2;
        this.f96383d = uGCPlaybackRepository;
        this.f96384e = businessCastScreenService;
        this.f96385f = c8043a;
        this.f96386g = unitedSeasonDetailRepository;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new UGCEpCastScreenService$collectCastScreenToNext$1(this, null), 3, (Object) null);
    }
}
