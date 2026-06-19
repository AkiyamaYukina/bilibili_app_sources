package com.bilibili.ship.theseus.ugc.endpage;

import com.bilibili.playerbizcommonv2.utils.p;
import com.bilibili.ship.theseus.ugc.endpage.qoe.x;
import com.bilibili.ship.theseus.united.page.screenstate.c;
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
import kotlinx.coroutines.CoroutineStart;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.IFunctionWidgetServiceKt;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/UGCEndPageService$handleEndPage$5$1$1.class */
public final class UGCEndPageService$handleEndPage$5$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final IFunctionContainer.LayoutParams $layoutParams;
    final c.a $state;
    final Object $widget;
    private Object L$0;
    int label;
    final UGCEndPageService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.UGCEndPageService$handleEndPage$5$1$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/UGCEndPageService$handleEndPage$5$1$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final IFunctionContainer.LayoutParams $layoutParams;
        final Object $widget;
        int label;
        final UGCEndPageService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UGCEndPageService uGCEndPageService, Object obj, IFunctionContainer.LayoutParams layoutParams, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = uGCEndPageService;
            this.$widget = obj;
            this.$layoutParams = layoutParams;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$widget, this.$layoutParams, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                AbsFunctionWidgetService absFunctionWidgetService = this.this$0.f96479b;
                AbsFunctionWidget absFunctionWidget = (AbsFunctionWidget) this.$widget;
                IFunctionContainer.LayoutParams layoutParams = this.$layoutParams;
                this.label = 1;
                if (IFunctionWidgetServiceKt.retainFunctionWidget$default(absFunctionWidgetService, absFunctionWidget, layoutParams, (Function1) null, this, 4, (Object) null) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.UGCEndPageService$handleEndPage$5$1$1$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/UGCEndPageService$handleEndPage$5$1$1$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UGCEndPageService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(UGCEndPageService uGCEndPageService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = uGCEndPageService;
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
                UGCEndPageService uGCEndPageService = this.this$0;
                if (uGCEndPageService.f96490n.f97166a) {
                    BLog.i("UGCEndPageService$handleEndPage$5$1$1$2-invokeSuspend", "[theseus-ugc-UGCEndPageService$handleEndPage$5$1$1$2-invokeSuspend] questionnaire info already showing");
                    return Unit.INSTANCE;
                }
                this.label = 1;
                Object objC = uGCEndPageService.f96489m.c(this);
                obj = objC;
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                x xVar = this.this$0.f96488l;
                this.label = 2;
                if (xVar.d(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.UGCEndPageService$handleEndPage$5$1$1$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/UGCEndPageService$handleEndPage$5$1$1$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final c.a $state;
        int label;
        final UGCEndPageService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(c.a aVar, UGCEndPageService uGCEndPageService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$state = aVar;
            this.this$0 = uGCEndPageService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$state, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                if (p.d()) {
                    c.a aVar = this.$state;
                    if (!aVar.f102987a && aVar.f102988b) {
                        com.bilibili.ship.theseus.united.utils.d dVar = this.this$0.f96491o.f103384a;
                        this.label = 1;
                        if (dVar.a(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
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
    public UGCEndPageService$handleEndPage$5$1$1(UGCEndPageService uGCEndPageService, Object obj, IFunctionContainer.LayoutParams layoutParams, c.a aVar, Continuation<? super UGCEndPageService$handleEndPage$5$1$1> continuation) {
        super(2, continuation);
        this.this$0 = uGCEndPageService;
        this.$widget = obj;
        this.$layoutParams = layoutParams;
        this.$state = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UGCEndPageService$handleEndPage$5$1$1 uGCEndPageService$handleEndPage$5$1$1 = new UGCEndPageService$handleEndPage$5$1$1(this.this$0, this.$widget, this.$layoutParams, this.$state, continuation);
        uGCEndPageService$handleEndPage$5$1$1.L$0 = obj;
        return uGCEndPageService$handleEndPage$5$1$1;
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
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$widget, this.$layoutParams, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.$state, this.this$0, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
