package com.bilibili.search2.result.base;

import Ps0.C;
import Ps0.C2786g;
import androidx.annotation.Keep;
import androidx.compose.animation.C3353d;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import androidx.core.view.GravityCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.fragment.app.A;
import androidx.room.B;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.SearchResultAll;
import com.bilibili.search2.api.VerticalSearchResult;
import com.bilibili.teenagersmode.TeenagersMode;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/SearchState.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchState {
    public static final int $stable = 8;

    @NotNull
    public static final a Companion = new Object();

    @NotNull
    private static final SearchState initial = new SearchState(null, null, null, null, null, null, false, false, null, false, 0, null, null, null, null, null, null, null, false, 0, null, 0, false, null, false, null, TeenagersMode.getInstance().isEnable(), false, 0, null, null, 2080374783, null);
    private final int alienationCardCount;

    @Nullable
    private final List<BaseSearchItem> allResultList;

    @Nullable
    private final SearchResultAll data;
    private final boolean enableRefresh;
    private final boolean enableUpdateAnimation;

    @Nullable
    private final i errorState;

    @NotNull
    private List<String> extraWords;

    @Nullable
    private final i fatherErrorState;
    private final boolean firstLoading;

    @Nullable
    private final List<BaseSearchItem> foldedItems;

    @Nullable
    private final k footerState;

    @Nullable
    private final Integer forceLocateToType;
    private final boolean hasImmerseCard;

    @Nullable
    private final Boolean hasNoResultCard;
    private final boolean isEnd;
    private boolean isFilter;

    @Nullable
    private final Boolean isLoading;
    private final boolean isTeenagersMode;

    @Nullable
    private List<SearchResultAll.NavInfo> nav;

    @Nullable
    private final String next;
    private final boolean ogvAggregateNeedOrder;

    @Nullable
    private final String ogvAggregatePageTitle;

    @Nullable
    private final List<C2786g> ogvFilterExtraWord;
    private final int page;

    @Nullable
    private final String query;
    private final int refreshTimes;

    @Nullable
    private final C searchFilter;

    @Nullable
    private String trackId;

    @Nullable
    private final com.bilibili.search2.main.data.c userActQuery;
    private final int version;

    @Nullable
    private final VerticalSearchResult<?> verticalSearchResult;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/SearchState$a.class */
    public static final class a {
    }

    public SearchState() {
        this(null, null, null, null, null, null, false, false, null, false, 0, null, null, null, null, null, null, null, false, 0, null, 0, false, null, false, null, false, false, 0, null, null, Integer.MAX_VALUE, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchState(@Nullable List<? extends BaseSearchItem> list, @Nullable SearchResultAll searchResultAll, @Nullable com.bilibili.search2.main.data.c cVar, @Nullable VerticalSearchResult<?> verticalSearchResult, @Nullable List<SearchResultAll.NavInfo> list2, @NotNull List<String> list3, boolean z6, boolean z7, @Nullable Boolean bool, boolean z8, int i7, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable i iVar, @Nullable i iVar2, @Nullable k kVar, @Nullable Boolean bool2, boolean z9, int i8, @Nullable Integer num, int i9, boolean z10, @Nullable List<C2786g> list4, boolean z11, @Nullable String str4, boolean z12, boolean z13, int i10, @Nullable C c7, @Nullable List<? extends BaseSearchItem> list5) {
        this.allResultList = list;
        this.data = searchResultAll;
        this.userActQuery = cVar;
        this.verticalSearchResult = verticalSearchResult;
        this.nav = list2;
        this.extraWords = list3;
        this.isFilter = z6;
        this.firstLoading = z7;
        this.isLoading = bool;
        this.isEnd = z8;
        this.page = i7;
        this.query = str;
        this.next = str2;
        this.trackId = str3;
        this.fatherErrorState = iVar;
        this.errorState = iVar2;
        this.footerState = kVar;
        this.hasNoResultCard = bool2;
        this.hasImmerseCard = z9;
        this.version = i8;
        this.forceLocateToType = num;
        this.refreshTimes = i9;
        this.enableRefresh = z10;
        this.ogvFilterExtraWord = list4;
        this.ogvAggregateNeedOrder = z11;
        this.ogvAggregatePageTitle = str4;
        this.isTeenagersMode = z12;
        this.enableUpdateAnimation = z13;
        this.alienationCardCount = i10;
        this.searchFilter = c7;
        this.foldedItems = list5;
    }

    public /* synthetic */ SearchState(List list, SearchResultAll searchResultAll, com.bilibili.search2.main.data.c cVar, VerticalSearchResult verticalSearchResult, List list2, List list3, boolean z6, boolean z7, Boolean bool, boolean z8, int i7, String str, String str2, String str3, i iVar, i iVar2, k kVar, Boolean bool2, boolean z9, int i8, Integer num, int i9, boolean z10, List list4, boolean z11, String str4, boolean z12, boolean z13, int i10, C c7, List list5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : searchResultAll, (i11 & 4) != 0 ? null : cVar, (i11 & 8) != 0 ? null : verticalSearchResult, (i11 & 16) != 0 ? null : list2, (i11 & 32) != 0 ? CollectionsKt.emptyList() : list3, (i11 & 64) != 0 ? false : z6, (i11 & 128) != 0 ? false : z7, (i11 & 256) != 0 ? null : bool, (i11 & 512) != 0 ? false : z8, (i11 & 1024) != 0 ? 0 : i7, (i11 & 2048) != 0 ? null : str, (i11 & 4096) != 0 ? null : str2, (i11 & 8192) != 0 ? null : str3, (i11 & 16384) != 0 ? null : iVar, (i11 & 32768) != 0 ? null : iVar2, (i11 & 65536) != 0 ? null : kVar, (i11 & 131072) != 0 ? null : bool2, (i11 & 262144) != 0 ? false : z9, (i11 & AccessibilityNodeInfoCompat.ACTION_COLLAPSE) != 0 ? 0 : i8, (i11 & AccessibilityNodeInfoCompat.ACTION_DISMISS) != 0 ? null : num, (i11 & AccessibilityNodeInfoCompat.ACTION_SET_TEXT) != 0 ? 0 : i9, (i11 & 4194304) != 0 ? false : z10, (i11 & GravityCompat.RELATIVE_LAYOUT_DIRECTION) != 0 ? null : list4, (i11 & 16777216) != 0 ? false : z11, (i11 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_HAND_SKELETON_KEYPOINTS_3D) != 0 ? null : str4, (i11 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_MULTI_SEGMENT) != 0 ? false : z12, (i11 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_GAZE_DETECT) != 0 ? false : z13, (i11 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_DYNAMIC_GESTURE) != 0 ? 0 : i10, (i11 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_AVATAR_HELPER) != 0 ? null : c7, (i11 & BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE) != 0 ? null : list5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchState copy$default(SearchState searchState, List list, SearchResultAll searchResultAll, com.bilibili.search2.main.data.c cVar, VerticalSearchResult verticalSearchResult, List list2, List list3, boolean z6, boolean z7, Boolean bool, boolean z8, int i7, String str, String str2, String str3, i iVar, i iVar2, k kVar, Boolean bool2, boolean z9, int i8, Integer num, int i9, boolean z10, List list4, boolean z11, String str4, boolean z12, boolean z13, int i10, C c7, List list5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = searchState.allResultList;
        }
        if ((i11 & 2) != 0) {
            searchResultAll = searchState.data;
        }
        if ((i11 & 4) != 0) {
            cVar = searchState.userActQuery;
        }
        if ((i11 & 8) != 0) {
            verticalSearchResult = searchState.verticalSearchResult;
        }
        if ((i11 & 16) != 0) {
            list2 = searchState.nav;
        }
        if ((i11 & 32) != 0) {
            list3 = searchState.extraWords;
        }
        if ((i11 & 64) != 0) {
            z6 = searchState.isFilter;
        }
        if ((i11 & 128) != 0) {
            z7 = searchState.firstLoading;
        }
        if ((i11 & 256) != 0) {
            bool = searchState.isLoading;
        }
        if ((i11 & 512) != 0) {
            z8 = searchState.isEnd;
        }
        if ((i11 & 1024) != 0) {
            i7 = searchState.page;
        }
        if ((i11 & 2048) != 0) {
            str = searchState.query;
        }
        if ((i11 & 4096) != 0) {
            str2 = searchState.next;
        }
        if ((i11 & 8192) != 0) {
            str3 = searchState.trackId;
        }
        if ((i11 & 16384) != 0) {
            iVar = searchState.fatherErrorState;
        }
        if ((i11 & 32768) != 0) {
            iVar2 = searchState.errorState;
        }
        if ((i11 & 65536) != 0) {
            kVar = searchState.footerState;
        }
        if ((i11 & 131072) != 0) {
            bool2 = searchState.hasNoResultCard;
        }
        if ((i11 & 262144) != 0) {
            z9 = searchState.hasImmerseCard;
        }
        if ((i11 & AccessibilityNodeInfoCompat.ACTION_COLLAPSE) != 0) {
            i8 = searchState.version;
        }
        if ((i11 & AccessibilityNodeInfoCompat.ACTION_DISMISS) != 0) {
            num = searchState.forceLocateToType;
        }
        if ((i11 & AccessibilityNodeInfoCompat.ACTION_SET_TEXT) != 0) {
            i9 = searchState.refreshTimes;
        }
        if ((i11 & 4194304) != 0) {
            z10 = searchState.enableRefresh;
        }
        if ((i11 & GravityCompat.RELATIVE_LAYOUT_DIRECTION) != 0) {
            list4 = searchState.ogvFilterExtraWord;
        }
        if ((i11 & 16777216) != 0) {
            z11 = searchState.ogvAggregateNeedOrder;
        }
        if ((i11 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_HAND_SKELETON_KEYPOINTS_3D) != 0) {
            str4 = searchState.ogvAggregatePageTitle;
        }
        if ((i11 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_MULTI_SEGMENT) != 0) {
            z12 = searchState.isTeenagersMode;
        }
        if ((i11 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_GAZE_DETECT) != 0) {
            z13 = searchState.enableUpdateAnimation;
        }
        if ((i11 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_DYNAMIC_GESTURE) != 0) {
            i10 = searchState.alienationCardCount;
        }
        if ((i11 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_AVATAR_HELPER) != 0) {
            c7 = searchState.searchFilter;
        }
        if ((i11 & BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE) != 0) {
            list5 = searchState.foldedItems;
        }
        return searchState.copy(list, searchResultAll, cVar, verticalSearchResult, list2, list3, z6, z7, bool, z8, i7, str, str2, str3, iVar, iVar2, kVar, bool2, z9, i8, num, i9, z10, list4, z11, str4, z12, z13, i10, c7, list5);
    }

    @Nullable
    public final List<BaseSearchItem> component1() {
        return this.allResultList;
    }

    public final boolean component10() {
        return this.isEnd;
    }

    public final int component11() {
        return this.page;
    }

    @Nullable
    public final String component12() {
        return this.query;
    }

    @Nullable
    public final String component13() {
        return this.next;
    }

    @Nullable
    public final String component14() {
        return this.trackId;
    }

    @Nullable
    public final i component15() {
        return this.fatherErrorState;
    }

    @Nullable
    public final i component16() {
        return this.errorState;
    }

    @Nullable
    public final k component17() {
        return this.footerState;
    }

    @Nullable
    public final Boolean component18() {
        return this.hasNoResultCard;
    }

    public final boolean component19() {
        return this.hasImmerseCard;
    }

    @Nullable
    public final SearchResultAll component2() {
        return this.data;
    }

    public final int component20() {
        return this.version;
    }

    @Nullable
    public final Integer component21() {
        return this.forceLocateToType;
    }

    public final int component22() {
        return this.refreshTimes;
    }

    public final boolean component23() {
        return this.enableRefresh;
    }

    @Nullable
    public final List<C2786g> component24() {
        return this.ogvFilterExtraWord;
    }

    public final boolean component25() {
        return this.ogvAggregateNeedOrder;
    }

    @Nullable
    public final String component26() {
        return this.ogvAggregatePageTitle;
    }

    public final boolean component27() {
        return this.isTeenagersMode;
    }

    public final boolean component28() {
        return this.enableUpdateAnimation;
    }

    public final int component29() {
        return this.alienationCardCount;
    }

    @Nullable
    public final com.bilibili.search2.main.data.c component3() {
        return this.userActQuery;
    }

    @Nullable
    public final C component30() {
        return this.searchFilter;
    }

    @Nullable
    public final List<BaseSearchItem> component31() {
        return this.foldedItems;
    }

    @Nullable
    public final VerticalSearchResult<?> component4() {
        return this.verticalSearchResult;
    }

    @Nullable
    public final List<SearchResultAll.NavInfo> component5() {
        return this.nav;
    }

    @NotNull
    public final List<String> component6() {
        return this.extraWords;
    }

    public final boolean component7() {
        return this.isFilter;
    }

    public final boolean component8() {
        return this.firstLoading;
    }

    @Nullable
    public final Boolean component9() {
        return this.isLoading;
    }

    @NotNull
    public final SearchState copy(@Nullable List<? extends BaseSearchItem> list, @Nullable SearchResultAll searchResultAll, @Nullable com.bilibili.search2.main.data.c cVar, @Nullable VerticalSearchResult<?> verticalSearchResult, @Nullable List<SearchResultAll.NavInfo> list2, @NotNull List<String> list3, boolean z6, boolean z7, @Nullable Boolean bool, boolean z8, int i7, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable i iVar, @Nullable i iVar2, @Nullable k kVar, @Nullable Boolean bool2, boolean z9, int i8, @Nullable Integer num, int i9, boolean z10, @Nullable List<C2786g> list4, boolean z11, @Nullable String str4, boolean z12, boolean z13, int i10, @Nullable C c7, @Nullable List<? extends BaseSearchItem> list5) {
        return new SearchState(list, searchResultAll, cVar, verticalSearchResult, list2, list3, z6, z7, bool, z8, i7, str, str2, str3, iVar, iVar2, kVar, bool2, z9, i8, num, i9, z10, list4, z11, str4, z12, z13, i10, c7, list5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchState)) {
            return false;
        }
        SearchState searchState = (SearchState) obj;
        return Intrinsics.areEqual(this.allResultList, searchState.allResultList) && Intrinsics.areEqual(this.data, searchState.data) && Intrinsics.areEqual(this.userActQuery, searchState.userActQuery) && Intrinsics.areEqual(this.verticalSearchResult, searchState.verticalSearchResult) && Intrinsics.areEqual(this.nav, searchState.nav) && Intrinsics.areEqual(this.extraWords, searchState.extraWords) && this.isFilter == searchState.isFilter && this.firstLoading == searchState.firstLoading && Intrinsics.areEqual(this.isLoading, searchState.isLoading) && this.isEnd == searchState.isEnd && this.page == searchState.page && Intrinsics.areEqual(this.query, searchState.query) && Intrinsics.areEqual(this.next, searchState.next) && Intrinsics.areEqual(this.trackId, searchState.trackId) && Intrinsics.areEqual(this.fatherErrorState, searchState.fatherErrorState) && Intrinsics.areEqual(this.errorState, searchState.errorState) && Intrinsics.areEqual(this.footerState, searchState.footerState) && Intrinsics.areEqual(this.hasNoResultCard, searchState.hasNoResultCard) && this.hasImmerseCard == searchState.hasImmerseCard && this.version == searchState.version && Intrinsics.areEqual(this.forceLocateToType, searchState.forceLocateToType) && this.refreshTimes == searchState.refreshTimes && this.enableRefresh == searchState.enableRefresh && Intrinsics.areEqual(this.ogvFilterExtraWord, searchState.ogvFilterExtraWord) && this.ogvAggregateNeedOrder == searchState.ogvAggregateNeedOrder && Intrinsics.areEqual(this.ogvAggregatePageTitle, searchState.ogvAggregatePageTitle) && this.isTeenagersMode == searchState.isTeenagersMode && this.enableUpdateAnimation == searchState.enableUpdateAnimation && this.alienationCardCount == searchState.alienationCardCount && Intrinsics.areEqual(this.searchFilter, searchState.searchFilter) && Intrinsics.areEqual(this.foldedItems, searchState.foldedItems);
    }

    public final int getAlienationCardCount() {
        return this.alienationCardCount;
    }

    @Nullable
    public final List<BaseSearchItem> getAllResultList() {
        return this.allResultList;
    }

    @Nullable
    public final SearchResultAll getData() {
        return this.data;
    }

    public final boolean getEnableRefresh() {
        return this.enableRefresh;
    }

    public final boolean getEnableUpdateAnimation() {
        return this.enableUpdateAnimation;
    }

    @Nullable
    public final i getErrorState() {
        return this.errorState;
    }

    @NotNull
    public final List<String> getExtraWords() {
        return this.extraWords;
    }

    @Nullable
    public final i getFatherErrorState() {
        return this.fatherErrorState;
    }

    public final boolean getFirstLoading() {
        return this.firstLoading;
    }

    @Nullable
    public final List<BaseSearchItem> getFoldedItems() {
        return this.foldedItems;
    }

    @Nullable
    public final k getFooterState() {
        return this.footerState;
    }

    @Nullable
    public final Integer getForceLocateToType() {
        return this.forceLocateToType;
    }

    public final boolean getHasImmerseCard() {
        return this.hasImmerseCard;
    }

    @Nullable
    public final Boolean getHasNoResultCard() {
        return this.hasNoResultCard;
    }

    @Nullable
    public final List<SearchResultAll.NavInfo> getNav() {
        return this.nav;
    }

    @Nullable
    public final String getNext() {
        return this.next;
    }

    public final boolean getOgvAggregateNeedOrder() {
        return this.ogvAggregateNeedOrder;
    }

    @Nullable
    public final String getOgvAggregatePageTitle() {
        return this.ogvAggregatePageTitle;
    }

    @Nullable
    public final List<C2786g> getOgvFilterExtraWord() {
        return this.ogvFilterExtraWord;
    }

    public final int getPage() {
        return this.page;
    }

    @Nullable
    public final String getQuery() {
        return this.query;
    }

    public final int getRefreshTimes() {
        return this.refreshTimes;
    }

    @Nullable
    public final C getSearchFilter() {
        return this.searchFilter;
    }

    @Nullable
    public final String getTrackId() {
        return this.trackId;
    }

    @Nullable
    public final com.bilibili.search2.main.data.c getUserActQuery() {
        return this.userActQuery;
    }

    public final int getVersion() {
        return this.version;
    }

    @Nullable
    public final VerticalSearchResult<?> getVerticalSearchResult() {
        return this.verticalSearchResult;
    }

    public int hashCode() {
        int iIdentityHashCode;
        List<BaseSearchItem> list = this.allResultList;
        int iHashCode = list == null ? 0 : list.hashCode();
        SearchResultAll searchResultAll = this.data;
        int iHashCode2 = searchResultAll == null ? 0 : searchResultAll.hashCode();
        com.bilibili.search2.main.data.c cVar = this.userActQuery;
        int iHashCode3 = cVar == null ? 0 : cVar.hashCode();
        VerticalSearchResult<?> verticalSearchResult = this.verticalSearchResult;
        int iHashCode4 = verticalSearchResult == null ? 0 : verticalSearchResult.hashCode();
        List<SearchResultAll.NavInfo> list2 = this.nav;
        int iA = z.a(z.a(e0.a(((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.extraWords), 31, this.isFilter), 31, this.firstLoading);
        Boolean bool = this.isLoading;
        int iA2 = I.a(this.page, z.a((iA + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.isEnd), 31);
        String str = this.query;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.next;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.trackId;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        i iVar = this.fatherErrorState;
        int iHashCode8 = iVar == null ? 0 : iVar.hashCode();
        i iVar2 = this.errorState;
        int iHashCode9 = iVar2 == null ? 0 : iVar2.hashCode();
        k kVar = this.footerState;
        if (kVar == null) {
            iIdentityHashCode = 0;
        } else {
            kVar.getClass();
            iIdentityHashCode = System.identityHashCode(kVar);
        }
        Boolean bool2 = this.hasNoResultCard;
        int iA3 = I.a(this.version, z.a((((((((((((((iA2 + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iIdentityHashCode) * 31) + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, this.hasImmerseCard), 31);
        Integer num = this.forceLocateToType;
        int iA4 = z.a(I.a(this.refreshTimes, (iA3 + (num == null ? 0 : num.hashCode())) * 31, 31), 31, this.enableRefresh);
        List<C2786g> list3 = this.ogvFilterExtraWord;
        int iA5 = z.a((iA4 + (list3 == null ? 0 : list3.hashCode())) * 31, 31, this.ogvAggregateNeedOrder);
        String str4 = this.ogvAggregatePageTitle;
        int iA6 = I.a(this.alienationCardCount, z.a(z.a((iA5 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.isTeenagersMode), 31, this.enableUpdateAnimation), 31);
        C c7 = this.searchFilter;
        int iHashCode10 = c7 == null ? 0 : c7.hashCode();
        List<BaseSearchItem> list4 = this.foldedItems;
        return ((iA6 + iHashCode10) * 31) + (list4 == null ? 0 : list4.hashCode());
    }

    public final boolean isEnd() {
        return this.isEnd;
    }

    public final boolean isFilter() {
        return this.isFilter;
    }

    @Nullable
    public final Boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isTeenagersMode() {
        return this.isTeenagersMode;
    }

    public final void setExtraWords(@NotNull List<String> list) {
        this.extraWords = list;
    }

    public final void setFilter(boolean z6) {
        this.isFilter = z6;
    }

    public final void setNav(@Nullable List<SearchResultAll.NavInfo> list) {
        this.nav = list;
    }

    public final void setTrackId(@Nullable String str) {
        this.trackId = str;
    }

    @NotNull
    public String toString() {
        List<BaseSearchItem> list = this.allResultList;
        Integer numValueOf = null;
        Integer numValueOf2 = list != null ? Integer.valueOf(list.size()) : null;
        List<SearchResultAll.NavInfo> list2 = this.nav;
        if (list2 != null) {
            numValueOf = Integer.valueOf(list2.size());
        }
        List<String> list3 = this.extraWords;
        boolean z6 = this.isFilter;
        boolean z7 = this.firstLoading;
        Boolean bool = this.isLoading;
        boolean z8 = this.isEnd;
        int i7 = this.page;
        String str = this.query;
        String str2 = this.next;
        String str3 = this.trackId;
        i iVar = this.errorState;
        k kVar = this.footerState;
        boolean z9 = this.isTeenagersMode;
        StringBuilder sbB = A.b("SearchState(allResultList=", numValueOf2, ", nav=", numValueOf, ", extraWords=");
        sbB.append(list3);
        sbB.append(", isFilter=");
        sbB.append(z6);
        sbB.append(", firstLoading=");
        sbB.append(z7);
        sbB.append(", isLoading=");
        sbB.append(bool);
        sbB.append(", isEnd=");
        C3353d.b(", page=", ", query=", i7, z8, sbB);
        B.a(str, ", next=", str2, ", trackId=", sbB);
        sbB.append(str3);
        sbB.append(", errorState=");
        sbB.append(iVar);
        sbB.append(", footerState=");
        sbB.append(kVar);
        sbB.append(", isTeenagersMode=");
        sbB.append(z9);
        sbB.append(")");
        return sbB.toString();
    }
}
