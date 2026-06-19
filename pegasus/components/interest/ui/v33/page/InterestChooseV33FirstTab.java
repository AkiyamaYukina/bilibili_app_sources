package com.bilibili.pegasus.components.interest.ui.v33.page;

import android.content.Context;
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
import aq0.C4891v;
import com.bilibili.bililive.biz.interactionpanel.pk.widget.o;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.pegasus.components.interest.ui.v33.vm.InterestChooseV33PageViewModel;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v33/page/InterestChooseV33FirstTab.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseV33FirstTab extends androidx_fragment_app_Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public C4891v f76720b;

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C4891v c4891vInflate = C4891v.inflate(layoutInflater);
        this.f76720b = c4891vInflate;
        return c4891vInflate != null ? c4891vInflate.f54164a : null;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f76720b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        StateFlow<InterestChoose> stateFlow;
        InterestChoose interestChoose;
        super.onViewCreated(view, bundle);
        InterestChooseV33PageViewModel interestChooseV33PageViewModel = c.f76724a;
        if (interestChooseV33PageViewModel == null || (stateFlow = interestChooseV33PageViewModel.f76742f) == null || (interestChoose = (InterestChoose) stateFlow.getValue()) == null) {
            return;
        }
        C4891v c4891v = this.f76720b;
        if (c4891v != null) {
            c4891v.f54170g.setText(interestChoose.getTitle());
        }
        C4891v c4891v2 = this.f76720b;
        if (c4891v2 != null) {
            c4891v2.f54169f.setText(interestChoose.F());
        }
        Context context = getContext();
        boolean zIsNightTheme = context != null ? MultipleThemeUtils.isNightTheme(context) : false;
        C4891v c4891v3 = this.f76720b;
        if (c4891v3 != null) {
            c4891v3.f54165b.setAlpha(zIsNightTheme ? 0.7f : 1.0f);
        }
        C4891v c4891v4 = this.f76720b;
        if (c4891v4 != null) {
            c4891v4.f54165b.setVisibility(0);
        }
        C4891v c4891v5 = this.f76720b;
        if (c4891v5 != null) {
            c4891v5.f54166c.setOnClickListener(new o(interestChoose, 1));
        }
        C4891v c4891v6 = this.f76720b;
        if (c4891v6 != null) {
            FrameLayout frameLayout = c4891v6.f54166c;
            OneShotPreDrawListener.add(frameLayout, new f(frameLayout, interestChoose));
        }
        C4891v c4891v7 = this.f76720b;
        if (c4891v7 != null) {
            c4891v7.f54168e.setItemAnimator(null);
        }
        C4891v c4891v8 = this.f76720b;
        if (c4891v8 != null) {
            RecyclerView recyclerView = c4891v8.f54168e;
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
            gridLayoutManager.setSpanSizeLookup(new g(this));
            recyclerView.setLayoutManager(gridLayoutManager);
        }
        C4891v c4891v9 = this.f76720b;
        if (c4891v9 != null) {
            c4891v9.f54168e.setAdapter(new Oo0.f(new d(this, interestChoose), new e(this, interestChoose)));
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV33FirstTab$initRv$4(this, null), 3, (Object) null);
    }
}
