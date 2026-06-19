package com.bilibili.ogv.operation3.filmlisthub;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import javax.inject.Inject;
import kntr.common.komponent.KomponentHostScope;
import kntr.common.komponent.KomponentScope;
import kntr.common.trio.toast.Toaster;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/filmlisthub/FilmListHubPageModel.class */
@StabilityInferred(parameters = 0)
public final class FilmListHubPageModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ogv.operation3.filmlisthub.api.f f71028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Vk0.g f71029b;

    @Inject
    public FilmListHubPageModel(@NotNull com.bilibili.ogv.operation3.filmlisthub.api.f fVar, @NotNull Vk0.g gVar) {
        this.f71028a = fVar;
        this.f71029b = gVar;
    }

    public static final void a(KomponentScope<? super Unit> komponentScope, FilmListHubPageModel filmListHubPageModel, MutableState<l> mutableState, Toaster toaster) {
        KomponentHostScope.launch$default(komponentScope, (CoroutineContext) null, (CoroutineStart) null, new FilmListHubPageModel$komponent$1$refreshData$1(filmListHubPageModel, mutableState, toaster, null), 3, (Object) null);
    }
}
