package com.bilibili.ogv.operation2.inlinevideo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.common.inline.config.pegasus.PegasusInlineConfigKt;
import com.bilibili.inline.utils.InlineExtensionKt;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.moduleservice.list.IPegasusInlineConfig;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/OgvVideoStatusHelper.class */
@StabilityInferred(parameters = 1)
public final class OgvVideoStatusHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f70898a = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean c() {
        return PegasusInlineConfigKt.isAutoPlayEnable((IPegasusInlineConfig) BLRouter.get$default(BLRouter.INSTANCE, IPegasusInlineConfig.class, (String) null, 2, (Object) null));
    }

    @NotNull
    public final Flow<Boolean> b() {
        return FlowKt.distinctUntilChanged(FlowKt.flow(new OgvVideoStatusHelper$autoPlaySwitchFlow$1(this, null)));
    }

    public final boolean d() {
        return (InlineExtensionKt.isVideoFloatWindowShow() || InlineExtensionKt.isLiveFloatWindowShow()) ? false : true;
    }

    @NotNull
    public final Flow<Boolean> e() {
        return FlowKt.distinctUntilChanged(FlowKt.flow(new OgvVideoStatusHelper$noMiniPlayerFlow$1(this, null)));
    }
}
