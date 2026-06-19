package com.bilibili.ship.theseus.playlist.di.page;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/page/W.class */
@StabilityInferred(parameters = 0)
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f95700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f95701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.intro.module.season.E f95702c;

    @Inject
    public W(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull com.bilibili.ship.theseus.united.page.intro.module.season.E e7) {
        this.f95700a = coroutineScope;
        this.f95701b = context;
        this.f95702c = e7;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlaylistUgcSeasonPanelItemClickService$1(this, null), 3, (Object) null);
    }
}
