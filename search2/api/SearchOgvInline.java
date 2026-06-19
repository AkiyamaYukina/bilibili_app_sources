package com.bilibili.search2.api;

import Dt0.i;
import J1.z;
import Ps0.L;
import Ps0.X;
import androidx.annotation.Keep;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.B;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.ReasonStyle;
import com.bapis.bilibili.polymer.app.search.v1.SearchOgvInlineCard;
import com.bilibili.ad.adview.liveroom.answer.fragment.vm.v;
import com.bilibili.app.comm.list.common.api.model.PlayerArgs;
import com.bilibili.app.comm.list.common.data.InlineThreePointPanel;
import com.bilibili.app.comm.list.common.data.SharePlane;
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
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import dt0.AbstractC6840c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.Video;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchOgvInline.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchOgvInline extends AbstractC6840c implements I00.b, n {
    public static final int $stable = 8;

    @JSONField(name = "author")
    @Nullable
    private String author;

    @JSONField(name = "badges_v2")
    @Nullable
    private List<Tag> badgesV2;

    @JSONField(name = "danmaku")
    @Nullable
    private Integer danmaku;

    @NotNull
    private final i defaultInlineProperty;

    @JSONField(name = "desc")
    @Nullable
    private String desc;

    @JSONField(name = "face")
    @Nullable
    private String face;

    @NotNull
    private OgvClusterInlineTitleStyle inlineTitleStyle;

    @JSONField(name = "inline_type")
    @Nullable
    private String inlineType;

    @NotNull
    private final IInlineBehavior mInlineBehavior;

    @NotNull
    private final IInlinePlayItem mInlinePlayItem;

    @JSONField(name = EditCustomizeSticker.TAG_MID)
    private long mid;

    @Nullable
    private String ogvAggregateTitle;

    @JSONField(name = "ogv_clip_info")
    @Nullable
    private SearchOgvClipInfo ogvClipInfo;

    @JSONField(name = "ogv_inline")
    @Nullable
    private OgvInline ogvInline;

    @JSONField(name = "play")
    private long play;

    @JSONField(name = "sale_info")
    @Nullable
    private com.bilibili.search2.api.b saleInfo;

    @JSONField(name = "score")
    @Nullable
    private String score;

    @JSONField(name = "share")
    @Nullable
    private BaseSearchItem.Share share;

    @JSONField(name = "watch_button")
    @Nullable
    private X watchButton;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchOgvInline$a.class */
    public static final class a implements IInlineBehavior {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SearchOgvInline f86288a;

        public a(SearchOgvInline searchOgvInline) {
            this.f86288a = searchOgvInline;
        }

        public final boolean getCardPlayable(boolean z6) {
            boolean z7 = false;
            if (z6) {
                OgvInline ogvInline = this.f86288a.getOgvInline();
                z7 = false;
                if (ogvInline != null ? ogvInline.canPlay() : false) {
                    z7 = true;
                }
            }
            return z7;
        }

        public final boolean getReleaseOnEnd() {
            OgvInline ogvInline = this.f86288a.getOgvInline();
            return (ogvInline != null ? ogvInline.getPlayerWidget() : null) == null;
        }

        public final int getRepeatCount() {
            return -1;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchOgvInline$b.class */
    public static final class b implements IInlinePlayItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SearchOgvInline f86289a;

        public b(SearchOgvInline searchOgvInline) {
            this.f86289a = searchOgvInline;
        }

        public final CharSequence getInlineLogDescription() {
            return "SearchNormalOgvInline";
        }

        public final Video.PlayableParams getInlinePlayableParams() {
            return L.a(this.f86289a);
        }
    }

    public SearchOgvInline() {
        this(null, null, null, null, null, 0L, 0L, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    public SearchOgvInline(@NotNull SearchOgvInlineCard searchOgvInlineCard) {
        this(null, null, null, null, null, 0L, 0L, null, null, null, null, null, null, null, null, null, 65535, null);
        this.author = searchOgvInlineCard.getAuthor();
        this.danmaku = Integer.valueOf(searchOgvInlineCard.getDanmaku());
        this.desc = searchOgvInlineCard.getDesc();
        this.face = searchOgvInlineCard.getFace();
        this.inlineType = searchOgvInlineCard.getInlineType();
        this.mid = searchOgvInlineCard.getMid();
        this.play = searchOgvInlineCard.getPlay();
        if (searchOgvInlineCard.hasOgvInline()) {
            this.ogvInline = new OgvInline(searchOgvInlineCard.getOgvInline());
        }
        if (searchOgvInlineCard.hasOgvClipInfo()) {
            this.ogvClipInfo = new SearchOgvClipInfo(searchOgvInlineCard.getOgvClipInfo());
        }
        if (searchOgvInlineCard.hasWatchButton()) {
            this.watchButton = new X(searchOgvInlineCard.getWatchButton());
        }
        this.score = searchOgvInlineCard.getScore();
        setTitle(searchOgvInlineCard.getTitle());
        setCover(searchOgvInlineCard.getCover());
        ArrayList arrayList = new ArrayList();
        if (searchOgvInlineCard.getBadgesV2Count() > 0) {
            Iterator it = searchOgvInlineCard.getBadgesV2List().iterator();
            while (it.hasNext()) {
                arrayList.add(new Tag((ReasonStyle) it.next()));
            }
        }
        if (!arrayList.isEmpty()) {
            this.badgesV2 = arrayList;
        }
        if (searchOgvInlineCard.hasSaleInfo()) {
            this.saleInfo = new com.bilibili.search2.api.b(searchOgvInlineCard.getSaleInfo());
        }
        this.inlineTitleStyle = (OgvClusterInlineTitleStyle) OgvClusterInlineTitleStyle.getEntries().get(searchOgvInlineCard.getInlineTitleStyle());
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [Dt0.i, com.bilibili.inline.card.DefaultInlineProperty] */
    public SearchOgvInline(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @Nullable String str4, long j7, long j8, @Nullable BaseSearchItem.Share share, @Nullable OgvInline ogvInline, @Nullable SearchOgvClipInfo searchOgvClipInfo, @Nullable X x6, @Nullable String str5, @Nullable List<Tag> list, @Nullable com.bilibili.search2.api.b bVar, @Nullable String str6, @NotNull OgvClusterInlineTitleStyle ogvClusterInlineTitleStyle) {
        this.author = str;
        this.danmaku = num;
        this.desc = str2;
        this.face = str3;
        this.inlineType = str4;
        this.mid = j7;
        this.play = j8;
        this.share = share;
        this.ogvInline = ogvInline;
        this.ogvClipInfo = searchOgvClipInfo;
        this.watchButton = x6;
        this.score = str5;
        this.badgesV2 = list;
        this.saleInfo = bVar;
        this.ogvAggregateTitle = str6;
        this.inlineTitleStyle = ogvClusterInlineTitleStyle;
        this.defaultInlineProperty = new DefaultInlineProperty();
        this.mInlinePlayItem = new b(this);
        this.mInlineBehavior = new a(this);
    }

    public /* synthetic */ SearchOgvInline(String str, Integer num, String str2, String str3, String str4, long j7, long j8, BaseSearchItem.Share share, OgvInline ogvInline, SearchOgvClipInfo searchOgvClipInfo, X x6, String str5, List list, com.bilibili.search2.api.b bVar, String str6, OgvClusterInlineTitleStyle ogvClusterInlineTitleStyle, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : num, (i7 & 4) != 0 ? null : str2, (i7 & 8) != 0 ? null : str3, (i7 & 16) != 0 ? null : str4, (i7 & 32) != 0 ? 0L : j7, (i7 & 64) != 0 ? 0L : j8, (i7 & 128) != 0 ? null : share, (i7 & 256) != 0 ? null : ogvInline, (i7 & 512) != 0 ? null : searchOgvClipInfo, (i7 & 1024) != 0 ? null : x6, (i7 & 2048) != 0 ? null : str5, (i7 & 4096) != 0 ? null : list, (i7 & 8192) != 0 ? null : bVar, (i7 & 16384) != 0 ? null : str6, (i7 & 32768) != 0 ? OgvClusterInlineTitleStyle.INLINE_TITLE_ORIGIN_TITLE : ogvClusterInlineTitleStyle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchOgvInline copy$default(SearchOgvInline searchOgvInline, String str, Integer num, String str2, String str3, String str4, long j7, long j8, BaseSearchItem.Share share, OgvInline ogvInline, SearchOgvClipInfo searchOgvClipInfo, X x6, String str5, List list, com.bilibili.search2.api.b bVar, String str6, OgvClusterInlineTitleStyle ogvClusterInlineTitleStyle, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = searchOgvInline.author;
        }
        if ((i7 & 2) != 0) {
            num = searchOgvInline.danmaku;
        }
        if ((i7 & 4) != 0) {
            str2 = searchOgvInline.desc;
        }
        if ((i7 & 8) != 0) {
            str3 = searchOgvInline.face;
        }
        if ((i7 & 16) != 0) {
            str4 = searchOgvInline.inlineType;
        }
        if ((i7 & 32) != 0) {
            j7 = searchOgvInline.mid;
        }
        if ((i7 & 64) != 0) {
            j8 = searchOgvInline.play;
        }
        if ((i7 & 128) != 0) {
            share = searchOgvInline.share;
        }
        if ((i7 & 256) != 0) {
            ogvInline = searchOgvInline.ogvInline;
        }
        if ((i7 & 512) != 0) {
            searchOgvClipInfo = searchOgvInline.ogvClipInfo;
        }
        if ((i7 & 1024) != 0) {
            x6 = searchOgvInline.watchButton;
        }
        if ((i7 & 2048) != 0) {
            str5 = searchOgvInline.score;
        }
        if ((i7 & 4096) != 0) {
            list = searchOgvInline.badgesV2;
        }
        if ((i7 & 8192) != 0) {
            bVar = searchOgvInline.saleInfo;
        }
        if ((i7 & 16384) != 0) {
            str6 = searchOgvInline.ogvAggregateTitle;
        }
        if ((i7 & 32768) != 0) {
            ogvClusterInlineTitleStyle = searchOgvInline.inlineTitleStyle;
        }
        return searchOgvInline.copy(str, num, str2, str3, str4, j7, j8, share, ogvInline, searchOgvClipInfo, x6, str5, list, bVar, str6, ogvClusterInlineTitleStyle);
    }

    @Nullable
    public final String component1() {
        return this.author;
    }

    @Nullable
    public final SearchOgvClipInfo component10() {
        return this.ogvClipInfo;
    }

    @Nullable
    public final X component11() {
        return this.watchButton;
    }

    @Nullable
    public final String component12() {
        return this.score;
    }

    @Nullable
    public final List<Tag> component13() {
        return this.badgesV2;
    }

    @Nullable
    public final com.bilibili.search2.api.b component14() {
        return this.saleInfo;
    }

    @Nullable
    public final String component15() {
        return this.ogvAggregateTitle;
    }

    @NotNull
    public final OgvClusterInlineTitleStyle component16() {
        return this.inlineTitleStyle;
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
        return this.face;
    }

    @Nullable
    public final String component5() {
        return this.inlineType;
    }

    public final long component6() {
        return this.mid;
    }

    public final long component7() {
        return this.play;
    }

    @Nullable
    public final BaseSearchItem.Share component8() {
        return this.share;
    }

    @Nullable
    public final OgvInline component9() {
        return this.ogvInline;
    }

    @NotNull
    public final SearchOgvInline copy(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @Nullable String str4, long j7, long j8, @Nullable BaseSearchItem.Share share, @Nullable OgvInline ogvInline, @Nullable SearchOgvClipInfo searchOgvClipInfo, @Nullable X x6, @Nullable String str5, @Nullable List<Tag> list, @Nullable com.bilibili.search2.api.b bVar, @Nullable String str6, @NotNull OgvClusterInlineTitleStyle ogvClusterInlineTitleStyle) {
        return new SearchOgvInline(str, num, str2, str3, str4, j7, j8, share, ogvInline, searchOgvClipInfo, x6, str5, list, bVar, str6, ogvClusterInlineTitleStyle);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchOgvInline)) {
            return false;
        }
        SearchOgvInline searchOgvInline = (SearchOgvInline) obj;
        return Intrinsics.areEqual(this.author, searchOgvInline.author) && Intrinsics.areEqual(this.danmaku, searchOgvInline.danmaku) && Intrinsics.areEqual(this.desc, searchOgvInline.desc) && Intrinsics.areEqual(this.face, searchOgvInline.face) && Intrinsics.areEqual(this.inlineType, searchOgvInline.inlineType) && this.mid == searchOgvInline.mid && this.play == searchOgvInline.play && Intrinsics.areEqual(this.share, searchOgvInline.share) && Intrinsics.areEqual(this.ogvInline, searchOgvInline.ogvInline) && Intrinsics.areEqual(this.ogvClipInfo, searchOgvInline.ogvClipInfo) && Intrinsics.areEqual(this.watchButton, searchOgvInline.watchButton) && Intrinsics.areEqual(this.score, searchOgvInline.score) && Intrinsics.areEqual(this.badgesV2, searchOgvInline.badgesV2) && Intrinsics.areEqual(this.saleInfo, searchOgvInline.saleInfo) && Intrinsics.areEqual(this.ogvAggregateTitle, searchOgvInline.ogvAggregateTitle) && this.inlineTitleStyle == searchOgvInline.inlineTitleStyle;
    }

    public long getAid() {
        SearchLikeButtonItem likeButton;
        OgvInline ogvInline = this.ogvInline;
        return (ogvInline == null || (likeButton = ogvInline.getLikeButton()) == null) ? getAvId() : likeButton.getAid();
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
    public final List<Tag> getBadgesV2() {
        return this.badgesV2;
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

    @NotNull
    public final i getDefaultInlineProperty() {
        return this.defaultInlineProperty;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public Long getDuration() {
        return getPlayerArgs() != null ? Long.valueOf(r0.fakeDuration) : null;
    }

    public long getEpId() {
        PlayerArgs playerArgs = getPlayerArgs();
        return playerArgs != null ? playerArgs.epid : 0L;
    }

    @Override // dt0.AbstractC6841d
    @Nullable
    public String getExtraUri() {
        OgvInline ogvInline = this.ogvInline;
        return ogvInline != null ? ogvInline.getExtraUri() : null;
    }

    @Nullable
    public final String getFace() {
        return this.face;
    }

    @NotNull
    public String getFrom() {
        return "3";
    }

    @NotNull
    public String getFromSpmid() {
        return "search.search-result.0.0";
    }

    @NotNull
    public IInlineBehavior getInlineBehavior() {
        return this.mInlineBehavior;
    }

    @NotNull
    public IInlinePlayItem getInlinePlayerItem() {
        return this.mInlinePlayItem;
    }

    @NotNull
    public InlineReportParam getInlineReportParams() {
        return new InlineReportParam(getGoTo() != null ? getGoTo() : "", getAvId(), getCId(), getEpId(), getSeasonId(), 0L, (String) null, 64, (DefaultConstructorMarker) null);
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
        OgvInline ogvInline = this.ogvInline;
        return (ogvInline == null || (likeButton = ogvInline.getLikeButton()) == null) ? 0L : likeButton.getCount();
    }

    public boolean getLikeState() {
        OgvInline ogvInline = this.ogvInline;
        boolean z6 = false;
        if (ogvInline != null) {
            SearchLikeButtonItem likeButton = ogvInline.getLikeButton();
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

    @NotNull
    public final IInlineBehavior getMInlineBehavior() {
        return this.mInlineBehavior;
    }

    @NotNull
    public final IInlinePlayItem getMInlinePlayItem() {
        return this.mInlinePlayItem;
    }

    public final long getMid() {
        return this.mid;
    }

    @Nullable
    public final String getOgvAggregateTitle() {
        return this.ogvAggregateTitle;
    }

    @Nullable
    public final SearchOgvClipInfo getOgvClipInfo() {
        return this.ogvClipInfo;
    }

    @Nullable
    public final OgvInline getOgvInline() {
        return this.ogvInline;
    }

    @Override // dt0.InterfaceC6845h
    public int getOgvSubType() {
        PlayerArgs playerArgs = getPlayerArgs();
        return playerArgs != null ? playerArgs.subtype : 0;
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
        OgvInline ogvInline = this.ogvInline;
        return ogvInline != null ? ogvInline.getPlayerArgs() : null;
    }

    @Nullable
    public Boolean getRelationCoinState() {
        OgvInline ogvInline = this.ogvInline;
        return ogvInline != null ? Boolean.valueOf(ogvInline.isCoin()) : null;
    }

    @Nullable
    public Boolean getRelationFavoriteState() {
        OgvInline ogvInline = this.ogvInline;
        return ogvInline != null ? Boolean.valueOf(ogvInline.isFavorite()) : null;
    }

    @Nullable
    public Boolean getRelationFollowState() {
        OgvInline ogvInline = this.ogvInline;
        return ogvInline != null ? Boolean.valueOf(ogvInline.isAtten()) : null;
    }

    @Nullable
    public Long getRelationLikeNum() {
        SearchLikeButtonItem likeButton;
        OgvInline ogvInline = this.ogvInline;
        return (ogvInline == null || (likeButton = ogvInline.getLikeButton()) == null) ? null : Long.valueOf(likeButton.getCount());
    }

    @Nullable
    public Boolean getRelationLikeState() {
        SearchLikeButtonItem likeButton;
        OgvInline ogvInline = this.ogvInline;
        return (ogvInline == null || (likeButton = ogvInline.getLikeButton()) == null) ? null : Boolean.valueOf(likeButton.isSelected());
    }

    public /* bridge */ /* synthetic */ long getRoomId() {
        return 0L;
    }

    @Nullable
    public final com.bilibili.search2.api.b getSaleInfo() {
        return this.saleInfo;
    }

    @Nullable
    public final String getScore() {
        return this.score;
    }

    public long getSeasonId() {
        PlayerArgs playerArgs = getPlayerArgs();
        return playerArgs != null ? playerArgs.pgcSeasonId : 0L;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    @Nullable
    public BaseSearchItem.Share getShare() {
        return this.share;
    }

    @Override // dt0.InterfaceC6845h
    public int getShareBusiness() {
        return 2;
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
        OgvInline ogvInline = this.ogvInline;
        return ogvInline != null ? ogvInline.getSharePlane() : null;
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
        return String.valueOf(getSeasonId());
    }

    @NotNull
    public String getSpmid() {
        return "search.search-result.0.0";
    }

    @Override // dt0.AbstractC6841d
    @Nullable
    public String getTargetUri() {
        OgvInline ogvInline = this.ogvInline;
        return ogvInline != null ? ogvInline.getUri() : null;
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public InlineThreePointPanel getThreePointMeta() {
        OgvInline ogvInline = this.ogvInline;
        return ogvInline != null ? ogvInline.getThreePointMeta() : null;
    }

    @Override // dt0.AbstractC6841d
    @Nullable
    public TrafficConfig getTrafficConfig() {
        OgvInline ogvInline = this.ogvInline;
        return ogvInline != null ? ogvInline.getTrafficConfig() : null;
    }

    @Override // com.bilibili.search2.result.k
    public long getUpMid() {
        Avatar avatar;
        OgvInline ogvInline = this.ogvInline;
        return (ogvInline == null || (avatar = ogvInline.getAvatar()) == null) ? -1L : avatar.getUpId();
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public /* bridge */ /* synthetic */ String getUpName() {
        return null;
    }

    @Nullable
    public String getUpperAvatar() {
        BaseSearchInlineData.UpArgs upArgs;
        OgvInline ogvInline = this.ogvInline;
        return (ogvInline == null || (upArgs = ogvInline.getUpArgs()) == null) ? null : upArgs.getUpFace();
    }

    @Nullable
    public String[] getUpperId() {
        BaseSearchInlineData.UpArgs upArgs;
        String strValueOf;
        OgvInline ogvInline = this.ogvInline;
        return (ogvInline == null || (upArgs = ogvInline.getUpArgs()) == null || (strValueOf = String.valueOf(upArgs.getUpId())) == null) ? null : new String[]{strValueOf};
    }

    @Nullable
    public String getUpperName() {
        BaseSearchInlineData.UpArgs upArgs;
        OgvInline ogvInline = this.ogvInline;
        return (ogvInline == null || (upArgs = ogvInline.getUpArgs()) == null) ? null : upArgs.getUpName();
    }

    @NotNull
    public String getVideoId() {
        return String.valueOf(getCId());
    }

    @NotNull
    public String[] getVideoList() {
        return new String[]{String.valueOf(getCId())};
    }

    @Nullable
    public String getVideoTitle() {
        return null;
    }

    @Nullable
    public final X getWatchButton() {
        return this.watchButton;
    }

    @NotNull
    public String getWorkId() {
        return String.valueOf(getAvId());
    }

    @Nullable
    public String getWorkTitle() {
        OgvInline ogvInline = this.ogvInline;
        return ogvInline != null ? ogvInline.getTitle() : null;
    }

    @Nullable
    public final SearchOgvClipInfo hasOgvClip() {
        SearchOgvClipInfo searchOgvClipInfo = this.ogvClipInfo;
        return (searchOgvClipInfo == null || !searchOgvClipInfo.isValid()) ? null : this.ogvClipInfo;
    }

    public boolean hasTripleLike() {
        SearchLikeButtonItem likeButton;
        OgvInline ogvInline = this.ogvInline;
        boolean z6 = false;
        if (ogvInline != null ? ogvInline.isCoin() : false) {
            OgvInline ogvInline2 = this.ogvInline;
            z6 = false;
            if (ogvInline2 != null ? ogvInline2.isFavorite() : false) {
                OgvInline ogvInline3 = this.ogvInline;
                z6 = false;
                if ((ogvInline3 == null || (likeButton = ogvInline3.getLikeButton()) == null || !likeButton.isSelected()) ? false : true) {
                    z6 = true;
                }
            }
        }
        return z6;
    }

    public int hashCode() {
        String str = this.author;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Integer num = this.danmaku;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        String str2 = this.desc;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.face;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.inlineType;
        int iA = C3554n0.a(C3554n0.a(((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.mid), 31, this.play);
        BaseSearchItem.Share share = this.share;
        int iHashCode6 = share == null ? 0 : share.hashCode();
        OgvInline ogvInline = this.ogvInline;
        int iHashCode7 = ogvInline == null ? 0 : ogvInline.hashCode();
        SearchOgvClipInfo searchOgvClipInfo = this.ogvClipInfo;
        int iHashCode8 = searchOgvClipInfo == null ? 0 : searchOgvClipInfo.hashCode();
        X x6 = this.watchButton;
        int iHashCode9 = x6 == null ? 0 : x6.hashCode();
        String str5 = this.score;
        int iHashCode10 = str5 == null ? 0 : str5.hashCode();
        List<Tag> list = this.badgesV2;
        int iHashCode11 = list == null ? 0 : list.hashCode();
        com.bilibili.search2.api.b bVar = this.saleInfo;
        int iHashCode12 = bVar == null ? 0 : bVar.hashCode();
        String str6 = this.ogvAggregateTitle;
        if (str6 != null) {
            iHashCode = str6.hashCode();
        }
        return this.inlineTitleStyle.hashCode() + ((((((((((((((((iA + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode) * 31);
    }

    @Override // dt0.InterfaceC6845h
    public boolean isFavorite() {
        OgvInline ogvInline = this.ogvInline;
        return ogvInline != null ? ogvInline.isFavorite() : false;
    }

    @Override // dt0.InterfaceC6845h
    public /* bridge */ /* synthetic */ boolean isHot() {
        return false;
    }

    public final boolean isPreview() {
        OgvInline ogvInline = this.ogvInline;
        boolean z6 = false;
        if (ogvInline != null) {
            PlayerArgs playerArgs = ogvInline.getPlayerArgs();
            z6 = false;
            if (playerArgs != null) {
                z6 = false;
                if (playerArgs.isPreview == 1) {
                    z6 = true;
                }
            }
        }
        return z6;
    }

    public boolean isTripleLikeCoin() {
        OgvInline ogvInline = this.ogvInline;
        return ogvInline != null ? ogvInline.isCoin() : false;
    }

    public boolean isTripleLikeFav() {
        OgvInline ogvInline = this.ogvInline;
        return ogvInline != null ? ogvInline.isFavorite() : false;
    }

    public final void setAuthor(@Nullable String str) {
        this.author = str;
    }

    public final void setBadgesV2(@Nullable List<Tag> list) {
        this.badgesV2 = list;
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

    public final void setFace(@Nullable String str) {
        this.face = str;
    }

    @Override // dt0.InterfaceC6845h
    public void setFavorite(boolean z6) {
        OgvInline ogvInline = this.ogvInline;
        if (ogvInline != null) {
            ogvInline.setFavorite(z6);
        }
    }

    public final void setInlineTitleStyle(@NotNull OgvClusterInlineTitleStyle ogvClusterInlineTitleStyle) {
        this.inlineTitleStyle = ogvClusterInlineTitleStyle;
    }

    public final void setInlineType(@Nullable String str) {
        this.inlineType = str;
    }

    @Override // com.bilibili.search2.result.n
    public void setIsFav(boolean z6) {
        OgvInline ogvInline = this.ogvInline;
        if (ogvInline != null) {
            ogvInline.setFavorite(z6);
        }
    }

    @Override // com.bilibili.search2.result.k
    public void setIsFollow(boolean z6) {
        OgvInline ogvInline = this.ogvInline;
        if (ogvInline != null) {
            ogvInline.setAtten(z6);
        }
    }

    @Override // com.bilibili.search2.result.n
    public void setIsLike(boolean z6) {
        SearchLikeButtonItem likeButton;
        OgvInline ogvInline = this.ogvInline;
        if (ogvInline == null || (likeButton = ogvInline.getLikeButton()) == null) {
            return;
        }
        likeButton.setSelected(z6 ? 1 : 0);
    }

    @Override // com.bilibili.search2.result.n
    public void setLikeCount(long j7) {
        SearchLikeButtonItem likeButton;
        OgvInline ogvInline = this.ogvInline;
        if (ogvInline == null || (likeButton = ogvInline.getLikeButton()) == null) {
            return;
        }
        likeButton.setCount(j7);
    }

    public final void setMid(long j7) {
        this.mid = j7;
    }

    public final void setOgvAggregateTitle(@Nullable String str) {
        this.ogvAggregateTitle = str;
    }

    public final void setOgvClipInfo(@Nullable SearchOgvClipInfo searchOgvClipInfo) {
        this.ogvClipInfo = searchOgvClipInfo;
    }

    public final void setOgvInline(@Nullable OgvInline ogvInline) {
        this.ogvInline = ogvInline;
    }

    public final void setPlay(long j7) {
        this.play = j7;
    }

    public final void setSaleInfo(@Nullable com.bilibili.search2.api.b bVar) {
        this.saleInfo = bVar;
    }

    public final void setScore(@Nullable String str) {
        this.score = str;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public void setShare(@Nullable BaseSearchItem.Share share) {
        this.share = share;
    }

    public void setTripleLikeCoin(boolean z6) {
    }

    public void setTripleLikeFav(boolean z6) {
    }

    public final void setWatchButton(@Nullable X x6) {
        this.watchButton = x6;
    }

    @NotNull
    public String toString() {
        String str = this.author;
        Integer num = this.danmaku;
        String str2 = this.desc;
        String str3 = this.face;
        String str4 = this.inlineType;
        long j7 = this.mid;
        long j8 = this.play;
        BaseSearchItem.Share share = this.share;
        OgvInline ogvInline = this.ogvInline;
        SearchOgvClipInfo searchOgvClipInfo = this.ogvClipInfo;
        X x6 = this.watchButton;
        String str5 = this.score;
        List<Tag> list = this.badgesV2;
        com.bilibili.search2.api.b bVar = this.saleInfo;
        String str6 = this.ogvAggregateTitle;
        OgvClusterInlineTitleStyle ogvClusterInlineTitleStyle = this.inlineTitleStyle;
        StringBuilder sbA = Id.a.a("SearchOgvInline(author=", num, str, ", danmaku=", ", desc=");
        B.a(str2, ", face=", str3, ", inlineType=", sbA);
        v.a(j7, str4, ", mid=", sbA);
        z.a(j8, ", play=", ", share=", sbA);
        sbA.append(share);
        sbA.append(", ogvInline=");
        sbA.append(ogvInline);
        sbA.append(", ogvClipInfo=");
        sbA.append(searchOgvClipInfo);
        sbA.append(", watchButton=");
        sbA.append(x6);
        sbA.append(", score=");
        M6.f.a(str5, ", badgesV2=", ", saleInfo=", sbA, list);
        sbA.append(bVar);
        sbA.append(", ogvAggregateTitle=");
        sbA.append(str6);
        sbA.append(", inlineTitleStyle=");
        sbA.append(ogvClusterInlineTitleStyle);
        sbA.append(")");
        return sbA.toString();
    }

    public final void updateByMsg(@NotNull VideoStatusMessage videoStatusMessage) {
        OgvInline ogvInline = this.ogvInline;
        if (ogvInline != null) {
            ogvInline.setCoin(videoStatusMessage.getCoinState());
        }
        updateLikeState(videoStatusMessage.getLikeState(), videoStatusMessage.getLikeCount());
        OgvInline ogvInline2 = this.ogvInline;
        if (ogvInline2 != null) {
            ogvInline2.setFavorite(videoStatusMessage.getFavState());
        }
    }

    public void updateLikeState(boolean z6, long j7) {
        SearchLikeButtonItem likeButton;
        SearchLikeButtonItem likeButton2;
        if (j7 >= 0) {
            OgvInline ogvInline = this.ogvInline;
            if (ogvInline == null || (likeButton2 = ogvInline.getLikeButton()) == null) {
                return;
            }
            likeButton2.updateSelected(z6, j7);
            return;
        }
        OgvInline ogvInline2 = this.ogvInline;
        if (ogvInline2 == null || (likeButton = ogvInline2.getLikeButton()) == null) {
            return;
        }
        likeButton.updateSelected(z6);
    }
}
