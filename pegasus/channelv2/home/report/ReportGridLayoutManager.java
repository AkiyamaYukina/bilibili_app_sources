package com.bilibili.pegasus.channelv2.home.report;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.pegasus.channelv2.home.center.ChannelHomeCenterFragment;
import gl.a;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/home/report/ReportGridLayoutManager.class */
@StabilityInferred(parameters = 0)
public final class ReportGridLayoutManager extends GridLayoutManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public ChannelHomeCenterFragment f75281a;

    public ReportGridLayoutManager(@Nullable Context context, @Nullable AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutCompleted(@Nullable RecyclerView.State state) {
        a aVar;
        RecyclerView recyclerView;
        super.onLayoutCompleted(state);
        ChannelHomeCenterFragment channelHomeCenterFragment = this.f75281a;
        if (channelHomeCenterFragment == null || (aVar = channelHomeCenterFragment.f75248b) == null || (recyclerView = aVar.c) == null) {
            return;
        }
        channelHomeCenterFragment.f75251e.onScrollStateChanged(recyclerView, recyclerView.getScrollState());
    }
}
