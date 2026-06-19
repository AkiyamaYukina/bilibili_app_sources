package com.bilibili.ship.theseus.cheese.player.archiveinfo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.danmaku.DanmakuCompoundRepository;
import com.bilibili.ship.theseus.united.page.view.RelationRepository;
import com.bilibili.ship.theseus.united.page.view.StatData;
import eu0.C6980C;
import eu0.C6985d;
import hu0.C7504b;
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
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.remote.IRemoteHandler;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/archiveinfo/CheeseArchiveUpdateService.class */
@StabilityInferred(parameters = 0)
public final class CheeseArchiveUpdateService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f90548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f90549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.cheese.player.playviewextra.a f90550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final RelationRepository f90551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final DanmakuCompoundRepository.a f90552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final IInteractLayerService f90553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final C6985d f90554g;

    @NotNull
    public final C6980C h;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.archiveinfo.CheeseArchiveUpdateService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/archiveinfo/CheeseArchiveUpdateService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseArchiveUpdateService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.archiveinfo.CheeseArchiveUpdateService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/archiveinfo/CheeseArchiveUpdateService$1$1.class */
        public static final class C06581 extends SuspendLambda implements Function2<C7504b, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final CheeseArchiveUpdateService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06581(CheeseArchiveUpdateService cheeseArchiveUpdateService, Continuation<? super C06581> continuation) {
                super(2, continuation);
                this.this$0 = cheeseArchiveUpdateService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06581 c06581 = new C06581(this.this$0, continuation);
                c06581.L$0 = obj;
                return c06581;
            }

            public final Object invoke(C7504b c7504b, Continuation<? super Unit> continuation) {
                return create(c7504b, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (((C7504b) this.L$0) != null) {
                    CheeseArchiveUpdateService cheeseArchiveUpdateService = this.this$0;
                    long jA = cheeseArchiveUpdateService.f90549b.a();
                    C6985d c6985d = cheeseArchiveUpdateService.f90554g;
                    long j7 = c6985d.f117510e;
                    com.bilibili.ship.theseus.united.page.view.a aVar = cheeseArchiveUpdateService.f90549b;
                    if (jA != j7) {
                        aVar.f104037b.setValue(Long.valueOf(j7));
                    }
                    aVar.f104041f.setValue(Long.valueOf(c6985d.f117511f));
                    IRemoteHandler remoteHandler = cheeseArchiveUpdateService.f90553f.getRemoteHandler();
                    if (remoteHandler != null) {
                        DanmakuCompoundRepository.a aVar2 = cheeseArchiveUpdateService.f90552e;
                        remoteHandler.setDanmakuExposureParam(aVar2.f99388a, aVar.a(), aVar.c(), aVar2.f99389b);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheeseArchiveUpdateService cheeseArchiveUpdateService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cheeseArchiveUpdateService;
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
                CheeseArchiveUpdateService cheeseArchiveUpdateService = this.this$0;
                StateFlow<C7504b> stateFlow = cheeseArchiveUpdateService.f90550c.f90751a;
                C06581 c06581 = new C06581(cheeseArchiveUpdateService, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c06581, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.archiveinfo.CheeseArchiveUpdateService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/archiveinfo/CheeseArchiveUpdateService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseArchiveUpdateService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CheeseArchiveUpdateService cheeseArchiveUpdateService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = cheeseArchiveUpdateService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                CheeseArchiveUpdateService cheeseArchiveUpdateService = this.this$0;
                long j7 = cheeseArchiveUpdateService.f90554g.f117510e;
                this.label = 1;
                if (CheeseArchiveUpdateService.a(cheeseArchiveUpdateService, j7, this) == coroutine_suspended) {
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
    public CheeseArchiveUpdateService(@NotNull CoroutineScope coroutineScope, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull com.bilibili.ship.theseus.cheese.player.playviewextra.a aVar2, @NotNull RelationRepository relationRepository, @NotNull DanmakuCompoundRepository.a aVar3, @NotNull IInteractLayerService iInteractLayerService, @NotNull C6985d c6985d, @NotNull C6980C c6980c) {
        this.f90548a = coroutineScope;
        this.f90549b = aVar;
        this.f90550c = aVar2;
        this.f90551d = relationRepository;
        this.f90552e = aVar3;
        this.f90553f = iInteractLayerService;
        this.f90554g = c6985d;
        this.h = c6980c;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.cheese.player.archiveinfo.CheeseArchiveUpdateService r7, long r8, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.player.archiveinfo.CheeseArchiveUpdateService.a(com.bilibili.ship.theseus.cheese.player.archiveinfo.CheeseArchiveUpdateService, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final StatData b(StatData statData) {
        StatData statDataA;
        RelationRepository relationRepository = this.f90551d;
        StatData statData2 = (StatData) relationRepository.f104004m.getValue();
        long j7 = statData2 != null ? statData2.f104021c : 0L;
        StatData statData3 = (StatData) relationRepository.f104004m.getValue();
        long j8 = statData3 != null ? statData3.f104024f : 0L;
        if (j7 > 0 || j8 > 0) {
            statDataA = StatData.a(statData, 0L, j7, 0L, 0L, j8, 219);
        } else {
            C6980C c6980c = this.h;
            statDataA = StatData.a(statData, 0L, c6980c.f117498a, 0L, 0L, c6980c.f117499b, 219);
        }
        return statDataA;
    }
}
