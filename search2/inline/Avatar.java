package com.bilibili.search2.inline;

import G0.b;
import G0.d;
import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.room.B;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.search2.api.SearchNftIconItem;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/inline/Avatar.class */
@StabilityInferred(parameters = 0)
@Keep
public final class Avatar {
    public static final int $stable = 8;

    @JSONField(name = "cover")
    @Nullable
    private String cover;

    @JSONField(name = NotificationCompat.CATEGORY_EVENT)
    @Nullable
    private String event;

    @JSONField(name = "event_v2")
    @Nullable
    private String eventV2;

    @JSONField(name = "face_nft_new")
    private int faceNftNew;

    @JSONField(name = "nft_face_icon")
    @Nullable
    private SearchNftIconItem nftIconItem;

    @JSONField(name = "text")
    @Nullable
    private String text;

    @JSONField(name = "up_id")
    private long upId;

    @JSONField(name = EditCustomizeSticker.TAG_URI)
    @Nullable
    private String uri;

    public Avatar() {
        this(null, null, null, null, 0L, null, 0, null, 255, null);
    }

    public Avatar(@NotNull com.bapis.bilibili.polymer.app.search.v1.Avatar avatar) {
        this(null, null, null, null, 0L, null, 0, null, 255, null);
        this.cover = avatar.getCover();
        this.event = avatar.getEvent();
        this.eventV2 = avatar.getEventV2();
        this.text = avatar.getText();
        this.upId = avatar.getUpId();
        this.uri = avatar.getUri();
        this.faceNftNew = avatar.getFaceNftNew();
        if (avatar.hasNftFaceIcon()) {
            this.nftIconItem = new SearchNftIconItem(avatar.getNftFaceIcon());
        }
    }

    public Avatar(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, long j7, @Nullable String str5, int i7, @Nullable SearchNftIconItem searchNftIconItem) {
        this.cover = str;
        this.event = str2;
        this.eventV2 = str3;
        this.text = str4;
        this.upId = j7;
        this.uri = str5;
        this.faceNftNew = i7;
        this.nftIconItem = searchNftIconItem;
    }

    public /* synthetic */ Avatar(String str, String str2, String str3, String str4, long j7, String str5, int i7, SearchNftIconItem searchNftIconItem, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : str3, (i8 & 8) != 0 ? null : str4, (i8 & 16) != 0 ? 0L : j7, (i8 & 32) != 0 ? null : str5, (i8 & 64) != 0 ? 0 : i7, (i8 & 128) != 0 ? null : searchNftIconItem);
    }

    public static /* synthetic */ Avatar copy$default(Avatar avatar, String str, String str2, String str3, String str4, long j7, String str5, int i7, SearchNftIconItem searchNftIconItem, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = avatar.cover;
        }
        if ((i8 & 2) != 0) {
            str2 = avatar.event;
        }
        if ((i8 & 4) != 0) {
            str3 = avatar.eventV2;
        }
        if ((i8 & 8) != 0) {
            str4 = avatar.text;
        }
        if ((i8 & 16) != 0) {
            j7 = avatar.upId;
        }
        if ((i8 & 32) != 0) {
            str5 = avatar.uri;
        }
        if ((i8 & 64) != 0) {
            i7 = avatar.faceNftNew;
        }
        if ((i8 & 128) != 0) {
            searchNftIconItem = avatar.nftIconItem;
        }
        return avatar.copy(str, str2, str3, str4, j7, str5, i7, searchNftIconItem);
    }

    @Nullable
    public final String component1() {
        return this.cover;
    }

    @Nullable
    public final String component2() {
        return this.event;
    }

    @Nullable
    public final String component3() {
        return this.eventV2;
    }

    @Nullable
    public final String component4() {
        return this.text;
    }

    public final long component5() {
        return this.upId;
    }

    @Nullable
    public final String component6() {
        return this.uri;
    }

    public final int component7() {
        return this.faceNftNew;
    }

    @Nullable
    public final SearchNftIconItem component8() {
        return this.nftIconItem;
    }

    @NotNull
    public final Avatar copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, long j7, @Nullable String str5, int i7, @Nullable SearchNftIconItem searchNftIconItem) {
        return new Avatar(str, str2, str3, str4, j7, str5, i7, searchNftIconItem);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Avatar)) {
            return false;
        }
        Avatar avatar = (Avatar) obj;
        return Intrinsics.areEqual(this.cover, avatar.cover) && Intrinsics.areEqual(this.event, avatar.event) && Intrinsics.areEqual(this.eventV2, avatar.eventV2) && Intrinsics.areEqual(this.text, avatar.text) && this.upId == avatar.upId && Intrinsics.areEqual(this.uri, avatar.uri) && this.faceNftNew == avatar.faceNftNew && Intrinsics.areEqual(this.nftIconItem, avatar.nftIconItem);
    }

    @Nullable
    public final String getCover() {
        return this.cover;
    }

    @Nullable
    public final String getEvent() {
        return this.event;
    }

    @Nullable
    public final String getEventV2() {
        return this.eventV2;
    }

    public final int getFaceNftNew() {
        return this.faceNftNew;
    }

    @Nullable
    public final SearchNftIconItem getNftIconItem() {
        return this.nftIconItem;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public final long getUpId() {
        return this.upId;
    }

    @Nullable
    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        String str = this.cover;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.event;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.eventV2;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.text;
        int iA = C3554n0.a(((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.upId);
        String str5 = this.uri;
        int iA2 = I.a(this.faceNftNew, (iA + (str5 == null ? 0 : str5.hashCode())) * 31, 31);
        SearchNftIconItem searchNftIconItem = this.nftIconItem;
        return iA2 + (searchNftIconItem == null ? 0 : searchNftIconItem.hashCode());
    }

    public final void setCover(@Nullable String str) {
        this.cover = str;
    }

    public final void setEvent(@Nullable String str) {
        this.event = str;
    }

    public final void setEventV2(@Nullable String str) {
        this.eventV2 = str;
    }

    public final void setFaceNftNew(int i7) {
        this.faceNftNew = i7;
    }

    public final void setNftIconItem(@Nullable SearchNftIconItem searchNftIconItem) {
        this.nftIconItem = searchNftIconItem;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }

    public final void setUpId(long j7) {
        this.upId = j7;
    }

    public final void setUri(@Nullable String str) {
        this.uri = str;
    }

    @NotNull
    public String toString() {
        String str = this.cover;
        String str2 = this.event;
        String str3 = this.eventV2;
        String str4 = this.text;
        long j7 = this.upId;
        String str5 = this.uri;
        int i7 = this.faceNftNew;
        SearchNftIconItem searchNftIconItem = this.nftIconItem;
        StringBuilder sbA = b.a("Avatar(cover=", str, ", event=", str2, ", eventV2=");
        B.a(str3, ", text=", str4, ", upId=", sbA);
        d.a(j7, ", uri=", str5, sbA);
        sbA.append(", faceNftNew=");
        sbA.append(i7);
        sbA.append(", nftIconItem=");
        sbA.append(searchNftIconItem);
        sbA.append(")");
        return sbA.toString();
    }
}
