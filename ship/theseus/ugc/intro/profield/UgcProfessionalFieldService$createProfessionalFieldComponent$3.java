package com.bilibili.ship.theseus.ugc.intro.profield;

import com.bilibili.app.comm.bh.x5.b;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.ugc.intro.profield.UgcProfessionalFieldComponent;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.utils.q;
import java.util.LinkedHashMap;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/profield/UgcProfessionalFieldService$createProfessionalFieldComponent$3.class */
final class UgcProfessionalFieldService$createProfessionalFieldComponent$3 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final Ref.ObjectRef<UgcProfessionalFieldComponent> $professionalFieldComponent;
    final UgcProfessionalFieldInfo $professionalFieldInfo;
    int label;
    final UgcProfessionalFieldService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.profield.UgcProfessionalFieldService$createProfessionalFieldComponent$3$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/profield/UgcProfessionalFieldService$createProfessionalFieldComponent$3$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Ref.ObjectRef<UgcProfessionalFieldComponent> $professionalFieldComponent;
        final UgcProfessionalFieldInfo $professionalFieldInfo;
        private Object L$0;
        int label;
        final UgcProfessionalFieldService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.profield.UgcProfessionalFieldService$createProfessionalFieldComponent$3$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/profield/UgcProfessionalFieldService$createProfessionalFieldComponent$3$1$1.class */
        public static final class C08451 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<UgcProfessionalFieldComponent> $professionalFieldComponent;
            final UgcProfessionalFieldInfo $professionalFieldInfo;
            int label;
            final UgcProfessionalFieldService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.profield.UgcProfessionalFieldService$createProfessionalFieldComponent$3$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/profield/UgcProfessionalFieldService$createProfessionalFieldComponent$3$1$1$1.class */
            public static final class C08461 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
                final Ref.ObjectRef<UgcProfessionalFieldComponent> $professionalFieldComponent;
                final UgcProfessionalFieldInfo $professionalFieldInfo;
                boolean Z$0;
                int label;
                final UgcProfessionalFieldService this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C08461(UgcProfessionalFieldService ugcProfessionalFieldService, UgcProfessionalFieldInfo ugcProfessionalFieldInfo, Ref.ObjectRef<UgcProfessionalFieldComponent> objectRef, Continuation<? super C08461> continuation) {
                    super(2, continuation);
                    this.this$0 = ugcProfessionalFieldService;
                    this.$professionalFieldInfo = ugcProfessionalFieldInfo;
                    this.$professionalFieldComponent = objectRef;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C08461 c08461 = new C08461(this.this$0, this.$professionalFieldInfo, this.$professionalFieldComponent, continuation);
                    c08461.Z$0 = ((Boolean) obj).booleanValue();
                    return c08461;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
                }

                public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                    return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    boolean z6 = this.Z$0;
                    defpackage.a.b("[theseus-ugc-UgcProfessionalFieldService$createProfessionalFieldComponent$3$1$1$1-invokeSuspend] ", b.a("ProfessionalFieldComponent likeFlow -> ", z6), "UgcProfessionalFieldService$createProfessionalFieldComponent$3$1$1$1-invokeSuspend");
                    if (!z6) {
                        UgcProfessionalFieldService ugcProfessionalFieldService = this.this$0;
                        UgcProfessionalFieldService.a(ugcProfessionalFieldService, ugcProfessionalFieldService.b(this.$professionalFieldInfo), (UIComponent) this.$professionalFieldComponent.element);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08451(UgcProfessionalFieldService ugcProfessionalFieldService, UgcProfessionalFieldInfo ugcProfessionalFieldInfo, Ref.ObjectRef<UgcProfessionalFieldComponent> objectRef, Continuation<? super C08451> continuation) {
                super(2, continuation);
                this.this$0 = ugcProfessionalFieldService;
                this.$professionalFieldInfo = ugcProfessionalFieldInfo;
                this.$professionalFieldComponent = objectRef;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C08451(this.this$0, this.$professionalFieldInfo, this.$professionalFieldComponent, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    UgcProfessionalFieldService ugcProfessionalFieldService = this.this$0;
                    StateFlow<Boolean> stateFlow = ugcProfessionalFieldService.f97129b.f103999g;
                    C08461 c08461 = new C08461(ugcProfessionalFieldService, this.$professionalFieldInfo, this.$professionalFieldComponent, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow, c08461, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.profield.UgcProfessionalFieldService$createProfessionalFieldComponent$3$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/profield/UgcProfessionalFieldService$createProfessionalFieldComponent$3$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<UgcProfessionalFieldComponent> $professionalFieldComponent;
            int label;
            final UgcProfessionalFieldService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.profield.UgcProfessionalFieldService$createProfessionalFieldComponent$3$1$2$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/profield/UgcProfessionalFieldService$createProfessionalFieldComponent$3$1$2$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final UgcProfessionalFieldService f97136a;

                public a(UgcProfessionalFieldService ugcProfessionalFieldService) {
                    this.f97136a = ugcProfessionalFieldService;
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
                    Object obj2;
                    UgcProfessionalFieldComponent.a aVar = (UgcProfessionalFieldComponent.a) obj;
                    defpackage.a.b("[theseus-ugc-UgcProfessionalFieldService$createProfessionalFieldComponent$3$1$2$1-emit] ", "sideEffect -> " + aVar, "UgcProfessionalFieldService$createProfessionalFieldComponent$3$1$2$1-emit");
                    boolean z6 = aVar instanceof UgcProfessionalFieldComponent.a.AbstractC0841a;
                    UgcProfessionalFieldService ugcProfessionalFieldService = this.f97136a;
                    if (z6) {
                        UgcProfessionalFieldComponent.a.AbstractC0841a abstractC0841a = (UgcProfessionalFieldComponent.a.AbstractC0841a) aVar;
                        ugcProfessionalFieldService.getClass();
                        if (Intrinsics.areEqual(abstractC0841a, UgcProfessionalFieldComponent.a.AbstractC0841a.b.f97119a)) {
                            q.b(2131841402);
                            obj2 = "normal";
                        } else if (Intrinsics.areEqual(abstractC0841a, UgcProfessionalFieldComponent.a.AbstractC0841a.c.f97120a)) {
                            q.b(2131841402);
                            BuildersKt.launch$default(ugcProfessionalFieldService.f97128a, (CoroutineContext) null, (CoroutineStart) null, new UgcProfessionalFieldService$handleClickEvent$type$1(ugcProfessionalFieldService, null), 3, (Object) null);
                            obj2 = "professional";
                        } else {
                            if (!Intrinsics.areEqual(abstractC0841a, UgcProfessionalFieldComponent.a.AbstractC0841a.C0842a.f97118a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            obj2 = "delete";
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        PageReportService pageReportService = ugcProfessionalFieldService.f97131d;
                        linkedHashMap.putAll(pageReportService.a(null));
                        linkedHashMap.put("action_type", obj2);
                        PageReportService.g(pageReportService, "united.player-video-detail.professional-banner.conform.click", linkedHashMap, 4);
                    } else {
                        if (!Intrinsics.areEqual(aVar, UgcProfessionalFieldComponent.a.b.f97121a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ugcProfessionalFieldService.f97135i = true;
                        BuildersKt.launch$default(ugcProfessionalFieldService.f97128a, (CoroutineContext) null, (CoroutineStart) null, new UgcProfessionalFieldService$reportExposureEvent$1(ugcProfessionalFieldService, null), 3, (Object) null);
                        PageReportService pageReportService2 = ugcProfessionalFieldService.f97131d;
                        PageReportService.i(pageReportService2, "united.player-video-detail.professional-banner.0.show", pageReportService2.a(null), 4);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(Ref.ObjectRef<UgcProfessionalFieldComponent> objectRef, UgcProfessionalFieldService ugcProfessionalFieldService, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$professionalFieldComponent = objectRef;
                this.this$0 = ugcProfessionalFieldService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$professionalFieldComponent, this.this$0, continuation);
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
                    SharedFlow<UgcProfessionalFieldComponent.a> sharedFlow = ((UgcProfessionalFieldComponent) this.$professionalFieldComponent.element).f97116i;
                    a aVar = new a(this.this$0);
                    this.label = 1;
                    if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
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
        public AnonymousClass1(UgcProfessionalFieldService ugcProfessionalFieldService, UgcProfessionalFieldInfo ugcProfessionalFieldInfo, Ref.ObjectRef<UgcProfessionalFieldComponent> objectRef, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ugcProfessionalFieldService;
            this.$professionalFieldInfo = ugcProfessionalFieldInfo;
            this.$professionalFieldComponent = objectRef;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$professionalFieldInfo, this.$professionalFieldComponent, continuation);
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
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C08451(this.this$0, this.$professionalFieldInfo, this.$professionalFieldComponent, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$professionalFieldComponent, this.this$0, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcProfessionalFieldService$createProfessionalFieldComponent$3(UgcProfessionalFieldService ugcProfessionalFieldService, UgcProfessionalFieldInfo ugcProfessionalFieldInfo, Ref.ObjectRef<UgcProfessionalFieldComponent> objectRef, Continuation<? super UgcProfessionalFieldService$createProfessionalFieldComponent$3> continuation) {
        super(1, continuation);
        this.this$0 = ugcProfessionalFieldService;
        this.$professionalFieldInfo = ugcProfessionalFieldInfo;
        this.$professionalFieldComponent = objectRef;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UgcProfessionalFieldService$createProfessionalFieldComponent$3(this.this$0, this.$professionalFieldInfo, this.$professionalFieldComponent, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$professionalFieldInfo, this.$professionalFieldComponent, null);
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
