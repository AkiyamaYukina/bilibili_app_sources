package com.bilibili.pegasus.page;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.HolderBridge;
import com.bilibili.pegasus.PegasusHolderData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.pegasus.page.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/t.class */
@StabilityInferred(parameters = 0)
public final class C5730t implements HolderBridge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TimeMachineViewModel f78439a;

    public C5730t(@NotNull TimeMachineViewModel timeMachineViewModel) {
        this.f78439a = timeMachineViewModel;
    }

    public final void notifyItemChanged(@NotNull PegasusHolderData pegasusHolderData) {
        TimeMachineViewModel timeMachineViewModel = this.f78439a;
        timeMachineViewModel.getClass();
        timeMachineViewModel.z(timeMachineViewModel, new A(pegasusHolderData, null));
    }

    public final void notifyItemChanged(@NotNull PegasusHolderData pegasusHolderData, @Nullable Object obj) {
        TimeMachineViewModel timeMachineViewModel = this.f78439a;
        timeMachineViewModel.getClass();
        timeMachineViewModel.z(timeMachineViewModel, new A(pegasusHolderData, obj));
    }

    public final void notifyItemInsert(@NotNull PegasusHolderData pegasusHolderData, int i7) {
        TimeMachineViewModel timeMachineViewModel = this.f78439a;
        timeMachineViewModel.getClass();
        timeMachineViewModel.z(timeMachineViewModel, new y(pegasusHolderData, i7));
    }

    public final void notifyItemRemove(@NotNull PegasusHolderData pegasusHolderData) {
        TimeMachineViewModel timeMachineViewModel = this.f78439a;
        timeMachineViewModel.getClass();
        timeMachineViewModel.z(timeMachineViewModel, new P(pegasusHolderData));
    }

    public final void replaceItem(@NotNull PegasusHolderData pegasusHolderData, @NotNull PegasusHolderData pegasusHolderData2) {
        TimeMachineViewModel timeMachineViewModel = this.f78439a;
        timeMachineViewModel.getClass();
        timeMachineViewModel.z(timeMachineViewModel, new Q(pegasusHolderData, pegasusHolderData2));
    }
}
