package com.bilibili.ship.theseus.cheese.player.castscreen;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository;
import com.bilibili.ship.theseus.united.page.castscreen.BusinessCastScreenService;
import com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonDetailRepository;
import eu0.C6985d;
import ev0.InterfaceC7008a;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/castscreen/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f90570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC7008a f90571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final CheesePlayRepository f90572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final BusinessCastScreenService f90573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C6985d f90574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final C8043a f90575f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final UnitedSeasonDetailRepository f90576g;

    @Inject
    public a(@NotNull CoroutineScope coroutineScope, @NotNull InterfaceC7008a interfaceC7008a, @NotNull CheesePlayRepository cheesePlayRepository, @NotNull BusinessCastScreenService businessCastScreenService, @NotNull C6985d c6985d, @NotNull C8043a c8043a, @NotNull UnitedSeasonDetailRepository unitedSeasonDetailRepository) {
        this.f90570a = coroutineScope;
        this.f90571b = interfaceC7008a;
        this.f90572c = cheesePlayRepository;
        this.f90573d = businessCastScreenService;
        this.f90574e = c6985d;
        this.f90575f = c8043a;
        this.f90576g = unitedSeasonDetailRepository;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new CheeseEpCastScreenService$collectCastScreenToNext$1(this, null), 3, (Object) null);
    }
}
