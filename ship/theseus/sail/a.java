package com.bilibili.ship.theseus.sail;

import com.bapis.bilibili.app.viewunite.pugvanymodel.ViewPugvAny;
import com.bapis.bilibili.app.viewunite.v1.ViewReply;
import com.bilibili.ship.theseus.united.di.BusinessType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/sail/a.class */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ViewReply f96150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final ViewPugvAny f96151b;

    public a(@Nullable ViewPugvAny viewPugvAny, @NotNull ViewReply viewReply) {
        this.f96150a = viewReply;
        this.f96151b = viewPugvAny;
    }

    @Override // com.bilibili.ship.theseus.sail.e
    @NotNull
    public final ViewReply a() {
        return this.f96150a;
    }

    @Override // com.bilibili.ship.theseus.sail.e
    @NotNull
    public final BusinessType getBusinessType() {
        return BusinessType.CHEESE;
    }
}
