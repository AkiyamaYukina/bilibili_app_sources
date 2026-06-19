package com.bilibili.pegasus.components;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.pegasus.Action;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.IPegasusViewModel;
import com.bilibili.pegasus.InvalidDataException;
import com.bilibili.pegasus.PegasusHeaderManager;
import com.bilibili.pegasus.PegasusHolderData;
import com.bilibili.pegasus.data.request.LoadMoreCompleteAction;
import com.bilibili.pegasus.data.request.PegasusResponseWrapper;
import com.bilibili.pegasus.data.request.RefreshCompleteAction;
import java.util.Iterator;
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
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/DataCheckComponent.class */
@StabilityInferred(parameters = 0)
public final class DataCheckComponent extends BasePegasusComponent {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f75729k = "data_check_component";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f75730l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f75731m;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.DataCheckComponent$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/DataCheckComponent$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final DataCheckComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.DataCheckComponent$onViewCreated$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/DataCheckComponent$onViewCreated$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final DataCheckComponent f75732a;

            public a(DataCheckComponent dataCheckComponent) {
                this.f75732a = dataCheckComponent;
            }

            public final Object emit(Object obj, Continuation continuation) {
                List<PegasusHolderData> items;
                Action action = (Action) obj;
                PegasusResponseWrapper response = action instanceof LoadMoreCompleteAction ? ((LoadMoreCompleteAction) action).getResponse() : action instanceof RefreshCompleteAction ? ((RefreshCompleteAction) action).getResponse() : null;
                if (response != null && (items = response.getItems()) != null) {
                    Iterator<T> it = items.iterator();
                    while (it.hasNext()) {
                        try {
                            ((PegasusHolderData) it.next()).selfCheck();
                        } catch (InvalidDataException e7) {
                            DataCheckComponent dataCheckComponent = this.f75732a;
                            if (dataCheckComponent.f75730l) {
                                BLog.w(dataCheckComponent.f75729k, e7);
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DataCheckComponent dataCheckComponent, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = dataCheckComponent;
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

    public DataCheckComponent() {
        ConfigManager.Companion companion = ConfigManager.Companion;
        this.f75730l = companion.isHitFF("ff_key_log_when_no_desc");
        this.f75731m = companion.isHitFF("ff_key_pegasus_data_check");
    }

    @NotNull
    public final String getComponentName() {
        return this.f75729k;
    }

    public final void onViewCreated(@NotNull View view, @NotNull RecyclerView recyclerView, @NotNull PegasusHeaderManager pegasusHeaderManager) {
        super.onViewCreated(view, recyclerView, pegasusHeaderManager);
        if (this.f75731m) {
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getRequireViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        }
    }
}
