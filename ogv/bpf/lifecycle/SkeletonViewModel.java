package com.bilibili.ogv.bpf.lifecycle;

import L2.g;
import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bilibili.app.gemini.ugc.feature.x;
import java.util.concurrent.CopyOnWriteArraySet;
import k.InterfaceC7728a;
import kntr.common.compose.launcher.u;
import kntr.common.trio.toast.ToastDuration;
import kntr.common.trio.toast.ToastGravity;
import kntr.common.trio.toast.Toaster;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/bpf/lifecycle/SkeletonViewModel.class */
@StabilityInferred(parameters = 0)
public class SkeletonViewModel<Model> extends ViewModel implements LifecycleOwner, L2.c {
    public static final int $stable = 8;

    @NotNull
    private final Lazy contextAware$delegate;

    @NotNull
    private final Lazy lifecycleRegistry$delegate;
    public Model model;

    @NotNull
    private final u navigationEventBridge;

    @NotNull
    private final L2.b navigationEventDispatcher;

    @NotNull
    private final Lazy toaster$delegate;

    @NotNull
    private final e uiEnvironmentHolder;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/bpf/lifecycle/SkeletonViewModel$a.class */
    public static final class a implements InterfaceC7728a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k.b f67489a;

        public a(k.b bVar) {
            this.f67489a = bVar;
        }

        @Override // k.InterfaceC7728a
        public final void addOnContextAvailableListener(OnContextAvailableListener onContextAvailableListener) {
            k.b bVar = this.f67489a;
            Context context = bVar.f122668b;
            if (context != null) {
                onContextAvailableListener.onContextAvailable(context);
            }
            ((CopyOnWriteArraySet) bVar.f122667a).add(onContextAvailableListener);
        }

        @Override // k.InterfaceC7728a
        public final void removeOnContextAvailableListener(OnContextAvailableListener onContextAvailableListener) {
            ((CopyOnWriteArraySet) this.f67489a.f122667a).remove(onContextAvailableListener);
        }
    }

    public SkeletonViewModel() {
        e eVar = new e();
        this.uiEnvironmentHolder = eVar;
        this.lifecycleRegistry$delegate = LazyKt.lazy(new x(this, 1));
        this.toaster$delegate = LazyKt.lazy(new com.bilibili.ogv.bpf.lifecycle.a(this, 0));
        this.contextAware$delegate = LazyKt.lazy(new com.bilibili.app.comm.aghanim.core.fragment.b(this, 4));
        g uVar = new u();
        this.navigationEventBridge = uVar;
        L2.b bVar = new L2.b();
        bVar.b(uVar);
        FlowKt.launchIn(FlowKt.onEach(eVar.f67498a, new SkeletonViewModel$navigationEventDispatcher$1$1(this, null)), ViewModelKt.getViewModelScope(this));
        this.navigationEventDispatcher = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a contextAware_delegate$lambda$0(SkeletonViewModel skeletonViewModel) {
        k.b bVar = new k.b();
        FlowKt.launchIn(FlowKt.onEach(skeletonViewModel.uiEnvironmentHolder.f67498a, new SkeletonViewModel$contextAware$2$1(bVar, null)), ViewModelKt.getViewModelScope(skeletonViewModel));
        return new a(bVar);
    }

    private final LifecycleRegistry getLifecycleRegistry() {
        return (LifecycleRegistry) this.lifecycleRegistry$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecycleRegistry lifecycleRegistry_delegate$lambda$0(SkeletonViewModel skeletonViewModel) {
        LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(skeletonViewModel);
        FlowKt.launchIn(FlowKt.onEach(skeletonViewModel.uiEnvironmentHolder.f67498a, new SkeletonViewModel$lifecycleRegistry$2$1(lifecycleRegistry, null)), ViewModelKt.getViewModelScope(skeletonViewModel));
        return lifecycleRegistry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.bpf.lifecycle.SkeletonViewModel$toaster$2$1] */
    public static final SkeletonViewModel$toaster$2$1 toaster_delegate$lambda$0(final SkeletonViewModel skeletonViewModel) {
        return new Toaster(skeletonViewModel) { // from class: com.bilibili.ogv.bpf.lifecycle.SkeletonViewModel$toaster$2$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SkeletonViewModel<Model> f67490a;

            {
                this.f67490a = skeletonViewModel;
            }

            public final void showToast(String str, ToastDuration toastDuration, ToastGravity toastGravity) {
                BuildersKt.launch$default(ViewModelKt.getViewModelScope(this.f67490a), (CoroutineContext) null, (CoroutineStart) null, new SkeletonViewModel$toaster$2$1$showToast$1(this.f67490a, str, toastDuration, toastGravity, null), 3, (Object) null);
            }
        };
    }

    @NotNull
    public final InterfaceC7728a getContextAware() {
        return (InterfaceC7728a) this.contextAware$delegate.getValue();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @NotNull
    public Lifecycle getLifecycle() {
        return getLifecycleRegistry();
    }

    @NotNull
    public final Model getModel() {
        Model model = this.model;
        if (model != null) {
            return model;
        }
        Intrinsics.throwUninitializedPropertyAccessException("model");
        return (Model) Unit.INSTANCE;
    }

    @Override // L2.c
    @NotNull
    public final L2.b getNavigationEventDispatcher() {
        return this.navigationEventDispatcher;
    }

    @NotNull
    public final Toaster getToaster() {
        return (Toaster) this.toaster$delegate.getValue();
    }

    @NotNull
    public final e getUiEnvironmentHolder() {
        return this.uiEnvironmentHolder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initIfNotInitialized(@NotNull Function0<? extends Model> function0) {
        if (isModelInitialized$bpf_release()) {
            return;
        }
        setModel$bpf_release(function0.invoke());
    }

    public final boolean isModelInitialized$bpf_release() {
        return this.model != null;
    }

    public final void setModel$bpf_release(@NotNull Model model) {
        this.model = model;
    }
}
