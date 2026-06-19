package com.bilibili.studio.material;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/d.class */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MaterialType f108516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<Request> f108517b;

    public d(@NotNull List list, @NotNull MaterialType materialType) {
        this.f108516a = materialType;
        this.f108517b = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f108516a, dVar.f108516a) && Intrinsics.areEqual(this.f108517b, dVar.f108517b);
    }

    public final int hashCode() {
        return this.f108517b.hashCode() + (this.f108516a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "GroupMaterialRequest(type=" + this.f108516a + ", requests=" + this.f108517b + ")";
    }
}
