package com.bilibili.pegasus.components.interest.ui.v35.page;

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
import aq0.C4825B;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.pegasus.components.interest.ui.v35.vm.InterestChooseV35PageViewModel;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v35/page/InterestChooseV35FirstTab.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseV35FirstTab extends androidx_fragment_app_Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public C4825B f76799b;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C4825B c4825bInflate = C4825B.inflate(layoutInflater);
        this.f76799b = c4825bInflate;
        return c4825bInflate.f53662a;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f76799b = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        StateFlow<InterestChoose> stateFlow;
        InterestChoose interestChoose;
        super.onViewCreated(view, bundle);
        InterestChooseV35PageViewModel interestChooseV35PageViewModel = c.f76804a;
        if (interestChooseV35PageViewModel == null || (stateFlow = interestChooseV35PageViewModel.f76817b) == null || (interestChoose = (InterestChoose) stateFlow.getValue()) == null) {
            return;
        }
        C4825B c4825b = this.f76799b;
        if (c4825b != null) {
            c4825b.f53668g.setText(interestChoose.getTitle());
        }
        C4825B c4825b2 = this.f76799b;
        if (c4825b2 != null) {
            c4825b2.f53667f.setText(interestChoose.F());
        }
        Context context = getContext();
        boolean zIsNightTheme = context != null ? MultipleThemeUtils.isNightTheme(context) : false;
        C4825B c4825b3 = this.f76799b;
        if (c4825b3 != null) {
            c4825b3.f53663b.setAlpha(zIsNightTheme ? 0.7f : 1.0f);
        }
        C4825B c4825b4 = this.f76799b;
        if (c4825b4 != null) {
            c4825b4.f53663b.setVisibility(0);
        }
        C4825B c4825b5 = this.f76799b;
        if (c4825b5 != null) {
            c4825b5.f53665d.setVisibility(0);
        }
        C4825B c4825b6 = this.f76799b;
        if (c4825b6 != null) {
            c4825b6.f53665d.setOnClickListener(new Object());
        }
        C4825B c4825b7 = this.f76799b;
        if (c4825b7 != null) {
            c4825b7.f53664c.setOnClickListener(new bR0.d(interestChoose, 1));
        }
        C4825B c4825b8 = this.f76799b;
        if (c4825b8 != null) {
            FrameLayout frameLayout = c4825b8.f53664c;
            OneShotPreDrawListener.add(frameLayout, new g(frameLayout, interestChoose));
        }
        C4825B c4825b9 = this.f76799b;
        if (c4825b9 != null) {
            c4825b9.f53666e.setItemAnimator(null);
        }
        C4825B c4825b10 = this.f76799b;
        if (c4825b10 != null) {
            RecyclerView recyclerView = c4825b10.f53666e;
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
            gridLayoutManager.setSpanSizeLookup(new h(this));
            recyclerView.setLayoutManager(gridLayoutManager);
        }
        C4825B c4825b11 = this.f76799b;
        if (c4825b11 != null) {
            c4825b11.f53666e.setAdapter(new So0.f(new e(this, interestChoose), new f(this, interestChoose)));
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV35FirstTab$initRv$4(this, null), 3, (Object) null);
    }
}
