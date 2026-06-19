package com.bilibili.pegasus.components.interest.ui.v26;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4880p0;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v26/InterestChooseDialogFirstTab.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseDialogFirstTab extends androidx_fragment_app_Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public C4880p0 f76433b;

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C4880p0 c4880p0Inflate = C4880p0.inflate(layoutInflater);
        this.f76433b = c4880p0Inflate;
        return c4880p0Inflate != null ? c4880p0Inflate.f54121a : null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        StateFlow<InterestChoose> stateFlow;
        InterestChoose interestChoose;
        super.onViewCreated(view, bundle);
        InterestChooseMultiPageViewModel interestChooseMultiPageViewModel = l.f76461a;
        if (interestChooseMultiPageViewModel == null || (stateFlow = interestChooseMultiPageViewModel.f76436b) == null || (interestChoose = (InterestChoose) stateFlow.getValue()) == null) {
            return;
        }
        C4880p0 c4880p0 = this.f76433b;
        if (c4880p0 != null) {
            c4880p0.f54124d.setText(interestChoose.getTitle());
        }
        C4880p0 c4880p02 = this.f76433b;
        if (c4880p02 != null) {
            c4880p02.f54123c.setText(interestChoose.F());
        }
        C4880p0 c4880p03 = this.f76433b;
        if (c4880p03 != null) {
            c4880p03.f54122b.setAdapter(new j(new P61.c(interestChoose, 2), new com.bilibili.bililive.room.ui.chronosguidecard.c(interestChoose, 1)));
        }
        C4880p0 c4880p04 = this.f76433b;
        if (c4880p04 != null) {
            c4880p04.f54122b.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        C4880p0 c4880p05 = this.f76433b;
        if (c4880p05 != null) {
            c4880p05.f54122b.setItemAnimator(null);
        }
        C4880p0 c4880p06 = this.f76433b;
        if (c4880p06 != null) {
            c4880p06.f54122b.addItemDecoration(new RecyclerView.ItemDecoration());
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseDialogFirstTab$initFirstClassList$4(this, null), 3, (Object) null);
    }
}
