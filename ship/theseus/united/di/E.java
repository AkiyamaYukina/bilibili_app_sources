package com.bilibili.ship.theseus.united.di;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.viewunite.v1.ViewReply;
import com.bilibili.ship.theseus.united.page.miniplayer.b;
import com.bilibili.ship.theseus.united.page.tab.TheseusTabPagerService;
import dagger.Module;
import dagger.Provides;
import ev0.InterfaceC7008a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/di/E.class */
@StabilityInferred(parameters = 0)
@Module
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BusinessType f98765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ViewReply f98766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f98767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final InterfaceC7008a.C1258a f98768d;

    public E(@NotNull BusinessType businessType, @NotNull ViewReply viewReply, @NotNull String str, @NotNull InterfaceC7008a.C1258a c1258a) {
        this.f98765a = businessType;
        this.f98766b = viewReply;
        this.f98767c = str;
        this.f98768d = c1258a;
    }

    @Provides
    @Nullable
    public final TheseusTabPagerService.a a() {
        return (TheseusTabPagerService.a) com.bilibili.ship.theseus.united.page.tab.t.f103210a.a(this.f98768d);
    }

    @Provides
    @Nullable
    public final b.a b() {
        return (b.a) com.bilibili.ship.theseus.united.page.miniplayer.c.f102079a.a(this.f98768d);
    }
}
