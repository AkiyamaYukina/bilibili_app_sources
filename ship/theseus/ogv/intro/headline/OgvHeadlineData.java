package com.bilibili.ship.theseus.ogv.intro.headline;

import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.common.K;
import com.bilibili.bson.common.Bson;
import com.bilibili.ship.theseus.ogv.playviewextra.OgvBadgeInfo;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/headline/OgvHeadlineData.class */
@StabilityInferred(parameters = 0)
@Bson
public final class OgvHeadlineData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f93113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final OgvBadgeInfo f93114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("is_show_btn_animation")
    private final boolean f93115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("title_delivery_button")
    @Nullable
    private final DeliveryButton f93116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("channel_redirect_entry_button")
    @Nullable
    private final GuideButton f93117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final String f93118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final String f93119g;

    @SerializedName("webp_dynamic_pic_title_cycle_num")
    private final int h;

    public OgvHeadlineData(@NotNull String str, @Nullable OgvBadgeInfo ogvBadgeInfo, boolean z6, @Nullable DeliveryButton deliveryButton, @Nullable GuideButton guideButton, @Nullable String str2, @Nullable String str3, int i7) {
        this.f93113a = str;
        this.f93114b = ogvBadgeInfo;
        this.f93115c = z6;
        this.f93116d = deliveryButton;
        this.f93117e = guideButton;
        this.f93118f = str2;
        this.f93119g = str3;
        this.h = i7;
    }

    @Nullable
    public final DeliveryButton a() {
        return this.f93116d;
    }

    @Nullable
    public final GuideButton b() {
        return this.f93117e;
    }

    public final boolean c() {
        return this.f93115c;
    }

    public final int d() {
        return this.h;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OgvHeadlineData)) {
            return false;
        }
        OgvHeadlineData ogvHeadlineData = (OgvHeadlineData) obj;
        return Intrinsics.areEqual(this.f93113a, ogvHeadlineData.f93113a) && Intrinsics.areEqual(this.f93114b, ogvHeadlineData.f93114b) && this.f93115c == ogvHeadlineData.f93115c && Intrinsics.areEqual(this.f93116d, ogvHeadlineData.f93116d) && Intrinsics.areEqual(this.f93117e, ogvHeadlineData.f93117e) && Intrinsics.areEqual(this.f93118f, ogvHeadlineData.f93118f) && Intrinsics.areEqual(this.f93119g, ogvHeadlineData.f93119g) && this.h == ogvHeadlineData.h;
    }

    public final int hashCode() {
        int iHashCode = this.f93113a.hashCode();
        int iHashCode2 = 0;
        OgvBadgeInfo ogvBadgeInfo = this.f93114b;
        int iA = z.a(((iHashCode * 31) + (ogvBadgeInfo == null ? 0 : ogvBadgeInfo.hashCode())) * 31, 31, this.f93115c);
        DeliveryButton deliveryButton = this.f93116d;
        int iHashCode3 = deliveryButton == null ? 0 : deliveryButton.hashCode();
        GuideButton guideButton = this.f93117e;
        int iHashCode4 = guideButton == null ? 0 : guideButton.hashCode();
        String str = this.f93118f;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.f93119g;
        if (str2 != null) {
            iHashCode2 = str2.hashCode();
        }
        return Integer.hashCode(this.h) + ((((((((iA + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode2) * 31);
    }

    @NotNull
    public final String toString() {
        boolean z6 = this.f93115c;
        DeliveryButton deliveryButton = this.f93116d;
        GuideButton guideButton = this.f93117e;
        int i7 = this.h;
        StringBuilder sb = new StringBuilder("OgvHeadlineData(title=");
        sb.append(this.f93113a);
        sb.append(", badgeInfo=");
        sb.append(this.f93114b);
        sb.append(", needShowBtnAnimation=");
        sb.append(z6);
        sb.append(", deliveryButton=");
        sb.append(deliveryButton);
        sb.append(", guideButton=");
        sb.append(guideButton);
        sb.append(", titleImg=");
        sb.append(this.f93118f);
        sb.append(", titleImgNight=");
        return K.a(i7, this.f93119g, ", titleImgAnimationLoopCount=", ")", sb);
    }
}
