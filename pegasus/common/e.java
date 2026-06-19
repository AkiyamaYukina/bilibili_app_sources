package com.bilibili.pegasus.common;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.common.utils.AutoPlayHelperKt;
import com.bilibili.pegasus.common.inline.InterfaceC5582a;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/e.class */
@StabilityInferred(parameters = 0)
public final class e extends RecyclerView.OnScrollListener {
    public static void a(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || !(layoutManager instanceof LinearLayoutManager)) {
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
            return;
        }
        while (true) {
            Object objFindViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(iFindFirstVisibleItemPosition);
            if (objFindViewHolderForLayoutPosition != null) {
                InterfaceC5582a interfaceC5582a = objFindViewHolderForLayoutPosition instanceof InterfaceC5582a ? (InterfaceC5582a) objFindViewHolderForLayoutPosition : null;
                if (interfaceC5582a != null && AutoPlayHelperKt.isItemViewLittleVisible(interfaceC5582a.getItemView())) {
                    interfaceC5582a.U();
                    BLog.i("IndexFeedLiveInlineReportScrollListener", "report live card position = " + iFindFirstVisibleItemPosition);
                }
            }
            if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                return;
            } else {
                iFindFirstVisibleItemPosition++;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i7) {
        if (i7 == 0) {
            a(recyclerView);
        } else {
            if (i7 != 1) {
                return;
            }
            a(recyclerView);
        }
    }
}
