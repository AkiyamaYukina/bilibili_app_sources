package com.bilibili.ship.theseus.ugc.listen;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository;
import com.bilibili.ship.theseus.united.page.activityresult.ActivityResultRepository;
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
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/listen/UgcListenResultService.class */
@StabilityInferred(parameters = 0)
public final class UgcListenResultService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ActivityResultRepository f97948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f97949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final UGCPlaybackRepository f97950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final h f97951d;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.listen.UgcListenResultService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/listen/UgcListenResultService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UgcListenResultService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.listen.UgcListenResultService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/listen/UgcListenResultService$1$1.class */
        public static final class C08981 extends SuspendLambda implements Function2<com.bilibili.ship.theseus.united.page.activityresult.a, Continuation<? super Unit>, Object> {
            int I$0;
            Object L$0;
            Object L$1;
            int label;
            final UgcListenResultService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08981(UgcListenResultService ugcListenResultService, Continuation<? super C08981> continuation) {
                super(2, continuation);
                this.this$0 = ugcListenResultService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C08981 c08981 = new C08981(this.this$0, continuation);
                c08981.L$0 = obj;
                return c08981;
            }

            public final Object invoke(com.bilibili.ship.theseus.united.page.activityresult.a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:42:0x013e  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x0211  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    Method dump skipped, instruction units count: 541
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.listen.UgcListenResultService.AnonymousClass1.C08981.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UgcListenResultService ugcListenResultService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ugcListenResultService;
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
                UgcListenResultService ugcListenResultService = this.this$0;
                SharedFlow<com.bilibili.ship.theseus.united.page.activityresult.a> sharedFlow = ugcListenResultService.f97948a.f98829c;
                C08981 c08981 = new C08981(ugcListenResultService, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, c08981, this) == coroutine_suspended) {
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

    @Inject
    public UgcListenResultService(@NotNull ActivityResultRepository activityResultRepository, @NotNull CoroutineScope coroutineScope, @NotNull UGCPlaybackRepository uGCPlaybackRepository, @NotNull h hVar) {
        this.f97948a = activityResultRepository;
        this.f97949b = coroutineScope;
        this.f97950c = uGCPlaybackRepository;
        this.f97951d = hVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
