package com.bilibili.pegasus.channelv2.detail.tab.select;

import Wp.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelProvider;
import bo0.AbstractC5132b;
import bo0.C5131a;
import com.bilibili.pegasus.channelv2.detail.tab.base.BaseChannelDetailFragment;
import ko0.C7777a;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/select/ChannelDetailSelectFragment.class */
@StabilityInferred(parameters = 0)
public final class ChannelDetailSelectFragment extends BaseChannelDetailFragment {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f75247z = 61;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final Lazy f75246A = LazyKt.lazy(new b(this, 9));

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return Op0.b.b("traffic.new-channel-detail-featured.0.0");
    }

    @Override // com.bilibili.pegasus.channelv2.detail.tab.base.BaseChannelDetailFragment
    public final void initViewModel() {
        this.f75232p = (AbstractC5132b) new ViewModelProvider(this).get(C7777a.class);
    }

    @Override // com.bilibili.pegasus.channelv2.detail.tab.base.BaseChannelDetailFragment
    public final C5131a lf() {
        return (C5131a) this.f75246A.getValue();
    }

    @Override // com.bilibili.pegasus.channelv2.detail.tab.base.BaseChannelDetailFragment
    public final void of(@NotNull String str) {
    }
}
