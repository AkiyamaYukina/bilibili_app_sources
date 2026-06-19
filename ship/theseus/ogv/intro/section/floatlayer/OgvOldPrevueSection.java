package com.bilibili.ship.theseus.ogv.intro.section.floatlayer;

import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import com.bilibili.bson.common.Bson;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvOldPrevueSection.class */
@StabilityInferred(parameters = 0)
@Bson
public final class OgvOldPrevueSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("id")
    private final long f93589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("episode_ids")
    @NotNull
    private final List<Long> f93590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("type")
    private final int f93591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("episodes")
    @NotNull
    private final List<OgvEpisode> f93592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final String f93593e;

    public OgvOldPrevueSection(int i7, long j7, @Nullable String str, @NotNull List list, @NotNull List list2) {
        this.f93589a = j7;
        this.f93590b = list;
        this.f93591c = i7;
        this.f93592d = list2;
        this.f93593e = str;
    }

    @NotNull
    public final List<Long> a() {
        return this.f93590b;
    }

    @NotNull
    public final List<OgvEpisode> b() {
        return this.f93592d;
    }

    public final long c() {
        return this.f93589a;
    }

    public final int d() {
        return this.f93591c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OgvOldPrevueSection)) {
            return false;
        }
        OgvOldPrevueSection ogvOldPrevueSection = (OgvOldPrevueSection) obj;
        return this.f93589a == ogvOldPrevueSection.f93589a && Intrinsics.areEqual(this.f93590b, ogvOldPrevueSection.f93590b) && this.f93591c == ogvOldPrevueSection.f93591c && Intrinsics.areEqual(this.f93592d, ogvOldPrevueSection.f93592d) && Intrinsics.areEqual(this.f93593e, ogvOldPrevueSection.f93593e);
    }

    public final int hashCode() {
        int iA = e0.a(I.a(this.f93591c, e0.a(Long.hashCode(this.f93589a) * 31, 31, this.f93590b), 31), 31, this.f93592d);
        String str = this.f93593e;
        return iA + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        long j7 = this.f93589a;
        List<Long> list = this.f93590b;
        int i7 = this.f93591c;
        List<OgvEpisode> list2 = this.f93592d;
        StringBuilder sb = new StringBuilder("OgvOldPrevueSection(sectionId=");
        sb.append(j7);
        sb.append(", linkEpIds=");
        sb.append(list);
        sb.append(", type=");
        sb.append(i7);
        sb.append(", prevues=");
        sb.append(list2);
        sb.append(", splitText=");
        return C8770a.a(sb, this.f93593e, ")");
    }
}
