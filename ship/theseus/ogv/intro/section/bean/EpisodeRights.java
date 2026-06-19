package com.bilibili.ship.theseus.ogv.intro.section.bean;

import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import c6.Q;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/bean/EpisodeRights.class */
@StabilityInferred(parameters = 1)
@Bson
public final class EpisodeRights {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("allow_download")
    private final boolean f93518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("area_limit")
    private final boolean f93519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("cache_auth")
    private final boolean f93520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("cache_auth_reason")
    @NotNull
    private final String f93521d;

    public EpisodeRights(int i7, String str, boolean z6, boolean z7, boolean z8) {
        z6 = (i7 & 1) != 0 ? true : z6;
        z8 = (i7 & 4) != 0 ? true : z8;
        this.f93518a = z6;
        this.f93519b = z7;
        this.f93520c = z8;
        this.f93521d = str;
    }

    public final boolean a() {
        return this.f93518a;
    }

    @NotNull
    public final String b() {
        return this.f93521d;
    }

    public final boolean c() {
        return this.f93520c;
    }

    public final boolean d() {
        return this.f93519b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EpisodeRights)) {
            return false;
        }
        EpisodeRights episodeRights = (EpisodeRights) obj;
        return this.f93518a == episodeRights.f93518a && this.f93519b == episodeRights.f93519b && this.f93520c == episodeRights.f93520c && Intrinsics.areEqual(this.f93521d, episodeRights.f93521d);
    }

    public final int hashCode() {
        return this.f93521d.hashCode() + z.a(z.a(Boolean.hashCode(this.f93518a) * 31, 31, this.f93519b), 31, this.f93520c);
    }

    @NotNull
    public final String toString() {
        boolean z6 = this.f93518a;
        boolean z7 = this.f93519b;
        boolean z8 = this.f93520c;
        String str = this.f93521d;
        StringBuilder sbA = Q.a("EpisodeRights(allowDownload=", ", isAreaLimit=", ", canCache=", z6, z7);
        sbA.append(z8);
        sbA.append(", cacheAuthReason=");
        sbA.append(str);
        sbA.append(")");
        return sbA.toString();
    }
}
