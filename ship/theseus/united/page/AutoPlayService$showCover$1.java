package com.bilibili.ship.theseus.united.page;

import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.playingarea.i;
import hv0.C7509c;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/AutoPlayService$showCover$1.class */
final class AutoPlayService$showCover$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final AutoPlayService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.AutoPlayService$showCover$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/AutoPlayService$showCover$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Function0<Unit> $dismiss;
        int label;
        final AutoPlayService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.AutoPlayService$showCover$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/AutoPlayService$showCover$1$1$1.class */
        public static final class C09331 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
            boolean Z$0;
            int label;

            public C09331(Continuation<? super C09331> continuation) {
                super(2, continuation);
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C09331 c09331 = new C09331(continuation);
                c09331.Z$0 = ((Boolean) obj).booleanValue();
                return c09331;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Boolean>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Boolean> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(this.Z$0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AutoPlayService autoPlayService, Function0<Unit> function0, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = autoPlayService;
            this.$dismiss = function0;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$dismiss, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow<Boolean> mutableStateFlow = this.this$0.f98787a.f91107a.f79284a;
                C09331 c09331 = new C09331(null);
                this.label = 1;
                if (FlowKt.first(mutableStateFlow, c09331, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.$dismiss.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoPlayService$showCover$1(AutoPlayService autoPlayService, Continuation<? super AutoPlayService$showCover$1> continuation) {
        super(2, continuation);
        this.this$0 = autoPlayService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(CoroutineScope coroutineScope) {
        CoroutineScopeKt.cancel$default(coroutineScope, (CancellationException) null, 1, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1$0$0(AutoPlayService autoPlayService, Function0 function0) {
        autoPlayService.f98787a.p();
        function0.invoke();
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AutoPlayService$showCover$1 autoPlayService$showCover$1 = new AutoPlayService$showCover$1(this.this$0, continuation);
        autoPlayService$showCover$1.L$0 = obj;
        return autoPlayService$showCover$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [com.bilibili.ship.theseus.united.page.a, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.bilibili.ship.theseus.united.page.playingarea.i] */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v64, types: [com.bilibili.ship.theseus.united.page.playingarea.i] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3, types: [com.bilibili.ship.theseus.united.page.playingarea.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AutoPlayService autoPlayService;
        com.bilibili.ship.theseus.united.page.screenstate.c cVar;
        AutoPlayService autoPlayService2;
        ?? r14;
        ?? r142;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                autoPlayService = (AutoPlayService) this.L$3;
                cVar = (com.bilibili.ship.theseus.united.page.screenstate.c) this.L$2;
                autoPlayService2 = (AutoPlayService) this.L$1;
                i iVar = (i) this.L$0;
                try {
                    ResultKt.throwOnFailure((Object) obj);
                    r142 = iVar;
                    cVar.b(autoPlayService, false);
                    Unit unit = Unit.INSTANCE;
                    r142.c(autoPlayService2);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    th = th;
                    r14 = iVar;
                    cVar.b(autoPlayService, false);
                    throw th;
                }
            }
            ResultKt.throwOnFailure((Object) obj);
            final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            ?? r02 = new Function0(coroutineScope) { // from class: com.bilibili.ship.theseus.united.page.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final CoroutineScope f98823a;

                {
                    this.f98823a = coroutineScope;
                }

                public final Object invoke() {
                    return AutoPlayService$showCover$1.invokeSuspend$lambda$0(this.f98823a);
                }
            };
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, r02, null), 3, (Object) null);
            AutoPlayService autoPlayService3 = this.this$0;
            obj = autoPlayService3.f98793g;
            obj.a(autoPlayService3);
            try {
                com.bilibili.ship.theseus.united.page.screenstate.c cVar2 = autoPlayService3.f98789c;
                cVar2.b(autoPlayService3, true);
                try {
                    UIComponent<?> c7509c = new C7509c(autoPlayService3.f98790d.f121510a, autoPlayService3.f98791e.h(), new b(autoPlayService3, r02));
                    TheseusFloatLayerService theseusFloatLayerService = autoPlayService3.f98792f;
                    this.L$0 = obj;
                    this.L$1 = autoPlayService3;
                    this.L$2 = cVar2;
                    this.L$3 = autoPlayService3;
                    this.label = 1;
                    if (theseusFloatLayerService.i(c7509c, null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    cVar = cVar2;
                    r142 = obj;
                    autoPlayService2 = autoPlayService3;
                    autoPlayService = autoPlayService3;
                    cVar.b(autoPlayService, false);
                    Unit unit2 = Unit.INSTANCE;
                    r142.c(autoPlayService2);
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    th = th2;
                    autoPlayService = autoPlayService3;
                    cVar = cVar2;
                    autoPlayService2 = autoPlayService3;
                    r14 = obj;
                    cVar.b(autoPlayService, false);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                obj.c(autoPlayService3);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
