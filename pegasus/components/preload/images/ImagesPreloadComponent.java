package com.bilibili.pegasus.components.preload.images;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.pegasus.Action;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.IPegasusViewModel;
import com.bilibili.pegasus.PegasusHeaderManager;
import com.bilibili.pegasus.PegasusHolderData;
import com.bilibili.pegasus.data.request.LoadMoreCompleteAction;
import com.bilibili.pegasus.data.request.RefreshCompleteAction;
import com.google.common.collect.ImmutableSet;
import fp0.u;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import lp0.C7878a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/preload/images/ImagesPreloadComponent.class */
@StabilityInferred(parameters = 0)
public final class ImagesPreloadComponent extends BasePegasusComponent {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f77113k = EntryPointKt.getBootOptEnable();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Map<Class<? extends PegasusHolderData>, a> f77114l;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.preload.images.ImagesPreloadComponent$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/preload/images/ImagesPreloadComponent$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private Object L$0;
        int label;
        final ImagesPreloadComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.components.preload.images.ImagesPreloadComponent$onViewCreated$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/preload/images/ImagesPreloadComponent$onViewCreated$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ImagesPreloadComponent f77115a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CoroutineScope f77116b;

            public a(ImagesPreloadComponent imagesPreloadComponent, CoroutineScope coroutineScope) {
                this.f77115a = imagesPreloadComponent;
                this.f77116b = coroutineScope;
            }

            public final Object emit(Object obj, Continuation continuation) {
                Action action = (Action) obj;
                boolean z6 = action instanceof RefreshCompleteAction;
                CoroutineScope coroutineScope = this.f77116b;
                ImagesPreloadComponent imagesPreloadComponent = this.f77115a;
                if (z6) {
                    ImagesPreloadComponent.b(imagesPreloadComponent, coroutineScope, ((RefreshCompleteAction) action).getResponse().getItems());
                } else if (action instanceof LoadMoreCompleteAction) {
                    ImagesPreloadComponent.b(imagesPreloadComponent, coroutineScope, ((LoadMoreCompleteAction) action).getResponse().getItems());
                } else if (action instanceof C7878a) {
                    ImagesPreloadComponent.b(imagesPreloadComponent, coroutineScope, ((C7878a) action).f123306a.getItems());
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ImagesPreloadComponent imagesPreloadComponent, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = imagesPreloadComponent;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
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
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                IPegasusViewModel viewModel = this.this$0.getViewModel();
                if (viewModel != null && (actionFlow = viewModel.getActionFlow()) != null) {
                    a aVar = new a(this.this$0, coroutineScope);
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

    public ImagesPreloadComponent(@NotNull ImmutableSet immutableSet) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(immutableSet, 10)), 16));
        for (Object obj : immutableSet) {
            ((a) obj).getClass();
            linkedHashMap.put(u.class, obj);
        }
        this.f77114l = linkedHashMap;
    }

    public static final void b(ImagesPreloadComponent imagesPreloadComponent, CoroutineScope coroutineScope, List list) {
        imagesPreloadComponent.getClass();
        if (list == null) {
            return;
        }
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new ImagesPreloadComponent$preload$1(list, imagesPreloadComponent, null), 3, (Object) null);
    }

    public final boolean getComponentEnable() {
        return this.f77113k;
    }

    @NotNull
    public final String getComponentName() {
        return "ImagesPreloadComponent";
    }

    public final void onViewCreated(@NotNull View view, @NotNull RecyclerView recyclerView, @NotNull PegasusHeaderManager pegasusHeaderManager) {
        LifecycleCoroutineScope lifecycleScope;
        super.onViewCreated(view, recyclerView, pegasusHeaderManager);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        if (viewLifecycleOwner == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner)) == null) {
            return;
        }
        BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
