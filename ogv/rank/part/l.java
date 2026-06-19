package com.bilibili.ogv.rank.part;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ogv.rank.O;
import javax.inject.Inject;
import kntr.common.komponent.KomponentHostScope;
import kntr.common.komponent.KomponentScope;
import kntr.common.trio.toast.Toaster;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/part/l.class */
@StabilityInferred(parameters = 0)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ogv.rank.api.d f72092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final O f72093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f72094c;

    @Inject
    public l(@NotNull com.bilibili.ogv.rank.api.d dVar, @NotNull O o7, @Nullable String str) {
        this.f72092a = dVar;
        this.f72093b = o7;
        this.f72094c = str;
    }

    public static final void a(KomponentScope komponentScope, l lVar, String str, String str2, MutableState mutableState, MutableStateFlow mutableStateFlow, Toaster toaster) {
        KomponentHostScope.launch$default(komponentScope, (CoroutineContext) null, (CoroutineStart) null, new CreatePartKomponentImpl$invoke$1$refreshData$1(lVar, str, str2, mutableState, mutableStateFlow, toaster, null), 3, (Object) null);
    }
}
