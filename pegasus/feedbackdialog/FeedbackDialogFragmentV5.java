package com.bilibili.pegasus.feedbackdialog;

import UD.v;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.os.EnvironmentCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.comm.list.common.feed.FeedbackEventType;
import com.bilibili.app.comm.list.common.feed.PegasusProblemReporter;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import java.util.List;
import java.util.Map;
import kntr.app.pegasus.feedbackdialog.model.Feedback;
import kntr.app.pegasus.feedbackdialog.model.FeedbackItemType;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/feedbackdialog/FeedbackDialogFragmentV5.class */
@StabilityInferred(parameters = 0)
public final class FeedbackDialogFragmentV5 extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public List<Feedback> f77475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public Map<String, String> f77476c = MapsKt.emptyMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public String f77477d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public String f77478e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public Function1<? super FeedbackItemType, Unit> f77479f = new v(this, 2);

    /* JADX INFO: renamed from: com.bilibili.pegasus.feedbackdialog.FeedbackDialogFragmentV5$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/feedbackdialog/FeedbackDialogFragmentV5$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final FeedbackDialogFragmentV5 this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.feedbackdialog.FeedbackDialogFragmentV5$onViewCreated$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/feedbackdialog/FeedbackDialogFragmentV5$onViewCreated$1$1.class */
        public static final class C05051 extends SuspendLambda implements Function2<WindowSizeClass, Continuation<? super Unit>, Object> {
            int label;
            final FeedbackDialogFragmentV5 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05051(FeedbackDialogFragmentV5 feedbackDialogFragmentV5, Continuation<? super C05051> continuation) {
                super(2, continuation);
                this.this$0 = feedbackDialogFragmentV5;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05051(this.this$0, continuation);
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
                this.this$0.dismissAllowingStateLoss();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FeedbackDialogFragmentV5 feedbackDialogFragmentV5, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = feedbackDialogFragmentV5;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Flow flowWindowSizeFlow;
            Flow flowDistinctUntilChanged;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                FragmentActivity fragmentActivityP3 = this.this$0.p3();
                if (fragmentActivityP3 != null && (flowWindowSizeFlow = ScreenAdjustUtilsKt.windowSizeFlow(fragmentActivityP3)) != null && (flowDistinctUntilChanged = FlowKt.distinctUntilChanged(flowWindowSizeFlow)) != null) {
                    C05051 c05051 = new C05051(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, c05051, this) == coroutine_suspended) {
                        return coroutine_suspended;
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCancel(@NotNull DialogInterface dialogInterface) {
        super/*androidx.fragment.app.DialogFragment*/.onCancel(dialogInterface);
        BLog.i("FeedbackDialogFragment", "onCancel");
        this.f77478e = "cancel";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(@Nullable Bundle bundle) {
        super/*androidx.fragment.app.DialogFragment*/.onCreate(bundle);
        if (bundle == null) {
            setStyle(0, 2131888801);
        } else {
            this.f77478e = "restore";
            this.f77479f.invoke((Object) null);
        }
    }

    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        ComposeView composeView = new ComposeView(layoutInflater.getContext(), null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-2084568662, true, new Function2(this) { // from class: com.bilibili.pegasus.feedbackdialog.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final FeedbackDialogFragmentV5 f77486a;

            {
                this.f77486a = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x00b1  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r11, java.lang.Object r12) {
                /*
                    Method dump skipped, instruction units count: 232
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.feedbackdialog.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }));
        return composeView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDismiss(@NotNull DialogInterface dialogInterface) {
        super/*androidx.fragment.app.DialogFragment*/.onDismiss(dialogInterface);
        BLog.i("FeedbackDialogFragment", "onDismiss");
        PegasusProblemReporter pegasusProblemReporter = PegasusProblemReporter.INSTANCE;
        FeedbackEventType feedbackEventType = FeedbackEventType.PANEL_DISMISS;
        String str = this.f77478e;
        String str2 = str;
        if (str.length() == 0) {
            str2 = EnvironmentCompat.MEDIA_UNKNOWN;
        }
        pegasusProblemReporter.reportFeedbackState(feedbackEventType, MapsKt.plus(MapsKt.mapOf(new Pair[]{TuplesKt.to("close_from", str2), TuplesKt.to("option_type", this.f77477d)}), this.f77476c));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
