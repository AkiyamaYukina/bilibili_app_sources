package com.bilibili.ogv.filmlist;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import javax.inject.Inject;
import kntr.common.komponent.KomponentHostScope;
import kntr.common.komponent.KomponentScope;
import kntr.common.trio.toast.Toaster;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/B.class */
@StabilityInferred(parameters = 0)
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f67610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ogv.filmlist.api.b f67611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final f f67612c;

    @Inject
    public B(@NotNull String str, @NotNull com.bilibili.ogv.filmlist.api.b bVar, @NotNull f fVar) {
        this.f67610a = str;
        this.f67611b = bVar;
        this.f67612c = fVar;
    }

    public static final void a(KomponentScope komponentScope, B b7, MutableState mutableState, Toaster toaster) {
        KomponentHostScope.launch$default(komponentScope, (CoroutineContext) null, (CoroutineStart) null, new PageUiService$komponent$1$refreshData$1(b7, mutableState, toaster, null), 3, (Object) null);
    }
}
