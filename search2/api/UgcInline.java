package com.bilibili.search2.api;

import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.paging.M;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.SearchInlineData;
import com.bapis.bilibili.polymer.app.search.v1.ThreePointV2;
import com.bilibili.app.comm.list.common.api.model.PlayerArgs;
import com.bilibili.app.comm.list.common.data.InlineThreePointPanel;
import com.bilibili.app.comm.list.common.data.SharePlane;
import com.bilibili.app.comm.list.common.data.StoryCardIcon;
import com.bilibili.app.comm.list.common.inline.view.InlineProgressBar;
import com.bilibili.search2.api.BaseSearchInlineData;
import com.bilibili.search2.inline.Args;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/UgcInline.class */
@StabilityInferred(parameters = 0)
@Keep
public final class UgcInline extends BaseSearchInlineData {
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

    @JSONField(name = "param")
    @Nullable
    private String param;

    @JSONField(name = "goto_icon")
    @Nullable
    private StoryCardIcon storyCardIcon;

    @JSONField(name = "badge_style")
    @Nullable
    private Tag tag;

    @JSONField(name = "traffic_config")
    @Nullable
    private TrafficConfig trafficConfig;

    public UgcInline() {
        this(null, null, null, null, null, 0, 0, null, null, false, null, false, false, null, 16383, null);
    }

    public UgcInline(@NotNull SearchInlineData searchInlineData) {
        this(null, null, null, null, null, 0, 0, null, null, false, null, false, false, null, 16383, null);
        setUri(searchInlineData.getUri());
        setTitle(searchInlineData.getTitle());
        if (searchInlineData.hasPlayerArgs()) {
            setPlayerArgs(new PlayerArgs(searchInlineData.getPlayerArgs()));
        }
        setCanPlay(searchInlineData.getCanPlay());
        if (searchInlineData.hasArgs()) {
            setArgs(new Args(searchInlineData.getArgs()));
        }
        setCardGoto(searchInlineData.getCardGoto());
        setCardType(searchInlineData.getCardType());
        setCover(searchInlineData.getCover());
        setCoverLeftIcon1(searchInlineData.getCoverLeftIcon1());
        setCoverLeftIcon2(searchInlineData.getCoverLeftIcon2());
        setCoverLeftText1(searchInlineData.getCoverLeftText1());
        setCoverLeftText2(searchInlineData.getCoverLeftText2());
        if (searchInlineData.hasUpArgs()) {
            setUpArgs(new BaseSearchInlineData.UpArgs(searchInlineData.getUpArgs()));
        }
        setExtraUri(searchInlineData.getExtraUri());
        setFavorite(searchInlineData.getIsFav());
        setCoin(searchInlineData.getIsCoin());
        setGoto(searchInlineData.getGoto());
        if (searchInlineData.hasShare()) {
            setShare(new BaseSearchInlineData.Share(searchInlineData.getShare()));
        }
        if (searchInlineData.hasThreePoint()) {
            setThreePoint(new BaseSearchInlineData.ThreePointX(searchInlineData.getThreePoint()));
        }
        if (searchInlineData.hasSharePlane()) {
            setSharePlane(new SharePlane(searchInlineData.getSharePlane()));
        }
        if (searchInlineData.hasThreePointMeta()) {
            setThreePointMeta(new InlineThreePointPanel(searchInlineData.getThreePointMeta()));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = searchInlineData.getThreePointV2List().iterator();
        while (it.hasNext()) {
            arrayList.add(new BaseSearchInlineData.ThreePointV2((ThreePointV2) it.next()));
        }
        if (!arrayList.isEmpty()) {
            setThreePointV2(arrayList);
        }
        if (searchInlineData.hasAvatar()) {
            this.avatar = new Avatar(searchInlineData.getAvatar());
        }
        this.coverRightText = searchInlineData.getCoverRightText();
        this.desc = searchInlineData.getDesc();
        if (searchInlineData.hasInlineProgressBar()) {
            this.inlineProgressBar = new InlineProgressBar(searchInlineData.getInlineProgressBar());
        }
        if (searchInlineData.hasLikeButton()) {
            this.likeButton = new SearchLikeButtonItem(searchInlineData.getLikeButton());
        }
        this.officialIcon = searchInlineData.getOfficialIcon();
        this.officialIconV2 = searchInlineData.getOfficialIconV2();
        this.param = searchInlineData.getParam();
        if (searchInlineData.hasTrafficConfig()) {
            this.trafficConfig = new TrafficConfig(searchInlineData.getTrafficConfig());
        }
        this.isAtten = searchInlineData.getIsAtten();
        if (searchInlineData.hasGotoIcon()) {
            this.storyCardIcon = new StoryCardIcon(searchInlineData.getGotoIcon());
        }
        this.disableDanmaku = searchInlineData.getDisableDanmaku();
        this.hideDanmakuSwitch = searchInlineData.getHideDanmakuSwitch();
        if (searchInlineData.hasBadgeStyle()) {
            this.tag = new Tag(searchInlineData.getBadgeStyle());
        }
        setReportFlowData(searchInlineData.getReportFlowData());
    }

    public UgcInline(@Nullable Avatar avatar, @Nullable String str, @Nullable String str2, @Nullable InlineProgressBar inlineProgressBar, @Nullable SearchLikeButtonItem searchLikeButtonItem, int i7, int i8, @Nullable String str3, @Nullable TrafficConfig trafficConfig, boolean z6, @Nullable StoryCardIcon storyCardIcon, boolean z7, boolean z8, @Nullable Tag tag) {
        this.avatar = avatar;
        this.coverRightText = str;
        this.desc = str2;
        this.inlineProgressBar = inlineProgressBar;
        this.likeButton = searchLikeButtonItem;
        this.officialIcon = i7;
        this.officialIconV2 = i8;
        this.param = str3;
        this.trafficConfig = trafficConfig;
        this.isAtten = z6;
        this.storyCardIcon = storyCardIcon;
        this.disableDanmaku = z7;
        this.hideDanmakuSwitch = z8;
        this.tag = tag;
    }

    public /* synthetic */ UgcInline(Avatar avatar, String str, String str2, InlineProgressBar inlineProgressBar, SearchLikeButtonItem searchLikeButtonItem, int i7, int i8, String str3, TrafficConfig trafficConfig, boolean z6, StoryCardIcon storyCardIcon, boolean z7, boolean z8, Tag tag, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? null : avatar, (i9 & 2) != 0 ? null : str, (i9 & 4) != 0 ? null : str2, (i9 & 8) != 0 ? null : inlineProgressBar, (i9 & 16) != 0 ? null : searchLikeButtonItem, (i9 & 32) != 0 ? 0 : i7, (i9 & 64) != 0 ? 0 : i8, (i9 & 128) != 0 ? null : str3, (i9 & 256) != 0 ? null : trafficConfig, (i9 & 512) != 0 ? false : z6, (i9 & 1024) != 0 ? null : storyCardIcon, (i9 & 2048) != 0 ? false : z7, (i9 & 4096) != 0 ? false : z8, (i9 & 8192) != 0 ? null : tag);
    }

