package com.bilibili.pegasus.components;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.PegasusHeaderManager;
import com.bilibili.pegasus.vm.PegasusViewModel;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.pegasus.components.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/p.class */
@StabilityInferred(parameters = 0)
public final class C5635p extends BasePegasusComponent {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f77107k = "EventComponent";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f77108l = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PegasusViewModel.class), new a(this), new b(this), new c(this));

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.p$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/p$a.class */
    public static final class a implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C5635p f77109a;

        public a(C5635p c5635p) {
            this.f77109a = c5635p;
        }

        public final Object invoke() {
            return this.f77109a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.p$b */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/p$b.class */
    public static final class b implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C5635p f77110a;

        public b(C5635p c5635p) {
            this.f77110a = c5635p;
        }

        public final Object invoke() {
            return this.f77110a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.p$c */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/p$c.class */
    public static final class c implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C5635p f77111a;

        public c(C5635p c5635p) {
            this.f77111a = c5635p;
        }

        public final Object invoke() {
            return this.f77111a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    @NotNull
    public final String getComponentName() {
        return this.f77107k;
    }

    public final void onViewCreated(@NotNull View view, @NotNull RecyclerView recyclerView, @NotNull PegasusHeaderManager pegasusHeaderManager) {
        LifecycleOwner viewLifecycleOwner;
        LifecycleCoroutineScope lifecycleScope;
        super.onViewCreated(view, recyclerView, pegasusHeaderManager);
        if (com.bilibili.pegasus.request.b.f78807d || (viewLifecycleOwner = getViewLifecycleOwner()) == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner)) == null) {
            return;
        }
        BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new EventComponent$registerFirstPegasusRenderEvent$1(this, recyclerView, null), 3, (Object) null);
    }
}
