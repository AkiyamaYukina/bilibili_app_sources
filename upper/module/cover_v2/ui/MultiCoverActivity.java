package com.bilibili.upper.module.cover_v2.ui;

import HS0.H0;
import KH0.j;
import X50.E;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import cV0.M;
import com.bilibili.ad.adview.videodetail.merchandise.y;
import com.bilibili.base.BiliContext;
import com.bilibili.base.MainThread;
import com.bilibili.base.SharedPreferencesHelper;
import com.bilibili.bilibililive.streaming.pandora.core.u;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.tf.TfCode;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.helper.NotchCompat;
import com.bilibili.studio.editor.timeline.UpperLiveWindowExt;
import com.bilibili.studio.videoeditor.extension.ActivityExtKt;
import com.bilibili.upper.module.contribute.up.dialog.UpperLoadingDialog;
import com.bilibili.upper.module.cover_v2.draft.MultiCoverDraft;
import com.bilibili.upper.module.cover_v2.model.MultiCoverConfig;
import com.bilibili.upper.module.cover_v2.model.template.bean.MultiCoverTemplateContentTipResponseBean;
import com.bilibili.upper.module.cover_v2.service.MultiCoverDraftService;
import com.bilibili.upper.module.cover_v2.ui.MultiAlertDialog;
import com.bilibili.upper.module.cover_v2.ui.MultiCoverActivity;
import eJ0.C6935m;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/ui/MultiCoverActivity.class */
@StabilityInferred(parameters = 0)
public class MultiCoverActivity extends com.bilibili.lib.spy.generated.a implements com.bilibili.upper.module.cover_v2.ui.a {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final int f112864K = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @Nullable
    public KH0.i f112865A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @Nullable
    public OH0.b f112866B;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @Nullable
    public com.bilibili.studio.editor.moudle.caption.setting.widget.a f112869E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f112870F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f112871G;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @Nullable
    public Integer f112873I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @Nullable
    public Integer f112874J;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public a f112876y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public MultiCoverDraft f112877z;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f112875x = TfCode.BVC_CONVERT_NETWORK_ERROR_VALUE;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f112867C = true;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f112868D = true;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f112872H = true;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/ui/MultiCoverActivity$a.class */
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ImageView f112878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final TextView f112879b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final TextView f112880c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final TextView f112881d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final TextView f112882e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final View f112883f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final TextView f112884g;

        @NotNull
        public final MultiCoverEditorView h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public final MultiCoverOperateView f112885i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public final UpperLiveWindowExt f112886j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public final MultiCoverMenuFragment f112887k = new MultiCoverMenuFragment();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final MultiCoverActivity f112888l;

        public a(@NotNull MultiCoverActivity multiCoverActivity, MultiCoverActivity multiCoverActivity2) {
            this.f112888l = multiCoverActivity;
            this.f112878a = (ImageView) multiCoverActivity2.findViewById(2131317991);
            this.f112879b = (TextView) multiCoverActivity2.findViewById(2131312204);
            this.f112880c = (TextView) multiCoverActivity2.findViewById(2131318220);
            this.f112881d = (TextView) multiCoverActivity2.findViewById(2131318219);
            this.f112882e = (TextView) multiCoverActivity2.findViewById(2131318218);
            this.f112883f = multiCoverActivity2.findViewById(2131318199);
            this.f112884g = (TextView) multiCoverActivity2.findViewById(2131318223);
            this.h = (MultiCoverEditorView) multiCoverActivity2.findViewById(2131318176);
            this.f112885i = (MultiCoverOperateView) multiCoverActivity2.findViewById(2131318179);
            this.f112886j = (UpperLiveWindowExt) multiCoverActivity2.findViewById(2131318206);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/ui/MultiCoverActivity$b.class */
    public static final class b implements MultiAlertDialog.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MultiCoverActivity f112889a;

        public b(MultiCoverActivity multiCoverActivity) {
            this.f112889a = multiCoverActivity;
        }

        @Override // com.bilibili.upper.module.cover_v2.ui.MultiAlertDialog.a
        public final void onConfirm() {
            MultiCoverActivity multiCoverActivity = this.f112889a;
            multiCoverActivity.f112868D = false;
            multiCoverActivity.finish();
        }
    }

