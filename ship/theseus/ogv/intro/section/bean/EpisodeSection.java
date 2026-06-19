package com.bilibili.ship.theseus.ogv.intro.section.bean;

import I.E;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import com.bilibili.bplus.followingpublish.fragments.publish.c;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/bean/EpisodeSection.class */
@StabilityInferred(parameters = 0)
@Bson
public final class EpisodeSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f93523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f93524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("more_left")
    @NotNull
    private final MoreLeft f93525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f93526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f93527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("can_ord_desc")
    private final boolean f93528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("split_text")
    @Nullable
    private final String f93529g;

    @NotNull
    public final List<OgvEpisode> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SerializedName("episode_ids")
    @NotNull
    private final List<Long> f93530i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final SectionType f93531j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final Map<String, String> f93532k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @SerializedName("module_style")
    @NotNull
    private final SectionStyle f93533l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final EpBgInfo f93534m;

    public EpisodeSection(@NotNull String str, @NotNull String str2, @NotNull MoreLeft moreLeft, @NotNull String str3, long j7, boolean z6, @Nullable String str4, @NotNull List<OgvEpisode> list, @NotNull List<Long> list2, @NotNull SectionType sectionType, @Nullable Map<String, String> map, @NotNull SectionStyle sectionStyle, @Nullable EpBgInfo epBgInfo) {
        this.f93523a = str;
        this.f93524b = str2;
        this.f93525c = moreLeft;
        this.f93526d = str3;
        this.f93527e = j7;
        this.f93528f = z6;
        this.f93529g = str4;
        this.h = list;
        this.f93530i = list2;
        this.f93531j = sectionType;
        this.f93532k = map;
        this.f93533l = sectionStyle;
        this.f93534m = epBgInfo;
    }

    @Nullable
    public final String a() {
        return this.f93529g;
    }

    @NotNull
    public final MoreLeft b() {
        return this.f93525c;
    }

    @NotNull
    public final List<Long> c() {
        return this.f93530i;
    }

    public final boolean d() {
        return this.f93528f;
    }

    @NotNull
    public final SectionStyle e() {
        return this.f93533l;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EpisodeSection)) {
            return false;
        }
        EpisodeSection episodeSection = (EpisodeSection) obj;
        return Intrinsics.areEqual(this.f93523a, episodeSection.f93523a) && Intrinsics.areEqual(this.f93524b, episodeSection.f93524b) && Intrinsics.areEqual(this.f93525c, episodeSection.f93525c) && Intrinsics.areEqual(this.f93526d, episodeSection.f93526d) && this.f93527e == episodeSection.f93527e && this.f93528f == episodeSection.f93528f && Intrinsics.areEqual(this.f93529g, episodeSection.f93529g) && Intrinsics.areEqual(this.h, episodeSection.h) && Intrinsics.areEqual(this.f93530i, episodeSection.f93530i) && this.f93531j == episodeSection.f93531j && Intrinsics.areEqual(this.f93532k, episodeSection.f93532k) && Intrinsics.areEqual(this.f93533l, episodeSection.f93533l) && Intrinsics.areEqual(this.f93534m, episodeSection.f93534m);
    }

    public final int hashCode() {
        int iA = z.a(C3554n0.a(E.a((this.f93525c.hashCode() + E.a(this.f93523a.hashCode() * 31, 31, this.f93524b)) * 31, 31, this.f93526d), 31, this.f93527e), 31, this.f93528f);
        String str = this.f93529g;
        int iHashCode = 0;
        int iA2 = e0.a(e0.a((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.h), 31, this.f93530i);
        int iHashCode2 = this.f93531j.hashCode();
        Map<String, String> map = this.f93532k;
        int iHashCode3 = map == null ? 0 : map.hashCode();
        int iHashCode4 = this.f93533l.hashCode();
        EpBgInfo epBgInfo = this.f93534m;
        if (epBgInfo != null) {
            iHashCode = epBgInfo.hashCode();
        }
        return ((iHashCode4 + ((((iHashCode2 + iA2) * 31) + iHashCode3) * 31)) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        MoreLeft moreLeft = this.f93525c;
        boolean z6 = this.f93528f;
        String str = this.f93529g;
        List<OgvEpisode> list = this.h;
        List<Long> list2 = this.f93530i;
        Map<String, String> map = this.f93532k;
        SectionStyle sectionStyle = this.f93533l;
        StringBuilder sb = new StringBuilder("EpisodeSection(title=");
        sb.append(this.f93523a);
        sb.append(", more=");
        sb.append(this.f93524b);
        sb.append(", moreLeft=");
        sb.append(moreLeft);
        sb.append(", moreBottomDesc=");
        sb.append(this.f93526d);
        sb.append(", sectionId=");
        c.a(this.f93527e, ", reversible=", sb, z6);
        sb.append(", featureAndPreviewSectionSplitText=");
        sb.append(str);
        sb.append(", episodes=");
        sb.append(list);
        sb.append(", relatedFeatureEpisodeIds=");
        sb.append(list2);
        sb.append(", type=");
        sb.append(this.f93531j);
        sb.append(", report=");
        sb.append(map);
        sb.append(", style=");
        sb.append(sectionStyle);
        sb.append(", bgInfo=");
        sb.append(this.f93534m);
        sb.append(")");
        return sb.toString();
    }
}
