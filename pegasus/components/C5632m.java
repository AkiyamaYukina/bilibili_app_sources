package com.bilibili.pegasus.components;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.pegasus.Action;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.PegasusHeaderManager;
import com.bilibili.pegasus.vm.PegasusViewModel;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: renamed from: com.bilibili.pegasus.components.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/m.class */
@StabilityInferred(parameters = 0)
public final class C5632m extends BasePegasusComponent {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f77082k = "EarlyRefreshComponent";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f77083l = ((Boolean) com.bilibili.pegasus.common.o.f75659c.getValue()).booleanValue();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f77084m = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PegasusViewModel.class), new b(this), new c(this), new d(this));

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.m$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/m$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C5632m f77085a;

        public a(C5632m c5632m) {
            this.f77085a = c5632m;
        }

        public final void a() {
            BLog.i("[Pegasus]EarlyRefreshComponent", "early refresh cancelled");
            Neurons.trackT$default(false, "list.pegasus.cancel-early-refresh.track", (Map) null, 0, (Function0) null, 28, (Object) null);
            PegasusViewModel pegasusViewModel = (PegasusViewModel) this.f77085a.f77084m.getValue();
            Deferred<? extends Action> deferred = pegasusViewModel.f79018k;
            if (deferred != null) {
                Job.DefaultImpls.cancel$default(deferred, (CancellationException) null, 1, (Object) null);
            }
            pegasusViewModel.f79018k = null;
            pegasusViewModel.f79019l = null;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.m$b */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/m$b.class */
    public static final class b implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C5632m f77086a;

        public b(C5632m c5632m) {
            this.f77086a = c5632m;
        }

        public final Object invoke() {
            return this.f77086a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.m$c */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/m$c.class */
    public static final class c implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C5632m f77087a;

        public c(C5632m c5632m) {
            this.f77087a = c5632m;
        }

        public final Object invoke() {
            return this.f77087a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.m$d */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/m$d.class */
    public static final class d implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C5632m f77088a;

        public d(C5632m c5632m) {
            this.f77088a = c5632m;
        }

        public final Object invoke() {
            return this.f77088a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public final boolean getComponentEnable() {
        return this.f77083l;
    }

    @NotNull
    public final String getComponentName() {
        return this.f77082k;
    }

    public final void onViewCreated(@NotNull View view, @NotNull RecyclerView recyclerView, @NotNull PegasusHeaderManager pegasusHeaderManager) {
        super.onViewCreated(view, recyclerView, pegasusHeaderManager);
        int px = ListExtentionsKt.toPx(64);
        BLog.d("[Pegasus]EarlyRefreshComponent", "setup triggerPx=" + px);
        recyclerView.addOnItemTouchListener(new com.bilibili.pegasus.widget.a(recyclerView, px, new a(this)));
    }
}
