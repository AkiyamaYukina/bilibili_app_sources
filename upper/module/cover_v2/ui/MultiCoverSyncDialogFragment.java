package com.bilibili.upper.module.cover_v2.ui;

import X50.q0;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.DialogFragment;
import com.bilibili.app.authorspace.ui.J1;
import com.bilibili.base.SharedPreferencesHelper;
import com.bilibili.bplus.followingpublish.fragments.B0;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.studio.editor.moudle.caption.v1.BPointF;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.repository.data.BiliEditorStickerInfo;
import com.bilibili.studio.editor.timeline.UpperLiveWindowExt;
import com.bilibili.studio.videoeditor.editor.editdata.PointF;
import com.bilibili.upper.module.cover_v2.draft.MultiCoverDraft;
import com.bilibili.upper.module.cover_v2.model.MultiCoverConfig;
import com.bilibili.upper.module.cover_v2.service.MultiCoverDraftService;
import com.mall.ui.page.ip.view.j1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/ui/MultiCoverSyncDialogFragment.class */
@StabilityInferred(parameters = 0)
public final class MultiCoverSyncDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BiliImageView f112929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BiliImageView f112930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Button f112931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Button f112932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Function1<? super DialogFragment, Unit> f112933f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Function1<? super DialogFragment, Unit> f112934g;

    @Nullable
    public KH0.i h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public UpperLiveWindowExt f112935i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f112936j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f112937k = -1.0f;

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        if (bundle != null) {
            dismissAllowingStateLoss();
            return null;
        }
        View viewInflate = layoutInflater.inflate(2131502719, viewGroup, false);
        ViewParent parent = viewInflate != null ? viewInflate.getParent() : null;
        ViewGroup viewGroup2 = null;
        if (parent instanceof ViewGroup) {
            viewGroup2 = (ViewGroup) parent;
        }
        if (viewGroup2 != null) {
            viewGroup2.removeView(viewInflate);
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        KH0.i iVar;
        KH0.i iVar2;
        KH0.i iVar3;
        MultiCoverDraftService multiCoverDraftService;
        Window window;
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            J1.a(window, 0).dimAmount = 0.5f;
            window.getAttributes().gravity = 80;
            window.getAttributes().width = getResources().getDisplayMetrics().widthPixels - Jf1.h.c(10);
            window.getAttributes().y = Jf1.h.c(5);
        }
        EH0.p.f4125a.getClass();
        EH0.p.f4131g = true;
        this.f112929b = view.findViewById(2131320999);
        this.f112930c = view.findViewById(2131321000);
        this.f112931d = (Button) view.findViewById(2131320983);
        this.f112932e = (Button) view.findViewById(2131320982);
        Button button = this.f112931d;
        Button button2 = button;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnSync");
            button2 = null;
        }
        button2.setOnClickListener(new B0(this, 2));
        Button button3 = this.f112932e;
        Button button4 = button3;
        if (button3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnCustomize");
            button4 = null;
        }
        button4.setOnClickListener(new OT0.b(this, 2));
        ImageView imageView = this.f112929b;
        ImageView imageView2 = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imv43Ratio");
            imageView2 = null;
        }
        final int i7 = 0;
        imageView2.post(new Runnable(this, i7) { // from class: com.bilibili.upper.module.cover_v2.ui.p

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f112972a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f112973b;

            {
                this.f112972a = i7;
                this.f112973b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (this.f112972a) {
                    case 0:
                        ImageView imageView3 = ((MultiCoverSyncDialogFragment) this.f112973b).f112929b;
                        ImageView imageView4 = imageView3;
                        if (imageView3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("imv43Ratio");
                            imageView4 = null;
                        }
                        int width = imageView4.getWidth();
                        if (width > 0) {
                            int i8 = (int) (width / 1.3333334f);
                            ViewGroup.LayoutParams layoutParams = imageView4.getLayoutParams();
                            layoutParams.height = i8;
                            imageView4.setLayoutParams(layoutParams);
                        }
                        break;
                    default:
                        KQ0.e.l(2131830593, ((j1) this.f112973b).d(), 2131830617);
                        break;
                }
            }
        });
        ImageView imageView3 = this.f112930c;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imv169Ratio");
            imageView3 = null;
        }
        imageView3.post(new Runnable(this) { // from class: com.bilibili.upper.module.cover_v2.ui.q

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MultiCoverSyncDialogFragment f112974a;

            {
                this.f112974a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ImageView imageView4 = this.f112974a.f112930c;
                ImageView imageView5 = imageView4;
                if (imageView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imv169Ratio");
                    imageView5 = null;
                }
                int width = imageView5.getWidth();
                if (width > 0) {
                    int i8 = (int) (width / 1.7777778f);
                    ViewGroup.LayoutParams layoutParams = imageView5.getLayoutParams();
                    layoutParams.height = i8;
                    imageView5.setLayoutParams(layoutParams);
                }
            }
        });
        String strF = EH0.p.f(requireContext(), true);
        if (strF != null && (iVar3 = this.h) != null && (multiCoverDraftService = iVar3.f12757p) != null) {
            multiCoverDraftService.generateCover(this.f112937k, strF, false, new q0(this, 1));
        }
        if (!this.f112936j) {
            if (this.f112935i == null || (iVar = this.h) == null) {
                return;
            }
            SharedPreferencesHelper sharedPreferencesHelper = JH0.a.f11357a;
            MultiCoverDraft multiCoverDraftE = JH0.a.e(iVar.f12745c.getSubCoverKey());
            MultiCoverDraft multiCoverDraftE2 = multiCoverDraftE;
            if (multiCoverDraftE == null) {
                JH0.a.d(iVar);
                multiCoverDraftE2 = JH0.a.e(iVar.f12745c.getSubCoverKey());
            }
            if (multiCoverDraftE2 != null) {
                JH0.a.h(iVar, multiCoverDraftE2);
                iVar.f12757p.generateSubCover(this.f112935i, multiCoverDraftE2, 1.7777778f, false, new BJ.d<>(this, 2));
                return;
            }
            return;
        }
        if (this.f112935i == null || (iVar2 = this.h) == null) {
            return;
        }
        MultiCoverDraft multiCoverDraft = new MultiCoverDraft();
        SharedPreferencesHelper sharedPreferencesHelper2 = JH0.a.f11357a;
        MultiCoverDraft multiCoverDraft2 = iVar2.f12747e;
        MultiCoverConfig multiCoverConfig = new MultiCoverConfig();
        JH0.a.g(multiCoverConfig, iVar2.f12745c);
        multiCoverConfig.setCoverKey(iVar2.f12745c.getSubCoverKey());
        multiCoverDraft.setConfig(multiCoverConfig);
        multiCoverDraft.setTemplateId(multiCoverDraft2.getTemplateId());
        OH0.a aVarA = iVar2.f12745c.getMainStrategy().a();
        if (aVarA != null) {
            int[] videoSize = iVar2.f12745c.getVideoSize();
            int i8 = videoSize != null ? videoSize[0] : KH0.e.f12733a;
            int[] videoSize2 = iVar2.f12745c.getVideoSize();
            int i9 = videoSize2 != null ? videoSize2[1] : KH0.e.f12733a;
            float f7 = i8;
            float f8 = i9;
            aVarA.a(f7, f8, f7, f8);
            multiCoverDraft.setCoverScaleX(aVarA.c(multiCoverDraft2.getCoverScaleX()));
            multiCoverDraft.setCoverScaleY(aVarA.c(multiCoverDraft2.getCoverScaleY()));
            multiCoverDraft.setCoverTransX(aVarA.d((float) multiCoverDraft2.getCoverTransX()));
            multiCoverDraft.setCoverTransY((float) multiCoverDraft2.getCoverTransY());
            for (CaptionInfo captionInfo : multiCoverDraft2.getCaptionList()) {
                CaptionInfo captionInfoMo9886clone = captionInfo.mo9886clone();
                captionInfoMo9886clone.pos = new BPointF(aVarA.d(captionInfo.pos.f106027x), captionInfo.pos.f106028y);
                captionInfoMo9886clone.captionScale = (float) aVarA.c(captionInfo.captionScale);
                captionInfoMo9886clone.fontSize = (float) aVarA.b(captionInfo.fontSize);
                BPointF bPointF = captionInfo.boundingRectPos;
                if (bPointF != null) {
                    captionInfoMo9886clone.boundingRectPos = new BPointF(aVarA.d(bPointF.f106027x), captionInfo.boundingRectPos.f106028y);
                }
                multiCoverDraft.getCaptionList().add(captionInfoMo9886clone);
            }
            for (BiliEditorStickerInfo biliEditorStickerInfo : multiCoverDraft2.getStickerList()) {
                BiliEditorStickerInfo biliEditorStickerInfoMo9886clone = biliEditorStickerInfo.mo9886clone();
                biliEditorStickerInfoMo9886clone.setTranslationPointF(new PointF(aVarA.d(biliEditorStickerInfo.getTranslationPointF().f109462x), biliEditorStickerInfo.getTranslationPointF().f109463y));
                biliEditorStickerInfoMo9886clone.setScaleFactor((float) aVarA.c(biliEditorStickerInfo.getScaleFactor()));
                multiCoverDraft.getStickerList().add(biliEditorStickerInfoMo9886clone);
            }
        }
        iVar2.f12757p.generateSubCover(this.f112935i, multiCoverDraft, 1.7777778f, false, new BJ.e<>(this, 2));
    }
}
