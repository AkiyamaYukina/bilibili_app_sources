package com.bilibili.search2.inline;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.TrafficConfigOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/inline/TrafficConfig.class */
@StabilityInferred(parameters = 0)
@Keep
public final class TrafficConfig {
    public static final int $stable = 8;

    @JSONField(name = "options")
    @Nullable
    private List<Option> options;

    @JSONField(name = "title")
    @Nullable
    private String title;

    public TrafficConfig() {
        this(null, null, 3, null);
    }

    public TrafficConfig(@NotNull com.bapis.bilibili.polymer.app.search.v1.TrafficConfig trafficConfig) {
        this(null, null, 3, null);
        ArrayList arrayList = new ArrayList();
        Iterator it = trafficConfig.getOptionsList().iterator();
        while (it.hasNext()) {
            arrayList.add(new Option((TrafficConfigOption) it.next()));
        }
        this.options = arrayList.isEmpty() ? null : arrayList;
        this.title = trafficConfig.getTitle();
    }

    public TrafficConfig(@Nullable List<Option> list, @Nullable String str) {
        this.options = list;
        this.title = str;
    }

    public /* synthetic */ TrafficConfig(List list, String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : list, (i7 & 2) != 0 ? null : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrafficConfig copy$default(TrafficConfig trafficConfig, List list, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = trafficConfig.options;
        }
        if ((i7 & 2) != 0) {
            str = trafficConfig.title;
        }
        return trafficConfig.copy(list, str);
    }

    @Nullable
    public final List<Option> component1() {
        return this.options;
    }

    @Nullable
    public final String component2() {
        return this.title;
    }

    @NotNull
    public final TrafficConfig copy(@Nullable List<Option> list, @Nullable String str) {
        return new TrafficConfig(list, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrafficConfig)) {
            return false;
        }
        TrafficConfig trafficConfig = (TrafficConfig) obj;
        return Intrinsics.areEqual(this.options, trafficConfig.options) && Intrinsics.areEqual(this.title, trafficConfig.title);
    }

    @Nullable
    public final List<Option> getOptions() {
        return this.options;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        List<Option> list = this.options;
        int iHashCode = 0;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        String str = this.title;
        if (str != null) {
            iHashCode = str.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public final void setOptions(@Nullable List<Option> list) {
        this.options = list;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    @NotNull
    public String toString() {
        return "TrafficConfig(options=" + this.options + ", title=" + this.title + ")";
    }
}
