package com.bilibili.search2.api;

import Ps0.G;
import Ps0.I;
import Ps0.U;
import androidx.annotation.ColorInt;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.z;
import androidx.room.B;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.SearchTopGameCard;
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
import com.bilibili.search2.inline.InlineLive;
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
import yt0.C9096i;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchTopGame.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchTopGame extends AbstractC6841d implements G, n {
    public static final int $stable = 8;

    @JSONField(name = "array")
    @Nullable
    private Integer array;

    @JSONField(name = "background_image")
    @Nullable
    private String backgroundImage;

    @JSONField(name = "button_type")
    @Nullable
    private Integer buttonType;

    @JSONField(name = "game_icon")
    @Nullable
    private String gameIcon;

    @JSONField(name = "game_base_id")
    @Nullable
    private Long gameId;

    @JSONField(name = "game_status")
    @Nullable
    private Integer gameStatus;

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    @JSONField(name = "goto")
    @Nullable
    private String f37goto;

    @NotNull
    private final Lazy inlineData$delegate;

    @JSONField(name = "live_room_inline")
    @Nullable
    private InlineLive inlineLive;

    @JSONField(name = "inline_type")
    @Nullable
    private String inlineType;

    @JSONField(name = "notice_content")
    @Nullable
    private String noticeContent;

    @JSONField(name = "notice_name")
    @Nullable
    private String noticeName;

    @JSONField(name = "rating")
    private float rating;

    @JSONField(name = "rec_tag")
    @Nullable
    private Tag recTag;

    @JSONField(name = "score")
    @Nullable
    private String score;

    @JSONField(name = "tab_info")
    @Nullable
    private List<TabInfo> tabInfo;

    @JSONField(name = "tags")
    @Nullable
    private String tags;

    @JSONField(name = "top_game_ui")
    @Nullable
    private TopGameUiData topGameUi;

    @JSONField(name = "ugc_inline")
    @Nullable
    private UgcInline ugcInline;

    @JSONField(name = "video_cover_image")
    @Nullable
    private String videoCoverImage;

    public SearchTopGame() {
        this(null, null, null, null, null, null, null, null, null, null, null, 0.0f, null, null, null, null, null, null, null, 524287, null);
    }

    /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    public SearchTopGame(@NotNull SearchTopGameCard searchTopGameCard) {
        Sequence sequenceAsSequence;
        Sequence map;
        this(null, null, null, null, null, null, null, null, null, null, null, 0.0f, null, null, null, null, null, null, null, 524287, null);
        this.array = Integer.valueOf(searchTopGameCard.getArray());
        this.backgroundImage = searchTopGameCard.getBackgroundImage();
        this.buttonType = Integer.valueOf(searchTopGameCard.getButtonType());
        this.gameIcon = searchTopGameCard.getGameIcon();
        this.gameId = Long.valueOf(searchTopGameCard.getGameBaseId());
        this.gameStatus = Integer.valueOf(searchTopGameCard.getGameStatus());
        this.inlineType = searchTopGameCard.getInlineType();
        if (searchTopGameCard.hasTopGameUi()) {
            this.topGameUi = new TopGameUiData(searchTopGameCard.getTopGameUi());
        }
        this.noticeContent = searchTopGameCard.getNoticeContent();
        this.noticeName = searchTopGameCard.getNoticeName();
        this.rating = searchTopGameCard.getRating();
        this.score = searchTopGameCard.getScore();
        List tabInfoList = searchTopGameCard.getTabInfoList();
        this.tabInfo = (tabInfoList == null || (sequenceAsSequence = CollectionsKt.asSequence(tabInfoList)) == null || (map = SequencesKt.map(sequenceAsSequence, (Function1) new Object())) == null) ? null : SequencesKt.toList(map);
        this.tags = searchTopGameCard.getTags();
        if (searchTopGameCard.hasUgcInline()) {
            this.ugcInline = new UgcInline(searchTopGameCard.getUgcInline());
        }
        this.videoCoverImage = searchTopGameCard.getVideoCoverImage();
        if (searchTopGameCard.hasInlineLive()) {
            this.inlineLive = new InlineLive(searchTopGameCard.getInlineLive());
        }
        setTitle(searchTopGameCard.getTitle());
        setCover(searchTopGameCard.getCover());
        if (searchTopGameCard.hasRecTag()) {
            this.recTag = new Tag(searchTopGameCard.getRecTag());
        }
    }

    public SearchTopGame(@Nullable Integer num, @Nullable String str, @Nullable Integer num2, @Nullable String str2, @Nullable Long l7, @Nullable Integer num3, @Nullable String str3, @Nullable String str4, @Nullable TopGameUiData topGameUiData, @Nullable String str5, @Nullable String str6, float f7, @Nullable String str7, @Nullable List<TabInfo> list, @Nullable String str8, @Nullable UgcInline ugcInline, @Nullable String str9, @Nullable InlineLive inlineLive, @Nullable Tag tag) {
        this.array = num;
        this.backgroundImage = str;
        this.buttonType = num2;
        this.gameIcon = str2;
        this.gameId = l7;
        this.gameStatus = num3;
        this.f37goto = str3;
        this.inlineType = str4;
        this.topGameUi = topGameUiData;
        this.noticeContent = str5;
        this.noticeName = str6;
        this.rating = f7;
        this.score = str7;
        this.tabInfo = list;
        this.tags = str8;
        this.ugcInline = ugcInline;
        this.videoCoverImage = str9;
        this.inlineLive = inlineLive;
        this.recTag = tag;
        this.inlineData$delegate = ListExtentionsKt.lazyUnsafe(new U(this, 0));
    }

    public /* synthetic */ SearchTopGame(Integer num, String str, Integer num2, String str2, Long l7, Integer num3, String str3, String str4, TopGameUiData topGameUiData, String str5, String str6, float f7, String str7, List list, String str8, UgcInline ugcInline, String str9, InlineLive inlineLive, Tag tag, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : num, (i7 & 2) != 0 ? "" : str, (i7 & 4) != 0 ? null : num2, (i7 & 8) != 0 ? "" : str2, (i7 & 16) != 0 ? null : l7, (i7 & 32) == 0 ? num3 : 0, (i7 & 64) != 0 ? "" : str3, (i7 & 128) != 0 ? "" : str4, (i7 & 256) != 0 ? null : topGameUiData, (i7 & 512) != 0 ? "" : str5, (i7 & 1024) != 0 ? "" : str6, (i7 & 2048) != 0 ? 0.0f : f7, (i7 & 4096) != 0 ? null : str7, (i7 & 8192) != 0 ? CollectionsKt.emptyList() : list, (i7 & 16384) != 0 ? "" : str8, (i7 & 32768) != 0 ? null : ugcInline, (i7 & 65536) != 0 ? "" : str9, (i7 & 131072) != 0 ? null : inlineLive, (i7 & 262144) != 0 ? null : tag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TabInfo _init_$lambda$0(com.bapis.bilibili.polymer.app.search.v1.TabInfo tabInfo) {
        return new TabInfo(Integer.valueOf(tabInfo.getSort()), tabInfo.getTabName(), tabInfo.getTabUrl(), false, 8, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchTopGame copy$default(SearchTopGame searchTopGame, Integer num, String str, Integer num2, String str2, Long l7, Integer num3, String str3, String str4, TopGameUiData topGameUiData, String str5, String str6, float f7, String str7, List list, String str8, UgcInline ugcInline, String str9, InlineLive inlineLive, Tag tag, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            num = searchTopGame.array;
        }
        if ((i7 & 2) != 0) {
            str = searchTopGame.backgroundImage;
        }
        if ((i7 & 4) != 0) {
            num2 = searchTopGame.buttonType;
        }
        if ((i7 & 8) != 0) {
            str2 = searchTopGame.gameIcon;
        }
        if ((i7 & 16) != 0) {
            l7 = searchTopGame.gameId;
        }
        if ((i7 & 32) != 0) {
            num3 = searchTopGame.gameStatus;
        }
        if ((i7 & 64) != 0) {
            str3 = searchTopGame.f37goto;
        }
        if ((i7 & 128) != 0) {
            str4 = searchTopGame.inlineType;
        }
        if ((i7 & 256) != 0) {
            topGameUiData = searchTopGame.topGameUi;
        }
        if ((i7 & 512) != 0) {
            str5 = searchTopGame.noticeContent;
        }
        if ((i7 & 1024) != 0) {
            str6 = searchTopGame.noticeName;
        }
        if ((i7 & 2048) != 0) {
            f7 = searchTopGame.rating;
        }
        if ((i7 & 4096) != 0) {
            str7 = searchTopGame.score;
        }
        if ((i7 & 8192) != 0) {
            list = searchTopGame.tabInfo;
        }
        if ((i7 & 16384) != 0) {
            str8 = searchTopGame.tags;
        }
        if ((i7 & 32768) != 0) {
            ugcInline = searchTopGame.ugcInline;
        }
        if ((i7 & 65536) != 0) {
            str9 = searchTopGame.videoCoverImage;
        }
        if ((i7 & 131072) != 0) {
            inlineLive = searchTopGame.inlineLive;
        }
        if ((i7 & 262144) != 0) {
            tag = searchTopGame.recTag;
        }
        return searchTopGame.copy(num, str, num2, str2, l7, num3, str3, str4, topGameUiData, str5, str6, f7, str7, list, str8, ugcInline, str9, inlineLive, tag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IInlineCardData inlineData_delegate$lambda$0(SearchTopGame searchTopGame) {
        UgcInline ugcInline = searchTopGame.ugcInline;
        return ugcInline != null ? new I(ugcInline, searchTopGame.getTrackId()) : new NoPlayInlineCardData();
    }

    @Nullable
    public final Integer component1() {
        return this.array;
    }

    @Nullable
    public final String component10() {
        return this.noticeContent;
    }

    @Nullable
    public final String component11() {
        return this.noticeName;
    }

    public final float component12() {
        return this.rating;
    }

    @Nullable
    public final String component13() {
        return this.score;
    }

    @Nullable
    public final List<TabInfo> component14() {
        return this.tabInfo;
    }

    @Nullable
    public final String component15() {
        return this.tags;
    }

    @Nullable
    public final UgcInline component16() {
        return this.ugcInline;
    }

    @Nullable
    public final String component17() {
        return this.videoCoverImage;
    }

    @Nullable
    public final InlineLive component18() {
        return this.inlineLive;
    }

    @Nullable
    public final Tag component19() {
        return this.recTag;
    }

    @Nullable
    public final String component2() {
        return this.backgroundImage;
    }

    @Nullable
    public final Integer component3() {
        return this.buttonType;
    }

    @Nullable
    public final String component4() {
        return this.gameIcon;
    }

    @Nullable
    public final Long component5() {
        return this.gameId;
    }

    @Nullable
    public final Integer component6() {
        return this.gameStatus;
    }

    @Nullable
    public final String component7() {
        return this.f37goto;
    }

    @Nullable
    public final String component8() {
        return this.inlineType;
    }

    @Nullable
    public final TopGameUiData component9() {
        return this.topGameUi;
    }

    @NotNull
    public final SearchTopGame copy(@Nullable Integer num, @Nullable String str, @Nullable Integer num2, @Nullable String str2, @Nullable Long l7, @Nullable Integer num3, @Nullable String str3, @Nullable String str4, @Nullable TopGameUiData topGameUiData, @Nullable String str5, @Nullable String str6, float f7, @Nullable String str7, @Nullable List<TabInfo> list, @Nullable String str8, @Nullable UgcInline ugcInline, @Nullable String str9, @Nullable InlineLive inlineLive, @Nullable Tag tag) {
        return new SearchTopGame(num, str, num2, str2, l7, num3, str3, str4, topGameUiData, str5, str6, f7, str7, list, str8, ugcInline, str9, inlineLive, tag);
    }

    @Override // Ps0.G
    public /* bridge */ /* synthetic */ boolean drawBgColor() {
        return true;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchTopGame)) {
            return false;
        }
        SearchTopGame searchTopGame = (SearchTopGame) obj;
        return Intrinsics.areEqual(this.array, searchTopGame.array) && Intrinsics.areEqual(this.backgroundImage, searchTopGame.backgroundImage) && Intrinsics.areEqual(this.buttonType, searchTopGame.buttonType) && Intrinsics.areEqual(this.gameIcon, searchTopGame.gameIcon) && Intrinsics.areEqual(this.gameId, searchTopGame.gameId) && Intrinsics.areEqual(this.gameStatus, searchTopGame.gameStatus) && Intrinsics.areEqual(this.f37goto, searchTopGame.f37goto) && Intrinsics.areEqual(this.inlineType, searchTopGame.inlineType) && Intrinsics.areEqual(this.topGameUi, searchTopGame.topGameUi) && Intrinsics.areEqual(this.noticeContent, searchTopGame.noticeContent) && Intrinsics.areEqual(this.noticeName, searchTopGame.noticeName) && Float.compare(this.rating, searchTopGame.rating) == 0 && Intrinsics.areEqual(this.score, searchTopGame.score) && Intrinsics.areEqual(this.tabInfo, searchTopGame.tabInfo) && Intrinsics.areEqual(this.tags, searchTopGame.tags) && Intrinsics.areEqual(this.ugcInline, searchTopGame.ugcInline) && Intrinsics.areEqual(this.videoCoverImage, searchTopGame.videoCoverImage) && Intrinsics.areEqual(this.inlineLive, searchTopGame.inlineLive) && Intrinsics.areEqual(this.recTag, searchTopGame.recTag);
    }

    @Nullable
    public final Integer getArray() {
        return this.array;
    }

    @Override // dt0.InterfaceC6845h, com.bilibili.search2.result.n
    public long getAvId() {
        PlayerArgs playerArgs;
        UgcInline ugcInline = this.ugcInline;
        return (ugcInline == null || (playerArgs = ugcInline.getPlayerArgs()) == null) ? 0L : playerArgs.aid;
    }

    @Nullable
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    @Override // Ps0.G
    @Nullable
    public String getBgColor() {
        TopGameUiData topGameUiData = this.topGameUi;
        return topGameUiData != null ? topGameUiData.getModuleColor() : null;
    }

    @Override // Ps0.G
    @Nullable
    public String getBgCoverUrl() {
        String blurCoverUrl;
        TopGameUiData topGameUiData = this.topGameUi;
        return (topGameUiData == null || (blurCoverUrl = topGameUiData.getBlurCoverUrl()) == null) ? null : C9096i.a(blurCoverUrl);
    }

    @Override // Ps0.G
    @Nullable
    public String getBgTopColor() {
        TopGameUiData topGameUiData = this.topGameUi;
        return topGameUiData != null ? topGameUiData.getCoverDefaultColor() : null;
    }

    @Override // Ps0.G
    @ColorInt
    @Nullable
    public /* bridge */ /* synthetic */ Integer getBlackCoverColor() {
        return null;
    }

    @Nullable
    public final Integer getButtonType() {
        return this.buttonType;
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
    public final String getGameIcon() {
        return this.gameIcon;
    }

    @Nullable
    public final Long getGameId() {
        return this.gameId;
    }

    @Nullable
    public final Integer getGameStatus() {
        return this.gameStatus;
    }

    @Nullable
    public final String getGoto() {
        return this.f37goto;
    }

    public final boolean getHasInline() {
        return this.ugcInline != null;
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
    public final InlineLive getInlineLive() {
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
    public final String getNoticeContent() {
        return this.noticeContent;
    }

    @Nullable
    public final String getNoticeName() {
        return this.noticeName;
    }

    @Override // dt0.InterfaceC6845h
    public /* bridge */ /* synthetic */ int getOgvSubType() {
        return 0;
    }

    @Override // dt0.InterfaceC6845h
    public long getOid() {
        return getAvId();
    }

    @Override // dt0.AbstractC6841d
    @Nullable
    public PlayerArgs getPlayerArgs() {
        UgcInline ugcInline = this.ugcInline;
        return ugcInline != null ? ugcInline.getPlayerArgs() : null;
    }

    public final float getRating() {
        return this.rating;
    }

    @Nullable
    public final Tag getRecTag() {
        return this.recTag;
    }

    public /* bridge */ /* synthetic */ long getRoomId() {
        return 0L;
    }

    @Nullable
    public final String getScore() {
        return this.score;
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
    @NotNull
    public String getShareId() {
        return "search.search-result.ugc.0";
    }

    @Override // dt0.InterfaceC6845h
    @NotNull
    public String getShareOrigin() {
        return "search_inline";
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public SharePlane getSharePanel() {
        UgcInline ugcInline = this.ugcInline;
        return ugcInline != null ? ugcInline.getSharePlane() : null;
    }

    @Nullable
    public /* bridge */ /* synthetic */ String getShareSpmid() {
        return "search.search-result.0.0";
    }

    @Override // dt0.InterfaceC6845h
    public /* bridge */ /* synthetic */ int getShareType() {
        return 0;
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public String getSid() {
        return String.valueOf(getCId());
    }

    @Nullable
    public final List<TabInfo> getTabInfo() {
        return this.tabInfo;
    }

    @Nullable
    public final String getTags() {
        return this.tags;
    }

    @Override // dt0.AbstractC6841d
    @Nullable
    public String getTargetUri() {
        UgcInline ugcInline = this.ugcInline;
        return ugcInline != null ? ugcInline.getUri() : null;
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public InlineThreePointPanel getThreePointMeta() {
        UgcInline ugcInline = this.ugcInline;
        return ugcInline != null ? ugcInline.getThreePointMeta() : null;
    }

    @Nullable
    public final TopGameUiData getTopGameUi() {
        return this.topGameUi;
    }

    @Override // dt0.AbstractC6841d
    @Nullable
    public TrafficConfig getTrafficConfig() {
        UgcInline ugcInline = this.ugcInline;
        return ugcInline != null ? ugcInline.getTrafficConfig() : null;
    }

    @Nullable
    public final UgcInline getUgcInline() {
        return this.ugcInline;
    }

    @Override // com.bilibili.search2.result.k
    public long getUpMid() {
        BaseSearchInlineData.UpArgs upArgs;
        UgcInline ugcInline = this.ugcInline;
        return (ugcInline == null || (upArgs = ugcInline.getUpArgs()) == null) ? 0L : upArgs.getUpId();
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public /* bridge */ /* synthetic */ String getUpName() {
        return null;
    }

    @Nullable
    public final String getVideoCoverImage() {
        return this.videoCoverImage;
    }

    public int hashCode() {
        Integer num = this.array;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.backgroundImage;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Integer num2 = this.buttonType;
        int iHashCode3 = num2 == null ? 0 : num2.hashCode();
        String str2 = this.gameIcon;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        Long l7 = this.gameId;
        int iHashCode5 = l7 == null ? 0 : l7.hashCode();
        Integer num3 = this.gameStatus;
        int iHashCode6 = num3 == null ? 0 : num3.hashCode();
        String str3 = this.f37goto;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.inlineType;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        TopGameUiData topGameUiData = this.topGameUi;
        int iHashCode9 = topGameUiData == null ? 0 : topGameUiData.hashCode();
        String str5 = this.noticeContent;
        int iHashCode10 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.noticeName;
        int iA = androidx.compose.animation.n.a(this.rating, ((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str6 == null ? 0 : str6.hashCode())) * 31, 31);
        String str7 = this.score;
        int iHashCode11 = str7 == null ? 0 : str7.hashCode();
        List<TabInfo> list = this.tabInfo;
        int iHashCode12 = list == null ? 0 : list.hashCode();
        String str8 = this.tags;
        int iHashCode13 = str8 == null ? 0 : str8.hashCode();
        UgcInline ugcInline = this.ugcInline;
        int iHashCode14 = ugcInline == null ? 0 : ugcInline.hashCode();
        String str9 = this.videoCoverImage;
        int iHashCode15 = str9 == null ? 0 : str9.hashCode();
        InlineLive inlineLive = this.inlineLive;
        int iHashCode16 = inlineLive == null ? 0 : inlineLive.hashCode();
        Tag tag = this.recTag;
        return ((((((((((((iA + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + (tag == null ? 0 : tag.hashCode());
    }

    @Override // Ps0.G
    public boolean isBlackOver() {
        return false;
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

    @Override // Ps0.G
    public /* bridge */ /* synthetic */ boolean needCover() {
        return true;
    }

    public final void setArray(@Nullable Integer num) {
        this.array = num;
    }

    public final void setBackgroundImage(@Nullable String str) {
        this.backgroundImage = str;
    }

    public final void setButtonType(@Nullable Integer num) {
        this.buttonType = num;
    }

    @Override // com.bilibili.search2.result.n
    public /* bridge */ /* synthetic */ void setCoined(boolean z6) {
    }

    @Override // dt0.InterfaceC6845h
    public void setFavorite(boolean z6) {
        UgcInline ugcInline = this.ugcInline;
        if (ugcInline != null) {
            ugcInline.setFavorite(z6);
        }
    }

    public final void setGameIcon(@Nullable String str) {
        this.gameIcon = str;
    }

    public final void setGameId(@Nullable Long l7) {
        this.gameId = l7;
    }

    public final void setGameStatus(@Nullable Integer num) {
        this.gameStatus = num;
    }

    public final void setGoto(@Nullable String str) {
        this.f37goto = str;
    }

    public final void setInlineLive(@Nullable InlineLive inlineLive) {
        this.inlineLive = inlineLive;
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

    public final void setNoticeContent(@Nullable String str) {
        this.noticeContent = str;
    }

    public final void setNoticeName(@Nullable String str) {
        this.noticeName = str;
    }

    public final void setRating(float f7) {
        this.rating = f7;
    }

    public final void setRecTag(@Nullable Tag tag) {
        this.recTag = tag;
    }

    public final void setScore(@Nullable String str) {
        this.score = str;
    }

    public final void setTabInfo(@Nullable List<TabInfo> list) {
        this.tabInfo = list;
    }

    public final void setTags(@Nullable String str) {
        this.tags = str;
    }

    public final void setTopGameUi(@Nullable TopGameUiData topGameUiData) {
        this.topGameUi = topGameUiData;
    }

    public final void setUgcInline(@Nullable UgcInline ugcInline) {
        this.ugcInline = ugcInline;
    }

    public final void setVideoCoverImage(@Nullable String str) {
        this.videoCoverImage = str;
    }

    @NotNull
    public String toString() {
        Integer num = this.array;
        String str = this.backgroundImage;
        Integer num2 = this.buttonType;
        String str2 = this.gameIcon;
        Long l7 = this.gameId;
        Integer num3 = this.gameStatus;
        String str3 = this.f37goto;
        String str4 = this.inlineType;
        TopGameUiData topGameUiData = this.topGameUi;
        String str5 = this.noticeContent;
        String str6 = this.noticeName;
        float f7 = this.rating;
        String str7 = this.score;
        List<TabInfo> list = this.tabInfo;
        String str8 = this.tags;
        UgcInline ugcInline = this.ugcInline;
        String str9 = this.videoCoverImage;
        InlineLive inlineLive = this.inlineLive;
        Tag tag = this.recTag;
        StringBuilder sbB = z.b("SearchTopGame(array=", num, ", backgroundImage=", str, ", buttonType=");
        y3.c.a(num2, ", gameIcon=", str2, ", gameId=", sbB);
        sbB.append(l7);
        sbB.append(", gameStatus=");
        sbB.append(num3);
        sbB.append(", goto=");
        B.a(str3, ", inlineType=", str4, ", topGameUi=", sbB);
        sbB.append(topGameUiData);
        sbB.append(", noticeContent=");
        sbB.append(str5);
        sbB.append(", noticeName=");
        sbB.append(str6);
        sbB.append(", rating=");
        sbB.append(f7);
        sbB.append(", score=");
        M6.f.a(str7, ", tabInfo=", ", tags=", sbB, list);
        sbB.append(str8);
        sbB.append(", ugcInline=");
        sbB.append(ugcInline);
        sbB.append(", videoCoverImage=");
        sbB.append(str9);
        sbB.append(", inlineLive=");
        sbB.append(inlineLive);
        sbB.append(", recTag=");
        sbB.append(tag);
        sbB.append(")");
        return sbB.toString();
    }

    @Override // Ps0.G
    public /* bridge */ /* synthetic */ boolean whenSuggestShowResetColor() {
        return true;
    }
}
