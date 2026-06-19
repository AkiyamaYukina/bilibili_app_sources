package com.bilibili.player.tangram.playercore;

import androidx.compose.foundation.gestures.C3392f;
import com.bilibili.player.tangram.basic.PlayerAvailability;
import com.bilibili.player.tangram.playercore.FlattenedPCSFacade;
import com.bilibili.studio.material.util.UtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.FlowKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/FlattenedPCSFacade$runPiece$2.class */
final class FlattenedPCSFacade$runPiece$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final CoroutineScope $coordinatingCoroutineScope;
    final boolean $seeksAccurately;
    final int $selectedIndex;
    final long $targetPosition;
    private Object L$0;
    int label;
    final FlattenedPCSFacade this$0;

    /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.FlattenedPCSFacade$runPiece$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/FlattenedPCSFacade$runPiece$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final PCSFacadeImpl $facade;
        final boolean $seeksAccurately;
        final long $targetPosition;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PCSFacadeImpl pCSFacadeImpl, long j7, boolean z6, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$facade = pCSFacadeImpl;
            this.$targetPosition = j7;
            this.$seeksAccurately = z6;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$facade, this.$targetPosition, this.$seeksAccurately, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PCSFacadeImpl pCSFacadeImpl = this.$facade;
                long j7 = this.$targetPosition;
                boolean z6 = this.$seeksAccurately;
                this.label = 1;
                if (pCSFacadeImpl.c(j7, z6, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.FlattenedPCSFacade$runPiece$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/FlattenedPCSFacade$runPiece$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final PCSFacadeImpl $facade;
        final u $media;
        final com.bilibili.player.tangram.basic.a $previousOperatingQuality;
        final boolean $seeksAccurately;
        final long $targetPosition;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(com.bilibili.player.tangram.basic.a aVar, u uVar, PCSFacadeImpl pCSFacadeImpl, long j7, boolean z6, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$previousOperatingQuality = aVar;
            this.$media = uVar;
            this.$facade = pCSFacadeImpl;
            this.$targetPosition = j7;
            this.$seeksAccurately = z6;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$previousOperatingQuality, this.$media, this.$facade, this.$targetPosition, this.$seeksAccurately, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                com.bilibili.player.tangram.basic.a aVar = this.$previousOperatingQuality;
                if (aVar != null) {
                    y.c(aVar.f79320a, this.$media.f79460c);
                }
                PCSFacadeImpl pCSFacadeImpl = this.$facade;
                long j7 = this.$targetPosition;
                boolean z6 = this.$seeksAccurately;
                this.label = 1;
                if (pCSFacadeImpl.I(j7, z6, null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.FlattenedPCSFacade$runPiece$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/FlattenedPCSFacade$runPiece$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final PCSFacadeImpl $facade;
        final Function3<Integer, InterfaceC5778f, Continuation<? super Unit>, Object> $runWithPiece;
        final int $selectedIndex;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Function3<? super Integer, ? super InterfaceC5778f, ? super Continuation<? super Unit>, ? extends Object> function3, int i7, PCSFacadeImpl pCSFacadeImpl, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$runWithPiece = function3;
            this.$selectedIndex = i7;
            this.$facade = pCSFacadeImpl;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$runWithPiece, this.$selectedIndex, this.$facade, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Function3<Integer, InterfaceC5778f, Continuation<? super Unit>, Object> function3 = this.$runWithPiece;
                Integer numBoxInt = Boxing.boxInt(this.$selectedIndex);
                PCSFacadeImpl pCSFacadeImpl = this.$facade;
                this.label = 1;
                if (function3.invoke(numBoxInt, pCSFacadeImpl, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.FlattenedPCSFacade$runPiece$2$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/FlattenedPCSFacade$runPiece$2$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final CoroutineScope $coordinatingCoroutineScope;
        final PCSFacadeImpl $facade;
        final u $media;
        final boolean $seeksAccurately;
        final int $selectedIndex;
        long J$0;
        int label;
        final FlattenedPCSFacade this$0;

        /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.FlattenedPCSFacade$runPiece$2$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/FlattenedPCSFacade$runPiece$2$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Duration, Continuation<? super Boolean>, Object> {
            final long $duration;
            long J$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(long j7, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$duration = j7;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$duration, continuation);
                anonymousClass1.J$0 = ((Duration) obj).unbox-impl();
                return anonymousClass1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return m8245invokeVtjQ1oo(((Duration) obj).unbox-impl(), (Continuation) obj2);
            }

            /* JADX INFO: renamed from: invoke-VtjQ1oo, reason: not valid java name */
            public final Object m8245invokeVtjQ1oo(long j7, Continuation<? super Boolean> continuation) {
                return create(Duration.box-impl(j7), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(Duration.compareTo-LRDsOJo(Duration.minus-LRDsOJo(this.$duration, this.J$0), DurationKt.toDuration(5, DurationUnit.SECONDS)) <= 0);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.FlattenedPCSFacade$runPiece$2$4$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/FlattenedPCSFacade$runPiece$2$4$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final boolean $seeksAccurately;
            final PCSFacadeImpl $toPreload;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(PCSFacadeImpl pCSFacadeImpl, boolean z6, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$toPreload = pCSFacadeImpl;
                this.$seeksAccurately = z6;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$toPreload, this.$seeksAccurately, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    PCSFacadeImpl pCSFacadeImpl = this.$toPreload;
                    long j7 = Duration.Companion.getZERO-UwyO8pc();
                    boolean z6 = this.$seeksAccurately;
                    this.label = 1;
                    if (pCSFacadeImpl.I(j7, z6, null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(u uVar, PCSFacadeImpl pCSFacadeImpl, int i7, FlattenedPCSFacade flattenedPCSFacade, CoroutineScope coroutineScope, boolean z6, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$media = uVar;
            this.$facade = pCSFacadeImpl;
            this.$selectedIndex = i7;
            this.this$0 = flattenedPCSFacade;
            this.$coordinatingCoroutineScope = coroutineScope;
            this.$seeksAccurately = z6;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.$media, this.$facade, this.$selectedIndex, this.this$0, this.$coordinatingCoroutineScope, this.$seeksAccurately, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00b0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 337
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.FlattenedPCSFacade$runPiece$2.AnonymousClass4.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.FlattenedPCSFacade$runPiece$2$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/FlattenedPCSFacade$runPiece$2$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<PlayerAvailability, Continuation<? super Unit>, Object> {
        final int $selectedIndex;
        Object L$0;
        int label;
        final FlattenedPCSFacade this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(int i7, FlattenedPCSFacade flattenedPCSFacade, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.$selectedIndex = i7;
            this.this$0 = flattenedPCSFacade;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$selectedIndex, this.this$0, continuation);
            anonymousClass5.L$0 = obj;
            return anonymousClass5;
        }

        public final Object invoke(PlayerAvailability playerAvailability, Continuation<? super Unit> continuation) {
            return create(playerAvailability, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PlayerAvailability playerAvailability = (PlayerAvailability) this.L$0;
                if (playerAvailability == PlayerAvailability.COMPLETED) {
                    if (this.$selectedIndex == CollectionsKt.getLastIndex(this.this$0.f79355d)) {
                        BLog.i("FlattenedPCSFacade$runPiece$2$5-invokeSuspend", "[tangram-player-core-FlattenedPCSFacade$runPiece$2$5-invokeSuspend] Tail piece completed, emitting completed state.");
                        this.this$0.f79367q.setValue(playerAvailability);
                    } else {
                        defpackage.a.b("[tangram-player-core-FlattenedPCSFacade$runPiece$2$5-invokeSuspend] ", C3392f.a(this.$selectedIndex, "Completed state of piece ", " shadowed."), "FlattenedPCSFacade$runPiece$2$5-invokeSuspend");
                        defpackage.a.b("[tangram-player-core-FlattenedPCSFacade$runPiece$2$5-invokeSuspend] ", C3392f.a(this.$selectedIndex + 1, "Switching to next piece ", UtilsKt.DOT), "FlattenedPCSFacade$runPiece$2$5-invokeSuspend");
                        Channel<FlattenedPCSFacade.a> channel = this.this$0.f79362l;
                        FlattenedPCSFacade.a.C0511a c0511a = new FlattenedPCSFacade.a.C0511a(this.$selectedIndex + 1, Duration.Companion.getZERO-UwyO8pc(), false);
                        this.label = 1;
                        if (channel.send(c0511a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else if (playerAvailability == PlayerAvailability.IDLE) {
                    this.this$0.f79367q.setValue(PlayerAvailability.LOADING);
                } else {
                    this.this$0.f79367q.setValue(playerAvailability);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlattenedPCSFacade$runPiece$2(FlattenedPCSFacade flattenedPCSFacade, int i7, long j7, CoroutineScope coroutineScope, boolean z6, Continuation<? super FlattenedPCSFacade$runPiece$2> continuation) {
        super(2, continuation);
        this.this$0 = flattenedPCSFacade;
        this.$selectedIndex = i7;
        this.$targetPosition = j7;
        this.$coordinatingCoroutineScope = coroutineScope;
        this.$seeksAccurately = z6;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FlattenedPCSFacade$runPiece$2 flattenedPCSFacade$runPiece$2 = new FlattenedPCSFacade$runPiece$2(this.this$0, this.$selectedIndex, this.$targetPosition, this.$coordinatingCoroutineScope, this.$seeksAccurately, continuation);
        flattenedPCSFacade$runPiece$2.L$0 = obj;
        return flattenedPCSFacade$runPiece$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        FlattenedPCSFacade.b next;
        PCSFacadeImpl pCSFacadeImplE;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        ArrayList<FlattenedPCSFacade.b> arrayList = this.this$0.f79365o;
        int i7 = this.$selectedIndex;
        Iterator<FlattenedPCSFacade.b> it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.f79377a == i7) {
                break;
            }
        }
        FlattenedPCSFacade.b bVar = next;
        u uVar = (u) ((ArrayList) this.this$0.f79355d).get(this.$selectedIndex);
        FlattenedPCSFacade flattenedPCSFacade = this.this$0;
        Function3<Integer, InterfaceC5778f, Continuation<? super Unit>, Object> function3 = flattenedPCSFacade.h;
        if (bVar != null) {
            int i8 = this.$selectedIndex;
            String str = Duration.toString-impl(this.$targetPosition);
            Duration duration = uVar.b().a;
            StringBuilder sbB = bilibili.live.app.service.resolver.a.b(i8, "Running preloaded piece ", " from ", str, "/");
            sbB.append(duration);
            sbB.append(UtilsKt.DOT);
            defpackage.a.b("[tangram-player-core-FlattenedPCSFacade$runPiece$2-invokeSuspend] ", sbB.toString(), "FlattenedPCSFacade$runPiece$2-invokeSuspend");
            this.this$0.f79365o.remove(bVar);
            long j7 = this.$targetPosition;
            pCSFacadeImplE = bVar.f79379c;
            if (Duration.compareTo-LRDsOJo(Duration.getAbsoluteValue-UwyO8pc(Duration.minus-LRDsOJo(j7, pCSFacadeImplE.F())), DurationKt.toDuration(5, DurationUnit.SECONDS)) > 0) {
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(pCSFacadeImplE, this.$targetPosition, this.$seeksAccurately, null), 3, (Object) null);
            }
            this.this$0.f79369s = bVar.f79378b;
        } else {
            pCSFacadeImplE = FlattenedPCSFacade.e(flattenedPCSFacade, this.$coordinatingCoroutineScope, this.$selectedIndex);
            int i9 = this.$selectedIndex;
            String str2 = Duration.toString-impl(this.$targetPosition);
            Duration duration2 = uVar.b().a;
            StringBuilder sbB2 = bilibili.live.app.service.resolver.a.b(i9, "Running not preloaded piece ", " from ", str2, "/");
            sbB2.append(duration2);
            sbB2.append(UtilsKt.DOT);
            defpackage.a.b("[tangram-player-core-FlattenedPCSFacade$runPiece$2-invokeSuspend] ", sbB2.toString(), "FlattenedPCSFacade$runPiece$2-invokeSuspend");
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0.x(), uVar, pCSFacadeImplE, this.$targetPosition, this.$seeksAccurately, null), 3, (Object) null);
        }
        this.this$0.f79363m.setValue(new FlattenedPCSFacade.c(this.$selectedIndex, pCSFacadeImplE));
        if (function3 != null) {
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(function3, this.$selectedIndex, pCSFacadeImplE, null), 3, (Object) null);
        }
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(uVar, pCSFacadeImplE, this.$selectedIndex, this.this$0, this.$coordinatingCoroutineScope, this.$seeksAccurately, null), 3, (Object) null);
        return FlowKt.launchIn(FlowKt.onEach(pCSFacadeImplE.f79394l, new AnonymousClass5(this.$selectedIndex, this.this$0, null)), coroutineScope);
    }
}
