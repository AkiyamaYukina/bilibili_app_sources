package com.bilibili.pegasus.feedbackdialog;

import android.R;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/feedbackdialog/i.class */
@StabilityInferred(parameters = 1)
public final class i {
    public static void a(FragmentActivity fragmentActivity, Function0 function0) {
        if (fragmentActivity == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) fragmentActivity.findViewById(R.id.content);
        ComposeView composeView = (ComposeView) viewGroup.findViewWithTag("FeedbackPopupComposeView");
        if (composeView != null) {
            viewGroup.removeView(composeView);
        }
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static void b(final i iVar, final FragmentActivity fragmentActivity, final int i7, final Function0 function0, final Function0 function02) {
        Duration.Companion companion = Duration.Companion;
        long duration = DurationKt.toDuration(6, DurationUnit.SECONDS);
        if (fragmentActivity == null) {
            return;
        }
        final ViewGroup viewGroup = (ViewGroup) fragmentActivity.findViewById(R.id.content);
        ComposeView composeView = (ComposeView) viewGroup.findViewWithTag("FeedbackPopupComposeView");
        if (composeView != null) {
            viewGroup.removeView(composeView);
        }
        final ComposeView composeView2 = new ComposeView(fragmentActivity, null, 0, 6, null);
        composeView2.setTag("FeedbackPopupComposeView");
        final Function0 function03 = null;
        final int i8 = 0;
        composeView2.setContent(ComposableLambdaKt.composableLambdaInstance(378818992, true, new Function2(fragmentActivity, function0, function02, iVar, function03, i8, i7) { // from class: com.bilibili.pegasus.feedbackdialog.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final FragmentActivity f77491a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Function0 f77492b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Function0 f77493c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final i f77494d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final Function0 f77495e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final int f77496f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final int f77497g;

            {
                this.f77491a = fragmentActivity;
                this.f77492b = function0;
                this.f77493c = function02;
                this.f77494d = iVar;
                this.f77495e = function03;
                this.f77496f = i8;
                this.f77497g = i7;
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x00f7  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0197  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x0203  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r11, java.lang.Object r12) {
                /*
                    Method dump skipped, instruction units count: 586
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.feedbackdialog.e.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }));
        viewGroup.addView(composeView2);
        final Function0 function04 = null;
        composeView2.postDelayed(new Runnable(viewGroup, composeView2, function04) { // from class: com.bilibili.pegasus.feedbackdialog.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ViewGroup f77498a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ComposeView f77499b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Function0 f77500c;

            {
                this.f77498a = viewGroup;
                this.f77499b = composeView2;
                this.f77500c = function04;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ViewGroup viewGroup2 = this.f77498a;
                ComposeView composeView3 = this.f77499b;
                Function0 function05 = this.f77500c;
                viewGroup2.removeView(composeView3);
                if (function05 != null) {
                    function05.invoke();
                }
            }
        }, Duration.getInWholeMilliseconds-impl(duration));
    }
}
