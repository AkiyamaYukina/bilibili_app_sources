package com.bilibili.ship.theseus.playlist.di.biz;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.playlist.E;
import com.bilibili.ship.theseus.united.page.intro.IntroRecycleViewService;
import com.bilibili.ship.theseus.united.page.tab.u;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/e.class */
@StabilityInferred(parameters = 0)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f95368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final E f95369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final u f95370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IntroRecycleViewService f95371d;

    @Inject
    public e(@NotNull CoroutineScope coroutineScope, @NotNull E e7, @NotNull u uVar, @NotNull IntroRecycleViewService introRecycleViewService) {
        this.f95368a = coroutineScope;
        this.f95369b = e7;
        this.f95370c = uVar;
        this.f95371d = introRecycleViewService;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlaylistFloatingSuppressService$collectPagerIndex$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlaylistFloatingSuppressService$addIntroRecyclerScrollStateListener$1(this, new d(this), null), 3, (Object) null);
    }
}
