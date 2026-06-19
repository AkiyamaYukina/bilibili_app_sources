package com.bilibili.ship.theseus.ogv.intro.followup;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u5.C8711a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/followup/OgvGuideOfFollowUpperData.class */
@StabilityInferred(parameters = 0)
@Bson
public final class OgvGuideOfFollowUpperData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("staff")
    @Nullable
    private final Upper f93045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("desc")
    @NotNull
    private final GuideDescription f93046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f93047c;

    public OgvGuideOfFollowUpperData(@Nullable Upper upper, @NotNull GuideDescription guideDescription, @NotNull Map<String, String> map) {
        this.f93045a = upper;
        this.f93046b = guideDescription;
        this.f93047c = map;
    }

    @NotNull
    public final GuideDescription a() {
        return this.f93046b;
    }

    @Nullable
    public final Upper b() {
        return this.f93045a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OgvGuideOfFollowUpperData)) {
            return false;
        }
        OgvGuideOfFollowUpperData ogvGuideOfFollowUpperData = (OgvGuideOfFollowUpperData) obj;
        return Intrinsics.areEqual(this.f93045a, ogvGuideOfFollowUpperData.f93045a) && Intrinsics.areEqual(this.f93046b, ogvGuideOfFollowUpperData.f93046b) && Intrinsics.areEqual(this.f93047c, ogvGuideOfFollowUpperData.f93047c);
    }

    public final int hashCode() {
        Upper upper = this.f93045a;
        return this.f93047c.hashCode() + ((this.f93046b.hashCode() + ((upper == null ? 0 : upper.hashCode()) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        Upper upper = this.f93045a;
        GuideDescription guideDescription = this.f93046b;
        Map<String, String> map = this.f93047c;
        StringBuilder sb = new StringBuilder("OgvGuideOfFollowUpperData(upper=");
        sb.append(upper);
        sb.append(", description=");
        sb.append(guideDescription);
        sb.append(", report=");
        return C8711a.a(sb, map, ")");
    }
}
