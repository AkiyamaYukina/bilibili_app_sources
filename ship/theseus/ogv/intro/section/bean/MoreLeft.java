package com.bilibili.ship.theseus.ogv.intro.section.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/bean/MoreLeft.class */
@StabilityInferred(parameters = 1)
@Bson
public final class MoreLeft {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f93542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f93543b;

    public MoreLeft(@NotNull String str, @NotNull String str2) {
        this.f93542a = str;
        this.f93543b = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoreLeft)) {
            return false;
        }
        MoreLeft moreLeft = (MoreLeft) obj;
        return Intrinsics.areEqual(this.f93542a, moreLeft.f93542a) && Intrinsics.areEqual(this.f93543b, moreLeft.f93543b);
    }

    public final int hashCode() {
        return this.f93543b.hashCode() + (this.f93542a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MoreLeft(title=");
        sb.append(this.f93542a);
        sb.append(", link=");
        return C8770a.a(sb, this.f93543b, ")");
    }
}
