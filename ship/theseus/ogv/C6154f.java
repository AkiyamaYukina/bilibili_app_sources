package com.bilibili.ship.theseus.ogv;

import androidx.compose.runtime.internal.StabilityInferred;
import dagger.Module;
import dagger.Provides;
import ev0.InterfaceC7008a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/f.class */
@StabilityInferred(parameters = 0)
@Module
public final class C6154f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC7008a.C1258a f92174a;

    public C6154f(@NotNull InterfaceC7008a.C1258a c1258a) {
        this.f92174a = c1258a;
    }

    @Provides
    @Nullable
    public final String a() {
        return this.f92174a.f117629l;
    }
}
