package com.bilibili.pegasus.data.component;

import G0.b;
import H0.e;
import android.support.v4.media.session.a;
import androidx.compose.animation.core.I;
import androidx.core.app.NotificationCompat;
import androidx.room.B;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/component/AvatarData.class */
public final class AvatarData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("cover")
    @Nullable
    private final String f77342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("text")
    @Nullable
    private final String f77343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(EditCustomizeSticker.TAG_URI)
    @Nullable
    private final String f77344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName(NotificationCompat.CATEGORY_EVENT)
    @Nullable
    private final String f77345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("event_v2")
    @Nullable
    private final String f77346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("type")
    private final int f77347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("up_id")
    private final long f77348g;

    public AvatarData() {
        this(null, null, null, null, null, 0, 0L, SearchBangumiItem.TYPE_FULLNET_BANGUMI, null);
    }

    public AvatarData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i7, long j7) {
        this.f77342a = str;
        this.f77343b = str2;
        this.f77344c = str3;
        this.f77345d = str4;
        this.f77346e = str5;
        this.f77347f = i7;
        this.f77348g = j7;
    }

    public /* synthetic */ AvatarData(String str, String str2, String str3, String str4, String str5, int i7, long j7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : str3, (i8 & 8) != 0 ? null : str4, (i8 & 16) != 0 ? null : str5, (i8 & 32) != 0 ? 0 : i7, (i8 & 64) != 0 ? -1L : j7);
    }

    public static /* synthetic */ AvatarData copy$default(AvatarData avatarData, String str, String str2, String str3, String str4, String str5, int i7, long j7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = avatarData.f77342a;
        }
        if ((i8 & 2) != 0) {
            str2 = avatarData.f77343b;
        }
        if ((i8 & 4) != 0) {
            str3 = avatarData.f77344c;
        }
        if ((i8 & 8) != 0) {
            str4 = avatarData.f77345d;
        }
        if ((i8 & 16) != 0) {
            str5 = avatarData.f77346e;
        }
        if ((i8 & 32) != 0) {
            i7 = avatarData.f77347f;
        }
        if ((i8 & 64) != 0) {
            j7 = avatarData.f77348g;
        }
        return avatarData.copy(str, str2, str3, str4, str5, i7, j7);
    }

    @Nullable
    public final String component1() {
        return this.f77342a;
    }

    @Nullable
    public final String component2() {
        return this.f77343b;
    }

    @Nullable
    public final String component3() {
        return this.f77344c;
    }

    @Nullable
    public final String component4() {
        return this.f77345d;
    }

    @Nullable
    public final String component5() {
        return this.f77346e;
    }

    public final int component6() {
        return this.f77347f;
    }

    public final long component7() {
        return this.f77348g;
    }

    @NotNull
    public final AvatarData copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i7, long j7) {
        return new AvatarData(str, str2, str3, str4, str5, i7, j7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvatarData)) {
            return false;
        }
        AvatarData avatarData = (AvatarData) obj;
        return Intrinsics.areEqual(this.f77342a, avatarData.f77342a) && Intrinsics.areEqual(this.f77343b, avatarData.f77343b) && Intrinsics.areEqual(this.f77344c, avatarData.f77344c) && Intrinsics.areEqual(this.f77345d, avatarData.f77345d) && Intrinsics.areEqual(this.f77346e, avatarData.f77346e) && this.f77347f == avatarData.f77347f && this.f77348g == avatarData.f77348g;
    }

    @Nullable
    public final String getCover() {
        return this.f77342a;
    }

    @Nullable
    public final String getEvent() {
        return this.f77345d;
    }

    @Nullable
    public final String getEventV2() {
        return this.f77346e;
    }

    public final long getMid() {
        return this.f77348g;
    }

    @Nullable
    public final String getText() {
        return this.f77343b;
    }

    public final int getType() {
        return this.f77347f;
    }

    @Nullable
    public final String getUri() {
        return this.f77344c;
    }

    public int hashCode() {
        String str = this.f77342a;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.f77343b;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f77344c;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.f77345d;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.f77346e;
        if (str5 != null) {
            iHashCode = str5.hashCode();
        }
        return Long.hashCode(this.f77348g) + I.a(this.f77347f, ((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode) * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.f77342a;
        String str2 = this.f77343b;
        String str3 = this.f77344c;
        String str4 = this.f77345d;
        String str5 = this.f77346e;
        int i7 = this.f77347f;
        long j7 = this.f77348g;
        StringBuilder sbA = b.a("AvatarData(cover=", str, ", text=", str2, ", uri=");
        B.a(str3, ", event=", str4, ", eventV2=", sbA);
        e.b(i7, str5, ", type=", ", mid=", sbA);
        return a.a(sbA, j7, ")");
    }
}
