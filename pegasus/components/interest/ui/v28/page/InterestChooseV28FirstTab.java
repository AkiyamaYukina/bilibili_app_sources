package com.bilibili.pegasus.components.interest.ui.v28.page;

import Jh.u;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.pegasus.components.interest.ui.v27.vm.InterestChooseV27PageViewModel;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v28/page/InterestChooseV28FirstTab.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseV28FirstTab extends androidx_fragment_app_Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u f76520b;

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.f76520b = u.inflate(layoutInflater);
        BLog.d("InterestChooseV28FirstTab", "onCreateView");
        u uVar = this.f76520b;
        u uVar2 = uVar;
        if (uVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uVar2 = null;
        }
        return uVar2.a;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        StateFlow<InterestChoose> stateFlow;
        InterestChoose interestChoose;
        super.onViewCreated(view, bundle);
        InterestChooseV27PageViewModel interestChooseV27PageViewModel = e.f76528a;
        if (interestChooseV27PageViewModel == null || (stateFlow = interestChooseV27PageViewModel.f76495b) == null || (interestChoose = (InterestChoose) stateFlow.getValue()) == null) {
            return;
        }
        u uVar = this.f76520b;
        u uVar2 = uVar;
        if (uVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uVar2 = null;
        }
        uVar2.e.setText(interestChoose.getTitle());
        u uVar3 = this.f76520b;
        u uVar4 = uVar3;
        if (uVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uVar4 = null;
        }
        uVar4.d.setText(interestChoose.F());
        u uVar5 = this.f76520b;
        u uVar6 = uVar5;
        if (uVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uVar6 = null;
        }
        uVar6.c.setItemAnimator(null);
        u uVar7 = this.f76520b;
        u uVar8 = uVar7;
        if (uVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uVar8 = null;
        }
        RecyclerView recyclerView = uVar8.c;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        gridLayoutManager.setSpanSizeLookup(new h(this));
        recyclerView.setLayoutManager(gridLayoutManager);
        u uVar9 = this.f76520b;
        u uVar10 = uVar9;
        if (uVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uVar10 = null;
        }
        uVar10.c.setAdapter(new Io0.g(new f(this, interestChoose), new g(this, interestChoose)));
        u uVar11 = this.f76520b;
        u uVar12 = uVar11;
        if (uVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uVar12 = null;
        }
        uVar12.c.setOverScrollMode(2);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV28FirstTab$initRv$4(this, null), 3, (Object) null);
    }
}
