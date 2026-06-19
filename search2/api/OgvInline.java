package com.bilibili.search2.api;

import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.C4690e;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.Args;
import com.bapis.bilibili.polymer.app.search.v1.GotoIcon;
import com.bapis.bilibili.polymer.app.search.v1.InlineThreePointPanel;
import com.bapis.bilibili.polymer.app.search.v1.PlayerArgs;
import com.bapis.bilibili.polymer.app.search.v1.ReasonStyle;
import com.bapis.bilibili.polymer.app.search.v1.SearchInlineData;
import com.bapis.bilibili.polymer.app.search.v1.Share;
import com.bapis.bilibili.polymer.app.search.v1.SharePlane;
import com.bapis.bilibili.polymer.app.search.v1.ThreePoint2;
import com.bapis.bilibili.polymer.app.search.v1.ThreePointV2;
import com.bapis.bilibili.polymer.app.search.v1.UpArgs;
import com.bilibili.app.comm.list.common.data.PlayerWidget;
import com.bilibili.app.comm.list.common.data.StoryCardIcon;
import com.bilibili.app.comm.list.common.inline.view.InlineProgressBar;
import com.bilibili.search2.api.BaseSearchInlineData;
import com.bilibili.search2.inline.Avatar;
import com.bilibili.search2.inline.TrafficConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/OgvInline.class */
@StabilityInferred(parameters = 0)
@Keep
public final class OgvInline extends BaseSearchInlineData {
    public static final int $stable = 8;

    @JSONField(name = "avatar")
    @Nullable
    private Avatar avatar;

    @JSONField(name = "cover_right_text")
    @Nullable
    private String coverRightText;

    @JSONField(name = "desc")
    @Nullable
    private String desc;

    @JSONField(name = "disable_danmu")
    private boolean disableDanmaku;

    @JSONField(name = "hide_danmu_switch")
    private boolean hideDanmakuSwitch;

    @JSONField(name = "inline_progress_bar")
    @Nullable
    private InlineProgressBar inlineProgressBar;

    @JSONField(name = "is_atten")
    private boolean isAtten;

    @JSONField(name = "like_button")
    @Nullable
    private SearchLikeButtonItem likeButton;

    @JSONField(name = "official_icon")
    private int officialIcon;

    @JSONField(name = "official_icon_v2")
    private int officialIconV2;

    @JSONField(name = "cover_badge_style")
    @Nullable
    private Tag ogvBadge;

    @JSONField(name = "param")
    @Nullable
    private String param;

    @JSONField(name = "player_widget")
    @Nullable
    private PlayerWidget playerWidget;

    @JSONField(name = "goto_icon")
    @Nullable
    private StoryCardIcon storyCardIcon;

    @JSONField(name = "badge_style")
    @Nullable
    private Tag tag;

    @JSONField(name = "traffic_config")
    @Nullable
    private TrafficConfig trafficConfig;

    public OgvInline() {
        this(null, null, null, null, 0, 0, null, null, false, null, null, false, false, null, null, null, 65535, null);
    }

