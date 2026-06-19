package com.bilibili.pegasus.components.interest.ui.v28.page;

import android.app.Dialog;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import aq0.C4872l0;
import com.google.android.material.R;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v28/page/d.class */
public final class d extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterestChooseV28Dialog f76527a;

    public d(InterestChooseV28Dialog interestChooseV28Dialog) {
        this.f76527a = interestChooseV28Dialog;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.fragment.app.DialogFragment, com.bilibili.pegasus.components.interest.ui.v28.page.InterestChooseV28Dialog] */
    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i7) {
        FrameLayout frameLayout;
        RecyclerView.Adapter adapter;
        super.onPageSelected(i7);
        defpackage.a.a(i7, "onPageSelected: ", "InterestChooseV28Dialog");
        ?? r02 = this.f76527a;
        C4872l0 c4872l0 = r02.f76513b;
        int itemCount = (c4872l0 == null || (adapter = c4872l0.f54087d.getAdapter()) == null) ? 2 : adapter.getItemCount();
        int i8 = 0;
        while (i8 < itemCount) {
            C4872l0 c4872l02 = r02.f76513b;
            View childAt = c4872l02 != null ? c4872l02.f54087d.getChildAt(0) : null;
            RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
            View viewFindViewByPosition = null;
            if (recyclerView != null) {
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                viewFindViewByPosition = null;
                if (layoutManager != null) {
                    viewFindViewByPosition = layoutManager.findViewByPosition(i8);
                }
            }
            if (viewFindViewByPosition != null) {
                InterestChooseV28Dialog.hf(viewFindViewByPosition, i8 == i7);
            }
            i8++;
        }
        Dialog dialog = r02.getDialog();
        if (dialog == null || (frameLayout = (FrameLayout) dialog.findViewById(R.id.design_bottom_sheet)) == null) {
            return;
        }
        frameLayout.requestLayout();
    }
}
