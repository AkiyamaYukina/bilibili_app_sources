package com.bilibili.search2.result.holder.author;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.common.widget.SearchInline4GWarningWidgetV3;
import com.bilibili.inline.biz.live.InlineToastTask;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.module.list.IInlineAutoPlayV2Service;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/author/s.class */
@StabilityInferred(parameters = 0)
public final class s extends InlineToastTask {
    @Nullable
    public final IInlineAutoPlayV2Service getInlineAutoPlayV2Service() {
        BLRouter bLRouter = BLRouter.INSTANCE;
        SearchInline4GWarningWidgetV3.Companion.getClass();
        return (IInlineAutoPlayV2Service) bLRouter.get(IInlineAutoPlayV2Service.class, SearchInline4GWarningWidgetV3.access$getSEARCH_INLINE_SERVICE_NAME$cp());
    }
}
