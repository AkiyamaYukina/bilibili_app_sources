package com.bilibili.pegasus.components.interest.ui.v29.page;

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
import aq0.C4876n0;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.pegasus.components.interest.ui.v29.vm.InterestChooseV29PageViewModel;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v29/page/InterestChooseV29FirstTab.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseV29FirstTab extends androidx_fragment_app_Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public C4876n0 f76538b;

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C4876n0 c4876n0Inflate = C4876n0.inflate(layoutInflater);
        this.f76538b = c4876n0Inflate;
        return c4876n0Inflate != null ? c4876n0Inflate.f54103a : null;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f76538b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        StateFlow<InterestChoose> stateFlow;
        InterestChoose interestChoose;
        super.onViewCreated(view, bundle);
        InterestChooseV29PageViewModel interestChooseV29PageViewModel = b.f76540a;
        if (interestChooseV29PageViewModel == null || (stateFlow = interestChooseV29PageViewModel.f76549b) == null || (interestChoose = (InterestChoose) stateFlow.getValue()) == null) {
            return;
        }
        C4876n0 c4876n0 = this.f76538b;
        if (c4876n0 != null) {
            c4876n0.f54108f.setText(interestChoose.getTitle());
        }
        C4876n0 c4876n02 = this.f76538b;
        if (c4876n02 != null) {
            c4876n02.f54107e.setText(interestChoose.F());
        }
        C4876n0 c4876n03 = this.f76538b;
        if (c4876n03 != null) {
            c4876n03.f54104b.setVisibility(0);
        }
        C4876n0 c4876n04 = this.f76538b;
        if (c4876n04 != null) {
            c4876n04.f54105c.setOnClickListener(new NF0.b(interestChoose, 1));
        }
        C4876n0 c4876n05 = this.f76538b;
        if (c4876n05 != null) {
            FrameLayout frameLayout = c4876n05.f54105c;
            OneShotPreDrawListener.add(frameLayout, new e(frameLayout, interestChoose));
        }
        C4876n0 c4876n06 = this.f76538b;
        if (c4876n06 != null) {
            c4876n06.f54106d.setItemAnimator(null);
        }
        C4876n0 c4876n07 = this.f76538b;
        if (c4876n07 != null) {
            RecyclerView recyclerView = c4876n07.f54106d;
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
            gridLayoutManager.setSpanSizeLookup(new f(this));
            recyclerView.setLayoutManager(gridLayoutManager);
        }
        C4876n0 c4876n08 = this.f76538b;
        if (c4876n08 != null) {
            c4876n08.f54106d.setAdapter(new Jo0.c(new c(this, interestChoose), new d(this, interestChoose)));
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV29FirstTab$initRv$4(this, null), 3, (Object) null);
    }
}
