package com.bilibili.ship.theseus.ugc.intro.tools;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.viewunite.common.BadgeInfo;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/tools/b.class */
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ToolsType f97210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f97211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f97212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f97213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final BadgeInfo f97214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f97215f;

    public b(@NotNull ToolsType toolsType, @NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable BadgeInfo badgeInfo, @NotNull Map<String, String> map) {
        this.f97210a = toolsType;
        this.f97211b = str;
        this.f97212c = str2;
        this.f97213d = str3;
        this.f97214e = badgeInfo;
        this.f97215f = map;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f97210a == bVar.f97210a && Intrinsics.areEqual(this.f97211b, bVar.f97211b) && Intrinsics.areEqual(this.f97212c, bVar.f97212c) && Intrinsics.areEqual(this.f97213d, bVar.f97213d) && Intrinsics.areEqual(this.f97214e, bVar.f97214e) && Intrinsics.areEqual(this.f97215f, bVar.f97215f);
    }

    public final int hashCode() {
        int iA = E.a(E.a(E.a(this.f97210a.hashCode() * 31, 31, this.f97211b), 31, this.f97212c), 31, this.f97213d);
        BadgeInfo badgeInfo = this.f97214e;
        return this.f97215f.hashCode() + ((iA + (badgeInfo == null ? 0 : badgeInfo.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        return "UploaderTool(type=" + this.f97210a + ", name=" + this.f97211b + ", icon=" + this.f97212c + ", url=" + this.f97213d + ", badge=" + this.f97214e + ", report=" + this.f97215f + ")";
    }
}
