package com.bilibili.pegasus.feedbackdialog;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.comm.list.common.utils.BiliCallLifeCycleObserverKt;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.app.screen.adjust.widget.PopupBgColor;
import com.bilibili.app.screen.adjust.widget.ScreenAdjustPopupDialog;
import java.util.List;
import java.util.Map;
import kntr.app.pegasus.feedbackdialog.model.Feedback;
import kntr.app.pegasus.feedbackdialog.model.FeedbackItemType;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/feedbackdialog/FeedbackDialogV5.class */
@StabilityInferred(parameters = 0)
public final class FeedbackDialogV5 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f77480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Rect f77481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final List<Feedback> f77482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f77483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Function1<FeedbackItemType, Unit> f77484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f77485f;

    /* JADX INFO: renamed from: com.bilibili.pegasus.feedbackdialog.FeedbackDialogV5$show$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/feedbackdialog/FeedbackDialogV5$show$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final ComponentActivity $activity;
        int label;
        final FeedbackDialogV5 this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.feedbackdialog.FeedbackDialogV5$show$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/feedbackdialog/FeedbackDialogV5$show$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<WindowSizeClass, Continuation<? super Unit>, Object> {
            int label;
            final FeedbackDialogV5 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(FeedbackDialogV5 feedbackDialogV5, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = feedbackDialogV5;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            public final Object invoke(WindowSizeClass windowSizeClass, Continuation<? super Unit> continuation) {
                return create(windowSizeClass, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.dismiss();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ComponentActivity componentActivity, FeedbackDialogV5 feedbackDialogV5, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$activity = componentActivity;
            this.this$0 = feedbackDialogV5;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$activity, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(ScreenAdjustUtilsKt.windowSizeFlow(this.$activity));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass1, this) == coroutine_suspended) {
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

    public FeedbackDialogV5(@NotNull Context context, @Nullable Rect rect, @Nullable List<Feedback> list, @NotNull Map<String, String> map, @Nullable Function1<? super FeedbackItemType, Unit> function1, @NotNull MutableStateFlow<Boolean> mutableStateFlow) {
        this.f77480a = context;
        this.f77481b = rect;
        this.f77482c = list;
        this.f77483d = map;
        this.f77484e = function1;
        this.f77485f = mutableStateFlow;
    }

    public /* synthetic */ FeedbackDialogV5(Context context, Rect rect, List list, Map map, Function1 function1, MutableStateFlow mutableStateFlow, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, rect, (i7 & 4) != 0 ? null : list, (i7 & 8) != 0 ? MapsKt.emptyMap() : map, (i7 & 16) != 0 ? null : function1, (i7 & 32) != 0 ? StateFlowKt.MutableStateFlow(Boolean.FALSE) : mutableStateFlow);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0171  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(androidx.compose.runtime.Composer r11, final int r12) {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.feedbackdialog.FeedbackDialogV5.a(androidx.compose.runtime.Composer, int):void");
    }

    public final void dismiss() {
        this.f77485f.setValue(Boolean.TRUE);
    }

    @NotNull
    public final MutableStateFlow<Boolean> getDismissFlow() {
        return this.f77485f;
    }

    public final void show() {
        LifecycleOwner lifecycleOwner;
        LifecycleCoroutineScope lifecycleScope;
        Context context = this.f77480a;
        Rect rect = this.f77481b;
        Rect rect2 = rect;
        if (rect == null) {
            rect2 = new Rect();
        }
        new ScreenAdjustPopupDialog(context, rect2, ComposableLambdaKt.composableLambdaInstance(1018962232, true, new Function2(this) { // from class: com.bilibili.pegasus.feedbackdialog.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final FeedbackDialogV5 f77487a;

            {
                this.f77487a = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1018962232, iIntValue, -1, "com.bilibili.pegasus.feedbackdialog.FeedbackDialogV5.show.<anonymous> (FeedbackDialogV5.kt:46)");
                    }
                    this.f77487a.a(composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            }
        }), 0, this.f77485f, (Function0) null, (PopupBgColor) null, false, false, 488, (DefaultConstructorMarker) null).show();
        Activity activityFindActivityOrNull = ContextUtilKt.findActivityOrNull(this.f77480a);
        ComponentActivity componentActivity = activityFindActivityOrNull instanceof ComponentActivity ? (ComponentActivity) activityFindActivityOrNull : null;
        if (componentActivity == null || (lifecycleOwner = BiliCallLifeCycleObserverKt.getLifecycleOwner(componentActivity)) == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
            return;
        }
        BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(componentActivity, this, null), 3, (Object) null);
    }
}
