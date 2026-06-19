package com.bilibili.ship.theseus.united.page.toolbar;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.toolbar.MenuService;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/c.class */
@StabilityInferred(parameters = 0)
public final class C6419c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f103381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final j f103382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MenuService.a f103383c;

    @Inject
    public C6419c(@NotNull j jVar, @NotNull MenuService.a aVar, @NotNull CoroutineScope coroutineScope) {
        this.f103381a = coroutineScope;
        this.f103382b = jVar;
        this.f103383c = aVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new DetailMenuStrategyService$1(this, null), 3, (Object) null);
    }
}
