package com.bilibili.topix.center;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.search2.api.SearchBangumiItem;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/TopixCenterData.class */
@StabilityInferred(parameters = 0)
@Keep
public final class TopixCenterData {
    public static final int $stable = 8;

    @JSONField(name = "entrance_button")
    @Nullable
    private EntranceButton entranceButton;

    @JSONField(name = "fav_topics")
    @Nullable
    private FavTopics favTopics;

    @JSONField(name = "has_create_jurisdiction")
    private boolean hasCreateJurisdiction;

    @JSONField(name = "hot_topics")
    @Nullable
    private HotTopics hotTopics;

    @JSONField(name = "ip_topics")
    @Nullable
    private IpTopics ipTopics;

    @JSONField(name = "page_info")
    @Nullable
    private PageInfo pageInfo;

    @JSONField(name = "topic_items")
    @Nullable
    private List<TopicItem> topicItems;

    public TopixCenterData() {
        this(null, null, null, null, null, null, false, SearchBangumiItem.TYPE_FULLNET_BANGUMI, null);
    }

    public TopixCenterData(@Nullable EntranceButton entranceButton, @Nullable IpTopics ipTopics, @Nullable FavTopics favTopics, @Nullable HotTopics hotTopics, @Nullable List<TopicItem> list, @Nullable PageInfo pageInfo, boolean z6) {
        this.entranceButton = entranceButton;
        this.ipTopics = ipTopics;
        this.favTopics = favTopics;
        this.hotTopics = hotTopics;
        this.topicItems = list;
        this.pageInfo = pageInfo;
        this.hasCreateJurisdiction = z6;
    }

    public /* synthetic */ TopixCenterData(EntranceButton entranceButton, IpTopics ipTopics, FavTopics favTopics, HotTopics hotTopics, List list, PageInfo pageInfo, boolean z6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : entranceButton, (i7 & 2) != 0 ? null : ipTopics, (i7 & 4) != 0 ? null : favTopics, (i7 & 8) != 0 ? null : hotTopics, (i7 & 16) != 0 ? null : list, (i7 & 32) != 0 ? null : pageInfo, (i7 & 64) != 0 ? false : z6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TopixCenterData copy$default(TopixCenterData topixCenterData, EntranceButton entranceButton, IpTopics ipTopics, FavTopics favTopics, HotTopics hotTopics, List list, PageInfo pageInfo, boolean z6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            entranceButton = topixCenterData.entranceButton;
        }
        if ((i7 & 2) != 0) {
            ipTopics = topixCenterData.ipTopics;
        }
        if ((i7 & 4) != 0) {
            favTopics = topixCenterData.favTopics;
        }
        if ((i7 & 8) != 0) {
            hotTopics = topixCenterData.hotTopics;
        }
        if ((i7 & 16) != 0) {
            list = topixCenterData.topicItems;
        }
        if ((i7 & 32) != 0) {
            pageInfo = topixCenterData.pageInfo;
        }
        if ((i7 & 64) != 0) {
            z6 = topixCenterData.hasCreateJurisdiction;
        }
        return topixCenterData.copy(entranceButton, ipTopics, favTopics, hotTopics, list, pageInfo, z6);
    }

    @Nullable
    public final EntranceButton component1() {
        return this.entranceButton;
    }

    @Nullable
    public final IpTopics component2() {
        return this.ipTopics;
    }

    @Nullable
    public final FavTopics component3() {
        return this.favTopics;
    }

    @Nullable
    public final HotTopics component4() {
        return this.hotTopics;
    }

    @Nullable
    public final List<TopicItem> component5() {
        return this.topicItems;
    }

    @Nullable
    public final PageInfo component6() {
        return this.pageInfo;
    }

    public final boolean component7() {
        return this.hasCreateJurisdiction;
    }

