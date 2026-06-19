package com.bilibili.search2.api;

import G.p;
import Ps0.C2790k;
import Ps0.C2793n;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.ExtraLink;
import com.bapis.bilibili.polymer.app.search.v1.MatchItem;
import com.bapis.bilibili.polymer.app.search.v1.MatchTeam;
import com.bapis.bilibili.polymer.app.search.v1.SearchSportCard;
import com.bapis.bilibili.polymer.app.search.v1.Texts;
import com.bilibili.commons.StringUtils;
import com.bilibili.droid.StringUtil;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchSportItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchSportItem extends BaseSearchItem {
    public static final int $stable = 8;

    @JSONField(name = "bg_cover")
    @Nullable
    private String bgCover;

    @JSONField(name = "bg_cover_night")
    @Nullable
    private String bgCoverNight;

    @JSONField(name = "cover")
    @Nullable
    private String cover;

    @JSONField(name = "extra_link")
    @Nullable
    private List<MatchJumpObj> extraLink;

    @JSONField(name = "id")
    @Nullable
    private String id;

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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchSportItem$MatchInfoObj.class */
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

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchSportItem$MatchInfoObj$MatchButton.class */
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

            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchSportItem$MatchInfoObj$MatchButton$ClickText.class */
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

                public ClickText() {
                }

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

            public MatchButton() {
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

            public final boolean isLookAhead() {
                return this.state == 10;
            }

            public final boolean isReplay() {
                return this.state == 6;
            }

            public final boolean isWatchVideo() {
                return this.state == 11;
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

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchSportItem$MatchInfoObj$MatchLabel.class */
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

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchSportItem$MatchInfoObj$Team.class */
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchSportItem$MatchJumpObj.class */
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

    public SearchSportItem() {
    }

    public SearchSportItem(@NotNull SearchSportCard searchSportCard) {
        this.bgCover = searchSportCard.getBgCover();
        this.bgCoverNight = searchSportCard.getBgCoverNight();
        setCover(searchSportCard.getCover());
        if (searchSportCard.hasMatchTop()) {
            this.matchTop = new MatchJumpObj(searchSportCard.getMatchTop());
        }
        if (searchSportCard.hasMatchBottom()) {
            this.matchBottom = new MatchJumpObj(searchSportCard.getMatchBottom());
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = searchSportCard.getExtraLinkList().iterator();
        while (it.hasNext()) {
            arrayList.add(new MatchJumpObj((ExtraLink) it.next()));
        }
        if (!arrayList.isEmpty()) {
            this.extraLink = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = searchSportCard.getItemsList().iterator();
        while (it2.hasNext()) {
            arrayList2.add(new MatchInfoObj((com.bapis.bilibili.polymer.app.search.v1.MatchInfoObj) it2.next()));
        }
        if (!arrayList2.isEmpty()) {
            this.items = arrayList2;
        }
        setTitle(searchSportCard.getTitle());
        this.id = String.valueOf(searchSportCard.getId());
        if (searchSportCard.hasPlayerGrade()) {
            this.playerGrade = new C2793n(searchSportCard.getPlayerGrade());
        }
        if (searchSportCard.hasMatchGuess()) {
            this.matchGuess = new C2790k(searchSportCard.getMatchGuess());
        }
    }

    @Nullable
    public final String getBgCover() {
        return this.bgCover;
    }

    @Nullable
    public final String getBgCoverNight() {
        return this.bgCoverNight;
    }

    @Override // com.bilibili.search2.api.BaseSearchItem
    @Nullable
    public String getCover() {
        return this.cover;
    }

    @Nullable
    public final List<MatchJumpObj> getExtraLink() {
        return this.extraLink;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final List<MatchInfoObj> getItems() {
        return this.items;
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

    @Nullable
    public final C2793n getPlayerGrade() {
        return this.playerGrade;
    }

    public final boolean isESportCard() {
        return Intrinsics.areEqual("esport", getGoTo());
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

    public final void setExtraLink(@Nullable List<MatchJumpObj> list) {
        this.extraLink = list;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
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
}