    @Override // com.bilibili.upper.module.cover_v2.ui.a
    @Nullable
    public final KH0.i C3() {
        return this.f112865A;
    }

    @Override // com.bilibili.upper.module.cover_v2.ui.a
    @NotNull
    public final com.bilibili.upper.module.cover_v2.presenter.a E5() {
        return X6().f112887k.f112904e.f112947i;
    }

    public final void P6(String str) {
        MultiCoverDraft multiCoverDraft;
        MultiCoverConfig config;
        com.bilibili.upper.module.cover_v2.service.c cVar;
        if (str == null) {
            return;
        }
        KH0.i iVar = this.f112865A;
        if (iVar != null && (cVar = iVar.f12755n) != null) {
            cVar.d();
        }
        bG0.g.c(X6().f112885i, true);
        KH0.i iVar2 = this.f112865A;
        if (iVar2 != null && (multiCoverDraft = iVar2.f12747e) != null && (config = multiCoverDraft.getConfig()) != null) {
            config.setSelectedPath(str);
            config.updateConfigs();
            KH0.i iVar3 = this.f112865A;
            if (iVar3 != null) {
                iVar3.f12746d.b(config);
            }
        }
        KH0.i iVar4 = this.f112865A;
        if (iVar4 != null) {
            iVar4.i();
            LH0.a aVar = iVar4.f12746d;
            double d7 = aVar.f14538c;
            com.bilibili.upper.module.cover_v2.service.b bVar = iVar4.f12754m;
            bVar.b(d7);
            bVar.c(aVar.f14538c);
            MainThread.postOnMainThreadDelayed(new u(iVar4, 1), 100L);
        }
    }

    public final void Q6() {
        MultiCoverConfig multiCoverConfig;
        int[] selectedMaterialSize;
        KH0.i iVar = this.f112865A;
        if (iVar == null || (multiCoverConfig = iVar.f12745c) == null || (selectedMaterialSize = multiCoverConfig.getSelectedMaterialSize()) == null) {
            return;
        }
        MultiCoverEditorView multiCoverEditorView = X6().h;
        int i7 = 0;
        if (selectedMaterialSize[0] < selectedMaterialSize[1]) {
            i7 = 1;
        }
        multiCoverEditorView.setDimmedLayerType(i7);
    }

    @Override // com.bilibili.upper.module.cover_v2.ui.a
    public final boolean R1() {
        return false;
    }

