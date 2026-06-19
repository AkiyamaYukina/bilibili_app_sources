package com.bilibili.pegasus.components.videomode;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.PegasusHeaderManager;
import com.bilibili.pegasus.vm.PegasusViewModel;
import dp0.C6828a;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/videomode/VideoModeGuidanceComponent.class */
@StabilityInferred(parameters = 0)
public final class VideoModeGuidanceComponent extends BasePegasusComponent {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f77179k = "PegasusVideoModeGuidancePlugin";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f77180l = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PegasusViewModel.class), new a(this), new b(this), new c(this));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/videomode/VideoModeGuidanceComponent$a.class */
    public static final class a implements Function0<ViewModelStore> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final VideoModeGuidanceComponent f77181a;

        public a(VideoModeGuidanceComponent videoModeGuidanceComponent) {
            this.f77181a = videoModeGuidanceComponent;
        }

        public final Object invoke() {
            return this.f77181a.getRequireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/videomode/VideoModeGuidanceComponent$b.class */
    public static final class b implements Function0<ViewModelProvider.Factory> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final VideoModeGuidanceComponent f77182a;

        public b(VideoModeGuidanceComponent videoModeGuidanceComponent) {
            this.f77182a = videoModeGuidanceComponent;
        }

        public final Object invoke() {
            return this.f77182a.getRequireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/videomode/VideoModeGuidanceComponent$c.class */
    public static final class c implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final VideoModeGuidanceComponent f77183a;

        public c(VideoModeGuidanceComponent videoModeGuidanceComponent) {
            this.f77183a = videoModeGuidanceComponent;
        }

        public final Object invoke() {
            return this.f77183a.getRequireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.videomode.VideoModeGuidanceComponent$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/videomode/VideoModeGuidanceComponent$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final VideoModeGuidanceComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.videomode.VideoModeGuidanceComponent$onViewCreated$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/videomode/VideoModeGuidanceComponent$onViewCreated$1$1.class */
        public static final class C05031 extends SuspendLambda implements Function2<C6828a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final VideoModeGuidanceComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05031(VideoModeGuidanceComponent videoModeGuidanceComponent, Continuation<? super C05031> continuation) {
                super(2, continuation);
                this.this$0 = videoModeGuidanceComponent;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C05031 c05031 = new C05031(this.this$0, continuation);
                c05031.L$0 = obj;
                return c05031;
            }

            public final Object invoke(C6828a c6828a, Continuation<? super Unit> continuation) {
                return create(c6828a, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x00a4  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x00eb  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    Method dump skipped, instruction units count: 290
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.videomode.VideoModeGuidanceComponent.AnonymousClass1.C05031.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(VideoModeGuidanceComponent videoModeGuidanceComponent, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = videoModeGuidanceComponent;
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
                Flow flowFilterNotNull = FlowKt.filterNotNull(((PegasusViewModel) this.this$0.f77180l.getValue()).f79027t);
                C05031 c05031 = new C05031(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowFilterNotNull, c05031, this) == coroutine_suspended) {
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

    @NotNull
    public final String getComponentName() {
        return this.f77179k;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        if (EntryPointKt.getMemleakOptEnable()) {
            f fVar = g.f77220a;
            if (fVar != null) {
                fVar.f77209a.removeVisibleStateChangeListener(fVar.f77216i);
                fVar.b();
                g.f77220a = null;
            }
            g.f77220a = null;
        }
    }

    public final void onViewCreated(@NotNull View view, @NotNull RecyclerView recyclerView, @NotNull PegasusHeaderManager pegasusHeaderManager) {
        super.onViewCreated(view, recyclerView, pegasusHeaderManager);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getRequireViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
