package com.bilibili.pegasus.promo.setting;

import M3.C2627w;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/promo/setting/k.class */
public final class k {
    @Nullable
    public static final RecommendColumnSwitchData a() {
        String singleColumnItemTitle;
        String doubleColumnItemTitle;
        Object objA = com.bilibili.app.comm.list.common.utils.a.a("pegasus.recommend_column_switch_info", RecommendColumnSwitchData.class, new C2627w(6));
        RecommendColumnSwitchData recommendColumnSwitchData = (RecommendColumnSwitchData) objA;
        String title = recommendColumnSwitchData.getTitle();
        if (title == null || StringsKt.isBlank(title) || (singleColumnItemTitle = recommendColumnSwitchData.getSingleColumnItemTitle()) == null || StringsKt.isBlank(singleColumnItemTitle) || (doubleColumnItemTitle = recommendColumnSwitchData.getDoubleColumnItemTitle()) == null || StringsKt.isBlank(doubleColumnItemTitle)) {
            objA = null;
        }
        return (RecommendColumnSwitchData) objA;
    }
}