    public OgvInline(@NotNull SearchInlineData searchInlineData) {
        this(null, null, null, null, 0, 0, null, null, false, null, null, false, false, null, null, null, 65535, null);
        setUri(searchInlineData.getUri());
        setTitle(searchInlineData.getTitle());
        PlayerArgs playerArgs = searchInlineData.getPlayerArgs();
        if (playerArgs != null) {
            setPlayerArgs(new com.bilibili.app.comm.list.common.api.model.PlayerArgs(playerArgs));
        }
        setCanPlay(searchInlineData.getCanPlay());
        Args args = searchInlineData.getArgs();
        if (args != null) {
            setArgs(new com.bilibili.search2.inline.Args(args));
        }
        setCardGoto(searchInlineData.getCardGoto());
        setCardType(searchInlineData.getCardType());
        setCover(searchInlineData.getCover());
        setCoverLeftIcon1(searchInlineData.getCoverLeftIcon1());
        setCoverLeftIcon2(searchInlineData.getCoverLeftIcon2());
        setCoverLeftText1(searchInlineData.getCoverLeftText1());
        setCoverLeftText2(searchInlineData.getCoverLeftText2());
        UpArgs upArgs = searchInlineData.getUpArgs();
        if (upArgs != null) {
            setUpArgs(new BaseSearchInlineData.UpArgs(upArgs));
        }
        setExtraUri(searchInlineData.getExtraUri());
        setFavorite(searchInlineData.getIsFav());
        setCoin(searchInlineData.getIsCoin());
        setGoto(searchInlineData.getGoto());
        Share share = searchInlineData.getShare();
        if (share != null) {
            setShare(new BaseSearchInlineData.Share(share));
        }
        ThreePoint2 threePoint = searchInlineData.getThreePoint();
        if (threePoint != null) {
            setThreePoint(new BaseSearchInlineData.ThreePointX(threePoint));
        }
        SharePlane sharePlane = searchInlineData.getSharePlane();
        if (sharePlane != null) {
            setSharePlane(new com.bilibili.app.comm.list.common.data.SharePlane(sharePlane));
        }
        InlineThreePointPanel threePointMeta = searchInlineData.getThreePointMeta();
        if (threePointMeta != null) {
            setThreePointMeta(new com.bilibili.app.comm.list.common.data.InlineThreePointPanel(threePointMeta));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = searchInlineData.getThreePointV2List().iterator();
        while (it.hasNext()) {
            arrayList.add(new BaseSearchInlineData.ThreePointV2((ThreePointV2) it.next()));
        }
        if (!arrayList.isEmpty()) {
            setThreePointV2(arrayList);
        }
        com.bapis.bilibili.polymer.app.search.v1.Avatar avatar = searchInlineData.getAvatar();
        if (avatar != null) {
            this.avatar = new Avatar(avatar);
        }
        this.coverRightText = searchInlineData.getCoverRightText();
        this.desc = searchInlineData.getDesc();
        com.bapis.bilibili.polymer.app.search.v1.SearchLikeButtonItem likeButton = searchInlineData.getLikeButton();
        if (likeButton != null) {
            this.likeButton = new SearchLikeButtonItem(likeButton);
        }
        this.officialIcon = searchInlineData.getOfficialIcon();
        this.officialIconV2 = searchInlineData.getOfficialIconV2();
        this.param = searchInlineData.getParam();
        com.bapis.bilibili.polymer.app.search.v1.TrafficConfig trafficConfig = searchInlineData.getTrafficConfig();
        if (trafficConfig != null) {
            this.trafficConfig = new TrafficConfig(trafficConfig);
        }
        this.isAtten = searchInlineData.getIsAtten();
        GotoIcon gotoIcon = searchInlineData.getGotoIcon();
        if (gotoIcon != null) {
            this.storyCardIcon = new StoryCardIcon(gotoIcon);
        }
        com.bapis.bilibili.polymer.app.search.v1.InlineProgressBar inlineProgressBar = searchInlineData.getInlineProgressBar();
        if (inlineProgressBar != null) {
            this.inlineProgressBar = new InlineProgressBar(inlineProgressBar);
        }
        this.disableDanmaku = searchInlineData.getDisableDanmaku();
        this.hideDanmakuSwitch = searchInlineData.getHideDanmakuSwitch();
        ReasonStyle badgeStyle = searchInlineData.getBadgeStyle();
        if (badgeStyle != null) {
            this.tag = new Tag(badgeStyle);
        }
        com.bapis.bilibili.polymer.app.search.v1.PlayerWidget playerWidget = searchInlineData.getPlayerWidget();
        if (playerWidget != null) {
            this.playerWidget = new PlayerWidget(playerWidget);
        }
        ReasonStyle coverBadgeStyle = searchInlineData.getCoverBadgeStyle();
        if (coverBadgeStyle != null) {
            this.ogvBadge = new Tag(coverBadgeStyle);
        }
        setReportFlowData(searchInlineData.getReportFlowData());
    }

    public OgvInline(@Nullable Avatar avatar, @Nullable String str, @Nullable String str2, @Nullable SearchLikeButtonItem searchLikeButtonItem, int i7, int i8, @Nullable String str3, @Nullable TrafficConfig trafficConfig, boolean z6, @Nullable StoryCardIcon storyCardIcon, @Nullable InlineProgressBar inlineProgressBar, boolean z7, boolean z8, @Nullable Tag tag, @Nullable PlayerWidget playerWidget, @Nullable Tag tag2) {
        this.avatar = avatar;
        this.coverRightText = str;
        this.desc = str2;
        this.likeButton = searchLikeButtonItem;
        this.officialIcon = i7;
        this.officialIconV2 = i8;
        this.param = str3;
        this.trafficConfig = trafficConfig;
        this.isAtten = z6;
        this.storyCardIcon = storyCardIcon;
        this.inlineProgressBar = inlineProgressBar;
        this.disableDanmaku = z7;
        this.hideDanmakuSwitch = z8;
        this.tag = tag;
        this.playerWidget = playerWidget;
        this.ogvBadge = tag2;
    }

    public /* synthetic */ OgvInline(Avatar avatar, String str, String str2, SearchLikeButtonItem searchLikeButtonItem, int i7, int i8, String str3, TrafficConfig trafficConfig, boolean z6, StoryCardIcon storyCardIcon, InlineProgressBar inlineProgressBar, boolean z7, boolean z8, Tag tag, PlayerWidget playerWidget, Tag tag2, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? null : avatar, (i9 & 2) != 0 ? null : str, (i9 & 4) != 0 ? null : str2, (i9 & 8) != 0 ? null : searchLikeButtonItem, (i9 & 16) != 0 ? 0 : i7, (i9 & 32) != 0 ? 0 : i8, (i9 & 64) != 0 ? null : str3, (i9 & 128) != 0 ? null : trafficConfig, (i9 & 256) != 0 ? false : z6, (i9 & 512) != 0 ? null : storyCardIcon, (i9 & 1024) != 0 ? null : inlineProgressBar, (i9 & 2048) != 0 ? false : z7, (i9 & 4096) != 0 ? false : z8, (i9 & 8192) != 0 ? null : tag, (i9 & 16384) != 0 ? null : playerWidget, (i9 & 32768) != 0 ? null : tag2);
    }

