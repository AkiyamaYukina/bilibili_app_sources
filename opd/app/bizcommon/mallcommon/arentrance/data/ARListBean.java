package com.bilibili.opd.app.bizcommon.mallcommon.arentrance.data;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.account.interfaces.v1.k;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mallcommon/arentrance/data/ARListBean.class */
@StabilityInferred(parameters = 0)
@Keep
public final class ARListBean {
    public static final int $stable = 8;

    @Nullable
    private List<ARItemBean> list;

    public ARListBean() {
        this(null, 1, null);
    }

    public ARListBean(@Nullable List<ARItemBean> list) {
        this.list = list;
    }

    public /* synthetic */ ARListBean(List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ARListBean copy$default(ARListBean aRListBean, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = aRListBean.list;
        }
        return aRListBean.copy(list);
    }

    @Nullable
    public final List<ARItemBean> component1() {
        return this.list;
    }

    @NotNull
    public final ARListBean copy(@Nullable List<ARItemBean> list) {
        return new ARListBean(list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ARListBean) && Intrinsics.areEqual(this.list, ((ARListBean) obj).list);
    }

    @Nullable
    public final List<ARItemBean> getList() {
        return this.list;
    }

    public int hashCode() {
        List<ARItemBean> list = this.list;
        return list == null ? 0 : list.hashCode();
    }

    public final void setList(@Nullable List<ARItemBean> list) {
        this.list = list;
    }

    @NotNull
    public String toString() {
        return k.a("ARListBean(list=", ")", this.list);
    }
}
