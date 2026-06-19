package com.bilibili.ogv.rank;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import javax.inject.Inject;
import kntr.common.komponent.KomponentHostScope;
import kntr.common.komponent.KomponentScope;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/PageUiService.class */
@StabilityInferred(parameters = 0)
public final class PageUiService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f71874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ogv.rank.api.e f71875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C5500e f71876c;

    @Inject
    public PageUiService(@NotNull String str, @NotNull com.bilibili.ogv.rank.api.e eVar, @NotNull C5500e c5500e) {
        this.f71874a = str;
        this.f71875b = eVar;
        this.f71876c = c5500e;
    }

    public static final void a(KomponentScope<? super Unit> komponentScope, PageUiService pageUiService, MutableState<T> mutableState) {
        KomponentHostScope.launch$default(komponentScope, (CoroutineContext) null, (CoroutineStart) null, new PageUiService$komponent$1$refreshData$1(pageUiService, mutableState, null), 3, (Object) null);
    }
}
