package com.bilibili.search2.api;

import Dt0.i;
import J1.z;
import androidx.annotation.Keep;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.B;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.app.translation.v1.TranslationBusiness;
import com.bapis.bilibili.polymer.app.search.v1.SearchLiveInlineCard;
import com.bapis.bilibili.polymer.app.search.v1.ThreePoint;
import com.bilibili.app.comm.list.common.api.model.PlayerArgs;
import com.bilibili.app.comm.list.common.data.InlineThreePointPanel;
import com.bilibili.app.comm.list.common.data.SharePlane;
import com.bilibili.app.comm.list.common.inline.service.InlinePendantAvatar;
import com.bilibili.inline.card.DefaultInlineProperty;
import com.bilibili.inline.card.IInlineBehavior;
import com.bilibili.inline.card.IInlinePlayItem;
import com.bilibili.inline.card.IInlineProperty;
import com.bilibili.inline.utils.InlineReportParam;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.inline.Avatar;
import com.bilibili.search2.inline.TrafficConfig;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import dt0.AbstractC6841d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchLiveInline.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchLiveInline extends AbstractC6841d implements com.bilibili.search2.api.oversea.a {
    public static final int $stable = 8;

    @JSONField(name = "avatar_item")
    @Nullable
    private o10.a avatarItem;

    @JSONField(name = "cover")
    @Nullable
    private String cover;

    @NotNull
    private final i defaultInlineProperty;

    @NotNull
    private final IInlineBehavior inlineBehavior;

    @JSONField(name = "live_room_inline")
    @Nullable
    private SearchLiveInlineData inlineLive;

    @NotNull
    private final IInlinePlayItem inlinePlayItem;

    @NotNull
    private OgvClusterInlineTitleStyle inlineTitleStyle;

    @JSONField(name = "inline_type")
    @Nullable
    private String inlineType;

    @JSONField(name = "live_link")
    @Nullable
    private String liveLink;

    @JSONField(name = EditCustomizeSticker.TAG_MID)
    private long mid;

    @JSONField(name = "rcmd_reason_style")
    @Nullable
    private Tag rcmdReasonStyle;

    @JSONField(name = "roomid")
    private long roomid;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchLiveInline$a.class */
    public static final class a implements IInlineBehavior {
        public final boolean getCardPlayable(boolean z6) {
            return z6;
        }

        public final boolean getReleaseOnEnd() {
            return false;
        }

        public final int getRepeatCount() {
            return 1;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchLiveInline$b.class */
    public static final class b implements IInlinePlayItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SearchLiveInline f86287a;

        public b(SearchLiveInline searchLiveInline) {
            this.f86287a = searchLiveInline;
        }

        public final CharSequence getInlineLogDescription() {
            return "SearchNormalLiveInline";
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x002d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final tv.danmaku.biliplayerv2.service.Video.PlayableParams getInlinePlayableParams() {
            /*
                r6 = this;
                com.bilibili.bililive.listplayer.videonew.player.InlineLivePlayableParams r0 = new com.bilibili.bililive.listplayer.videonew.player.InlineLivePlayableParams
                r1 = r0
                r1.<init>()
                r11 = r0
                r0 = r6
                com.bilibili.search2.api.SearchLiveInline r0 = r0.f86287a
                r12 = r0
                r0 = r12
                long r0 = r0.getRoomid()
                r7 = r0
                r0 = r12
                com.bilibili.search2.api.SearchLiveInlineData r0 = r0.getInlineLive()
                r9 = r0
                r0 = r9
                if (r0 == 0) goto L2d
                r0 = r9
                java.lang.String r0 = r0.getUri()
                r10 = r0
                r0 = r10
                r9 = r0
                r0 = r10
                if (r0 != 0) goto L33
            L2d:
                r0 = r12
                java.lang.String r0 = r0.getLiveLink()
                r9 = r0
            L33:
                r0 = r12
                com.bilibili.search2.api.SearchLiveInlineData r0 = r0.getInlineLive()
                r10 = r0
                r0 = r10
                if (r0 == 0) goto L4c
                r0 = r10
                boolean r0 = r0.getDisableDanmaku()
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r10 = r0
                goto L4f
            L4c:
                r0 = 0
                r10 = r0
            L4f:
                r0 = r11
                r1 = r7
                r2 = r9
                r3 = r10
                com.bilibili.search2.utils.B.b(r0, r1, r2, r3)
                r0 = r11
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.api.SearchLiveInline.b.getInlinePlayableParams():tv.danmaku.biliplayerv2.service.Video$PlayableParams");
        }
    }

    public SearchLiveInline() {
        this(0L, null, 0L, null, null, null, null, null, null, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKY_RESULT_ROTATE, null);
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [com.bilibili.inline.card.IInlineBehavior, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [Dt0.i, com.bilibili.inline.card.DefaultInlineProperty] */
    public SearchLiveInline(long j7, @Nullable Tag tag, long j8, @Nullable String str, @Nullable String str2, @Nullable SearchLiveInlineData searchLiveInlineData, @Nullable String str3, @Nullable o10.a aVar, @NotNull OgvClusterInlineTitleStyle ogvClusterInlineTitleStyle) {
        this.mid = j7;
        this.rcmdReasonStyle = tag;
        this.roomid = j8;
        this.liveLink = str;
        this.inlineType = str2;
        this.inlineLive = searchLiveInlineData;
        this.cover = str3;
        this.avatarItem = aVar;
        this.inlineTitleStyle = ogvClusterInlineTitleStyle;
        this.defaultInlineProperty = new DefaultInlineProperty();
        this.inlinePlayItem = new b(this);
        this.inlineBehavior = new Object();
    }

    public /* synthetic */ SearchLiveInline(long j7, Tag tag, long j8, String str, String str2, SearchLiveInlineData searchLiveInlineData, String str3, o10.a aVar, OgvClusterInlineTitleStyle ogvClusterInlineTitleStyle, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0L : j7, (i7 & 2) != 0 ? null : tag, (i7 & 4) != 0 ? 0L : j8, (i7 & 8) != 0 ? null : str, (i7 & 16) != 0 ? null : str2, (i7 & 32) != 0 ? null : searchLiveInlineData, (i7 & 64) != 0 ? null : str3, (i7 & 128) != 0 ? null : aVar, (i7 & 256) != 0 ? OgvClusterInlineTitleStyle.INLINE_TITLE_ORIGIN_TITLE : ogvClusterInlineTitleStyle);
    }

    public SearchLiveInline(@NotNull SearchLiveInlineCard searchLiveInlineCard) {
        this(0L, null, 0L, null, null, null, null, null, null, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKY_RESULT_ROTATE, null);
        this.mid = searchLiveInlineCard.getMid();
        if (searchLiveInlineCard.hasRcmdReasonStyle()) {
            this.rcmdReasonStyle = new Tag(searchLiveInlineCard.getRcmdReasonStyle());
        }
        this.roomid = searchLiveInlineCard.getRoomid();
        this.liveLink = searchLiveInlineCard.getLiveLink();
        this.inlineType = searchLiveInlineCard.getInlineType();
        if (searchLiveInlineCard.hasLiveRoomInline()) {
            this.inlineLive = new SearchLiveInlineData(searchLiveInlineCard.getLiveRoomInline());
        }
        setTitle(searchLiveInlineCard.getTitle());
        setCover(searchLiveInlineCard.getCover());
        if (searchLiveInlineCard.hasFeedback()) {
            setFeedback(new BaseSearchItem.Feedback(searchLiveInlineCard.getFeedback()));
        }
        if (searchLiveInlineCard.hasAvatarInfo()) {
            this.avatarItem = r10.a.a(searchLiveInlineCard.getAvatarInfo());
        }
        List threePointList = searchLiveInlineCard.getThreePointList();
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
        this.inlineTitleStyle = (OgvClusterInlineTitleStyle) OgvClusterInlineTitleStyle.getEntries().get(searchLiveInlineCard.getInlineTitleStyle());
        setTranslatedTitle(searchLiveInlineCard.getTranslatedTitle());
        setTranslatedStatus(searchLiveInlineCard.getTranslationStatus());
    }

    public static /* synthetic */ SearchLiveInline copy$default(SearchLiveInline searchLiveInline, long j7, Tag tag, long j8, String str, String str2, SearchLiveInlineData searchLiveInlineData, String str3, o10.a aVar, OgvClusterInlineTitleStyle ogvClusterInlineTitleStyle, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j7 = searchLiveInline.mid;
        }
        if ((i7 & 2) != 0) {
            tag = searchLiveInline.rcmdReasonStyle;
        }
        if ((i7 & 4) != 0) {
            j8 = searchLiveInline.roomid;
        }
        if ((i7 & 8) != 0) {
            str = searchLiveInline.liveLink;
        }
        if ((i7 & 16) != 0) {
            str2 = searchLiveInline.inlineType;
        }
        if ((i7 & 32) != 0) {
            searchLiveInlineData = searchLiveInline.inlineLive;
        }
        if ((i7 & 64) != 0) {
            str3 = searchLiveInline.cover;
        }
        if ((i7 & 128) != 0) {
            aVar = searchLiveInline.avatarItem;
        }
        if ((i7 & 256) != 0) {
            ogvClusterInlineTitleStyle = searchLiveInline.inlineTitleStyle;
        }
        return searchLiveInline.copy(j7, tag, j8, str, str2, searchLiveInlineData, str3, aVar, ogvClusterInlineTitleStyle);
    }

    public final long component1() {
        return this.mid;
    }

    @Nullable
    public final Tag component2() {
        return this.rcmdReasonStyle;
    }

    public final long component3() {
        return this.roomid;
    }

    @Nullable
    public final String component4() {
        return this.liveLink;
    }

    @Nullable
    public final String component5() {
        return this.inlineType;
    }

    @Nullable
    public final SearchLiveInlineData component6() {
        return this.inlineLive;
    }

    @Nullable
    public final String component7() {
        return this.cover;
    }

    @Nullable
    public final o10.a component8() {
        return this.avatarItem;
    }

    @NotNull
    public final OgvClusterInlineTitleStyle component9() {
        return this.inlineTitleStyle;
    }

    @NotNull
    public final SearchLiveInline copy(long j7, @Nullable Tag tag, long j8, @Nullable String str, @Nullable String str2, @Nullable SearchLiveInlineData searchLiveInlineData, @Nullable String str3, @Nullable o10.a aVar, @NotNull OgvClusterInlineTitleStyle ogvClusterInlineTitleStyle) {
        return new SearchLiveInline(j7, tag, j8, str, str2, searchLiveInlineData, str3, aVar, ogvClusterInlineTitleStyle);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchLiveInline)) {
            return false;
        }
        SearchLiveInline searchLiveInline = (SearchLiveInline) obj;
        return this.mid == searchLiveInline.mid && Intrinsics.areEqual(this.rcmdReasonStyle, searchLiveInline.rcmdReasonStyle) && this.roomid == searchLiveInline.roomid && Intrinsics.areEqual(this.liveLink, searchLiveInline.liveLink) && Intrinsics.areEqual(this.inlineType, searchLiveInline.inlineType) && Intrinsics.areEqual(this.inlineLive, searchLiveInline.inlineLive) && Intrinsics.areEqual(this.cover, searchLiveInline.cover) && Intrinsics.areEqual(this.avatarItem, searchLiveInline.avatarItem) && this.inlineTitleStyle == searchLiveInline.inlineTitleStyle;
    }

    @Override // com.bilibili.search2.api.oversea.a
    @NotNull
    public /* bridge */ /* synthetic */ List getAllItems() {
        return super.getAllItems();
    }

    @Override // dt0.InterfaceC6845h, com.bilibili.search2.result.n
    public /* bridge */ /* synthetic */ long getAvId() {
        return 0L;
    }

    @Nullable
    public final o10.a getAvatarItem() {
        return this.avatarItem;
    }

    @Override // dt0.InterfaceC6845h
    public /* bridge */ /* synthetic */ long getCId() {
        return 0L;
    }

    @NotNull
    public IInlineProperty getCardPlayProperty() {
        return this.defaultInlineProperty;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    @Nullable
    public String getCover() {
        return this.cover;
    }

    public /* bridge */ /* synthetic */ long getEpId() {
        return 0L;
    }

    @NotNull
    public IInlineBehavior getInlineBehavior() {
        return this.inlineBehavior;
    }

    @Nullable
    public final SearchLiveInlineData getInlineLive() {
        return this.inlineLive;
    }

    @JSONField(deserialize = false, serialize = false)
    @Nullable
    public final Avatar getInlineLiveAvatar() {
        SearchLiveInlineData searchLiveInlineData = this.inlineLive;
        return searchLiveInlineData != null ? searchLiveInlineData.getAvatar() : null;
    }

    @NotNull
    public IInlinePlayItem getInlinePlayerItem() {
        return this.inlinePlayItem;
    }

    @Nullable
    public InlineReportParam getInlineReportParams() {
        return new InlineReportParam(getGoTo() != null ? getGoTo() : "", 0L, 0L, 0L, 0L, this.roomid, (String) null, 64, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final OgvClusterInlineTitleStyle getInlineTitleStyle() {
        return this.inlineTitleStyle;
    }

    @Nullable
    public final String getInlineType() {
        return this.inlineType;
    }

    @Nullable
    public final String getLiveLink() {
        return this.liveLink;
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
        return getRoomId();
    }

    @Nullable
    public final InlinePendantAvatar getPendantAvatar() {
        SearchLiveInlineData searchLiveInlineData = this.inlineLive;
        InlinePendantAvatar inlinePendantAvatar = null;
        Avatar avatar = searchLiveInlineData != null ? searchLiveInlineData.getAvatar() : null;
        if (avatar != null) {
            String cover = avatar.getCover();
            String text = avatar.getText();
            String uri = avatar.getUri();
            String event = avatar.getEvent();
            String eventV2 = avatar.getEventV2();
            long upId = avatar.getUpId();
            SearchLiveInlineData searchLiveInlineData2 = this.inlineLive;
            int i7 = (searchLiveInlineData2 == null || !searchLiveInlineData2.isAtten()) ? 0 : 1;
            SearchLiveInlineData searchLiveInlineData3 = this.inlineLive;
            inlinePendantAvatar = new InlinePendantAvatar(cover, text, uri, event, eventV2, 0, upId, i7, searchLiveInlineData3 != null ? searchLiveInlineData3.getOfficialIconV2() : 0);
        }
        return inlinePendantAvatar;
    }

    @Override // dt0.AbstractC6841d
    @Nullable
    public PlayerArgs getPlayerArgs() {
        SearchLiveInlineData searchLiveInlineData = this.inlineLive;
        return searchLiveInlineData != null ? searchLiveInlineData.getPlayerArgs() : null;
    }

    @Nullable
    public final Tag getRcmdReasonStyle() {
        return this.rcmdReasonStyle;
    }

    public long getRoomId() {
        PlayerArgs playerArgs = getPlayerArgs();
        return playerArgs != null ? playerArgs.roomId : 0L;
    }

    public final long getRoomid() {
        return this.roomid;
    }

    public /* bridge */ /* synthetic */ long getSeasonId() {
        return 0L;
    }

    @Override // dt0.InterfaceC6845h
    public int getShareBusiness() {
        return 3;
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
        SearchLiveInlineData searchLiveInlineData = this.inlineLive;
        return searchLiveInlineData != null ? searchLiveInlineData.getSharePlane() : null;
    }

    @Nullable
    public /* bridge */ /* synthetic */ String getShareSpmid() {
        return "search.search-result.0.0";
    }

    @Override // dt0.InterfaceC6845h
    public int getShareType() {
        return 1;
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public /* bridge */ /* synthetic */ String getSid() {
        return null;
    }

    @Override // com.bilibili.search2.api.oversea.a
    @NotNull
    public List getSubItems() {
        return CollectionsKt.emptyList();
    }

    @Override // dt0.AbstractC6841d
    @Nullable
    public String getTargetUri() {
        SearchLiveInlineData searchLiveInlineData = this.inlineLive;
        return searchLiveInlineData != null ? searchLiveInlineData.getUri() : null;
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public InlineThreePointPanel getThreePointMeta() {
        SearchLiveInlineData searchLiveInlineData = this.inlineLive;
        return searchLiveInlineData != null ? searchLiveInlineData.getThreePointMeta() : null;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    @Nullable
    public String getTitle() {
        SearchLiveInlineData searchLiveInlineData = this.inlineLive;
        return searchLiveInlineData != null ? searchLiveInlineData.getTitle() : null;
    }

    @Override // dt0.AbstractC6841d
    @Nullable
    public TrafficConfig getTrafficConfig() {
        SearchLiveInlineData searchLiveInlineData = this.inlineLive;
        return searchLiveInlineData != null ? searchLiveInlineData.getTrafficConfig() : null;
    }

    @Override // com.bilibili.search2.api.oversea.a
    @NotNull
    public com.bilibili.search2.api.oversea.c getTranslateRequestParam() {
        TranslationBusiness translationBusiness = TranslationBusiness.TRANS_BIZ_LIVE;
        String param = getParam();
        String str = param;
        if (param == null) {
            str = "";
        }
        return new com.bilibili.search2.api.oversea.c(translationBusiness, str);
    }

    @Override // com.bilibili.search2.api.BaseSearchItem, com.bilibili.search2.api.oversea.a
    @Nullable
    public String getTranslatedTitle() {
        SearchLiveInlineData searchLiveInlineData = this.inlineLive;
        return searchLiveInlineData != null ? searchLiveInlineData.getTranslatedTitle() : null;
    }

    @Override // com.bilibili.search2.result.k
    public long getUpMid() {
        Avatar avatar;
        SearchLiveInlineData searchLiveInlineData = this.inlineLive;
        return (searchLiveInlineData == null || (avatar = searchLiveInlineData.getAvatar()) == null) ? -1L : avatar.getUpId();
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public /* bridge */ /* synthetic */ String getUpName() {
        return null;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.mid);
        Tag tag = this.rcmdReasonStyle;
        int iHashCode2 = 0;
        int iA = C3554n0.a(((iHashCode * 31) + (tag == null ? 0 : tag.hashCode())) * 31, 31, this.roomid);
        String str = this.liveLink;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.inlineType;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        SearchLiveInlineData searchLiveInlineData = this.inlineLive;
        int iHashCode5 = searchLiveInlineData == null ? 0 : searchLiveInlineData.hashCode();
        String str3 = this.cover;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        o10.a aVar = this.avatarItem;
        if (aVar != null) {
            iHashCode2 = aVar.hashCode();
        }
        return this.inlineTitleStyle.hashCode() + ((((((((((iA + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode2) * 31);
    }

    @Override // dt0.InterfaceC6845h
    public /* bridge */ /* synthetic */ boolean isFavorite() {
        return false;
    }

    @Override // dt0.InterfaceC6845h
    public /* bridge */ /* synthetic */ boolean isHot() {
        return false;
    }

    public final void setAvatarItem(@Nullable o10.a aVar) {
        this.avatarItem = aVar;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public void setCover(@Nullable String str) {
        this.cover = str;
    }

    @Override // dt0.InterfaceC6845h
    public /* bridge */ /* synthetic */ void setFavorite(boolean z6) {
    }

    public final void setInlineLive(@Nullable SearchLiveInlineData searchLiveInlineData) {
        this.inlineLive = searchLiveInlineData;
    }

    public final void setInlineTitleStyle(@NotNull OgvClusterInlineTitleStyle ogvClusterInlineTitleStyle) {
        this.inlineTitleStyle = ogvClusterInlineTitleStyle;
    }

    public final void setInlineType(@Nullable String str) {
        this.inlineType = str;
    }

    @Override // com.bilibili.search2.result.k
    public void setIsFollow(boolean z6) {
        SearchLiveInlineData searchLiveInlineData = this.inlineLive;
        if (searchLiveInlineData != null) {
            searchLiveInlineData.setAtten(z6);
        }
    }

    public final void setLiveLink(@Nullable String str) {
        this.liveLink = str;
    }

    public final void setMid(long j7) {
        this.mid = j7;
    }

    public final void setRcmdReasonStyle(@Nullable Tag tag) {
        this.rcmdReasonStyle = tag;
    }

    public final void setRoomid(long j7) {
        this.roomid = j7;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public void setTitle(@Nullable String str) {
        SearchLiveInlineData searchLiveInlineData = this.inlineLive;
        if (searchLiveInlineData != null) {
            searchLiveInlineData.setTitle(str);
        }
    }

    @Override // com.bilibili.search2.api.BaseSearchItem, com.bilibili.search2.api.oversea.a
    public void setTranslatedTitle(@Nullable String str) {
        SearchLiveInlineData searchLiveInlineData = this.inlineLive;
        if (searchLiveInlineData != null) {
            searchLiveInlineData.setTranslatedTitle(str);
        }
    }

    @NotNull
    public String toString() {
        long j7 = this.mid;
        Tag tag = this.rcmdReasonStyle;
        long j8 = this.roomid;
        String str = this.liveLink;
        String str2 = this.inlineType;
        SearchLiveInlineData searchLiveInlineData = this.inlineLive;
        String str3 = this.cover;
        o10.a aVar = this.avatarItem;
        OgvClusterInlineTitleStyle ogvClusterInlineTitleStyle = this.inlineTitleStyle;
        StringBuilder sb = new StringBuilder("SearchLiveInline(mid=");
        sb.append(j7);
        sb.append(", rcmdReasonStyle=");
        sb.append(tag);
        z.a(j8, ", roomid=", ", liveLink=", sb);
        B.a(str, ", inlineType=", str2, ", inlineLive=", sb);
        sb.append(searchLiveInlineData);
        sb.append(", cover=");
        sb.append(str3);
        sb.append(", avatarItem=");
        sb.append(aVar);
        sb.append(", inlineTitleStyle=");
        sb.append(ogvClusterInlineTitleStyle);
        sb.append(")");
        return sb.toString();
    }
}
