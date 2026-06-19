package com.bilibili.pegasus.components;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.comm.list.common.feed.PegasusStyle;
import com.bilibili.app.comm.list.common.feed.PegasusStyleEnum;
import com.bilibili.app.comm.list.common.feed.PegasusStyleKt;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.PegasusDDConfigKt;
import com.bilibili.pegasus.PegasusHeaderManager;
import com.bilibili.pegasus.data.request.PegasusFlush;
import com.bilibili.pegasus.vm.PegasusViewModel;
import dp0.C6828a;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/PegasusStyleComponent.class */
@StabilityInferred(parameters = 0)
public final class PegasusStyleComponent extends BasePegasusComponent implements Lh.o {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f75851k = "pegasus_style_plugin";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f75852l = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PegasusViewModel.class), new a(this), new b(this), new c(this));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/PegasusStyleComponent$a.class */
    public static final class a implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PegasusStyleComponent f75853a;

        public a(PegasusStyleComponent pegasusStyleComponent) {
            this.f75853a = pegasusStyleComponent;
        }

        public final Object invoke() {
            return this.f75853a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/PegasusStyleComponent$b.class */
    public static final class b implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PegasusStyleComponent f75854a;

        public b(PegasusStyleComponent pegasusStyleComponent) {
            this.f75854a = pegasusStyleComponent;
        }

        public final Object invoke() {
            return this.f75854a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/PegasusStyleComponent$c.class */
    public static final class c implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PegasusStyleComponent f75855a;

        public c(PegasusStyleComponent pegasusStyleComponent) {
            this.f75855a = pegasusStyleComponent;
        }

        public final Object invoke() {
            return this.f75855a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.PegasusStyleComponent$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/PegasusStyleComponent$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PegasusStyleComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.PegasusStyleComponent$onViewCreated$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/PegasusStyleComponent$onViewCreated$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            int I$0;
            int label;
            final PegasusStyleComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(PegasusStyleComponent pegasusStyleComponent, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = pegasusStyleComponent;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.I$0 = ((Number) obj).intValue();
                return anonymousClass2;
            }

            public final Object invoke(int i7, Continuation<? super Unit> continuation) {
                return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i7 = this.I$0;
                PegasusStyleComponent pegasusStyleComponent = this.this$0;
                pegasusStyleComponent.getClass();
                PegasusStyleEnum pegasusStyleEnum = (PegasusStyleEnum) CollectionsKt.getOrNull(PegasusStyleEnum.getEntries(), i7);
                if (pegasusStyleEnum != null) {
                    FragmentActivity activity = pegasusStyleComponent.getActivity();
                    WindowSizeClass windowSizeClassWindowSize = activity != null ? ScreenAdjustUtilsKt.windowSize(activity) : null;
                    if (!pegasusStyleEnum.isSingleColumn() || windowSizeClassWindowSize == null || PegasusDDConfigKt.isWidthNormal(windowSizeClassWindowSize)) {
                        PegasusStyle.INSTANCE.setStyle(pegasusStyleEnum, false);
                        pegasusStyleComponent.b();
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PegasusStyleComponent pegasusStyleComponent, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = pegasusStyleComponent;
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
                final StateFlow<C6828a> stateFlow = ((PegasusViewModel) this.this$0.f75852l.getValue()).f79027t;
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Integer>(stateFlow) { // from class: com.bilibili.pegasus.components.PegasusStyleComponent$onViewCreated$1$invokeSuspend$$inlined$mapNotNull$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final StateFlow f75856a;

                    /* JADX INFO: renamed from: com.bilibili.pegasus.components.PegasusStyleComponent$onViewCreated$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/PegasusStyleComponent$onViewCreated$1$invokeSuspend$$inlined$mapNotNull$1$2.class */
                    public static final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final FlowCollector f75857a;

                        /* JADX INFO: renamed from: com.bilibili.pegasus.components.PegasusStyleComponent$onViewCreated$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/PegasusStyleComponent$onViewCreated$1$invokeSuspend$$inlined$mapNotNull$1$2$1.class */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            Object result;
                            final AnonymousClass2 this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(AnonymousClass2 anonymousClass2, Continuation continuation) {
                                super(continuation);
                                this.this$0 = anonymousClass2;
                            }

                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return this.this$0.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.f75857a = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                            /*
                                r5 = this;
                                r0 = r7
                                boolean r0 = r0 instanceof com.bilibili.pegasus.components.PegasusStyleComponent$onViewCreated$1$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L29
                                r0 = r7
                                com.bilibili.pegasus.components.PegasusStyleComponent$onViewCreated$1$invokeSuspend$$inlined$mapNotNull$1$2$1 r0 = (com.bilibili.pegasus.components.PegasusStyleComponent$onViewCreated$1$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) r0
                                r9 = r0
                                r0 = r9
                                int r0 = r0.label
                                r8 = r0
                                r0 = r8
                                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                                r0 = r0 & r1
                                if (r0 == 0) goto L29
                                r0 = r9
                                r1 = r8
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                int r1 = r1 + r2
                                r0.label = r1
                                r0 = r9
                                r7 = r0
                                goto L33
                            L29:
                                com.bilibili.pegasus.components.PegasusStyleComponent$onViewCreated$1$invokeSuspend$$inlined$mapNotNull$1$2$1 r0 = new com.bilibili.pegasus.components.PegasusStyleComponent$onViewCreated$1$invokeSuspend$$inlined$mapNotNull$1$2$1
                                r1 = r0
                                r2 = r5
                                r3 = r7
                                r1.<init>(r2, r3)
                                r7 = r0
                            L33:
                                r0 = r7
                                java.lang.Object r0 = r0.result
                                r10 = r0
                                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                r9 = r0
                                r0 = r7
                                int r0 = r0.label
                                r8 = r0
                                r0 = r8
                                if (r0 == 0) goto L5e
                                r0 = r8
                                r1 = 1
                                if (r0 != r1) goto L54
                                r0 = r10
                                kotlin.ResultKt.throwOnFailure(r0)
                                goto L95
                            L54:
                                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                                r1 = r0
                                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                                r1.<init>(r2)
                                throw r0
                            L5e:
                                r0 = r10
                                kotlin.ResultKt.throwOnFailure(r0)
                                r0 = r6
                                dp0.a r0 = (dp0.C6828a) r0
                                r6 = r0
                                r0 = r6
                                if (r0 == 0) goto L77
                                r0 = r6
                                int r0 = r0.k()
                                java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)
                                r6 = r0
                                goto L79
                            L77:
                                r0 = 0
                                r6 = r0
                            L79:
                                r0 = r6
                                if (r0 == 0) goto L95
                                r0 = r7
                                r1 = 1
                                r0.label = r1
                                r0 = r5
                                kotlinx.coroutines.flow.FlowCollector r0 = r0.f75857a
                                r1 = r6
                                r2 = r7
                                java.lang.Object r0 = r0.emit(r1, r2)
                                r1 = r9
                                if (r0 != r1) goto L95
                                r0 = r9
                                return r0
                            L95:
                                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.PegasusStyleComponent$onViewCreated$1$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    {
                        this.f75856a = stateFlow;
                    }

                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = this.f75856a.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                });
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
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

    public final void a() {
        WindowSizeClass windowSizeClassWindowSize;
        WindowSizeClass windowSizeClassWindowSize2;
        PegasusViewModel pegasusViewModel = (PegasusViewModel) this.f75852l.getValue();
        PegasusFlush pegasusFlush = PegasusFlush.SWITCH_STYLE;
        FragmentActivity activity = getActivity();
        int windowSizeType = (activity == null || (windowSizeClassWindowSize2 = ScreenAdjustUtilsKt.windowSize(activity)) == null) ? 1 : PegasusDDConfigKt.getWindowSizeType(windowSizeClassWindowSize2);
        FragmentActivity activity2 = getActivity();
        PegasusViewModel.K0(pegasusViewModel, true, pegasusFlush, null, null, null, null, windowSizeType, (activity2 == null || (windowSizeClassWindowSize = ScreenAdjustUtilsKt.windowSize(activity2)) == null) ? 1 : KScreenAdjustUtilsKt.getRawWindowSizeType(windowSizeClassWindowSize), null, 1852);
        b();
    }

    public final void b() {
        int px;
        if (ListExtentionsKt.isViewAlive(getFragment())) {
            Resources resources = getRequireFragment().getResources();
            RecyclerView recyclerView = getRecyclerView();
            if (recyclerView == null) {
                return;
            }
            FragmentActivity activity = getActivity();
            boolean z6 = false;
            if (activity != null) {
                WindowSizeClass windowSizeClassWindowSize = ScreenAdjustUtilsKt.windowSize(activity);
                z6 = false;
                if (windowSizeClassWindowSize != null) {
                    z6 = false;
                    if (PegasusDDConfigKt.isWidthNormal(windowSizeClassWindowSize)) {
                        z6 = true;
                    }
                }
            }
            if (PegasusStyleKt.currentIsSingleColumn(PegasusStyle.INSTANCE)) {
                recyclerView.setBackgroundColor(ThemeUtils.getColorById(getContext(), R$color.f64616Wh0));
                px = recyclerView.getPaddingTop();
            } else {
                recyclerView.setBackgroundColor(ThemeUtils.getColorById(getContext(), R$color.Ga1));
                px = z6 ? ListExtentionsKt.toPx(4.0f) : recyclerView.getPaddingTop();
            }
            if (z6) {
                recyclerView.setPadding(recyclerView.getPaddingLeft(), px, recyclerView.getPaddingRight(), resources.getDimensionPixelOffset(2131165959));
            }
        }
    }

    @NotNull
    public final String getComponentName() {
        return this.f75851k;
    }

    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        PegasusStyle.INSTANCE.registerObserver(this);
    }

    public final void onDestroy() {
        super.onDestroy();
        PegasusStyle.INSTANCE.unRegisterObserver(this);
    }

    public final void onViewCreated(@NotNull View view, @NotNull RecyclerView recyclerView, @NotNull PegasusHeaderManager pegasusHeaderManager) {
        super.onViewCreated(view, recyclerView, pegasusHeaderManager);
        b();
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getRequireViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
