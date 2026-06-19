package com.bilibili.ship.theseus.united.page.toolbar;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.toolbar.MenuService;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/g.class */
@StabilityInferred(parameters = 0)
public final class C6423g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f103387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MenuService.a f103388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final j f103389c;

    @Inject
    public C6423g(@NotNull j jVar, @NotNull MenuService.a aVar, @NotNull CoroutineScope coroutineScope) {
        this.f103387a = coroutineScope;
        this.f103388b = aVar;
        this.f103389c = jVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new MediaMenuStrategyService$1(this, null), 3, (Object) null);
    }
}
