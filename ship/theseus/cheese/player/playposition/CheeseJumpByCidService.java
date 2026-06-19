package com.bilibili.ship.theseus.cheese.player.playposition;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.coroutineextension.j;
import com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository;
import eu0.C6985d;
import ev0.i;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/playposition/CheeseJumpByCidService.class */
@StabilityInferred(parameters = 0)
public final class CheeseJumpByCidService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final d f90722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f90723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final CheesePlayRepository f90724c;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.playposition.CheeseJumpByCidService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/playposition/CheeseJumpByCidService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final CheeseJumpByCidService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.playposition.CheeseJumpByCidService$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/playposition/CheeseJumpByCidService$1$a.class */
        public static final class a implements Function3<Long, i, com.bilibili.ship.theseus.united.report.b, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CheeseJumpByCidService f90725a;

            public a(CheeseJumpByCidService cheeseJumpByCidService) {
                this.f90725a = cheeseJumpByCidService;
            }

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                long jLongValue = ((Number) obj).longValue();
                i iVar = (i) obj2;
                int i7 = ((com.bilibili.ship.theseus.united.report.b) obj3).f104838a;
                CheeseJumpByCidService cheeseJumpByCidService = this.f90725a;
                C6985d c6985dC = cheeseJumpByCidService.f90724c.c(jLongValue);
                BLog.d("jumpByCidService cid: " + jLongValue + ", epTitle: " + (c6985dC != null ? c6985dC.f117512g : null));
                if (c6985dC != null) {
                    CheesePlayRepository.i(cheeseJumpByCidService.f90724c, c6985dC, iVar, null, i7, 4);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.playposition.CheeseJumpByCidService$1$b */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/playposition/CheeseJumpByCidService$1$b.class */
        public static final class b implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CheeseJumpByCidService f90726a;

            public b(CheeseJumpByCidService cheeseJumpByCidService) {
                this.f90726a = cheeseJumpByCidService;
            }

            public final void invoke() {
                d dVar = this.f90726a.f90722a;
                dVar.f90735b = dVar.f90734a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheeseJumpByCidService cheeseJumpByCidService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cheeseJumpByCidService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            j bVar;
            j jVar;
            Throwable th;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                CheeseJumpByCidService cheeseJumpByCidService = this.this$0;
                cheeseJumpByCidService.f90722a.f90735b = new a(cheeseJumpByCidService);
                bVar = new b(cheeseJumpByCidService);
                try {
                    this.L$0 = bVar;
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th2) {
                    jVar = bVar;
                    th = th2;
                    jVar.invoke();
                    throw th;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j jVar2 = (j) this.L$0;
                jVar = jVar2;
                try {
                    ResultKt.throwOnFailure(obj);
                    bVar = jVar2;
                } catch (Throwable th3) {
                    th = th3;
                    jVar.invoke();
                    throw th;
                }
            }
            j jVar3 = bVar;
            jVar = bVar;
            throw new KotlinNothingValueException();
        }
    }

    @Inject
    public CheeseJumpByCidService(@NotNull d dVar, @NotNull CoroutineScope coroutineScope, @NotNull CheesePlayRepository cheesePlayRepository) {
        this.f90722a = dVar;
        this.f90723b = coroutineScope;
        this.f90724c = cheesePlayRepository;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
