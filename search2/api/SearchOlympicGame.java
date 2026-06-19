package com.bilibili.search2.api;

import Ps0.H;
import Ps0.I;
import Ps0.M;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.ExtraLink;
import com.bapis.bilibili.polymer.app.search.v1.SearchOlympicGameCard;
import com.bilibili.app.comm.list.common.api.model.PlayerArgs;
import com.bilibili.app.comm.list.common.data.InlineThreePointPanel;
import com.bilibili.app.comm.list.common.data.SharePlane;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.inline.card.IInlineBehavior;
import com.bilibili.inline.card.IInlineCardData;
import com.bilibili.inline.card.IInlinePlayItem;
import com.bilibili.inline.card.IInlineProperty;
import com.bilibili.inline.card.NoPlayInlineCardData;
import com.bilibili.inline.utils.InlineReportParam;
import com.bilibili.search2.api.BaseSearchInlineData;
import com.bilibili.search2.api.SearchSportItem;
import com.bilibili.search2.inline.TrafficConfig;
import com.bilibili.search2.result.n;
import dt0.AbstractC6841d;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchOlympicGame.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchOlympicGame extends AbstractC6841d implements n {
    public static final int $stable = 8;

    @JSONField(name = "bg_cover")
    @Nullable
    private String bgCover;

    @JSONField(name = "extra_link")
    @Nullable
    private List<OlympicReadMore> extraLink;

    @NotNull
    private final Lazy inlineData$delegate;

    @JSONField(name = "live_room_inline")
    @Nullable
    private SearchLiveInlineData inlineLive;

    @JSONField(name = "inline_type")
    @Nullable
    private String inlineType;

    @JSONField(name = "match_bottom")
    @Nullable
    private SearchSportItem.MatchJumpObj matchBottom;

    @JSONField(name = "sports_match_item")
    @Nullable
    private OlympicMatchItem matchItem;

    @JSONField(name = "match_top")
    @Nullable
    private OlympicReadMore matchTop;

    @JSONField(name = "ugc_inline")
    @Nullable
    private UgcInline ugcInline;

    public SearchOlympicGame() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    public SearchOlympicGame(@NotNull SearchOlympicGameCard searchOlympicGameCard) {
        Sequence sequenceAsSequence;
        Sequence map;
        this(null, null, null, null, null, null, null, null, 255, null);
        if (searchOlympicGameCard.hasSportsMatchItem()) {
            this.matchItem = new OlympicMatchItem(searchOlympicGameCard.getSportsMatchItem());
        }
        this.bgCover = searchOlympicGameCard.getBgCover();
        List extraLinkList = searchOlympicGameCard.getExtraLinkList();
        this.extraLink = (extraLinkList == null || (sequenceAsSequence = CollectionsKt.asSequence(extraLinkList)) == null || (map = SequencesKt.map(sequenceAsSequence, (Function1) new Object())) == null) ? null : SequencesKt.toList(map);
        this.inlineType = searchOlympicGameCard.getInlineType();
        if (searchOlympicGameCard.hasUgcInline()) {
            this.ugcInline = new UgcInline(searchOlympicGameCard.getUgcInline());
        }
        if (searchOlympicGameCard.hasLiveRoomInline()) {
            this.inlineLive = new SearchLiveInlineData(searchOlympicGameCard.getLiveRoomInline());
        }
        if (searchOlympicGameCard.hasMatchBottom()) {
            this.matchBottom = new SearchSportItem.MatchJumpObj(searchOlympicGameCard.getMatchBottom());
        }
        if (searchOlympicGameCard.hasMatchTop()) {
            this.matchTop = new OlympicReadMore(searchOlympicGameCard.getMatchTop());
        }
        setTitle(searchOlympicGameCard.getTitle());
        setCover(searchOlympicGameCard.getCover());
    }

    public SearchOlympicGame(@Nullable OlympicMatchItem olympicMatchItem, @Nullable OlympicReadMore olympicReadMore, @Nullable String str, @Nullable List<OlympicReadMore> list, @Nullable String str2, @Nullable UgcInline ugcInline, @Nullable SearchLiveInlineData searchLiveInlineData, @Nullable SearchSportItem.MatchJumpObj matchJumpObj) {
        this.matchItem = olympicMatchItem;
        this.matchTop = olympicReadMore;
        this.bgCover = str;
        this.extraLink = list;
        this.inlineType = str2;
        this.ugcInline = ugcInline;
        this.inlineLive = searchLiveInlineData;
        this.matchBottom = matchJumpObj;
        this.inlineData$delegate = ListExtentionsKt.lazyUnsafe(new M(this, 0));
    }

    public /* synthetic */ SearchOlympicGame(OlympicMatchItem olympicMatchItem, OlympicReadMore olympicReadMore, String str, List list, String str2, UgcInline ugcInline, SearchLiveInlineData searchLiveInlineData, SearchSportItem.MatchJumpObj matchJumpObj, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : olympicMatchItem, (i7 & 2) != 0 ? null : olympicReadMore, (i7 & 4) != 0 ? null : str, (i7 & 8) != 0 ? null : list, (i7 & 16) != 0 ? null : str2, (i7 & 32) != 0 ? null : ugcInline, (i7 & 64) != 0 ? null : searchLiveInlineData, (i7 & 128) != 0 ? null : matchJumpObj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OlympicReadMore _init_$lambda$0(ExtraLink extraLink) {
        return new OlympicReadMore(extraLink.getText(), extraLink.getUri(), false, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchOlympicGame copy$default(SearchOlympicGame searchOlympicGame, OlympicMatchItem olympicMatchItem, OlympicReadMore olympicReadMore, String str, List list, String str2, UgcInline ugcInline, SearchLiveInlineData searchLiveInlineData, SearchSportItem.MatchJumpObj matchJumpObj, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            olympicMatchItem = searchOlympicGame.matchItem;
        }
        if ((i7 & 2) != 0) {
            olympicReadMore = searchOlympicGame.matchTop;
        }
        if ((i7 & 4) != 0) {
            str = searchOlympicGame.bgCover;
        }
        if ((i7 & 8) != 0) {
            list = searchOlympicGame.extraLink;
        }
        if ((i7 & 16) != 0) {
            str2 = searchOlympicGame.inlineType;
        }
        if ((i7 & 32) != 0) {
            ugcInline = searchOlympicGame.ugcInline;
        }
        if ((i7 & 64) != 0) {
            searchLiveInlineData = searchOlympicGame.inlineLive;
        }
        if ((i7 & 128) != 0) {
            matchJumpObj = searchOlympicGame.matchBottom;
        }
        return searchOlympicGame.copy(olympicMatchItem, olympicReadMore, str, list, str2, ugcInline, searchLiveInlineData, matchJumpObj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IInlineCardData inlineData_delegate$lambda$0(SearchOlympicGame searchOlympicGame) {
        IInlineCardData h;
        if (!searchOlympicGame.getHasInline()) {
            return new NoPlayInlineCardData();
        }
        if (searchOlympicGame.isVideoInline()) {
            h = new I(searchOlympicGame.ugcInline, searchOlympicGame.getTrackId());
        } else {
            SearchLiveInlineData searchLiveInlineData = searchOlympicGame.inlineLive;
            String goTo = searchOlympicGame.getGoTo();
            String str = goTo;
            if (goTo == null) {
                str = "";
            }
            h = new H(searchLiveInlineData, str);
        }
        return h;
    }

    @Nullable
    public final OlympicMatchItem component1() {
        return this.matchItem;
    }

    @Nullable
    public final OlympicReadMore component2() {
        return this.matchTop;
    }

    @Nullable
    public final String component3() {
        return this.bgCover;
    }

    @Nullable
    public final List<OlympicReadMore> component4() {
        return this.extraLink;
    }

    @Nullable
    public final String component5() {
        return this.inlineType;
    }

    @Nullable
    public final UgcInline component6() {
        return this.ugcInline;
    }

    @Nullable
    public final SearchLiveInlineData component7() {
        return this.inlineLive;
    }

    @Nullable
    public final SearchSportItem.MatchJumpObj component8() {
        return this.matchBottom;
    }

    @NotNull
    public final SearchOlympicGame copy(@Nullable OlympicMatchItem olympicMatchItem, @Nullable OlympicReadMore olympicReadMore, @Nullable String str, @Nullable List<OlympicReadMore> list, @Nullable String str2, @Nullable UgcInline ugcInline, @Nullable SearchLiveInlineData searchLiveInlineData, @Nullable SearchSportItem.MatchJumpObj matchJumpObj) {
        return new SearchOlympicGame(olympicMatchItem, olympicReadMore, str, list, str2, ugcInline, searchLiveInlineData, matchJumpObj);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchOlympicGame)) {
            return false;
        }
        SearchOlympicGame searchOlympicGame = (SearchOlympicGame) obj;
        return Intrinsics.areEqual(this.matchItem, searchOlympicGame.matchItem) && Intrinsics.areEqual(this.matchTop, searchOlympicGame.matchTop) && Intrinsics.areEqual(this.bgCover, searchOlympicGame.bgCover) && Intrinsics.areEqual(this.extraLink, searchOlympicGame.extraLink) && Intrinsics.areEqual(this.inlineType, searchOlympicGame.inlineType) && Intrinsics.areEqual(this.ugcInline, searchOlympicGame.ugcInline) && Intrinsics.areEqual(this.inlineLive, searchOlympicGame.inlineLive) && Intrinsics.areEqual(this.matchBottom, searchOlympicGame.matchBottom);
    }

    @Override // dt0.InterfaceC6845h, com.bilibili.search2.result.n
    public long getAvId() {
        PlayerArgs playerArgs;
        UgcInline ugcInline = this.ugcInline;
        return (ugcInline == null || (playerArgs = ugcInline.getPlayerArgs()) == null) ? 0L : playerArgs.aid;
    }

    @Nullable
    public final String getBgCover() {
        return this.bgCover;
    }

    @Override // dt0.InterfaceC6845h
    public long getCId() {
        PlayerArgs playerArgs;
        UgcInline ugcInline = this.ugcInline;
        return (ugcInline == null || (playerArgs = ugcInline.getPlayerArgs()) == null) ? 0L : playerArgs.cid;
    }

    @NotNull
    public IInlineProperty getCardPlayProperty() {
        return getInlineData().getCardPlayProperty();
    }

    public /* bridge */ /* synthetic */ long getEpId() {
        return 0L;
    }

    @Nullable
    public final List<OlympicReadMore> getExtraLink() {
        return this.extraLink;
    }

    @Override // dt0.AbstractC6841d
    @Nullable
    public String getExtraUri() {
        String extraUri = null;
        if (!getHasInline()) {
            return null;
        }
        if (isVideoInline()) {
            UgcInline ugcInline = this.ugcInline;
            if (ugcInline != null) {
                extraUri = ugcInline.getExtraUri();
            }
        } else {
            SearchLiveInlineData searchLiveInlineData = this.inlineLive;
            if (searchLiveInlineData != null) {
                extraUri = searchLiveInlineData.getExtraUri();
            }
        }
        return extraUri;
    }

    @JSONField(deserialize = false, serialize = false)
    public final boolean getHasInline() {
        return (Intrinsics.areEqual(this.inlineType, "ugc_inline") && this.ugcInline != null) || (Intrinsics.areEqual(this.inlineType, "live_room_inline") && this.inlineLive != null);
    }

    @NotNull
    public IInlineBehavior getInlineBehavior() {
        return getInlineData().getInlineBehavior();
    }

    @NotNull
    public final IInlineCardData getInlineData() {
        return (IInlineCardData) this.inlineData$delegate.getValue();
    }

    @Nullable
    public final SearchLiveInlineData getInlineLive() {
        return this.inlineLive;
    }

    @NotNull
    public IInlinePlayItem getInlinePlayerItem() {
        return getInlineData().getInlinePlayerItem();
    }

    @Nullable
    public InlineReportParam getInlineReportParams() {
        return getInlineData().getInlineReportParams();
    }

    @Nullable
    public final String getInlineType() {
        return this.inlineType;
    }

    @Nullable
    public final SearchSportItem.MatchJumpObj getMatchBottom() {
        return this.matchBottom;
    }

    @Nullable
    public final OlympicMatchItem getMatchItem() {
        return this.matchItem;
    }

    @Nullable
    public final OlympicReadMore getMatchTop() {
        return this.matchTop;
    }

    @Override // dt0.InterfaceC6845h
    public /* bridge */ /* synthetic */ int getOgvSubType() {
        return 0;
    }

    @Override // dt0.InterfaceC6845h
    public long getOid() {
        return isVideoInline() ? getAvId() : getRoomId();
    }

    @Override // dt0.AbstractC6841d
    @Nullable
    public PlayerArgs getPlayerArgs() {
        PlayerArgs playerArgs = null;
        if (!getHasInline()) {
            return null;
        }
        if (isVideoInline()) {
            UgcInline ugcInline = this.ugcInline;
            if (ugcInline != null) {
                playerArgs = ugcInline.getPlayerArgs();
            }
        } else {
            SearchLiveInlineData searchLiveInlineData = this.inlineLive;
            if (searchLiveInlineData != null) {
                playerArgs = searchLiveInlineData.getPlayerArgs();
            }
        }
        return playerArgs;
    }

    public long getRoomId() {
        PlayerArgs playerArgs = getPlayerArgs();
        return playerArgs != null ? playerArgs.roomId : 0L;
    }

    public /* bridge */ /* synthetic */ long getSeasonId() {
        return 0L;
    }

    @Override // dt0.InterfaceC6845h
    public int getShareBusiness() {
        return isVideoInline() ? 1 : 3;
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public /* bridge */ /* synthetic */ String getShareFrom() {
        return super.getShareFrom();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0012  */
    @Override // dt0.InterfaceC6845h
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getShareId() {
        /*
            r2 = this;
            r0 = r2
            java.lang.String r0 = super.getShareId()
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L12
            r0 = r4
            r3 = r0
            r0 = r4
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L31
        L12:
            r0 = r2
            boolean r0 = r0.getHasInline()
            if (r0 == 0) goto L2e
            r0 = r2
            boolean r0 = r0.isVideoInline()
            if (r0 == 0) goto L27
            java.lang.String r0 = "search.search-result.ugc.0"
            r3 = r0
            goto L31
        L27:
            java.lang.String r0 = "search.search-result.live.0"
            r3 = r0
            goto L31
        L2e:
            java.lang.String r0 = ""
            r3 = r0
        L31:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.api.SearchOlympicGame.getShareId():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0012  */
    @Override // dt0.InterfaceC6845h
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getShareOrigin() {
        /*
            r2 = this;
            r0 = r2
            java.lang.String r0 = super.getShareOrigin()
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L12
            r0 = r4
            r3 = r0
            r0 = r4
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L23
        L12:
            r0 = r2
            boolean r0 = r0.getHasInline()
            if (r0 == 0) goto L20
            java.lang.String r0 = "search_inline"
            r3 = r0
            goto L23
        L20:
            java.lang.String r0 = ""
            r3 = r0
        L23:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.api.SearchOlympicGame.getShareOrigin():java.lang.String");
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public SharePlane getSharePanel() {
        SharePlane sharePlane = null;
        if (!getHasInline()) {
            return null;
        }
        if (isVideoInline()) {
            UgcInline ugcInline = this.ugcInline;
            if (ugcInline != null) {
                sharePlane = ugcInline.getSharePlane();
            }
        } else {
            SearchLiveInlineData searchLiveInlineData = this.inlineLive;
            if (searchLiveInlineData != null) {
                sharePlane = searchLiveInlineData.getSharePlane();
            }
        }
        return sharePlane;
    }

    @Nullable
    public /* bridge */ /* synthetic */ String getShareSpmid() {
        return "search.search-result.0.0";
    }

    @Override // dt0.InterfaceC6845h
    public int getShareType() {
        return !isVideoInline() ? 1 : 0;
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public String getSid() {
        PlayerArgs playerArgs;
        UgcInline ugcInline = this.ugcInline;
        return (ugcInline == null || (playerArgs = ugcInline.getPlayerArgs()) == null) ? null : String.valueOf(playerArgs.cid);
    }

    @Override // dt0.AbstractC6841d
    @Nullable
    public String getTargetUri() {
        String uri = null;
        if (!getHasInline()) {
            return null;
        }
        if (isVideoInline()) {
            UgcInline ugcInline = this.ugcInline;
            if (ugcInline != null) {
                uri = ugcInline.getUri();
            }
        } else {
            SearchLiveInlineData searchLiveInlineData = this.inlineLive;
            if (searchLiveInlineData != null) {
                uri = searchLiveInlineData.getUri();
            }
        }
        return uri;
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public InlineThreePointPanel getThreePointMeta() {
        InlineThreePointPanel threePointMeta = null;
        if (!getHasInline()) {
            return null;
        }
        if (isVideoInline()) {
            UgcInline ugcInline = this.ugcInline;
            if (ugcInline != null) {
                threePointMeta = ugcInline.getThreePointMeta();
            }
        } else {
            SearchLiveInlineData searchLiveInlineData = this.inlineLive;
            if (searchLiveInlineData != null) {
                threePointMeta = searchLiveInlineData.getThreePointMeta();
            }
        }
        return threePointMeta;
    }

    @Override // dt0.AbstractC6841d
    @Nullable
    public TrafficConfig getTrafficConfig() {
        TrafficConfig trafficConfig = null;
        if (!getHasInline()) {
            return null;
        }
        if (isVideoInline()) {
            UgcInline ugcInline = this.ugcInline;
            if (ugcInline != null) {
                trafficConfig = ugcInline.getTrafficConfig();
            }
        } else {
            SearchLiveInlineData searchLiveInlineData = this.inlineLive;
            if (searchLiveInlineData != null) {
                trafficConfig = searchLiveInlineData.getTrafficConfig();
            }
        }
        return trafficConfig;
    }

    @Nullable
    public final UgcInline getUgcInline() {
        return this.ugcInline;
    }

    @Override // com.bilibili.search2.result.k
    public long getUpMid() {
        long upId;
        if (!getHasInline()) {
            return 0L;
        }
        if (isVideoInline()) {
            UgcInline ugcInline = this.ugcInline;
            upId = 0;
            if (ugcInline != null) {
                BaseSearchInlineData.UpArgs upArgs = ugcInline.getUpArgs();
                upId = 0;
                if (upArgs != null) {
                    upId = upArgs.getUpId();
                }
            }
        } else {
            SearchLiveInlineData searchLiveInlineData = this.inlineLive;
            upId = 0;
            if (searchLiveInlineData != null) {
                BaseSearchInlineData.UpArgs upArgs2 = searchLiveInlineData.getUpArgs();
                upId = 0;
                if (upArgs2 != null) {
                    upId = upArgs2.getUpId();
                }
            }
        }
        return upId;
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public /* bridge */ /* synthetic */ String getUpName() {
        return null;
    }

    public int hashCode() {
        OlympicMatchItem olympicMatchItem = this.matchItem;
        int iHashCode = 0;
        int iHashCode2 = olympicMatchItem == null ? 0 : olympicMatchItem.hashCode();
        OlympicReadMore olympicReadMore = this.matchTop;
        int iHashCode3 = olympicReadMore == null ? 0 : olympicReadMore.hashCode();
        String str = this.bgCover;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        List<OlympicReadMore> list = this.extraLink;
        int iHashCode5 = list == null ? 0 : list.hashCode();
        String str2 = this.inlineType;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        UgcInline ugcInline = this.ugcInline;
        int iHashCode7 = ugcInline == null ? 0 : ugcInline.hashCode();
        SearchLiveInlineData searchLiveInlineData = this.inlineLive;
        int iHashCode8 = searchLiveInlineData == null ? 0 : searchLiveInlineData.hashCode();
        SearchSportItem.MatchJumpObj matchJumpObj = this.matchBottom;
        if (matchJumpObj != null) {
            iHashCode = matchJumpObj.hashCode();
        }
        return (((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode;
    }

    @Override // dt0.InterfaceC6845h
    public boolean isFavorite() {
        UgcInline ugcInline = this.ugcInline;
        return ugcInline != null ? ugcInline.isFavorite() : false;
    }

    @Override // dt0.InterfaceC6845h
    public /* bridge */ /* synthetic */ boolean isHot() {
        return false;
    }

    @JSONField(deserialize = false, serialize = false)
    public final boolean isVideoInline() {
        return getHasInline() && Intrinsics.areEqual(this.inlineType, "ugc_inline");
    }

    public final void setBgCover(@Nullable String str) {
        this.bgCover = str;
    }

    @Override // com.bilibili.search2.result.n
    public /* bridge */ /* synthetic */ void setCoined(boolean z6) {
    }

    public final void setExtraLink(@Nullable List<OlympicReadMore> list) {
        this.extraLink = list;
    }

    @Override // dt0.InterfaceC6845h
    public void setFavorite(boolean z6) {
        UgcInline ugcInline = this.ugcInline;
        if (ugcInline != null) {
            ugcInline.setFavorite(z6);
        }
    }

    public final void setInlineLive(@Nullable SearchLiveInlineData searchLiveInlineData) {
        this.inlineLive = searchLiveInlineData;
    }

    public final void setInlineType(@Nullable String str) {
        this.inlineType = str;
    }

    @Override // com.bilibili.search2.result.n
    public void setIsFav(boolean z6) {
        UgcInline ugcInline = this.ugcInline;
        if (ugcInline != null) {
            ugcInline.setFavorite(z6);
        }
    }

    @Override // com.bilibili.search2.result.k
    public void setIsFollow(boolean z6) {
    }

    @Override // com.bilibili.search2.result.n
    public void setIsLike(boolean z6) {
    }

    @Override // com.bilibili.search2.result.n
    public void setLikeCount(long j7) {
    }

    public final void setMatchBottom(@Nullable SearchSportItem.MatchJumpObj matchJumpObj) {
        this.matchBottom = matchJumpObj;
    }

    public final void setMatchItem(@Nullable OlympicMatchItem olympicMatchItem) {
        this.matchItem = olympicMatchItem;
    }

    public final void setMatchTop(@Nullable OlympicReadMore olympicReadMore) {
        this.matchTop = olympicReadMore;
    }

    public final void setUgcInline(@Nullable UgcInline ugcInline) {
        this.ugcInline = ugcInline;
    }

    @NotNull
    public String toString() {
        OlympicMatchItem olympicMatchItem = this.matchItem;
        OlympicReadMore olympicReadMore = this.matchTop;
        String str = this.bgCover;
        List<OlympicReadMore> list = this.extraLink;
        String str2 = this.inlineType;
        UgcInline ugcInline = this.ugcInline;
        SearchLiveInlineData searchLiveInlineData = this.inlineLive;
        SearchSportItem.MatchJumpObj matchJumpObj = this.matchBottom;
        StringBuilder sb = new StringBuilder("SearchOlympicGame(matchItem=");
        sb.append(olympicMatchItem);
        sb.append(", matchTop=");
        sb.append(olympicReadMore);
        sb.append(", bgCover=");
        M6.f.a(str, ", extraLink=", ", inlineType=", sb, list);
        sb.append(str2);
        sb.append(", ugcInline=");
        sb.append(ugcInline);
        sb.append(", inlineLive=");
        sb.append(searchLiveInlineData);
        sb.append(", matchBottom=");
        sb.append(matchJumpObj);
        sb.append(")");
        return sb.toString();
    }
}
