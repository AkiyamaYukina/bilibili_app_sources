package com.bilibili.pegasus.channelv2.detail.tab.baike.inline;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineMuteWidgetV3;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.moduleservice.list.IInlineVolumeService;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/inline/ChannelBaikeInlineMuteWidget.class */
@StabilityInferred(parameters = 0)
public final class ChannelBaikeInlineMuteWidget extends InlineMuteWidgetV3 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final IInlineVolumeService f75143k;

    @JvmOverloads
    public ChannelBaikeInlineMuteWidget(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public ChannelBaikeInlineMuteWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public ChannelBaikeInlineMuteWidget(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f75143k = (IInlineVolumeService) BLRouter.INSTANCE.get(IInlineVolumeService.class, "channel_baike_inline_volume_key");
    }

    @Nullable
    public IInlineVolumeService getMuteService() {
        return this.f75143k;
    }
}
