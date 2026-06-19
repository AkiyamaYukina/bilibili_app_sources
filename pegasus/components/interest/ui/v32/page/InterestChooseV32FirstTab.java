package com.bilibili.pegasus.components.interest.ui.v32.page;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4879p;
import com.bilibili.app.comm.list.widget.utils.s;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.pegasus.components.interest.ui.v32.vm.InterestChooseV32PageViewModel;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v32/page/InterestChooseV32FirstTab.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseV32FirstTab extends androidx_fragment_app_Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public C4879p f76667b;

    public final InterestChooseV32PageViewModel hf() {
        Object parentFragment = getParentFragment();
        InterestChooseV32PageViewModel interestChooseV32PageViewModelJf = null;
        InterestChooseV32Dialog interestChooseV32Dialog = parentFragment instanceof InterestChooseV32Dialog ? (InterestChooseV32Dialog) parentFragment : null;
        if (interestChooseV32Dialog != null) {
            interestChooseV32PageViewModelJf = interestChooseV32Dialog.jf();
        }
        return interestChooseV32PageViewModelJf;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C4879p c4879pInflate = C4879p.inflate(layoutInflater);
        this.f76667b = c4879pInflate;
        return c4879pInflate != null ? c4879pInflate.f54115a : null;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f76667b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        StateFlow<Fo0.h> stateFlow;
        Fo0.h hVar;
        super.onViewCreated(view, bundle);
        InterestChooseV32PageViewModel interestChooseV32PageViewModelHf = hf();
        if (interestChooseV32PageViewModelHf == null || (stateFlow = interestChooseV32PageViewModelHf.h) == null || (hVar = (Fo0.h) stateFlow.getValue()) == null) {
            return;
        }
        C4879p c4879p = this.f76667b;
        if (c4879p != null) {
            c4879p.f54120f.setText(hVar.h);
        }
        C4879p c4879p2 = this.f76667b;
        if (c4879p2 != null) {
            c4879p2.f54119e.setText(hVar.f6347n);
        }
        Context context = getContext();
        boolean zIsNightTheme = context != null ? MultipleThemeUtils.isNightTheme(context) : false;
        C4879p c4879p3 = this.f76667b;
        if (c4879p3 != null) {
            c4879p3.f54116b.setAlpha(zIsNightTheme ? 0.7f : 1.0f);
        }
        C4879p c4879p4 = this.f76667b;
        if (c4879p4 != null) {
            c4879p4.f54116b.setVisibility(0);
        }
        C4879p c4879p5 = this.f76667b;
        if (c4879p5 != null) {
            c4879p5.f54118d.setItemAnimator(null);
        }
        C4879p c4879p6 = this.f76667b;
        if (c4879p6 != null) {
            c4879p6.f54118d.setOverScrollMode(2);
        }
        C4879p c4879p7 = this.f76667b;
        if (c4879p7 != null) {
            RecyclerView recyclerView = c4879p7.f54118d;
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
            gridLayoutManager.setSpanSizeLookup(new h(this));
            recyclerView.setLayoutManager(gridLayoutManager);
        }
        C4879p c4879p8 = this.f76667b;
        if (c4879p8 != null) {
            c4879p8.f54118d.setAdapter(new No0.i(new f(this), new g(this)));
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV32FirstTab$initRv$4(this, null), 3, (Object) null);
        s.c(this, new YI0.e(this, 1));
    }
}
