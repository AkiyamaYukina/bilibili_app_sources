package com.bilibili.tgwt.square;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/ModuleAttr.class */
@StabilityInferred(parameters = 1)
@Bson
public final class ModuleAttr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f112039a;

    public ModuleAttr() {
        this(false, 1);
    }

    public ModuleAttr(boolean z6, int i7) {
        this.f112039a = (i7 & 1) != 0 ? false : z6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ModuleAttr) && this.f112039a == ((ModuleAttr) obj).f112039a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f112039a);
    }

    @NotNull
    public final String toString() {
        return androidx.appcompat.app.i.a(new StringBuilder("ModuleAttr(header="), this.f112039a, ")");
    }
}
