package com.bilibili.ogv.opbase;

import X1.C3081k;
import androidx.annotation.Keep;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.z;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/BangumiUgcVideoV2.class */
@StabilityInferred(parameters = 0)
@Keep
public final class BangumiUgcVideoV2 {
    public static final int $stable = 8;
    private long cbottom;
    private long ctop;

    @JSONField(name = "new")
    @Nullable
    private List<BangumiUgcVideoItemV2> ugcItem;

    public BangumiUgcVideoV2() {
        this(0L, 0L, null, 7, null);
    }

    public BangumiUgcVideoV2(long j7, long j8, @Nullable List<BangumiUgcVideoItemV2> list) {
        this.cbottom = j7;
        this.ctop = j8;
        this.ugcItem = list;
    }

    public /* synthetic */ BangumiUgcVideoV2(long j7, long j8, List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0L : j7, (i7 & 2) != 0 ? 0L : j8, (i7 & 4) != 0 ? Collections.emptyList() : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BangumiUgcVideoV2 copy$default(BangumiUgcVideoV2 bangumiUgcVideoV2, long j7, long j8, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j7 = bangumiUgcVideoV2.cbottom;
        }
        if ((i7 & 2) != 0) {
            j8 = bangumiUgcVideoV2.ctop;
        }
        if ((i7 & 4) != 0) {
            list = bangumiUgcVideoV2.ugcItem;
        }
        return bangumiUgcVideoV2.copy(j7, j8, list);
    }

    public final long component1() {
        return this.cbottom;
    }

    public final long component2() {
        return this.ctop;
    }

    @Nullable
    public final List<BangumiUgcVideoItemV2> component3() {
        return this.ugcItem;
    }

    @NotNull
    public final BangumiUgcVideoV2 copy(long j7, long j8, @Nullable List<BangumiUgcVideoItemV2> list) {
        return new BangumiUgcVideoV2(j7, j8, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BangumiUgcVideoV2)) {
            return false;
        }
        BangumiUgcVideoV2 bangumiUgcVideoV2 = (BangumiUgcVideoV2) obj;
        return this.cbottom == bangumiUgcVideoV2.cbottom && this.ctop == bangumiUgcVideoV2.ctop && Intrinsics.areEqual(this.ugcItem, bangumiUgcVideoV2.ugcItem);
    }

    public final long getCbottom() {
        return this.cbottom;
    }

    public final long getCtop() {
        return this.ctop;
    }

    @Nullable
    public final List<BangumiUgcVideoItemV2> getUgcItem() {
        return this.ugcItem;
    }

    public int hashCode() {
        int iA = C3554n0.a(Long.hashCode(this.cbottom) * 31, 31, this.ctop);
        List<BangumiUgcVideoItemV2> list = this.ugcItem;
        return iA + (list == null ? 0 : list.hashCode());
    }

    public final void setCbottom(long j7) {
        this.cbottom = j7;
    }

    public final void setCtop(long j7) {
        this.ctop = j7;
    }

    public final void setUgcItem(@Nullable List<BangumiUgcVideoItemV2> list) {
        this.ugcItem = list;
    }

    @NotNull
    public String toString() {
        long j7 = this.cbottom;
        long j8 = this.ctop;
        List<BangumiUgcVideoItemV2> list = this.ugcItem;
        StringBuilder sbA = z.a(j7, "BangumiUgcVideoV2(cbottom=", ", ctop=");
        C3081k.c(sbA, j8, ", ugcItem=", list);
        sbA.append(")");
        return sbA.toString();
    }
}
