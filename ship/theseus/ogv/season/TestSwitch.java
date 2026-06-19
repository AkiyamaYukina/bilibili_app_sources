package com.bilibili.ship.theseus.ogv.season;

import Di0.C1602f;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import c6.P;
import c6.Q;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/season/TestSwitch.class */
@StabilityInferred(parameters = 1)
@Bson
public final class TestSwitch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(alternate = {"was_merge_exp"}, value = "merge_position_section_for_cinema")
    private final boolean f94507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(alternate = {"short_space_title_exp"}, value = "reduce_short_title_spacing")
    private final boolean f94508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("merge_preview_section")
    private final boolean f94509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("enable_show_vt_info")
    private final boolean f94510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("hide_ep_vv_vt_dm")
    private final boolean f94511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("hide_post_review")
    private final boolean f94512f;

    public TestSwitch(boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, int i7) {
        z10 = (i7 & 16) != 0 ? false : z10;
        z11 = (i7 & 32) != 0 ? false : z11;
        this.f94507a = z6;
        this.f94508b = z7;
        this.f94509c = z8;
        this.f94510d = z9;
        this.f94511e = z10;
        this.f94512f = z11;
    }

    public final boolean a() {
        return this.f94511e;
    }

    public final boolean b() {
        return this.f94512f;
    }

    public final boolean c() {
        return this.f94507a;
    }

    public final boolean d() {
        return this.f94509c;
    }

    public final boolean e() {
        return this.f94510d;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TestSwitch)) {
            return false;
        }
        TestSwitch testSwitch = (TestSwitch) obj;
        return this.f94507a == testSwitch.f94507a && this.f94508b == testSwitch.f94508b && this.f94509c == testSwitch.f94509c && this.f94510d == testSwitch.f94510d && this.f94511e == testSwitch.f94511e && this.f94512f == testSwitch.f94512f;
    }

    public final boolean f() {
        return this.f94508b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f94512f) + z.a(z.a(z.a(z.a(Boolean.hashCode(this.f94507a) * 31, 31, this.f94508b), 31, this.f94509c), 31, this.f94510d), 31, this.f94511e);
    }

    @NotNull
    public final String toString() {
        boolean z6 = this.f94507a;
        boolean z7 = this.f94508b;
        boolean z8 = this.f94509c;
        boolean z9 = this.f94510d;
        boolean z10 = this.f94511e;
        boolean z11 = this.f94512f;
        StringBuilder sbA = Q.a("TestSwitch(needMergeFeatureAndPreview=", ", isShortEpTitle=", ", needMergePreview=", z6, z7);
        P.a(", needShowEpisodePlayedCount=", ", hideEpVvVtDm=", sbA, z8, z9);
        return C1602f.a(", hidePostReview=", ")", sbA, z10, z11);
    }
}
