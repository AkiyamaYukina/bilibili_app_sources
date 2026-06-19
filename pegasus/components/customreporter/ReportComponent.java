package com.bilibili.pegasus.components.customreporter;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.performance.BootKeyEventRecoder;
import com.bilibili.pegasus.Action;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.IPegasusViewModel;
import com.bilibili.pegasus.PegasusHeaderManager;
import com.bilibili.pegasus.data.request.RefreshCompleteAction;
import com.bilibili.pegasus.vm.C5770e;
import com.bilibili.pegasus.vm.PegasusViewModel;
import com.bilibili.studio.comm.report.editor.bean.EditorAction;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import lp0.C7878a;
import lp0.C7879b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/customreporter/ReportComponent.class */
@StabilityInferred(parameters = 0)
public final class ReportComponent extends BasePegasusComponent {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f75913k = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PegasusViewModel.class), new a(this), new b(this), new c(this));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f75914l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final String f75915m;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/customreporter/ReportComponent$a.class */
    public static final class a implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ReportComponent f75916a;

        public a(ReportComponent reportComponent) {
            this.f75916a = reportComponent;
        }

        public final Object invoke() {
            return this.f75916a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/customreporter/ReportComponent$b.class */
    public static final class b implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ReportComponent f75917a;

        public b(ReportComponent reportComponent) {
            this.f75917a = reportComponent;
        }

        public final Object invoke() {
            return this.f75917a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/customreporter/ReportComponent$c.class */
    public static final class c implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ReportComponent f75918a;

        public c(ReportComponent reportComponent) {
            this.f75918a = reportComponent;
        }

        public final Object invoke() {
            return this.f75918a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.customreporter.ReportComponent$onCreate$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/customreporter/ReportComponent$onCreate$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ReportComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.customreporter.ReportComponent$onCreate$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/customreporter/ReportComponent$onCreate$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ReportComponent f75919a;

            public a(ReportComponent reportComponent) {
                this.f75919a = reportComponent;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.lang.Runnable] */
            public final Object emit(Object obj, Continuation continuation) {
                Action action = (Action) obj;
                if (action instanceof C7879b) {
                    long[] jArr = f.f75941a;
                    Lazy lazy = l.f75948a;
                    jArr[1] = SystemClock.uptimeMillis();
                } else if (action instanceof C5770e) {
                    i.f75945a = false;
                } else {
                    boolean z6 = action instanceof C7878a;
                    ReportComponent reportComponent = this.f75919a;
                    if (z6) {
                        RecyclerView recyclerView = reportComponent.getRecyclerView();
                        if (recyclerView != null) {
                            OneShotPreDrawListener.add(recyclerView, new Object());
                        }
                    } else if (action instanceof RefreshCompleteAction) {
                        i.f75945a = false;
                        f.f75942b = reportComponent.isPageVisible();
                        long[] jArr2 = f.f75941a;
                        Lazy lazy2 = l.f75948a;
                        jArr2[8] = SystemClock.uptimeMillis();
                        RecyclerView recyclerView2 = reportComponent.getRecyclerView();
                        if (recyclerView2 != null) {
                            OneShotPreDrawListener.add(recyclerView2, new h(recyclerView2, reportComponent));
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ReportComponent reportComponent, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = reportComponent;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<Action> sharedFlow = ((PegasusViewModel) this.this$0.f75913k.getValue()).f79014f;
                a aVar = new a(this.this$0);
                this.label = 1;
                Object objCollect = sharedFlow.collect(new ReportComponent$onCreate$1$invokeSuspend$$inlined$filter$1$2(aVar), this);
                if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollect = Unit.INSTANCE;
                }
                if (objCollect == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public ReportComponent() {
        Duration.Companion companion = Duration.Companion;
        this.f75914l = DurationKt.toDuration(-1, DurationUnit.MILLISECONDS);
        this.f75915m = "CustomReporterPlugin";
    }

    @NotNull
    public final String getComponentName() {
        return this.f75915m;
    }

    public final void onAttach(@NotNull Context context, @NotNull Fragment fragment, @NotNull IPegasusViewModel iPegasusViewModel) {
        super.onAttach(context, fragment, iPegasusViewModel);
        Duration.Companion companion = Duration.Companion;
        this.f75914l = DurationKt.toDuration(System.currentTimeMillis(), DurationUnit.MILLISECONDS);
        j.a(EventType.PAGE, MapsKt.mapOf(TuplesKt.to("event_type", "attach")));
        BootKeyEventRecoder.INSTANCE.reportTmFrameworkRenderStart();
        if (i.f75945a) {
            long[] jArr = f.f75941a;
            Lazy lazy = l.f75948a;
            jArr[0] = SystemClock.uptimeMillis();
        }
    }

    public final void onConfigurationChanged(@NotNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        j.a(EventType.PAGE, MapsKt.mapOf(TuplesKt.to("event_type", "config_change")));
    }

    public final void onCreate(@Nullable Bundle bundle) {
        LifecycleCoroutineScope lifecycleScope;
        super.onCreate(bundle);
        j.a(EventType.PAGE, MapsKt.mapOf(TuplesKt.to("event_type", "create")));
        Fragment fragment = getFragment();
        if (fragment == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragment)) == null) {
            return;
        }
        BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    public final void onDestroy() {
        super.onDestroy();
        j.a(EventType.PAGE, MapsKt.mapOf(TuplesKt.to("event_type", "destroy")));
    }

    public final void onDestroyView() {
        super.onDestroyView();
        j.a(EventType.PAGE, MapsKt.mapOf(TuplesKt.to("event_type", "destroy_view")));
    }

    public final void onDetach() {
        super.onDetach();
        j.a(EventType.PAGE, MapsKt.mapOf(TuplesKt.to("event_type", "detach")));
    }

    public final void onPageReselect(boolean z6, @Nullable Bundle bundle) {
        super.onPageReselect(z6, bundle);
        j.a(EventType.PAGE, MapsKt.mapOf(TuplesKt.to("event_type", "reselect")));
    }

    public final void onPause() {
        super.onPause();
        j.a(EventType.PAGE, MapsKt.mapOf(TuplesKt.to("event_type", "pause")));
    }

    public final void onResume() {
        super.onResume();
        j.a(EventType.PAGE, MapsKt.mapOf(TuplesKt.to("event_type", "resume")));
    }

    public final void onStart() {
        super.onStart();
        j.a(EventType.PAGE, MapsKt.mapOf(TuplesKt.to("event_type", "start")));
    }

    public final void onStop() {
        super.onStop();
        j.a(EventType.PAGE, MapsKt.mapOf(TuplesKt.to("event_type", EditorAction.ACTION_STOP)));
    }

    public final void onViewCreated(@NotNull View view, @NotNull RecyclerView recyclerView, @NotNull PegasusHeaderManager pegasusHeaderManager) {
        super.onViewCreated(view, recyclerView, pegasusHeaderManager);
        j.a(EventType.PAGE, MapsKt.mapOf(TuplesKt.to("event_type", "view_created")));
        BootKeyEventRecoder bootKeyEventRecoder = BootKeyEventRecoder.INSTANCE;
        Duration.Companion companion = Duration.Companion;
        bootKeyEventRecoder.reportTmFrameworkRenderEnd-LRDsOJo(Duration.minus-LRDsOJo(DurationKt.toDuration(System.currentTimeMillis(), DurationUnit.MILLISECONDS), this.f75914l));
        if (i.f75945a) {
            long[] jArr = f.f75941a;
            Lazy lazy = l.f75948a;
            jArr[2] = SystemClock.uptimeMillis();
        }
    }

    public final void onVisibleStateChangedSimplified(boolean z6) {
        super.onVisibleStateChangedSimplified(z6);
        j.a(EventType.PAGE, MapsKt.mapOf(TuplesKt.to("event_type", "visible_state_" + z6)));
    }
}
