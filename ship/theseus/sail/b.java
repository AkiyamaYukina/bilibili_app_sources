package com.bilibili.ship.theseus.sail;

import com.bapis.bilibili.app.viewunite.pgcanymodel.ViewPgcAny;
import com.bapis.bilibili.app.viewunite.v1.ViewReply;
import com.bilibili.ship.theseus.united.di.BusinessType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/sail/b.class */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ViewReply f96152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ViewPgcAny f96153b;

    public b(@NotNull ViewReply viewReply, @NotNull ViewPgcAny viewPgcAny) {
        this.f96152a = viewReply;
        this.f96153b = viewPgcAny;
    }

    @Override // com.bilibili.ship.theseus.sail.e
    @NotNull
    public final ViewReply a() {
        return this.f96152a;
    }

    @Override // com.bilibili.ship.theseus.sail.e
    @NotNull
    public final BusinessType getBusinessType() {
        return BusinessType.OGV;
    }
}
