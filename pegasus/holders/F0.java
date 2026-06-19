package com.bilibili.pegasus.holders;

import com.bilibili.app.comm.list.common.feed.PegasusStyle;
import com.bilibili.app.comm.list.common.feed.PegasusStyleKt;
import com.bilibili.app.comm.list.common.utils.ListDeviceInfoKt;
import com.bilibili.pegasus.HolderStyle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/F0.class */
public final class F0 {
    @NotNull
    public static final fp0.o a() {
        boolean zCurrentIsSingleColumn = PegasusStyleKt.currentIsSingleColumn(PegasusStyle.INSTANCE);
        return new fp0.o(ListDeviceInfoKt.isHdApp() ? "pull_down_tip_v3" : zCurrentIsSingleColumn ? "pull_down_tip_v1" : "pull_down_tip_v2", null, null, null, null, null, 0L, null, 0L, null, new HolderStyle(false, false, false, false, 9, (DefaultConstructorMarker) null), 201326589);
    }
}
