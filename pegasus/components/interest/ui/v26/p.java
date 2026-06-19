package com.bilibili.pegasus.components.interest.ui.v26;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v26/p.class */
@StabilityInferred(parameters = 0)
public final class p extends FragmentStateAdapter {
    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    @NotNull
    public final Fragment createFragment(int i7) {
        return i7 == 0 ? new InterestChooseDialogFirstTab() : new InterestChooseDialogSecondTab();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return 2;
    }
}
