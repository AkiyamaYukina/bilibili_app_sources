package com.bilibili.search2.api;

import Dt0.i;
import J1.z;
import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LayoutKt;
import androidx.media3.exoplayer.C4690e;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.app.translation.v1.TranslationBusiness;
import com.bapis.bilibili.polymer.app.search.v1.SearchUgcInlineCard;
import com.bapis.bilibili.polymer.app.search.v1.ThreePoint;
import com.bilibili.app.comm.list.common.api.model.PlayerArgs;
import com.bilibili.app.comm.list.common.data.InlineThreePointPanel;
import com.bilibili.app.comm.list.common.data.SharePlane;
import com.bilibili.bililive.listplayer.videonew.player.InlineUgcPlayableParams;
import com.bilibili.inline.card.DefaultInlineProperty;
import com.bilibili.inline.card.IInlineBehavior;
import com.bilibili.inline.card.IInlinePlayItem;
import com.bilibili.inline.card.IInlineProperty;
import com.bilibili.inline.utils.InlineReportParam;
import com.bilibili.playerbizcommon.message.VideoStatusMessage;
import com.bilibili.search2.api.BaseSearchInlineData;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.inline.Avatar;
import com.bilibili.search2.inline.TrafficConfig;
import com.bilibili.search2.result.n;
import com.bilibili.search2.utils.B;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import dt0.AbstractC6840c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.Video;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchUgcInline.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchUgcInline extends AbstractC6840c implements I00.b, n, com.bilibili.search2.api.oversea.a {
    public static final int $stable = 8;

    @JSONField(name = "author")
    @Nullable
    private String author;

    @JSONField(name = "avatar_item")
    @Nullable
    private o10.a avatarItem;

    @JSONField(name = "danmaku")
    @Nullable
    private Integer danmaku;

    @NotNull
    private final i defaultInlineProperty;

    @JSONField(name = "desc")
    @Nullable
    private String desc;

    @JSONField(name = "full_text")
    @Nullable
    private SearchVideoFullTextItem fullText;
    private int fullTextBackgroundType;
    private int fullTextLines;
    private int fullTextPrefix;
    private boolean fullTextShowLike;

    @NotNull
    private final IInlineBehavior inlineBehavior;

    @NotNull
    private final IInlinePlayItem inlinePlayItem;

    @NotNull
    private OgvClusterInlineTitleStyle inlineTitleStyle;

    @JSONField(name = "inline_type")
    @Nullable
    private String inlineType;

    @JSONField(name = EditCustomizeSticker.TAG_MID)
    private long mid;

    @JSONField(name = "play")
    private long play;

    @JSONField(name = "share")
    @Nullable
    private BaseSearchItem.Share share;

    @JSONField(name = "ugc_inline")
    @Nullable
    private UgcInline ugcInline;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchUgcInline$a.class */
    public static final class a implements IInlineBehavior {
        public final boolean getCardPlayable(boolean z6) {
            return z6;
        }

        public final boolean getReleaseOnEnd() {
            return false;
        }

        public final int getRepeatCount() {
            return -1;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchUgcInline$b.class */
    public static final class b implements IInlinePlayItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SearchUgcInline f86290a;

        public b(SearchUgcInline searchUgcInline) {
            this.f86290a = searchUgcInline;
        }

        public final CharSequence getInlineLogDescription() {
            return "SearchNormalUgcInline";
        }

        public final Video.PlayableParams getInlinePlayableParams() {
            String reportFlowData;
            BaseSearchInlineData.UpArgs upArgs;
            PlayerArgs playerArgs;
            InlineUgcPlayableParams inlineUgcPlayableParams = new InlineUgcPlayableParams();
            SearchUgcInline searchUgcInline = this.f86290a;
            B.a(searchUgcInline.getTargetUri(), inlineUgcPlayableParams, searchUgcInline.getCardPlayProperty().getPlayReason(), searchUgcInline.getTrackId());
            UgcInline ugcInline = searchUgcInline.getUgcInline();
            inlineUgcPlayableParams.setShowDanmaku(!(ugcInline != null && ugcInline.getDisableDanmaku()));
            inlineUgcPlayableParams.setTitle(searchUgcInline.getTitle());
            inlineUgcPlayableParams.setCover(searchUgcInline.getCover());
            UgcInline ugcInline2 = searchUgcInline.getUgcInline();
            if (ugcInline2 != null && (playerArgs = ugcInline2.getPlayerArgs()) != null) {
                inlineUgcPlayableParams.setAvid(playerArgs.aid);
                inlineUgcPlayableParams.setCid(playerArgs.cid);
                inlineUgcPlayableParams.setDuration(playerArgs.fakeDuration);
            }
            UgcInline ugcInline3 = searchUgcInline.getUgcInline();
            if (ugcInline3 != null && (upArgs = ugcInline3.getUpArgs()) != null) {
                inlineUgcPlayableParams.setMid(upArgs.getUpId());
                inlineUgcPlayableParams.setUpName(upArgs.getUpName());
                inlineUgcPlayableParams.setUpFace(upArgs.getUpFace());
                UgcInline ugcInline4 = searchUgcInline.getUgcInline();
                int i7 = 0;
                if (ugcInline4 != null) {
                    i7 = 0;
                    if (ugcInline4.isAtten()) {
                        i7 = 1;
                    }
                }
                inlineUgcPlayableParams.setSelected(i7);
            }
            UgcInline ugcInline5 = searchUgcInline.getUgcInline();
            if (ugcInline5 != null && (reportFlowData = ugcInline5.getReportFlowData()) != null) {
                inlineUgcPlayableParams.setLegacyExtra(MapsKt.mapOf(TuplesKt.to("report_flow_data", reportFlowData)));
            }
            return inlineUgcPlayableParams;
        }
    }

    public SearchUgcInline() {
        this(null, null, null, null, 0L, 0L, null, null, null, null, null, 0, 0, 0, false, LayoutKt.LargeDimension, null);
    }

    public SearchUgcInline(@NotNull SearchUgcInlineCard searchUgcInlineCard, int i7, int i8, int i9, int i10) {
        this(null, null, null, null, 0L, 0L, null, null, null, null, null, 0, 0, 0, false, LayoutKt.LargeDimension, null);
        this.author = searchUgcInlineCard.getAuthor();
        this.danmaku = Integer.valueOf(searchUgcInlineCard.getDanmaku());
        this.desc = searchUgcInlineCard.getDesc();
        this.inlineType = searchUgcInlineCard.getInlineType();
        this.mid = searchUgcInlineCard.getMid();
        this.play = searchUgcInlineCard.getPlay();
        if (searchUgcInlineCard.hasUgcInline()) {
            this.ugcInline = new UgcInline(searchUgcInlineCard.getUgcInline());
        }
        this.fullTextPrefix = i8;
        if (searchUgcInlineCard.hasFullText()) {
            this.fullText = new SearchVideoFullTextItem(searchUgcInlineCard.getFullText(), false, this.fullTextPrefix == 2, 2, null);
        }
        setTitle(searchUgcInlineCard.getTitle());
        setCover(searchUgcInlineCard.getCover());
        if (searchUgcInlineCard.hasFeedback()) {
            setFeedback(new BaseSearchItem.Feedback(searchUgcInlineCard.getFeedback()));
        }
        if (searchUgcInlineCard.hasAvatarInfo()) {
            this.avatarItem = r10.a.a(searchUgcInlineCard.getAvatarInfo());
        }
        List threePointList = searchUgcInlineCard.getThreePointList();
        ArrayList arrayList = new ArrayList();
        for (Object obj : threePointList) {
            if (Intrinsics.areEqual(((ThreePoint) obj).getType(), "translate")) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new BaseSearchItem.ThreePointItem((ThreePoint) it.next()));
        }
        setThreePoints(arrayList2);
        this.inlineTitleStyle = (OgvClusterInlineTitleStyle) OgvClusterInlineTitleStyle.getEntries().get(searchUgcInlineCard.getInlineTitleStyle());
        setTranslatedTitle(searchUgcInlineCard.getTranslatedTitle());
        setTranslatedStatus(searchUgcInlineCard.getTranslationStatus());
        this.fullTextBackgroundType = i7;
        this.fullTextLines = i9 == 0 ? 2 : 1;
        this.fullTextShowLike = i10 == 1;
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [Dt0.i, com.bilibili.inline.card.DefaultInlineProperty] */
    /* JADX WARN: Type inference failed for: r1v17, types: [com.bilibili.inline.card.IInlineBehavior, java.lang.Object] */
    public SearchUgcInline(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable String str3, long j7, long j8, @Nullable BaseSearchItem.Share share, @Nullable UgcInline ugcInline, @Nullable SearchVideoFullTextItem searchVideoFullTextItem, @Nullable o10.a aVar, @NotNull OgvClusterInlineTitleStyle ogvClusterInlineTitleStyle, int i7, int i8, int i9, boolean z6) {
        this.author = str;
        this.danmaku = num;
        this.desc = str2;
        this.inlineType = str3;
        this.mid = j7;
        this.play = j8;
        this.share = share;
        this.ugcInline = ugcInline;
        this.fullText = searchVideoFullTextItem;
        this.avatarItem = aVar;
        this.inlineTitleStyle = ogvClusterInlineTitleStyle;
        this.fullTextBackgroundType = i7;
        this.fullTextPrefix = i8;
        this.fullTextLines = i9;
        this.fullTextShowLike = z6;
        this.defaultInlineProperty = new DefaultInlineProperty();
        this.inlinePlayItem = new b(this);
        this.inlineBehavior = new Object();
    }

    public /* synthetic */ SearchUgcInline(String str, Integer num, String str2, String str3, long j7, long j8, BaseSearchItem.Share share, UgcInline ugcInline, SearchVideoFullTextItem searchVideoFullTextItem, o10.a aVar, OgvClusterInlineTitleStyle ogvClusterInlineTitleStyle, int i7, int i8, int i9, boolean z6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? 0L : j7, (i10 & 32) != 0 ? 0L : j8, (i10 & 64) != 0 ? null : share, (i10 & 128) != 0 ? null : ugcInline, (i10 & 256) != 0 ? null : searchVideoFullTextItem, (i10 & 512) != 0 ? null : aVar, (i10 & 1024) != 0 ? OgvClusterInlineTitleStyle.INLINE_TITLE_ORIGIN_TITLE : ogvClusterInlineTitleStyle, (i10 & 2048) != 0 ? 0 : i7, (i10 & 4096) != 0 ? 0 : i8, (i10 & 8192) != 0 ? 2 : i9, (i10 & 16384) != 0 ? false : z6);
    }

    public static /* synthetic */ SearchUgcInline copy$default(SearchUgcInline searchUgcInline, String str, Integer num, String str2, String str3, long j7, long j8, BaseSearchItem.Share share, UgcInline ugcInline, SearchVideoFullTextItem searchVideoFullTextItem, o10.a aVar, OgvClusterInlineTitleStyle ogvClusterInlineTitleStyle, int i7, int i8, int i9, boolean z6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = searchUgcInline.author;
        }
        if ((i10 & 2) != 0) {
            num = searchUgcInline.danmaku;
        }
        if ((i10 & 4) != 0) {
            str2 = searchUgcInline.desc;
        }
        if ((i10 & 8) != 0) {
            str3 = searchUgcInline.inlineType;
        }
        if ((i10 & 16) != 0) {
            j7 = searchUgcInline.mid;
        }
        if ((i10 & 32) != 0) {
            j8 = searchUgcInline.play;
        }
        if ((i10 & 64) != 0) {
            share = searchUgcInline.share;
        }
        if ((i10 & 128) != 0) {
            ugcInline = searchUgcInline.ugcInline;
        }
        if ((i10 & 256) != 0) {
            searchVideoFullTextItem = searchUgcInline.fullText;
        }
        if ((i10 & 512) != 0) {
            aVar = searchUgcInline.avatarItem;
        }
        if ((i10 & 1024) != 0) {
            ogvClusterInlineTitleStyle = searchUgcInline.inlineTitleStyle;
        }
        if ((i10 & 2048) != 0) {
            i7 = searchUgcInline.fullTextBackgroundType;
        }
        if ((i10 & 4096) != 0) {
            i8 = searchUgcInline.fullTextPrefix;
        }
        if ((i10 & 8192) != 0) {
            i9 = searchUgcInline.fullTextLines;
        }
        if ((i10 & 16384) != 0) {
            z6 = searchUgcInline.fullTextShowLike;
        }
        return searchUgcInline.copy(str, num, str2, str3, j7, j8, share, ugcInline, searchVideoFullTextItem, aVar, ogvClusterInlineTitleStyle, i7, i8, i9, z6);
    }

    @Nullable
    public final String component1() {
        return this.author;
    }

    @Nullable
    public final o10.a component10() {
        return this.avatarItem;
    }

    @NotNull
    public final OgvClusterInlineTitleStyle component11() {
        return this.inlineTitleStyle;
    }

    public final int component12() {
        return this.fullTextBackgroundType;
    }

    public final int component13() {
        return this.fullTextPrefix;
    }

    public final int component14() {
        return this.fullTextLines;
    }

    public final boolean component15() {
        return this.fullTextShowLike;
    }

    @Nullable
    public final Integer component2() {
        return this.danmaku;
    }

    @Nullable
    public final String component3() {
        return this.desc;
    }

    @Nullable
    public final String component4() {
        return this.inlineType;
    }

    public final long component5() {
        return this.mid;
    }

    public final long component6() {
        return this.play;
    }

    @Nullable
    public final BaseSearchItem.Share component7() {
        return this.share;
    }

    @Nullable
    public final UgcInline component8() {
        return this.ugcInline;
    }

    @Nullable
    public final SearchVideoFullTextItem component9() {
        return this.fullText;
    }

    @NotNull
    public final SearchUgcInline copy(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable String str3, long j7, long j8, @Nullable BaseSearchItem.Share share, @Nullable UgcInline ugcInline, @Nullable SearchVideoFullTextItem searchVideoFullTextItem, @Nullable o10.a aVar, @NotNull OgvClusterInlineTitleStyle ogvClusterInlineTitleStyle, int i7, int i8, int i9, boolean z6) {
        return new SearchUgcInline(str, num, str2, str3, j7, j8, share, ugcInline, searchVideoFullTextItem, aVar, ogvClusterInlineTitleStyle, i7, i8, i9, z6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchUgcInline)) {
            return false;
        }
        SearchUgcInline searchUgcInline = (SearchUgcInline) obj;
        return Intrinsics.areEqual(this.author, searchUgcInline.author) && Intrinsics.areEqual(this.danmaku, searchUgcInline.danmaku) && Intrinsics.areEqual(this.desc, searchUgcInline.desc) && Intrinsics.areEqual(this.inlineType, searchUgcInline.inlineType) && this.mid == searchUgcInline.mid && this.play == searchUgcInline.play && Intrinsics.areEqual(this.share, searchUgcInline.share) && Intrinsics.areEqual(this.ugcInline, searchUgcInline.ugcInline) && Intrinsics.areEqual(this.fullText, searchUgcInline.fullText) && Intrinsics.areEqual(this.avatarItem, searchUgcInline.avatarItem) && this.inlineTitleStyle == searchUgcInline.inlineTitleStyle && this.fullTextBackgroundType == searchUgcInline.fullTextBackgroundType && this.fullTextPrefix == searchUgcInline.fullTextPrefix && this.fullTextLines == searchUgcInline.fullTextLines && this.fullTextShowLike == searchUgcInline.fullTextShowLike;
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

    @Override // com.bilibili.search2.api.oversea.a
    @NotNull
    public /* bridge */ /* synthetic */ List getAllItems() {
        return super.getAllItems();
    }

    @Nullable
    public final String getAuthor() {
        return this.author;
    }

    @Override // dt0.InterfaceC6845h, com.bilibili.search2.result.n
    public long getAvId() {
        PlayerArgs playerArgs = getPlayerArgs();
        return playerArgs != null ? playerArgs.aid : 0L;
    }

    @Nullable
    public final o10.a getAvatarItem() {
        return this.avatarItem;
    }

    @Override // dt0.InterfaceC6845h
    public long getCId() {
        PlayerArgs playerArgs = getPlayerArgs();
        return playerArgs != null ? playerArgs.cid : 0L;
    }

    @NotNull
    public IInlineProperty getCardPlayProperty() {
        return this.defaultInlineProperty;
    }

    @Nullable
    public final Integer getDanmaku() {
        return this.danmaku;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public Long getDuration() {
        PlayerArgs playerArgs;
        UgcInline ugcInline = this.ugcInline;
        return (ugcInline == null || (playerArgs = ugcInline.getPlayerArgs()) == null) ? null : Long.valueOf(playerArgs.fakeDuration);
    }

    public /* bridge */ /* synthetic */ long getEpId() {
        return 0L;
    }

    @Override // dt0.AbstractC6841d
    @Nullable
    public String getExtraUri() {
        UgcInline ugcInline = this.ugcInline;
        return ugcInline != null ? ugcInline.getExtraUri() : null;
    }

    @NotNull
    public String getFrom() {
        return "3";
    }

    @NotNull
    public String getFromSpmid() {
        return "search.search-result.0.0";
    }

    @Nullable
    public final SearchVideoFullTextItem getFullText() {
        return this.fullText;
    }

    public final int getFullTextBackgroundType() {
        return this.fullTextBackgroundType;
    }

    public final int getFullTextLines() {
        return this.fullTextLines;
    }

    public final int getFullTextPrefix() {
        return this.fullTextPrefix;
    }

    public final boolean getFullTextShowLike() {
        return this.fullTextShowLike;
    }

    @NotNull
    public IInlineBehavior getInlineBehavior() {
        return this.inlineBehavior;
    }

    @NotNull
    public IInlinePlayItem getInlinePlayerItem() {
        return this.inlinePlayItem;
    }

    @Nullable
    public InlineReportParam getInlineReportParams() {
        return new InlineReportParam(getGoTo() != null ? getGoTo() : "", getAvId(), getCId(), 0L, 0L, 0L, (String) null, 64, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final OgvClusterInlineTitleStyle getInlineTitleStyle() {
        return this.inlineTitleStyle;
    }

    @Nullable
    public final String getInlineType() {
        return this.inlineType;
    }

    public long getLikeCount() {
        SearchLikeButtonItem likeButton;
        UgcInline ugcInline = this.ugcInline;
        return (ugcInline == null || (likeButton = ugcInline.getLikeButton()) == null) ? 0L : likeButton.getCount();
    }

    public boolean getLikeState() {
        UgcInline ugcInline = this.ugcInline;
        boolean z6 = false;
        if (ugcInline != null) {
            SearchLikeButtonItem likeButton = ugcInline.getLikeButton();
            z6 = false;
            if (likeButton != null) {
                z6 = false;
                if (likeButton.isSelected()) {
                    z6 = true;
                }
            }
        }
        return z6;
    }

    public final long getMid() {
        return this.mid;
    }

    @Override // dt0.InterfaceC6845h
    public /* bridge */ /* synthetic */ int getOgvSubType() {
        return 0;
    }

    @Override // dt0.InterfaceC6845h
    public long getOid() {
        return getAvId();
    }

    public final long getPlay() {
        return this.play;
    }

    @Override // dt0.AbstractC6841d
    @Nullable
    public PlayerArgs getPlayerArgs() {
        UgcInline ugcInline = this.ugcInline;
        return ugcInline != null ? ugcInline.getPlayerArgs() : null;
    }

    @Nullable
    public Boolean getRelationCoinState() {
        UgcInline ugcInline = this.ugcInline;
        return ugcInline != null ? Boolean.valueOf(ugcInline.isCoin()) : null;
    }

    @Nullable
    public Boolean getRelationFavoriteState() {
        UgcInline ugcInline = this.ugcInline;
        return ugcInline != null ? Boolean.valueOf(ugcInline.isFavorite()) : null;
    }

    @Nullable
    public Boolean getRelationFollowState() {
        UgcInline ugcInline = this.ugcInline;
        return ugcInline != null ? Boolean.valueOf(ugcInline.isAtten()) : null;
    }

    @Nullable
    public Long getRelationLikeNum() {
        SearchLikeButtonItem likeButton;
        UgcInline ugcInline = this.ugcInline;
        return (ugcInline == null || (likeButton = ugcInline.getLikeButton()) == null) ? null : Long.valueOf(likeButton.getCount());
    }

    @Nullable
    public Boolean getRelationLikeState() {
        SearchLikeButtonItem likeButton;
        UgcInline ugcInline = this.ugcInline;
        return (ugcInline == null || (likeButton = ugcInline.getLikeButton()) == null) ? null : Boolean.valueOf(likeButton.isSelected());
    }

    public /* bridge */ /* synthetic */ long getRoomId() {
        return 0L;
    }

    public /* bridge */ /* synthetic */ long getSeasonId() {
        return 0L;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    @Nullable
    public BaseSearchItem.Share getShare() {
        return this.share;
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
    @NotNull
    public String getSid() {
        return String.valueOf(getCId());
    }

    @NotNull
    public String getSpmid() {
        return "search.search-result.0.0";
    }

    @Override // com.bilibili.search2.api.oversea.a
    @NotNull
    public List getSubItems() {
        return CollectionsKt.emptyList();
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

    @Override // dt0.AbstractC6841d
    @Nullable
    public TrafficConfig getTrafficConfig() {
        UgcInline ugcInline = this.ugcInline;
        return ugcInline != null ? ugcInline.getTrafficConfig() : null;
    }

    @Override // com.bilibili.search2.api.oversea.a
    @NotNull
    public com.bilibili.search2.api.oversea.c getTranslateRequestParam() {
        TranslationBusiness translationBusiness = TranslationBusiness.TRANS_BIZ_ARC;
        String param = getParam();
        String str = param;
        if (param == null) {
            str = "";
        }
        return new com.bilibili.search2.api.oversea.c(translationBusiness, str);
    }

    @Nullable
    public final UgcInline getUgcInline() {
        return this.ugcInline;
    }

    @Override // com.bilibili.search2.result.k
    public long getUpMid() {
        Avatar avatar;
        UgcInline ugcInline = this.ugcInline;
        return (ugcInline == null || (avatar = ugcInline.getAvatar()) == null) ? -1L : avatar.getUpId();
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public String getUpName() {
        BaseSearchInlineData.UpArgs upArgs;
        UgcInline ugcInline = this.ugcInline;
        return (ugcInline == null || (upArgs = ugcInline.getUpArgs()) == null) ? null : upArgs.getUpName();
    }

    @Nullable
    public String getUpperAvatar() {
        BaseSearchInlineData.UpArgs upArgs;
        UgcInline ugcInline = this.ugcInline;
        return (ugcInline == null || (upArgs = ugcInline.getUpArgs()) == null) ? null : upArgs.getUpFace();
    }

    @Nullable
    public String[] getUpperId() {
        BaseSearchInlineData.UpArgs upArgs;
        String strValueOf;
        UgcInline ugcInline = this.ugcInline;
        return (ugcInline == null || (upArgs = ugcInline.getUpArgs()) == null || (strValueOf = String.valueOf(upArgs.getUpId())) == null) ? null : new String[]{strValueOf};
    }

    @Nullable
    public String getUpperName() {
        BaseSearchInlineData.UpArgs upArgs;
        UgcInline ugcInline = this.ugcInline;
        return (ugcInline == null || (upArgs = ugcInline.getUpArgs()) == null) ? null : upArgs.getUpName();
    }

    @Nullable
    public String getVideoId() {
        PlayerArgs playerArgs;
        UgcInline ugcInline = this.ugcInline;
        return (ugcInline == null || (playerArgs = ugcInline.getPlayerArgs()) == null) ? null : String.valueOf(playerArgs.cid);
    }

    @Nullable
    public String[] getVideoList() {
        PlayerArgs playerArgs;
        String strValueOf;
        UgcInline ugcInline = this.ugcInline;
        return (ugcInline == null || (playerArgs = ugcInline.getPlayerArgs()) == null || (strValueOf = String.valueOf(playerArgs.cid)) == null) ? null : new String[]{strValueOf};
    }

    @Nullable
    public String getVideoTitle() {
        return null;
    }

    @Nullable
    public String getWorkId() {
        PlayerArgs playerArgs;
        UgcInline ugcInline = this.ugcInline;
        return (ugcInline == null || (playerArgs = ugcInline.getPlayerArgs()) == null) ? null : String.valueOf(playerArgs.aid);
    }

    @Nullable
    public String getWorkTitle() {
        UgcInline ugcInline = this.ugcInline;
        return ugcInline != null ? ugcInline.getTitle() : null;
    }

    public final boolean hasFullText() {
        SearchVideoFullTextItem searchVideoFullTextItem = this.fullText;
        boolean z6 = false;
        if (searchVideoFullTextItem != null) {
            z6 = false;
            if (searchVideoFullTextItem.isValid()) {
                z6 = true;
            }
        }
        return z6;
    }

    public boolean hasTripleLike() {
        SearchLikeButtonItem likeButton;
        UgcInline ugcInline = this.ugcInline;
        boolean z6 = false;
        if (ugcInline != null ? ugcInline.isCoin() : false) {
            UgcInline ugcInline2 = this.ugcInline;
            z6 = false;
            if (ugcInline2 != null ? ugcInline2.isFavorite() : false) {
                UgcInline ugcInline3 = this.ugcInline;
                z6 = false;
                if ((ugcInline3 == null || (likeButton = ugcInline3.getLikeButton()) == null || !likeButton.isSelected()) ? false : true) {
                    z6 = true;
                }
            }
        }
        return z6;
    }

    public int hashCode() {
        String str = this.author;
        int iHashCode = str == null ? 0 : str.hashCode();
        Integer num = this.danmaku;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str2 = this.desc;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.inlineType;
        int iA = C3554n0.a(C3554n0.a(((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.mid), 31, this.play);
        BaseSearchItem.Share share = this.share;
        int iHashCode4 = share == null ? 0 : share.hashCode();
        UgcInline ugcInline = this.ugcInline;
        int iHashCode5 = ugcInline == null ? 0 : ugcInline.hashCode();
        SearchVideoFullTextItem searchVideoFullTextItem = this.fullText;
        int iHashCode6 = searchVideoFullTextItem == null ? 0 : searchVideoFullTextItem.hashCode();
        o10.a aVar = this.avatarItem;
        return Boolean.hashCode(this.fullTextShowLike) + I.a(this.fullTextLines, I.a(this.fullTextPrefix, I.a(this.fullTextBackgroundType, (this.inlineTitleStyle.hashCode() + ((((((((iA + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31, 31), 31), 31);
    }

    @Override // dt0.InterfaceC6845h
    public boolean isFavorite() {
        UgcInline ugcInline = this.ugcInline;
        return ugcInline != null ? ugcInline.isFavorite() : false;
    }

    @Override // dt0.InterfaceC6845h
    public boolean isHot() {
        BaseSearchInlineData.Share share;
        BaseSearchInlineData.Video video;
        Boolean boolIsHotLabel;
        UgcInline ugcInline = this.ugcInline;
        return (ugcInline == null || (share = ugcInline.getShare()) == null || (video = share.getVideo()) == null || (boolIsHotLabel = video.isHotLabel()) == null) ? false : boolIsHotLabel.booleanValue();
    }

    public boolean isTripleLikeCoin() {
        UgcInline ugcInline = this.ugcInline;
        return ugcInline != null ? ugcInline.isCoin() : false;
    }

    public boolean isTripleLikeFav() {
        UgcInline ugcInline = this.ugcInline;
        return ugcInline != null ? ugcInline.isFavorite() : false;
    }

    public final void setAuthor(@Nullable String str) {
        this.author = str;
    }

    public final void setAvatarItem(@Nullable o10.a aVar) {
        this.avatarItem = aVar;
    }

    @Override // com.bilibili.search2.result.n
    public /* bridge */ /* synthetic */ void setCoined(boolean z6) {
    }

    public final void setDanmaku(@Nullable Integer num) {
        this.danmaku = num;
    }

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    @Override // dt0.InterfaceC6845h
    public void setFavorite(boolean z6) {
        UgcInline ugcInline = this.ugcInline;
        if (ugcInline != null) {
            ugcInline.setFavorite(z6);
        }
    }

    public final void setFullText(@Nullable SearchVideoFullTextItem searchVideoFullTextItem) {
        this.fullText = searchVideoFullTextItem;
    }

    public final void setFullTextBackgroundType(int i7) {
        this.fullTextBackgroundType = i7;
    }

    public final void setFullTextLines(int i7) {
        this.fullTextLines = i7;
    }

    public final void setFullTextPrefix(int i7) {
        this.fullTextPrefix = i7;
    }

    public final void setFullTextShowLike(boolean z6) {
        this.fullTextShowLike = z6;
    }

    public final void setInlineTitleStyle(@NotNull OgvClusterInlineTitleStyle ogvClusterInlineTitleStyle) {
        this.inlineTitleStyle = ogvClusterInlineTitleStyle;
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
        UgcInline ugcInline = this.ugcInline;
        if (ugcInline != null) {
            ugcInline.setAtten(z6);
        }
    }

    @Override // com.bilibili.search2.result.n
    public void setIsLike(boolean z6) {
        SearchLikeButtonItem likeButton;
        UgcInline ugcInline = this.ugcInline;
        if (ugcInline == null || (likeButton = ugcInline.getLikeButton()) == null) {
            return;
        }
        likeButton.setSelected(z6 ? 1 : 0);
    }

    @Override // com.bilibili.search2.result.n
    public void setLikeCount(long j7) {
        SearchLikeButtonItem likeButton;
        UgcInline ugcInline = this.ugcInline;
        if (ugcInline == null || (likeButton = ugcInline.getLikeButton()) == null) {
            return;
        }
        likeButton.setCount(j7);
    }

    public final void setMid(long j7) {
        this.mid = j7;
    }

    public final void setPlay(long j7) {
        this.play = j7;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public void setShare(@Nullable BaseSearchItem.Share share) {
        this.share = share;
    }

    public void setTripleLikeCoin(boolean z6) {
    }

    public void setTripleLikeFav(boolean z6) {
    }

    public final void setUgcInline(@Nullable UgcInline ugcInline) {
        this.ugcInline = ugcInline;
    }

    @NotNull
    public String toString() {
        String str = this.author;
        Integer num = this.danmaku;
        String str2 = this.desc;
        String str3 = this.inlineType;
        long j7 = this.mid;
        long j8 = this.play;
        BaseSearchItem.Share share = this.share;
        UgcInline ugcInline = this.ugcInline;
        SearchVideoFullTextItem searchVideoFullTextItem = this.fullText;
        o10.a aVar = this.avatarItem;
        OgvClusterInlineTitleStyle ogvClusterInlineTitleStyle = this.inlineTitleStyle;
        int i7 = this.fullTextBackgroundType;
        int i8 = this.fullTextPrefix;
        int i9 = this.fullTextLines;
        boolean z6 = this.fullTextShowLike;
        StringBuilder sbA = Id.a.a("SearchUgcInline(author=", num, str, ", danmaku=", ", desc=");
        androidx.room.B.a(str2, ", inlineType=", str3, ", mid=", sbA);
        sbA.append(j7);
        z.a(j8, ", play=", ", share=", sbA);
        sbA.append(share);
        sbA.append(", ugcInline=");
        sbA.append(ugcInline);
        sbA.append(", fullText=");
        sbA.append(searchVideoFullTextItem);
        sbA.append(", avatarItem=");
        sbA.append(aVar);
        sbA.append(", inlineTitleStyle=");
        sbA.append(ogvClusterInlineTitleStyle);
        sbA.append(", fullTextBackgroundType=");
        sbA.append(i7);
        sbA.append(", fullTextPrefix=");
        C4690e.a(i8, i9, ", fullTextLines=", ", fullTextShowLike=", sbA);
        return androidx.appcompat.app.i.a(sbA, z6, ")");
    }

    public final void updateByMsg(@NotNull VideoStatusMessage videoStatusMessage) {
        UgcInline ugcInline = this.ugcInline;
        if (ugcInline != null) {
            ugcInline.setCoin(videoStatusMessage.getCoinState());
        }
        updateLikeState(videoStatusMessage.getLikeState(), videoStatusMessage.getLikeCount());
        UgcInline ugcInline2 = this.ugcInline;
        if (ugcInline2 != null) {
            ugcInline2.setFavorite(videoStatusMessage.getFavState());
        }
    }

    public void updateLikeState(boolean z6, long j7) {
        SearchLikeButtonItem likeButton;
        SearchLikeButtonItem likeButton2;
        if (j7 >= 0) {
            UgcInline ugcInline = this.ugcInline;
            if (ugcInline == null || (likeButton2 = ugcInline.getLikeButton()) == null) {
                return;
            }
            likeButton2.updateSelected(z6, j7);
            return;
        }
        UgcInline ugcInline2 = this.ugcInline;
        if (ugcInline2 == null || (likeButton = ugcInline2.getLikeButton()) == null) {
            return;
        }
        likeButton.updateSelected(z6);
    }
}
