package com.bilibili.pegasus.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.HolderBridge;
import com.bilibili.pegasus.PegasusHolderData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/w.class */
@StabilityInferred(parameters = 0)
public final class w implements HolderBridge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PegasusViewModel f79093a;

    public w(@NotNull PegasusViewModel pegasusViewModel) {
        this.f79093a = pegasusViewModel;
    }

    public final void notifyItemChanged(@NotNull PegasusHolderData pegasusHolderData) {
        PegasusViewModel pegasusViewModel = this.f79093a;
        pegasusViewModel.getClass();
        pegasusViewModel.z(pegasusViewModel, new k(pegasusHolderData, null));
    }

    public final void notifyItemChanged(@NotNull PegasusHolderData pegasusHolderData, @Nullable Object obj) {
        PegasusViewModel pegasusViewModel = this.f79093a;
        pegasusViewModel.getClass();
        pegasusViewModel.z(pegasusViewModel, new k(pegasusHolderData, obj));
    }

    public final void notifyItemInsert(@NotNull PegasusHolderData pegasusHolderData, int i7) {
        PegasusViewModel pegasusViewModel = this.f79093a;
        pegasusViewModel.getClass();
        pegasusViewModel.z(pegasusViewModel, new h(pegasusHolderData, i7));
    }

    public final void notifyItemRemove(@NotNull PegasusHolderData pegasusHolderData) {
        PegasusViewModel pegasusViewModel = this.f79093a;
        pegasusViewModel.getClass();
        pegasusViewModel.z(pegasusViewModel, new D(pegasusHolderData, true));
    }

    public final void replaceItem(@NotNull PegasusHolderData pegasusHolderData, @NotNull PegasusHolderData pegasusHolderData2) {
        PegasusViewModel pegasusViewModel = this.f79093a;
        pegasusViewModel.getClass();
        pegasusViewModel.z(pegasusViewModel, new F(pegasusHolderData, pegasusHolderData2));
    }
}
