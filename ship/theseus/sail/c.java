package com.bilibili.ship.theseus.sail;

import com.bapis.bilibili.app.viewunite.ugcanymodel.ViewUgcAny;
import com.bapis.bilibili.app.viewunite.v1.ViewReply;
import com.bilibili.ship.theseus.united.di.BusinessType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/sail/c.class */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ViewReply f96154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final ViewUgcAny f96155b;

    public c(@NotNull ViewReply viewReply, @Nullable ViewUgcAny viewUgcAny) {
        this.f96154a = viewReply;
        this.f96155b = viewUgcAny;
    }

    @Override // com.bilibili.ship.theseus.sail.e
    @NotNull
    public final ViewReply a() {
        return this.f96154a;
    }

    @Override // com.bilibili.ship.theseus.sail.e
    @NotNull
    public final BusinessType getBusinessType() {
        return BusinessType.UGC;
    }
}
