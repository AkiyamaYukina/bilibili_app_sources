package com.bilibili.pegasus.components.interest.ui.v26;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4886s0;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.magicasakura.widgets.TintLinearLayout;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v26/InterestChooseDialogSecondTab.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseDialogSecondTab extends androidx_fragment_app_Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public C4886s0 f76434b;

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C4886s0 c4886s0Inflate = C4886s0.inflate(layoutInflater);
        this.f76434b = c4886s0Inflate;
        return c4886s0Inflate != null ? c4886s0Inflate.f54142a : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View$OnClickListener, java.lang.Object] */
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
        RecyclerView recyclerView;
        TintLinearLayout tintLinearLayout;
        super.onViewCreated(view, bundle);
        C4886s0 c4886s0 = this.f76434b;
        if (c4886s0 != null && (tintLinearLayout = c4886s0.f54143b) != 0) {
            tintLinearLayout.setOnClickListener(new Object());
        }
        C4886s0 c4886s02 = this.f76434b;
        if (c4886s02 != null && (recyclerView = c4886s02.f54145d) != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseDialogSecondTab$initBasicView$2(this, null), 3, (Object) null);
    }
}
