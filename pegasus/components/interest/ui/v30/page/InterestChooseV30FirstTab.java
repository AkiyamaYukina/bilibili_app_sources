package com.bilibili.pegasus.components.interest.ui.v30.page;

import Jh.v;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.pegasus.components.interest.ui.v30.vm.InterestChooseV30PageViewModel;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v30/page/InterestChooseV30FirstTab.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseV30FirstTab extends androidx_fragment_app_Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v f76566b;

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        v vVarInflate = v.inflate(layoutInflater);
        this.f76566b = vVarInflate;
        v vVar = vVarInflate;
        if (vVarInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vVar = null;
        }
        return vVar.a;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        StateFlow<InterestChoose> stateFlow;
        InterestChoose interestChoose;
        super.onViewCreated(view, bundle);
        InterestChooseV30PageViewModel interestChooseV30PageViewModel = e.f76574a;
        if (interestChooseV30PageViewModel == null || (stateFlow = interestChooseV30PageViewModel.f76581b) == null || (interestChoose = (InterestChoose) stateFlow.getValue()) == null) {
            return;
        }
        v vVar = this.f76566b;
        v vVar2 = vVar;
        if (vVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vVar2 = null;
        }
        vVar2.f.setText(interestChoose.getTitle());
        v vVar3 = this.f76566b;
        v vVar4 = vVar3;
        if (vVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vVar4 = null;
        }
        vVar4.e.setText(interestChoose.F());
        v vVar5 = this.f76566b;
        v vVar6 = vVar5;
        if (vVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vVar6 = null;
        }
        vVar6.d.setOverScrollMode(2);
        v vVar7 = this.f76566b;
        v vVar8 = vVar7;
        if (vVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vVar8 = null;
        }
        vVar8.d.setItemAnimator(null);
        v vVar9 = this.f76566b;
        v vVar10 = vVar9;
        if (vVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vVar10 = null;
        }
        RecyclerView recyclerView = vVar10.d;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        gridLayoutManager.setSpanSizeLookup(new h(this));
        recyclerView.setLayoutManager(gridLayoutManager);
        v vVar11 = this.f76566b;
        v vVar12 = vVar11;
        if (vVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vVar12 = null;
        }
        vVar12.d.setAdapter(new Lo0.f(new f(this, interestChoose), new g(this, interestChoose)));
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV30FirstTab$initRv$4(this, null), 3, (Object) null);
    }
}
