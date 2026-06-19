package com.bilibili.search2.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.B;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.SportsMatchItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/OlympicMatchItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class OlympicMatchItem {
    public static final int $stable = 8;

    @JSONField(name = "begin_time_desc")
    @Nullable
    private String beginTimeDesc;

    @Nullable
    private String img;

    @JSONField(name = "match_id")
    @Nullable
    private Long matchId;

    @JSONField(name = "match_name")
    @Nullable
    private String matchName;

    @JSONField(name = "match_status_desc")
    @Nullable
    private String matchStatusDesc;

    @JSONField(name = "sub_content")
    @Nullable
    private String subContent;

    @JSONField(name = "sub_extra_icon")
    @Nullable
    private String subContentExtraIcon;

    public OlympicMatchItem() {
        this(null, null, null, null, null, null, null, SearchBangumiItem.TYPE_FULLNET_BANGUMI, null);
    }

    public OlympicMatchItem(@NotNull SportsMatchItem sportsMatchItem) {
        this(Long.valueOf(sportsMatchItem.getMatchId()), sportsMatchItem.getMatchName(), sportsMatchItem.getImg(), sportsMatchItem.getBeginTimeDesc(), sportsMatchItem.getMatchStatusDesc(), sportsMatchItem.getSubExtraIcon(), sportsMatchItem.getSubContent());
    }

    public OlympicMatchItem(@Nullable Long l7, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.matchId = l7;
        this.matchName = str;
        this.img = str2;
        this.beginTimeDesc = str3;
        this.matchStatusDesc = str4;
        this.subContentExtraIcon = str5;
        this.subContent = str6;
    }

    public /* synthetic */ OlympicMatchItem(Long l7, String str, String str2, String str3, String str4, String str5, String str6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : l7, (i7 & 2) != 0 ? null : str, (i7 & 4) != 0 ? null : str2, (i7 & 8) != 0 ? null : str3, (i7 & 16) != 0 ? null : str4, (i7 & 32) != 0 ? null : str5, (i7 & 64) != 0 ? null : str6);
    }

    public static /* synthetic */ OlympicMatchItem copy$default(OlympicMatchItem olympicMatchItem, Long l7, String str, String str2, String str3, String str4, String str5, String str6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            l7 = olympicMatchItem.matchId;
        }
        if ((i7 & 2) != 0) {
            str = olympicMatchItem.matchName;
        }
        if ((i7 & 4) != 0) {
            str2 = olympicMatchItem.img;
        }
        if ((i7 & 8) != 0) {
            str3 = olympicMatchItem.beginTimeDesc;
        }
        if ((i7 & 16) != 0) {
            str4 = olympicMatchItem.matchStatusDesc;
        }
        if ((i7 & 32) != 0) {
            str5 = olympicMatchItem.subContentExtraIcon;
        }
        if ((i7 & 64) != 0) {
            str6 = olympicMatchItem.subContent;
        }
        return olympicMatchItem.copy(l7, str, str2, str3, str4, str5, str6);
    }

    @Nullable
    public final Long component1() {
        return this.matchId;
    }

    @Nullable
    public final String component2() {
        return this.matchName;
    }

    @Nullable
    public final String component3() {
        return this.img;
    }

    @Nullable
    public final String component4() {
        return this.beginTimeDesc;
    }

    @Nullable
    public final String component5() {
        return this.matchStatusDesc;
    }

    @Nullable
    public final String component6() {
        return this.subContentExtraIcon;
    }

    @Nullable
    public final String component7() {
        return this.subContent;
    }

    @NotNull
    public final OlympicMatchItem copy(@Nullable Long l7, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        return new OlympicMatchItem(l7, str, str2, str3, str4, str5, str6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OlympicMatchItem)) {
            return false;
        }
        OlympicMatchItem olympicMatchItem = (OlympicMatchItem) obj;
        return Intrinsics.areEqual(this.matchId, olympicMatchItem.matchId) && Intrinsics.areEqual(this.matchName, olympicMatchItem.matchName) && Intrinsics.areEqual(this.img, olympicMatchItem.img) && Intrinsics.areEqual(this.beginTimeDesc, olympicMatchItem.beginTimeDesc) && Intrinsics.areEqual(this.matchStatusDesc, olympicMatchItem.matchStatusDesc) && Intrinsics.areEqual(this.subContentExtraIcon, olympicMatchItem.subContentExtraIcon) && Intrinsics.areEqual(this.subContent, olympicMatchItem.subContent);
    }

    @Nullable
    public final String getBeginTimeDesc() {
        return this.beginTimeDesc;
    }

    @Nullable
    public final String getImg() {
        return this.img;
    }

    @Nullable
    public final Long getMatchId() {
        return this.matchId;
    }

    @Nullable
    public final String getMatchName() {
        return this.matchName;
    }

    @Nullable
    public final String getMatchStatusDesc() {
        return this.matchStatusDesc;
    }

    @Nullable
    public final String getSubContent() {
        return this.subContent;
    }

    @Nullable
    public final String getSubContentExtraIcon() {
        return this.subContentExtraIcon;
    }

    public int hashCode() {
        Long l7 = this.matchId;
        int iHashCode = 0;
        int iHashCode2 = l7 == null ? 0 : l7.hashCode();
        String str = this.matchName;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.img;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.beginTimeDesc;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.matchStatusDesc;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.subContentExtraIcon;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.subContent;
        if (str6 != null) {
            iHashCode = str6.hashCode();
        }
        return (((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode;
    }

    public final void setBeginTimeDesc(@Nullable String str) {
        this.beginTimeDesc = str;
    }

    public final void setImg(@Nullable String str) {
        this.img = str;
    }

    public final void setMatchId(@Nullable Long l7) {
        this.matchId = l7;
    }

    public final void setMatchName(@Nullable String str) {
        this.matchName = str;
    }

    public final void setMatchStatusDesc(@Nullable String str) {
        this.matchStatusDesc = str;
    }

    public final void setSubContent(@Nullable String str) {
        this.subContent = str;
    }

    public final void setSubContentExtraIcon(@Nullable String str) {
        this.subContentExtraIcon = str;
    }

    @NotNull
    public String toString() {
        Long l7 = this.matchId;
        String str = this.matchName;
        String str2 = this.img;
        String str3 = this.beginTimeDesc;
        String str4 = this.matchStatusDesc;
        String str5 = this.subContentExtraIcon;
        String str6 = this.subContent;
        StringBuilder sbA = cf.c.a("OlympicMatchItem(matchId=", ", matchName=", str, l7, ", img=");
        B.a(str2, ", beginTimeDesc=", str3, ", matchStatusDesc=", sbA);
        B.a(str4, ", subContentExtraIcon=", str5, ", subContent=", sbA);
        return C8770a.a(sbA, str6, ")");
    }
}
