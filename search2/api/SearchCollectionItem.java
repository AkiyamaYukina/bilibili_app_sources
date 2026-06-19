package com.bilibili.search2.api;

import HH.o;
import HH.p;
import J81.K;
import Ps0.I;
import androidx.annotation.Keep;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.B;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.SearchPlayListCard;
import com.bapis.bilibili.polymer.app.search.v1.SearchSeriesCard;
import com.bilibili.app.comm.list.common.api.model.PlayerArgs;
import com.bilibili.app.comm.list.common.data.InlineThreePointPanel;
import com.bilibili.app.comm.list.common.data.SharePlane;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.inline.biz.card.IVideoInfoItem;
import com.bilibili.inline.card.IInlineBehavior;
import com.bilibili.inline.card.IInlineCardData;
import com.bilibili.inline.card.IInlinePlayItem;
import com.bilibili.inline.card.IInlineProperty;
import com.bilibili.inline.card.NoPlayInlineCardData;
import com.bilibili.inline.utils.InlineReportParam;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.inline.Avatar;
import dt0.AbstractC6841d;
import dt0.InterfaceC6844g;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchCollectionItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchCollectionItem extends AbstractC6841d implements IInlineCardData, IVideoInfoItem, InterfaceC6844g {
    public static final int $stable = 8;

    @JSONField(name = "av_items")
    @Nullable
    private List<AvItem> avItems;

    @JSONField(name = "bottom_button")
    @Nullable
    private BottomButton bottomButton;
    private final boolean hideTitle;

    @Nullable
    private Integer includeIaaVideo;

    @NotNull
    private final Lazy inlineData$delegate;

    @JSONField(name = "show_card_desc_1")
    @Nullable
    private String showDesc1;

    @JSONField(name = "show_card_desc_2")
    @Nullable
    private String showDesc2;

    @Nullable
    private UgcInline ugcInline;

    public SearchCollectionItem() {
        this(null, null, null, null, null, false, null, SearchBangumiItem.TYPE_FULLNET_BANGUMI, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SearchCollectionItem(@org.jetbrains.annotations.NotNull com.bapis.bilibili.polymer.app.search.v1.SearchCollectionCard r12, @org.jetbrains.annotations.Nullable java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.api.SearchCollectionItem.<init>(com.bapis.bilibili.polymer.app.search.v1.SearchCollectionCard, java.lang.String):void");
    }

    public SearchCollectionItem(@NotNull SearchPlayListCard searchPlayListCard, @Nullable String str) {
        Sequence sequenceAsSequence;
        Sequence map;
        this(null, null, null, null, null, searchPlayListCard.getIsHideTitle() != 1 ? false : true, null, 95, null);
        List avItemsList = searchPlayListCard.getAvItemsList();
        this.avItems = (avItemsList == null || (sequenceAsSequence = CollectionsKt.asSequence(avItemsList)) == null || (map = SequencesKt.map(sequenceAsSequence, new o(str, 1))) == null) ? null : SequencesKt.toList(map);
        if (searchPlayListCard.hasBottomButton()) {
            this.bottomButton = new BottomButton(searchPlayListCard.getBottomButton());
        }
        this.showDesc1 = searchPlayListCard.getShowCardDesc1();
        this.showDesc2 = searchPlayListCard.getShowCardDesc2();
        setTitle(searchPlayListCard.getTitle());
        if (searchPlayListCard.hasFeedback()) {
            setFeedback(new BaseSearchItem.Feedback(searchPlayListCard.getFeedback()));
        }
        if (searchPlayListCard.hasInlineData()) {
            this.ugcInline = new UgcInline(searchPlayListCard.getInlineData());
        }
    }

    public SearchCollectionItem(@NotNull SearchSeriesCard searchSeriesCard, @Nullable String str) {
        Sequence sequenceAsSequence;
        Sequence map;
        this(null, null, null, null, null, searchSeriesCard.getIsHideTitle() != 1 ? false : true, null, 95, null);
        List avItemsList = searchSeriesCard.getAvItemsList();
        this.avItems = (avItemsList == null || (sequenceAsSequence = CollectionsKt.asSequence(avItemsList)) == null || (map = SequencesKt.map(sequenceAsSequence, new p(str, 1))) == null) ? null : SequencesKt.toList(map);
        if (searchSeriesCard.hasBottomButton()) {
            this.bottomButton = new BottomButton(searchSeriesCard.getBottomButton());
        }
        this.showDesc1 = searchSeriesCard.getShowCardDesc1();
        this.showDesc2 = searchSeriesCard.getShowCardDesc2();
        setTitle(searchSeriesCard.getTitle());
        if (searchSeriesCard.hasFeedback()) {
            setFeedback(new BaseSearchItem.Feedback(searchSeriesCard.getFeedback()));
        }
        if (searchSeriesCard.hasInlineData()) {
            this.ugcInline = new UgcInline(searchSeriesCard.getInlineData());
        }
    }

    public SearchCollectionItem(@Nullable List<AvItem> list, @Nullable BottomButton bottomButton, @Nullable String str, @Nullable String str2, @Nullable UgcInline ugcInline, boolean z6, @Nullable Integer num) {
        this.avItems = list;
        this.bottomButton = bottomButton;
        this.showDesc1 = str;
        this.showDesc2 = str2;
        this.ugcInline = ugcInline;
        this.hideTitle = z6;
        this.includeIaaVideo = num;
        this.inlineData$delegate = ListExtentionsKt.lazyUnsafe(new K(this, 1));
    }

    public /* synthetic */ SearchCollectionItem(List list, BottomButton bottomButton, String str, String str2, UgcInline ugcInline, boolean z6, Integer num, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : list, (i7 & 2) != 0 ? null : bottomButton, (i7 & 4) != 0 ? null : str, (i7 & 8) != 0 ? null : str2, (i7 & 16) != 0 ? null : ugcInline, (i7 & 32) != 0 ? false : z6, (i7 & 64) != 0 ? null : num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AvItem _init_$lambda$0(String str, com.bapis.bilibili.polymer.app.search.v1.AvItem avItem) {
        return new AvItem(avItem, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AvItem _init_$lambda$1(String str, com.bapis.bilibili.polymer.app.search.v1.AvItem avItem) {
        return new AvItem(avItem, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AvItem _init_$lambda$2(String str, com.bapis.bilibili.polymer.app.search.v1.AvItem avItem) {
        return new AvItem(avItem, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchCollectionItem copy$default(SearchCollectionItem searchCollectionItem, List list, BottomButton bottomButton, String str, String str2, UgcInline ugcInline, boolean z6, Integer num, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = searchCollectionItem.avItems;
        }
        if ((i7 & 2) != 0) {
            bottomButton = searchCollectionItem.bottomButton;
        }
        if ((i7 & 4) != 0) {
            str = searchCollectionItem.showDesc1;
        }
        if ((i7 & 8) != 0) {
            str2 = searchCollectionItem.showDesc2;
        }
        if ((i7 & 16) != 0) {
            ugcInline = searchCollectionItem.ugcInline;
        }
        if ((i7 & 32) != 0) {
            z6 = searchCollectionItem.hideTitle;
        }
        if ((i7 & 64) != 0) {
            num = searchCollectionItem.includeIaaVideo;
        }
        return searchCollectionItem.copy(list, bottomButton, str, str2, ugcInline, z6, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IInlineCardData inlineData_delegate$lambda$0(SearchCollectionItem searchCollectionItem) {
        return !searchCollectionItem.getHasInline() ? new NoPlayInlineCardData() : new I(searchCollectionItem.ugcInline, searchCollectionItem.getTrackId(), "SearchCollectionInline");
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public void afterInit() {
        super.afterInit();
        List<AvItem> list = this.avItems;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((AvItem) it.next()).cloneFatherParam(this);
            }
        }
    }

    @Nullable
    public final List<AvItem> component1() {
        return this.avItems;
    }

    @Nullable
    public final BottomButton component2() {
        return this.bottomButton;
    }

    @Nullable
    public final String component3() {
        return this.showDesc1;
    }

    @Nullable
    public final String component4() {
        return this.showDesc2;
    }

    @Nullable
    public final UgcInline component5() {
        return this.ugcInline;
    }

    public final boolean component6() {
        return this.hideTitle;
    }

    @Nullable
    public final Integer component7() {
        return this.includeIaaVideo;
    }

    @NotNull
    public final SearchCollectionItem copy(@Nullable List<AvItem> list, @Nullable BottomButton bottomButton, @Nullable String str, @Nullable String str2, @Nullable UgcInline ugcInline, boolean z6, @Nullable Integer num) {
        return new SearchCollectionItem(list, bottomButton, str, str2, ugcInline, z6, num);
    }

    @Override // dt0.InterfaceC6844g
    public void deliverLocalPagePos(int i7) {
        List<AvItem> list = this.avItems;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((AvItem) it.next()).setLocalPagePos(i7);
            }
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchCollectionItem)) {
            return false;
        }
        SearchCollectionItem searchCollectionItem = (SearchCollectionItem) obj;
        return Intrinsics.areEqual(this.avItems, searchCollectionItem.avItems) && Intrinsics.areEqual(this.bottomButton, searchCollectionItem.bottomButton) && Intrinsics.areEqual(this.showDesc1, searchCollectionItem.showDesc1) && Intrinsics.areEqual(this.showDesc2, searchCollectionItem.showDesc2) && Intrinsics.areEqual(this.ugcInline, searchCollectionItem.ugcInline) && this.hideTitle == searchCollectionItem.hideTitle && Intrinsics.areEqual(this.includeIaaVideo, searchCollectionItem.includeIaaVideo);
    }

    public long getAid() {
        long aid;
        PlayerArgs playerArgs;
        SearchLikeButtonItem likeButton;
        UgcInline ugcInline = this.ugcInline;
        if (ugcInline == null || (likeButton = ugcInline.getLikeButton()) == null) {
            UgcInline ugcInline2 = this.ugcInline;
            aid = (ugcInline2 == null || (playerArgs = ugcInline2.getPlayerArgs()) == null) ? 0L : playerArgs.aid;
        } else {
            aid = likeButton.getAid();
        }
        return aid;
    }

    @Override // dt0.InterfaceC6845h, com.bilibili.search2.result.n
    public /* bridge */ /* synthetic */ long getAvId() {
        return 0L;
    }

    @Nullable
    public final List<AvItem> getAvItems() {
        return this.avItems;
    }

    @Nullable
    public final BottomButton getBottomButton() {
        return this.bottomButton;
    }

    @Override // dt0.InterfaceC6845h
    public /* bridge */ /* synthetic */ long getCId() {
        return 0L;
    }

    @NotNull
    public IInlineProperty getCardPlayProperty() {
        return getInlineData().getCardPlayProperty();
    }

    public /* bridge */ /* synthetic */ long getEpId() {
        return 0L;
    }

    @JSONField(deserialize = false, serialize = false)
    public final boolean getHasInline() {
        return this.ugcInline != null;
    }

    public final boolean getHideTitle() {
        return this.hideTitle;
    }

    @Nullable
    public final Integer getIncludeIaaVideo() {
        return this.includeIaaVideo;
    }

    @NotNull
    public IInlineBehavior getInlineBehavior() {
        return getInlineData().getInlineBehavior();
    }

    @NotNull
    public final IInlineCardData getInlineData() {
        return (IInlineCardData) this.inlineData$delegate.getValue();
    }

    @NotNull
    public IInlinePlayItem getInlinePlayerItem() {
        return getInlineData().getInlinePlayerItem();
    }

    @Nullable
    public InlineReportParam getInlineReportParams() {
        return getInlineData().getInlineReportParams();
    }

    @Override // dt0.InterfaceC6845h
    public /* bridge */ /* synthetic */ int getOgvSubType() {
        return 0;
    }

    @Override // dt0.InterfaceC6845h
    public /* bridge */ /* synthetic */ long getOid() {
        return 0L;
    }

    @Override // dt0.AbstractC6841d
    @Nullable
    public PlayerArgs getPlayerArgs() {
        UgcInline ugcInline = this.ugcInline;
        return ugcInline != null ? ugcInline.getPlayerArgs() : null;
    }

    public /* bridge */ /* synthetic */ long getRoomId() {
        return 0L;
    }

    public /* bridge */ /* synthetic */ long getSeasonId() {
        return 0L;
    }

    @Override // dt0.InterfaceC6845h
    public /* bridge */ /* synthetic */ int getShareBusiness() {
        return 1;
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public /* bridge */ /* synthetic */ String getShareFrom() {
        return super.getShareFrom();
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public /* bridge */ /* synthetic */ String getShareId() {
        return super.getShareId();
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public /* bridge */ /* synthetic */ String getShareOrigin() {
        return super.getShareOrigin();
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public /* bridge */ /* synthetic */ SharePlane getSharePanel() {
        return null;
    }

    @Nullable
    public /* bridge */ /* synthetic */ String getShareSpmid() {
        return "search.search-result.0.0";
    }

    @Override // dt0.InterfaceC6845h
    public /* bridge */ /* synthetic */ int getShareType() {
        return 0;
    }

    @Nullable
    public final String getShowDesc1() {
        return this.showDesc1;
    }

    @Nullable
    public final String getShowDesc2() {
        return this.showDesc2;
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public /* bridge */ /* synthetic */ String getSid() {
        return null;
    }

    @Override // dt0.AbstractC6841d
    @Nullable
    public String getTargetUri() {
        UgcInline ugcInline = this.ugcInline;
        return ugcInline != null ? ugcInline.getUri() : null;
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public /* bridge */ /* synthetic */ InlineThreePointPanel getThreePointMeta() {
        return null;
    }

    @Nullable
    public final UgcInline getUgcInline() {
        return this.ugcInline;
    }

    @Override // com.bilibili.search2.result.k
    public long getUpMid() {
        Avatar avatar;
        if (!getHasInline()) {
            return -1L;
        }
        UgcInline ugcInline = this.ugcInline;
        return (ugcInline == null || (avatar = ugcInline.getAvatar()) == null) ? 0L : avatar.getUpId();
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public /* bridge */ /* synthetic */ String getUpName() {
        return null;
    }

    public int hashCode() {
        List<AvItem> list = this.avItems;
        int iHashCode = list == null ? 0 : list.hashCode();
        BottomButton bottomButton = this.bottomButton;
        int iHashCode2 = bottomButton == null ? 0 : bottomButton.hashCode();
        String str = this.showDesc1;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.showDesc2;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        UgcInline ugcInline = this.ugcInline;
        int iA = z.a(((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (ugcInline == null ? 0 : ugcInline.hashCode())) * 31, 31, this.hideTitle);
        Integer num = this.includeIaaVideo;
        return iA + (num == null ? 0 : num.hashCode());
    }

    @Override // dt0.InterfaceC6845h
    public /* bridge */ /* synthetic */ boolean isFavorite() {
        return false;
    }

    @Override // dt0.InterfaceC6845h
    public /* bridge */ /* synthetic */ boolean isHot() {
        return false;
    }

    public final void setAvItems(@Nullable List<AvItem> list) {
        this.avItems = list;
    }

    public final void setBottomButton(@Nullable BottomButton bottomButton) {
        this.bottomButton = bottomButton;
    }

    @Override // dt0.InterfaceC6845h
    public /* bridge */ /* synthetic */ void setFavorite(boolean z6) {
    }

    public final void setIncludeIaaVideo(@Nullable Integer num) {
        this.includeIaaVideo = num;
    }

    @Override // com.bilibili.search2.result.k
    public void setIsFollow(boolean z6) {
        UgcInline ugcInline = this.ugcInline;
        if (ugcInline != null) {
            ugcInline.setAtten(z6);
        }
    }

    public final void setShowDesc1(@Nullable String str) {
        this.showDesc1 = str;
    }

    public final void setShowDesc2(@Nullable String str) {
        this.showDesc2 = str;
    }

    public final void setUgcInline(@Nullable UgcInline ugcInline) {
        this.ugcInline = ugcInline;
    }

    @NotNull
    public String toString() {
        List<AvItem> list = this.avItems;
        BottomButton bottomButton = this.bottomButton;
        String str = this.showDesc1;
        String str2 = this.showDesc2;
        UgcInline ugcInline = this.ugcInline;
        boolean z6 = this.hideTitle;
        Integer num = this.includeIaaVideo;
        StringBuilder sb = new StringBuilder("SearchCollectionItem(avItems=");
        sb.append(list);
        sb.append(", bottomButton=");
        sb.append(bottomButton);
        sb.append(", showDesc1=");
        B.a(str, ", showDesc2=", str2, ", ugcInline=", sb);
        sb.append(ugcInline);
        sb.append(", hideTitle=");
        sb.append(z6);
        sb.append(", includeIaaVideo=");
        return e4.c.a(sb, num, ")");
    }
}
