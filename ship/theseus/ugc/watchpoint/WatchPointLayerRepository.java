package com.bilibili.ship.theseus.ugc.watchpoint;

import US0.I;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import iq0.C7611b;
import java.util.List;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
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
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.interact.biz.model.ChronosThumbnailInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/watchpoint/WatchPointLayerRepository.class */
@StabilityInferred(parameters = 0)
public final class WatchPointLayerRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f98572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<List<ChronosThumbnailInfo.WatchPoint>> f98573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SharedFlow<List<ChronosThumbnailInfo.WatchPoint>> f98574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f98575d;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.watchpoint.WatchPointLayerRepository$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/watchpoint/WatchPointLayerRepository$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final ComponentActivity $activity;
        int label;
        final WatchPointLayerRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ComponentActivity componentActivity, WatchPointLayerRepository watchPointLayerRepository, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$activity = componentActivity;
            this.this$0 = watchPointLayerRepository;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$activity, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            MutableLiveData mutableLiveDataI0;
            MutableLiveData mutableLiveDataI02;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    ComponentActivity componentActivity = this.$activity;
                    Observer observer = (Observer) this.this$0.f98575d.getValue();
                    if (componentActivity instanceof FragmentActivity) {
                        C7611b c7611b = componentActivity instanceof FragmentActivity ? (C7611b) new ViewModelProvider(componentActivity).get(C7611b.class) : null;
                        if (c7611b != null && (mutableLiveDataI02 = C7611b.I0(c7611b, "show_watchpoint")) != null) {
                            mutableLiveDataI02.observe(componentActivity, observer);
                        }
                    }
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th) {
                ComponentActivity componentActivity2 = this.$activity;
                Observer observer2 = (Observer) this.this$0.f98575d.getValue();
                if (observer2 != null && (componentActivity2 instanceof FragmentActivity)) {
                    C7611b c7611b2 = null;
                    if (componentActivity2 instanceof FragmentActivity) {
                        c7611b2 = (C7611b) new ViewModelProvider(componentActivity2).get(C7611b.class);
                    }
                    if (c7611b2 != null && (mutableLiveDataI0 = C7611b.I0(c7611b2, "show_watchpoint")) != null) {
                        mutableLiveDataI0.removeObserver(observer2);
                    }
                }
                throw th;
            }
        }
    }

    @Inject
    public WatchPointLayerRepository(@NotNull CoroutineScope coroutineScope, @NotNull ComponentActivity componentActivity) {
        this.f98572a = coroutineScope;
        MutableSharedFlow<List<ChronosThumbnailInfo.WatchPoint>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_OLDEST, 1, (Object) null);
        this.f98573b = mutableSharedFlowMutableSharedFlow$default;
        this.f98574c = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.f98575d = LazyKt.lazy(new I(this, 2));
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(componentActivity, this, null), 3, (Object) null);
    }
}
