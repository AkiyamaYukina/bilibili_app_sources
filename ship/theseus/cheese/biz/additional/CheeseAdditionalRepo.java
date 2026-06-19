package com.bilibili.ship.theseus.cheese.biz.additional;

import androidx.compose.runtime.internal.StabilityInferred;
import au0.C4911a;
import com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.y;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/additional/CheeseAdditionalRepo.class */
@StabilityInferred(parameters = 0)
public final class CheeseAdditionalRepo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f88994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C4911a f88995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final y f88996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f88997d = LazyKt.lazy((Function0) new Object());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<CheeseAdditionalInfo> f88998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final StateFlow<CheeseAdditionalInfo> f88999f;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.additional.CheeseAdditionalRepo$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/additional/CheeseAdditionalRepo$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseAdditionalRepo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheeseAdditionalRepo cheeseAdditionalRepo, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cheeseAdditionalRepo;
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
                CheeseAdditionalRepo cheeseAdditionalRepo = this.this$0;
                this.label = 1;
                if (cheeseAdditionalRepo.a(this) == coroutine_suspended) {
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

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
    @Inject
    public CheeseAdditionalRepo(@NotNull CoroutineScope coroutineScope, @NotNull C4911a c4911a, @NotNull y yVar) {
        this.f88994a = coroutineScope;
        this.f88995b = c4911a;
        this.f88996c = yVar;
        MutableStateFlow<CheeseAdditionalInfo> MutableStateFlow = StateFlowKt.MutableStateFlow((Object) null);
        this.f88998e = MutableStateFlow;
        this.f88999f = FlowKt.asStateFlow(MutableStateFlow);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    @Nullable
    public final Object a(@NotNull SuspendLambda suspendLambda) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new CheeseAdditionalRepo$refreshAdditionalInfo$2(this, null), suspendLambda);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }
}
