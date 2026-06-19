package com.bilibili.ogv.operation3.module.followable;

import androidx.compose.runtime.internal.StabilityInferred;
import javax.inject.Inject;
import kntr.base.router.Router;
import kntr.common.komponent.KomponentScope;
import kntr.common.router.RouterKt;
import kntr.common.trio.toast.Toaster;
import kntr.common.trio.toast.ToasterKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/followable/h.class */
@StabilityInferred(parameters = 0)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ogv.operation3.module.community.h f71350a;

    @Inject
    public h(@NotNull com.bilibili.ogv.operation3.module.community.h hVar) {
        this.f71350a = hVar;
    }

    @NotNull
    public final CreateFollowableSeasonModel$invoke$1 a(@NotNull KomponentScope komponentScope, @NotNull l lVar) {
        this.f71350a.b(lVar.c(), lVar.getStatus().getFollow());
        return new CreateFollowableSeasonModel$invoke$1(komponentScope, (Router) komponentScope.getContext().getCompositionLocal(RouterKt.getLocalRouter()), this, lVar, (Toaster) komponentScope.getContext().getCompositionLocal(ToasterKt.getLocalToaster()));
    }
}
