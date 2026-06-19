package com.bilibili.ship.theseus.ogv.activity;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvInvitationActivityHostVo.class */
@StabilityInferred(parameters = 1)
@Bson
public final class OgvInvitationActivityHostVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("pre_win")
    @Nullable
    private final OgvInvitationActivityForegroundVo f91468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("share_win")
    @Nullable
    private final OgvInvitationActivityBackgroundVo f91469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("success_win")
    @Nullable
    private final OgvInvitationActivitySuccessVo f91470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient boolean f91471d;

    public OgvInvitationActivityHostVo(@Nullable OgvInvitationActivityForegroundVo ogvInvitationActivityForegroundVo, @Nullable OgvInvitationActivityBackgroundVo ogvInvitationActivityBackgroundVo, @Nullable OgvInvitationActivitySuccessVo ogvInvitationActivitySuccessVo) {
        this.f91468a = ogvInvitationActivityForegroundVo;
        this.f91469b = ogvInvitationActivityBackgroundVo;
        this.f91470c = ogvInvitationActivitySuccessVo;
        this.f91471d = ogvInvitationActivityForegroundVo == null && ogvInvitationActivityBackgroundVo != null;
    }

    @Nullable
    public final OgvInvitationActivityBackgroundVo a() {
        return this.f91469b;
    }

    @Nullable
    public final OgvInvitationActivityForegroundVo b() {
        return this.f91468a;
    }

    @Nullable
    public final OgvInvitationActivitySuccessVo c() {
        return this.f91470c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OgvInvitationActivityHostVo)) {
            return false;
        }
        OgvInvitationActivityHostVo ogvInvitationActivityHostVo = (OgvInvitationActivityHostVo) obj;
        return Intrinsics.areEqual(this.f91468a, ogvInvitationActivityHostVo.f91468a) && Intrinsics.areEqual(this.f91469b, ogvInvitationActivityHostVo.f91469b) && Intrinsics.areEqual(this.f91470c, ogvInvitationActivityHostVo.f91470c);
    }

    public final int hashCode() {
        OgvInvitationActivityForegroundVo ogvInvitationActivityForegroundVo = this.f91468a;
        int iHashCode = 0;
        int iHashCode2 = ogvInvitationActivityForegroundVo == null ? 0 : ogvInvitationActivityForegroundVo.hashCode();
        OgvInvitationActivityBackgroundVo ogvInvitationActivityBackgroundVo = this.f91469b;
        int iHashCode3 = ogvInvitationActivityBackgroundVo == null ? 0 : ogvInvitationActivityBackgroundVo.hashCode();
        OgvInvitationActivitySuccessVo ogvInvitationActivitySuccessVo = this.f91470c;
        if (ogvInvitationActivitySuccessVo != null) {
            iHashCode = ogvInvitationActivitySuccessVo.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        return "OgvInvitationActivityHostVo(foreground=" + this.f91468a + ", background=" + this.f91469b + ", success=" + this.f91470c + ")";
    }
}
