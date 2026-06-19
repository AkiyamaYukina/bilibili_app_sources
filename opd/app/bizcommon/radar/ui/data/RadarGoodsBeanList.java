package com.bilibili.opd.app.bizcommon.radar.ui.data;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.account.interfaces.v1.k;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/ui/data/RadarGoodsBeanList.class */
@StabilityInferred(parameters = 0)
@Keep
public final class RadarGoodsBeanList {
    public static final int $stable = 8;

    @Nullable
    private List<RadarGoodsBean> list;

    public RadarGoodsBeanList() {
        this(null, 1, null);
    }

    public RadarGoodsBeanList(@Nullable List<RadarGoodsBean> list) {
        this.list = list;
    }

    public /* synthetic */ RadarGoodsBeanList(List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RadarGoodsBeanList copy$default(RadarGoodsBeanList radarGoodsBeanList, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = radarGoodsBeanList.list;
        }
        return radarGoodsBeanList.copy(list);
    }

    @Nullable
    public final List<RadarGoodsBean> component1() {
        return this.list;
    }

    @NotNull
    public final RadarGoodsBeanList copy(@Nullable List<RadarGoodsBean> list) {
        return new RadarGoodsBeanList(list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RadarGoodsBeanList) && Intrinsics.areEqual(this.list, ((RadarGoodsBeanList) obj).list);
    }

    @Nullable
    public final List<RadarGoodsBean> getList() {
        return this.list;
    }

    public int hashCode() {
        List<RadarGoodsBean> list = this.list;
        return list == null ? 0 : list.hashCode();
    }

    public final void setList(@Nullable List<RadarGoodsBean> list) {
        this.list = list;
    }

    @NotNull
    public String toString() {
        return k.a("RadarGoodsBeanList(list=", ")", this.list);
    }
}
