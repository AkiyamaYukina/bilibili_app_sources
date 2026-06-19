package com.bilibili.ship.theseus.united.page.intro.module.guidestrip;

import com.bilibili.ship.theseus.united.page.intro.module.guidestrip.f;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/guidestrip/GuideStripUIComponentService$create$1.class */
public final class GuideStripUIComponentService$create$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final GuideStripVo $guideBar;
    final f.a $vm;
    int label;
    final GuideStripUIComponentService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.guidestrip.GuideStripUIComponentService$create$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/guidestrip/GuideStripUIComponentService$create$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final GuideStripVo $guideBar;
        final f.a $vm;
        private Object L$0;
        int label;
        final GuideStripUIComponentService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.guidestrip.GuideStripUIComponentService$create$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/guidestrip/GuideStripUIComponentService$create$1$1$1.class */
        public static final class C09971 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final GuideStripVo $guideBar;
            final f.a $vm;
            int label;
            final GuideStripUIComponentService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09971(GuideStripUIComponentService guideStripUIComponentService, GuideStripVo guideStripVo, f.a aVar, Continuation<? super C09971> continuation) {
                super(2, continuation);
                this.this$0 = guideStripUIComponentService;
                this.$guideBar = guideStripVo;
                this.$vm = aVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C09971(this.this$0, this.$guideBar, this.$vm, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x00b4  */
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
                    if (r0 == 0) goto L24
                    r0 = r9
                    r1 = 1
                    if (r0 != r1) goto L1a
                    r0 = r8
                    kotlin.ResultKt.throwOnFailure(r0)
                    goto Lc1
                L1a:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    r1 = r0
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r0
                L24:
                    r0 = r8
                    kotlin.ResultKt.throwOnFailure(r0)
                    r0 = r7
                    com.bilibili.ship.theseus.united.page.intro.module.guidestrip.GuideStripUIComponentService r0 = r0.this$0
                    r12 = r0
                    r0 = r7
                    com.bilibili.ship.theseus.united.page.intro.module.guidestrip.GuideStripVo r0 = r0.$guideBar
                    r13 = r0
                    r0 = r7
                    com.bilibili.ship.theseus.united.page.intro.module.guidestrip.f$a r0 = r0.$vm
                    r15 = r0
                    r0 = r7
                    r1 = 1
                    r0.label = r1
                    r0 = r12
                    java.lang.Class r0 = r0.getClass()
                    r0 = r13
                    com.bilibili.ship.theseus.united.page.intro.module.guidestrip.HonorType r0 = r0.f100088k
                    com.bilibili.ship.theseus.united.page.intro.module.guidestrip.HonorType r1 = com.bilibili.ship.theseus.united.page.intro.module.guidestrip.HonorType.TYPE_HONOR_PROFESSION
                    if (r0 == r1) goto L57
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    r8 = r0
                    goto Lb8
                L57:
                    r0 = r13
                    com.bilibili.ship.theseus.united.page.intro.module.guidestrip.ProfessionHonorExtend r0 = r0.f100092o
                    r14 = r0
                    r0 = r14
                    if (r0 == 0) goto Lb4
                    r0 = r14
                    int r0 = r0.f100094a
                    r9 = r0
                    r0 = r12
                    com.bilibili.ship.theseus.united.page.intro.module.guidestrip.e r0 = r0.f100074f
                    r8 = r0
                    r0 = r8
                    kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> r0 = r0.f100117a
                    r1 = r9
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    r0.setValue(r1)
                    r0 = r14
                    boolean r0 = r0.f100095b
                    r10 = r0
                    r0 = r8
                    kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> r0 = r0.f100119c
                    r1 = r10
                    java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                    r0.setValue(r1)
                    com.bilibili.ship.theseus.united.page.intro.module.guidestrip.GuideStripUIComponentService$collectProfessionalState$2$1 r0 = new com.bilibili.ship.theseus.united.page.intro.module.guidestrip.GuideStripUIComponentService$collectProfessionalState$2$1
                    r1 = r0
                    r2 = r15
                    r3 = r12
                    r4 = r13
                    r5 = 0
                    r1.<init>(r2, r3, r4, r5)
                    r12 = r0
                    r0 = r8
                    kotlinx.coroutines.flow.StateFlow<java.lang.Integer> r0 = r0.f100118b
                    r1 = r12
                    r2 = r7
                    java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.collectLatest(r0, r1, r2)
                    r8 = r0
                    r0 = r8
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    if (r0 != r1) goto Lb4
                    goto Lb8
                Lb4:
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    r8 = r0
                Lb8:
                    r0 = r8
                    r1 = r11
                    if (r0 != r1) goto Lc1
                    r0 = r11
                    return r0
                Lc1:
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.guidestrip.GuideStripUIComponentService$create$1.AnonymousClass1.C09971.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.guidestrip.GuideStripUIComponentService$create$1$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/guidestrip/GuideStripUIComponentService$create$1$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final GuideStripVo $guideBar;
            final f.a $vm;
            int label;
            final GuideStripUIComponentService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(GuideStripUIComponentService guideStripUIComponentService, GuideStripVo guideStripVo, f.a aVar, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = guideStripUIComponentService;
                this.$guideBar = guideStripVo;
                this.$vm = aVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$guideBar, this.$vm, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object objCollectLatest;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    GuideStripUIComponentService guideStripUIComponentService = this.this$0;
                    GuideStripVo guideStripVo = this.$guideBar;
                    f.a aVar = this.$vm;
                    this.label = 1;
                    guideStripUIComponentService.getClass();
                    if (guideStripVo.f100088k == HonorType.TYPE_HONOR_PROFESSION) {
                        objCollectLatest = FlowKt.collectLatest(guideStripUIComponentService.f100074f.f100120d, new GuideStripUIComponentService$updateEndIconVisibility$2(aVar, null), this);
                        if (objCollectLatest != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objCollectLatest = Unit.INSTANCE;
                        }
                    } else {
                        boolean z6 = !StringsKt.isBlank(guideStripVo.f100091n);
                        if (z6 != aVar.f100139r) {
                            aVar.f100139r = z6;
                            aVar.notifyPropertyChanged(186);
                        }
                        objCollectLatest = Unit.INSTANCE;
                    }
                    if (objCollectLatest == coroutine_suspended) {
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
        public AnonymousClass1(GuideStripUIComponentService guideStripUIComponentService, GuideStripVo guideStripVo, f.a aVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = guideStripUIComponentService;
            this.$guideBar = guideStripVo;
            this.$vm = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$guideBar, this.$vm, continuation);
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
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C09971(this.this$0, this.$guideBar, this.$vm, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$guideBar, this.$vm, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuideStripUIComponentService$create$1(GuideStripUIComponentService guideStripUIComponentService, GuideStripVo guideStripVo, f.a aVar, Continuation<? super GuideStripUIComponentService$create$1> continuation) {
        super(1, continuation);
        this.this$0 = guideStripUIComponentService;
        this.$guideBar = guideStripVo;
        this.$vm = aVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new GuideStripUIComponentService$create$1(this.this$0, this.$guideBar, this.$vm, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$guideBar, this.$vm, null);
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
