package com.bilibili.studio.videoeditor.common.mod;

import G0.b;
import H0.e;
import I.E;
import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.C4277b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/common/mod/Mod.class */
@Keep
public final class Mod {

    @NotNull
    private final String file;
    private final int minVersion32;
    private final int minVersion64;

    @NotNull
    private final String name;

    @NotNull
    private final String pool;

    public Mod(@NotNull String str, @NotNull String str2, @NotNull String str3, int i7, int i8) {
        this.pool = str;
        this.name = str2;
        this.file = str3;
        this.minVersion64 = i7;
        this.minVersion32 = i8;
    }

    public /* synthetic */ Mod(String str, String str2, String str3, int i7, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i9 & 8) != 0 ? -1 : i7, (i9 & 16) != 0 ? -1 : i8);
    }

    public static /* synthetic */ Mod copy$default(Mod mod, String str, String str2, String str3, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = mod.pool;
        }
        if ((i9 & 2) != 0) {
            str2 = mod.name;
        }
        if ((i9 & 4) != 0) {
            str3 = mod.file;
        }
        if ((i9 & 8) != 0) {
            i7 = mod.minVersion64;
        }
        if ((i9 & 16) != 0) {
            i8 = mod.minVersion32;
        }
        return mod.copy(str, str2, str3, i7, i8);
    }

    @NotNull
    public final String component1() {
        return this.pool;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final String component3() {
        return this.file;
    }

    public final int component4() {
        return this.minVersion64;
    }

    public final int component5() {
        return this.minVersion32;
    }

    @NotNull
    public final Mod copy(@NotNull String str, @NotNull String str2, @NotNull String str3, int i7, int i8) {
        return new Mod(str, str2, str3, i7, i8);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mod)) {
            return false;
        }
        Mod mod = (Mod) obj;
        return Intrinsics.areEqual(this.pool, mod.pool) && Intrinsics.areEqual(this.name, mod.name) && Intrinsics.areEqual(this.file, mod.file) && this.minVersion64 == mod.minVersion64 && this.minVersion32 == mod.minVersion32;
    }

    @NotNull
    public final String getFile() {
        return this.file;
    }

    public final int getMinVersion32() {
        return this.minVersion32;
    }

    public final int getMinVersion64() {
        return this.minVersion64;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getPool() {
        return this.pool;
    }

    public int hashCode() {
        return Integer.hashCode(this.minVersion32) + I.a(this.minVersion64, E.a(E.a(this.pool.hashCode() * 31, 31, this.name), 31, this.file), 31);
    }

    @NotNull
    public String toString() {
        String str = this.pool;
        String str2 = this.name;
        String str3 = this.file;
        int i7 = this.minVersion64;
        int i8 = this.minVersion32;
        StringBuilder sbA = b.a("Mod(pool=", str, ", name=", str2, ", file=");
        e.b(i7, str3, ", minVersion64=", ", minVersion32=", sbA);
        return C4277b.a(i8, ")", sbA);
    }
}
