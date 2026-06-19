package com.bilibili.upper.module.cover.ui;

import EH0.p;
import G3.C1933l;
import KH0.j;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.base.MainThread;
import com.bilibili.base.SharedPreferencesHelper;
import com.bilibili.bililive.room.ui.roomv3.gift.t;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.tf.TfCode;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.helper.NotchCompat;
import com.bilibili.studio.editor.timeline.UpperLiveWindowExt;
import com.bilibili.studio.videoeditor.exception.FileNotExistedError;
import com.bilibili.studio.videoeditor.util.C6645s;
import com.bilibili.teenagersmode.ui.RunnableC6653b;
import com.bilibili.upper.module.cover.entity.CoverEngineType;
import com.bilibili.upper.module.cover_v2.draft.MultiCoverDraft;
import com.bilibili.upper.module.cover_v2.model.MultiCoverConfig;
import com.bilibili.upper.module.cover_v2.service.MultiCoverDraftService;
import com.bilibili.upper.module.cover_v2.ui.MultiAlertDialog;
import com.bilibili.upper.module.cover_v2.ui.MultiCoverEditorView;
import com.bilibili.upper.module.cover_v2.ui.MultiCoverMenuFragment;
import com.bilibili.upper.module.cover_v2.ui.MultiCoverOperateView;
import com.bilibili.upper.module.cover_v2.widgets.MultiRatioPlaceHolderView;
import eJ0.C6929g;
import java.util.ArrayList;
import kntr.base.utils.foundation.CpuUtils;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.M;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover/ui/UpperCoverEditorActivity.class */
@StabilityInferred(parameters = 0)
public final class UpperCoverEditorActivity extends com.bilibili.lib.spy.generated.a implements com.bilibili.upper.module.cover_v2.ui.a {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final int f112688Y = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public MultiRatioPlaceHolderView f112689A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public MultiCoverEditorView f112690B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public MultiCoverOperateView f112691C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public MultiRatioPlaceHolderView f112692D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public MultiCoverEditorView f112693E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public MultiCoverOperateView f112694F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public ImageView f112695G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public TextView f112696H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public TextView f112697I;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @Nullable
    public KH0.i f112700L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    @Nullable
    public MultiCoverDraft f112701M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    @Nullable
    public KH0.i f112702N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    @Nullable
    public MultiCoverDraft f112703O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    @Nullable
    public MultiCoverDraft f112704P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    @Nullable
    public MultiCoverDraft f112705Q;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    @Nullable
    public Integer f112707S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    @Nullable
    public Integer f112708T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    @Nullable
    public OH0.b f112709U;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    @Nullable
    public com.bilibili.studio.editor.moudle.caption.setting.widget.a f112711W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f112712X;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ImageView f112713x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TextView f112714y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ImageView f112715z;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @NotNull
    public final Lazy f112698J = LazyKt.lazy(new C1933l(8));

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f112699K = true;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f112706R = true;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f112710V = true;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover/ui/UpperCoverEditorActivity$a.class */
    public static final class a implements MultiAlertDialog.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UpperCoverEditorActivity f112716a;

        public a(UpperCoverEditorActivity upperCoverEditorActivity) {
            this.f112716a = upperCoverEditorActivity;
        }

