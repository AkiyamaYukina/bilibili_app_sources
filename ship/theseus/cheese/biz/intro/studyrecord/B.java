package com.bilibili.ship.theseus.cheese.biz.intro.studyrecord;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import eu0.C6987f;
import javax.inject.Inject;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.IControlContainerService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/B.class */
@StabilityInferred(parameters = 0)
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f90134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f90135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f90136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C6987f f90137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final yk.c f90138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f90139f;

    @Inject
    public B(@NotNull CoroutineScope coroutineScope, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull FragmentActivity fragmentActivity, @NotNull C6987f c6987f, @NotNull yk.c cVar2, @NotNull IControlContainerService iControlContainerService) {
        this.f90134a = coroutineScope;
        this.f90135b = cVar;
        this.f90136c = fragmentActivity;
        this.f90137d = c6987f;
        this.f90138e = cVar2;
        this.f90139f = iControlContainerService;
    }
}
