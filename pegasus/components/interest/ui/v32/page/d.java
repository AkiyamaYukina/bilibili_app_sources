package com.bilibili.pegasus.components.interest.ui.v32.page;

import android.app.Dialog;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import aq0.C4859f;
import com.google.android.material.R;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v32/page/d.class */
public final class d extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterestChooseV32Dialog f76679a;

    public d(InterestChooseV32Dialog interestChooseV32Dialog) {
        this.f76679a = interestChooseV32Dialog;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.fragment.app.DialogFragment, com.bilibili.pegasus.components.interest.ui.v32.page.InterestChooseV32Dialog] */
    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i7) {
        FrameLayout frameLayout;
        RecyclerView.Adapter adapter;
        super.onPageSelected(i7);
        defpackage.a.a(i7, "onPageSelected: ", "InterestChooseV32Dialog");
        ?? r02 = this.f76679a;
        C4859f c4859f = r02.f76663m;
        int itemCount = (c4859f == null || (adapter = c4859f.f54030c.getAdapter()) == null) ? 3 : adapter.getItemCount();
        int i8 = 0;
        while (i8 < itemCount) {
            C4859f c4859f2 = r02.f76663m;
            RecyclerView.LayoutManager layoutManager = ((RecyclerView) (c4859f2 != null ? c4859f2.f54030c.getChildAt(0) : null)).getLayoutManager();
            View viewFindViewByPosition = null;
            if (layoutManager != null) {
                viewFindViewByPosition = layoutManager.findViewByPosition(i8);
            }
            if (viewFindViewByPosition != null) {
                InterestChooseV32Dialog.m8056if(viewFindViewByPosition, i8 == i7);
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
