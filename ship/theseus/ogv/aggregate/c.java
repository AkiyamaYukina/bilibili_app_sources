package com.bilibili.ship.theseus.ogv.aggregate;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.restrictionlayer.InterfaceC6388m;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/aggregate/c.class */
@StabilityInferred(parameters = 0)
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC6388m f91606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ogv.vip.d f91607b;

    @Inject
    public c(@NotNull InterfaceC6388m interfaceC6388m, @NotNull com.bilibili.ship.theseus.ogv.vip.d dVar) {
        this.f91606a = interfaceC6388m;
        this.f91607b = dVar;
    }

    @Override // com.bilibili.ship.theseus.ogv.aggregate.b
    @NotNull
    public final com.bilibili.ship.theseus.ogv.vip.d a() {
        return this.f91607b;
    }
}