    public final void R6(int i7, Function0<Unit> function0) {
        Object obj;
        EH0.p.f4125a.getClass();
        if (EH0.p.f4131g || !Y6()) {
            function0.invoke();
            return;
        }
        Neurons.reportExposure$default(false, "creation.new-publish.cover-edit.ratio-sync.show", y.a(i7, "from"), (List) null, 8, (Object) null);
        KH0.i iVar = this.f112865A;
        if (iVar != null) {
            Fragment fragmentFindFragmentByTag = getSupportFragmentManager().findFragmentByTag("MultiCoverSyncDialogFragment");
            if (fragmentFindFragmentByTag != null) {
                getSupportFragmentManager().beginTransaction().remove(fragmentFindFragmentByTag).commitNowAllowingStateLoss();
            }
            MultiCoverSyncDialogFragment multiCoverSyncDialogFragment = new MultiCoverSyncDialogFragment();
            multiCoverSyncDialogFragment.h = iVar;
            multiCoverSyncDialogFragment.f112937k = V6();
            multiCoverSyncDialogFragment.f112935i = X6().f112886j;
            multiCoverSyncDialogFragment.setCancelable(false);
            multiCoverSyncDialogFragment.f112933f = new E(1, this, function0);
            multiCoverSyncDialogFragment.f112934g = new H0(this, 4);
            try {
                Result.Companion companion = Result.Companion;
                multiCoverSyncDialogFragment.show(getSupportFragmentManager(), "MultiCoverSyncDialogFragment");
                obj = Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Result.box-impl(obj);
        }
    }

    public final void S6(boolean z6) {
        String str;
        String str2;
        String selectedPath;
        Integer orNull;
        Integer orNull2;
        MultiCoverConfig multiCoverConfig;
        MultiCoverConfig multiCoverConfig2;
        MultiCoverConfig multiCoverConfig3;
        com.bilibili.upper.module.cover_v2.service.c cVar;
        MultiCoverConfig multiCoverConfig4;
        MultiCoverConfig multiCoverConfig5;
        MultiCoverConfig multiCoverConfig6;
        MultiCoverConfig multiCoverConfig7;
        Neurons.reportClick(false, "creation.publish.cover-service.3.click", new LinkedHashMap());
        KH0.i iVar = this.f112865A;
        String inputImagePath = (iVar == null || (multiCoverConfig7 = iVar.f12745c) == null) ? null : multiCoverConfig7.getInputImagePath();
        KH0.i iVar2 = this.f112865A;
        String inputVideoPath = (iVar2 == null || (multiCoverConfig6 = iVar2.f12745c) == null) ? null : multiCoverConfig6.getInputVideoPath();
        KH0.i iVar3 = this.f112865A;
        String selectedPath2 = (iVar3 == null || (multiCoverConfig5 = iVar3.f12745c) == null) ? null : multiCoverConfig5.getSelectedPath();
        SharedPreferencesHelper sharedPreferencesHelper = JH0.a.f11357a;
        KH0.i iVar4 = this.f112865A;
        MultiCoverDraft multiCoverDraftE = JH0.a.e((iVar4 == null || (multiCoverConfig4 = iVar4.f12745c) == null) ? null : multiCoverConfig4.getSubCoverKey());
        if (multiCoverDraftE != null && !multiCoverDraftE.isTemp()) {
            MultiCoverConfig config = multiCoverDraftE.getConfig();
            String inputImagePath2 = config != null ? config.getInputImagePath() : null;
            MultiCoverConfig config2 = multiCoverDraftE.getConfig();
            String inputVideoPath2 = config2 != null ? config2.getInputVideoPath() : null;
            MultiCoverConfig config3 = multiCoverDraftE.getConfig();
            if (config3 != null) {
                selectedPath = config3.getSelectedPath();
                str = inputImagePath2;
                str2 = inputVideoPath2;
            } else {
                selectedPath = null;
                str2 = inputVideoPath2;
                str = inputImagePath2;
            }
        } else if (z6) {
            MultiCoverDraft multiCoverDraft = this.f112877z;
            str = inputImagePath;
            str2 = inputVideoPath;
            selectedPath = selectedPath2;
            if (multiCoverDraft != null) {
                String subCoverKey = multiCoverDraft.getConfig().getSubCoverKey();
                if (subCoverKey == null) {
                    str = inputImagePath;
                    str2 = inputVideoPath;
                    selectedPath = selectedPath2;
                } else {
                    MultiCoverDraft multiCoverDraft2 = new MultiCoverDraft();
                    MultiCoverConfig multiCoverConfig8 = new MultiCoverConfig();
                    JH0.a.g(multiCoverConfig8, multiCoverDraft.getConfig());
                    multiCoverConfig8.setCoverKey(multiCoverDraft.getConfig().getSubCoverKey());
                    multiCoverDraft2.setConfig(multiCoverConfig8);
                    OH0.a aVarA = multiCoverDraft.getConfig().getMainStrategy().a();
                    if (aVarA != null) {
                        int[] videoSize = multiCoverDraft.getConfig().getVideoSize();
                        int iIntValue = (videoSize == null || (orNull2 = ArraysKt.getOrNull(videoSize, 0)) == null) ? KH0.e.f12733a : orNull2.intValue();
                        int[] videoSize2 = multiCoverDraft.getConfig().getVideoSize();
                        int iIntValue2 = (videoSize2 == null || (orNull = ArraysKt.getOrNull(videoSize2, 1)) == null) ? KH0.e.f12733a : orNull.intValue();
                        float f7 = iIntValue;
                        float f8 = iIntValue2;
                        aVarA.a(f7, f8, f7, f8);
                    }
                    JH0.a.f(subCoverKey, multiCoverDraft2, multiCoverConfig8, false);
                    str = inputImagePath;
                    str2 = inputVideoPath;
                    selectedPath = selectedPath2;
                }
            }
        } else {
            JH0.a.d(this.f112865A);
            str = inputImagePath;
            str2 = inputVideoPath;
            selectedPath = selectedPath2;
        }
        KH0.i iVar5 = this.f112865A;
        if (iVar5 != null && (cVar = iVar5.f12755n) != null) {
            cVar.d();
        }
        bG0.g.c(X6().f112885i, true);
        this.f112870F = true;
        OH0.b bVar = this.f112866B;
        if (bVar != null) {
            EH0.p pVar = EH0.p.f4125a;
            final String strB = bVar.b();
            KH0.i iVar6 = this.f112865A;
            String subCoverKey2 = (iVar6 == null || (multiCoverConfig3 = iVar6.f12745c) == null) ? null : multiCoverConfig3.getSubCoverKey();
            KH0.i iVar7 = this.f112865A;
            String pageFrom = (iVar7 == null || (multiCoverConfig2 = iVar7.f12745c) == null) ? null : multiCoverConfig2.getPageFrom();
            KH0.i iVar8 = this.f112865A;
            String inputTypeId = (iVar8 == null || (multiCoverConfig = iVar8.f12745c) == null) ? null : multiCoverConfig.getInputTypeId();
            pVar.getClass();
            if (EH0.p.f4130f != null) {
                if (EH0.p.a(this)) {
                    EH0.p.m(this, strB, subCoverKey2, str, str2, selectedPath, EH0.p.f4129e, pageFrom, inputTypeId);
                    EH0.p.f4126b = false;
                    return;
                }
                return;
            }
            if (EH0.p.a(this)) {
                EH0.p.c(this);
                final String str3 = subCoverKey2;
                final String str4 = str;
                final String str5 = str2;
                final String str6 = selectedPath;
                final String str7 = pageFrom;
                final String str8 = inputTypeId;
                Function1 function1 = new Function1(this, strB, str3, str4, str5, str6, str7, str8) { // from class: EH0.k

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final MultiCoverActivity f4095a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final String f4096b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final String f4097c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final String f4098d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final String f4099e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final String f4100f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    public final String f4101g;
                    public final String h;

                    {
                        this.f4095a = this;
                        this.f4096b = strB;
                        this.f4097c = str3;
                        this.f4098d = str4;
                        this.f4099e = str5;
                        this.f4100f = str6;
                        this.f4101g = str7;
                        this.h = str8;
                    }

                    public final Object invoke(Object obj) {
                        p.f4132i = false;
                        p pVar2 = p.f4125a;
                        String str9 = p.f4129e;
                        MultiCoverActivity multiCoverActivity = this.f4095a;
                        pVar2.getClass();
                        p.m(multiCoverActivity, this.f4096b, this.f4097c, this.f4098d, this.f4099e, this.f4100f, str9, this.f4101g, this.h);
                        return Unit.INSTANCE;
                    }
                };
                final String str9 = subCoverKey2;
                final String str10 = str;
                final String str11 = str2;
                final String str12 = selectedPath;
                final String str13 = pageFrom;
                final String str14 = inputTypeId;
                EH0.p.j(new com.bilibili.studio.editor.moudle.material.h(new EH0.m(this, 0), function1, new Function1(this, strB, str9, str10, str11, str12, str13, str14) { // from class: EH0.l

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final MultiCoverActivity f4102a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final String f4103b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final String f4104c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final String f4105d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final String f4106e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final String f4107f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    public final String f4108g;
                    public final String h;

                    {
                        this.f4102a = this;
                        this.f4103b = strB;
                        this.f4104c = str9;
                        this.f4105d = str10;
                        this.f4106e = str11;
                        this.f4107f = str12;
                        this.f4108g = str13;
                        this.h = str14;
                    }

                    public final Object invoke(Object obj) {
                        p.f4132i = false;
                        p pVar2 = p.f4125a;
                        String str15 = p.f4129e;
                        MultiCoverActivity multiCoverActivity = this.f4102a;
                        pVar2.getClass();
                        p.m(multiCoverActivity, this.f4103b, this.f4104c, this.f4105d, this.f4106e, this.f4107f, str15, this.f4108g, this.h);
                        return Unit.INSTANCE;
                    }
                }));
            }
        }
    }

    public final void T6() {
        MultiCoverDraftService multiCoverDraftService;
        final UpperLoadingDialog upperLoadingDialog = new UpperLoadingDialog();
        upperLoadingDialog.show(getSupportFragmentManager(), "loading");
        KH0.i iVar = this.f112865A;
        if (iVar == null || (multiCoverDraftService = iVar.f12757p) == null) {
            return;
        }
        MultiCoverDraftService.generateMainCover$default(multiCoverDraftService, V6(), false, new Function1(this, upperLoadingDialog) { // from class: com.bilibili.upper.module.cover_v2.ui.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MultiCoverActivity f112953a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final UpperLoadingDialog f112954b;

            {
                this.f112953a = this;
                this.f112954b = upperLoadingDialog;
            }

            public final Object invoke(Object obj) {
                MultiCoverDraftService multiCoverDraftService2;
                MultiCoverConfig multiCoverConfig;
                int i7 = MultiCoverActivity.f112864K;
                final Intent intent = new Intent();
                final MultiCoverActivity multiCoverActivity = this.f112953a;
                intent.putExtra("is_cover_changed", multiCoverActivity.Y6());
                intent.putExtra("output_image_path", (String) obj);
                SharedPreferencesHelper sharedPreferencesHelper = JH0.a.f11357a;
                KH0.i iVar2 = multiCoverActivity.f112865A;
                MultiCoverDraft multiCoverDraftE = JH0.a.e((iVar2 == null || (multiCoverConfig = iVar2.f12745c) == null) ? null : multiCoverConfig.getSubCoverKey());
                final UpperLoadingDialog upperLoadingDialog2 = this.f112954b;
                if (multiCoverDraftE != null) {
                    KH0.i iVar3 = multiCoverActivity.f112865A;
                    if (iVar3 != null && (multiCoverDraftService2 = iVar3.f12757p) != null) {
                        MultiCoverDraftService.generateSubCover$default(multiCoverDraftService2, multiCoverActivity.X6().f112886j, multiCoverDraftE, 1.7777778f, false, new Function1(intent, multiCoverActivity, upperLoadingDialog2) { // from class: com.bilibili.upper.module.cover_v2.ui.e

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final Intent f112955a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final MultiCoverActivity f112956b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final UpperLoadingDialog f112957c;

                            {
                                this.f112955a = intent;
                                this.f112956b = multiCoverActivity;
                                this.f112957c = upperLoadingDialog2;
                            }

                            public final Object invoke(Object obj2) {
                                MultiCoverConfig multiCoverConfig2;
                                Intent intent2 = this.f112955a;
                                String str = (String) obj2;
                                int i8 = MultiCoverActivity.f112864K;
                                if (str != null) {
                                    intent2.putExtra("output_image_sub_path", str);
                                }
                                TE0.b bVar = TE0.b.f24088a;
                                MultiCoverActivity multiCoverActivity2 = this.f112956b;
                                KH0.i iVar4 = multiCoverActivity2.f112865A;
                                String pageFrom = (iVar4 == null || (multiCoverConfig2 = iVar4.f12745c) == null) ? null : multiCoverConfig2.getPageFrom();
                                bVar.getClass();
                                TE0.b.r(2, pageFrom);
                                UpperLoadingDialog upperLoadingDialog3 = this.f112957c;
                                if (C6935m.a(upperLoadingDialog3.getContext())) {
                                    upperLoadingDialog3.dismissAllowingStateLoss();
                                }
                                multiCoverActivity2.setResult(-1, intent2);
                                multiCoverActivity2.finish();
                                return Unit.INSTANCE;
                            }
                        }, 8, null);
                    }
                } else {
                    TE0.b bVar = TE0.b.f24088a;
                    KH0.i iVar4 = multiCoverActivity.f112865A;
                    String pageFrom = null;
                    if (iVar4 != null) {
                        MultiCoverConfig multiCoverConfig2 = iVar4.f12745c;
                        pageFrom = null;
                        if (multiCoverConfig2 != null) {
                            pageFrom = multiCoverConfig2.getPageFrom();
                        }
                    }
                    bVar.getClass();
                    TE0.b.r(1, pageFrom);
                    if (C6935m.a(upperLoadingDialog2.getContext())) {
                        upperLoadingDialog2.dismissAllowingStateLoss();
                    }
                    multiCoverActivity.setResult(-1, intent);
                    multiCoverActivity.finish();
                }
                return Unit.INSTANCE;
            }
        }, 2, null);
    }

    @Override // com.bilibili.upper.module.cover_v2.ui.a
    @NotNull
    public final UpperLiveWindowExt U5() {
        return X6().h.getLiveWindow();
    }

    public int U6() {
        return 2131501546;
    }

    @Override // com.bilibili.upper.module.cover_v2.ui.a
    @NotNull
    public final MultiCoverEditorView V5() {
        return X6().h;
    }

    public float V6() {
        return -1.0f;
    }

    @NotNull
    public final a X6() {
        a aVar = this.f112876y;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewHolder");
        return null;
    }

    public final boolean Y6() {
        KH0.i iVar = this.f112865A;
        boolean z6 = false;
        if (iVar != null) {
            MultiCoverDraft multiCoverDraft = iVar.f12747e;
            z6 = false;
            if (multiCoverDraft != null) {
                MultiCoverDraft multiCoverDraft2 = this.f112877z;
                if (multiCoverDraft2 == null) {
                    return false;
                }
                z6 = false;
                if (!multiCoverDraft.equals(multiCoverDraft2)) {
                    z6 = true;
                }
            }
        }
        return z6;
    }

    public void a7() {
        MultiCoverConfig multiCoverConfig;
        MultiCoverConfig multiCoverConfig2;
        OH0.b mainStrategy;
        MultiCoverConfig multiCoverConfig3;
        OH0.b mainStrategy2;
        MultiCoverConfig multiCoverConfig4;
        OH0.b mainStrategy3;
        a aVarX6 = X6();
        MultiCoverActivity multiCoverActivity = aVarX6.f112888l;
        multiCoverActivity.getSupportFragmentManager().beginTransaction().replace(2131318178, aVarX6.f112887k).commitAllowingStateLoss();
        SpannableString spannableString = new SpannableString(multiCoverActivity.getString(2131849231));
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
        aVarX6.f112882e.setText(spannableString);
        Bundle bundleExtra = getIntent().getBundleExtra("param_control");
        boolean z6 = bundleExtra == null || bundleExtra.getBoolean("cover_169_enable", true);
        KH0.i iVar = this.f112865A;
        if (((iVar == null || (multiCoverConfig4 = iVar.f12745c) == null || (mainStrategy3 = multiCoverConfig4.getMainStrategy()) == null) ? null : mainStrategy3.c()) == null) {
            z6 = false;
        }
        X6().f112879b.setVisibility(0);
        X6().f112884g.setVisibility((this.f112866B == null || !z6) ? 8 : 0);
        TextView textView = X6().f112884g;
        OH0.b bVar = this.f112866B;
        textView.setText(getString(2131851401, new Object[]{bVar != null ? bVar.e() : null}));
        KH0.i iVar2 = this.f112865A;
        if (iVar2 != null && (multiCoverConfig2 = iVar2.f12745c) != null && (mainStrategy = multiCoverConfig2.getMainStrategy()) != null && !mainStrategy.h()) {
            TextView textView2 = X6().f112879b;
            KH0.i iVar3 = this.f112865A;
            String strE = (iVar3 == null || (multiCoverConfig3 = iVar3.f12745c) == null || (mainStrategy2 = multiCoverConfig3.getMainStrategy()) == null) ? "" : mainStrategy2.e();
            Activity activity = BiliContext.topActivity();
            boolean zIsActive = ActivityExtKt.isActive(activity);
            Context fapp = activity;
            if (!zIsActive) {
                fapp = FoundationAlias.getFapp();
            }
            textView2.setText(fapp.getString(2131849911, Arrays.copyOf(new Object[]{strE}, 1)));
        }
        if (this.f112867C) {
            X6().f112880c.setText(getString(2131849802));
            X6().f112878a.setImageResource(2131234819);
            X6().f112883f.setVisibility(0);
            X6().f112883f.setEnabled(true);
            Map<String, MultiCoverTemplateContentTipResponseBean> map = SH0.e.f22903a;
            KH0.i iVar4 = this.f112865A;
            SH0.e.b((iVar4 == null || (multiCoverConfig = iVar4.f12745c) == null) ? null : multiCoverConfig.getInputTypeId(), new com.bilibili.search2.result.holder.author.b(this, 1));
        } else {
            X6().f112880c.setText(getString(2131849746));
            X6().f112878a.setImageResource(2131235725);
            X6().f112883f.setVisibility(8);
            X6().f112883f.setEnabled(false);
        }
        KH0.i iVar5 = this.f112865A;
        String strB = null;
        if (iVar5 != null) {
            MultiCoverConfig multiCoverConfig5 = iVar5.f12745c;
            strB = null;
            if (multiCoverConfig5 != null) {
                OH0.b mainStrategy4 = multiCoverConfig5.getMainStrategy();
                strB = null;
                if (mainStrategy4 != null) {
                    strB = mainStrategy4.b();
                }
            }
        }
        if (Intrinsics.areEqual(strB, "4:3_16:9")) {
            return;
        }
        X6().f112883f.setVisibility(8);
        X6().f112883f.setEnabled(false);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    public final void b7() {
        MultiCoverDraft multiCoverDraftE;
        KH0.i iVar = this.f112865A;
        if (iVar == null) {
            return;
        }
        SharedPreferencesHelper sharedPreferencesHelper = JH0.a.f11357a;
        String subCoverKey = iVar.f12745c.getSubCoverKey();
        if (subCoverKey == null || (multiCoverDraftE = JH0.a.e(iVar.f12745c.getSubCoverKey())) == null) {
            return;
        }
        JH0.a.h(iVar, multiCoverDraftE);
        JH0.a.f(subCoverKey, multiCoverDraftE, multiCoverDraftE.getConfig(), false);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    @Deprecated(message = "Deprecated in Java")
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        super.onActivityResult(i7, i8, intent);
        if (i8 == -1) {
            if (i7 == this.f112875x) {
                String stringExtra = intent != null ? intent.getStringExtra("output_image_path") : null;
                X6().f112885i.setImageCover(stringExtra);
                X6().f112885i.setSelectImage(true);
                P6(stringExtra);
                X6().f112887k.kf();
                Q6();
            }
            if (i7 == 2234 && intent != null && intent.getBooleanExtra("sub_cover_changed", false)) {
                this.f112871G = Y6();
                KH0.i iVar = this.f112865A;
                MultiCoverDraft multiCoverDraftM10652clone = null;
                if (iVar != null) {
                    MultiCoverDraft multiCoverDraft = iVar.f12747e;
                    multiCoverDraftM10652clone = null;
                    if (multiCoverDraft != null) {
                        multiCoverDraftM10652clone = multiCoverDraft.m10652clone();
                    }
                }
                this.f112877z = multiCoverDraftM10652clone;
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (!this.f112867C) {
            this.f112868D = false;
            super.onBackPressed();
        } else if (!Y6() && !this.f112871G) {
            this.f112868D = false;
            super.onBackPressed();
        } else {
            this.f112871G = false;
            MultiAlertDialog multiAlertDialog = new MultiAlertDialog();
            multiAlertDialog.f112863e = new b(this);
            multiAlertDialog.show(getSupportFragmentManager(), "exit");
        }
    }

    @Override // com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (NotchCompat.hasDisplayCutout(getWindow())) {
            NotchCompat.blockDisplayCutout(getWindow());
        }
        getWindow().setStatusBarColor(-15987700);
        setContentView(U6());
        this.f112876y = new a(this, this);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getMain(), (CoroutineStart) null, new MultiCoverActivity$prepareEnvReady$1(new M(this, 5), this, null), 2, (Object) null);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        String strOptString;
        MultiCoverConfig multiCoverConfig;
        MultiCoverConfig multiCoverConfig2;
        MultiCoverDraftService multiCoverDraftService;
        MultiCoverDraft multiCoverDraft;
        com.bilibili.studio.editor.moudle.caption.setting.widget.a aVar = this.f112869E;
        if (aVar != null) {
            aVar.a();
        }
        if (this.f112868D) {
            KH0.i iVar = this.f112865A;
            BLog.e("MultiCoverConfig", "initData: " + ((iVar == null || (multiCoverDraft = iVar.f12747e) == null) ? null : multiCoverDraft.getConfig()));
            KH0.i iVar2 = this.f112865A;
            if (iVar2 != null && (multiCoverDraftService = iVar2.f12757p) != null) {
                multiCoverDraftService.saveDraft();
            }
            KH0.i iVar3 = this.f112865A;
            String coverKey = (iVar3 == null || (multiCoverConfig2 = iVar3.f12745c) == null) ? null : multiCoverConfig2.getCoverKey();
            Lazy<KH0.j> lazy = KH0.j.f12760c;
            KH0.j jVarA = j.a.a();
            KH0.i iVar4 = this.f112865A;
            String coverKey2 = (iVar4 == null || (multiCoverConfig = iVar4.f12745c) == null) ? null : multiCoverConfig.getCoverKey();
            if (coverKey2 == null) {
                jVarA.getClass();
                strOptString = null;
            } else {
                strOptString = jVarA.f12762b.optString(coverKey2, (String) null);
            }
            SharedPreferencesHelper sharedPreferencesHelper = JH0.a.f11357a;
            JH0.a.a(coverKey, strOptString);
        }
        X6().f112885i.b();
        KH0.i iVar5 = this.f112865A;
        if (iVar5 != null) {
            iVar5.c();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onPause() {
        super.onPause();
        com.bilibili.studio.editor.moudle.caption.setting.widget.a aVar = this.f112869E;
        if (aVar != null) {
            aVar.f106004b = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010d  */
    @Override // androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResume() {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.cover_v2.ui.MultiCoverActivity.onResume():void");
    }
}
