package com.bilibili.pegasus.data.component;

import androidx.compose.runtime.C4277b;
import androidx.core.app.NotificationCompat;
import androidx.room.B;
import bilibili.live.app.service.resolver.a;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/component/DescButtonData.class */
public final class DescButtonData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("type")
    private int f77349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("text")
    @Nullable
    private String f77350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(EditCustomizeSticker.TAG_URI)
    @Nullable
    private String f77351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName(NotificationCompat.CATEGORY_EVENT)
    @Nullable
    private String f77352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("event_v2")
    @Nullable
    private String f77353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("param")
    @Nullable
    private String f77354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("selected")
    private int f77355g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f77356i;

    public DescButtonData() {
        this(0, null, null, null, null, null, 0, SearchBangumiItem.TYPE_FULLNET_BANGUMI, null);
    }

    public DescButtonData(int i7, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i8) {
        this.f77349a = i7;
        this.f77350b = str;
        this.f77351c = str2;
        this.f77352d = str3;
        this.f77353e = str4;
        this.f77354f = str5;
        this.f77355g = i8;
    }

    public /* synthetic */ DescButtonData(int i7, String str, String str2, String str3, String str4, String str5, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? 0 : i7, (i9 & 2) != 0 ? null : str, (i9 & 4) != 0 ? null : str2, (i9 & 8) != 0 ? null : str3, (i9 & 16) != 0 ? null : str4, (i9 & 32) != 0 ? null : str5, (i9 & 64) != 0 ? 0 : i8);
    }

    public static /* synthetic */ DescButtonData copy$default(DescButtonData descButtonData, int i7, String str, String str2, String str3, String str4, String str5, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = descButtonData.f77349a;
        }
        if ((i9 & 2) != 0) {
            str = descButtonData.f77350b;
        }
        if ((i9 & 4) != 0) {
            str2 = descButtonData.f77351c;
        }
        if ((i9 & 8) != 0) {
            str3 = descButtonData.f77352d;
        }
        if ((i9 & 16) != 0) {
            str4 = descButtonData.f77353e;
        }
        if ((i9 & 32) != 0) {
            str5 = descButtonData.f77354f;
        }
        if ((i9 & 64) != 0) {
            i8 = descButtonData.f77355g;
        }
        return descButtonData.copy(i7, str, str2, str3, str4, str5, i8);
    }

    public final int component1() {
        return this.f77349a;
    }

    @Nullable
    public final String component2() {
        return this.f77350b;
    }

    @Nullable
    public final String component3() {
        return this.f77351c;
    }

    @Nullable
    public final String component4() {
        return this.f77352d;
    }

    @Nullable
    public final String component5() {
        return this.f77353e;
    }

    @Nullable
    public final String component6() {
        return this.f77354f;
    }

    public final int component7() {
        return this.f77355g;
    }

    @NotNull
    public final DescButtonData copy(int i7, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i8) {
        return new DescButtonData(i7, str, str2, str3, str4, str5, i8);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DescButtonData)) {
            return false;
        }
        DescButtonData descButtonData = (DescButtonData) obj;
        return this.f77349a == descButtonData.f77349a && Intrinsics.areEqual(this.f77350b, descButtonData.f77350b) && Intrinsics.areEqual(this.f77351c, descButtonData.f77351c) && Intrinsics.areEqual(this.f77352d, descButtonData.f77352d) && Intrinsics.areEqual(this.f77353e, descButtonData.f77353e) && Intrinsics.areEqual(this.f77354f, descButtonData.f77354f) && this.f77355g == descButtonData.f77355g;
    }

    @Nullable
    public final String getEvent() {
        return this.f77352d;
    }

    @Nullable
    public final String getEventV2() {
        return this.f77353e;
    }

    @Nullable
    public final String getParam() {
        return this.f77354f;
    }

    public final int getSelected() {
        return this.f77355g;
    }

    @Nullable
    public final String getText() {
        return this.f77350b;
    }

    public final int getType() {
        return this.f77349a;
    }

    @Nullable
    public final String getUri() {
        return this.f77351c;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f77349a);
        String str = this.f77350b;
        int iHashCode2 = 0;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.f77351c;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f77352d;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.f77353e;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.f77354f;
        if (str5 != null) {
            iHashCode2 = str5.hashCode();
        }
        return Integer.hashCode(this.f77355g) + (((((((((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode2) * 31);
    }

    public final int isFollow() {
        return this.h;
    }

    public final int isFollowed() {
        return this.f77356i;
    }

    public final void setEvent(@Nullable String str) {
        this.f77352d = str;
    }

    public final void setEventV2(@Nullable String str) {
        this.f77353e = str;
    }

    public final void setFollow(int i7) {
        this.h = i7;
    }

    public final void setFollowed(int i7) {
        this.f77356i = i7;
    }

    public final void setParam(@Nullable String str) {
        this.f77354f = str;
    }

    public final void setSelected(int i7) {
        this.f77355g = i7;
    }

    public final void setText(@Nullable String str) {
        this.f77350b = str;
    }

    public final void setType(int i7) {
        this.f77349a = i7;
    }

    public final void setUri(@Nullable String str) {
        this.f77351c = str;
    }

    @NotNull
    public String toString() {
        int i7 = this.f77349a;
        String str = this.f77350b;
        String str2 = this.f77351c;
        String str3 = this.f77352d;
        String str4 = this.f77353e;
        String str5 = this.f77354f;
        int i8 = this.f77355g;
        StringBuilder sbB = a.b(i7, "DescButtonData(type=", ", text=", str, ", uri=");
        B.a(str2, ", event=", str3, ", eventV2=", sbB);
        B.a(str4, ", param=", str5, ", selected=", sbB);
        return C4277b.a(i8, ")", sbB);
    }
}
