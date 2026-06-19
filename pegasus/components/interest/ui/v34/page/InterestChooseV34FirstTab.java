package com.bilibili.pegasus.components.interest.ui.v34.page;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4893w;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.pegasus.components.interest.ui.v34.vm.InterestChooseV34PageViewModel;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v34/page/InterestChooseV34FirstTab.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseV34FirstTab extends androidx_fragment_app_Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public C4893w f76765b;

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C4893w c4893wInflate = C4893w.inflate(layoutInflater);
        this.f76765b = c4893wInflate;
        return c4893wInflate != null ? c4893wInflate.f54175a : null;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f76765b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        StateFlow<InterestChoose> stateFlow;
        InterestChoose interestChoose;
        super.onViewCreated(view, bundle);
        InterestChooseV34PageViewModel interestChooseV34PageViewModel = e.f76773a;
        if (interestChooseV34PageViewModel == null || (stateFlow = interestChooseV34PageViewModel.f76783d) == null || (interestChoose = (InterestChoose) stateFlow.getValue()) == null) {
            return;
        }
        C4893w c4893w = this.f76765b;
        if (c4893w != null) {
            c4893w.f54181g.setText(interestChoose.getTitle());
        }
        C4893w c4893w2 = this.f76765b;
        if (c4893w2 != null) {
            c4893w2.f54180f.setText(interestChoose.F());
        }
        Context context = getContext();
        boolean zIsNightTheme = context != null ? MultipleThemeUtils.isNightTheme(context) : false;
        C4893w c4893w3 = this.f76765b;
        if (c4893w3 != null) {
            c4893w3.f54176b.setAlpha(zIsNightTheme ? 0.7f : 1.0f);
        }
        C4893w c4893w4 = this.f76765b;
        if (c4893w4 != null) {
            c4893w4.f54176b.setVisibility(0);
        }
        C4893w c4893w5 = this.f76765b;
        if (c4893w5 != null) {
            c4893w5.f54179e.setItemAnimator(null);
        }
        C4893w c4893w6 = this.f76765b;
        if (c4893w6 != null) {
            c4893w6.f54179e.setOverScrollMode(2);
        }
        C4893w c4893w7 = this.f76765b;
        if (c4893w7 != null) {
            RecyclerView recyclerView = c4893w7.f54179e;
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
            gridLayoutManager.setSpanSizeLookup(new h(this));
            recyclerView.setLayoutManager(gridLayoutManager);
        }
        C4893w c4893w8 = this.f76765b;
        if (c4893w8 != null) {
            c4893w8.f54179e.setAdapter(new Qo0.f(new f(this, interestChoose), new g(this, interestChoose)));
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV34FirstTab$initRv$4(this, null), 3, (Object) null);
    }
}
