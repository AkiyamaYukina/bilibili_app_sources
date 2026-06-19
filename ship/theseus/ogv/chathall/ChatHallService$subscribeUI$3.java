package com.bilibili.ship.theseus.ogv.chathall;

import com.bilibili.chatroomsdk.RoomDestroyEvent;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository$special$$inlined$map$1;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/ChatHallService$subscribeUI$3.class */
final class ChatHallService$subscribeUI$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private Object L$0;
    int label;
    final ChatHallService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.chathall.ChatHallService$subscribeUI$3$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/ChatHallService$subscribeUI$3$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ChatHallService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.chathall.ChatHallService$subscribeUI$3$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/ChatHallService$subscribeUI$3$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ChatHallService f91726a;

            public a(ChatHallService chatHallService) {
                this.f91726a = chatHallService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                String contentStr = ((RoomDestroyEvent) obj).getMessage().getContentStr();
                if (contentStr != null) {
                    this.f91726a.e(contentStr);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ChatHallService chatHallService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = chatHallService;
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
                fV.i iVar = this.this$0.f91717o;
                fV.i iVar2 = iVar;
                if (iVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mChatExternalService");
                    iVar2 = null;
                }
                fV.j jVar = iVar2.j;
                if (jVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imState");
                    jVar = null;
                }
                Flow flowA = kotlinx.coroutines.rx3.e.a(jVar.e);
                a aVar = new a(this.this$0);
                this.label = 1;
                if (flowA.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.chathall.ChatHallService$subscribeUI$3$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/ChatHallService$subscribeUI$3$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ChatHallService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.chathall.ChatHallService$subscribeUI$3$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/ChatHallService$subscribeUI$3$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ChatHallService f91727a;

            public a(ChatHallService chatHallService) {
                this.f91727a = chatHallService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                int iIntValue = ((Number) obj).intValue();
                h hVarD = this.f91727a.d();
                boolean z6 = iIntValue != 0;
                if (z6 != hVarD.f91775g) {
                    hVarD.f91775g = z6;
                    hVarD.notifyPropertyChanged(588);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ChatHallService chatHallService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = chatHallService;
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
                fV.i iVar = this.this$0.f91717o;
                fV.i iVar2 = iVar;
                if (iVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mChatExternalService");
                    iVar2 = null;
                }
                fV.l lVar = iVar2.i;
                if (lVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("panelState");
                    lVar = null;
                }
                Flow flowA = kotlinx.coroutines.rx3.e.a(lVar.b);
                a aVar = new a(this.this$0);
                this.label = 1;
                if (flowA.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.chathall.ChatHallService$subscribeUI$3$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/ChatHallService$subscribeUI$3$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ChatHallService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.chathall.ChatHallService$subscribeUI$3$3$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/ChatHallService$subscribeUI$3$3$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ChatHallService f91728a;

            public a(ChatHallService chatHallService) {
                this.f91728a = chatHallService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                h hVarD = this.f91728a.d();
                if (zBooleanValue != hVarD.f91774f) {
                    hVarD.f91774f = zBooleanValue;
                    hVarD.notifyPropertyChanged(174);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ChatHallService chatHallService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = chatHallService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
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
                ChatHallService chatHallService = this.this$0;
                MutableSharedFlow<Boolean> mutableSharedFlow = chatHallService.f91719q;
                a aVar = new a(chatHallService);
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/ChatHallService$subscribeUI$3$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChatHallService f91729a;

        public a(ChatHallService chatHallService) {
            this.f91729a = chatHallService;
        }

        public final Object emit(Object obj, Continuation continuation) {
            ChatHallService chatHallService = this.f91729a;
            fV.i iVar = chatHallService.f91717o;
            fV.i iVar2 = iVar;
            if (iVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChatExternalService");
                iVar2 = null;
            }
            String strC = chatHallService.c();
            iVar2.k.b = strC;
            iVar2.c = strC;
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatHallService$subscribeUI$3(ChatHallService chatHallService, Continuation<? super ChatHallService$subscribeUI$3> continuation) {
        super(2, continuation);
        this.this$0 = chatHallService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatHallService$subscribeUI$3 chatHallService$subscribeUI$3 = new ChatHallService$subscribeUI$3(this.this$0, continuation);
        chatHallService$subscribeUI$3.L$0 = obj;
        return chatHallService$subscribeUI$3;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, null), 3, (Object) null);
            ChatHallService chatHallService = this.this$0;
            OgvCurrentEpisodeRepository$special$$inlined$map$1 ogvCurrentEpisodeRepository$special$$inlined$map$1 = chatHallService.f91706c.f92119v;
            a aVar = new a(chatHallService);
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
