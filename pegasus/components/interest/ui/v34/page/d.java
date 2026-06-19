package com.bilibili.pegasus.components.interest.ui.v34.page;

import android.app.Dialog;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import aq0.C4885s;
import com.google.android.material.R;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v34/page/d.class */
public final class d extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterestChooseV34Dialog f76772a;

    public d(InterestChooseV34Dialog interestChooseV34Dialog) {
        this.f76772a = interestChooseV34Dialog;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.fragment.app.DialogFragment, com.bilibili.pegasus.components.interest.ui.v34.page.InterestChooseV34Dialog] */
    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i7) {
        FrameLayout frameLayout;
        RecyclerView.Adapter adapter;
        super.onPageSelected(i7);
        defpackage.a.a(i7, "onPageSelected: ", "InterestChooseV34Dialog");
        ?? r02 = this.f76772a;
        C4885s c4885s = r02.h;
        int itemCount = (c4885s == null || (adapter = c4885s.f54141c.getAdapter()) == null) ? 2 : adapter.getItemCount();
        int i8 = 0;
        while (i8 < itemCount) {
            C4885s c4885s2 = r02.h;
            RecyclerView.LayoutManager layoutManager = ((RecyclerView) (c4885s2 != null ? c4885s2.f54141c.getChildAt(0) : null)).getLayoutManager();
            View viewFindViewByPosition = null;
            if (layoutManager != null) {
                viewFindViewByPosition = layoutManager.findViewByPosition(i8);
            }
            if (viewFindViewByPosition != null) {
                InterestChooseV34Dialog.hf(viewFindViewByPosition, i8 == i7);
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
