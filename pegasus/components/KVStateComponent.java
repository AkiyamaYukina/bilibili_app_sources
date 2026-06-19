package com.bilibili.pegasus.components;

import android.os.Bundle;
import android.os.SystemClock;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.pegasus.Action;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.IPegasusViewModel;
import com.bilibili.pegasus.data.request.RefreshCompleteAction;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/KVStateComponent.class */
@StabilityInferred(parameters = 0)
public final class KVStateComponent extends BasePegasusComponent {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f75817k = "kv_state_component";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f75818l;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.KVStateComponent$onCreate$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/KVStateComponent$onCreate$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final KVStateComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.KVStateComponent$onCreate$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/KVStateComponent$onCreate$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final KVStateComponent f75819a;

            public a(KVStateComponent kVStateComponent) {
                this.f75819a = kVStateComponent;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.lang.Runnable] */
            public final Object emit(Object obj, Continuation continuation) {
                if (((Action) obj) instanceof RefreshCompleteAction) {
                    KVStateComponent kVStateComponent = this.f75819a;
                    if (!kVStateComponent.f75818l) {
                        if (com.bilibili.pegasus.request.h.a()) {
                            List<String> list = Pp0.c.f19042a;
                            Pp0.d dVarA = Pp0.d.a();
                            dVarA.f19049d = SystemClock.elapsedRealtime() - Pp0.c.f19043b;
                            try {
                                if (!dVarA.h) {
                                    ArrayMap arrayMap = new ArrayMap();
                                    arrayMap.put("originAppCount", String.valueOf(dVarA.f19051f));
                                    arrayMap.put("reportedAppCount", String.valueOf(dVarA.f19052g));
                                    arrayMap.put("appListCostTime", String.valueOf(dVarA.f19048c));
                                    arrayMap.put("startTime", String.valueOf(dVarA.f19046a));
                                    arrayMap.put("updateTime", CaptureSchema.OLD_INVALID_ID_STRING);
                                    arrayMap.put("apiCostTime", String.valueOf(dVarA.f19049d));
                                    arrayMap.put("appListUploadTime", String.valueOf(dVarA.f19047b));
                                    arrayMap.put("error", String.valueOf(dVarA.f19050e));
                                    arrayMap.put("hasI", dVarA.f19053i ? "1" : "0");
                                    arrayMap.put("hasO", dVarA.f19054j ? "1" : "0");
                                    arrayMap.put("hasA", dVarA.f19055k ? "1" : "0");
                                    Neurons.report(true, 4, "growth.tianma.applist.sys", arrayMap);
                                    dVarA.h = true;
                                }
                            } catch (Exception e7) {
                            }
                            Pp0.d.f19045l = null;
                            Pp0.c.f19044c = null;
                            RecyclerView recyclerView = kVStateComponent.getRecyclerView();
                            if (recyclerView != null) {
                                OneShotPreDrawListener.add(recyclerView, new Object());
                            }
                        }
                        kVStateComponent.f75818l = true;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(KVStateComponent kVStateComponent, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = kVStateComponent;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Flow actionFlow;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                IPegasusViewModel viewModel = this.this$0.getViewModel();
                if (viewModel != null && (actionFlow = viewModel.getActionFlow()) != null) {
                    a aVar = new a(this.this$0);
                    this.label = 1;
                    if (actionFlow.collect(aVar, this) == coroutine_suspended) {
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

    @NotNull
    public final String getComponentName() {
        return this.f75817k;
    }

    public final void onCreate(@Nullable Bundle bundle) {
        LifecycleCoroutineScope lifecycleScope;
        super.onCreate(bundle);
        Fragment fragment = getFragment();
        if (fragment == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragment)) == null) {
            return;
        }
        BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
