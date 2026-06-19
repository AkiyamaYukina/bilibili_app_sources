package com.bilibili.upper.module.partitionTag.partitionTopic.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bF0.B1;
import com.bilibili.lib.ui.BaseFragment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uI0.C8714c;
import uI0.C8716e;
import zI0.C9165a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/fragment/PartitionFragment.class */
@StabilityInferred(parameters = 0)
public final class PartitionFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f113759b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public C8714c f113760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public C8716e f113761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public C9165a f113762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public AI0.f f113763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public B1 f113764g;

    public final void jf(long j7) {
        C8714c c8714c;
        if (this.f113762e == null || (c8714c = this.f113760c) == null || this.f113761d == null) {
            return;
        }
        B1 b12 = this.f113764g;
        LinearLayoutManager linearLayoutManager = null;
        if ((b12 != null ? b12.f54637b : null) != null) {
            if ((b12 != null ? b12.f54638c : null) == null) {
                return;
            }
            int iO = c8714c.O(r0.a(j7));
            B1 b13 = this.f113764g;
            RecyclerView.LayoutManager layoutManager = b13 != null ? b13.f54637b.getLayoutManager() : null;
            LinearLayoutManager linearLayoutManager2 = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager2 != null) {
                linearLayoutManager2.scrollToPositionWithOffset(iO, 0);
            }
            int iO2 = this.f113761d.O(j7);
            B1 b14 = this.f113764g;
            RecyclerView.LayoutManager layoutManager2 = b14 != null ? b14.f54638c.getLayoutManager() : null;
            if (layoutManager2 instanceof LinearLayoutManager) {
                linearLayoutManager = (LinearLayoutManager) layoutManager2;
            }
            if (linearLayoutManager != null) {
                linearLayoutManager.scrollToPositionWithOffset(iO2, 0);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        B1 b1Inflate = B1.inflate(LayoutInflater.from(getContext()));
        this.f113764g = b1Inflate;
        return b1Inflate != null ? b1Inflate.f54636a : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewCreated(@org.jetbrains.annotations.NotNull android.view.View r9, @org.jetbrains.annotations.Nullable android.os.Bundle r10) {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.partitionTag.partitionTopic.fragment.PartitionFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