        @Override // com.bilibili.upper.module.cover_v2.ui.MultiAlertDialog.a
        public final void onConfirm() {
            UpperCoverEditorActivity upperCoverEditorActivity = this.f112716a;
            upperCoverEditorActivity.f112710V = false;
            upperCoverEditorActivity.finish();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    public static final void P6(UpperCoverEditorActivity upperCoverEditorActivity) {
        upperCoverEditorActivity.getClass();
        BLRouter.routeTo(new RouteRequest.Builder(Uri.parse("activity://uper/edit_cover/")).extras((Function1) new Object()).requestCode(TfCode.BVC_CONVERT_NETWORK_ERROR_VALUE).build(), upperCoverEditorActivity);
    }

    @Override // com.bilibili.upper.module.cover_v2.ui.a
    @Nullable
    public final KH0.i A5(@NotNull CoverEngineType coverEngineType) {
        return coverEngineType == CoverEngineType.MAIN ? this.f112700L : coverEngineType == CoverEngineType.SUB ? this.f112702N : null;
    }

    @Override // com.bilibili.upper.module.cover_v2.ui.a
    @Nullable
    public final KH0.i C3() {
        return this.f112706R ? this.f112700L : this.f112702N;
    }

    @Override // com.bilibili.upper.module.cover_v2.ui.a
    @NotNull
    public final com.bilibili.upper.module.cover_v2.presenter.a E5() {
        return V6().f112904e.f112947i;
    }

    public final void Q6(String str) {
        MultiCoverDraft multiCoverDraft;
        MultiCoverConfig config;
        com.bilibili.upper.module.cover_v2.service.c cVar;
        if (str == null) {
            return;
        }
        KH0.i iVarC3 = C3();
        if (iVarC3 != null && (cVar = iVarC3.f12755n) != null) {
            cVar.d();
        }
        KH0.i iVarC32 = C3();
        if (iVarC32 != null && (multiCoverDraft = iVarC32.f12747e) != null && (config = multiCoverDraft.getConfig()) != null) {
            config.setSelectedPath(str);
            config.updateConfigs();
            KH0.i iVarC33 = C3();
            if (iVarC33 != null) {
                iVarC33.f12746d.b(config);
            }
        }
        KH0.i iVarC34 = C3();
        if (iVarC34 != null) {
            KH0.i iVarC35 = C3();
            if (iVarC35 != null) {
                iVarC35.i();
            }
            LH0.a aVar = iVarC34.f12746d;
            double d7 = aVar.f14538c;
            com.bilibili.upper.module.cover_v2.service.b bVar = iVarC34.f12754m;
            bVar.b(d7);
            bVar.c(aVar.f14538c);
            MainThread.postOnMainThreadDelayed(new JK.a(iVarC34, 4), 100L);
        }
    }

    @Override // com.bilibili.upper.module.cover_v2.ui.a
    public final boolean R1() {
        return this.f112712X;
    }

    public final void R6() {
        MultiCoverConfig multiCoverConfig;
        int[] selectedMaterialSize;
        KH0.i iVarC3 = C3();
        if (iVarC3 == null || (multiCoverConfig = iVarC3.f12745c) == null || (selectedMaterialSize = multiCoverConfig.getSelectedMaterialSize()) == null) {
            return;
        }
        MultiCoverEditorView multiCoverEditorViewV5 = V5();
        int i7 = 0;
        if (selectedMaterialSize[0] < selectedMaterialSize[1]) {
            i7 = 1;
        }
        multiCoverEditorViewV5.setDimmedLayerType(i7);
    }

    public final void S6(MultiCoverConfig multiCoverConfig, MultiCoverDraft multiCoverDraft) {
        this.f112707S = Integer.valueOf(com.bilibili.upper.module.contribute.up.ui.e.a ? 1 : 0);
        Integer numValueOf = Integer.valueOf(multiCoverDraft.getDraftVersion());
        this.f112708T = numValueOf;
        if (Intrinsics.areEqual(this.f112707S, numValueOf)) {
            return;
        }
        BLog.e("UpperCoverActivity", "[version change] need clear data currentVersion = " + this.f112707S + " draftVersion = " + this.f112708T);
        String coverKey = multiCoverConfig.getCoverKey();
        multiCoverDraft.setConfig(null);
        multiCoverDraft.setCoverTransX(0.0d);
        multiCoverDraft.setCoverTransY(0.0d);
        multiCoverDraft.setCoverScaleX(0.0d);
        multiCoverDraft.setCoverScaleY(0.0d);
        multiCoverDraft.setCaptionList(new ArrayList());
        multiCoverDraft.setStickerList(new ArrayList());
        multiCoverDraft.setTemplateId(-10086);
        Integer num = this.f112707S;
        if (num != null) {
            multiCoverDraft.setDraftVersion(num.intValue());
        }
        SharedPreferencesHelper sharedPreferencesHelper = JH0.a.f11357a;
        JH0.a.j(coverKey, multiCoverDraft);
        multiCoverConfig.setInputImagePath("");
        String inputVideoPath = multiCoverConfig.getInputVideoPath();
        if (inputVideoPath != null) {
            multiCoverConfig.setSelectedPath(inputVideoPath);
        }
    }

    public final void T6() {
        MultiCoverConfig multiCoverConfig;
        MultiCoverConfig multiCoverConfig2;
        MultiCoverConfig multiCoverConfig3;
        com.bilibili.upper.module.cover_v2.service.c cVar;
        MultiCoverConfig multiCoverConfig4;
        SharedPreferencesHelper sharedPreferencesHelper = JH0.a.f11357a;
        KH0.i iVarC3 = C3();
        MultiCoverDraft multiCoverDraftE = JH0.a.e((iVarC3 == null || (multiCoverConfig4 = iVarC3.f12745c) == null) ? null : multiCoverConfig4.getSubCoverKey());
        if (multiCoverDraftE != null) {
            MultiCoverConfig config = multiCoverDraftE.getConfig();
            String inputImagePath = config != null ? config.getInputImagePath() : null;
            MultiCoverConfig config2 = multiCoverDraftE.getConfig();
            String inputVideoPath = config2 != null ? config2.getInputVideoPath() : null;
            MultiCoverConfig config3 = multiCoverDraftE.getConfig();
            String selectedPath = config3 != null ? config3.getSelectedPath() : null;
            KH0.i iVarC32 = C3();
            if (iVarC32 != null && (cVar = iVarC32.f12755n) != null) {
                cVar.d();
            }
            OH0.b bVar = this.f112709U;
            if (bVar != null) {
                p pVar = p.f4125a;
                Context baseContext = getApplication().getBaseContext();
                String strB = bVar.b();
                KH0.i iVarC33 = C3();
                String subCoverKey = (iVarC33 == null || (multiCoverConfig3 = iVarC33.f12745c) == null) ? null : multiCoverConfig3.getSubCoverKey();
                KH0.i iVarC34 = C3();
                String pageFrom = (iVarC34 == null || (multiCoverConfig2 = iVarC34.f12745c) == null) ? null : multiCoverConfig2.getPageFrom();
                KH0.i iVarC35 = C3();
                String inputTypeId = (iVarC35 == null || (multiCoverConfig = iVarC35.f12745c) == null) ? null : multiCoverConfig.getInputTypeId();
                pVar.getClass();
                p.a(baseContext);
                Bundle bundleE = p.e(strB, subCoverKey, inputImagePath, inputVideoPath, selectedPath, p.f4129e, pageFrom, inputTypeId);
                Intent intent = new Intent();
                intent.putExtra("param_control", bundleE);
                p.f4126b = false;
                MultiCoverConfig multiCoverConfig5 = new MultiCoverConfig();
                multiCoverConfig5.parseIntent(intent, false);
                S6(multiCoverConfig5, multiCoverDraftE);
                if (multiCoverDraftE.getConfig() == null) {
                    multiCoverDraftE.setConfig(new MultiCoverConfig());
                }
                MultiCoverConfig config4 = multiCoverDraftE.getConfig();
                multiCoverConfig5.setCurrentSeekTime(config4 != null ? config4.getCurrentSeekTime() : 0L);
                JH0.a.g(multiCoverDraftE.getConfig(), multiCoverConfig5);
                MultiCoverConfig config5 = multiCoverDraftE.getConfig();
                if (config5 != null) {
                    config5.setMainStrategy(multiCoverConfig5.getMainStrategy());
                }
                a7(new t(1, this, multiCoverDraftE));
                KH0.i iVar = this.f112702N;
                if (iVar == null || !iVar.h()) {
                    return;
                }
                MultiCoverEditorView multiCoverEditorView = this.f112693E;
                if (multiCoverEditorView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("subCoverEditorView");
                    multiCoverEditorView = null;
                }
                multiCoverEditorView.a(this.f112702N);
                ((ArrayList) SH0.b.f22898d).clear();
                p.f4131g = true;
                BLog.e("UpperCoverActivity", "initSubCoverData: " + multiCoverDraftE.getConfig());
            }
        }
    }

    @Override // com.bilibili.upper.module.cover_v2.ui.a
    @NotNull
    public final UpperLiveWindowExt U5() {
        return V5().getLiveWindow();
    }

    @NotNull
    public final MultiCoverOperateView U6() {
        MultiCoverOperateView multiCoverOperateView;
        String str;
        if (this.f112706R) {
            MultiCoverOperateView multiCoverOperateView2 = this.f112691C;
            multiCoverOperateView = multiCoverOperateView2;
            if (multiCoverOperateView2 == null) {
                str = "mainCoverOperateView";
                Intrinsics.throwUninitializedPropertyAccessException(str);
                multiCoverOperateView = null;
            }
        } else {
            MultiCoverOperateView multiCoverOperateView3 = this.f112694F;
            multiCoverOperateView = multiCoverOperateView3;
            if (multiCoverOperateView3 == null) {
                str = "subCoverOperateView";
                Intrinsics.throwUninitializedPropertyAccessException(str);
                multiCoverOperateView = null;
            }
        }
        return multiCoverOperateView;
    }

    @Override // com.bilibili.upper.module.cover_v2.ui.a
    @NotNull
    public final MultiCoverEditorView V5() {
        MultiCoverEditorView multiCoverEditorView;
        String str;
        if (this.f112706R) {
            MultiCoverEditorView multiCoverEditorView2 = this.f112690B;
            multiCoverEditorView = multiCoverEditorView2;
            if (multiCoverEditorView2 == null) {
                str = "mainCoverEditorView";
                Intrinsics.throwUninitializedPropertyAccessException(str);
                multiCoverEditorView = null;
            }
        } else {
            MultiCoverEditorView multiCoverEditorView3 = this.f112693E;
            multiCoverEditorView = multiCoverEditorView3;
            if (multiCoverEditorView3 == null) {
                str = "subCoverEditorView";
                Intrinsics.throwUninitializedPropertyAccessException(str);
                multiCoverEditorView = null;
            }
        }
        return multiCoverEditorView;
    }

    public final MultiCoverMenuFragment V6() {
        return (MultiCoverMenuFragment) this.f112698J.getValue();
    }

    public final boolean X6() {
        MultiCoverDraft multiCoverDraft;
        MultiCoverDraft multiCoverDraft2;
        KH0.i iVar = this.f112700L;
        boolean zEquals = (iVar == null || (multiCoverDraft2 = iVar.f12747e) == null) ? true : multiCoverDraft2.equals(this.f112701M);
        KH0.i iVar2 = this.f112702N;
        boolean zEquals2 = (iVar2 == null || (multiCoverDraft = iVar2.f12747e) == null) ? true : multiCoverDraft.equals(this.f112703O);
        boolean z6 = true;
        if (zEquals) {
            z6 = !zEquals2;
        }
        return z6;
    }

    public final boolean Y6() {
        MultiCoverConfig multiCoverConfig;
        KH0.i iVar = this.f112702N;
        if (iVar != null) {
            MultiCoverDraft multiCoverDraft = iVar.f12747e;
            boolean z6 = false;
            if (multiCoverDraft != null) {
                z6 = false;
                if (multiCoverDraft.getHasEdit()) {
                    z6 = true;
                }
            }
            return z6;
        }
        SharedPreferencesHelper sharedPreferencesHelper = JH0.a.f11357a;
        KH0.i iVar2 = this.f112700L;
        MultiCoverDraft multiCoverDraftE = JH0.a.e((iVar2 == null || (multiCoverConfig = iVar2.f12745c) == null) ? null : multiCoverConfig.getSubCoverKey());
        boolean z7 = false;
        if (multiCoverDraftE != null) {
            z7 = false;
            if (multiCoverDraftE.getHasEdit()) {
                z7 = true;
            }
        }
        return z7;
    }

    public final void a7(Function0<Unit> function0) {
        try {
            function0.invoke();
        } catch (FileNotExistedError e7) {
            C6645s.b(this, 2131850725, null);
            BLog.e("UpperCoverActivity", e7.getMessage());
            C6929g.b("0", "");
        } catch (NullPointerException e8) {
            C6645s.b(this, 2131850732, null);
            BLog.e("UpperCoverActivity", "onCreate start ms init sdk IStreamingContext null");
        } catch (UnsatisfiedLinkError e9) {
            C6645s.b(this, CpuUtils.isX86(this) ? 2131850729 : 2131856244, null);
            M.b("onCreate start ms init sdk error: ", e9.getLocalizedMessage(), "UpperCoverActivity");
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    public final void b7(KH0.i iVar) {
        if (iVar != null) {
            SharedPreferencesHelper sharedPreferencesHelper = JH0.a.f11357a;
            JH0.a.d(iVar);
            Unit unit = Unit.INSTANCE;
            MultiCoverDraft multiCoverDraftE = JH0.a.e(iVar.f12745c.getSubCoverKey());
            if (multiCoverDraftE != null) {
                KH0.i iVar2 = this.f112702N;
                if (iVar2 != null) {
                    iVar2.f12747e = multiCoverDraftE;
                    iVar2.f12745c = multiCoverDraftE.getConfig();
                    iVar2.f12754m.f112851b = multiCoverDraftE;
                    iVar2.f12755n.f112854b = multiCoverDraftE;
                    iVar2.f12756o.f112860b = multiCoverDraftE;
                    iVar2.f12757p.setDraftInfo(multiCoverDraftE);
                }
                KH0.i iVar3 = this.f112702N;
                if (iVar3 != null) {
                    iVar3.i();
                }
                KH0.i iVar4 = this.f112702N;
                if (iVar4 != null) {
                    iVar4.m();
                }
            }
            BLog.e("UpperCoverActivity", "generateSubDraft result is " + unit);
        }
    }

    public final void c7(boolean z6) {
        this.f112706R = z6;
        MultiRatioPlaceHolderView multiRatioPlaceHolderView = this.f112689A;
        MultiRatioPlaceHolderView multiRatioPlaceHolderView2 = multiRatioPlaceHolderView;
        if (multiRatioPlaceHolderView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainCoverParent");
            multiRatioPlaceHolderView2 = null;
        }
        bG0.g.c(multiRatioPlaceHolderView2, z6);
        MultiCoverOperateView multiCoverOperateView = this.f112691C;
        MultiCoverOperateView multiCoverOperateView2 = multiCoverOperateView;
        if (multiCoverOperateView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainCoverOperateView");
            multiCoverOperateView2 = null;
        }
        multiCoverOperateView2.c(z6);
        MultiRatioPlaceHolderView multiRatioPlaceHolderView3 = this.f112692D;
        MultiRatioPlaceHolderView multiRatioPlaceHolderView4 = multiRatioPlaceHolderView3;
        if (multiRatioPlaceHolderView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("subCoverParent");
            multiRatioPlaceHolderView4 = null;
        }
        boolean z7 = !z6;
        bG0.g.c(multiRatioPlaceHolderView4, z7);
        MultiCoverOperateView multiCoverOperateView3 = this.f112694F;
        MultiCoverOperateView multiCoverOperateView4 = multiCoverOperateView3;
        if (multiCoverOperateView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("subCoverOperateView");
            multiCoverOperateView4 = null;
        }
        multiCoverOperateView4.c(z7);
        TextView textView = this.f112696H;
        TextView textView2 = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainModifyTv");
            textView2 = null;
        }
        textView2.setSelected(z6);
        TextView textView3 = this.f112697I;
        TextView textView4 = textView3;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("subModifyTv");
            textView4 = null;
        }
        textView4.setSelected(z7);
        MultiCoverEditorView multiCoverEditorView = this.f112690B;
        MultiCoverEditorView multiCoverEditorView2 = multiCoverEditorView;
        if (multiCoverEditorView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainCoverEditorView");
            multiCoverEditorView2 = null;
        }
        multiCoverEditorView2.getLiveWindow().setSurfaceZOrderMediaOverlay(z6);
        MultiCoverEditorView multiCoverEditorView3 = this.f112693E;
        if (multiCoverEditorView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("subCoverEditorView");
            multiCoverEditorView3 = null;
        }
        multiCoverEditorView3.getLiveWindow().setSurfaceZOrderMediaOverlay(z7);
    }

    public final void d7() {
        KH0.i iVar;
        MultiCoverDraft multiCoverDraft;
        KH0.i iVar2 = this.f112700L;
        if (((iVar2 == null || (multiCoverDraft = iVar2.f12759r) == null) ? true : multiCoverDraft.equals(iVar2.f12747e)) || (iVar = this.f112700L) == null) {
            return;
        }
        iVar.f12758q = System.currentTimeMillis();
    }

    public final void e7() {
        MultiCoverDraft multiCoverDraft;
        MultiCoverDraft multiCoverDraft2;
        KH0.i iVar = this.f112702N;
        if ((iVar == null || (multiCoverDraft2 = iVar.f12759r) == null) ? true : multiCoverDraft2.equals(iVar.f12747e)) {
            return;
        }
        KH0.i iVar2 = this.f112702N;
        if (iVar2 != null) {
            iVar2.f12758q = System.currentTimeMillis();
        }
        KH0.i iVar3 = this.f112702N;
        if (iVar3 != null && (multiCoverDraft = iVar3.f12747e) != null) {
            multiCoverDraft.setHasEdit(true);
        }
        this.f112712X = true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    @Deprecated(message = "Deprecated in Java")
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        super.onActivityResult(i7, i8, intent);
        if (i8 == -1 && i7 == 10001) {
            String stringExtra = intent != null ? intent.getStringExtra("output_image_path") : null;
            U6().setImageCover(stringExtra);
            U6().setSelectImage(true);
            Q6(stringExtra);
            V6().kf();
            R6();
            if (this.f112706R) {
                SharedPreferencesHelper sharedPreferencesHelper = JH0.a.f11357a;
                JH0.a.i(this.f112700L, this.f112702N, this.f112712X);
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (!X6()) {
            super.onBackPressed();
            return;
        }
        MultiAlertDialog multiAlertDialog = new MultiAlertDialog();
        multiAlertDialog.f112863e = new a(this);
        multiAlertDialog.show(getSupportFragmentManager(), "exit");
    }

    @Override // com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (NotchCompat.hasDisplayCutout(getWindow())) {
            NotchCompat.blockDisplayCutout(getWindow());
        }
        getWindow().setStatusBarColor(-15987700);
        setContentView(2131502799);
        this.f112713x = (ImageView) findViewById(2131317991);
        this.f112714y = (TextView) findViewById(2131318220);
        this.f112715z = (ImageView) findViewById(2131322004);
        this.f112689A = (MultiRatioPlaceHolderView) findViewById(2131321325);
        this.f112690B = (MultiCoverEditorView) findViewById(2131321323);
        this.f112691C = (MultiCoverOperateView) findViewById(2131321324);
        this.f112692D = (MultiRatioPlaceHolderView) findViewById(2131321333);
        this.f112693E = (MultiCoverEditorView) findViewById(2131321331);
        this.f112694F = (MultiCoverOperateView) findViewById(2131321332);
        this.f112695G = (ImageView) findViewById(2131321316);
        this.f112696H = (TextView) findViewById(2131321337);
        this.f112697I = (TextView) findViewById(2131321338);
        Bundle bundleExtra = getIntent().getBundleExtra("param_control");
        String strM = (bundleExtra != null ? bundleExtra.getInt("cover_from_where", 0) : 0) == 1 ? zw0.b.m("edit_qa_url", "https://www.bilibili.com/blackboard/era/PrY0YJ2aOsOZODSl.html") : zw0.b.m("publish_qa_url", "https://www.bilibili.com/blackboard/era/FYdzH0syeShX017i.html");
        if (strM.length() > 0) {
            ImageView imageView = this.f112715z;
            ImageView imageView2 = imageView;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivQaHelp");
                imageView2 = null;
            }
            imageView2.setVisibility(0);
            ImageView imageView3 = this.f112715z;
            ImageView imageView4 = imageView3;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivQaHelp");
                imageView4 = null;
            }
            imageView4.setOnClickListener(new g(0, strM, this));
        }
        c7(true);
        MultiCoverOperateView multiCoverOperateView = this.f112691C;
        MultiCoverOperateView multiCoverOperateView2 = multiCoverOperateView;
        if (multiCoverOperateView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainCoverOperateView");
            multiCoverOperateView2 = null;
        }
        multiCoverOperateView2.f112914e.f112915a.setBackground(null);
        MultiCoverOperateView multiCoverOperateView3 = this.f112694F;
        MultiCoverOperateView multiCoverOperateView4 = multiCoverOperateView3;
        if (multiCoverOperateView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("subCoverOperateView");
            multiCoverOperateView4 = null;
        }
        multiCoverOperateView4.f112914e.f112915a.setBackground(null);
        SpannableString spannableString = new SpannableString(getString(2131849231));
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getMain(), (CoroutineStart) null, new UpperCoverEditorActivity$prepareEnvReady$1(new Az.e(this, 3), this, null), 2, (Object) null);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        String strOptString;
        String strOptString2;
        MultiCoverDraft multiCoverDraftE;
        MultiCoverConfig multiCoverConfig;
        MultiCoverConfig multiCoverConfig2;
        MultiCoverDraftService multiCoverDraftService;
        MultiCoverDraft multiCoverDraft;
        MultiCoverDraft multiCoverDraftE2;
        MultiCoverConfig multiCoverConfig3;
        MultiCoverConfig multiCoverConfig4;
        MultiCoverDraftService multiCoverDraftService2;
        MultiCoverDraft multiCoverDraft2;
        MultiCoverDraft multiCoverDraft3;
        com.bilibili.studio.editor.moudle.caption.setting.widget.a aVar = this.f112711W;
        if (aVar != null) {
            aVar.a();
        }
        if (this.f112710V) {
            KH0.i iVar = this.f112700L;
            if (iVar != null && (multiCoverDraft3 = iVar.f12747e) != null) {
                multiCoverDraft3.getDraftVersion();
            }
            KH0.i iVar2 = this.f112700L;
            BLog.e("UpperCoverActivity", "saveMainCoverDraft: " + ((iVar2 == null || (multiCoverDraft2 = iVar2.f12747e) == null) ? null : multiCoverDraft2.getConfig()));
            KH0.i iVar3 = this.f112700L;
            if (iVar3 != null && (multiCoverDraftService2 = iVar3.f12757p) != null) {
                multiCoverDraftService2.saveDraft();
            }
            KH0.i iVar4 = this.f112700L;
            String coverKey = (iVar4 == null || (multiCoverConfig4 = iVar4.f12745c) == null) ? null : multiCoverConfig4.getCoverKey();
            Lazy<KH0.j> lazy = KH0.j.f12760c;
            KH0.j jVarA = j.a.a();
            KH0.i iVar5 = this.f112700L;
            String coverKey2 = (iVar5 == null || (multiCoverConfig3 = iVar5.f12745c) == null) ? null : multiCoverConfig3.getCoverKey();
            if (coverKey2 == null) {
                jVarA.getClass();
                strOptString = null;
            } else {
                strOptString = jVarA.f12762b.optString(coverKey2, (String) null);
            }
            SharedPreferencesHelper sharedPreferencesHelper = JH0.a.f11357a;
            if (coverKey != null && strOptString != null && (multiCoverDraftE2 = JH0.a.e(coverKey)) != null) {
                MultiCoverConfig config = multiCoverDraftE2.getConfig();
                if (config != null) {
                    config.setCoverKey(strOptString);
                }
                JH0.a.f(strOptString, multiCoverDraftE2, multiCoverDraftE2.getConfig(), false);
            }
            KH0.i iVar6 = this.f112702N;
            BLog.e("UpperCoverActivity", "saveSubCoverDraft: " + ((iVar6 == null || (multiCoverDraft = iVar6.f12747e) == null) ? null : multiCoverDraft.getConfig()));
            KH0.i iVar7 = this.f112702N;
            if (iVar7 != null && (multiCoverDraftService = iVar7.f12757p) != null) {
                multiCoverDraftService.saveDraft();
            }
            KH0.i iVar8 = this.f112702N;
            String coverKey3 = (iVar8 == null || (multiCoverConfig2 = iVar8.f12745c) == null) ? null : multiCoverConfig2.getCoverKey();
            KH0.j jVarA2 = j.a.a();
            KH0.i iVar9 = this.f112700L;
            String coverKey4 = (iVar9 == null || (multiCoverConfig = iVar9.f12745c) == null) ? null : multiCoverConfig.getCoverKey();
            if (coverKey4 == null) {
                jVarA2.getClass();
                strOptString2 = null;
            } else {
                strOptString2 = jVarA2.f12762b.optString(coverKey4, (String) null);
            }
            String subCoverKey = MultiCoverConfig.getSubCoverKey(strOptString2);
            if (coverKey3 != null && subCoverKey != null && (multiCoverDraftE = JH0.a.e(coverKey3)) != null) {
                MultiCoverConfig config2 = multiCoverDraftE.getConfig();
                if (config2 != null) {
                    config2.setCoverKey(subCoverKey);
                }
                JH0.a.f(subCoverKey, multiCoverDraftE, multiCoverDraftE.getConfig(), false);
            }
        } else {
            MultiCoverDraft multiCoverDraft4 = this.f112704P;
            if (multiCoverDraft4 != null) {
                SharedPreferencesHelper sharedPreferencesHelper2 = JH0.a.f11357a;
                JH0.a.j(multiCoverDraft4.getConfig().getCoverKey(), multiCoverDraft4);
            }
            MultiCoverDraft multiCoverDraft5 = this.f112705Q;
            if (multiCoverDraft5 != null) {
                SharedPreferencesHelper sharedPreferencesHelper3 = JH0.a.f11357a;
                JH0.a.j(multiCoverDraft5.getConfig().getCoverKey(), multiCoverDraft5);
            }
        }
        KH0.i iVar10 = this.f112700L;
        if (iVar10 != null) {
            iVar10.c();
        }
        MultiCoverOperateView multiCoverOperateView = this.f112691C;
        MultiCoverOperateView multiCoverOperateView2 = multiCoverOperateView;
        if (multiCoverOperateView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainCoverOperateView");
            multiCoverOperateView2 = null;
        }
        multiCoverOperateView2.b();
        KH0.i iVar11 = this.f112702N;
        if (iVar11 != null) {
            iVar11.c();
        }
        MultiCoverOperateView multiCoverOperateView3 = this.f112694F;
        if (multiCoverOperateView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("subCoverOperateView");
            multiCoverOperateView3 = null;
        }
        multiCoverOperateView3.b();
        p.f4125a.getClass();
        p.h = false;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onPause() {
        super.onPause();
        com.bilibili.studio.editor.moudle.caption.setting.widget.a aVar = this.f112711W;
        if (aVar != null) {
            aVar.f106004b = null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onResume() {
        MultiCoverConfig multiCoverConfig;
        super.onResume();
        KH0.i iVarC3 = C3();
        if (iVarC3 != null && (multiCoverConfig = iVarC3.f12745c) != null) {
            TE0.b bVar = TE0.b.f24088a;
            String pageFrom = multiCoverConfig.getPageFrom();
            boolean z6 = this.f112706R;
            String strE = multiCoverConfig.getMainStrategy().e();
            bVar.getClass();
            TE0.b.F(z6 ? 1 : 0, pageFrom, strE);
        }
        U6().postDelayed(new RunnableC6653b(this), 100L);
    }
}
