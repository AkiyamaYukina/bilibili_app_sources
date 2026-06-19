package com.bilibili.ship.theseus.cheese.player.toast;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.player.toast.TheseusToastContainerService;
import javax.inject.Inject;
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
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/toast/CheeseDetailToastPaddingService.class */
@StabilityInferred(parameters = 0)
public final class CheeseDetailToastPaddingService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f90752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TheseusToastContainerService f90753b;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.toast.CheeseDetailToastPaddingService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/toast/CheeseDetailToastPaddingService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private Object L$0;
        int label;
        final CheeseDetailToastPaddingService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.toast.CheeseDetailToastPaddingService$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/toast/CheeseDetailToastPaddingService$1$a.class */
        public static final class a implements TheseusToastContainerService.c {
            @Override // com.bilibili.ship.theseus.united.player.toast.TheseusToastContainerService.c
            public final TheseusToastContainerService.b a() {
                return new TheseusToastContainerService.b(0, 0, 0, NewPlayerUtilsKt.toPx(149.0f));
            }

            @Override // com.bilibili.ship.theseus.united.player.toast.TheseusToastContainerService.c
            public final TheseusToastContainerService.b b(boolean z6) {
                return new TheseusToastContainerService.b(0, 0, 0, NewPlayerUtilsKt.toPx(117.0f));
            }

            @Override // com.bilibili.ship.theseus.united.player.toast.TheseusToastContainerService.c
            public final TheseusToastContainerService.b c() {
                return new TheseusToastContainerService.b(0, 0, 0, NewPlayerUtilsKt.toPx(40.0f));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheeseDetailToastPaddingService cheeseDetailToastPaddingService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cheeseDetailToastPaddingService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [com.bilibili.ship.theseus.united.player.toast.TheseusToastContainerService$c, java.lang.Object] */
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            CheeseDetailToastPaddingService cheeseDetailToastPaddingService = this.this$0;
            cheeseDetailToastPaddingService.f90753b.f104803k = new Object();
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new CheeseDetailToastPaddingService$1$invokeSuspend$$inlined$awaitCancel$1(null, cheeseDetailToastPaddingService), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    @Inject
    public CheeseDetailToastPaddingService(@NotNull CoroutineScope coroutineScope, @NotNull TheseusToastContainerService theseusToastContainerService) {
        this.f90752a = coroutineScope;
        this.f90753b = theseusToastContainerService;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
