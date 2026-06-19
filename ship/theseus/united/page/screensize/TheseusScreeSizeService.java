package com.bilibili.ship.theseus.united.page.screensize;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.playerbizcommonv2.utils.r;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
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
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screensize/TheseusScreeSizeService.class */
@StabilityInferred(parameters = 0)
public final class TheseusScreeSizeService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f102933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Er0.a f102934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final a f102935c;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.screensize.TheseusScreeSizeService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screensize/TheseusScreeSizeService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusScreeSizeService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.screensize.TheseusScreeSizeService$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screensize/TheseusScreeSizeService$1$a.class */
        public static final class a implements r {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final StateFlow<WindowSizeClass> f102936a;

            public a(TheseusScreeSizeService theseusScreeSizeService) {
                this.f102936a = theseusScreeSizeService.f102935c.f102939c;
            }

            @Override // com.bilibili.playerbizcommonv2.utils.r
            public final StateFlow<WindowSizeClass> getWindowSizeFlow() {
                return this.f102936a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TheseusScreeSizeService theseusScreeSizeService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = theseusScreeSizeService;
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
            r.a aVar = r.a.f81944a;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.f102934b.put(aVar, new a(this.this$0));
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
                this.this$0.f102934b.remove(aVar);
                throw th;
            }
        }
    }

    @Inject
    public TheseusScreeSizeService(@NotNull CoroutineScope coroutineScope, @NotNull Er0.a aVar, @NotNull a aVar2) {
        this.f102933a = coroutineScope;
        this.f102934b = aVar;
        this.f102935c = aVar2;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
