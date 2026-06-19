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
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.alipay.sdk.app.PayTask;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.pegasus.components.graduation.GraduationSeasonYearSelectDialogFragment;
import com.bilibili.pegasus.data.config.GraduationSeasonConfig;
import com.freeletics.flowredux.dsl.FlowReduxStateMachine;
import java.util.List;
import java.util.concurrent.CancellationException;
import kntr.common.ouro.core.plugin.localImage.OuroLocalImagePlugin;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z61.l;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/GraduationSeasonYearSelectDialogFragment.class */
@StabilityInferred(parameters = 0)
public final class GraduationSeasonYearSelectDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final a f76030o = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public GraduationSeasonConfig f76031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public com.bilibili.column.ui.manager.draft.h f76032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Af1.w f76033d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f76035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f76036g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f76037i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Job f76039k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public Job f76040l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public Integer f76041m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public com.bilibili.column.ui.manager.draft.h f76042n;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableState f76034e = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f76038j = PayTask.f60018j;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/GraduationSeasonYearSelectDialogFragment$a.class */
    public static final class a {
    }

    public final void hf(@Nullable Function0<Unit> function0) {
        Job job = this.f76040l;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f76040l = BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new GraduationSeasonYearSelectDialogFragment$dismissAfterRefresh$1(this, function0, null), 3, (Object) null);
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        GraduationSeasonConfig graduationSeasonConfig = this.f76031b;
        boolean z6 = false;
        if (graduationSeasonConfig != null && bundle == null) {
            setStyle(2, 2131889150);
            setCancelable(false);
            return;
        }
        boolean z7 = graduationSeasonConfig == null;
        if (bundle != null) {
            z6 = true;
        }
        q4.Q.a("onCreate invalid config=", ", restored=", "[GraduationSeason]YearSelectDialog", z7, z6);
        dismissAllowingStateLoss();
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
        final int i7 = 0;
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1555026795, true, new Function2(this, i7) { // from class: com.bilibili.pegasus.components.graduation.b0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f76107a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f76108b;

            {
                this.f76107a = i7;
                this.f76108b = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                Object obj3 = this.f76108b;
                switch (this.f76107a) {
                    case 0:
                        Composer composer = (Composer) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        GraduationSeasonYearSelectDialogFragment.a aVar = GraduationSeasonYearSelectDialogFragment.f76030o;
                        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1555026795, iIntValue, -1, "com.bilibili.pegasus.components.graduation.GraduationSeasonYearSelectDialogFragment.onCreateView.<anonymous>.<anonymous> (GraduationSeasonYearSelectDialogFragment.kt:101)");
                            }
                            final GraduationSeasonYearSelectDialogFragment graduationSeasonYearSelectDialogFragment = (GraduationSeasonYearSelectDialogFragment) obj3;
                            final int i8 = 0;
                            BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(485549133, true, new Function2(graduationSeasonYearSelectDialogFragment, i8) { // from class: com.bilibili.pegasus.components.graduation.d0

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final int f76111a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final Object f76112b;

                                {
                                    this.f76111a = i8;
                                    this.f76112b = graduationSeasonYearSelectDialogFragment;
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Removed duplicated region for block: B:35:0x01bb  */
                                /* JADX WARN: Removed duplicated region for block: B:40:0x01f7  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public final java.lang.Object invoke(java.lang.Object r34, java.lang.Object r35) {
                                    /*
                                        Method dump skipped, instruction units count: 561
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.graduation.d0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                                }
                            }, composer, 54), composer, 384, 3);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    default:
                        kntr.common.ouro.core.plugin.localImage.c cVar = (kntr.common.ouro.core.plugin.localImage.c) obj;
                        j71.d dVar = cVar.a;
                        OuroLocalImagePlugin ouroLocalImagePlugin = (OuroLocalImagePlugin) obj3;
                        d71.a aVar2 = ouroLocalImagePlugin.a;
                        l.c cVar2 = (z61.l) OuroLocalImagePlugin.c((kntr.common.ouro.core.a) obj2).a.get(cVar.a.getIdentifier());
                        l.c cVar3 = cVar2;
                        if (cVar2 == null) {
                            cVar3 = new l.c(dVar.getIdentifier());
                        }
                        FlowReduxStateMachine flowReduxStateMachine = new FlowReduxStateMachine(cVar3);
                        flowReduxStateMachine.e(new kntr.common.ouro.core.plugin.localImage.h(aVar2, dVar, cVar.b, ouroLocalImagePlugin.b));
                        return flowReduxStateMachine;
                }
            }
        }));
        return composeView;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Job job = this.f76039k;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f76039k = null;
        Job job2 = this.f76040l;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.f76040l = null;
        this.f76041m = null;
        this.f76042n = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NotNull DialogInterface dialogInterface) {
        Af1.w wVar;
        super.onDismiss(dialogInterface);
        if (this.f76036g || (wVar = this.f76033d) == null) {
            return;
        }
        wVar.invoke();
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        super.onStart();
        if (!this.f76035f) {
            this.f76035f = true;
            Neurons.reportExposure$default(true, "activity.graduation-year-choose.0.0.show", MapsKt.mapOf(new Pair[]{TuplesKt.to("from_spmid", "activity.graduation.recommend-page.0"), TuplesKt.to("spmid", "activity.graduation-year-choose.0.0")}), (List) null, 8, (Object) null);
        }
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        C5621w.a(window);
    }
}
