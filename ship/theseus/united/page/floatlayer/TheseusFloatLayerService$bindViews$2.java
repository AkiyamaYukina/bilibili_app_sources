package com.bilibili.ship.theseus.united.page.floatlayer;

import android.widget.FrameLayout;
import com.bilibili.app.screen.adjust.widget.ScreenAdjustFloatLayerManager;
import com.bilibili.ogv.infra.widget.RatioLayout;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/TheseusFloatLayerService$bindViews$2.class */
final class TheseusFloatLayerService$bindViews$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final TheseusFloatLayerService.b $views;
    private Object L$0;
    int label;
    final TheseusFloatLayerService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService$bindViews$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/TheseusFloatLayerService$bindViews$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final TheseusFloatLayerService.b $views;
        int label;
        final TheseusFloatLayerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TheseusFloatLayerService theseusFloatLayerService, TheseusFloatLayerService.b bVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = theseusFloatLayerService;
            this.$views = bVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$views, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ScreenAdjustFloatLayerManager screenAdjustFloatLayerManager = this.this$0.f99657f;
                FrameLayout frameLayout = this.$views.f99671a;
                this.label = 1;
                if (screenAdjustFloatLayerManager.b(1, frameLayout, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService$bindViews$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/TheseusFloatLayerService$bindViews$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final TheseusFloatLayerService.b $views;
        int label;
        final TheseusFloatLayerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TheseusFloatLayerService theseusFloatLayerService, TheseusFloatLayerService.b bVar, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = theseusFloatLayerService;
            this.$views = bVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$views, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ScreenAdjustFloatLayerManager screenAdjustFloatLayerManager = this.this$0.f99657f;
                RatioLayout ratioLayout = this.$views.f99672b;
                this.label = 1;
                if (screenAdjustFloatLayerManager.b(2, ratioLayout, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService$bindViews$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/TheseusFloatLayerService$bindViews$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final TheseusFloatLayerService.b $views;
        int label;
        final TheseusFloatLayerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(TheseusFloatLayerService theseusFloatLayerService, TheseusFloatLayerService.b bVar, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = theseusFloatLayerService;
            this.$views = bVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$views, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ScreenAdjustFloatLayerManager screenAdjustFloatLayerManager = this.this$0.f99657f;
                FrameLayout frameLayout = this.$views.f99673c;
                this.label = 1;
                if (screenAdjustFloatLayerManager.b(3, frameLayout, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService$bindViews$2$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/TheseusFloatLayerService$bindViews$2$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final TheseusFloatLayerService.b $views;
        int label;
        final TheseusFloatLayerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(TheseusFloatLayerService theseusFloatLayerService, TheseusFloatLayerService.b bVar, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = theseusFloatLayerService;
            this.$views = bVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, this.$views, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ScreenAdjustFloatLayerManager screenAdjustFloatLayerManager = this.this$0.f99657f;
                FrameLayout frameLayout = this.$views.f99674d;
                this.label = 1;
                if (screenAdjustFloatLayerManager.b(4, frameLayout, this) == coroutine_suspended) {
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
    public TheseusFloatLayerService$bindViews$2(TheseusFloatLayerService theseusFloatLayerService, TheseusFloatLayerService.b bVar, Continuation<? super TheseusFloatLayerService$bindViews$2> continuation) {
        super(2, continuation);
        this.this$0 = theseusFloatLayerService;
        this.$views = bVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TheseusFloatLayerService$bindViews$2 theseusFloatLayerService$bindViews$2 = new TheseusFloatLayerService$bindViews$2(this.this$0, this.$views, continuation);
        theseusFloatLayerService$bindViews$2.L$0 = obj;
        return theseusFloatLayerService$bindViews$2;
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
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$views, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$views, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, this.$views, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.this$0, this.$views, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
