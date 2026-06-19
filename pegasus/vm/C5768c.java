package com.bilibili.pegasus.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.Action;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: renamed from: com.bilibili.pegasus.vm.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/c.class */
@StabilityInferred(parameters = 1)
public final class C5768c implements Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f79053a;

    public C5768c() {
        this(0);
    }

    public C5768c(int i7) {
        this.f79053a = "ClearStateAction";
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5768c) && Intrinsics.areEqual(this.f79053a, ((C5768c) obj).f79053a);
    }

    public final int hashCode() {
        return this.f79053a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C8770a.a(new StringBuilder("ClearOneshotStateAction(name="), this.f79053a, ")");
    }
}
