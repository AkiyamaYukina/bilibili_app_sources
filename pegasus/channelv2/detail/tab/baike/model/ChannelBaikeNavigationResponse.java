package com.bilibili.pegasus.channelv2.detail.tab.baike.model;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/model/ChannelBaikeNavigationResponse.class */
@StabilityInferred(parameters = 0)
@Keep
public final class ChannelBaikeNavigationResponse {
    public static final int $stable = 8;

    @JSONField(name = "baike_info")
    @Nullable
    private ChannelBaikeInfo baikeInfo;

    @JSONField(name = "baike_tree")
    @Nullable
    private ChannelBaikeTree baikeTree;

    @JSONField(name = NotificationCompat.CATEGORY_NAVIGATION)
    @Nullable
    private ChannelBaikeNavigation navigation;

    @JSONField(name = "version")
    @Nullable
    private String version;

    public ChannelBaikeNavigationResponse() {
        this(null, null, null, null, 15, null);
    }

    public ChannelBaikeNavigationResponse(@Nullable String str, @Nullable ChannelBaikeNavigation channelBaikeNavigation, @Nullable ChannelBaikeTree channelBaikeTree, @Nullable ChannelBaikeInfo channelBaikeInfo) {
        this.version = str;
        this.navigation = channelBaikeNavigation;
        this.baikeTree = channelBaikeTree;
        this.baikeInfo = channelBaikeInfo;
    }

    public /* synthetic */ ChannelBaikeNavigationResponse(String str, ChannelBaikeNavigation channelBaikeNavigation, ChannelBaikeTree channelBaikeTree, ChannelBaikeInfo channelBaikeInfo, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : channelBaikeNavigation, (i7 & 4) != 0 ? null : channelBaikeTree, (i7 & 8) != 0 ? null : channelBaikeInfo);
    }

    public static /* synthetic */ ChannelBaikeNavigationResponse copy$default(ChannelBaikeNavigationResponse channelBaikeNavigationResponse, String str, ChannelBaikeNavigation channelBaikeNavigation, ChannelBaikeTree channelBaikeTree, ChannelBaikeInfo channelBaikeInfo, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = channelBaikeNavigationResponse.version;
        }
        if ((i7 & 2) != 0) {
            channelBaikeNavigation = channelBaikeNavigationResponse.navigation;
        }
        if ((i7 & 4) != 0) {
            channelBaikeTree = channelBaikeNavigationResponse.baikeTree;
        }
        if ((i7 & 8) != 0) {
            channelBaikeInfo = channelBaikeNavigationResponse.baikeInfo;
        }
        return channelBaikeNavigationResponse.copy(str, channelBaikeNavigation, channelBaikeTree, channelBaikeInfo);
    }

    @Nullable
    public final String component1() {
        return this.version;
    }

    @Nullable
    public final ChannelBaikeNavigation component2() {
        return this.navigation;
    }

    @Nullable
    public final ChannelBaikeTree component3() {
        return this.baikeTree;
    }

    @Nullable
    public final ChannelBaikeInfo component4() {
        return this.baikeInfo;
    }

    @NotNull
    public final ChannelBaikeNavigationResponse copy(@Nullable String str, @Nullable ChannelBaikeNavigation channelBaikeNavigation, @Nullable ChannelBaikeTree channelBaikeTree, @Nullable ChannelBaikeInfo channelBaikeInfo) {
        return new ChannelBaikeNavigationResponse(str, channelBaikeNavigation, channelBaikeTree, channelBaikeInfo);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelBaikeNavigationResponse)) {
            return false;
        }
        ChannelBaikeNavigationResponse channelBaikeNavigationResponse = (ChannelBaikeNavigationResponse) obj;
        return Intrinsics.areEqual(this.version, channelBaikeNavigationResponse.version) && Intrinsics.areEqual(this.navigation, channelBaikeNavigationResponse.navigation) && Intrinsics.areEqual(this.baikeTree, channelBaikeNavigationResponse.baikeTree) && Intrinsics.areEqual(this.baikeInfo, channelBaikeNavigationResponse.baikeInfo);
    }

    @Nullable
    public final ChannelBaikeInfo getBaikeInfo() {
        return this.baikeInfo;
    }

    @Nullable
    public final ChannelBaikeTree getBaikeTree() {
        return this.baikeTree;
    }

    @Nullable
    public final ChannelBaikeNavigation getNavigation() {
        return this.navigation;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.version;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        ChannelBaikeNavigation channelBaikeNavigation = this.navigation;
        int iHashCode3 = channelBaikeNavigation == null ? 0 : channelBaikeNavigation.hashCode();
        ChannelBaikeTree channelBaikeTree = this.baikeTree;
        int iHashCode4 = channelBaikeTree == null ? 0 : channelBaikeTree.hashCode();
        ChannelBaikeInfo channelBaikeInfo = this.baikeInfo;
        if (channelBaikeInfo != null) {
            iHashCode = channelBaikeInfo.hashCode();
        }
        return (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
    }

    public final void setBaikeInfo(@Nullable ChannelBaikeInfo channelBaikeInfo) {
        this.baikeInfo = channelBaikeInfo;
    }

    public final void setBaikeTree(@Nullable ChannelBaikeTree channelBaikeTree) {
        this.baikeTree = channelBaikeTree;
    }

    public final void setNavigation(@Nullable ChannelBaikeNavigation channelBaikeNavigation) {
        this.navigation = channelBaikeNavigation;
    }

    public final void setVersion(@Nullable String str) {
        this.version = str;
    }

    @NotNull
    public String toString() {
        return "ChannelBaikeNavigationResponse(version=" + this.version + ", navigation=" + this.navigation + ", baikeTree=" + this.baikeTree + ", baikeInfo=" + this.baikeInfo + ")";
    }
}
