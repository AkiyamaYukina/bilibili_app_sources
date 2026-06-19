package com.bilibili.ogv.opbase;

import androidx.appcompat.app.i;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/ModuleAttr.class */
@StabilityInferred(parameters = 1)
@Bson
public final class ModuleAttr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f69857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f69858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f69859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f69860d;

    public ModuleAttr() {
        this(15, false, false, false, false);
    }

    public ModuleAttr(int i7, boolean z6, boolean z7, boolean z8, boolean z9) {
        z6 = (i7 & 1) != 0 ? false : z6;
        z7 = (i7 & 2) != 0 ? false : z7;
        z8 = (i7 & 4) != 0 ? false : z8;
        z9 = (i7 & 8) != 0 ? false : z9;
        this.f69857a = z6;
        this.f69858b = z7;
        this.f69859c = z8;
        this.f69860d = z9;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModuleAttr)) {
            return false;
        }
        ModuleAttr moduleAttr = (ModuleAttr) obj;
        return this.f69857a == moduleAttr.f69857a && this.f69858b == moduleAttr.f69858b && this.f69859c == moduleAttr.f69859c && this.f69860d == moduleAttr.f69860d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f69860d) + z.a(z.a(Boolean.hashCode(this.f69857a) * 31, 31, this.f69858b), 31, this.f69859c);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ModuleAttr(random=");
        sb.append(this.f69857a);
        sb.append(", header=");
        sb.append(this.f69858b);
        sb.append(", follow=");
        sb.append(this.f69859c);
        sb.append(", show_timeline=");
        return i.a(sb, this.f69860d, ")");
    }
}
