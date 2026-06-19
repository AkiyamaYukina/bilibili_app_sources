package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import com.bilibili.app.gemini.ui.UIComponent;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/CheesePrimaryService$createPrimaryComponent$1$1$1.class */
final class CheesePrimaryService$createPrimaryComponent$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final L $uiComponent;
    private Object L$0;
    int label;
    final CheesePrimaryService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.CheesePrimaryService$createPrimaryComponent$1$1$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/CheesePrimaryService$createPrimaryComponent$1$1$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final L $uiComponent;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final CheesePrimaryService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheesePrimaryService cheesePrimaryService, L l7, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cheesePrimaryService;
            this.$uiComponent = l7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invokeSuspend$lambda$0$0$0() {
            return 3;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$uiComponent, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [com.bilibili.ship.theseus.united.page.screenstate.c] */
        /* JADX WARN: Type inference failed for: r0v43 */
        /* JADX WARN: Type inference failed for: r0v46 */
        /* JADX WARN: Type inference failed for: r0v49 */
        /* JADX WARN: Type inference failed for: r0v51, types: [com.bilibili.ship.theseus.united.page.screenstate.c] */
        /* JADX WARN: Type inference failed for: r11v1 */
        /* JADX WARN: Type inference failed for: r11v4 */
        /* JADX WARN: Type inference failed for: r11v5 */
        /* JADX WARN: Type inference failed for: r11v6 */
        /* JADX WARN: Type inference failed for: r11v7 */
        /* JADX WARN: Type inference failed for: r11v8 */
        /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v1 */
        /* JADX WARN: Type inference failed for: r7v2, types: [com.bilibili.ship.theseus.united.page.screenstate.c, java.lang.Object] */
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str;
            String str2;
            ?? r11;
            com.bilibili.ship.theseus.united.page.playingarea.g gVar;
            String str3;
            ?? r112;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) this.L$3;
                    gVar = (com.bilibili.ship.theseus.united.page.playingarea.g) this.L$2;
                    str2 = (String) this.L$1;
                    r11 = (com.bilibili.ship.theseus.united.page.screenstate.c) this.L$0;
                    try {
                        ResultKt.throwOnFailure((Object) obj);
                        str3 = str;
                        r112 = r11;
                        gVar.j(str3);
                        r112.j(str2, false);
                        return Unit.INSTANCE;
                    } catch (Throwable th) {
                        th = th;
                        gVar.j(str);
                        throw th;
                    }
                }
                ResultKt.throwOnFailure((Object) obj);
                CheesePrimaryService cheesePrimaryService = this.this$0;
                obj = cheesePrimaryService.f89600m;
                UIComponent<?> uIComponent = this.$uiComponent;
                obj.j("CheeseRelatedCoursesFloatLayerComponent", true);
                try {
                    com.bilibili.ship.theseus.united.page.playingarea.g gVar2 = cheesePrimaryService.f89595g;
                    gVar2.f("CheeseRelatedCoursesFloatLayerComponent");
                    try {
                        TheseusFloatLayerService theseusFloatLayerService = cheesePrimaryService.f89594f;
                        TheseusFloatLayerService.a aVar = new TheseusFloatLayerService.a(0, 0, new C6103y(), 12);
                        this.L$0 = obj;
                        this.L$1 = "CheeseRelatedCoursesFloatLayerComponent";
                        this.L$2 = gVar2;
                        this.L$3 = "CheeseRelatedCoursesFloatLayerComponent";
                        this.label = 1;
                        if (theseusFloatLayerService.e(uIComponent, aVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str3 = "CheeseRelatedCoursesFloatLayerComponent";
                        str2 = "CheeseRelatedCoursesFloatLayerComponent";
                        r112 = obj;
                        gVar = gVar2;
                        gVar.j(str3);
                        r112.j(str2, false);
                        return Unit.INSTANCE;
                    } catch (Throwable th2) {
                        th = th2;
                        str = "CheeseRelatedCoursesFloatLayerComponent";
                        str2 = "CheeseRelatedCoursesFloatLayerComponent";
                        r11 = obj;
                        gVar = gVar2;
                        gVar.j(str);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obj.j("CheeseRelatedCoursesFloatLayerComponent", false);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.primary.CheesePrimaryService$createPrimaryComponent$1$1$1$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/CheesePrimaryService$createPrimaryComponent$1$1$1$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheesePrimaryService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CheesePrimaryService cheesePrimaryService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = cheesePrimaryService;
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
                M m7 = this.this$0.f89599l;
                this.label = 1;
                if (m7.a(this) == coroutine_suspended) {
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
    public CheesePrimaryService$createPrimaryComponent$1$1$1(CheesePrimaryService cheesePrimaryService, L l7, Continuation<? super CheesePrimaryService$createPrimaryComponent$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = cheesePrimaryService;
        this.$uiComponent = l7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CheesePrimaryService$createPrimaryComponent$1$1$1 cheesePrimaryService$createPrimaryComponent$1$1$1 = new CheesePrimaryService$createPrimaryComponent$1$1$1(this.this$0, this.$uiComponent, continuation);
        cheesePrimaryService$createPrimaryComponent$1$1$1.L$0 = obj;
        return cheesePrimaryService$createPrimaryComponent$1$1$1;
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
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$uiComponent, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
