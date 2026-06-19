package com.bilibili.ship.theseus.ugc.intro.profield;

import J3.C2348i0;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.ship.theseus.ugc.intro.b;
import com.bilibili.ship.theseus.ugc.intro.profield.UgcProfessionalFieldComponent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/profield/UgcProfessionalFieldService$create$1.class */
public final class UgcProfessionalFieldService$create$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final b $placeHolder;
    final UgcProfessionalFieldInfo $professionalFieldInfo;
    int label;
    final UgcProfessionalFieldService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.profield.UgcProfessionalFieldService$create$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/profield/UgcProfessionalFieldService$create$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        final b $placeHolder;
        final UgcProfessionalFieldInfo $professionalFieldInfo;
        boolean Z$0;
        int label;
        final UgcProfessionalFieldService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.profield.UgcProfessionalFieldService$create$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/profield/UgcProfessionalFieldService$create$1$1$1.class */
        public static final class C08441 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final b $placeHolder;
            final UgcProfessionalFieldInfo $professionalFieldInfo;
            int label;
            final UgcProfessionalFieldService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08441(UgcProfessionalFieldService ugcProfessionalFieldService, UgcProfessionalFieldInfo ugcProfessionalFieldInfo, b bVar, Continuation<? super C08441> continuation) {
                super(2, continuation);
                this.this$0 = ugcProfessionalFieldService;
                this.$professionalFieldInfo = ugcProfessionalFieldInfo;
                this.$placeHolder = bVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C08441(this.this$0, this.$professionalFieldInfo, this.$placeHolder, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference failed for: r4v2, types: [com.bilibili.ship.theseus.ugc.intro.profield.a] */
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final UgcProfessionalFieldService ugcProfessionalFieldService = this.this$0;
                final UgcProfessionalFieldInfo ugcProfessionalFieldInfo = this.$professionalFieldInfo;
                ugcProfessionalFieldService.getClass();
                BLog.i("UgcProfessionalFieldService-createProfessionalFieldComponent", "[theseus-ugc-UgcProfessionalFieldService-createProfessionalFieldComponent] show professional field component.");
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                UgcProfessionalFieldComponent ugcProfessionalFieldComponent = new UgcProfessionalFieldComponent(new UgcProfessionalFieldComponent.b(ugcProfessionalFieldInfo.f97125a, ugcProfessionalFieldInfo.f97126b, ugcProfessionalFieldInfo.f97127c), ugcProfessionalFieldService.f97134g.f100020a, new Function0(ugcProfessionalFieldService, ugcProfessionalFieldInfo, objectRef) { // from class: com.bilibili.ship.theseus.ugc.intro.profield.a

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final UgcProfessionalFieldService f97137a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final UgcProfessionalFieldInfo f97138b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final Ref.ObjectRef f97139c;

                    {
                        this.f97137a = ugcProfessionalFieldService;
                        this.f97138b = ugcProfessionalFieldInfo;
                        this.f97139c = objectRef;
                    }

                    public final Object invoke() {
                        UgcProfessionalFieldService ugcProfessionalFieldService2 = this.f97137a;
                        BuildersKt.launch$default(ugcProfessionalFieldService2.f97128a, (CoroutineContext) null, (CoroutineStart) null, new UgcProfessionalFieldService$createProfessionalFieldComponent$1$1(ugcProfessionalFieldService2, this.f97138b, this.f97139c, null), 3, (Object) null);
                        return Unit.INSTANCE;
                    }
                }, new C2348i0(11));
                objectRef.element = ugcProfessionalFieldComponent;
                UgcProfessionalFieldService.a(ugcProfessionalFieldService, new RunningUIComponent(ugcProfessionalFieldComponent, 0, new UgcProfessionalFieldService$createProfessionalFieldComponent$3(ugcProfessionalFieldService, ugcProfessionalFieldInfo, objectRef, null), 2), this.$placeHolder);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UgcProfessionalFieldService ugcProfessionalFieldService, UgcProfessionalFieldInfo ugcProfessionalFieldInfo, b bVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ugcProfessionalFieldService;
            this.$professionalFieldInfo = ugcProfessionalFieldInfo;
            this.$placeHolder = bVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$professionalFieldInfo, this.$placeHolder, continuation);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
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
            defpackage.a.b("[theseus-ugc-UgcProfessionalFieldService$create$1$1-invokeSuspend] ", com.bilibili.app.comm.bh.x5.b.a("PlaceholderComponent likeFlow -> ", z6), "UgcProfessionalFieldService$create$1$1-invokeSuspend");
            if (z6) {
                UgcProfessionalFieldService ugcProfessionalFieldService = this.this$0;
                if (!ugcProfessionalFieldService.h && !ugcProfessionalFieldService.f97135i) {
                    BuildersKt.launch$default(ugcProfessionalFieldService.f97128a, (CoroutineContext) null, (CoroutineStart) null, new C08441(ugcProfessionalFieldService, this.$professionalFieldInfo, this.$placeHolder, null), 3, (Object) null);
                }
            }
            this.this$0.h = z6;
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcProfessionalFieldService$create$1(UgcProfessionalFieldService ugcProfessionalFieldService, UgcProfessionalFieldInfo ugcProfessionalFieldInfo, b bVar, Continuation<? super UgcProfessionalFieldService$create$1> continuation) {
        super(1, continuation);
        this.this$0 = ugcProfessionalFieldService;
        this.$professionalFieldInfo = ugcProfessionalFieldInfo;
        this.$placeHolder = bVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UgcProfessionalFieldService$create$1(this.this$0, this.$professionalFieldInfo, this.$placeHolder, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            UgcProfessionalFieldService ugcProfessionalFieldService = this.this$0;
            StateFlow<Boolean> stateFlow = ugcProfessionalFieldService.f97129b.f103999g;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(ugcProfessionalFieldService, this.$professionalFieldInfo, this.$placeHolder, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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
