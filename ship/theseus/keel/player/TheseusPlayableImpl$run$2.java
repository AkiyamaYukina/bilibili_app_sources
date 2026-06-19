package com.bilibili.ship.theseus.keel.player;

import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.lib.media.resource.PlayIndex;
import com.bilibili.player.tangram.playercore.A;
import com.bilibili.player.tangram.playercore.PCSPlayableImpl;
import com.bilibili.player.tangram.playercore.u;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/TheseusPlayableImpl$run$2.class */
final class TheseusPlayableImpl$run$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<?>, Object> {
    private Object L$0;
    int label;
    final k this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.keel.player.TheseusPlayableImpl$run$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/TheseusPlayableImpl$run$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final k this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(k kVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = kVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
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
                PCSPlayableImpl pCSPlayableImpl = this.this$0.f91114b;
                this.label = 1;
                if (pCSPlayableImpl.D(this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.keel.player.TheseusPlayableImpl$run$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/TheseusPlayableImpl$run$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final k this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.keel.player.TheseusPlayableImpl$run$2$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/TheseusPlayableImpl$run$2$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final k f91077a;

            public a(k kVar) {
                this.f91077a = kVar;
            }

            public final Object emit(Object obj, Continuation continuation) {
                Unit unit;
                A a7 = (A) obj;
                if (a7 instanceof A.a) {
                    A.a aVar = (A.a) a7;
                    if (!aVar.f79325b) {
                        u uVar = aVar.f79324a;
                        if (!uVar.f79463f) {
                            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                            MediaResource mediaResource = uVar.f79460c;
                            PlayIndex playIndex = mediaResource.getPlayIndex();
                            String strValueOf = playIndex != null ? String.valueOf(playIndex.mQuality) : null;
                            String str = strValueOf;
                            if (strValueOf == null) {
                                str = "";
                            }
                            mapCreateMapBuilder.put("key_extras_qn", str);
                            int iSourceFrom = mediaResource.sourceFrom();
                            mapCreateMapBuilder.put("key_extras_resolve_type", iSourceFrom != 1 ? iSourceFrom != 3 ? "0" : "2" : "1");
                            k kVar = this.f91077a;
                            mapCreateMapBuilder.put("key_extras_start_position", String.valueOf(kVar.f91114b.f79417e.L()));
                            Map mapBuild = MapsKt.build(mapCreateMapBuilder);
                            ii1.a aVar2 = kVar.f91116d;
                            if (aVar2 != null) {
                                aVar2.a("set_media_item", mapBuild);
                            }
                            unit = Unit.INSTANCE;
                        }
                    }
                    unit = Unit.INSTANCE;
                } else {
                    unit = Unit.INSTANCE;
                }
                return unit;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(k kVar, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = kVar;
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
                k kVar = this.this$0;
                PCSPlayableImpl pCSPlayableImpl = kVar.f91114b;
                a aVar = new a(kVar);
                this.label = 1;
                if (pCSPlayableImpl.f79422k.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.keel.player.TheseusPlayableImpl$run$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/TheseusPlayableImpl$run$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final k this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(k kVar, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = kVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Function1<Continuation<? super Unit>, Object> function1 = this.this$0.f91118f;
                this.label = 1;
                if (function1.invoke(this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusPlayableImpl$run$2(k kVar, Continuation<? super TheseusPlayableImpl$run$2> continuation) {
        super(2, continuation);
        this.this$0 = kVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TheseusPlayableImpl$run$2 theseusPlayableImpl$run$2 = new TheseusPlayableImpl$run$2(this.this$0, continuation);
        theseusPlayableImpl$run$2.L$0 = obj;
        return theseusPlayableImpl$run$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<?> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, coroutineStart, new AnonymousClass1(this.this$0, null), 1, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, coroutineStart, new AnonymousClass2(this.this$0, null), 1, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, null), 3, (Object) null);
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
    }
}
