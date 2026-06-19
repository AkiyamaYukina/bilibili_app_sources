package com.bilibili.pegasus.channelv2.detail.tab.baike.inline;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.inline.biz.live.InlineToastTask;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.module.list.IInlineAutoPlayV2Service;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/inline/i.class */
@StabilityInferred(parameters = 0)
public final class i extends InlineToastTask {
    @Nullable
    public final List<String> dependsOn() {
        return null;
    }

    @Nullable
    public final IInlineAutoPlayV2Service getInlineAutoPlayV2Service() {
        return (IInlineAutoPlayV2Service) BLRouter.INSTANCE.get(IInlineAutoPlayV2Service.class, "channel_baike_inline_service_name");
    }
}
