package com.bilibili.pegasus.channelv2.detail.tab.baike.inline;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.inline.delegate.DefaultInlinePlayDelegate;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.moduleservice.list.IInlineVolumeService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/inline/f.class */
@StabilityInferred(parameters = 0)
public final class f extends DefaultInlinePlayDelegate {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final IInlineVolumeService f75158o;

    public f(@NotNull Fragment fragment) {
        super(fragment, (FragmentActivity) null, (Context) null, 6, (DefaultConstructorMarker) null);
        this.f75158o = (IInlineVolumeService) BLRouter.INSTANCE.get(IInlineVolumeService.class, "channel_baike_inline_volume_key");
    }

    @Nullable
    public final IInlineVolumeService getMuteService() {
        return this.f75158o;
    }

    @NotNull
    public final String getTag() {
        return "ChannelBaikeInlinePlayDelegate";
    }
}
