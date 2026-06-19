package com.bilibili.ship.theseus.ogv.continuousplay;

import androidx.collection.ArraySet;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/continuousplay/d.class */
@StabilityInferred(parameters = 0)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f91811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ArraySet<Integer> f91812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ArraySet<Long> f91813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f91814d;

    @Inject
    public d(int i7, @NotNull Collection<Integer> collection, @NotNull Collection<Long> collection2) {
        this.f91811a = i7;
        this.f91812b = new ArraySet<>(collection);
        this.f91813c = new ArraySet<>(collection2);
    }

    public final boolean a(int i7) {
        return this.f91812b.contains(Integer.valueOf(i7));
    }
}
