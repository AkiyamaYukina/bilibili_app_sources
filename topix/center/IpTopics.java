package com.bilibili.topix.center;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/IpTopics.class */
@StabilityInferred(parameters = 0)
@Keep
public final class IpTopics {
    public static final int $stable = 8;

    @JSONField(name = "items")
    @Nullable
    private List<IpTopicItem> items;

    public IpTopics() {
        this(null, 1, null);
    }

    public IpTopics(@Nullable List<IpTopicItem> list) {
        this.items = list;
    }

    public /* synthetic */ IpTopics(List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IpTopics copy$default(IpTopics ipTopics, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = ipTopics.items;
        }
        return ipTopics.copy(list);
    }

    @Nullable
    public final List<IpTopicItem> component1() {
        return this.items;
    }

    @NotNull
    public final IpTopics copy(@Nullable List<IpTopicItem> list) {
        return new IpTopics(list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IpTopics) && Intrinsics.areEqual(this.items, ((IpTopics) obj).items);
    }

    @Nullable
    public final List<IpTopicItem> getItems() {
        return this.items;
    }

    public int hashCode() {
        List<IpTopicItem> list = this.items;
        return list == null ? 0 : list.hashCode();
    }

    public final void setItems(@Nullable List<IpTopicItem> list) {
        this.items = list;
    }

    @NotNull
    public String toString() {
        return com.bapis.bilibili.account.interfaces.v1.k.a("IpTopics(items=", ")", this.items);
    }
}
