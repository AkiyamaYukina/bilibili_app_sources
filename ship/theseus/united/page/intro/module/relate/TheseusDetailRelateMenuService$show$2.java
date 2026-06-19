package com.bilibili.ship.theseus.united.page.intro.module.relate;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.screen.adjust.widget.PopupBgColor;
import com.bilibili.app.screen.adjust.widget.ScreenAdjustMenuKt;
import com.bilibili.app.screen.adjust.widget.ScreenAdjustPopupDialog;
import com.bilibili.app.screen.adjust.widget.ScreenAdjustPopupDialogKt;
import com.bilibili.lib.ui.menu.BottomDialogMenu;
import java.util.ArrayList;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/TheseusDetailRelateMenuService$show$2.class */
final class TheseusDetailRelateMenuService$show$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Rect $anchorRect;
    final Context $context;
    private Object L$0;
    int label;
    final K0 this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.TheseusDetailRelateMenuService$show$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/TheseusDetailRelateMenuService$show$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final BottomDialogMenu $dialog;
        final WindowSizeClass $initialWindowSize;
        int label;
        final K0 this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.TheseusDetailRelateMenuService$show$2$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/TheseusDetailRelateMenuService$show$2$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final WindowSizeClass f101065a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BottomDialogMenu f101066b;

            public a(WindowSizeClass windowSizeClass, BottomDialogMenu bottomDialogMenu) {
                this.f101065a = windowSizeClass;
                this.f101066b = bottomDialogMenu;
            }

            public final Object emit(Object obj, Continuation continuation) {
                if (!Intrinsics.areEqual(this.f101065a, (WindowSizeClass) obj)) {
                    BottomDialogMenu bottomDialogMenu = this.f101066b;
                    if (bottomDialogMenu.isShowing()) {
                        bottomDialogMenu.dismiss();
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(K0 k02, WindowSizeClass windowSizeClass, BottomDialogMenu bottomDialogMenu, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = k02;
            this.$initialWindowSize = windowSizeClass;
            this.$dialog = bottomDialogMenu;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$initialWindowSize, this.$dialog, continuation);
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
                StateFlow<WindowSizeClass> stateFlow = this.this$0.f101022b.f102939c;
                a aVar = new a(this.$initialWindowSize, this.$dialog);
                this.label = 1;
                if (stateFlow.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.TheseusDetailRelateMenuService$show$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/TheseusDetailRelateMenuService$show$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final WindowSizeClass $initialWindowSize;
        int label;
        final K0 this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.TheseusDetailRelateMenuService$show$2$3$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/TheseusDetailRelateMenuService$show$2$3$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final WindowSizeClass f101067a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final K0 f101068b;

            public a(WindowSizeClass windowSizeClass, K0 k02) {
                this.f101067a = windowSizeClass;
                this.f101068b = k02;
            }

            public final Object emit(Object obj, Continuation continuation) {
                if (!Intrinsics.areEqual(this.f101067a, (WindowSizeClass) obj)) {
                    this.f101068b.f101025e.setValue(Boxing.boxBoolean(true));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(K0 k02, WindowSizeClass windowSizeClass, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = k02;
            this.$initialWindowSize = windowSizeClass;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$initialWindowSize, continuation);
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
                K0 k02 = this.this$0;
                StateFlow<WindowSizeClass> stateFlow = k02.f101022b.f102939c;
                a aVar = new a(this.$initialWindowSize, k02);
                this.label = 1;
                if (stateFlow.collect(aVar, this) == coroutine_suspended) {
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
    public TheseusDetailRelateMenuService$show$2(K0 k02, Context context, Rect rect, Continuation<? super TheseusDetailRelateMenuService$show$2> continuation) {
        super(2, continuation);
        this.this$0 = k02;
        this.$context = context;
        this.$anchorRect = rect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit invokeSuspend$lambda$1(ArrayList arrayList, Composer composer, int i7) {
        if (composer.shouldExecute((i7 & 3) != 2, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1748550656, i7, -1, "com.bilibili.ship.theseus.united.page.intro.module.relate.TheseusDetailRelateMenuService.show.<anonymous>.<anonymous> (DetailRelateMenuService.kt:129)");
            }
            ScreenAdjustMenuKt.ScreenAdjustMenu(arrayList, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TheseusDetailRelateMenuService$show$2 theseusDetailRelateMenuService$show$2 = new TheseusDetailRelateMenuService$show$2(this.this$0, this.$context, this.$anchorRect, continuation);
        theseusDetailRelateMenuService$show$2.L$0 = obj;
        return theseusDetailRelateMenuService$show$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        BottomDialogMenu bottomDialogMenuA;
        BottomDialogMenu bottomDialogMenu;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                BottomDialogMenu bottomDialogMenu2 = (BottomDialogMenu) this.L$0;
                ResultKt.throwOnFailure(obj);
                bottomDialogMenuA = bottomDialogMenu2;
                BottomDialogMenu bottomDialogMenu3 = bottomDialogMenuA;
                bottomDialogMenu = bottomDialogMenuA;
                throw new KotlinNothingValueException();
            }
            ResultKt.throwOnFailure(obj);
            final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            ArrayList arrayList = new ArrayList(this.this$0.f101023c);
            final ArrayList arrayList2 = new ArrayList(this.this$0.f101024d);
            this.this$0.f101023c.clear();
            this.this$0.f101024d.clear();
            if (!this.this$0.f101022b.i()) {
                this.this$0.f101025e.setValue(Boxing.boxBoolean(false));
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, this.this$0.f101022b.b(), null), 3, (Object) null);
                ScreenAdjustPopupDialog screenAdjustPopupDialog = new ScreenAdjustPopupDialog(this.this$0.f101021a, this.$anchorRect, ComposableLambdaKt.composableLambdaInstance(-1748550656, true, new Function2(arrayList2) { // from class: com.bilibili.ship.theseus.united.page.intro.module.relate.J0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final ArrayList f101019a;

                    {
                        this.f101019a = arrayList2;
                    }

                    public final Object invoke(Object obj2, Object obj3) {
                        return TheseusDetailRelateMenuService$show$2.invokeSuspend$lambda$1(this.f101019a, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }), 375, this.this$0.f101025e, (Function0) null, (PopupBgColor) null, false, false, WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND, (DefaultConstructorMarker) null);
                this.label = 2;
                if (ScreenAdjustPopupDialogKt.suspendShow(screenAdjustPopupDialog, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            BottomDialogMenu.a aVar = new BottomDialogMenu.a(this.$context);
            ((ArrayList) aVar.f64852b).addAll(arrayList);
            bottomDialogMenuA = aVar.a();
            bottomDialogMenuA.setOnDismissListener(new DialogInterface.OnDismissListener(coroutineScope) { // from class: com.bilibili.ship.theseus.united.page.intro.module.relate.I0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final CoroutineScope f101018a;

                {
                    this.f101018a = coroutineScope;
                }

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    CoroutineScopeKt.cancel$default(this.f101018a, null, 1, null);
                }
            });
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.this$0.f101022b.b(), bottomDialogMenuA, null), 3, (Object) null);
            bottomDialogMenuA.show();
            this.L$0 = bottomDialogMenuA;
            this.label = 1;
            if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            BottomDialogMenu bottomDialogMenu32 = bottomDialogMenuA;
            bottomDialogMenu = bottomDialogMenuA;
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            if (bottomDialogMenu.isShowing()) {
                bottomDialogMenu.dismiss();
            }
            throw th;
        }
    }
}
