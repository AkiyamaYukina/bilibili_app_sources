package com.bilibili.pegasus.components.windowpane;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.comm.list.common.feed.PegasusStyle;
import com.bilibili.app.comm.list.common.feed.PegasusStyleEnum;
import com.bilibili.app.comm.list.common.feed.PegasusStyleKt;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.PegasusDDConfigKt;
import com.bilibili.pegasus.PegasusHeaderManager;
import com.bilibili.pegasus.PegasusHolder;
import com.bilibili.pegasus.data.request.PegasusFlush;
import com.bilibili.pegasus.vm.C5767b;
import com.bilibili.pegasus.vm.PegasusViewModel;
import com.bilibili.pegasus.vm.o;
import com.bilibili.pegasus.widget.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/windowpane/WindowPaneStyleComponent.class */
@StabilityInferred(parameters = 0)
public final class WindowPaneStyleComponent extends BasePegasusComponent {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f77225k = "WindowPaneStyleComponent";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f77226l = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PegasusViewModel.class), new a(this), new b(this), new c(this));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public WindowSizeClass f77227m;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/windowpane/WindowPaneStyleComponent$a.class */
    public static final class a implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WindowPaneStyleComponent f77228a;

        public a(WindowPaneStyleComponent windowPaneStyleComponent) {
            this.f77228a = windowPaneStyleComponent;
        }

        public final Object invoke() {
            return this.f77228a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/windowpane/WindowPaneStyleComponent$b.class */
    public static final class b implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WindowPaneStyleComponent f77229a;

        public b(WindowPaneStyleComponent windowPaneStyleComponent) {
            this.f77229a = windowPaneStyleComponent;
        }

        public final Object invoke() {
            return this.f77229a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/windowpane/WindowPaneStyleComponent$c.class */
    public static final class c implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WindowPaneStyleComponent f77230a;

        public c(WindowPaneStyleComponent windowPaneStyleComponent) {
            this.f77230a = windowPaneStyleComponent;
        }

        public final Object invoke() {
            return this.f77230a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.windowpane.WindowPaneStyleComponent$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/windowpane/WindowPaneStyleComponent$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final WindowPaneStyleComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.windowpane.WindowPaneStyleComponent$onViewCreated$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/windowpane/WindowPaneStyleComponent$onViewCreated$1$1.class */
        public static final class C05041 extends SuspendLambda implements Function2<WindowSizeClass, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final WindowPaneStyleComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05041(WindowPaneStyleComponent windowPaneStyleComponent, Continuation<? super C05041> continuation) {
                super(2, continuation);
                this.this$0 = windowPaneStyleComponent;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C05041 c05041 = new C05041(this.this$0, continuation);
                c05041.L$0 = obj;
                return c05041;
            }

            public final Object invoke(WindowSizeClass windowSizeClass, Continuation<? super Unit> continuation) {
                return create(windowSizeClass, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                WindowSizeClass windowSizeClass = (WindowSizeClass) this.L$0;
                WindowPaneStyleComponent windowPaneStyleComponent = this.this$0;
                windowPaneStyleComponent.b(windowPaneStyleComponent.f77227m, windowSizeClass);
                this.this$0.f77227m = windowSizeClass;
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WindowPaneStyleComponent windowPaneStyleComponent, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = windowPaneStyleComponent;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Flow flowWindowSizeFlow;
            Flow flowDistinctUntilChanged;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                FragmentActivity activity = this.this$0.getActivity();
                if (activity != null && (flowWindowSizeFlow = ScreenAdjustUtilsKt.windowSizeFlow(activity)) != null && (flowDistinctUntilChanged = FlowKt.distinctUntilChanged(flowWindowSizeFlow)) != null) {
                    C05041 c05041 = new C05041(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, c05041, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    public final void b(WindowSizeClass windowSizeClass, WindowSizeClass windowSizeClass2) {
        RecyclerView recyclerView;
        if (windowSizeClass2 != null) {
            PegasusStyle pegasusStyle = PegasusStyle.INSTANCE;
            if (PegasusStyleKt.currentIsSingleColumn(pegasusStyle) && !PegasusDDConfigKt.isWidthNormal(windowSizeClass2)) {
                pegasusStyle.setStyle(PegasusStyleEnum.DOUBLE_COLUMN, false);
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    new PegasusStyleDialogFragment().show(activity.getSupportFragmentManager(), "PegasusStyleDialogFragment");
                }
            }
        }
        if (windowSizeClass != null && windowSizeClass2 != null && PegasusDDConfigKt.getWindowSizeType(windowSizeClass) != PegasusDDConfigKt.getWindowSizeType(windowSizeClass2)) {
            ViewModelLazy viewModelLazy = this.f77226l;
            PegasusViewModel pegasusViewModel = (PegasusViewModel) viewModelLazy.getValue();
            pegasusViewModel.getClass();
            pegasusViewModel.z(pegasusViewModel, new C5767b(0));
            PegasusViewModel.K0((PegasusViewModel) viewModelLazy.getValue(), true, PegasusFlush.NORMAL, null, null, null, null, PegasusDDConfigKt.getWindowSizeType(windowSizeClass2), KScreenAdjustUtilsKt.getRawWindowSizeType(windowSizeClass2), null, 1852);
        }
        if (windowSizeClass2 == null || (recyclerView = getRecyclerView()) == null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            int recyclerSpanCount = PegasusDDConfigKt.getRecyclerSpanCount(windowSizeClass2);
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            if (gridLayoutManager.getSpanCount() != recyclerSpanCount) {
                gridLayoutManager.setSpanCount(recyclerSpanCount);
                gridLayoutManager.setSpanSizeLookup(new f(this, recyclerSpanCount));
            }
        }
        recyclerView.setPadding(g.a(windowSizeClass2), PegasusDDConfigKt.isWidthLarge(windowSizeClass2) ? DimenUtilsKt.dpToPx(20) : PegasusDDConfigKt.isWidthMedium(windowSizeClass2) ? DimenUtilsKt.dpToPx(12) : DimenUtilsKt.dpToPx(5), g.a(windowSizeClass2), getRequireFragment().getResources().getDimensionPixelOffset(2131165959));
        List itemDecorations = ListExtentionsKt.getItemDecorations(recyclerView);
        ArrayList arrayList = new ArrayList();
        for (Object obj : itemDecorations) {
            if (obj instanceof j) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((j) it.next()).f79155b = windowSizeClass2;
        }
        recyclerView.invalidateItemDecorations();
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        o oVar = adapter instanceof o ? (o) adapter : null;
        if (oVar != null) {
            oVar.h = windowSizeClass2;
            Iterator it2 = ((ArrayList) oVar.f79077f).iterator();
            while (it2.hasNext()) {
                ((PegasusHolder) it2.next()).onWindowSizeChanged(windowSizeClass2);
            }
            oVar.notifyDataSetChanged();
        }
        recyclerView.requestLayout();
    }

    @NotNull
    public final String getComponentName() {
        return this.f77225k;
    }

    public final void onViewCreated(@NotNull View view, @NotNull RecyclerView recyclerView, @NotNull PegasusHeaderManager pegasusHeaderManager) {
        super.onViewCreated(view, recyclerView, pegasusHeaderManager);
        FragmentActivity activity = getActivity();
        WindowSizeClass windowSizeClassWindowSize = activity != null ? ScreenAdjustUtilsKt.windowSize(activity) : null;
        this.f77227m = windowSizeClassWindowSize;
        b(windowSizeClassWindowSize, windowSizeClassWindowSize);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getRequireViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
