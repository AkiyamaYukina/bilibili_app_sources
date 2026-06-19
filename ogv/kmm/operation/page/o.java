package com.bilibili.ogv.kmm.operation.page;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import javax.inject.Inject;
import kntr.common.komponent.KomponentHostScope;
import kntr.common.komponent.KomponentScope;
import kntr.common.trio.toast.Toaster;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/page/o.class */
@StabilityInferred(parameters = 0)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ogv.kmm.operation.api.i f68637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Toaster f68638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lifecycle f68639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Xj0.e f68640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final dk0.m f68641e;

    @Inject
    public o(@NotNull com.bilibili.ogv.kmm.operation.api.i iVar, @NotNull Toaster toaster, @NotNull Lifecycle lifecycle, @NotNull Xj0.e eVar, @NotNull dk0.m mVar) {
        this.f68637a = iVar;
        this.f68638b = toaster;
        this.f68639c = lifecycle;
        this.f68640d = eVar;
        this.f68641e = mVar;
    }

    public static void a(KomponentScope komponentScope, Ref.ObjectRef objectRef, o oVar, Ref.ObjectRef objectRef2, MutableState mutableState) {
        KomponentHostScope.launch$default(komponentScope, (CoroutineContext) null, (CoroutineStart) null, new PageModel$komponent$1$refreshData$1(objectRef, oVar, null, objectRef2, mutableState, null), 3, (Object) null);
    }
}
