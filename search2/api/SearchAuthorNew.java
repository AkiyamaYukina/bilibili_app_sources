package com.bilibili.search2.api;

import Ps0.C2784e;
import android.graphics.Color;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.app.translation.v1.TranslationBusiness;
import com.bilibili.app.comm.list.common.data.InlineThreePointPanel;
import com.bilibili.app.comm.list.common.data.SharePlane;
import com.bilibili.app.comm.list.common.inline.service.InlinePendantAvatar;
import com.bilibili.app.comm.list.widget.utils.C;
import com.bilibili.app.comm.list.widget.utils.ListConstKt;
import com.bilibili.bililive.listplayer.videonew.player.InlineLivePlayableParams;
import com.bilibili.droid.StringUtil;
import com.bilibili.inline.card.DefaultInlineProperty;
import com.bilibili.inline.card.IInlineBehavior;
import com.bilibili.inline.card.IInlineCardData;
import com.bilibili.inline.card.IInlinePlayItem;
import com.bilibili.inline.card.IInlineProperty;
import com.bilibili.inline.utils.InlineReportParam;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.inline.Avatar;
import com.bilibili.search2.inline.InlineLive;
import com.bilibili.search2.utils.B;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import dt0.InterfaceC6844g;
import dt0.InterfaceC6845h;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.Video;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchAuthorNew.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchAuthorNew extends BaseSearchItem implements IInlineCardData, InterfaceC6845h, com.bilibili.search2.api.oversea.a, InterfaceC6844g {
    public static final int $stable = 8;
    public static final int AV_ITEMS_MAX_LENGTH = 20;

    @NotNull
    public static final a Companion = new Object();

    @JSONField(deserialize = false, serialize = false)
    @NotNull
    private static final String INLINE_LIVE_TYPE = "live_room";

    @JSONField(name = "three_point_meta")
    @Nullable
    private InlineThreePointPanel InlineThreePointPanel;

    @JSONField(name = "archives")
    private int archives;

    @JSONField(name = "av_items")
    @Nullable
    private List<AvItem> avItems;

    @JSONField(name = "av_style")
    private int avStyle;

    @Nullable
    private o10.a avatarItem;

    @JSONField(name = "background")
    @Nullable
    private Background background;

    @JSONField(name = "face_nft_new")
    private int faceNftNew;

    @JSONField(name = "fans")
    private int fans;

    @JSONField(name = "inline_live")
    @Nullable
    private InlineLive inlineLive;

    @JSONField(name = "inline_type")
    @Nullable
    private String inlineType;

    @JSONField(name = "is_inline_live")
    private int isInlineLive;

    @JSONField(name = "is_senior_member")
    private int isSeniorMember;

    @JSONField(name = "is_up")
    private boolean isUp;

    @JSONField(name = "level")
    private int level;

    @JSONField(name = "live_face")
    private int liveFace;

    @JSONField(name = "live_link")
    @Nullable
    private String liveLink;

    @JSONField(name = "roomid")
    private long liveRoomId;

    @JSONField(name = "live_uri")
    @Nullable
    private String liveUri;

    @JSONField(name = EditCustomizeSticker.TAG_MID)
    private long mid;

    @JSONField(name = "nft_face_icon")
    @Nullable
    private SearchNftIconItem nftIconItem;

    @JSONField(name = "notice")
    @Nullable
    private PrInfo notice;

    @JSONField(name = "official_verify")
    @Nullable
    private SearchOfficialVerify officialVerify;

    @JSONField(name = "relation")
    @Nullable
    private BaseSearchItem.Relation relation;

    @JSONField(name = "share_plane")
    @Nullable
    private SharePlane sharePlane;

    @JSONField(name = "sign")
    @Nullable
    private String sign;

    @JSONField(name = "space")
    @Nullable
    private Space space;

    @Nullable
    private List<String> userInfo;

    @NotNull
    private final IInlinePlayItem inlinePlayItem = new c(this);

    @NotNull
    private final IInlineBehavior inlineBehavior = new Object();

    @NotNull
    private final DefaultInlineProperty defaultInlineProperty = new DefaultInlineProperty();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchAuthorNew$AvItem.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class AvItem extends BaseSearchItem implements com.bilibili.search2.api.oversea.a {
        public static final int $stable = 8;

        @JSONField(name = "ctime_label")
        @Nullable
        private String cTimeLabel;

        @JSONField(name = "ctime_label_v2")
        @Nullable
        private String cTimeLabelV2;

        @Nullable
        private C2784e chargeLabel;

        @JSONField(name = "danmaku")
        private long danmaku;

        @JSONField(name = EditCustomizeSticker.TAG_DURATION)
        @Nullable
        private String duration;

        @JSONField(name = "icon_type")
        private int iconType;

        @JSONField(name = "play")
        private long play;

        @JSONField(name = "view_content")
        @Nullable
        private String viewContent;

        public AvItem() {
        }

        public AvItem(@NotNull com.bapis.bilibili.polymer.app.search.v1.AvItem avItem, @Nullable String str) {
            this.cTimeLabel = avItem.getCtimeLabel();
            this.cTimeLabelV2 = avItem.getCtimeLabelV2();
            this.duration = avItem.getDuration();
            this.play = avItem.getPlay();
            this.danmaku = avItem.getDanmaku();
            setTitle(avItem.getTitle());
            setCover(avItem.getCover());
            setParam(avItem.getParam());
            setServerPagePos(avItem.getPosition());
            setGoTo(avItem.getGoto());
            setUri(avItem.getUri());
            setTrackId(str);
            this.viewContent = avItem.getViewContent();
            this.iconType = avItem.getIconType();
            if (avItem.hasChargingLabel()) {
                this.chargeLabel = new C2784e(avItem.getChargingLabel());
            }
            setTranslatedTitle(avItem.getTranslatedTitle());
        }

        @Override // com.bilibili.search2.api.oversea.a
        @NotNull
        public /* bridge */ /* synthetic */ List getAllItems() {
            return super.getAllItems();
        }

        @Nullable
        public final String getCTimeLabel() {
            return this.cTimeLabel;
        }

        @Nullable
        public final String getCTimeLabelV2() {
            return this.cTimeLabelV2;
        }

        @Nullable
        public final C2784e getChargeLabel() {
            return this.chargeLabel;
        }

        public final long getDanmaku() {
            return this.danmaku;
        }

        @Nullable
        public final String getDuration() {
            return this.duration;
        }

        public final int getIconType() {
            return this.iconType;
        }

        public final long getPlay() {
            return this.play;
        }

        @Override // com.bilibili.search2.api.oversea.a
        @NotNull
        public List getSubItems() {
            return CollectionsKt.emptyList();
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
        public final String getViewContent() {
            return this.viewContent;
        }

        public final void setCTimeLabel(@Nullable String str) {
            this.cTimeLabel = str;
        }

        public final void setCTimeLabelV2(@Nullable String str) {
            this.cTimeLabelV2 = str;
        }

        public final void setChargeLabel(@Nullable C2784e c2784e) {
            this.chargeLabel = c2784e;
        }

        public final void setDanmaku(long j7) {
            this.danmaku = j7;
        }

        public final void setDuration(@Nullable String str) {
            this.duration = str;
        }

        public final void setIconType(int i7) {
            this.iconType = i7;
        }

        public final void setPlay(long j7) {
            this.play = j7;
        }

        public final void setViewContent(@Nullable String str) {
            this.viewContent = str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchAuthorNew$Background.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class Background {
        public static final int $stable = 8;

        @JSONField(name = "bg_pic_url")
        @Nullable
        private String bgPicUrl;

        @JSONField(name = "fg_pic_url")
        @Nullable
        private String fgPicUrl;

        @JSONField(name = "show")
        private int show;

        public Background() {
        }

        public Background(@NotNull com.bapis.bilibili.polymer.app.search.v1.Background background) {
            this.show = background.getShow();
            this.bgPicUrl = background.getBgPicUrl();
            this.fgPicUrl = background.getFgPicUrl();
        }

        @Nullable
        public final String getBgPicUrl() {
            return this.bgPicUrl;
        }

        @Nullable
        public final String getFgPicUrl() {
            return this.fgPicUrl;
        }

        public final int getShow() {
            return this.show;
        }

        public final void setBgPicUrl(@Nullable String str) {
            this.bgPicUrl = str;
        }

        public final void setFgPicUrl(@Nullable String str) {
            this.fgPicUrl = str;
        }

        public final void setShow(int i7) {
            this.show = i7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchAuthorNew$Space.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class Space {
        public static final int $stable = 8;

        @JSONField(name = "show")
        private int show;

        @JSONField(name = "space_url")
        @Nullable
        private String spaceUrl;

        @JSONField(name = "text")
        @Nullable
        private String text;

        @JSONField(name = "text_color")
        @Nullable
        private String textColor;

        @JSONField(name = "text_color_night")
        @Nullable
        private String textColorNight;

        public Space() {
        }

        public Space(@NotNull com.bapis.bilibili.polymer.app.search.v1.Space space) {
            this.show = space.getShow();
            this.textColor = space.getTextColor();
            this.textColorNight = space.getTextColorNight();
            this.text = space.getText();
            this.spaceUrl = space.getSpaceUrl();
        }

        public final int getShow() {
            return this.show;
        }

        @Nullable
        public final String getSpaceUrl() {
            return this.spaceUrl;
        }

        @Nullable
        public final String getText() {
            return this.text;
        }

        @Nullable
        public final String getTextColor() {
            return this.textColor;
        }

        @Nullable
        public final String getTextColorNight() {
            return this.textColorNight;
        }

        public final void setShow(int i7) {
            this.show = i7;
        }

        public final void setSpaceUrl(@Nullable String str) {
            this.spaceUrl = str;
        }

        public final void setText(@Nullable String str) {
            this.text = str;
        }

        public final void setTextColor(@Nullable String str) {
            this.textColor = str;
        }

        public final void setTextColorNight(@Nullable String str) {
            this.textColorNight = str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchAuthorNew$a.class */
    public static final class a {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchAuthorNew$b.class */
    public static final class b implements IInlineBehavior {
        public final long getCardAutoPlayDelay() {
            return 0L;
        }

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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchAuthorNew$c.class */
    public static final class c implements IInlinePlayItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SearchAuthorNew f86280a;

        public c(SearchAuthorNew searchAuthorNew) {
            this.f86280a = searchAuthorNew;
        }

        public final CharSequence getInlineLogDescription() {
            return "SearchInline";
        }

        public final Video.PlayableParams getInlinePlayableParams() {
            InlineLivePlayableParams inlineLivePlayableParams = new InlineLivePlayableParams();
            SearchAuthorNew searchAuthorNew = this.f86280a;
            long liveRoomId = searchAuthorNew.getLiveRoomId();
            InlineLive inlineLive = searchAuthorNew.getInlineLive();
            Boolean boolValueOf = null;
            String uri = inlineLive != null ? inlineLive.getUri() : null;
            InlineLive inlineLive2 = searchAuthorNew.getInlineLive();
            if (inlineLive2 != null) {
                boolValueOf = Boolean.valueOf(inlineLive2.getDisableDanmaku());
            }
            B.b(inlineLivePlayableParams, liveRoomId, uri, boolValueOf);
            return inlineLivePlayableParams;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.bilibili.inline.card.IInlineBehavior, java.lang.Object] */
    public SearchAuthorNew() {
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x023a  */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.bilibili.inline.card.IInlineBehavior, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SearchAuthorNew(@org.jetbrains.annotations.NotNull com.bapis.bilibili.polymer.app.search.v1.SearchAuthorNewCard r7, @org.jetbrains.annotations.Nullable java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 656
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.api.SearchAuthorNew.<init>(com.bapis.bilibili.polymer.app.search.v1.SearchAuthorNewCard, java.lang.String):void");
    }

    private final int getIconRes(int i7) {
        C pegasusIcon = ListConstKt.getPegasusIcon(i7);
        return pegasusIcon != null ? pegasusIcon.a : 0;
    }

    private final int parseColor(String str) {
        int color = -1;
        if (!StringUtil.isBlank(str)) {
            try {
                color = Color.parseColor(str);
            } catch (Exception e7) {
                BLog.e("parse color error", e7.toString());
            }
        }
        return color;
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

    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean canShowBackground() {
        /*
            r3 = this;
            r0 = r3
            com.bilibili.search2.api.SearchAuthorNew$Background r0 = r0.background
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L25
            r0 = r6
            int r0 = r0.getShow()
            r4 = r0
            r0 = 1
            r5 = r0
            r0 = r4
            r1 = 1
            if (r0 != r1) goto L25
            r0 = r3
            com.bilibili.search2.api.SearchAuthorNew$Background r0 = r0.background
            java.lang.String r0 = r0.getBgPicUrl()
            boolean r0 = com.bilibili.droid.StringUtil.isBlank(r0)
            if (r0 != 0) goto L25
            goto L27
        L25:
            r0 = 0
            r5 = r0
        L27:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.api.SearchAuthorNew.canShowBackground():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean canShowVideoMore() {
        /*
            r3 = this;
            r0 = r3
            com.bilibili.search2.api.SearchAuthorNew$Space r0 = r0.space
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L32
            r0 = r6
            int r0 = r0.getShow()
            r4 = r0
            r0 = 1
            r5 = r0
            r0 = r4
            r1 = 1
            if (r0 != r1) goto L32
            r0 = r3
            com.bilibili.search2.api.SearchAuthorNew$Space r0 = r0.space
            java.lang.String r0 = r0.getText()
            boolean r0 = com.bilibili.droid.StringUtil.isBlank(r0)
            if (r0 != 0) goto L32
            r0 = r3
            com.bilibili.search2.api.SearchAuthorNew$Space r0 = r0.space
            java.lang.String r0 = r0.getSpaceUrl()
            boolean r0 = com.bilibili.droid.StringUtil.isBlank(r0)
            if (r0 != 0) goto L32
            goto L34
        L32:
            r0 = 0
            r5 = r0
        L34:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.api.SearchAuthorNew.canShowVideoMore():boolean");
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

    @Override // com.bilibili.search2.api.oversea.a
    @NotNull
    public /* bridge */ /* synthetic */ List getAllItems() {
        return super.getAllItems();
    }

    public final int getArchives() {
        return this.archives;
    }

    @Override // dt0.InterfaceC6845h, com.bilibili.search2.result.n
    public long getAvId() {
        return 0L;
    }

    @Nullable
    public final List<AvItem> getAvItems() {
        return this.avItems;
    }

    public final int getAvStyle() {
        return this.avStyle;
    }

    @Nullable
    public final o10.a getAvatarItem() {
        return this.avatarItem;
    }

    @Nullable
    public final Background getBackground() {
        return this.background;
    }

    @Override // dt0.InterfaceC6845h
    public long getCId() {
        return 0L;
    }

    @NotNull
    public IInlineProperty getCardPlayProperty() {
        return this.defaultInlineProperty;
    }

    public long getEpId() {
        return 0L;
    }

    public final int getFaceNftNew() {
        return this.faceNftNew;
    }

    public final int getFans() {
        return this.fans;
    }

    @NotNull
    public IInlineBehavior getInlineBehavior() {
        return this.inlineBehavior;
    }

    @Nullable
    public final InlineLive getInlineLive() {
        return this.inlineLive;
    }

    @NotNull
    public IInlinePlayItem getInlinePlayerItem() {
        return this.inlinePlayItem;
    }

    @Nullable
    public InlineReportParam getInlineReportParams() {
        return new InlineReportParam(getGoTo() != null ? getGoTo() : "", 0L, 0L, 0L, 0L, this.liveRoomId, (String) null, 64, (DefaultConstructorMarker) null);
    }

    @Nullable
    public final InlineThreePointPanel getInlineThreePointPanel() {
        return this.InlineThreePointPanel;
    }

    @Nullable
    public final String getInlineType() {
        return this.inlineType;
    }

    @Nullable
    public final String getJumpUri() {
        return StringUtil.isNotBlank(this.liveLink) ? this.liveLink : this.liveUri;
    }

    public final int getLevel() {
        return this.level;
    }

    public final int getLiveFace() {
        return this.liveFace;
    }

    @Nullable
    public final String getLiveLink() {
        return this.liveLink;
    }

    public final long getLiveRoomId() {
        return this.liveRoomId;
    }

    public final long getLiveStatus() {
        return this.liveFace;
    }

    @Nullable
    public final String getLiveUri() {
        return this.liveUri;
    }

    public final long getMid() {
        return this.mid;
    }

    @Nullable
    public final SearchNftIconItem getNftIconItem() {
        return this.nftIconItem;
    }

    @Nullable
    public final PrInfo getNotice() {
        return this.notice;
    }

    public final int getOfficialResource() {
        if (isPersonVerify()) {
            return getIconRes(21);
        }
        if (isOrganizeVerify()) {
            return getIconRes(22);
        }
        return 0;
    }

    @Nullable
    public final SearchOfficialVerify getOfficialVerify() {
        return this.officialVerify;
    }

    @Override // dt0.InterfaceC6845h
    public int getOgvSubType() {
        return 0;
    }

    @Override // dt0.InterfaceC6845h
    public long getOid() {
        return this.mid;
    }

    @Nullable
    public final InlinePendantAvatar getPendantAvatar() {
        InlineLive inlineLive = this.inlineLive;
        InlinePendantAvatar inlinePendantAvatar = null;
        Avatar avatar = inlineLive != null ? inlineLive.getAvatar() : null;
        if (avatar != null) {
            String cover = avatar.getCover();
            String text = avatar.getText();
            String uri = avatar.getUri();
            String event = avatar.getEvent();
            String eventV2 = avatar.getEventV2();
            long upId = avatar.getUpId();
            InlineLive inlineLive2 = this.inlineLive;
            int i7 = (inlineLive2 == null || !inlineLive2.isAtten()) ? 0 : 1;
            InlineLive inlineLive3 = this.inlineLive;
            inlinePendantAvatar = new InlinePendantAvatar(cover, text, uri, event, eventV2, 0, upId, i7, inlineLive3 != null ? inlineLive3.getOfficialIconV2() : 0);
        }
        return inlinePendantAvatar;
    }

    @Nullable
    public final BaseSearchItem.Relation getRelation() {
        return this.relation;
    }

    public long getRoomId() {
        return 0L;
    }

    public long getSeasonId() {
        return 0L;
    }

    @Override // dt0.InterfaceC6845h
    public int getShareBusiness() {
        InlineLive inlineLive = this.inlineLive;
        return (inlineLive == null || inlineLive.getSharePlane() == null) ? 4 : 3;
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public String getShareFrom() {
        InlineLive inlineLive = this.inlineLive;
        if (inlineLive != null && inlineLive.getSharePlane() != null) {
            return this.inlineLive.getSharePlane().shareFrom;
        }
        SharePlane sharePlane = this.sharePlane;
        if (sharePlane != null) {
            return sharePlane.shareFrom;
        }
        return null;
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public String getShareId() {
        String str;
        InlineThreePointPanel threePointMeta = getThreePointMeta();
        return (threePointMeta == null || (str = threePointMeta.shareId) == null) ? "search.search-result.0.0" : str;
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public String getShareOrigin() {
        String str;
        InlineThreePointPanel threePointMeta = getThreePointMeta();
        return (threePointMeta == null || (str = threePointMeta.shareOrigin) == null) ? "space_share" : str;
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public SharePlane getSharePanel() {
        InlineLive inlineLive = this.inlineLive;
        return (inlineLive == null || inlineLive.getSharePlane() == null) ? this.sharePlane : this.inlineLive.getSharePlane();
    }

    @Nullable
    public final SharePlane getSharePlane() {
        return this.sharePlane;
    }

    @Nullable
    public String getShareSpmid() {
        return "search.search-result.0.0";
    }

    @Override // dt0.InterfaceC6845h
    public int getShareType() {
        InlineLive inlineLive = this.inlineLive;
        return (inlineLive == null || inlineLive.getSharePlane() == null) ? 3 : 1;
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public String getSid() {
        return null;
    }

    @Nullable
    public final String getSign() {
        SearchOfficialVerify searchOfficialVerify = this.officialVerify;
        if (searchOfficialVerify == null || StringUtil.isBlank(searchOfficialVerify.getDesc())) {
            return !StringUtil.isBlank(this.sign) ? this.sign : "";
        }
        return this.officialVerify.getDesc();
    }

    @Nullable
    public final Space getSpace() {
        return this.space;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // com.bilibili.search2.api.oversea.a
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<com.bilibili.search2.api.oversea.a> getSubItems() {
        /*
            r2 = this;
            r0 = r2
            com.bilibili.search2.inline.InlineLive r0 = r0.inlineLive
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L11
            r0 = r3
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            r3 = r0
            goto L2c
        L11:
            r0 = r2
            java.util.List<com.bilibili.search2.api.SearchAuthorNew$AvItem> r0 = r0.avItems
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L28
            r0 = r3
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = kotlin.collections.CollectionsKt.filterNotNull(r0)
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L2c
        L28:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            r3 = r0
        L2c:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.api.SearchAuthorNew.getSubItems():java.util.List");
    }

    public final int getTextColor() {
        Space space = this.space;
        return space != null ? parseColor(space.getTextColor()) : -1;
    }

    public final int getTextColorNight() {
        Space space = this.space;
        return space != null ? parseColor(space.getTextColorNight()) : -1;
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public InlineThreePointPanel getThreePointMeta() {
        InlineLive inlineLive = this.inlineLive;
        return inlineLive != null ? inlineLive.getThreePointMeta() : null;
    }

    @Override // com.bilibili.search2.api.oversea.a
    @NotNull
    public com.bilibili.search2.api.oversea.c getTranslateRequestParam() {
        return new com.bilibili.search2.api.oversea.c(TranslationBusiness.TRANS_BIZ_ARC, "");
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public String getUpName() {
        return null;
    }

    @Nullable
    public final List<String> getUserInfo() {
        return this.userInfo;
    }

    @Override // dt0.InterfaceC6845h
    public boolean isFavorite() {
        return false;
    }

    @Override // dt0.InterfaceC6845h
    public boolean isHot() {
        return false;
    }

    public final int isInlineLive() {
        return this.isInlineLive;
    }

    public final boolean isLiveInlineAvailable() {
        return Intrinsics.areEqual(INLINE_LIVE_TYPE, this.inlineType);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isOrganizeVerify() {
        /*
            r3 = this;
            r0 = r3
            com.bilibili.search2.api.SearchOfficialVerify r0 = r0.officialVerify
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L18
            r0 = r6
            int r0 = r0.getType()
            r4 = r0
            r0 = 1
            r5 = r0
            r0 = r4
            r1 = 1
            if (r0 != r1) goto L18
            goto L1a
        L18:
            r0 = 0
            r5 = r0
        L1a:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.api.SearchAuthorNew.isOrganizeVerify():boolean");
    }

    public final boolean isPersonVerify() {
        SearchOfficialVerify searchOfficialVerify = this.officialVerify;
        return searchOfficialVerify != null && searchOfficialVerify.getType() == 0;
    }

    public final int isSeniorMember() {
        return this.isSeniorMember;
    }

    public final boolean isUp() {
        return this.isUp;
    }

    public final boolean isUpFollowUser() {
        BaseSearchItem.Relation relation = this.relation;
        return relation != null && relation.isUpFollowUser();
    }

    public final boolean isUserFollowUp() {
        BaseSearchItem.Relation relation = this.relation;
        return relation != null && relation.isUserFollowUp();
    }

    public final void setArchives(int i7) {
        this.archives = i7;
    }

    public final void setAvItems(@Nullable List<AvItem> list) {
        this.avItems = list;
    }

    public final void setAvStyle(int i7) {
        this.avStyle = i7;
    }

    public final void setAvatarItem(@Nullable o10.a aVar) {
        this.avatarItem = aVar;
    }

    public final void setBackground(@Nullable Background background) {
        this.background = background;
    }

    public final void setFaceNftNew(int i7) {
        this.faceNftNew = i7;
    }

    public final void setFans(int i7) {
        this.fans = i7;
    }

    @Override // dt0.InterfaceC6845h
    public void setFavorite(boolean z6) {
    }

    public final void setInlineLive(int i7) {
        this.isInlineLive = i7;
    }

    public final void setInlineLive(@Nullable InlineLive inlineLive) {
        this.inlineLive = inlineLive;
    }

    public final void setInlineThreePointPanel(@Nullable InlineThreePointPanel inlineThreePointPanel) {
        this.InlineThreePointPanel = inlineThreePointPanel;
    }

    public final void setInlineType(@Nullable String str) {
        this.inlineType = str;
    }

    public final void setLevel(int i7) {
        this.level = i7;
    }

    public final void setLiveFace(int i7) {
        this.liveFace = i7;
    }

    public final void setLiveLink(@Nullable String str) {
        this.liveLink = str;
    }

    public final void setLiveRoomId(long j7) {
        this.liveRoomId = j7;
    }

    public final void setLiveUri(@Nullable String str) {
        this.liveUri = str;
    }

    public final void setMid(long j7) {
        this.mid = j7;
    }

    public final void setNftIconItem(@Nullable SearchNftIconItem searchNftIconItem) {
        this.nftIconItem = searchNftIconItem;
    }

    public final void setNotice(@Nullable PrInfo prInfo) {
        this.notice = prInfo;
    }

    public final void setOfficialVerify(@Nullable SearchOfficialVerify searchOfficialVerify) {
        this.officialVerify = searchOfficialVerify;
    }

    public final void setRelation(@Nullable BaseSearchItem.Relation relation) {
        this.relation = relation;
    }

    public final void setSeniorMember(int i7) {
        this.isSeniorMember = i7;
    }

    public final void setSharePlane(@Nullable SharePlane sharePlane) {
        this.sharePlane = sharePlane;
    }

    public final void setSign(@Nullable String str) {
        this.sign = str;
    }

    public final void setSpace(@Nullable Space space) {
        this.space = space;
    }

    public final void setUp(boolean z6) {
        this.isUp = z6;
    }

    public final void setUserInfo(@Nullable List<String> list) {
        this.userInfo = list;
    }

    public final void updateRelation(boolean z6, boolean z7) {
        BaseSearchItem.Relation relation = this.relation;
        if (relation != null) {
            relation.updateRelation(z6, z7);
        }
    }
}
