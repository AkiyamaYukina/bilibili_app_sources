package com.bilibili.pegasus.components.interest.ui.v27.page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.OneShotPreDrawListener;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4874m0;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.pegasus.components.interest.t;
import com.bilibili.pegasus.components.interest.ui.v27.vm.InterestChooseV27PageViewModel;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v27/page/InterestChooseV27FirstTab.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseV27FirstTab extends androidx_fragment_app_Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public C4874m0 f76478b;

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C4874m0 c4874m0Inflate = C4874m0.inflate(layoutInflater);
        this.f76478b = c4874m0Inflate;
        return c4874m0Inflate != null ? c4874m0Inflate.f54093a : null;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f76478b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        StateFlow<InterestChoose> stateFlow;
        final InterestChoose interestChoose;
        super.onViewCreated(view, bundle);
        InterestChooseV27PageViewModel interestChooseV27PageViewModel = c.f76482a;
        if (interestChooseV27PageViewModel == null || (stateFlow = interestChooseV27PageViewModel.f76495b) == null || (interestChoose = (InterestChoose) stateFlow.getValue()) == null) {
            return;
        }
        C4874m0 c4874m0 = this.f76478b;
        if (c4874m0 != null) {
            c4874m0.f54099g.setText(interestChoose.getTitle());
        }
        C4874m0 c4874m02 = this.f76478b;
        if (c4874m02 != null) {
            c4874m02.f54098f.setText(interestChoose.F());
        }
        C4874m0 c4874m03 = this.f76478b;
        if (c4874m03 != null) {
            c4874m03.f54094b.setVisibility(0);
        }
        C4874m0 c4874m04 = this.f76478b;
        if (c4874m04 != null) {
            c4874m04.f54095c.setOnClickListener(new View.OnClickListener(interestChoose) { // from class: com.bilibili.pegasus.components.interest.ui.v27.page.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final InterestChoose f76487a;

                {
                    this.f76487a = interestChoose;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    InterestChoose interestChoose2 = this.f76487a;
                    t.b(view2.getContext(), c.f76482a, interestChoose2.D(), interestChoose2.O(), null, null, 56);
                }
            });
        }
        C4874m0 c4874m05 = this.f76478b;
        if (c4874m05 != null) {
            FrameLayout frameLayout = c4874m05.f54095c;
            OneShotPreDrawListener.add(frameLayout, new g(frameLayout, interestChoose));
        }
        C4874m0 c4874m06 = this.f76478b;
        if (c4874m06 != null) {
            c4874m06.f54097e.setItemAnimator(null);
        }
        C4874m0 c4874m07 = this.f76478b;
        if (c4874m07 != null) {
            RecyclerView recyclerView = c4874m07.f54097e;
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
            gridLayoutManager.setSpanSizeLookup(new h(this));
            recyclerView.setLayoutManager(gridLayoutManager);
        }
        C4874m0 c4874m08 = this.f76478b;
        if (c4874m08 != null) {
            c4874m08.f54097e.setAdapter(new Go0.g(new d(this, interestChoose), new e(this, interestChoose)));
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV27FirstTab$initRv$4(this, null), 3, (Object) null);
    }
}
