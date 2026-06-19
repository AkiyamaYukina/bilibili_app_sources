package com.bilibili.pegasus.channelv2.alllist;

import Qn0.o;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/alllist/ChannelAllSideListManager.class */
@StabilityInferred(parameters = 0)
public final class ChannelAllSideListManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f74962a;

    public ChannelAllSideListManager(@NotNull Context context) {
        super(context, 1, false);
        this.f74962a = context;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(@Nullable RecyclerView recyclerView, @Nullable RecyclerView.State state, int i7) {
        o oVar = new o(this.f74962a);
        if (ListExtentionsKt.isRecyclerViewVisible(this)) {
            if (i7 != 0 && i7 != getItemCount() - 1) {
                if (!ListExtentionsKt.isCompletelyVisible(this, i7)) {
                    if (ListExtentionsKt.isVisible(this, i7)) {
                        oVar.f20090a = false;
                    } else {
                        i7--;
                    }
                }
                oVar = null;
            }
            oVar.setTargetPosition(i7);
        } else {
            oVar = null;
        }
        if (oVar == null) {
            return;
        }
        startSmoothScroll(oVar);
    }
}
