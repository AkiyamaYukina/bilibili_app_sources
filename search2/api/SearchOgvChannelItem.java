package com.bilibili.search2.api;

import Ps0.X;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.B;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.ReasonStyle;
import com.bapis.bilibili.polymer.app.search.v1.SearchOgvChannelCard;
import com.bapis.bilibili.polymer.app.search.v1.ThreePoint;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.SearchBangumiItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchOgvChannelItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchOgvChannelItem extends BaseSearchItem {
    public static final int $stable = 8;

    @JSONField(name = "area")
    @Nullable
    private String area;

    @JSONField(name = "badge")
    @Nullable
    private String badge;

    @JSONField(name = "badges_v2")
    @Nullable
    private List<Tag> badgesV2;

    @JSONField(name = "bikan_degree")
    @Nullable
    private X bikanDegree;

    @JSONField(name = "desc")
    @Nullable
    private String desc;

    @JSONField(name = "media_id")
    @Nullable
    private Long mediaId;

    @JSONField(name = "purchase_button")
    @Nullable
    private SearchBangumiItem.PurchaseButton purchaseButton;

    @JSONField(name = "rating")
    @Nullable
    private String rating;

    @JSONField(deserialize = false, serialize = false)
    @Nullable
    private String shareTitle;

    @JSONField(name = "staff")
    @Nullable
    private String staff;

    @JSONField(name = "style_label")
    @Nullable
    private Tag styleLabel;

    @JSONField(name = "styles")
    @Nullable
    private String styles;

    @JSONField(name = "styles_v2")
    @Nullable
    private String stylesV2;

    @JSONField(name = "watch_button")
    @Nullable
    private X watchButton;

    public SearchOgvChannelItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public SearchOgvChannelItem(@NotNull SearchOgvChannelCard searchOgvChannelCard) {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        this.mediaId = Long.valueOf(searchOgvChannelCard.getMediaId());
        this.styles = searchOgvChannelCard.getStyles();
        this.area = searchOgvChannelCard.getArea();
        this.staff = searchOgvChannelCard.getStaff();
        this.badge = searchOgvChannelCard.getBadge();
        this.stylesV2 = searchOgvChannelCard.getStylesV2();
        if (searchOgvChannelCard.hasWatchButton()) {
            this.watchButton = new X(searchOgvChannelCard.getWatchButton());
        }
        if (searchOgvChannelCard.hasBikanDegree()) {
            this.bikanDegree = new X(searchOgvChannelCard.getBikanDegree());
        }
        this.rating = String.valueOf(searchOgvChannelCard.getRating());
        this.desc = searchOgvChannelCard.getDesc();
        setTitle(searchOgvChannelCard.getTitle());
        setCover(searchOgvChannelCard.getCover());
        ArrayList arrayList = new ArrayList();
        Iterator it = searchOgvChannelCard.getBadgesV2List().iterator();
        while (it.hasNext()) {
            arrayList.add(new Tag((ReasonStyle) it.next()));
        }
        if (!arrayList.isEmpty()) {
            this.badgesV2 = arrayList;
        }
        if (searchOgvChannelCard.hasPurchaseButton()) {
            this.purchaseButton = new SearchBangumiItem.PurchaseButton(searchOgvChannelCard.getPurchaseButton());
        }
        if (searchOgvChannelCard.hasStyleLabel()) {
            this.styleLabel = new Tag(searchOgvChannelCard.getStyleLabel());
        }
        if (searchOgvChannelCard.hasShare()) {
            setShare(new BaseSearchItem.Share(searchOgvChannelCard.getShare()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = searchOgvChannelCard.getThreePointList().iterator();
        while (it2.hasNext()) {
            arrayList2.add(new BaseSearchItem.ThreePointItem((ThreePoint) it2.next()));
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        setThreePoints(arrayList2);
    }

    public SearchOgvChannelItem(@Nullable Long l7, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable X x6, @Nullable X x7, @Nullable String str6, @Nullable String str7, @Nullable List<Tag> list, @Nullable SearchBangumiItem.PurchaseButton purchaseButton, @Nullable Tag tag) {
        this.mediaId = l7;
        this.styles = str;
        this.stylesV2 = str2;
        this.area = str3;
        this.staff = str4;
        this.badge = str5;
        this.watchButton = x6;
        this.bikanDegree = x7;
        this.rating = str6;
        this.desc = str7;
        this.badgesV2 = list;
        this.purchaseButton = purchaseButton;
        this.styleLabel = tag;
    }

    public /* synthetic */ SearchOgvChannelItem(Long l7, String str, String str2, String str3, String str4, String str5, X x6, X x7, String str6, String str7, List list, SearchBangumiItem.PurchaseButton purchaseButton, Tag tag, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : l7, (i7 & 2) != 0 ? null : str, (i7 & 4) != 0 ? null : str2, (i7 & 8) != 0 ? null : str3, (i7 & 16) != 0 ? null : str4, (i7 & 32) != 0 ? null : str5, (i7 & 64) != 0 ? null : x6, (i7 & 128) != 0 ? null : x7, (i7 & 256) != 0 ? null : str6, (i7 & 512) != 0 ? null : str7, (i7 & 1024) != 0 ? null : list, (i7 & 2048) != 0 ? null : purchaseButton, (i7 & 4096) != 0 ? null : tag);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchOgvChannelItem copy$default(SearchOgvChannelItem searchOgvChannelItem, Long l7, String str, String str2, String str3, String str4, String str5, X x6, X x7, String str6, String str7, List list, SearchBangumiItem.PurchaseButton purchaseButton, Tag tag, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            l7 = searchOgvChannelItem.mediaId;
        }
        if ((i7 & 2) != 0) {
            str = searchOgvChannelItem.styles;
        }
        if ((i7 & 4) != 0) {
            str2 = searchOgvChannelItem.stylesV2;
        }
        if ((i7 & 8) != 0) {
            str3 = searchOgvChannelItem.area;
        }
        if ((i7 & 16) != 0) {
            str4 = searchOgvChannelItem.staff;
        }
        if ((i7 & 32) != 0) {
            str5 = searchOgvChannelItem.badge;
        }
        if ((i7 & 64) != 0) {
            x6 = searchOgvChannelItem.watchButton;
        }
        if ((i7 & 128) != 0) {
            x7 = searchOgvChannelItem.bikanDegree;
        }
        if ((i7 & 256) != 0) {
            str6 = searchOgvChannelItem.rating;
        }
        if ((i7 & 512) != 0) {
            str7 = searchOgvChannelItem.desc;
        }
        if ((i7 & 1024) != 0) {
            list = searchOgvChannelItem.badgesV2;
        }
        if ((i7 & 2048) != 0) {
            purchaseButton = searchOgvChannelItem.purchaseButton;
        }
        if ((i7 & 4096) != 0) {
            tag = searchOgvChannelItem.styleLabel;
        }
        return searchOgvChannelItem.copy(l7, str, str2, str3, str4, str5, x6, x7, str6, str7, list, purchaseButton, tag);
    }

    @Nullable
    public final Long component1() {
        return this.mediaId;
    }

    @Nullable
    public final String component10() {
        return this.desc;
    }

    @Nullable
    public final List<Tag> component11() {
        return this.badgesV2;
    }

    @Nullable
    public final SearchBangumiItem.PurchaseButton component12() {
        return this.purchaseButton;
    }

    @Nullable
    public final Tag component13() {
        return this.styleLabel;
    }

    @Nullable
    public final String component2() {
        return this.styles;
    }

    @Nullable
    public final String component3() {
        return this.stylesV2;
    }

    @Nullable
    public final String component4() {
        return this.area;
    }

    @Nullable
    public final String component5() {
        return this.staff;
    }

    @Nullable
    public final String component6() {
        return this.badge;
    }

    @Nullable
    public final X component7() {
        return this.watchButton;
    }

    @Nullable
    public final X component8() {
        return this.bikanDegree;
    }

    @Nullable
    public final String component9() {
        return this.rating;
    }

    @NotNull
    public final SearchOgvChannelItem copy(@Nullable Long l7, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable X x6, @Nullable X x7, @Nullable String str6, @Nullable String str7, @Nullable List<Tag> list, @Nullable SearchBangumiItem.PurchaseButton purchaseButton, @Nullable Tag tag) {
        return new SearchOgvChannelItem(l7, str, str2, str3, str4, str5, x6, x7, str6, str7, list, purchaseButton, tag);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchOgvChannelItem)) {
            return false;
        }
        SearchOgvChannelItem searchOgvChannelItem = (SearchOgvChannelItem) obj;
        return Intrinsics.areEqual(this.mediaId, searchOgvChannelItem.mediaId) && Intrinsics.areEqual(this.styles, searchOgvChannelItem.styles) && Intrinsics.areEqual(this.stylesV2, searchOgvChannelItem.stylesV2) && Intrinsics.areEqual(this.area, searchOgvChannelItem.area) && Intrinsics.areEqual(this.staff, searchOgvChannelItem.staff) && Intrinsics.areEqual(this.badge, searchOgvChannelItem.badge) && Intrinsics.areEqual(this.watchButton, searchOgvChannelItem.watchButton) && Intrinsics.areEqual(this.bikanDegree, searchOgvChannelItem.bikanDegree) && Intrinsics.areEqual(this.rating, searchOgvChannelItem.rating) && Intrinsics.areEqual(this.desc, searchOgvChannelItem.desc) && Intrinsics.areEqual(this.badgesV2, searchOgvChannelItem.badgesV2) && Intrinsics.areEqual(this.purchaseButton, searchOgvChannelItem.purchaseButton) && Intrinsics.areEqual(this.styleLabel, searchOgvChannelItem.styleLabel);
    }

    @Nullable
    public final String getArea() {
        return this.area;
    }

    @Nullable
    public final String getBadge() {
        return this.badge;
    }

    @Nullable
    public final List<Tag> getBadgesV2() {
        return this.badgesV2;
    }

    @Nullable
    public final X getBikanDegree() {
        return this.bikanDegree;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final Long getMediaId() {
        return this.mediaId;
    }

    @Nullable
    public final SearchBangumiItem.PurchaseButton getPurchaseButton() {
        return this.purchaseButton;
    }

    @Nullable
    public final String getRating() {
        return this.rating;
    }

    @Nullable
    public final String getShareTitle() {
        return this.shareTitle;
    }

    @Nullable
    public final String getStaff() {
        return this.staff;
    }

    @Nullable
    public final Tag getStyleLabel() {
        return this.styleLabel;
    }

    @Nullable
    public final String getStyles() {
        return this.styles;
    }

    @Nullable
    public final String getStylesV2() {
        return this.stylesV2;
    }

    @Nullable
    public final X getWatchButton() {
        return this.watchButton;
    }

    public int hashCode() {
        Long l7 = this.mediaId;
        int iHashCode = 0;
        int iHashCode2 = l7 == null ? 0 : l7.hashCode();
        String str = this.styles;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.stylesV2;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.area;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.staff;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.badge;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        X x6 = this.watchButton;
        int iHashCode8 = x6 == null ? 0 : x6.hashCode();
        X x7 = this.bikanDegree;
        int iHashCode9 = x7 == null ? 0 : x7.hashCode();
        String str6 = this.rating;
        int iHashCode10 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.desc;
        int iHashCode11 = str7 == null ? 0 : str7.hashCode();
        List<Tag> list = this.badgesV2;
        int iHashCode12 = list == null ? 0 : list.hashCode();
        SearchBangumiItem.PurchaseButton purchaseButton = this.purchaseButton;
        int iHashCode13 = purchaseButton == null ? 0 : purchaseButton.hashCode();
        Tag tag = this.styleLabel;
        if (tag != null) {
            iHashCode = tag.hashCode();
        }
        return (((((((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode;
    }

    public final void setArea(@Nullable String str) {
        this.area = str;
    }

    public final void setBadge(@Nullable String str) {
        this.badge = str;
    }

    public final void setBadgesV2(@Nullable List<Tag> list) {
        this.badgesV2 = list;
    }

    public final void setBikanDegree(@Nullable X x6) {
        this.bikanDegree = x6;
    }

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    public final void setMediaId(@Nullable Long l7) {
        this.mediaId = l7;
    }

    public final void setPurchaseButton(@Nullable SearchBangumiItem.PurchaseButton purchaseButton) {
        this.purchaseButton = purchaseButton;
    }

    public final void setRating(@Nullable String str) {
        this.rating = str;
    }

    public final void setShareTitle(@Nullable String str) {
        this.shareTitle = str;
    }

    public final void setStaff(@Nullable String str) {
        this.staff = str;
    }

    public final void setStyleLabel(@Nullable Tag tag) {
        this.styleLabel = tag;
    }

    public final void setStyles(@Nullable String str) {
        this.styles = str;
    }

    public final void setStylesV2(@Nullable String str) {
        this.stylesV2 = str;
    }

    public final void setWatchButton(@Nullable X x6) {
        this.watchButton = x6;
    }

    @NotNull
    public String toString() {
        Long l7 = this.mediaId;
        String str = this.styles;
        String str2 = this.stylesV2;
        String str3 = this.area;
        String str4 = this.staff;
        String str5 = this.badge;
        X x6 = this.watchButton;
        X x7 = this.bikanDegree;
        String str6 = this.rating;
        String str7 = this.desc;
        List<Tag> list = this.badgesV2;
        SearchBangumiItem.PurchaseButton purchaseButton = this.purchaseButton;
        Tag tag = this.styleLabel;
        StringBuilder sbA = cf.c.a("SearchOgvChannelItem(mediaId=", ", styles=", str, l7, ", stylesV2=");
        B.a(str2, ", area=", str3, ", staff=", sbA);
        B.a(str4, ", badge=", str5, ", watchButton=", sbA);
        sbA.append(x6);
        sbA.append(", bikanDegree=");
        sbA.append(x7);
        sbA.append(", rating=");
        B.a(str6, ", desc=", str7, ", badgesV2=", sbA);
        sbA.append(list);
        sbA.append(", purchaseButton=");
        sbA.append(purchaseButton);
        sbA.append(", styleLabel=");
        sbA.append(tag);
        sbA.append(")");
        return sbA.toString();
    }
}
