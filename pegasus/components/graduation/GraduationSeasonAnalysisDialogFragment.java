package com.bilibili.pegasus.components.graduation;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.DialogFragment;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.pegasus.components.graduation.GraduationSeasonAnalysisDialogFragment;
import com.bilibili.pegasus.data.config.GraduationSeasonShareConfig;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/GraduationSeasonAnalysisDialogFragment.class */
@StabilityInferred(parameters = 0)
public final class GraduationSeasonAnalysisDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final a f76020i = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public GraduationSeasonShareConfig f76022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public com.bilibili.pegasus.page.H f76023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public com.bilibili.pegasus.page.I f76024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public com.bilibili.pegasus.page.J f76025f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f76026g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public GraduationSeasonAnalysisDialogType f76021b = GraduationSeasonAnalysisDialogType.DEFAULT;

    @NotNull
    public GraduationSeasonAnalysisDismissAction h = GraduationSeasonAnalysisDismissAction.CLOSE;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/GraduationSeasonAnalysisDialogFragment$a.class */
    public static final class a {
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            BLog.i("[GraduationSeason]AnalysisDialog", "onCreate restored, dismiss");
            dismissAllowingStateLoss();
        } else {
            setStyle(2, 2131889150);
            setCancelable(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.content.DialogInterface$OnKeyListener, java.lang.Object] */
    @Override // androidx.fragment.app.DialogFragment
    @NotNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), 2131889150);
        dialog.requestWindowFeature(1);
        Window window = dialog.getWindow();
        if (window != null) {
            C5621w.a(window);
        }
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setOnKeyListener(new Object());
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        ComposeView composeView = new ComposeView(requireContext(), null, 0, 6, null);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        composeView.setScaleX(-1.0f);
        composeView.setScaleY(-1.0f);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(78807733, true, new Function2(this) { // from class: com.bilibili.pegasus.components.graduation.l

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final GraduationSeasonAnalysisDialogFragment f76145a;

            {
                this.f76145a = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                GraduationSeasonAnalysisDialogFragment.a aVar = GraduationSeasonAnalysisDialogFragment.f76020i;
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(78807733, iIntValue, -1, "com.bilibili.pegasus.components.graduation.GraduationSeasonAnalysisDialogFragment.onCreateView.<anonymous>.<anonymous> (GraduationSeasonAnalysisDialogFragment.kt:89)");
                    }
                    BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(-82586003, true, new Function2(this.f76145a) { // from class: com.bilibili.pegasus.components.graduation.j

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final GraduationSeasonAnalysisDialogFragment f76133a;

                        {
                            this.f76133a = graduationSeasonAnalysisDialogFragment;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
                        /* JADX WARN: Removed duplicated region for block: B:20:0x00af  */
                        /* JADX WARN: Removed duplicated region for block: B:25:0x00ec  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object invoke(java.lang.Object r8, java.lang.Object r9) {
                            /*
                                Method dump skipped, instruction units count: 294
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.graduation.C5609j.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                        }
                    }, composer, 54), composer, 384, 3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            }
        }));
        return composeView;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NotNull DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        com.bilibili.pegasus.page.J j7 = this.f76025f;
        if (j7 != null) {
            j7.invoke(this.h);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        super.onStart();
        if (!this.f76026g) {
            this.f76026g = true;
            Neurons.reportExposure$default(true, "activity.graduation-report.0.0.show", MapsKt.plus(MapsKt.mapOf(new Pair[]{TuplesKt.to("from_spmid", "activity.graduation.recommend-page.0"), TuplesKt.to("spmid", "activity.graduation-report.0.0")}), MapsKt.mapOf(TuplesKt.to("graduation_report_type", String.valueOf(P.b(this.f76021b))))), (List) null, 8, (Object) null);
        }
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        C5621w.a(window);
    }
}
