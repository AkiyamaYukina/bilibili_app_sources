package com.bilibili.pegasus.channelv2.detail.tab.baike.adapter.model;

import J1.z;
import androidx.annotation.Keep;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.B;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.bilifeed.card.FeedItem;
import com.bilibili.playerbizcommon.features.background.b;
import fo0.C7134d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/adapter/model/ChannelBaikeTitleItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class ChannelBaikeTitleItem extends FeedItem implements C7134d.a {
    public static final int $stable = 8;

    @JSONField(name = "card_type")
    @Nullable
    private String cardType;

    @JSONField(name = "content_nid")
    private long contentNid;

    @JSONField(name = "desc")
    @Nullable
    private String desc;

    @JSONField(name = "image")
    @Nullable
    private String image;

    @JSONField(name = "nav_nid")
    private long navNid;

    @JSONField(name = "baike_title")
    @Nullable
    private String title;

    public ChannelBaikeTitleItem() {
        this(null, 0L, 0L, null, null, null, 63, null);
    }

    public ChannelBaikeTitleItem(@Nullable String str, long j7, long j8, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.cardType = str;
        this.navNid = j7;
        this.contentNid = j8;
        this.title = str2;
        this.desc = str3;
        this.image = str4;
    }

    public /* synthetic */ ChannelBaikeTitleItem(String str, long j7, long j8, String str2, String str3, String str4, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? 0L : j7, (i7 & 4) != 0 ? 0L : j8, (i7 & 8) != 0 ? null : str2, (i7 & 16) != 0 ? null : str3, (i7 & 32) != 0 ? null : str4);
    }

    public static /* synthetic */ ChannelBaikeTitleItem copy$default(ChannelBaikeTitleItem channelBaikeTitleItem, String str, long j7, long j8, String str2, String str3, String str4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = channelBaikeTitleItem.cardType;
        }
        if ((i7 & 2) != 0) {
            j7 = channelBaikeTitleItem.navNid;
        }
        if ((i7 & 4) != 0) {
            j8 = channelBaikeTitleItem.contentNid;
        }
        if ((i7 & 8) != 0) {
            str2 = channelBaikeTitleItem.title;
        }
        if ((i7 & 16) != 0) {
            str3 = channelBaikeTitleItem.desc;
        }
        if ((i7 & 32) != 0) {
            str4 = channelBaikeTitleItem.image;
        }
        return channelBaikeTitleItem.copy(str, j7, j8, str2, str3, str4);
    }

    @Nullable
    public final String component1() {
        return this.cardType;
    }

    public final long component2() {
        return this.navNid;
    }

    public final long component3() {
        return this.contentNid;
    }

    @Nullable
    public final String component4() {
        return this.title;
    }

    @Nullable
    public final String component5() {
        return this.desc;
    }

    @Nullable
    public final String component6() {
        return this.image;
    }

    @NotNull
    public final ChannelBaikeTitleItem copy(@Nullable String str, long j7, long j8, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        return new ChannelBaikeTitleItem(str, j7, j8, str2, str3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelBaikeTitleItem)) {
            return false;
        }
        ChannelBaikeTitleItem channelBaikeTitleItem = (ChannelBaikeTitleItem) obj;
        return Intrinsics.areEqual(this.cardType, channelBaikeTitleItem.cardType) && this.navNid == channelBaikeTitleItem.navNid && this.contentNid == channelBaikeTitleItem.contentNid && Intrinsics.areEqual(this.title, channelBaikeTitleItem.title) && Intrinsics.areEqual(this.desc, channelBaikeTitleItem.desc) && Intrinsics.areEqual(this.image, channelBaikeTitleItem.image);
    }

    @Override // fo0.C7134d.a
    public boolean filter() {
        String str;
        return (Intrinsics.areEqual(this.cardType, "baike_title_2") && ((str = this.title) == null || StringsKt.isBlank(str))) ? false : true;
    }

    @Nullable
    public final String getCardType() {
        return this.cardType;
    }

    public final long getContentNid() {
        return this.contentNid;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final String getImage() {
        return this.image;
    }

    public final long getNavNid() {
        return this.navNid;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final boolean hasPicText() {
        boolean z6 = false;
        if (this.desc != null) {
            z6 = false;
            if (!StringsKt.isBlank(r0)) {
                z6 = true;
            }
        }
        return z6;
    }

    public int hashCode() {
        String str = this.cardType;
        int iHashCode = 0;
        int iA = C3554n0.a(C3554n0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.navNid), 31, this.contentNid);
        String str2 = this.title;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.desc;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.image;
        if (str4 != null) {
            iHashCode = str4.hashCode();
        }
        return ((((iA + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode;
    }

    public final void setCardType(@Nullable String str) {
        this.cardType = str;
    }

    public final void setContentNid(long j7) {
        this.contentNid = j7;
    }

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    public final void setImage(@Nullable String str) {
        this.image = str;
    }

    public final void setNavNid(long j7) {
        this.navNid = j7;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    @NotNull
    public String toString() {
        String str = this.cardType;
        long j7 = this.navNid;
        long j8 = this.contentNid;
        String str2 = this.title;
        String str3 = this.desc;
        String str4 = this.image;
        StringBuilder sbA = b.a(j7, "ChannelBaikeTitleItem(cardType=", str, ", navNid=");
        z.a(j8, ", contentNid=", ", title=", sbA);
        B.a(str2, ", desc=", str3, ", image=", sbA);
        return C8770a.a(sbA, str4, ")");
    }
}