    @NotNull
    public final TopixCenterData copy(@Nullable EntranceButton entranceButton, @Nullable IpTopics ipTopics, @Nullable FavTopics favTopics, @Nullable HotTopics hotTopics, @Nullable List<TopicItem> list, @Nullable PageInfo pageInfo, boolean z6) {
        return new TopixCenterData(entranceButton, ipTopics, favTopics, hotTopics, list, pageInfo, z6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopixCenterData)) {
            return false;
        }
        TopixCenterData topixCenterData = (TopixCenterData) obj;
        return Intrinsics.areEqual(this.entranceButton, topixCenterData.entranceButton) && Intrinsics.areEqual(this.ipTopics, topixCenterData.ipTopics) && Intrinsics.areEqual(this.favTopics, topixCenterData.favTopics) && Intrinsics.areEqual(this.hotTopics, topixCenterData.hotTopics) && Intrinsics.areEqual(this.topicItems, topixCenterData.topicItems) && Intrinsics.areEqual(this.pageInfo, topixCenterData.pageInfo) && this.hasCreateJurisdiction == topixCenterData.hasCreateJurisdiction;
    }

    @Nullable
    public final EntranceButton getEntranceButton() {
        return this.entranceButton;
    }

    @Nullable
    public final FavTopics getFavTopics() {
        return this.favTopics;
    }

    public final boolean getHasCreateJurisdiction() {
        return this.hasCreateJurisdiction;
    }

    @Nullable
    public final HotTopics getHotTopics() {
        return this.hotTopics;
    }

    @Nullable
    public final IpTopics getIpTopics() {
        return this.ipTopics;
    }

    @Nullable
    public final PageInfo getPageInfo() {
        return this.pageInfo;
    }

    @Nullable
    public final List<TopicItem> getTopicItems() {
        return this.topicItems;
    }

    public int hashCode() {
        EntranceButton entranceButton = this.entranceButton;
        int iHashCode = 0;
        int iHashCode2 = entranceButton == null ? 0 : entranceButton.hashCode();
        IpTopics ipTopics = this.ipTopics;
        int iHashCode3 = ipTopics == null ? 0 : ipTopics.hashCode();
        FavTopics favTopics = this.favTopics;
        int iHashCode4 = favTopics == null ? 0 : favTopics.hashCode();
        HotTopics hotTopics = this.hotTopics;
        int iHashCode5 = hotTopics == null ? 0 : hotTopics.hashCode();
        List<TopicItem> list = this.topicItems;
        int iHashCode6 = list == null ? 0 : list.hashCode();
        PageInfo pageInfo = this.pageInfo;
        if (pageInfo != null) {
            iHashCode = pageInfo.hashCode();
        }
        return Boolean.hashCode(this.hasCreateJurisdiction) + (((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode) * 31);
    }

    public final void setEntranceButton(@Nullable EntranceButton entranceButton) {
        this.entranceButton = entranceButton;
    }

    public final void setFavTopics(@Nullable FavTopics favTopics) {
        this.favTopics = favTopics;
    }

    public final void setHasCreateJurisdiction(boolean z6) {
        this.hasCreateJurisdiction = z6;
    }

    public final void setHotTopics(@Nullable HotTopics hotTopics) {
        this.hotTopics = hotTopics;
    }

    public final void setIpTopics(@Nullable IpTopics ipTopics) {
        this.ipTopics = ipTopics;
    }

    public final void setPageInfo(@Nullable PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public final void setTopicItems(@Nullable List<TopicItem> list) {
        this.topicItems = list;
    }

    @NotNull
    public String toString() {
        EntranceButton entranceButton = this.entranceButton;
        IpTopics ipTopics = this.ipTopics;
        FavTopics favTopics = this.favTopics;
        HotTopics hotTopics = this.hotTopics;
        List<TopicItem> list = this.topicItems;
        PageInfo pageInfo = this.pageInfo;
        boolean z6 = this.hasCreateJurisdiction;
        StringBuilder sb = new StringBuilder("TopixCenterData(entranceButton=");
        sb.append(entranceButton);
        sb.append(", ipTopics=");
        sb.append(ipTopics);
        sb.append(", favTopics=");
        sb.append(favTopics);
        sb.append(", hotTopics=");
        sb.append(hotTopics);
        sb.append(", topicItems=");
        sb.append(list);
        sb.append(", pageInfo=");
        sb.append(pageInfo);
        sb.append(", hasCreateJurisdiction=");
        return androidx.appcompat.app.i.a(sb, z6, ")");
    }
}
