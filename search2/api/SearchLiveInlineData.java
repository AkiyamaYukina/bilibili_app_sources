package com.bilibili.search2.api;

import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.C4690e;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.SearchInlineData;
import com.bapis.bilibili.polymer.app.search.v1.ThreePointV2;
import com.bilibili.app.comm.list.common.api.model.PlayerArgs;
import com.bilibili.app.comm.list.common.data.InlineThreePointPanel;
import com.bilibili.app.comm.list.common.data.SharePlane;
import com.bilibili.app.comm.list.common.data.StoryCardIcon;
import com.bilibili.app.comm.list.common.inline.view.RightTopLiveBadge;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchLiveInlineData.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchLiveInlineData extends BaseSearchInlineData {
    public static final int $stable = 8;

    @JSONField(name = "avatar")
    @Nullable
    private Avatar avatar;

    @JSONField(name = "desc")
    @Nullable
    private String desc;

    @JSONField(name = "disable_danmu")
    private boolean disableDanmaku;

    @JSONField(name = "hide_danmu_switch")
    private boolean hideDanmakuSwitch;

    @JSONField(name = "is_atten")
    private boolean isAtten;

    @JSONField(name = "official_icon")
    private int officialIcon;

    @JSONField(name = "official_icon_v2")
    private int officialIconV2;

    @JSONField(name = "param")
    @Nullable
    private String param;

    @JSONField(name = "right_top_live_badge")
    @Nullable
    private RightTopLiveBadge rightTopLiveBadge;

    @JSONField(name = "goto_icon")
    @Nullable
    private StoryCardIcon storyCardIcon;

    @JSONField(name = "badge_style")
    @Nullable
    private Tag tag;

    @JSONField(name = "traffic_config")
    @Nullable
    private TrafficConfig trafficConfig;

    public SearchLiveInlineData() {
        this(null, null, 0, 0, null, null, null, false, null, false, false, null, 4095, null);
    }

    public SearchLiveInlineData(@NotNull SearchInlineData searchInlineData) {
        this(null, null, 0, 0, null, null, null, false, null, false, false, null, 4095, null);
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
        this.desc = searchInlineData.getDesc();
        this.officialIcon = searchInlineData.getOfficialIcon();
        this.officialIconV2 = searchInlineData.getOfficialIconV2();
        this.param = searchInlineData.getParam();
        if (searchInlineData.hasTrafficConfig()) {
            this.trafficConfig = new TrafficConfig(searchInlineData.getTrafficConfig());
        }
        if (searchInlineData.hasRightTopLiveBadge()) {
            this.rightTopLiveBadge = new RightTopLiveBadge(searchInlineData.getRightTopLiveBadge());
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
        setTranslatedTitle(searchInlineData.getTranslatedTitle());
    }

    public SearchLiveInlineData(@Nullable Avatar avatar, @Nullable String str, int i7, int i8, @Nullable String str2, @Nullable RightTopLiveBadge rightTopLiveBadge, @Nullable TrafficConfig trafficConfig, boolean z6, @Nullable StoryCardIcon storyCardIcon, boolean z7, boolean z8, @Nullable Tag tag) {
        this.avatar = avatar;
        this.desc = str;
        this.officialIcon = i7;
        this.officialIconV2 = i8;
        this.param = str2;
        this.rightTopLiveBadge = rightTopLiveBadge;
        this.trafficConfig = trafficConfig;
        this.isAtten = z6;
        this.storyCardIcon = storyCardIcon;
        this.disableDanmaku = z7;
        this.hideDanmakuSwitch = z8;
        this.tag = tag;
    }

    public /* synthetic */ SearchLiveInlineData(Avatar avatar, String str, int i7, int i8, String str2, RightTopLiveBadge rightTopLiveBadge, TrafficConfig trafficConfig, boolean z6, StoryCardIcon storyCardIcon, boolean z7, boolean z8, Tag tag, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? null : avatar, (i9 & 2) != 0 ? null : str, (i9 & 4) != 0 ? 0 : i7, (i9 & 8) != 0 ? 0 : i8, (i9 & 16) != 0 ? null : str2, (i9 & 32) != 0 ? null : rightTopLiveBadge, (i9 & 64) != 0 ? null : trafficConfig, (i9 & 128) != 0 ? false : z6, (i9 & 256) != 0 ? null : storyCardIcon, (i9 & 512) != 0 ? false : z7, (i9 & 1024) != 0 ? false : z8, (i9 & 2048) != 0 ? null : tag);
    }

    public static /* synthetic */ SearchLiveInlineData copy$default(SearchLiveInlineData searchLiveInlineData, Avatar avatar, String str, int i7, int i8, String str2, RightTopLiveBadge rightTopLiveBadge, TrafficConfig trafficConfig, boolean z6, StoryCardIcon storyCardIcon, boolean z7, boolean z8, Tag tag, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            avatar = searchLiveInlineData.avatar;
        }
        if ((i9 & 2) != 0) {
            str = searchLiveInlineData.desc;
        }
        if ((i9 & 4) != 0) {
            i7 = searchLiveInlineData.officialIcon;
        }
        if ((i9 & 8) != 0) {
            i8 = searchLiveInlineData.officialIconV2;
        }
        if ((i9 & 16) != 0) {
            str2 = searchLiveInlineData.param;
        }
        if ((i9 & 32) != 0) {
            rightTopLiveBadge = searchLiveInlineData.rightTopLiveBadge;
        }
        if ((i9 & 64) != 0) {
            trafficConfig = searchLiveInlineData.trafficConfig;
        }
        if ((i9 & 128) != 0) {
            z6 = searchLiveInlineData.isAtten;
        }
        if ((i9 & 256) != 0) {
            storyCardIcon = searchLiveInlineData.storyCardIcon;
        }
        if ((i9 & 512) != 0) {
            z7 = searchLiveInlineData.disableDanmaku;
        }
        if ((i9 & 1024) != 0) {
            z8 = searchLiveInlineData.hideDanmakuSwitch;
        }
        if ((i9 & 2048) != 0) {
            tag = searchLiveInlineData.tag;
        }
        return searchLiveInlineData.copy(avatar, str, i7, i8, str2, rightTopLiveBadge, trafficConfig, z6, storyCardIcon, z7, z8, tag);
    }

    @Nullable
    public final Avatar component1() {
        return this.avatar;
    }

    public final boolean component10() {
        return this.disableDanmaku;
    }

    public final boolean component11() {
        return this.hideDanmakuSwitch;
    }

    @Nullable
    public final Tag component12() {
        return this.tag;
    }

    @Nullable
    public final String component2() {
        return this.desc;
    }

    public final int component3() {
        return this.officialIcon;
    }

    public final int component4() {
        return this.officialIconV2;
    }

    @Nullable
    public final String component5() {
        return this.param;
    }

    @Nullable
    public final RightTopLiveBadge component6() {
        return this.rightTopLiveBadge;
    }

    @Nullable
    public final TrafficConfig component7() {
        return this.trafficConfig;
    }

    public final boolean component8() {
        return this.isAtten;
    }

    @Nullable
    public final StoryCardIcon component9() {
        return this.storyCardIcon;
    }

    @NotNull
    public final SearchLiveInlineData copy(@Nullable Avatar avatar, @Nullable String str, int i7, int i8, @Nullable String str2, @Nullable RightTopLiveBadge rightTopLiveBadge, @Nullable TrafficConfig trafficConfig, boolean z6, @Nullable StoryCardIcon storyCardIcon, boolean z7, boolean z8, @Nullable Tag tag) {
        return new SearchLiveInlineData(avatar, str, i7, i8, str2, rightTopLiveBadge, trafficConfig, z6, storyCardIcon, z7, z8, tag);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchLiveInlineData)) {
            return false;
        }
        SearchLiveInlineData searchLiveInlineData = (SearchLiveInlineData) obj;
        return Intrinsics.areEqual(this.avatar, searchLiveInlineData.avatar) && Intrinsics.areEqual(this.desc, searchLiveInlineData.desc) && this.officialIcon == searchLiveInlineData.officialIcon && this.officialIconV2 == searchLiveInlineData.officialIconV2 && Intrinsics.areEqual(this.param, searchLiveInlineData.param) && Intrinsics.areEqual(this.rightTopLiveBadge, searchLiveInlineData.rightTopLiveBadge) && Intrinsics.areEqual(this.trafficConfig, searchLiveInlineData.trafficConfig) && this.isAtten == searchLiveInlineData.isAtten && Intrinsics.areEqual(this.storyCardIcon, searchLiveInlineData.storyCardIcon) && this.disableDanmaku == searchLiveInlineData.disableDanmaku && this.hideDanmakuSwitch == searchLiveInlineData.hideDanmakuSwitch && Intrinsics.areEqual(this.tag, searchLiveInlineData.tag);
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
    public final String getDesc() {
        return this.desc;
    }

    public final boolean getDisableDanmaku() {
        return this.disableDanmaku;
    }

    public final boolean getHideDanmakuSwitch() {
        return this.hideDanmakuSwitch;
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
    public final RightTopLiveBadge getRightTopLiveBadge() {
        return this.rightTopLiveBadge;
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
        String str = this.desc;
        int iA = I.a(this.officialIconV2, I.a(this.officialIcon, ((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        String str2 = this.param;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        RightTopLiveBadge rightTopLiveBadge = this.rightTopLiveBadge;
        int iHashCode3 = rightTopLiveBadge == null ? 0 : rightTopLiveBadge.hashCode();
        TrafficConfig trafficConfig = this.trafficConfig;
        int iA2 = z.a((((((iA + iHashCode2) * 31) + iHashCode3) * 31) + (trafficConfig == null ? 0 : trafficConfig.hashCode())) * 31, 31, this.isAtten);
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

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    public final void setDisableDanmaku(boolean z6) {
        this.disableDanmaku = z6;
    }

    public final void setHideDanmakuSwitch(boolean z6) {
        this.hideDanmakuSwitch = z6;
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

    public final void setRightTopLiveBadge(@Nullable RightTopLiveBadge rightTopLiveBadge) {
        this.rightTopLiveBadge = rightTopLiveBadge;
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
        String str = this.desc;
        int i7 = this.officialIcon;
        int i8 = this.officialIconV2;
        String str2 = this.param;
        RightTopLiveBadge rightTopLiveBadge = this.rightTopLiveBadge;
        TrafficConfig trafficConfig = this.trafficConfig;
        boolean z6 = this.isAtten;
        StoryCardIcon storyCardIcon = this.storyCardIcon;
        boolean z7 = this.disableDanmaku;
        boolean z8 = this.hideDanmakuSwitch;
        Tag tag = this.tag;
        StringBuilder sb = new StringBuilder("SearchLiveInlineData(avatar=");
        sb.append(avatar);
        sb.append(", desc=");
        sb.append(str);
        sb.append(", officialIcon=");
        C4690e.a(i7, i8, ", officialIconV2=", ", param=", sb);
        sb.append(str2);
        sb.append(", rightTopLiveBadge=");
        sb.append(rightTopLiveBadge);
        sb.append(", trafficConfig=");
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
