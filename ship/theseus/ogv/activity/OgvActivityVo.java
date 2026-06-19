package com.bilibili.ship.theseus.ogv.activity;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import com.bilibili.bson.common.Bson;
import com.bilibili.ship.theseus.ogv.intro.section.floatlayer.WholeJsonHolderAdapterFactory;
import com.bilibili.ship.theseus.ogv.intro.section.floatlayer.w;
import com.bilibili.ship.theseus.ogv.operation.OperationActivityVo;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityVo.class */
@StabilityInferred(parameters = 0)
@Bson
@JsonAdapter(WholeJsonHolderAdapterFactory.class)
public final class OgvActivityVo implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("activity_id")
    private final int f91417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("invite_drawer")
    @Nullable
    private final OgvInvitationActivityHostVo f91418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("invite_win")
    @Nullable
    private final OgvInvitationActivityGuestVo f91419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("container")
    @NotNull
    private final List<OperationActivityVo> f91420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("watch_count_down_cfg")
    @Nullable
    private final VipWatchingCountdownTaskVo f91421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final OgvActivityDialogVo f91422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final OgvOperationGuideFloatingVo f91423g;

    @SerializedName("play_half_container")
    @Nullable
    private final OgvActivityHalfScreenPopup h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SerializedName("float_ball")
    @Nullable
    private final OgvIntroFloatingBall f91424i;

    public OgvActivityVo(int i7, @Nullable OgvInvitationActivityHostVo ogvInvitationActivityHostVo, @Nullable OgvInvitationActivityGuestVo ogvInvitationActivityGuestVo, @NotNull List<OperationActivityVo> list, @Nullable VipWatchingCountdownTaskVo vipWatchingCountdownTaskVo, @Nullable OgvActivityDialogVo ogvActivityDialogVo, @Nullable OgvOperationGuideFloatingVo ogvOperationGuideFloatingVo, @Nullable OgvActivityHalfScreenPopup ogvActivityHalfScreenPopup, @Nullable OgvIntroFloatingBall ogvIntroFloatingBall) {
        this.f91417a = i7;
        this.f91418b = ogvInvitationActivityHostVo;
        this.f91419c = ogvInvitationActivityGuestVo;
        this.f91420d = list;
        this.f91421e = vipWatchingCountdownTaskVo;
        this.f91422f = ogvActivityDialogVo;
        this.f91423g = ogvOperationGuideFloatingVo;
        this.h = ogvActivityHalfScreenPopup;
        this.f91424i = ogvIntroFloatingBall;
    }

    public final int a() {
        return this.f91417a;
    }

    @Nullable
    public final OgvIntroFloatingBall b() {
        return this.f91424i;
    }

    @Nullable
    public final OgvActivityHalfScreenPopup c() {
        return this.h;
    }

    @Nullable
    public final OgvInvitationActivityGuestVo d() {
        return this.f91419c;
    }

    @Nullable
    public final OgvInvitationActivityHostVo e() {
        return this.f91418b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OgvActivityVo)) {
            return false;
        }
        OgvActivityVo ogvActivityVo = (OgvActivityVo) obj;
        return this.f91417a == ogvActivityVo.f91417a && Intrinsics.areEqual(this.f91418b, ogvActivityVo.f91418b) && Intrinsics.areEqual(this.f91419c, ogvActivityVo.f91419c) && Intrinsics.areEqual(this.f91420d, ogvActivityVo.f91420d) && Intrinsics.areEqual(this.f91421e, ogvActivityVo.f91421e) && Intrinsics.areEqual(this.f91422f, ogvActivityVo.f91422f) && Intrinsics.areEqual(this.f91423g, ogvActivityVo.f91423g) && Intrinsics.areEqual(this.h, ogvActivityVo.h) && Intrinsics.areEqual(this.f91424i, ogvActivityVo.f91424i);
    }

    @NotNull
    public final List<OperationActivityVo> f() {
        return this.f91420d;
    }

    @Nullable
    public final VipWatchingCountdownTaskVo g() {
        return this.f91421e;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f91417a);
        OgvInvitationActivityHostVo ogvInvitationActivityHostVo = this.f91418b;
        int iHashCode2 = 0;
        int iHashCode3 = ogvInvitationActivityHostVo == null ? 0 : ogvInvitationActivityHostVo.hashCode();
        OgvInvitationActivityGuestVo ogvInvitationActivityGuestVo = this.f91419c;
        int iA = e0.a(((((iHashCode * 31) + iHashCode3) * 31) + (ogvInvitationActivityGuestVo == null ? 0 : ogvInvitationActivityGuestVo.hashCode())) * 31, 31, this.f91420d);
        VipWatchingCountdownTaskVo vipWatchingCountdownTaskVo = this.f91421e;
        int iHashCode4 = vipWatchingCountdownTaskVo == null ? 0 : vipWatchingCountdownTaskVo.hashCode();
        OgvActivityDialogVo ogvActivityDialogVo = this.f91422f;
        int iHashCode5 = ogvActivityDialogVo == null ? 0 : ogvActivityDialogVo.hashCode();
        OgvOperationGuideFloatingVo ogvOperationGuideFloatingVo = this.f91423g;
        int iHashCode6 = ogvOperationGuideFloatingVo == null ? 0 : ogvOperationGuideFloatingVo.hashCode();
        OgvActivityHalfScreenPopup ogvActivityHalfScreenPopup = this.h;
        int iHashCode7 = ogvActivityHalfScreenPopup == null ? 0 : ogvActivityHalfScreenPopup.hashCode();
        OgvIntroFloatingBall ogvIntroFloatingBall = this.f91424i;
        if (ogvIntroFloatingBall != null) {
            iHashCode2 = ogvIntroFloatingBall.hashCode();
        }
        return ((((((((iA + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode2;
    }

    @NotNull
    public final String toString() {
        return "OgvActivityVo(activityId=" + this.f91417a + ", invitationHost=" + this.f91418b + ", invitationGuest=" + this.f91419c + ", operationActivityVoList=" + this.f91420d + ", vipWatchingCountdownTask=" + this.f91421e + ", independent_win=" + this.f91422f + ", pp_float_layer=" + this.f91423g + ", halfScreenPopup=" + this.h + ", floatingBall=" + this.f91424i + ")";
    }
}
