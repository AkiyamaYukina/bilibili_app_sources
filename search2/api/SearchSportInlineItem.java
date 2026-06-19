package com.bilibili.search2.api;

import G.p;
import Ps0.C2790k;
import Ps0.C2793n;
import Ps0.H;
import Ps0.I;
import Ps0.Q;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.ExtraLink;
import com.bapis.bilibili.polymer.app.search.v1.MatchItem;
import com.bapis.bilibili.polymer.app.search.v1.MatchTeam;
import com.bapis.bilibili.polymer.app.search.v1.SearchSportInlineCard;
import com.bapis.bilibili.polymer.app.search.v1.Texts;
import com.bilibili.app.comm.list.common.api.model.PlayerArgs;
import com.bilibili.app.comm.list.common.data.InlineThreePointPanel;
import com.bilibili.app.comm.list.common.data.SharePlane;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.commons.StringUtils;
import com.bilibili.droid.StringUtil;
import com.bilibili.inline.biz.card.IVideoInfoItem;
import com.bilibili.inline.card.IInlineBehavior;
import com.bilibili.inline.card.IInlineCardData;
import com.bilibili.inline.card.IInlinePlayItem;
import com.bilibili.inline.card.IInlineProperty;
import com.bilibili.inline.card.NoPlayInlineCardData;
import com.bilibili.inline.utils.InlineReportParam;
import com.bilibili.search2.api.BaseSearchInlineData;
import com.bilibili.search2.inline.Avatar;
import com.bilibili.search2.inline.TrafficConfig;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import dt0.AbstractC6841d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchSportInlineItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchSportInlineItem extends AbstractC6841d implements IInlineCardData, IVideoInfoItem {
    public static final int $stable = 8;

    @NotNull
    public static final a Companion = new Object();

    @NotNull
    private static final String INLINE_ESPORT_TYPE = "live_room_inline";

    @NotNull
    private static final String PREVIEW_INLINE_TYPE = "preview_inline";

    @NotNull
    private static final String UGC_INLINE_TYPE = "ugc_inline";

    @JSONField(name = "bg_cover")
    @Nullable
    private String bgCover;

    @JSONField(name = "bg_cover_night")
    @Nullable
    private String bgCoverNight;

    @JSONField(name = "cover")
    @Nullable
    private String cover;

    @Nullable
    private BaseSearchInlineData currentInline;

    @JSONField(name = "esports_inline")
    @Nullable
    private SearchLiveInlineData esportsInline;

    @JSONField(name = "extra_link")
    @Nullable
    private List<MatchJumpObj> extraLink;

    @JSONField(name = "id")
    @Nullable
    private String id;

    @NotNull
    private final Lazy inlineData$delegate = ListExtentionsKt.lazyUnsafe(new Q(this, 0));

    @JSONField(name = "inline_type")
    @Nullable
    private String inlineType;

    @JSONField(name = "items")
    @Nullable
    private List<MatchInfoObj> items;

    @JSONField(name = "match_bottom")
    @Nullable
    private MatchJumpObj matchBottom;

    @JSONField(name = "match_guess")
    @Nullable
    private C2790k matchGuess;

    @JSONField(name = "match_top")
    @Nullable
    private MatchJumpObj matchTop;

    @JSONField(name = "player_grade")
    @Nullable
    private C2793n playerGrade;

    @Nullable
    private UgcInline ugcInline;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchSportInlineItem$MatchInfoObj.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class MatchInfoObj extends BaseSearchItem {
        public static final int $stable = 8;

        @JSONField(name = "id")
        private long id;

        @JSONField(name = "match_button")
        @Nullable
        private MatchButton matchButton;

        @JSONField(name = "match_label")
        @Nullable
        private MatchLabel matchLabel;

        @JSONField(name = "match_stage")
        @Nullable
        private String matchStage;

        @JSONField(name = "match_time")
        @Nullable
        private MatchLabel matchTime;

        @JSONField(name = NotificationCompat.CATEGORY_STATUS)
        private int status;

        @JSONField(name = "team_1")
        @Nullable
        private Team teamOne;

        @JSONField(name = "team_2")
        @Nullable
        private Team teamTwo;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchSportInlineItem$MatchInfoObj$MatchButton.class */
        @StabilityInferred(parameters = 0)
        @Keep
        public static final class MatchButton {
            public static final int $stable = 8;

            @JSONField(name = "live_link")
            @Nullable
            private String liveLink;

            @JSONField(name = "state")
            private int state;

            @JSONField(name = "text")
            @Nullable
            private String text;

            @JSONField(name = "texts")
            @Nullable
            private ClickText texts;

            @JSONField(name = EditCustomizeSticker.TAG_URI)
            @Nullable
            private String uri;

            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchSportInlineItem$MatchInfoObj$MatchButton$ClickText.class */
            @StabilityInferred(parameters = 0)
            @Keep
            public static final class ClickText {
                public static final int $stable = 8;

                @JSONField(name = "booking_text")
                @Nullable
                private String bookingText;

                @JSONField(name = "unbooking_text")
                @Nullable
                private String unBookingText;

                public ClickText(@NotNull Texts texts) {
                    this.bookingText = texts.getBookingText();
                    this.unBookingText = texts.getUnbookingText();
                }

                @Nullable
                public final String getBookingText() {
                    return this.bookingText;
                }

                @Nullable
                public final String getUnBookingText() {
                    return this.unBookingText;
                }

                public final void setBookingText(@Nullable String str) {
                    this.bookingText = str;
                }

                public final void setUnBookingText(@Nullable String str) {
                    this.unBookingText = str;
                }
            }

            public MatchButton(@NotNull MatchItem matchItem) {
                this.state = matchItem.getState();
                this.text = matchItem.getText();
                this.liveLink = matchItem.getLiveLink();
                this.uri = matchItem.getUri();
                if (matchItem.hasTexts()) {
                    this.texts = new ClickText(matchItem.getTexts());
                }
            }

            @Nullable
            public final String getJumpUri() {
                return StringUtil.isNotBlank(this.liveLink) ? this.liveLink : this.uri;
            }

            @Nullable
            public final String getLiveLink() {
                return this.liveLink;
            }

            public final int getState() {
                return this.state;
            }

            @Nullable
            public final String getText() {
                return this.text;
            }

            @Nullable
            public final ClickText getTexts() {
                return this.texts;
            }

            @Nullable
            public final String getUri() {
                return this.uri;
            }

            public final boolean isCollection() {
                return this.state == 7;
            }

            public final boolean isLive() {
                return this.state == 4;
            }

            public final boolean isReplay() {
                return this.state == 6;
            }

            public final void setLiveLink(@Nullable String str) {
                this.liveLink = str;
            }

            public final void setState(int i7) {
                this.state = i7;
            }

            public final void setText(@Nullable String str) {
                this.text = str;
            }

            public final void setTexts(@Nullable ClickText clickText) {
                this.texts = clickText;
            }

            public final void setUri(@Nullable String str) {
                this.uri = str;
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchSportInlineItem$MatchInfoObj$MatchLabel.class */
        @StabilityInferred(parameters = 0)
        @Keep
        public static final class MatchLabel {
            public static final int $stable = 8;

            @JSONField(name = "text")
            @Nullable
            private String text;

            @JSONField(name = "text_color")
            @Nullable
            private String textColor;

            @JSONField(name = "text_color_night")
            @Nullable
            private String textColorNight;

            public MatchLabel() {
            }

            public MatchLabel(@NotNull MatchItem matchItem) {
                this.text = matchItem.getText();
                this.textColor = matchItem.getTextColor();
                this.textColorNight = matchItem.getTextColorNight();
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

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchSportInlineItem$MatchInfoObj$Team.class */
        @StabilityInferred(parameters = 0)
        @Keep
        public static final class Team {
            public static final int $stable = 8;

            @JSONField(name = "cover")
            @Nullable
            private String cover;

            @JSONField(name = "id")
            private long id;

            @JSONField(name = "score")
            private int score;

            @JSONField(name = "title")
            @Nullable
            private String title;

            public Team() {
            }

            public Team(@NotNull MatchTeam matchTeam) {
                this.id = matchTeam.getId();
                this.title = matchTeam.getTitle();
                this.cover = matchTeam.getCover();
                this.score = matchTeam.getScore();
            }

            @Nullable
            public final String getCover() {
                return this.cover;
            }

            public final long getId() {
                return this.id;
            }

            public final int getScore() {
                return this.score;
            }

            @NotNull
            public final String getScoreStr() {
                String strValueOf = String.valueOf(this.score);
                String strA = strValueOf;
                if (strValueOf.length() > 3) {
                    strA = p.a(strValueOf.substring(0, 2), "…");
                }
                return strA;
            }

            @Nullable
            public final String getTitle() {
                return this.title;
            }

            public final void setCover(@Nullable String str) {
                this.cover = str;
            }

            public final void setId(long j7) {
                this.id = j7;
            }

            public final void setScore(int i7) {
                this.score = i7;
            }

            public final void setTitle(@Nullable String str) {
                this.title = str;
            }
        }

        public MatchInfoObj() {
        }

        public MatchInfoObj(@NotNull com.bapis.bilibili.polymer.app.search.v1.MatchInfoObj matchInfoObj) {
            this.id = matchInfoObj.getId();
            this.status = matchInfoObj.getStatus();
            this.matchStage = matchInfoObj.getMatchStage();
            if (matchInfoObj.hasTeam1()) {
                this.teamOne = new Team(matchInfoObj.getTeam1());
            }
            if (matchInfoObj.hasTeam2()) {
                this.teamTwo = new Team(matchInfoObj.getTeam2());
            }
            if (matchInfoObj.hasMatchLabel()) {
                this.matchLabel = new MatchLabel(matchInfoObj.getMatchLabel());
            }
            if (matchInfoObj.hasMatchTime()) {
                this.matchTime = new MatchLabel(matchInfoObj.getMatchTime());
            }
            if (matchInfoObj.hasMatchButton()) {
                this.matchButton = new MatchButton(matchInfoObj.getMatchButton());
            }
        }

        public final long getId() {
            return this.id;
        }

        @Nullable
        public final MatchButton getMatchButton() {
            return this.matchButton;
        }

        @Nullable
        public final MatchLabel getMatchLabel() {
            return this.matchLabel;
        }

        @Nullable
        public final String getMatchStage() {
            return this.matchStage;
        }

        @Nullable
        public final MatchLabel getMatchTime() {
            return this.matchTime;
        }

        public final int getStatus() {
            return this.status;
        }

        @Nullable
        public final Team getTeamOne() {
            return this.teamOne;
        }

        @Nullable
        public final Team getTeamTwo() {
            return this.teamTwo;
        }

        @Override // com.bilibili.search2.api.BaseSearchItem
        public void initReportParams(@NotNull HashMap<String, String> map) {
            map.put("competition_type", String.valueOf(this.status));
            Team team = this.teamOne;
            if (team == null || this.teamTwo == null) {
                return;
            }
            map.put("competition_team", team.getTitle() + "," + this.teamTwo.getTitle());
            map.put("competition_score", this.teamOne.getScore() + ":" + this.teamTwo.getScore());
        }

        public final boolean isPreView() {
            boolean z6 = true;
            if (this.status != 1) {
                z6 = false;
            }
            return z6;
        }

        public final void setId(long j7) {
            this.id = j7;
        }

        public final void setMatchButton(@Nullable MatchButton matchButton) {
            this.matchButton = matchButton;
        }

        public final void setMatchLabel(@Nullable MatchLabel matchLabel) {
            this.matchLabel = matchLabel;
        }

        public final void setMatchStage(@Nullable String str) {
            this.matchStage = str;
        }

        public final void setMatchTime(@Nullable MatchLabel matchLabel) {
            this.matchTime = matchLabel;
        }

        public final void setStatus(int i7) {
            this.status = i7;
        }

        public final void setTeamOne(@Nullable Team team) {
            this.teamOne = team;
        }

        public final void setTeamTwo(@Nullable Team team) {
            this.teamTwo = team;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchSportInlineItem$MatchJumpObj.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class MatchJumpObj {
        public static final int $stable = 8;

        @JSONField(name = "text")
        @Nullable
        private String text;

        @JSONField(name = EditCustomizeSticker.TAG_URI)
        @Nullable
        private String uri;

        public MatchJumpObj() {
        }

        public MatchJumpObj(@NotNull ExtraLink extraLink) {
            this.text = extraLink.getText();
            this.uri = extraLink.getUri();
        }

        public MatchJumpObj(@NotNull MatchItem matchItem) {
            this.text = matchItem.getText();
            this.uri = matchItem.getUri();
        }

        public final boolean canShow() {
            return (StringUtils.isEmpty(this.text) || StringUtils.isEmpty(this.uri)) ? false : true;
        }

        @Nullable
        public final String getText() {
            return this.text;
        }

        @Nullable
        public final String getUri() {
            return this.uri;
        }

        public final void setText(@Nullable String str) {
            this.text = str;
        }

        public final void setUri(@Nullable String str) {
            this.uri = str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchSportInlineItem$a.class */
    public static final class a {
    }

    public SearchSportInlineItem() {
    }

    public SearchSportInlineItem(@NotNull SearchSportInlineCard searchSportInlineCard) {
        this.bgCover = searchSportInlineCard.getBgCover();
        this.bgCoverNight = searchSportInlineCard.getBgCoverNight();
        setCover(searchSportInlineCard.getCover());
        if (searchSportInlineCard.hasMatchTop()) {
            this.matchTop = new MatchJumpObj(searchSportInlineCard.getMatchTop());
        }
        if (searchSportInlineCard.hasMatchBottom()) {
            this.matchBottom = new MatchJumpObj(searchSportInlineCard.getMatchBottom());
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = searchSportInlineCard.getExtraLinkList().iterator();
        while (it.hasNext()) {
            arrayList.add(new MatchJumpObj((ExtraLink) it.next()));
        }
        if (!arrayList.isEmpty()) {
            this.extraLink = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = searchSportInlineCard.getItemsList().iterator();
        while (it2.hasNext()) {
            arrayList2.add(new MatchInfoObj((com.bapis.bilibili.polymer.app.search.v1.MatchInfoObj) it2.next()));
        }
        if (!arrayList2.isEmpty()) {
            this.items = arrayList2;
        }
        this.inlineType = searchSportInlineCard.getInlineType();
        if (searchSportInlineCard.hasEsportsInline()) {
            if (isVideoInline()) {
                UgcInline ugcInline = new UgcInline(searchSportInlineCard.getEsportsInline());
                this.ugcInline = ugcInline;
                this.currentInline = ugcInline;
            } else {
                SearchLiveInlineData searchLiveInlineData = new SearchLiveInlineData(searchSportInlineCard.getEsportsInline());
                this.esportsInline = searchLiveInlineData;
                this.currentInline = searchLiveInlineData;
            }
        }
        setTitle(searchSportInlineCard.getTitle());
        this.id = String.valueOf(searchSportInlineCard.getId());
        if (searchSportInlineCard.hasPlayerGrade()) {
            this.playerGrade = new C2793n(searchSportInlineCard.getPlayerGrade());
        }
        if (searchSportInlineCard.hasMatchGuess()) {
            this.matchGuess = new C2790k(searchSportInlineCard.getMatchGuess());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IInlineCardData inlineData_delegate$lambda$0(SearchSportInlineItem searchSportInlineItem) {
        IInlineCardData h;
        if (!searchSportInlineItem.getHasInline()) {
            return new NoPlayInlineCardData();
        }
        if (searchSportInlineItem.isVideoInline()) {
            h = new I(searchSportInlineItem.ugcInline, searchSportInlineItem.getTrackId(), "SearchSportVideoInline");
        } else {
            SearchLiveInlineData searchLiveInlineData = searchSportInlineItem.esportsInline;
            String goTo = searchSportInlineItem.getGoTo();
            String str = goTo;
            if (goTo == null) {
                str = "";
            }
            h = new H(searchLiveInlineData, str);
        }
        return h;
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
    public long getAvId() {
        PlayerArgs playerArgs = getPlayerArgs();
        return playerArgs != null ? playerArgs.aid : 0L;
    }

    @Nullable
    public final String getBgCover() {
        return this.bgCover;
    }

    @Nullable
    public final String getBgCoverNight() {
        return this.bgCoverNight;
    }

    @Override // dt0.InterfaceC6845h
    public long getCId() {
        PlayerArgs playerArgs = getPlayerArgs();
        return playerArgs != null ? playerArgs.cid : 0L;
    }

    @NotNull
    public IInlineProperty getCardPlayProperty() {
        return getInlineData().getCardPlayProperty();
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    @Nullable
    public String getCover() {
        return this.cover;
    }

    @Nullable
    public final BaseSearchInlineData getCurrentInline() {
        return this.currentInline;
    }

    public /* bridge */ /* synthetic */ long getEpId() {
        return 0L;
    }

    @Nullable
    public final SearchLiveInlineData getEsportsInline() {
        return this.esportsInline;
    }

    @Nullable
    public final List<MatchJumpObj> getExtraLink() {
        return this.extraLink;
    }

    @JSONField(deserialize = false, serialize = false)
    public final boolean getHasInline() {
        return (Intrinsics.areEqual(this.inlineType, UGC_INLINE_TYPE) && this.ugcInline != null) || (Intrinsics.areEqual(this.inlineType, INLINE_ESPORT_TYPE) && this.esportsInline != null) || (Intrinsics.areEqual(this.inlineType, PREVIEW_INLINE_TYPE) && this.ugcInline != null);
    }

    @Nullable
    public final String getId() {
        return this.id;
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

    @Nullable
    public final String getInlineType() {
        return this.inlineType;
    }

    @Nullable
    public final List<MatchInfoObj> getItems() {
        return this.items;
    }

    public final long getLiveRoomId() {
        return getRoomId();
    }

    @JSONField(deserialize = false, serialize = false)
    @Nullable
    public final String getMainMatchId() {
        MatchInfoObj matchInfoObj;
        List<MatchInfoObj> list = this.items;
        return (list == null || (matchInfoObj = (MatchInfoObj) CollectionsKt.firstOrNull(list)) == null) ? null : String.valueOf(matchInfoObj.getId());
    }

    @Nullable
    public final MatchJumpObj getMatchBottom() {
        return this.matchBottom;
    }

    @Nullable
    public final C2790k getMatchGuess() {
        return this.matchGuess;
    }

    @Nullable
    public final MatchJumpObj getMatchTop() {
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
        BaseSearchInlineData baseSearchInlineData = this.currentInline;
        return baseSearchInlineData != null ? baseSearchInlineData.getPlayerArgs() : null;
    }

    @Nullable
    public final C2793n getPlayerGrade() {
        return this.playerGrade;
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
            if (r0 == 0) goto L32
        L12:
            r0 = r2
            boolean r0 = r0.getHasInline()
            if (r0 == 0) goto L2e
            r0 = r2
            boolean r0 = r0.isVideoInline()
            if (r0 == 0) goto L27
            java.lang.String r0 = "search.search-result.ugc.0"
            r3 = r0
            goto L32
        L27:
            java.lang.String r0 = "search.search-result.live.0"
            r3 = r0
            goto L32
        L2e:
            java.lang.String r0 = ""
            r3 = r0
        L32:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.api.SearchSportInlineItem.getShareId():java.lang.String");
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
            if (r0 == 0) goto L24
        L12:
            r0 = r2
            boolean r0 = r0.getHasInline()
            if (r0 == 0) goto L20
            java.lang.String r0 = "search_inline"
            r3 = r0
            goto L24
        L20:
            java.lang.String r0 = ""
            r3 = r0
        L24:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.api.SearchSportInlineItem.getShareOrigin():java.lang.String");
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public SharePlane getSharePanel() {
        BaseSearchInlineData baseSearchInlineData = this.currentInline;
        return baseSearchInlineData != null ? baseSearchInlineData.getSharePlane() : null;
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
    @NotNull
    public String getSid() {
        return String.valueOf(getCId());
    }

    @Override // dt0.AbstractC6841d
    @Nullable
    public String getTargetUri() {
        BaseSearchInlineData baseSearchInlineData = this.currentInline;
        return baseSearchInlineData != null ? baseSearchInlineData.getUri() : null;
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public InlineThreePointPanel getThreePointMeta() {
        BaseSearchInlineData baseSearchInlineData = this.currentInline;
        return baseSearchInlineData != null ? baseSearchInlineData.getThreePointMeta() : null;
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
            SearchLiveInlineData searchLiveInlineData = this.esportsInline;
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
            return -1L;
        }
        if (isVideoInline()) {
            UgcInline ugcInline = this.ugcInline;
            upId = 0;
            if (ugcInline != null) {
                Avatar avatar = ugcInline.getAvatar();
                upId = 0;
                if (avatar != null) {
                    upId = avatar.getUpId();
                }
            }
        } else {
            SearchLiveInlineData searchLiveInlineData = this.esportsInline;
            upId = 0;
            if (searchLiveInlineData != null) {
                BaseSearchInlineData.UpArgs upArgs = searchLiveInlineData.getUpArgs();
                upId = 0;
                if (upArgs != null) {
                    upId = upArgs.getUpId();
                }
            }
        }
        return upId;
    }

    @Override // dt0.InterfaceC6845h
    @Nullable
    public String getUpName() {
        BaseSearchInlineData.UpArgs upArgs;
        UgcInline ugcInline = this.ugcInline;
        return (ugcInline == null || (upArgs = ugcInline.getUpArgs()) == null) ? null : upArgs.getUpName();
    }

    public final boolean isESportCard() {
        return Intrinsics.areEqual("esports_inline", getGoTo());
    }

    @Override // dt0.InterfaceC6845h
    public /* bridge */ /* synthetic */ boolean isFavorite() {
        return false;
    }

    @Override // dt0.InterfaceC6845h
    public /* bridge */ /* synthetic */ boolean isHot() {
        return false;
    }

    @JSONField(deserialize = false, serialize = false)
    public final boolean isPreviewInline() {
        return Intrinsics.areEqual(this.inlineType, PREVIEW_INLINE_TYPE);
    }

    @JSONField(deserialize = false, serialize = false)
    public final boolean isVideoInline() {
        return Intrinsics.areEqual(this.inlineType, UGC_INLINE_TYPE) || Intrinsics.areEqual(this.inlineType, PREVIEW_INLINE_TYPE);
    }

    public final void setBgCover(@Nullable String str) {
        this.bgCover = str;
    }

    public final void setBgCoverNight(@Nullable String str) {
        this.bgCoverNight = str;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    public void setCover(@Nullable String str) {
        this.cover = str;
    }

    public final void setCurrentInline(@Nullable BaseSearchInlineData baseSearchInlineData) {
        this.currentInline = baseSearchInlineData;
    }

    public final void setEsportsInline(@Nullable SearchLiveInlineData searchLiveInlineData) {
        this.esportsInline = searchLiveInlineData;
    }

    public final void setExtraLink(@Nullable List<MatchJumpObj> list) {
        this.extraLink = list;
    }

    @Override // dt0.InterfaceC6845h
    public /* bridge */ /* synthetic */ void setFavorite(boolean z6) {
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setInlineType(@Nullable String str) {
        this.inlineType = str;
    }

    @Override // com.bilibili.search2.result.k
    public void setIsFollow(boolean z6) {
        if (isVideoInline()) {
            UgcInline ugcInline = this.ugcInline;
            if (ugcInline != null) {
                ugcInline.setAtten(z6);
                return;
            }
            return;
        }
        SearchLiveInlineData searchLiveInlineData = this.esportsInline;
        if (searchLiveInlineData != null) {
            searchLiveInlineData.setAtten(z6);
        }
    }

    public final void setItems(@Nullable List<MatchInfoObj> list) {
        this.items = list;
    }

    public final void setMatchBottom(@Nullable MatchJumpObj matchJumpObj) {
        this.matchBottom = matchJumpObj;
    }

    public final void setMatchGuess(@Nullable C2790k c2790k) {
        this.matchGuess = c2790k;
    }

    public final void setMatchTop(@Nullable MatchJumpObj matchJumpObj) {
        this.matchTop = matchJumpObj;
    }

    public final void setPlayerGrade(@Nullable C2793n c2793n) {
        this.playerGrade = c2793n;
    }

    public final void setUgcInline(@Nullable UgcInline ugcInline) {
        this.ugcInline = ugcInline;
    }
}
