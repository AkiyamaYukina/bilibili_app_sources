package com.bilibili.ship.theseus.cheese.biz.intro.studyrecord;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import com.bilibili.ad.core.click.K;
import com.bilibili.app.gemini.ui.UIComponent;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/CheeseStudyCompletedFunctionWidget.class */
@StabilityInferred(parameters = 0)
public final class CheeseStudyCompletedFunctionWidget extends AbsFunctionWidget {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CheeseStudyCompletedComponent f90166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final UIComponent.b<ComposeView> f90167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CoroutineScope f90168c;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyCompletedFunctionWidget$onWidgetShow$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/CheeseStudyCompletedFunctionWidget$onWidgetShow$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseStudyCompletedFunctionWidget this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheeseStudyCompletedFunctionWidget cheeseStudyCompletedFunctionWidget, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cheeseStudyCompletedFunctionWidget;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                CheeseStudyCompletedFunctionWidget cheeseStudyCompletedFunctionWidget = this.this$0;
                CheeseStudyCompletedComponent cheeseStudyCompletedComponent = cheeseStudyCompletedFunctionWidget.f90166a;
                this.label = 1;
                cheeseStudyCompletedComponent.getClass();
                ((ComposeView) cheeseStudyCompletedFunctionWidget.f90167b.a).setContent(ComposableLambdaKt.composableLambdaInstance(-635497653, true, new C6113a(cheeseStudyCompletedComponent)));
                if (Unit.INSTANCE == coroutine_suspended) {
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

    @Inject
    public CheeseStudyCompletedFunctionWidget(@NotNull Context context, @NotNull CheeseStudyCompletedComponent cheeseStudyCompletedComponent) {
        super(context);
        this.f90166a = cheeseStudyCompletedComponent;
        this.f90167b = UIComponent.createViewEntry$default(cheeseStudyCompletedComponent, context, (ViewGroup) null, 2, (Object) null);
    }

    @NotNull
    public final View createContentView(@NotNull Context context) {
        return this.f90167b.a;
    }

    @NotNull
    public final FunctionWidgetConfig getFunctionWidgetConfig() {
        FunctionWidgetConfig.Builder builder = new FunctionWidgetConfig.Builder();
        builder.dismissWhenActivityStop(true);
        builder.dismissWhenVideoChange(true);
        builder.persistent(false);
        return builder.build();
    }

    public final void onRelease() {
    }

    public final void onWidgetDismiss() {
        super.onWidgetDismiss();
        CoroutineScope coroutineScope = this.f90168c;
        CoroutineScope coroutineScope2 = coroutineScope;
        if (coroutineScope == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
            coroutineScope2 = null;
        }
        CoroutineScopeKt.cancel$default(coroutineScope2, (CancellationException) null, 1, (Object) null);
    }

    public final void onWidgetShow() {
        super.onWidgetShow();
        CoroutineScope coroutineScopeA = K.a((Job) null, 1, (Object) null, Dispatchers.getMain().getImmediate());
        this.f90168c = coroutineScopeA;
        if (coroutineScopeA == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
            coroutineScopeA = null;
        }
        BuildersKt.launch$default(coroutineScopeA, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
