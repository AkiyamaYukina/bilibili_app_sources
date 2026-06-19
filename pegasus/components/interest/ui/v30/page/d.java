package com.bilibili.pegasus.components.interest.ui.v30.page;

import android.app.Dialog;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import aq0.C4872l0;
import com.google.android.material.R;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v30/page/d.class */
public final class d extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterestChooseV30Dialog f76573a;

    public d(InterestChooseV30Dialog interestChooseV30Dialog) {
        this.f76573a = interestChooseV30Dialog;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.fragment.app.DialogFragment, com.bilibili.pegasus.components.interest.ui.v30.page.InterestChooseV30Dialog] */
    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i7) {
        FrameLayout frameLayout;
        super.onPageSelected(i7);
        defpackage.a.a(i7, "onPageSelected: ", "InterestChooseV30Dialog");
        ?? r02 = this.f76573a;
        C4872l0 c4872l0 = r02.h;
        if (c4872l0 != null) {
            ViewPager2 viewPager2 = c4872l0.f54087d;
            RecyclerView.Adapter adapter = viewPager2.getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : 2;
            int i8 = 0;
            while (i8 < itemCount) {
                RecyclerView.LayoutManager layoutManager = ((RecyclerView) viewPager2.getChildAt(0)).getLayoutManager();
                View viewFindViewByPosition = layoutManager != null ? layoutManager.findViewByPosition(i8) : null;
                if (viewFindViewByPosition != null) {
                    InterestChooseV30Dialog.hf(viewFindViewByPosition, i8 == i7);
                }
                i8++;
            }
        }
        Dialog dialog = r02.getDialog();
        if (dialog == null || (frameLayout = (FrameLayout) dialog.findViewById(R.id.design_bottom_sheet)) == null) {
            return;
        }
        frameLayout.requestLayout();
    }
}
