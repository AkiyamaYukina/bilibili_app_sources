package com.bilibili.ship.theseus.ogv.chathall;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository$special$$inlined$map$1;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.ogv.season.SeasonMode;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import sl0.C8597a;
import sl0.InterfaceC8598b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/ChatHallService$newChangeRoomPage$1.class */
final class ChatHallService$newChangeRoomPage$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final Fragment $fragment;
    int label;
    final ChatHallService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.chathall.ChatHallService$newChangeRoomPage$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/ChatHallService$newChangeRoomPage$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Fragment $fragment;
        private Object L$0;
        int label;
        final ChatHallService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.chathall.ChatHallService$newChangeRoomPage$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/ChatHallService$newChangeRoomPage$1$1$1.class */
        public static final class C06811 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Fragment $fragment;
            int label;
            final ChatHallService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.chathall.ChatHallService$newChangeRoomPage$1$1$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/ChatHallService$newChangeRoomPage$1$1$1$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ChatHallService f91723a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Fragment f91724b;

                public a(ChatHallService chatHallService, Fragment fragment) {
                    this.f91723a = chatHallService;
                    this.f91724b = fragment;
                }

                public final Object emit(Object obj, Continuation continuation) {
                    OgvEpisode ogvEpisode = (OgvEpisode) obj;
                    if (ogvEpisode != null) {
                        vl0.b bVar = vl0.b.f128291a;
                        ChatHallService chatHallService = this.f91723a;
                        Context context = chatHallService.f91705b;
                        OgvSeason ogvSeason = chatHallService.f91708e;
                        ((InterfaceC8598b) this.f91724b).w9(new C8597a(ogvEpisode.f93555a, bVar.b(context, ogvSeason.f94462o == SeasonMode.SINGLE_EPISODE, ogvSeason.f94453e, ogvSeason.c(), ogvEpisode.f93563j, ogvEpisode.f93564k)));
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06811(ChatHallService chatHallService, Fragment fragment, Continuation<? super C06811> continuation) {
                super(2, continuation);
                this.this$0 = chatHallService;
                this.$fragment = fragment;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06811(this.this$0, this.$fragment, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    ChatHallService chatHallService = this.this$0;
                    OgvCurrentEpisodeRepository$special$$inlined$map$1 ogvCurrentEpisodeRepository$special$$inlined$map$1 = chatHallService.f91706c.f92119v;
                    a aVar = new a(chatHallService, this.$fragment);
                    this.label = 1;
                    if (ogvCurrentEpisodeRepository$special$$inlined$map$1.collect(aVar, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.chathall.ChatHallService$newChangeRoomPage$1$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/ChatHallService$newChangeRoomPage$1$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Fragment $fragment;
            int label;
            final ChatHallService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.chathall.ChatHallService$newChangeRoomPage$1$1$2$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/ChatHallService$newChangeRoomPage$1$1$2$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Fragment f91725a;

                public a(Fragment fragment) {
                    this.f91725a = fragment;
                }

                public final Object emit(Object obj, Continuation continuation) {
                    ((InterfaceC8598b) this.f91725a).fa(((Boolean) obj).booleanValue());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(ChatHallService chatHallService, Fragment fragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = chatHallService;
                this.$fragment = fragment;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$fragment, continuation);
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
                    MutableSharedFlow<Boolean> mutableSharedFlow = this.this$0.f91719q;
                    a aVar = new a(this.$fragment);
                    this.label = 1;
                    if (mutableSharedFlow.collect(aVar, this) == coroutine_suspended) {
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
        public AnonymousClass1(ChatHallService chatHallService, Fragment fragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = chatHallService;
            this.$fragment = fragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$fragment, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C06811(this.this$0, this.$fragment, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$fragment, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatHallService$newChangeRoomPage$1(Fragment fragment, ChatHallService chatHallService, Continuation<? super ChatHallService$newChangeRoomPage$1> continuation) {
        super(1, continuation);
        this.$fragment = fragment;
        this.this$0 = chatHallService;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ChatHallService$newChangeRoomPage$1(this.$fragment, this.this$0, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Fragment fragment = this.$fragment;
            if (fragment instanceof InterfaceC8598b) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, fragment, null);
                this.label = 1;
                if (CoroutineScopeKt.coroutineScope(anonymousClass1, this) == coroutine_suspended) {
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
