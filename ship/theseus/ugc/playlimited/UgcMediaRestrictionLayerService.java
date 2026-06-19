package com.bilibili.ship.theseus.ugc.playlimited;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.player.tangram.playercore.u;
import com.bilibili.ship.theseus.keel.player.j;
import com.bilibili.ship.theseus.united.page.playingarea.i;
import com.bilibili.ship.theseus.united.page.restrictionlayer.B;
import com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerVo;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playlimited/UgcMediaRestrictionLayerService.class */
@StabilityInferred(parameters = 0)
public final class UgcMediaRestrictionLayerService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final j f98364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final B f98365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final i f98366c;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.playlimited.UgcMediaRestrictionLayerService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playlimited/UgcMediaRestrictionLayerService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private Object L$0;
        int label;
        final UgcMediaRestrictionLayerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.playlimited.UgcMediaRestrictionLayerService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playlimited/UgcMediaRestrictionLayerService$1$1.class */
        public static final class C09171 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final UgcMediaRestrictionLayerService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.playlimited.UgcMediaRestrictionLayerService$1$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playlimited/UgcMediaRestrictionLayerService$1$1$a.class */
            public static final class a {
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09171(UgcMediaRestrictionLayerService ugcMediaRestrictionLayerService, Continuation<? super C09171> continuation) {
                super(2, continuation);
                this.this$0 = ugcMediaRestrictionLayerService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C09171(this.this$0, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v8, types: [com.bilibili.ship.theseus.ugc.playlimited.UgcMediaRestrictionLayerService$1$1$a, java.lang.Object] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    B b7 = this.this$0.f98365b;
                    ?? obj2 = new Object();
                    this.label = 1;
                    if (b7.c(obj2, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.playlimited.UgcMediaRestrictionLayerService$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playlimited/UgcMediaRestrictionLayerService$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final MutableStateFlow<Boolean> $restrictionLayerShowFlow;
            int label;
            final UgcMediaRestrictionLayerService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.playlimited.UgcMediaRestrictionLayerService$1$2$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playlimited/UgcMediaRestrictionLayerService$1$2$1.class */
            public static final class C09181 extends SuspendLambda implements Function3<u, Boolean, Continuation<? super Boolean>, Object> {
                Object L$0;
                boolean Z$0;
                int label;

                public C09181(Continuation<? super C09181> continuation) {
                    super(3, continuation);
                }

                public final Object invoke(u uVar, boolean z6, Continuation<? super Boolean> continuation) {
                    C09181 c09181 = new C09181(continuation);
                    c09181.L$0 = uVar;
                    c09181.Z$0 = z6;
                    return c09181.invokeSuspend(Unit.INSTANCE);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((u) obj, ((Boolean) obj2).booleanValue(), (Continuation<? super Boolean>) obj3);
                }

                public final Object invokeSuspend(Object obj) {
                    MediaResource mediaResource;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    u uVar = (u) this.L$0;
                    boolean z6 = this.Z$0;
                    boolean z7 = true;
                    if ((uVar != null && (mediaResource = uVar.f79460c) != null && mediaResource.isPlayable()) || !z6) {
                        z7 = false;
                    }
                    return Boxing.boxBoolean(z7);
                }
            }

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.playlimited.UgcMediaRestrictionLayerService$1$2$2, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playlimited/UgcMediaRestrictionLayerService$1$2$2.class */
            public static final class C09192 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
                boolean Z$0;
                int label;
                final UgcMediaRestrictionLayerService this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C09192(UgcMediaRestrictionLayerService ugcMediaRestrictionLayerService, Continuation<? super C09192> continuation) {
                    super(2, continuation);
                    this.this$0 = ugcMediaRestrictionLayerService;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C09192 c09192 = new C09192(this.this$0, continuation);
                    c09192.Z$0 = ((Boolean) obj).booleanValue();
                    return c09192;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
                }

                public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                    return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i7 = this.label;
                    if (i7 == 0) {
                        ResultKt.throwOnFailure(obj);
                        if (this.Z$0) {
                            i iVar = this.this$0.f98366c;
                            this.label = 1;
                            if (iVar.b("UgcMediaRestrictionLayerService", this) == coroutine_suspended) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(UgcMediaRestrictionLayerService ugcMediaRestrictionLayerService, MutableStateFlow<Boolean> mutableStateFlow, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = ugcMediaRestrictionLayerService;
                this.$restrictionLayerShowFlow = mutableStateFlow;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$restrictionLayerShowFlow, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(this.this$0.f98364a.b(), this.$restrictionLayerShowFlow, new C09181(null)));
                    C09192 c09192 = new C09192(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, c09192, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.playlimited.UgcMediaRestrictionLayerService$1$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playlimited/UgcMediaRestrictionLayerService$1$3.class */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final MutableStateFlow<Boolean> $restrictionLayerShowFlow;
            int label;
            final UgcMediaRestrictionLayerService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(UgcMediaRestrictionLayerService ugcMediaRestrictionLayerService, MutableStateFlow<Boolean> mutableStateFlow, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = ugcMediaRestrictionLayerService;
                this.$restrictionLayerShowFlow = mutableStateFlow;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean invokeSuspend$lambda$0() {
                return false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$1(MutableStateFlow mutableStateFlow) {
                mutableStateFlow.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, this.$restrictionLayerShowFlow, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference failed for: r2v0, types: [com.bilibili.ship.theseus.ugc.playlimited.c, java.lang.Object] */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    UgcMediaRestrictionLayerService ugcMediaRestrictionLayerService = this.this$0;
                    B b7 = ugcMediaRestrictionLayerService.f98365b;
                    RestrictionLayerVo.Style style = RestrictionLayerVo.Style.UNIVERSAL_INTERCEPT;
                    ugcMediaRestrictionLayerService.f98364a.f().getAvid();
                    B.a.C1106a c1106a = new B.a.C1106a(new Object(), new d(this.$restrictionLayerShowFlow));
                    this.label = 1;
                    if (b7.b(style, c1106a, this) == coroutine_suspended) {
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
        public AnonymousClass1(UgcMediaRestrictionLayerService ugcMediaRestrictionLayerService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ugcMediaRestrictionLayerService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
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
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C09171(this.this$0, null), 3, (Object) null);
            MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(Boxing.boxBoolean(false));
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, MutableStateFlow, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, MutableStateFlow, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    @Inject
    public UgcMediaRestrictionLayerService(@NotNull CoroutineScope coroutineScope, @NotNull j jVar, @NotNull B b7, @NotNull i iVar) {
        this.f98364a = jVar;
        this.f98365b = b7;
        this.f98366c = iVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
