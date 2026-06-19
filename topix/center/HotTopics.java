package com.bilibili.topix.center;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/HotTopics.class */
@StabilityInferred(parameters = 0)
@Keep
public final class HotTopics {
    public static final int $stable = 8;

    @JSONField(name = "hot_items")
    @Nullable
    private List<TopicItem> hotItems;

    public HotTopics() {
        this(null, 1, null);
    }

    public HotTopics(@Nullable List<TopicItem> list) {
        this.hotItems = list;
    }

    public /* synthetic */ HotTopics(List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HotTopics copy$default(HotTopics hotTopics, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = hotTopics.hotItems;
        }
        return hotTopics.copy(list);
    }

    @Nullable
    public final List<TopicItem> component1() {
        return this.hotItems;
    }

    @NotNull
    public final HotTopics copy(@Nullable List<TopicItem> list) {
        return new HotTopics(list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HotTopics) && Intrinsics.areEqual(this.hotItems, ((HotTopics) obj).hotItems);
    }

    @Nullable
    public final List<TopicItem> getHotItems() {
        return this.hotItems;
    }

    public int hashCode() {
        List<TopicItem> list = this.hotItems;
        return list == null ? 0 : list.hashCode();
    }

    public final void setHotItems(@Nullable List<TopicItem> list) {
        this.hotItems = list;
    }

    @NotNull
    public String toString() {
        return com.bapis.bilibili.account.interfaces.v1.k.a("HotTopics(hotItems=", ")", this.hotItems);
    }
}
