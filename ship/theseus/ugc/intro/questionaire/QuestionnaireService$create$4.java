package com.bilibili.ship.theseus.ugc.intro.questionaire;

import androidx.compose.runtime.MutableState;
import com.bilibili.ship.theseus.keel.player.j;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/questionaire/QuestionnaireService$create$4.class */
public final class QuestionnaireService$create$4 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final d $data;
    final Ref.BooleanRef $needShow;
    final MutableState<Boolean> $visible;
    int label;
    final QuestionnaireService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.questionaire.QuestionnaireService$create$4$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/questionaire/QuestionnaireService$create$4$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final d $data;
        final Ref.BooleanRef $needShow;
        final MutableState<Boolean> $visible;
        private Object L$0;
        int label;
        final QuestionnaireService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.questionaire.QuestionnaireService$create$4$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/questionaire/QuestionnaireService$create$4$1$1.class */
        public static final class C08471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final d $data;
            final Ref.BooleanRef $needShow;
            final MutableState<Boolean> $visible;
            int label;
            final QuestionnaireService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.questionaire.QuestionnaireService$create$4$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/questionaire/QuestionnaireService$create$4$1$1$1.class */
            public static final class C08481 extends SuspendLambda implements Function2<Duration, Continuation<? super Boolean>, Object> {
                final d $data;
                long J$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C08481(d dVar, Continuation<? super C08481> continuation) {
                    super(2, continuation);
                    this.$data = dVar;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C08481 c08481 = new C08481(this.$data, continuation);
                    c08481.J$0 = ((Duration) obj).unbox-impl();
                    return c08481;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return m9302invokeVtjQ1oo(((Duration) obj).unbox-impl(), (Continuation) obj2);
                }

                /* JADX INFO: renamed from: invoke-VtjQ1oo, reason: not valid java name */
                public final Object m9302invokeVtjQ1oo(long j7, Continuation<? super Boolean> continuation) {
                    return create(Duration.box-impl(j7), continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Boxing.boxBoolean(Duration.getInWholeSeconds-impl(this.J$0) >= this.$data.f97164j);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08471(d dVar, QuestionnaireService questionnaireService, Ref.BooleanRef booleanRef, MutableState<Boolean> mutableState, Continuation<? super C08471> continuation) {
                super(2, continuation);
                this.$data = dVar;
                this.this$0 = questionnaireService;
                this.$needShow = booleanRef;
                this.$visible = mutableState;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C08471(this.$data, this.this$0, this.$needShow, this.$visible, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    r9 = r0
                    r0 = r5
                    int r0 = r0.label
                    r7 = r0
                    r0 = r7
                    if (r0 == 0) goto L30
                    r0 = r7
                    r1 = 1
                    if (r0 == r1) goto L29
                    r0 = r7
                    r1 = 2
                    if (r0 != r1) goto L1f
                    r0 = r6
                    kotlin.ResultKt.throwOnFailure(r0)
                    goto L8c
                L1f:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    r1 = r0
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r0
                L29:
                    r0 = r6
                    kotlin.ResultKt.throwOnFailure(r0)
                    goto L62
                L30:
                    r0 = r6
                    kotlin.ResultKt.throwOnFailure(r0)
                    r0 = r5
                    com.bilibili.ship.theseus.ugc.intro.questionaire.d r0 = r0.$data
                    boolean r0 = r0.h
                    if (r0 == 0) goto La7
                    r0 = r5
                    com.bilibili.ship.theseus.ugc.intro.questionaire.QuestionnaireService r0 = r0.this$0
                    com.bilibili.ship.theseus.keel.player.h r0 = r0.f97142b
                    kotlinx.coroutines.flow.MutableStateFlow<com.bilibili.ship.theseus.keel.player.j> r0 = r0.f91111e
                    kotlinx.coroutines.flow.StateFlow r0 = kotlinx.coroutines.flow.FlowKt.asStateFlow(r0)
                    r6 = r0
                    r0 = r5
                    r1 = 1
                    r0.label = r1
                    r0 = r6
                    r1 = r5
                    java.lang.Object r0 = com.bilibili.ogv.infra.coroutine.b.a(r0, r1)
                    r8 = r0
                    r0 = r8
                    r6 = r0
                    r0 = r8
                    r1 = r9
                    if (r0 != r1) goto L62
                    r0 = r9
                    return r0
                L62:
                    r0 = r6
                    com.bilibili.ship.theseus.keel.player.j r0 = (com.bilibili.ship.theseus.keel.player.j) r0
                    kotlinx.coroutines.flow.Flow r0 = r0.J()
                    r8 = r0
                    com.bilibili.ship.theseus.ugc.intro.questionaire.QuestionnaireService$create$4$1$1$1 r0 = new com.bilibili.ship.theseus.ugc.intro.questionaire.QuestionnaireService$create$4$1$1$1
                    r1 = r0
                    r2 = r5
                    com.bilibili.ship.theseus.ugc.intro.questionaire.d r2 = r2.$data
                    r3 = 0
                    r1.<init>(r2, r3)
                    r6 = r0
                    r0 = r5
                    r1 = 2
                    r0.label = r1
                    r0 = r8
                    r1 = r6
                    r2 = r5
                    java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r0, r1, r2)
                    r1 = r9
                    if (r0 != r1) goto L8c
                    r0 = r9
                    return r0
                L8c:
                    r0 = r5
                    kotlin.jvm.internal.Ref$BooleanRef r0 = r0.$needShow
                    boolean r0 = r0.element
                    if (r0 != 0) goto L9a
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                L9a:
                    r0 = r5
                    androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r0.$visible
                    r1 = 1
                    java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
                    r0.setValue(r1)
                La7:
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.questionaire.QuestionnaireService$create$4.AnonymousClass1.C08471.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.questionaire.QuestionnaireService$create$4$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/questionaire/QuestionnaireService$create$4$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final d $data;
            final Ref.BooleanRef $needShow;
            final MutableState<Boolean> $visible;
            int label;
            final QuestionnaireService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.questionaire.QuestionnaireService$create$4$1$2$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/questionaire/QuestionnaireService$create$4$1$2$1.class */
            public static final class C08491 extends SuspendLambda implements Function2<Duration, Continuation<? super Boolean>, Object> {
                final d $data;
                final Ref.FloatRef $duration;
                final j $playable;
                long J$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C08491(Ref.FloatRef floatRef, j jVar, d dVar, Continuation<? super C08491> continuation) {
                    super(2, continuation);
                    this.$duration = floatRef;
                    this.$playable = jVar;
                    this.$data = dVar;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C08491 c08491 = new C08491(this.$duration, this.$playable, this.$data, continuation);
                    c08491.J$0 = ((Duration) obj).unbox-impl();
                    return c08491;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return m9303invokeVtjQ1oo(((Duration) obj).unbox-impl(), (Continuation) obj2);
                }

                /* JADX INFO: renamed from: invoke-VtjQ1oo, reason: not valid java name */
                public final Object m9303invokeVtjQ1oo(long j7, Continuation<? super Boolean> continuation) {
                    return create(Duration.box-impl(j7), continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    long j7 = this.J$0;
                    Ref.FloatRef floatRef = this.$duration;
                    if (floatRef.element <= 0.0f) {
                        floatRef.element = this.$playable.h() != null ? r0.longValue() : 0.0f;
                    }
                    return Boxing.boxBoolean(this.$duration.element > 0.0f && ((float) Duration.getInWholeMilliseconds-impl(j7)) / this.$duration.element >= this.$data.f97165k);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(d dVar, QuestionnaireService questionnaireService, Ref.BooleanRef booleanRef, MutableState<Boolean> mutableState, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$data = dVar;
                this.this$0 = questionnaireService;
                this.$needShow = booleanRef;
                this.$visible = mutableState;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$data, this.this$0, this.$needShow, this.$visible, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x00a5  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    r11 = r0
                    r0 = r7
                    int r0 = r0.label
                    r9 = r0
                    r0 = r9
                    if (r0 == 0) goto L30
                    r0 = r9
                    r1 = 1
                    if (r0 == r1) goto L29
                    r0 = r9
                    r1 = 2
                    if (r0 != r1) goto L1f
                    r0 = r8
                    kotlin.ResultKt.throwOnFailure(r0)
                    goto L9b
                L1f:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    r1 = r0
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r0
                L29:
                    r0 = r8
                    kotlin.ResultKt.throwOnFailure(r0)
                    goto L62
                L30:
                    r0 = r8
                    kotlin.ResultKt.throwOnFailure(r0)
                    r0 = r7
                    com.bilibili.ship.theseus.ugc.intro.questionaire.d r0 = r0.$data
                    boolean r0 = r0.f97163i
                    if (r0 == 0) goto Lb6
                    r0 = r7
                    com.bilibili.ship.theseus.ugc.intro.questionaire.QuestionnaireService r0 = r0.this$0
                    com.bilibili.ship.theseus.keel.player.h r0 = r0.f97142b
                    kotlinx.coroutines.flow.MutableStateFlow<com.bilibili.ship.theseus.keel.player.j> r0 = r0.f91111e
                    kotlinx.coroutines.flow.StateFlow r0 = kotlinx.coroutines.flow.FlowKt.asStateFlow(r0)
                    r8 = r0
                    r0 = r7
                    r1 = 1
                    r0.label = r1
                    r0 = r8
                    r1 = r7
                    java.lang.Object r0 = com.bilibili.ogv.infra.coroutine.b.a(r0, r1)
                    r10 = r0
                    r0 = r10
                    r8 = r0
                    r0 = r10
                    r1 = r11
                    if (r0 != r1) goto L62
                    r0 = r11
                    return r0
                L62:
                    r0 = r8
                    com.bilibili.ship.theseus.keel.player.j r0 = (com.bilibili.ship.theseus.keel.player.j) r0
                    r12 = r0
                    kotlin.jvm.internal.Ref$FloatRef r0 = new kotlin.jvm.internal.Ref$FloatRef
                    r1 = r0
                    r1.<init>()
                    r10 = r0
                    r0 = r12
                    kotlinx.coroutines.flow.Flow r0 = r0.J()
                    r8 = r0
                    com.bilibili.ship.theseus.ugc.intro.questionaire.QuestionnaireService$create$4$1$2$1 r0 = new com.bilibili.ship.theseus.ugc.intro.questionaire.QuestionnaireService$create$4$1$2$1
                    r1 = r0
                    r2 = r10
                    r3 = r12
                    r4 = r7
                    com.bilibili.ship.theseus.ugc.intro.questionaire.d r4 = r4.$data
                    r5 = 0
                    r1.<init>(r2, r3, r4, r5)
                    r10 = r0
                    r0 = r7
                    r1 = 2
                    r0.label = r1
                    r0 = r8
                    r1 = r10
                    r2 = r7
                    java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r0, r1, r2)
                    r1 = r11
                    if (r0 != r1) goto L9b
                    r0 = r11
                    return r0
                L9b:
                    r0 = r7
                    kotlin.jvm.internal.Ref$BooleanRef r0 = r0.$needShow
                    boolean r0 = r0.element
                    if (r0 != 0) goto La9
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                La9:
                    r0 = r7
                    androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r0.$visible
                    r1 = 1
                    java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
                    r0.setValue(r1)
                Lb6:
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.questionaire.QuestionnaireService$create$4.AnonymousClass1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.questionaire.QuestionnaireService$create$4$1$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/questionaire/QuestionnaireService$create$4$1$3.class */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final QuestionnaireService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(QuestionnaireService questionnaireService, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = questionnaireService;
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
                try {
                    if (i7 == 0) {
                        ResultKt.throwOnFailure(obj);
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
                    this.this$0.f97145e.f97166a = false;
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d dVar, QuestionnaireService questionnaireService, Ref.BooleanRef booleanRef, MutableState<Boolean> mutableState, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$data = dVar;
            this.this$0 = questionnaireService;
            this.$needShow = booleanRef;
            this.$visible = mutableState;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$data, this.this$0, this.$needShow, this.$visible, continuation);
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
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C08471(this.$data, this.this$0, this.$needShow, this.$visible, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$data, this.this$0, this.$needShow, this.$visible, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuestionnaireService$create$4(d dVar, QuestionnaireService questionnaireService, Ref.BooleanRef booleanRef, MutableState<Boolean> mutableState, Continuation<? super QuestionnaireService$create$4> continuation) {
        super(1, continuation);
        this.$data = dVar;
        this.this$0 = questionnaireService;
        this.$needShow = booleanRef;
        this.$visible = mutableState;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new QuestionnaireService$create$4(this.$data, this.this$0, this.$needShow, this.$visible, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$data, this.this$0, this.$needShow, this.$visible, null);
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(anonymousClass1, this) == coroutine_suspended) {
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
