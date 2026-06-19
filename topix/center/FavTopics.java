package com.bilibili.topix.center;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/FavTopics.class */
@StabilityInferred(parameters = 0)
@Keep
public final class FavTopics implements n {
    public static final int $stable = 8;

    @JSONField(name = "fav_items")
    @Nullable
    private List<TopicItem> favItems;
    private transient boolean hasScrolled;

    @JSONField(name = "more_link")
    @Nullable
    private String moreLink;

    public FavTopics() {
        this(null, null, 3, null);
    }

    public FavTopics(@Nullable List<TopicItem> list, @Nullable String str) {
        this.favItems = list;
        this.moreLink = str;
    }

    public /* synthetic */ FavTopics(List list, String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : list, (i7 & 2) != 0 ? null : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FavTopics copy$default(FavTopics favTopics, List list, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = favTopics.favItems;
        }
        if ((i7 & 2) != 0) {
            str = favTopics.moreLink;
        }
        return favTopics.copy(list, str);
    }

    @Nullable
    public final List<TopicItem> component1() {
        return this.favItems;
    }

    @Nullable
    public final String component2() {
        return this.moreLink;
    }

    @NotNull
    public final FavTopics copy(@Nullable List<TopicItem> list, @Nullable String str) {
        return new FavTopics(list, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(FavTopics.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        FavTopics favTopics = (FavTopics) obj;
        return Intrinsics.areEqual(this.favItems, favTopics.favItems) && Intrinsics.areEqual(this.moreLink, favTopics.moreLink);
    }

    @Nullable
    public final List<TopicItem> getFavItems() {
        return this.favItems;
    }

    public final boolean getHasScrolled() {
        return this.hasScrolled;
    }

    @Nullable
    public final String getMoreLink() {
        return this.moreLink;
    }

    @Override // com.bilibili.topix.center.n
    @NotNull
    public TopixCenterItemType getType() {
        return TopixCenterItemType.TOPIC_COLLECTED_LIST;
    }

    public int hashCode() {
        List<TopicItem> list = this.favItems;
        int iHashCode = 0;
        int iHashCode2 = list != null ? list.hashCode() : 0;
        String str = this.moreLink;
        if (str != null) {
            iHashCode = str.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public final void setFavItems(@Nullable List<TopicItem> list) {
        this.favItems = list;
    }

    public final void setHasScrolled(boolean z6) {
        this.hasScrolled = z6;
    }

    public final void setMoreLink(@Nullable String str) {
        this.moreLink = str;
    }

    @NotNull
    public String toString() {
        return "FavTopics(favItems=" + this.favItems + ", moreLink=" + this.moreLink + ")";
    }
}
