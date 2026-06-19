package com.bilibili.ship.theseus.united.page.view;

import I.E;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/view/r.class */
@StabilityInferred(parameters = 1)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f104118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f104119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f104120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f104121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f104122e;

    public r(@NotNull String str, @NotNull String str2, boolean z6, boolean z7, boolean z8) {
        this.f104118a = z6;
        this.f104119b = str;
        this.f104120c = z7;
        this.f104121d = str2;
        this.f104122e = z8;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f104118a == rVar.f104118a && Intrinsics.areEqual(this.f104119b, rVar.f104119b) && this.f104120c == rVar.f104120c && Intrinsics.areEqual(this.f104121d, rVar.f104121d) && this.f104122e == rVar.f104122e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f104122e) + E.a(z.a(E.a(Boolean.hashCode(this.f104118a) * 31, 31, this.f104119b), 31, this.f104120c), 31, this.f104121d);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryEntrance(arcPlayStory=");
        sb.append(this.f104118a);
        sb.append(", storyIcon=");
        sb.append(this.f104119b);
        sb.append(", arcLandscapeStory=");
        sb.append(this.f104120c);
        sb.append(", landscapeIcon=");
        sb.append(this.f104121d);
        sb.append(", playStory=");
        return androidx.appcompat.app.i.a(sb, this.f104122e, ")");
    }
}