    public static /* synthetic */ OgvInline copy$default(OgvInline ogvInline, Avatar avatar, String str, String str2, SearchLikeButtonItem searchLikeButtonItem, int i7, int i8, String str3, TrafficConfig trafficConfig, boolean z6, StoryCardIcon storyCardIcon, InlineProgressBar inlineProgressBar, boolean z7, boolean z8, Tag tag, PlayerWidget playerWidget, Tag tag2, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            avatar = ogvInline.avatar;
        }
        if ((i9 & 2) != 0) {
            str = ogvInline.coverRightText;
        }
        if ((i9 & 4) != 0) {
            str2 = ogvInline.desc;
        }
        if ((i9 & 8) != 0) {
            searchLikeButtonItem = ogvInline.likeButton;
        }
        if ((i9 & 16) != 0) {
            i7 = ogvInline.officialIcon;
        }
        if ((i9 & 32) != 0) {
            i8 = ogvInline.officialIconV2;
        }
        if ((i9 & 64) != 0) {
            str3 = ogvInline.param;
        }
        if ((i9 & 128) != 0) {
            trafficConfig = ogvInline.trafficConfig;
        }
        if ((i9 & 256) != 0) {
            z6 = ogvInline.isAtten;
        }
        if ((i9 & 512) != 0) {
            storyCardIcon = ogvInline.storyCardIcon;
        }
        if ((i9 & 1024) != 0) {
            inlineProgressBar = ogvInline.inlineProgressBar;
        }
        if ((i9 & 2048) != 0) {
            z7 = ogvInline.disableDanmaku;
        }
        if ((i9 & 4096) != 0) {
            z8 = ogvInline.hideDanmakuSwitch;
        }
        if ((i9 & 8192) != 0) {
            tag = ogvInline.tag;
        }
        if ((i9 & 16384) != 0) {
            playerWidget = ogvInline.playerWidget;
        }
        if ((i9 & 32768) != 0) {
            tag2 = ogvInline.ogvBadge;
        }
        return ogvInline.copy(avatar, str, str2, searchLikeButtonItem, i7, i8, str3, trafficConfig, z6, storyCardIcon, inlineProgressBar, z7, z8, tag, playerWidget, tag2);
    }

    @Nullable
    public final Avatar component1() {
        return this.avatar;
    }

    @Nullable
    public final StoryCardIcon component10() {
        return this.storyCardIcon;
    }

    @Nullable
    public final InlineProgressBar component11() {
        return this.inlineProgressBar;
    }

    public final boolean component12() {
        return this.disableDanmaku;
    }

    public final boolean component13() {
        return this.hideDanmakuSwitch;
    }

    @Nullable
    public final Tag component14() {
        return this.tag;
    }

    @Nullable
    public final PlayerWidget component15() {
        return this.playerWidget;
    }

    @Nullable
    public final Tag component16() {
        return this.ogvBadge;
    }

    @Nullable
    public final String component2() {
        return this.coverRightText;
    }

    @Nullable
    public final String component3() {
        return this.desc;
    }

    @Nullable
    public final SearchLikeButtonItem component4() {
        return this.likeButton;
    }

    public final int component5() {
        return this.officialIcon;
    }

    public final int component6() {
        return this.officialIconV2;
    }

    @Nullable
    public final String component7() {
        return this.param;
    }

    @Nullable
    public final TrafficConfig component8() {
        return this.trafficConfig;
    }

    public final boolean component9() {
        return this.isAtten;
    }

    @NotNull
    public final OgvInline copy(@Nullable Avatar avatar, @Nullable String str, @Nullable String str2, @Nullable SearchLikeButtonItem searchLikeButtonItem, int i7, int i8, @Nullable String str3, @Nullable TrafficConfig trafficConfig, boolean z6, @Nullable StoryCardIcon storyCardIcon, @Nullable InlineProgressBar inlineProgressBar, boolean z7, boolean z8, @Nullable Tag tag, @Nullable PlayerWidget playerWidget, @Nullable Tag tag2) {
        return new OgvInline(avatar, str, str2, searchLikeButtonItem, i7, i8, str3, trafficConfig, z6, storyCardIcon, inlineProgressBar, z7, z8, tag, playerWidget, tag2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OgvInline)) {
            return false;
        }
        OgvInline ogvInline = (OgvInline) obj;
        return Intrinsics.areEqual(this.avatar, ogvInline.avatar) && Intrinsics.areEqual(this.coverRightText, ogvInline.coverRightText) && Intrinsics.areEqual(this.desc, ogvInline.desc) && Intrinsics.areEqual(this.likeButton, ogvInline.likeButton) && this.officialIcon == ogvInline.officialIcon && this.officialIconV2 == ogvInline.officialIconV2 && Intrinsics.areEqual(this.param, ogvInline.param) && Intrinsics.areEqual(this.trafficConfig, ogvInline.trafficConfig) && this.isAtten == ogvInline.isAtten && Intrinsics.areEqual(this.storyCardIcon, ogvInline.storyCardIcon) && Intrinsics.areEqual(this.inlineProgressBar, ogvInline.inlineProgressBar) && this.disableDanmaku == ogvInline.disableDanmaku && this.hideDanmakuSwitch == ogvInline.hideDanmakuSwitch && Intrinsics.areEqual(this.tag, ogvInline.tag) && Intrinsics.areEqual(this.playerWidget, ogvInline.playerWidget) && Intrinsics.areEqual(this.ogvBadge, ogvInline.ogvBadge);
    }

    @Override // com.bilibili.search2.api.BaseSearchInlineData, com.bilibili.search2.api.oversea.a
    @NotNull
    public /* bridge */ /* synthetic */ List getAllItems() {
        return super.getAllItems();
    }

    @Nullable
    public final Avatar getAvatar() {
        return this.avatar;
    }

    @Nullable
    public final String getCoverRightText() {
        return this.coverRightText;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    public final boolean getDisableDanmaku() {
        return this.disableDanmaku;
    }

    public final boolean getHideDanmakuSwitch() {
        return this.hideDanmakuSwitch;
    }

    @Nullable
    public final InlineProgressBar getInlineProgressBar() {
        return this.inlineProgressBar;
    }

    @Nullable
    public final SearchLikeButtonItem getLikeButton() {
        return this.likeButton;
    }

    public final int getOfficialIcon() {
        return this.officialIcon;
    }

    public final int getOfficialIconV2() {
        return this.officialIconV2;
    }

    @Nullable
    public final Tag getOgvBadge() {
        return this.ogvBadge;
    }

    @Nullable
    public final String getParam() {
        return this.param;
    }

    @Nullable
    public final PlayerWidget getPlayerWidget() {
        return this.playerWidget;
    }

    @Nullable
    public final StoryCardIcon getStoryCardIcon() {
        return this.storyCardIcon;
    }

    @Override // com.bilibili.search2.api.BaseSearchInlineData, com.bilibili.search2.api.oversea.a
    @NotNull
    public List getSubItems() {
        return CollectionsKt.emptyList();
    }

    @Nullable
    public final Tag getTag() {
        return this.tag;
    }

    @Nullable
    public final TrafficConfig getTrafficConfig() {
        return this.trafficConfig;
    }

    public int hashCode() {
        Avatar avatar = this.avatar;
        int iHashCode = avatar == null ? 0 : avatar.hashCode();
        String str = this.coverRightText;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.desc;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        SearchLikeButtonItem searchLikeButtonItem = this.likeButton;
        int iA = I.a(this.officialIconV2, I.a(this.officialIcon, ((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (searchLikeButtonItem == null ? 0 : searchLikeButtonItem.hashCode())) * 31, 31), 31);
        String str3 = this.param;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        TrafficConfig trafficConfig = this.trafficConfig;
        int iA2 = z.a((((iA + iHashCode4) * 31) + (trafficConfig == null ? 0 : trafficConfig.hashCode())) * 31, 31, this.isAtten);
        StoryCardIcon storyCardIcon = this.storyCardIcon;
        int iHashCode5 = storyCardIcon == null ? 0 : storyCardIcon.hashCode();
        InlineProgressBar inlineProgressBar = this.inlineProgressBar;
        int iA3 = z.a(z.a((((iA2 + iHashCode5) * 31) + (inlineProgressBar == null ? 0 : inlineProgressBar.hashCode())) * 31, 31, this.disableDanmaku), 31, this.hideDanmakuSwitch);
        Tag tag = this.tag;
        int iHashCode6 = tag == null ? 0 : tag.hashCode();
        PlayerWidget playerWidget = this.playerWidget;
        int iHashCode7 = playerWidget == null ? 0 : playerWidget.hashCode();
        Tag tag2 = this.ogvBadge;
        return ((((iA3 + iHashCode6) * 31) + iHashCode7) * 31) + (tag2 == null ? 0 : tag2.hashCode());
    }

    public final boolean isAtten() {
        return this.isAtten;
    }

    public final void setAtten(boolean z6) {
        this.isAtten = z6;
    }

    public final void setAvatar(@Nullable Avatar avatar) {
        this.avatar = avatar;
    }

    public final void setCoverRightText(@Nullable String str) {
        this.coverRightText = str;
    }

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    public final void setDisableDanmaku(boolean z6) {
        this.disableDanmaku = z6;
    }

    public final void setHideDanmakuSwitch(boolean z6) {
        this.hideDanmakuSwitch = z6;
    }

    public final void setInlineProgressBar(@Nullable InlineProgressBar inlineProgressBar) {
        this.inlineProgressBar = inlineProgressBar;
    }

    public final void setLikeButton(@Nullable SearchLikeButtonItem searchLikeButtonItem) {
        this.likeButton = searchLikeButtonItem;
    }

    public final void setOfficialIcon(int i7) {
        this.officialIcon = i7;
    }

    public final void setOfficialIconV2(int i7) {
        this.officialIconV2 = i7;
    }

    public final void setOgvBadge(@Nullable Tag tag) {
        this.ogvBadge = tag;
    }

    public final void setParam(@Nullable String str) {
        this.param = str;
    }

    public final void setPlayerWidget(@Nullable PlayerWidget playerWidget) {
        this.playerWidget = playerWidget;
    }

    public final void setStoryCardIcon(@Nullable StoryCardIcon storyCardIcon) {
        this.storyCardIcon = storyCardIcon;
    }

    public final void setTag(@Nullable Tag tag) {
        this.tag = tag;
    }

    public final void setTrafficConfig(@Nullable TrafficConfig trafficConfig) {
        this.trafficConfig = trafficConfig;
    }

    @NotNull
    public String toString() {
        Avatar avatar = this.avatar;
        String str = this.coverRightText;
        String str2 = this.desc;
        SearchLikeButtonItem searchLikeButtonItem = this.likeButton;
        int i7 = this.officialIcon;
        int i8 = this.officialIconV2;
        String str3 = this.param;
        TrafficConfig trafficConfig = this.trafficConfig;
        boolean z6 = this.isAtten;
        StoryCardIcon storyCardIcon = this.storyCardIcon;
        InlineProgressBar inlineProgressBar = this.inlineProgressBar;
        boolean z7 = this.disableDanmaku;
        boolean z8 = this.hideDanmakuSwitch;
        Tag tag = this.tag;
        PlayerWidget playerWidget = this.playerWidget;
        Tag tag2 = this.ogvBadge;
        StringBuilder sb = new StringBuilder("OgvInline(avatar=");
        sb.append(avatar);
        sb.append(", coverRightText=");
        sb.append(str);
        sb.append(", desc=");
        sb.append(str2);
        sb.append(", likeButton=");
        sb.append(searchLikeButtonItem);
        sb.append(", officialIcon=");
        C4690e.a(i7, i8, ", officialIconV2=", ", param=", sb);
        sb.append(str3);
        sb.append(", trafficConfig=");
        sb.append(trafficConfig);
        sb.append(", isAtten=");
        sb.append(z6);
        sb.append(", storyCardIcon=");
        sb.append(storyCardIcon);
        sb.append(", inlineProgressBar=");
        sb.append(inlineProgressBar);
        sb.append(", disableDanmaku=");
        sb.append(z7);
        sb.append(", hideDanmakuSwitch=");
        sb.append(z8);
        sb.append(", tag=");
        sb.append(tag);
        sb.append(", playerWidget=");
        sb.append(playerWidget);
        sb.append(", ogvBadge=");
        sb.append(tag2);
        sb.append(")");
        return sb.toString();
    }
}