    public static /* synthetic */ UgcInline copy$default(UgcInline ugcInline, Avatar avatar, String str, String str2, InlineProgressBar inlineProgressBar, SearchLikeButtonItem searchLikeButtonItem, int i7, int i8, String str3, TrafficConfig trafficConfig, boolean z6, StoryCardIcon storyCardIcon, boolean z7, boolean z8, Tag tag, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            avatar = ugcInline.avatar;
        }
        if ((i9 & 2) != 0) {
            str = ugcInline.coverRightText;
        }
        if ((i9 & 4) != 0) {
            str2 = ugcInline.desc;
        }
        if ((i9 & 8) != 0) {
            inlineProgressBar = ugcInline.inlineProgressBar;
        }
        if ((i9 & 16) != 0) {
            searchLikeButtonItem = ugcInline.likeButton;
        }
        if ((i9 & 32) != 0) {
            i7 = ugcInline.officialIcon;
        }
        if ((i9 & 64) != 0) {
            i8 = ugcInline.officialIconV2;
        }
        if ((i9 & 128) != 0) {
            str3 = ugcInline.param;
        }
        if ((i9 & 256) != 0) {
            trafficConfig = ugcInline.trafficConfig;
        }
        if ((i9 & 512) != 0) {
            z6 = ugcInline.isAtten;
        }
        if ((i9 & 1024) != 0) {
            storyCardIcon = ugcInline.storyCardIcon;
        }
        if ((i9 & 2048) != 0) {
            z7 = ugcInline.disableDanmaku;
        }
        if ((i9 & 4096) != 0) {
            z8 = ugcInline.hideDanmakuSwitch;
        }
        if ((i9 & 8192) != 0) {
            tag = ugcInline.tag;
        }
        return ugcInline.copy(avatar, str, str2, inlineProgressBar, searchLikeButtonItem, i7, i8, str3, trafficConfig, z6, storyCardIcon, z7, z8, tag);
    }

    @Nullable
    public final Avatar component1() {
        return this.avatar;
    }

    public final boolean component10() {
        return this.isAtten;
    }

    @Nullable
    public final StoryCardIcon component11() {
        return this.storyCardIcon;
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
    public final String component2() {
        return this.coverRightText;
    }

    @Nullable
    public final String component3() {
        return this.desc;
    }

    @Nullable
    public final InlineProgressBar component4() {
        return this.inlineProgressBar;
    }

    @Nullable
    public final SearchLikeButtonItem component5() {
        return this.likeButton;
    }

    public final int component6() {
        return this.officialIcon;
    }

    public final int component7() {
        return this.officialIconV2;
    }

    @Nullable
    public final String component8() {
        return this.param;
    }

    @Nullable
    public final TrafficConfig component9() {
        return this.trafficConfig;
    }

    @NotNull
    public final UgcInline copy(@Nullable Avatar avatar, @Nullable String str, @Nullable String str2, @Nullable InlineProgressBar inlineProgressBar, @Nullable SearchLikeButtonItem searchLikeButtonItem, int i7, int i8, @Nullable String str3, @Nullable TrafficConfig trafficConfig, boolean z6, @Nullable StoryCardIcon storyCardIcon, boolean z7, boolean z8, @Nullable Tag tag) {
        return new UgcInline(avatar, str, str2, inlineProgressBar, searchLikeButtonItem, i7, i8, str3, trafficConfig, z6, storyCardIcon, z7, z8, tag);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UgcInline)) {
            return false;
        }
        UgcInline ugcInline = (UgcInline) obj;
        return Intrinsics.areEqual(this.avatar, ugcInline.avatar) && Intrinsics.areEqual(this.coverRightText, ugcInline.coverRightText) && Intrinsics.areEqual(this.desc, ugcInline.desc) && Intrinsics.areEqual(this.inlineProgressBar, ugcInline.inlineProgressBar) && Intrinsics.areEqual(this.likeButton, ugcInline.likeButton) && this.officialIcon == ugcInline.officialIcon && this.officialIconV2 == ugcInline.officialIconV2 && Intrinsics.areEqual(this.param, ugcInline.param) && Intrinsics.areEqual(this.trafficConfig, ugcInline.trafficConfig) && this.isAtten == ugcInline.isAtten && Intrinsics.areEqual(this.storyCardIcon, ugcInline.storyCardIcon) && this.disableDanmaku == ugcInline.disableDanmaku && this.hideDanmakuSwitch == ugcInline.hideDanmakuSwitch && Intrinsics.areEqual(this.tag, ugcInline.tag);
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
    public final String getParam() {
        return this.param;
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
        InlineProgressBar inlineProgressBar = this.inlineProgressBar;
        int iHashCode4 = inlineProgressBar == null ? 0 : inlineProgressBar.hashCode();
        SearchLikeButtonItem searchLikeButtonItem = this.likeButton;
        int iA = I.a(this.officialIconV2, I.a(this.officialIcon, ((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (searchLikeButtonItem == null ? 0 : searchLikeButtonItem.hashCode())) * 31, 31), 31);
        String str3 = this.param;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        TrafficConfig trafficConfig = this.trafficConfig;
        int iA2 = z.a((((iA + iHashCode5) * 31) + (trafficConfig == null ? 0 : trafficConfig.hashCode())) * 31, 31, this.isAtten);
        StoryCardIcon storyCardIcon = this.storyCardIcon;
        int iA3 = z.a(z.a((iA2 + (storyCardIcon == null ? 0 : storyCardIcon.hashCode())) * 31, 31, this.disableDanmaku), 31, this.hideDanmakuSwitch);
        Tag tag = this.tag;
        return iA3 + (tag == null ? 0 : tag.hashCode());
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

    public final void setParam(@Nullable String str) {
        this.param = str;
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
        InlineProgressBar inlineProgressBar = this.inlineProgressBar;
        SearchLikeButtonItem searchLikeButtonItem = this.likeButton;
        int i7 = this.officialIcon;
        int i8 = this.officialIconV2;
        String str3 = this.param;
        TrafficConfig trafficConfig = this.trafficConfig;
        boolean z6 = this.isAtten;
        StoryCardIcon storyCardIcon = this.storyCardIcon;
        boolean z7 = this.disableDanmaku;
        boolean z8 = this.hideDanmakuSwitch;
        Tag tag = this.tag;
        StringBuilder sb = new StringBuilder("UgcInline(avatar=");
        sb.append(avatar);
        sb.append(", coverRightText=");
        sb.append(str);
        sb.append(", desc=");
        sb.append(str2);
        sb.append(", inlineProgressBar=");
        sb.append(inlineProgressBar);
        sb.append(", likeButton=");
        sb.append(searchLikeButtonItem);
        sb.append(", officialIcon=");
        sb.append(i7);
        sb.append(", officialIconV2=");
        M.a(i8, ", param=", str3, ", trafficConfig=", sb);
        sb.append(trafficConfig);
        sb.append(", isAtten=");
        sb.append(z6);
        sb.append(", storyCardIcon=");
        sb.append(storyCardIcon);
        sb.append(", disableDanmaku=");
        sb.append(z7);
        sb.append(", hideDanmakuSwitch=");
        sb.append(z8);
        sb.append(", tag=");
        sb.append(tag);
        sb.append(")");
        return sb.toString();
    }
}
