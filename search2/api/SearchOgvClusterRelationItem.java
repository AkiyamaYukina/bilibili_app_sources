package com.bilibili.search2.api;

import Ps0.C2786g;
import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import androidx.core.app.o;
import androidx.core.view.GravityCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.media3.common.util.C4638g;
import androidx.room.B;
import cf.m;
import com.bapis.bilibili.polymer.app.search.v1.DetailsRelationItem;
import com.bapis.bilibili.polymer.app.search.v1.ExtraWord;
import com.bapis.bilibili.polymer.app.search.v1.OgvClusterCardRelate;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.search2.api.SearchOgvRelationItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchOgvClusterRelationItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchOgvClusterRelationItem extends BaseSearchItem {
    public static final int $stable = 8;

    @NotNull
    private final OgvClusterCardRelate card;

    @Nullable
    private String currentSelectedFirstExtra;

    @Nullable
    private String currentSelectedSecondExtra;

    @NotNull
    private Sort currentSelectedSort;
    private boolean error;

    @NotNull
    private final List<C2786g> extraWordList;

    @Nullable
    private String goTo;
    private boolean hasSingleCard;
    private boolean isLoading;

    @Nullable
    private String keyword;

    @Nullable
    private String linkType;
    private int localPagePos;
    private int moreSearchType;

    @Nullable
    private final String moreUrl;
    private final boolean needOrder;
    private long pageNum;

    @Nullable
    private String qvId;

    @Nullable
    private Xs0.a reportExtra;
    private int retryHeight;
    private int serverPagePos;
    private final long showLines;
    private long spreadId;

    @Nullable
    private String title;

    @Nullable
    private String trackId;

    @Nullable
    private String uri;

    @NotNull
    private List<SearchOgvRelationItem.DetailsRelationItem> videos;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchOgvClusterRelationItem$Sort.class */
    public static final class Sort {
        private static final EnumEntries $ENTRIES;
        private static final Sort[] $VALUES;
        public static final Sort DEFAULT = new Sort("DEFAULT", 0);
        public static final Sort PUBLISH_TIME = new Sort("PUBLISH_TIME", 1);

        private static final /* synthetic */ Sort[] $values() {
            return new Sort[]{DEFAULT, PUBLISH_TIME};
        }

        static {
            Sort[] sortArr$values = $values();
            $VALUES = sortArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(sortArr$values);
        }

        private Sort(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<Sort> getEntries() {
            return $ENTRIES;
        }

        public static Sort valueOf(String str) {
            return (Sort) Enum.valueOf(Sort.class, str);
        }

        public static Sort[] values() {
            return (Sort[]) $VALUES.clone();
        }
    }

    public SearchOgvClusterRelationItem(@NotNull OgvClusterCardRelate ogvClusterCardRelate, @Nullable String str, @NotNull List<C2786g> list, boolean z6, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, int i7, int i8, long j7, @Nullable String str7, long j8, @Nullable String str8, @Nullable String str9, @Nullable String str10, @NotNull Sort sort, @NotNull List<SearchOgvRelationItem.DetailsRelationItem> list2, int i9, boolean z7, boolean z8, boolean z9, int i10, long j9, @Nullable Xs0.a aVar) {
        this.card = ogvClusterCardRelate;
        this.trackId = str;
        this.extraWordList = list;
        this.needOrder = z6;
        this.goTo = str2;
        this.title = str3;
        this.uri = str4;
        this.keyword = str5;
        this.qvId = str6;
        this.serverPagePos = i7;
        this.localPagePos = i8;
        this.pageNum = j7;
        this.linkType = str7;
        this.showLines = j8;
        this.moreUrl = str8;
        this.currentSelectedFirstExtra = str9;
        this.currentSelectedSecondExtra = str10;
        this.currentSelectedSort = sort;
        this.videos = list2;
        this.retryHeight = i9;
        this.error = z7;
        this.hasSingleCard = z8;
        this.isLoading = z9;
        this.moreSearchType = i10;
        this.spreadId = j9;
        this.reportExtra = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r34v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r34v1 */
    /* JADX WARN: Type inference failed for: r34v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r52v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r52v1 */
    /* JADX WARN: Type inference failed for: r52v2, types: [java.util.ArrayList] */
    public /* synthetic */ SearchOgvClusterRelationItem(OgvClusterCardRelate ogvClusterCardRelate, String str, List list, boolean z6, String str2, String str3, String str4, String str5, String str6, int i7, int i8, long j7, String str7, long j8, String str8, String str9, String str10, Sort sort, List list2, int i9, boolean z7, boolean z8, boolean z9, int i10, long j9, Xs0.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i11 & 4) != 0) {
            List extraWordListList = ogvClusterCardRelate.getExtraWordListList();
            list = new ArrayList(CollectionsKt.collectionSizeOrDefault(extraWordListList, 10));
            Iterator it = extraWordListList.iterator();
            while (it.hasNext()) {
                list.add(new C2786g((ExtraWord) it.next()));
            }
        }
        if ((i11 & 8) != 0) {
            z6 = true;
            if (ogvClusterCardRelate.getNeedOrder() != 1) {
                z6 = false;
            }
        }
        str2 = (i11 & 16) != 0 ? null : str2;
        str3 = (i11 & 32) != 0 ? ogvClusterCardRelate.getTitle() : str3;
        str4 = (i11 & 64) != 0 ? null : str4;
        str5 = (i11 & 128) != 0 ? null : str5;
        str6 = (i11 & 256) != 0 ? null : str6;
        i7 = (i11 & 512) != 0 ? 0 : i7;
        i8 = (i11 & 1024) != 0 ? 0 : i8;
        j7 = (i11 & 2048) != 0 ? 0L : j7;
        str7 = (i11 & 4096) != 0 ? null : str7;
        j8 = (i11 & 8192) != 0 ? ogvClusterCardRelate.getShowLines() : j8;
        str8 = (i11 & 16384) != 0 ? ogvClusterCardRelate.getMoreUrl() : str8;
        str9 = (32768 & i11) != 0 ? null : str9;
        str10 = (65536 & i11) != 0 ? null : str10;
        sort = (131072 & i11) != 0 ? Sort.DEFAULT : sort;
        if ((262144 & i11) != 0) {
            List itemsList = ogvClusterCardRelate.getItemsList();
            list2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(itemsList, 10));
            Iterator it2 = itemsList.iterator();
            while (it2.hasNext()) {
                list2.add(new SearchOgvRelationItem.DetailsRelationItem((DetailsRelationItem) it2.next(), str));
            }
        }
        this(ogvClusterCardRelate, str, list, z6, str2, str3, str4, str5, str6, i7, i8, j7, str7, j8, str8, str9, str10, sort, list2, (524288 & i11) != 0 ? 0 : i9, (1048576 & i11) != 0 ? false : z7, (2097152 & i11) != 0 ? false : z8, (4194304 & i11) != 0 ? false : z9, (8388608 & i11) != 0 ? ogvClusterCardRelate.getMoreSearchType() : i10, (16777216 & i11) != 0 ? 0L : j9, (i11 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_HAND_SKELETON_KEYPOINTS_3D) != 0 ? null : aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchOgvClusterRelationItem copy$default(SearchOgvClusterRelationItem searchOgvClusterRelationItem, OgvClusterCardRelate ogvClusterCardRelate, String str, List list, boolean z6, String str2, String str3, String str4, String str5, String str6, int i7, int i8, long j7, String str7, long j8, String str8, String str9, String str10, Sort sort, List list2, int i9, boolean z7, boolean z8, boolean z9, int i10, long j9, Xs0.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            ogvClusterCardRelate = searchOgvClusterRelationItem.card;
        }
        if ((i11 & 2) != 0) {
            str = searchOgvClusterRelationItem.trackId;
        }
        if ((i11 & 4) != 0) {
            list = searchOgvClusterRelationItem.extraWordList;
        }
        if ((i11 & 8) != 0) {
            z6 = searchOgvClusterRelationItem.needOrder;
        }
        if ((i11 & 16) != 0) {
            str2 = searchOgvClusterRelationItem.goTo;
        }
        if ((i11 & 32) != 0) {
            str3 = searchOgvClusterRelationItem.title;
        }
        if ((i11 & 64) != 0) {
            str4 = searchOgvClusterRelationItem.uri;
        }
        if ((i11 & 128) != 0) {
            str5 = searchOgvClusterRelationItem.keyword;
        }
        if ((i11 & 256) != 0) {
            str6 = searchOgvClusterRelationItem.qvId;
        }
        if ((i11 & 512) != 0) {
            i7 = searchOgvClusterRelationItem.serverPagePos;
        }
        if ((i11 & 1024) != 0) {
            i8 = searchOgvClusterRelationItem.localPagePos;
        }
        if ((i11 & 2048) != 0) {
            j7 = searchOgvClusterRelationItem.pageNum;
        }
        if ((i11 & 4096) != 0) {
            str7 = searchOgvClusterRelationItem.linkType;
        }
        if ((i11 & 8192) != 0) {
            j8 = searchOgvClusterRelationItem.showLines;
        }
        if ((i11 & 16384) != 0) {
            str8 = searchOgvClusterRelationItem.moreUrl;
        }
        if ((i11 & 32768) != 0) {
            str9 = searchOgvClusterRelationItem.currentSelectedFirstExtra;
        }
        if ((i11 & 65536) != 0) {
            str10 = searchOgvClusterRelationItem.currentSelectedSecondExtra;
        }
        if ((i11 & 131072) != 0) {
            sort = searchOgvClusterRelationItem.currentSelectedSort;
        }
        if ((i11 & 262144) != 0) {
            list2 = searchOgvClusterRelationItem.videos;
        }
        if ((i11 & AccessibilityNodeInfoCompat.ACTION_COLLAPSE) != 0) {
            i9 = searchOgvClusterRelationItem.retryHeight;
        }
        if ((i11 & AccessibilityNodeInfoCompat.ACTION_DISMISS) != 0) {
            z7 = searchOgvClusterRelationItem.error;
        }
        if ((i11 & AccessibilityNodeInfoCompat.ACTION_SET_TEXT) != 0) {
            z8 = searchOgvClusterRelationItem.hasSingleCard;
        }
        if ((i11 & 4194304) != 0) {
            z9 = searchOgvClusterRelationItem.isLoading;
        }
        if ((i11 & GravityCompat.RELATIVE_LAYOUT_DIRECTION) != 0) {
            i10 = searchOgvClusterRelationItem.moreSearchType;
        }
        if ((i11 & 16777216) != 0) {
            j9 = searchOgvClusterRelationItem.spreadId;
        }
        if ((i11 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_HAND_SKELETON_KEYPOINTS_3D) != 0) {
            aVar = searchOgvClusterRelationItem.reportExtra;
        }
        return searchOgvClusterRelationItem.copy(ogvClusterCardRelate, str, list, z6, str2, str3, str4, str5, str6, i7, i8, j7, str7, j8, str8, str9, str10, sort, list2, i9, z7, z8, z9, i10, j9, aVar);
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public void afterInit() {
        super.afterInit();
        Iterator<T> it = this.videos.iterator();
        while (it.hasNext()) {
            ((SearchOgvRelationItem.DetailsRelationItem) it.next()).cloneFatherParam(this);
        }
    }

    @NotNull
    public final OgvClusterCardRelate component1() {
        return this.card;
    }

    public final int component10() {
        return this.serverPagePos;
    }

    public final int component11() {
        return this.localPagePos;
    }

    public final long component12() {
        return this.pageNum;
    }

    @Nullable
    public final String component13() {
        return this.linkType;
    }

    public final long component14() {
        return this.showLines;
    }

    @Nullable
    public final String component15() {
        return this.moreUrl;
    }

    @Nullable
    public final String component16() {
        return this.currentSelectedFirstExtra;
    }

    @Nullable
    public final String component17() {
        return this.currentSelectedSecondExtra;
    }

    @NotNull
    public final Sort component18() {
        return this.currentSelectedSort;
    }

    @NotNull
    public final List<SearchOgvRelationItem.DetailsRelationItem> component19() {
        return this.videos;
    }

    @Nullable
    public final String component2() {
        return this.trackId;
    }

    public final int component20() {
        return this.retryHeight;
    }

    public final boolean component21() {
        return this.error;
    }

    public final boolean component22() {
        return this.hasSingleCard;
    }

    public final boolean component23() {
        return this.isLoading;
    }

    public final int component24() {
        return this.moreSearchType;
    }

    public final long component25() {
        return this.spreadId;
    }

    @Nullable
    public final Xs0.a component26() {
        return this.reportExtra;
    }

    @NotNull
    public final List<C2786g> component3() {
        return this.extraWordList;
    }

    public final boolean component4() {
        return this.needOrder;
    }

    @Nullable
    public final String component5() {
        return this.goTo;
    }

    @Nullable
    public final String component6() {
        return this.title;
    }

    @Nullable
    public final String component7() {
        return this.uri;
    }

    @Nullable
    public final String component8() {
        return this.keyword;
    }

    @Nullable
    public final String component9() {
        return this.qvId;
    }

    @NotNull
    public final SearchOgvClusterRelationItem copy(@NotNull OgvClusterCardRelate ogvClusterCardRelate, @Nullable String str, @NotNull List<C2786g> list, boolean z6, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, int i7, int i8, long j7, @Nullable String str7, long j8, @Nullable String str8, @Nullable String str9, @Nullable String str10, @NotNull Sort sort, @NotNull List<SearchOgvRelationItem.DetailsRelationItem> list2, int i9, boolean z7, boolean z8, boolean z9, int i10, long j9, @Nullable Xs0.a aVar) {
        return new SearchOgvClusterRelationItem(ogvClusterCardRelate, str, list, z6, str2, str3, str4, str5, str6, i7, i8, j7, str7, j8, str8, str9, str10, sort, list2, i9, z7, z8, z9, i10, j9, aVar);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchOgvClusterRelationItem)) {
            return false;
        }
        SearchOgvClusterRelationItem searchOgvClusterRelationItem = (SearchOgvClusterRelationItem) obj;
        return Intrinsics.areEqual(this.card, searchOgvClusterRelationItem.card) && Intrinsics.areEqual(this.trackId, searchOgvClusterRelationItem.trackId) && Intrinsics.areEqual(this.extraWordList, searchOgvClusterRelationItem.extraWordList) && this.needOrder == searchOgvClusterRelationItem.needOrder && Intrinsics.areEqual(this.goTo, searchOgvClusterRelationItem.goTo) && Intrinsics.areEqual(this.title, searchOgvClusterRelationItem.title) && Intrinsics.areEqual(this.uri, searchOgvClusterRelationItem.uri) && Intrinsics.areEqual(this.keyword, searchOgvClusterRelationItem.keyword) && Intrinsics.areEqual(this.qvId, searchOgvClusterRelationItem.qvId) && this.serverPagePos == searchOgvClusterRelationItem.serverPagePos && this.localPagePos == searchOgvClusterRelationItem.localPagePos && this.pageNum == searchOgvClusterRelationItem.pageNum && Intrinsics.areEqual(this.linkType, searchOgvClusterRelationItem.linkType) && this.showLines == searchOgvClusterRelationItem.showLines && Intrinsics.areEqual(this.moreUrl, searchOgvClusterRelationItem.moreUrl) && Intrinsics.areEqual(this.currentSelectedFirstExtra, searchOgvClusterRelationItem.currentSelectedFirstExtra) && Intrinsics.areEqual(this.currentSelectedSecondExtra, searchOgvClusterRelationItem.currentSelectedSecondExtra) && this.currentSelectedSort == searchOgvClusterRelationItem.currentSelectedSort && Intrinsics.areEqual(this.videos, searchOgvClusterRelationItem.videos) && this.retryHeight == searchOgvClusterRelationItem.retryHeight && this.error == searchOgvClusterRelationItem.error && this.hasSingleCard == searchOgvClusterRelationItem.hasSingleCard && this.isLoading == searchOgvClusterRelationItem.isLoading && this.moreSearchType == searchOgvClusterRelationItem.moreSearchType && this.spreadId == searchOgvClusterRelationItem.spreadId && Intrinsics.areEqual(this.reportExtra, searchOgvClusterRelationItem.reportExtra);
    }

    @NotNull
    public final OgvClusterCardRelate getCard() {
        return this.card;
    }

    @Nullable
    public final String getCurrentSelectedFirstExtra() {
        return this.currentSelectedFirstExtra;
    }

    @Nullable
    public final String getCurrentSelectedSecondExtra() {
        return this.currentSelectedSecondExtra;
    }

    @NotNull
    public final Sort getCurrentSelectedSort() {
        return this.currentSelectedSort;
    }

    public final boolean getError() {
        return this.error;
    }

    @NotNull
    public final List<C2786g> getExtraWordList() {
        return this.extraWordList;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    @Nullable
    public String getGoTo() {
        return this.goTo;
    }

    public final boolean getHasSingleCard() {
        return this.hasSingleCard;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    @Nullable
    public String getKeyword() {
        return this.keyword;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    @Nullable
    public String getLinkType() {
        return this.linkType;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public int getLocalPagePos() {
        return this.localPagePos;
    }

    public final int getMoreSearchType() {
        return this.moreSearchType;
    }

    @Nullable
    public final String getMoreUrl() {
        return this.moreUrl;
    }

    public final boolean getNeedOrder() {
        return this.needOrder;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public long getPageNum() {
        return this.pageNum;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    @Nullable
    public String getQvId() {
        return this.qvId;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    @Nullable
    public Xs0.a getReportExtra() {
        return this.reportExtra;
    }

    public final int getRetryHeight() {
        return this.retryHeight;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public int getServerPagePos() {
        return this.serverPagePos;
    }

    public final long getShowLines() {
        return this.showLines;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public long getSpreadId() {
        return this.spreadId;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    @Nullable
    public String getTitle() {
        return this.title;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    @Nullable
    public String getTrackId() {
        return this.trackId;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    @Nullable
    public String getUri() {
        return this.uri;
    }

    @NotNull
    public final List<SearchOgvRelationItem.DetailsRelationItem> getVideos() {
        return this.videos;
    }

    public int hashCode() {
        int iHashCode = this.card.hashCode();
        String str = this.trackId;
        int iA = z.a(e0.a(((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31, 31, this.extraWordList), 31, this.needOrder);
        String str2 = this.goTo;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.title;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.uri;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.keyword;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.qvId;
        int iA2 = C3554n0.a(I.a(this.localPagePos, I.a(this.serverPagePos, (((((((((iA + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str6 == null ? 0 : str6.hashCode())) * 31, 31), 31), 31, this.pageNum);
        String str7 = this.linkType;
        int iA3 = C3554n0.a((iA2 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.showLines);
        String str8 = this.moreUrl;
        int iHashCode6 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.currentSelectedFirstExtra;
        int iHashCode7 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.currentSelectedSecondExtra;
        int iA4 = C3554n0.a(I.a(this.moreSearchType, z.a(z.a(z.a(I.a(this.retryHeight, e0.a((this.currentSelectedSort.hashCode() + ((((((iA3 + iHashCode6) * 31) + iHashCode7) * 31) + (str10 == null ? 0 : str10.hashCode())) * 31)) * 31, 31, this.videos), 31), 31, this.error), 31, this.hasSingleCard), 31, this.isLoading), 31), 31, this.spreadId);
        Xs0.a aVar = this.reportExtra;
        return iA4 + (aVar == null ? 0 : aVar.hashCode());
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final void setCurrentSelectedFirstExtra(@Nullable String str) {
        this.currentSelectedFirstExtra = str;
    }

    public final void setCurrentSelectedSecondExtra(@Nullable String str) {
        this.currentSelectedSecondExtra = str;
    }

    public final void setCurrentSelectedSort(@NotNull Sort sort) {
        this.currentSelectedSort = sort;
    }

    public final void setError(boolean z6) {
        this.error = z6;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public void setGoTo(@Nullable String str) {
        this.goTo = str;
    }

    public final void setHasSingleCard(boolean z6) {
        this.hasSingleCard = z6;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public void setKeyword(@Nullable String str) {
        this.keyword = str;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public void setLinkType(@Nullable String str) {
        this.linkType = str;
    }

    public final void setLoading(boolean z6) {
        this.isLoading = z6;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public void setLocalPagePos(int i7) {
        this.localPagePos = i7;
    }

    public final void setMoreSearchType(int i7) {
        this.moreSearchType = i7;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public void setPageNum(long j7) {
        this.pageNum = j7;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public void setQvId(@Nullable String str) {
        this.qvId = str;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public void setReportExtra(@Nullable Xs0.a aVar) {
        this.reportExtra = aVar;
    }

    public final void setRetryHeight(int i7) {
        this.retryHeight = i7;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public void setServerPagePos(int i7) {
        this.serverPagePos = i7;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public void setSpreadId(long j7) {
        this.spreadId = j7;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public void setTitle(@Nullable String str) {
        this.title = str;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public void setTrackId(@Nullable String str) {
        this.trackId = str;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public void setUri(@Nullable String str) {
        this.uri = str;
    }

    public final void setVideos(@NotNull List<SearchOgvRelationItem.DetailsRelationItem> list) {
        this.videos = list;
    }

    @NotNull
    public String toString() {
        OgvClusterCardRelate ogvClusterCardRelate = this.card;
        String str = this.trackId;
        List<C2786g> list = this.extraWordList;
        boolean z6 = this.needOrder;
        String str2 = this.goTo;
        String str3 = this.title;
        String str4 = this.uri;
        String str5 = this.keyword;
        String str6 = this.qvId;
        int i7 = this.serverPagePos;
        int i8 = this.localPagePos;
        long j7 = this.pageNum;
        String str7 = this.linkType;
        long j8 = this.showLines;
        String str8 = this.moreUrl;
        String str9 = this.currentSelectedFirstExtra;
        String str10 = this.currentSelectedSecondExtra;
        Sort sort = this.currentSelectedSort;
        List<SearchOgvRelationItem.DetailsRelationItem> list2 = this.videos;
        int i9 = this.retryHeight;
        boolean z7 = this.error;
        boolean z8 = this.hasSingleCard;
        boolean z9 = this.isLoading;
        int i10 = this.moreSearchType;
        long j9 = this.spreadId;
        Xs0.a aVar = this.reportExtra;
        StringBuilder sb = new StringBuilder("SearchOgvClusterRelationItem(card=");
        sb.append(ogvClusterCardRelate);
        sb.append(", trackId=");
        sb.append(str);
        sb.append(", extraWordList=");
        sb.append(list);
        sb.append(", needOrder=");
        sb.append(z6);
        sb.append(", goTo=");
        B.a(str2, ", title=", str3, ", uri=", sb);
        B.a(str4, ", keyword=", str5, ", qvId=", sb);
        H0.e.b(i7, str6, ", serverPagePos=", ", localPagePos=", sb);
        o.b(i8, j7, ", pageNum=", sb);
        B0.b.b(", linkType=", str7, ", showLines=", sb);
        G0.d.a(j8, ", moreUrl=", str8, sb);
        B.a(", currentSelectedFirstExtra=", str9, ", currentSelectedSecondExtra=", str10, sb);
        sb.append(", currentSelectedSort=");
        sb.append(sort);
        sb.append(", videos=");
        sb.append(list2);
        m.a(", retryHeight=", ", error=", i9, z7, sb);
        C4638g.b(", hasSingleCard=", ", isLoading=", sb, z8, z9);
        N1.c.a(i10, ", moreSearchType=", ", spreadId=", sb);
        sb.append(j9);
        sb.append(", reportExtra=");
        sb.append(aVar);
        sb.append(")");
        return sb.toString();
    }
}
