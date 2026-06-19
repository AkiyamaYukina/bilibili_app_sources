package com.bilibili.ogv.secondary;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import javax.inject.Inject;
import kntr.common.komponent.KomponentHostScope;
import kntr.common.komponent.KomponentScope;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/PageUiService.class */
@StabilityInferred(parameters = 0)
public final class PageUiService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f72612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ogv.secondary.api.g f72613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C5523d f72614c;

    @Inject
    public PageUiService(@NotNull String str, @NotNull com.bilibili.ogv.secondary.api.g gVar, @NotNull C5523d c5523d) {
        this.f72612a = str;
        this.f72613b = gVar;
        this.f72614c = c5523d;
    }

    public static final void a(KomponentScope<? super Unit> komponentScope, PageUiService pageUiService, MutableState<I> mutableState) {
        KomponentHostScope.launch$default(komponentScope, (CoroutineContext) null, (CoroutineStart) null, new PageUiService$komponent$1$refreshData$1(pageUiService, mutableState, null), 3, (Object) null);
    }
}
