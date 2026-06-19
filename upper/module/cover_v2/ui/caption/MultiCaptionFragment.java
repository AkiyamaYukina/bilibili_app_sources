package com.bilibili.upper.module.cover_v2.ui.caption;

import A50.L;
import KH0.c;
import KH0.f;
import KH0.h;
import KH0.i;
import PH0.m;
import UC0.n;
import UC0.p;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.g;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import ax0.d;
import bx0.C5169b;
import bx0.C5170c;
import bx0.C5171d;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.lib.ui.mixin.Flag;
import com.bilibili.studio.editor.moudle.caption.setting.presenter.e;
import com.bilibili.studio.editor.moudle.caption.setting.ui.BiliEditorCaptionStyleFragment;
import com.bilibili.studio.editor.moudle.caption.setting.ui.BiliEditorCaptionTemplateFragment;
import com.bilibili.studio.editor.moudle.caption.setting.ui.v2.BiliEditorCaptionFontV2Fragment;
import com.bilibili.studio.editor.moudle.caption.setting.ui.v3.BiliEditorCaptionFlowerFragment;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionBean;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import com.bilibili.studio.editor.moudle.caption.v1.net.SubtitleWithCategoryBean;
import com.bilibili.studio.videoeditor.bean.CaptionFontEntity;
import com.bilibili.studio.videoeditor.bean.EditorMaterialEntity;
import com.bilibili.studio.videoeditor.util.C6634g;
import com.bilibili.studio.videoeditor.util.V;
import com.bilibili.upper.module.cover_v2.presenter.MultiCoverCaptionSettingProxy;
import com.bilibili.upper.module.cover_v2.ui.caption.MultiCaptionFragment;
import com.bilibili.upper.module.cover_v2.widgets.MultiCaptionTextInputView;
import dx0.InterfaceC6891b;
import fA0.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.PagerSlidingTabStrip;
import tv.danmaku.bili.widget.SearchTagLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/ui/caption/MultiCaptionFragment.class */
@StabilityInferred(parameters = 0)
public final class MultiCaptionFragment extends BaseFragment implements InterfaceC6891b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BiliEditorCaptionStyleFragment f112941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BiliEditorCaptionTemplateFragment f112942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BiliEditorCaptionFontV2Fragment f112943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public BiliEditorCaptionFlowerFragment f112944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MultiCaptionTextInputView f112945f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ViewPager f112946g;

    @Nullable
    public View h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public MultiCoverCaptionSettingProxy f112948j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public List<? extends CaptionListItem> f112950l;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.bilibili.upper.module.cover_v2.presenter.a f112947i = new com.bilibili.upper.module.cover_v2.presenter.a(new c(this));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f112949k = "MultiCaptionPager";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/ui/caption/MultiCaptionFragment$a.class */
    public static final class a extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MultiCaptionFragment f112951a;

        public a(MultiCaptionFragment multiCaptionFragment) {
            this.f112951a = multiCaptionFragment;
        }

        @Override // KH0.h
        public final void a() {
            final MultiCaptionFragment multiCaptionFragment = this.f112951a;
            View view = multiCaptionFragment.getView();
            if (view != null) {
                view.post(new Runnable(multiCaptionFragment) { // from class: PH0.d

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final MultiCaptionFragment f18872a;

                    {
                        this.f18872a = multiCaptionFragment;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f18872a.jf(true);
                    }
                });
            }
        }

        @Override // KH0.h
        public final void b() {
            com.bilibili.upper.module.cover_v2.service.c cVar;
            MultiCaptionFragment multiCaptionFragment = this.f112951a;
            i iVarKf = multiCaptionFragment.kf();
            if (iVarKf != null && (cVar = iVarKf.f12755n) != null) {
                cVar.c();
            }
            multiCaptionFragment.f112947i.f();
        }

        @Override // KH0.h
        public final void c() {
            com.bilibili.upper.module.cover_v2.service.c cVar;
            MultiCaptionFragment multiCaptionFragment = this.f112951a;
            i iVarKf = multiCaptionFragment.kf();
            if (iVarKf != null && (cVar = iVarKf.f12755n) != null) {
                cVar.c();
            }
            multiCaptionFragment.f112947i.f();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/ui/caption/MultiCaptionFragment$b.class */
    public static final class b extends KH0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MultiCaptionFragment f112952a;

        public b(MultiCaptionFragment multiCaptionFragment) {
            this.f112952a = multiCaptionFragment;
        }

        @Override // KH0.b
        public final void a(CaptionInfo captionInfo) {
            this.f112952a.f112947i.f();
            e(captionInfo, true);
        }

        @Override // KH0.b
        public final void b() {
            this.f112952a.f112947i.f();
        }

        @Override // KH0.b
        public final void c() {
            this.f112952a.f112947i.f();
        }

        @Override // KH0.b
        public final void d() {
            this.f112952a.f112947i.f();
        }

        @Override // KH0.b
        public final void e(final CaptionInfo captionInfo, boolean z6) {
            Context context;
            final MultiCaptionFragment multiCaptionFragment = this.f112952a;
            InputMethodManager inputMethodManager = null;
            if (captionInfo != null) {
                MultiCaptionTextInputView multiCaptionTextInputView = multiCaptionFragment.f112945f;
                MultiCaptionTextInputView multiCaptionTextInputView2 = multiCaptionTextInputView;
                if (multiCaptionTextInputView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("inputView");
                    multiCaptionTextInputView2 = null;
                }
                multiCaptionTextInputView2.b(captionInfo, captionInfo.text.length());
                if (z6) {
                    int i7 = SH0.b.f22895a;
                    MultiCaptionTextInputView multiCaptionTextInputView3 = multiCaptionFragment.f112945f;
                    MultiCaptionTextInputView multiCaptionTextInputView4 = multiCaptionTextInputView3;
                    if (multiCaptionTextInputView3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("inputView");
                        multiCaptionTextInputView4 = null;
                    }
                    EditText editText = multiCaptionTextInputView4.getEditText();
                    if (editText != null && (context = editText.getContext()) != null && ((InputMethodManager) context.getSystemService("input_method")) != null && editText.isEnabled()) {
                        editText.requestFocus();
                        Context context2 = editText.getContext();
                        Object systemService = context2 != null ? context2.getSystemService("input_method") : null;
                        if (systemService instanceof InputMethodManager) {
                            inputMethodManager = (InputMethodManager) systemService;
                        }
                        if (inputMethodManager != null) {
                            inputMethodManager.showSoftInput(editText, 0);
                        }
                    }
                }
            } else {
                MultiCaptionTextInputView multiCaptionTextInputView5 = multiCaptionFragment.f112945f;
                MultiCaptionTextInputView multiCaptionTextInputView6 = multiCaptionTextInputView5;
                if (multiCaptionTextInputView5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("inputView");
                    multiCaptionTextInputView6 = null;
                }
                multiCaptionTextInputView6.setEtCaptionTextViewText(null);
                MultiCaptionTextInputView multiCaptionTextInputView7 = multiCaptionFragment.f112945f;
                MultiCaptionTextInputView multiCaptionTextInputView8 = multiCaptionTextInputView7;
                if (multiCaptionTextInputView7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("inputView");
                    multiCaptionTextInputView8 = null;
                }
                multiCaptionTextInputView8.getEditText().setText("");
                MultiCaptionTextInputView multiCaptionTextInputView9 = multiCaptionFragment.f112945f;
                MultiCaptionTextInputView multiCaptionTextInputView10 = multiCaptionTextInputView9;
                if (multiCaptionTextInputView9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("inputView");
                    multiCaptionTextInputView10 = null;
                }
                multiCaptionTextInputView10.getEditText().clearFocus();
                MultiCaptionTextInputView multiCaptionTextInputView11 = multiCaptionFragment.f112945f;
                if (multiCaptionTextInputView11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("inputView");
                    multiCaptionTextInputView11 = null;
                }
                multiCaptionTextInputView11.getEditText().post(new Runnable(multiCaptionFragment) { // from class: PH0.o

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final MultiCaptionFragment f18889a;

                    {
                        this.f18889a = multiCaptionFragment;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        MultiCaptionFragment multiCaptionFragment2 = this.f18889a;
                        int i8 = SH0.b.f22895a;
                        SH0.b.b(multiCaptionFragment2.p3());
                    }
                });
            }
            try {
                View view = multiCaptionFragment.getView();
                if (view != null) {
                    view.post(new Runnable(multiCaptionFragment, captionInfo) { // from class: PH0.b

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final MultiCaptionFragment f18868a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final CaptionInfo f18869b;

                        {
                            this.f18868a = multiCaptionFragment;
                            this.f18869b = captionInfo;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            MultiCaptionFragment multiCaptionFragment2 = this.f18868a;
                            CaptionInfo captionInfo2 = this.f18869b;
                            multiCaptionFragment2.f112947i.f();
                            BiliEditorCaptionStyleFragment biliEditorCaptionStyleFragment = multiCaptionFragment2.f112941b;
                            BiliEditorCaptionStyleFragment biliEditorCaptionStyleFragment2 = biliEditorCaptionStyleFragment;
                            if (biliEditorCaptionStyleFragment == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("styleFragment");
                                biliEditorCaptionStyleFragment2 = null;
                            }
                            biliEditorCaptionStyleFragment2.getClass();
                            cx0.a aVar = new cx0.a(0);
                            aVar.a = captionInfo2 != null ? Integer.valueOf(captionInfo2.idFont) : null;
                            aVar.b = captionInfo2 != null ? Integer.valueOf(captionInfo2.idFontColor) : null;
                            aVar.c = captionInfo2 != null ? Float.valueOf(captionInfo2.captionScale) : null;
                            aVar.d = captionInfo2 != null ? Integer.valueOf(captionInfo2.idOutLineColor) : null;
                            aVar.e = captionInfo2 != null ? Integer.valueOf((int) captionInfo2.outLineWidth) : null;
                            biliEditorCaptionStyleFragment2.qf(aVar);
                            BiliEditorCaptionTemplateFragment biliEditorCaptionTemplateFragment = multiCaptionFragment2.f112942c;
                            BiliEditorCaptionTemplateFragment biliEditorCaptionTemplateFragment2 = biliEditorCaptionTemplateFragment;
                            if (biliEditorCaptionTemplateFragment == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("templateFragment");
                                biliEditorCaptionTemplateFragment2 = null;
                            }
                            biliEditorCaptionTemplateFragment2.getClass();
                            biliEditorCaptionTemplateFragment2.f105818i = captionInfo2 == null;
                            biliEditorCaptionTemplateFragment2.rf(captionInfo2 != null ? captionInfo2.idTmp : -1);
                            BiliEditorCaptionFontV2Fragment biliEditorCaptionFontV2Fragment = multiCaptionFragment2.f112943d;
                            BiliEditorCaptionFontV2Fragment biliEditorCaptionFontV2Fragment2 = biliEditorCaptionFontV2Fragment;
                            if (biliEditorCaptionFontV2Fragment == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("fontFragment");
                                biliEditorCaptionFontV2Fragment2 = null;
                            }
                            biliEditorCaptionFontV2Fragment2.getClass();
                            biliEditorCaptionFontV2Fragment2.f105830i = captionInfo2 == null;
                            biliEditorCaptionFontV2Fragment2.rf(Integer.valueOf(captionInfo2 != null ? captionInfo2.idFont : -1), biliEditorCaptionFontV2Fragment2.f105826d, biliEditorCaptionFontV2Fragment2.f105827e);
                            BiliEditorCaptionFlowerFragment biliEditorCaptionFlowerFragment = multiCaptionFragment2.f112944e;
                            if (biliEditorCaptionFlowerFragment == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("flowerFragment");
                                biliEditorCaptionFlowerFragment = null;
                            }
                            biliEditorCaptionFlowerFragment.getClass();
                            boolean z7 = false;
                            if (captionInfo2 == null) {
                                z7 = true;
                            }
                            biliEditorCaptionFlowerFragment.f105894g = z7;
                            int i8 = -1;
                            if (captionInfo2 != null) {
                                i8 = captionInfo2.flowerId;
                            }
                            biliEditorCaptionFlowerFragment.sf(i8);
                        }
                    });
                }
            } catch (Exception e7) {
                e7.printStackTrace();
            }
        }
    }

    public final void jf(final boolean z6) {
        e eVar = com.bilibili.studio.editor.moudle.caption.setting.presenter.a.f105787b.f105788a;
        EditorMaterialEntity editorMaterialEntity = eVar != null ? eVar.f105793a.j().f57122a : null;
        if (editorMaterialEntity != null) {
            mf(editorMaterialEntity, z6);
        } else {
            Lazy<n> lazy = n.f24629b;
            n.a.a().d(new L(this, 1), new PH0.a(0, this), new Function1(this, z6) { // from class: PH0.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final MultiCaptionFragment f18873a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean f18874b;

                {
                    this.f18873a = this;
                    this.f18874b = z6;
                }

                public final Object invoke(Object obj) {
                    this.f18873a.mf((EditorMaterialEntity) obj, this.f18874b);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public final i kf() {
        g gVarP3 = p3();
        if (gVarP3 instanceof com.bilibili.upper.module.cover_v2.ui.a) {
            return ((com.bilibili.upper.module.cover_v2.ui.a) gVarP3).C3();
        }
        return null;
    }

    public final void lf() {
        f fVar;
        f fVar2;
        i iVarKf = kf();
        if (iVarKf != null && (fVar2 = iVarKf.f12753l) != null) {
            ((ArrayList) fVar2.f12741c).add(new a(this));
        }
        i iVarKf2 = kf();
        if (iVarKf2 == null || (fVar = iVarKf2.f12753l) == null) {
            return;
        }
        ((ArrayList) fVar.f12739a).add(new b(this));
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, java.util.Comparator] */
    public final void mf(EditorMaterialEntity editorMaterialEntity, boolean z6) {
        List<SubtitleWithCategoryBean> list = editorMaterialEntity.subtitleWithCategoryBeanList;
        List<CaptionBean.SubtitleBean> list2 = editorMaterialEntity.subtitle;
        List<SubtitleWithCategoryBean> arrayList = list;
        if (list == null) {
            arrayList = new ArrayList();
        }
        if (arrayList.size() == 0) {
            SubtitleWithCategoryBean subtitleWithCategoryBean = new SubtitleWithCategoryBean();
            subtitleWithCategoryBean.subTitleList = list2;
            arrayList.add(subtitleWithCategoryBean);
        }
        if (getContext() != null) {
            List listC = OC0.h.C();
            Map<String, CaptionListItem> mapH = OC0.h.H();
            final ArrayList<C5170c> arrayList2 = new ArrayList<>();
            int i7 = 0;
            for (Object obj : arrayList) {
                if (i7 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                SubtitleWithCategoryBean subtitleWithCategoryBean2 = (SubtitleWithCategoryBean) obj;
                List<CaptionBean.SubtitleBean> list3 = subtitleWithCategoryBean2.subTitleList;
                Random random = p.f24632a;
                if (list3 != null && !list3.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    if (i7 == 0) {
                        arrayList3.addAll(listC);
                    }
                    for (CaptionBean.SubtitleBean subtitleBean : subtitleWithCategoryBean2.subTitleList) {
                        String str = subtitleBean.download_url;
                        String strQ = OC0.h.q(OC0.h.o(str));
                        String str2 = subtitleBean.staticCover;
                        int i8 = subtitleBean.rank;
                        if (!TextUtils.isEmpty(str)) {
                            CaptionListItem captionListItem = new CaptionListItem();
                            captionListItem.setId(subtitleBean.id);
                            captionListItem.setCategory(subtitleWithCategoryBean2.name);
                            captionListItem.setMax(subtitleBean.max);
                            captionListItem.setLocal(false);
                            captionListItem.setUrl(str);
                            captionListItem.setImageHttp(str2);
                            captionListItem.setIndex(i8);
                            captionListItem.setTmpName(subtitleBean.name);
                            long j7 = subtitleBean.duration;
                            captionListItem.setDuration(j7 == 0 ? 3000000L : j7 < 1000 ? 1000000L : j7 * 1000);
                            captionListItem.setTempType(subtitleBean.textAttr);
                            captionListItem.setTempFormat(subtitleBean.textFmt);
                            captionListItem.setFontId(subtitleBean.fontId);
                            captionListItem.setFontScale(subtitleBean.fontScale);
                            captionListItem.setFontColor(C6634g.b(subtitleBean.fontColor));
                            captionListItem.setOutlineColor(C6634g.b(subtitleBean.outlineColor));
                            captionListItem.setOutlineWidth(subtitleBean.outlineWidth);
                            HashMap map = (HashMap) mapH;
                            CaptionListItem captionListItem2 = map.containsKey(strQ) ? (CaptionListItem) map.get(strQ) : map.containsKey(String.valueOf(subtitleBean.id)) ? (CaptionListItem) map.get(String.valueOf(subtitleBean.id)) : null;
                            if (captionListItem2 != null) {
                                captionListItem.setDownloaded(true);
                                captionListItem.captionAssetBean = captionListItem2.captionAssetBean.m9883clone();
                            } else {
                                captionListItem.setDownloaded(false);
                            }
                            arrayList3.add(captionListItem);
                        }
                    }
                    String str3 = subtitleWithCategoryBean2.name;
                    String str4 = str3;
                    if (str3 == null) {
                        str4 = "";
                    }
                    arrayList2.add(new C5170c(str4, arrayList3));
                }
                i7++;
            }
            if (z6) {
                BiliEditorCaptionTemplateFragment biliEditorCaptionTemplateFragment = this.f112942c;
                BiliEditorCaptionTemplateFragment biliEditorCaptionTemplateFragment2 = biliEditorCaptionTemplateFragment;
                if (biliEditorCaptionTemplateFragment == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("templateFragment");
                    biliEditorCaptionTemplateFragment2 = null;
                }
                biliEditorCaptionTemplateFragment2.qf(arrayList2);
            } else {
                BiliEditorCaptionTemplateFragment biliEditorCaptionTemplateFragment3 = this.f112942c;
                BiliEditorCaptionTemplateFragment biliEditorCaptionTemplateFragment4 = biliEditorCaptionTemplateFragment3;
                if (biliEditorCaptionTemplateFragment3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("templateFragment");
                    biliEditorCaptionTemplateFragment4 = null;
                }
                biliEditorCaptionTemplateFragment4.jf(new Runnable(this, arrayList2) { // from class: PH0.j

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final MultiCaptionFragment f18882a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final ArrayList f18883b;

                    {
                        this.f18882a = this;
                        this.f18883b = arrayList2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        MultiCaptionFragment multiCaptionFragment = this.f18882a;
                        ArrayList<C5170c> arrayList4 = this.f18883b;
                        BiliEditorCaptionTemplateFragment biliEditorCaptionTemplateFragment5 = multiCaptionFragment.f112942c;
                        BiliEditorCaptionTemplateFragment biliEditorCaptionTemplateFragment6 = biliEditorCaptionTemplateFragment5;
                        if (biliEditorCaptionTemplateFragment5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("templateFragment");
                            biliEditorCaptionTemplateFragment6 = null;
                        }
                        biliEditorCaptionTemplateFragment6.qf(arrayList4);
                    }
                });
            }
        }
        List<SubtitleWithCategoryBean> list4 = editorMaterialEntity.flowerWithCategoryBeanList;
        List<SubtitleWithCategoryBean> arrayList4 = list4;
        if (list4 == null) {
            arrayList4 = new ArrayList();
        }
        Map<String, CaptionListItem> mapE = OC0.h.E();
        final ArrayList arrayList5 = new ArrayList();
        int i9 = 0;
        for (Object obj2 : arrayList4) {
            if (i9 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            SubtitleWithCategoryBean subtitleWithCategoryBean3 = (SubtitleWithCategoryBean) obj2;
            if (V.d(subtitleWithCategoryBean3.subTitleList)) {
                ArrayList arrayList6 = new ArrayList();
                for (CaptionBean.SubtitleBean subtitleBean2 : subtitleWithCategoryBean3.subTitleList) {
                    String str5 = subtitleBean2.downloadUrlAurora;
                    String strQ2 = OC0.h.q(OC0.h.o(str5));
                    String str6 = subtitleBean2.staticCover;
                    int i10 = subtitleBean2.rank;
                    if (!TextUtils.isEmpty(str5)) {
                        CaptionListItem captionListItem3 = new CaptionListItem();
                        captionListItem3.setId(subtitleBean2.id);
                        captionListItem3.setCategory(subtitleWithCategoryBean3.name);
                        captionListItem3.setMax(subtitleBean2.max);
                        captionListItem3.setLocal(false);
                        captionListItem3.setUrl(str5);
                        captionListItem3.setImageHttp(str6);
                        captionListItem3.setIndex(i10);
                        captionListItem3.setTmpName(subtitleBean2.name);
                        long j8 = subtitleBean2.duration;
                        captionListItem3.setDuration(j8 == 0 ? 3000000L : j8 < 1000 ? 1000000L : j8 * 1000);
                        captionListItem3.setTempType(subtitleBean2.textAttr);
                        captionListItem3.setTempFormat(subtitleBean2.textFmt);
                        captionListItem3.setFontId(subtitleBean2.fontId);
                        captionListItem3.setFontScale(subtitleBean2.fontScale);
                        captionListItem3.setFontColor(C6634g.b(subtitleBean2.fontColor));
                        captionListItem3.setOutlineColor(C6634g.b(subtitleBean2.outlineColor));
                        captionListItem3.setOutlineWidth(subtitleBean2.outlineWidth);
                        HashMap map2 = (HashMap) mapE;
                        CaptionListItem captionListItem4 = map2.containsKey(strQ2) ? (CaptionListItem) map2.get(strQ2) : map2.containsKey(String.valueOf(subtitleBean2.id)) ? (CaptionListItem) map2.get(String.valueOf(subtitleBean2.id)) : null;
                        if (captionListItem4 != null) {
                            captionListItem3.setDownloaded(true);
                            captionListItem3.captionAssetBean = captionListItem4.captionAssetBean;
                        } else {
                            captionListItem3.setDownloaded(false);
                        }
                        arrayList6.add(captionListItem3);
                    }
                }
                String str7 = subtitleWithCategoryBean3.name;
                String str8 = str7;
                if (str7 == null) {
                    str8 = "";
                }
                arrayList5.add(new C5169b(str8, arrayList6));
            }
            i9++;
        }
        BiliEditorCaptionFlowerFragment biliEditorCaptionFlowerFragment = this.f112944e;
        BiliEditorCaptionFlowerFragment biliEditorCaptionFlowerFragment2 = biliEditorCaptionFlowerFragment;
        if (biliEditorCaptionFlowerFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("flowerFragment");
            biliEditorCaptionFlowerFragment2 = null;
        }
        biliEditorCaptionFlowerFragment2.jf(new Runnable(this, arrayList5) { // from class: PH0.i

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MultiCaptionFragment f18880a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ArrayList f18881b;

            {
                this.f18880a = this;
                this.f18881b = arrayList5;
            }

            @Override // java.lang.Runnable
            public final void run() {
                MultiCoverCaptionSettingProxy multiCoverCaptionSettingProxy;
                MultiCaptionFragment multiCaptionFragment = this.f18880a;
                ArrayList arrayList7 = this.f18881b;
                BiliEditorCaptionFlowerFragment biliEditorCaptionFlowerFragment3 = multiCaptionFragment.f112944e;
                BiliEditorCaptionFlowerFragment biliEditorCaptionFlowerFragment4 = biliEditorCaptionFlowerFragment3;
                if (biliEditorCaptionFlowerFragment3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("flowerFragment");
                    biliEditorCaptionFlowerFragment4 = null;
                }
                C5169b c5169b = (C5169b) CollectionsKt.firstOrNull(arrayList7);
                biliEditorCaptionFlowerFragment4.rf(new ArrayList<>(c5169b != null ? c5169b.f57119b : new ArrayList<>()));
                com.bilibili.studio.editor.moudle.caption.setting.presenter.e eVar = com.bilibili.studio.editor.moudle.caption.setting.presenter.a.f105787b.f105788a;
                if (eVar == null || (multiCoverCaptionSettingProxy = eVar.f105793a) == null) {
                    return;
                }
                C5171d c5171dJ = multiCoverCaptionSettingProxy.j();
                BiliEditorCaptionFlowerFragment biliEditorCaptionFlowerFragment5 = multiCaptionFragment.f112944e;
                if (biliEditorCaptionFlowerFragment5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("flowerFragment");
                    biliEditorCaptionFlowerFragment5 = null;
                }
                biliEditorCaptionFlowerFragment5.sf(c5171dJ.f57129i);
            }
        });
        ArrayList<CaptionFontEntity> arrayList7 = editorMaterialEntity.font;
        if (arrayList7 != null) {
            final ArrayList arrayList8 = new ArrayList();
            CaptionListItem captionListItem5 = new CaptionListItem();
            captionListItem5.setId(0);
            captionListItem5.setDownloaded(true);
            captionListItem5.setLocal(true);
            captionListItem5.setImageLocal(2131234894);
            arrayList8.add(0, captionListItem5);
            List<CaptionListItem> listF = OC0.h.F();
            ArrayList arrayList9 = new ArrayList();
            for (CaptionFontEntity captionFontEntity : arrayList7) {
                String str9 = captionFontEntity.download_url;
                String strO = OC0.h.o(str9);
                if (StringsKt.z(strO, '.', 0, 6) >= 0) {
                    String strSubstring = strO.substring(0, StringsKt.z(strO, '.', 0, 6));
                    String str10 = captionFontEntity.cover;
                    int i11 = captionFontEntity.rank;
                    if (str9 != null && str9.length() != 0 && str10 != null && str10.length() != 0) {
                        Iterator it = arrayList9.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                CaptionListItem captionListItem6 = (CaptionListItem) it.next();
                                if (captionListItem6.getUrl() == null || !Intrinsics.areEqual(captionListItem6.getUrl(), str9)) {
                                }
                            } else {
                                CaptionListItem captionListItem7 = new CaptionListItem();
                                captionListItem7.setId(captionFontEntity.id);
                                captionListItem7.setLocal(false);
                                captionListItem7.setUrl(str9);
                                captionListItem7.setImageHttp(str10);
                                captionListItem7.setIndex(i11);
                                captionListItem7.setFontName(captionFontEntity.name);
                                for (CaptionListItem captionListItem8 : (ArrayList) listF) {
                                    if (StringsKt.n(captionListItem8.getAssetPath(), strSubstring)) {
                                        captionListItem7.setDownloaded(true);
                                        captionListItem7.setAssetPath(captionListItem8.getAssetPath());
                                    }
                                }
                                arrayList9.add(captionListItem7);
                            }
                        }
                    }
                }
            }
            if (!arrayList9.isEmpty()) {
                Collections.sort(arrayList9, new Object());
                arrayList8.addAll(arrayList9);
            }
            this.f112950l = arrayList8;
            e eVar = com.bilibili.studio.editor.moudle.caption.setting.presenter.a.f105787b.f105788a;
            if (eVar != null) {
                eVar.f105796d = arrayList8;
            }
            BiliEditorCaptionFontV2Fragment biliEditorCaptionFontV2Fragment = this.f112943d;
            BiliEditorCaptionFontV2Fragment biliEditorCaptionFontV2Fragment2 = biliEditorCaptionFontV2Fragment;
            if (biliEditorCaptionFontV2Fragment == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fontFragment");
                biliEditorCaptionFontV2Fragment2 = null;
            }
            biliEditorCaptionFontV2Fragment2.jf(new Runnable(this, arrayList8) { // from class: PH0.k

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final MultiCaptionFragment f18884a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final ArrayList f18885b;

                {
                    this.f18884a = this;
                    this.f18885b = arrayList8;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MultiCoverCaptionSettingProxy multiCoverCaptionSettingProxy;
                    MultiCaptionFragment multiCaptionFragment = this.f18884a;
                    ArrayList arrayList10 = this.f18885b;
                    multiCaptionFragment.getClass();
                    com.bilibili.studio.editor.moudle.caption.setting.presenter.a aVar = com.bilibili.studio.editor.moudle.caption.setting.presenter.a.f105787b;
                    com.bilibili.studio.editor.moudle.caption.setting.presenter.e eVar2 = aVar.f105788a;
                    if (eVar2 != null) {
                        eVar2.f105796d = arrayList10;
                    }
                    BiliEditorCaptionFontV2Fragment biliEditorCaptionFontV2Fragment3 = multiCaptionFragment.f112943d;
                    BiliEditorCaptionFontV2Fragment biliEditorCaptionFontV2Fragment4 = biliEditorCaptionFontV2Fragment3;
                    if (biliEditorCaptionFontV2Fragment3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("fontFragment");
                        biliEditorCaptionFontV2Fragment4 = null;
                    }
                    fx0.c cVar = biliEditorCaptionFontV2Fragment4.f105826d;
                    if (cVar != null) {
                        cVar.f54261a = arrayList10;
                        cVar.notifyDataSetChanged();
                    }
                    com.bilibili.studio.editor.moudle.caption.setting.presenter.e eVar3 = aVar.f105788a;
                    if (eVar3 == null || (multiCoverCaptionSettingProxy = eVar3.f105793a) == null) {
                        return;
                    }
                    C5171d c5171dJ = multiCoverCaptionSettingProxy.j();
                    BiliEditorCaptionFontV2Fragment biliEditorCaptionFontV2Fragment5 = multiCaptionFragment.f112943d;
                    if (biliEditorCaptionFontV2Fragment5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("fontFragment");
                        biliEditorCaptionFontV2Fragment5 = null;
                    }
                    biliEditorCaptionFontV2Fragment5.rf(Integer.valueOf(c5171dJ.f57124c), biliEditorCaptionFontV2Fragment5.f105826d, biliEditorCaptionFontV2Fragment5.f105827e);
                }
            });
        }
        if (!isAdded() || isDetached()) {
            return;
        }
        BiliEditorCaptionStyleFragment biliEditorCaptionStyleFragment = this.f112941b;
        if (biliEditorCaptionStyleFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("styleFragment");
            biliEditorCaptionStyleFragment = null;
        }
        biliEditorCaptionStyleFragment.jf(new Runnable(this) { // from class: PH0.l

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MultiCaptionFragment f18886a;

            {
                this.f18886a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                MultiCaptionFragment multiCaptionFragment = this.f18886a;
                multiCaptionFragment.getClass();
                com.bilibili.studio.editor.moudle.caption.setting.presenter.e eVar2 = com.bilibili.studio.editor.moudle.caption.setting.presenter.a.f105787b.f105788a;
                if (eVar2 != null) {
                    C5171d c5171dJ = eVar2.f105793a.j();
                    BiliEditorCaptionTemplateFragment biliEditorCaptionTemplateFragment5 = multiCaptionFragment.f112942c;
                    BiliEditorCaptionTemplateFragment biliEditorCaptionTemplateFragment6 = biliEditorCaptionTemplateFragment5;
                    if (biliEditorCaptionTemplateFragment5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("templateFragment");
                        biliEditorCaptionTemplateFragment6 = null;
                    }
                    View view = biliEditorCaptionTemplateFragment6.getView();
                    if (view != null) {
                        view.post(new Runnable(multiCaptionFragment, c5171dJ) { // from class: PH0.c

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final MultiCaptionFragment f18870a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final C5171d f18871b;

                            {
                                this.f18870a = multiCaptionFragment;
                                this.f18871b = c5171dJ;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                MultiCaptionFragment multiCaptionFragment2 = this.f18870a;
                                C5171d c5171d = this.f18871b;
                                BiliEditorCaptionTemplateFragment biliEditorCaptionTemplateFragment7 = multiCaptionFragment2.f112942c;
                                BiliEditorCaptionTemplateFragment biliEditorCaptionTemplateFragment8 = biliEditorCaptionTemplateFragment7;
                                if (biliEditorCaptionTemplateFragment7 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("templateFragment");
                                    biliEditorCaptionTemplateFragment8 = null;
                                }
                                biliEditorCaptionTemplateFragment8.rf(c5171d.f57123b);
                            }
                        });
                    }
                    BiliEditorCaptionFlowerFragment biliEditorCaptionFlowerFragment3 = multiCaptionFragment.f112944e;
                    BiliEditorCaptionFlowerFragment biliEditorCaptionFlowerFragment4 = biliEditorCaptionFlowerFragment3;
                    if (biliEditorCaptionFlowerFragment3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("flowerFragment");
                        biliEditorCaptionFlowerFragment4 = null;
                    }
                    biliEditorCaptionFlowerFragment4.sf(c5171dJ.f57129i);
                    BiliEditorCaptionStyleFragment biliEditorCaptionStyleFragment2 = multiCaptionFragment.f112941b;
                    BiliEditorCaptionStyleFragment biliEditorCaptionStyleFragment3 = biliEditorCaptionStyleFragment2;
                    if (biliEditorCaptionStyleFragment2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("styleFragment");
                        biliEditorCaptionStyleFragment3 = null;
                    }
                    int i12 = c5171dJ.f57124c;
                    int i13 = c5171dJ.f57125d;
                    int i14 = c5171dJ.f57126e;
                    ax0.c cVar = biliEditorCaptionStyleFragment3.f105801c;
                    ax0.c cVar2 = cVar;
                    if (cVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mFontAdapter");
                        cVar2 = null;
                    }
                    RecyclerView recyclerView = biliEditorCaptionStyleFragment3.f105804f;
                    RecyclerView recyclerView2 = recyclerView;
                    if (recyclerView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mRvFont");
                        recyclerView2 = null;
                    }
                    biliEditorCaptionStyleFragment3.tf(Integer.valueOf(i12), cVar2, recyclerView2);
                    ax0.c cVar3 = biliEditorCaptionStyleFragment3.f105802d;
                    ax0.c cVar4 = cVar3;
                    if (cVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mFontColorAdapter");
                        cVar4 = null;
                    }
                    RecyclerView recyclerView3 = biliEditorCaptionStyleFragment3.f105805g;
                    RecyclerView recyclerView4 = recyclerView3;
                    if (recyclerView3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mRvFontColor");
                        recyclerView4 = null;
                    }
                    biliEditorCaptionStyleFragment3.tf(Integer.valueOf(i13), cVar4, recyclerView4);
                    ax0.c cVar5 = biliEditorCaptionStyleFragment3.f105803e;
                    ax0.c cVar6 = cVar5;
                    if (cVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mFontOutlineAdapter");
                        cVar6 = null;
                    }
                    RecyclerView recyclerView5 = biliEditorCaptionStyleFragment3.h;
                    RecyclerView recyclerView6 = recyclerView5;
                    if (recyclerView5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mRvOutlineColor");
                        recyclerView6 = null;
                    }
                    biliEditorCaptionStyleFragment3.tf(Integer.valueOf(i14), cVar6, recyclerView6);
                    BiliEditorCaptionStyleFragment biliEditorCaptionStyleFragment4 = multiCaptionFragment.f112941b;
                    BiliEditorCaptionStyleFragment biliEditorCaptionStyleFragment5 = biliEditorCaptionStyleFragment4;
                    if (biliEditorCaptionStyleFragment4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("styleFragment");
                        biliEditorCaptionStyleFragment5 = null;
                    }
                    biliEditorCaptionStyleFragment5.rf(Float.valueOf(c5171dJ.f57127f));
                    BiliEditorCaptionStyleFragment biliEditorCaptionStyleFragment6 = multiCaptionFragment.f112941b;
                    if (biliEditorCaptionStyleFragment6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("styleFragment");
                        biliEditorCaptionStyleFragment6 = null;
                    }
                    biliEditorCaptionStyleFragment6.sf(Integer.valueOf(c5171dJ.f57128g));
                }
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131501548, viewGroup, false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        com.bilibili.studio.editor.moudle.caption.setting.presenter.a aVar = com.bilibili.studio.editor.moudle.caption.setting.presenter.a.f105787b;
        e eVar = aVar.f105788a;
        if (eVar != null) {
            eVar.f105795c.f24409a = false;
            CoroutineScopeKt.cancel$default(eVar.f105794b, (CancellationException) null, 1, (Object) null);
        }
        aVar.f105788a = null;
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public final void onFragmentHide(@NotNull Flag flag) {
        super.onFragmentHide(flag);
        if (isAdded() && !isDetached()) {
            ViewPager viewPager = this.f112946g;
            ViewPager viewPager2 = viewPager;
            if (viewPager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewPager");
                viewPager2 = null;
            }
            viewPager2.setCurrentItem(0);
            px0.e.d(getContext());
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        MultiCoverCaptionSettingProxy multiCoverCaptionSettingProxy = this.f112948j;
        if (multiCoverCaptionSettingProxy != null) {
            com.bilibili.studio.editor.moudle.caption.setting.presenter.a aVar = com.bilibili.studio.editor.moudle.caption.setting.presenter.a.f105787b;
            e eVar = new e(multiCoverCaptionSettingProxy, requireContext());
            List<? extends CaptionListItem> list = this.f112950l;
            List<? extends CaptionListItem> listEmptyList = list;
            if (list == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            eVar.f105796d = listEmptyList;
            aVar.f105788a = eVar;
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        MultiCoverCaptionSettingProxy multiCoverCaptionSettingProxy = new MultiCoverCaptionSettingProxy(this.f112947i);
        this.f112948j = multiCoverCaptionSettingProxy;
        com.bilibili.studio.editor.moudle.caption.setting.presenter.a aVar = com.bilibili.studio.editor.moudle.caption.setting.presenter.a.f105787b;
        e eVar = new e(multiCoverCaptionSettingProxy, requireContext());
        List<? extends CaptionListItem> list = this.f112950l;
        List<? extends CaptionListItem> listEmptyList = list;
        if (list == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        eVar.f105796d = listEmptyList;
        aVar.f105788a = eVar;
        this.f112946g = (ViewPager) view.findViewById(2131316429);
        this.f112945f = (MultiCaptionTextInputView) view.findViewById(2131318174);
        this.h = view.findViewById(2131318987);
        PagerSlidingTabStrip pagerSlidingTabStripFindViewById = view.findViewById(2131312846);
        ArrayList arrayList = new ArrayList();
        this.f112941b = new BiliEditorCaptionStyleFragment();
        this.f112942c = new BiliEditorCaptionTemplateFragment();
        this.f112943d = new BiliEditorCaptionFontV2Fragment();
        this.f112944e = new BiliEditorCaptionFlowerFragment();
        BiliEditorCaptionTemplateFragment biliEditorCaptionTemplateFragment = this.f112942c;
        BiliEditorCaptionTemplateFragment biliEditorCaptionTemplateFragment2 = biliEditorCaptionTemplateFragment;
        if (biliEditorCaptionTemplateFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("templateFragment");
            biliEditorCaptionTemplateFragment2 = null;
        }
        arrayList.add(biliEditorCaptionTemplateFragment2);
        BiliEditorCaptionFontV2Fragment biliEditorCaptionFontV2Fragment = this.f112943d;
        BiliEditorCaptionFontV2Fragment biliEditorCaptionFontV2Fragment2 = biliEditorCaptionFontV2Fragment;
        if (biliEditorCaptionFontV2Fragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fontFragment");
            biliEditorCaptionFontV2Fragment2 = null;
        }
        arrayList.add(biliEditorCaptionFontV2Fragment2);
        BiliEditorCaptionStyleFragment biliEditorCaptionStyleFragment = this.f112941b;
        BiliEditorCaptionStyleFragment biliEditorCaptionStyleFragment2 = biliEditorCaptionStyleFragment;
        if (biliEditorCaptionStyleFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("styleFragment");
            biliEditorCaptionStyleFragment2 = null;
        }
        arrayList.add(biliEditorCaptionStyleFragment2);
        BiliEditorCaptionFlowerFragment biliEditorCaptionFlowerFragment = this.f112944e;
        BiliEditorCaptionFlowerFragment biliEditorCaptionFlowerFragment2 = biliEditorCaptionFlowerFragment;
        if (biliEditorCaptionFlowerFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("flowerFragment");
            biliEditorCaptionFlowerFragment2 = null;
        }
        arrayList.add(biliEditorCaptionFlowerFragment2);
        BiliEditorCaptionStyleFragment biliEditorCaptionStyleFragment3 = this.f112941b;
        BiliEditorCaptionStyleFragment biliEditorCaptionStyleFragment4 = biliEditorCaptionStyleFragment3;
        if (biliEditorCaptionStyleFragment3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("styleFragment");
            biliEditorCaptionStyleFragment4 = null;
        }
        biliEditorCaptionStyleFragment4.f105810m = false;
        d dVar = new d(getChildFragmentManager(), 1);
        dVar.f54266b = CollectionsKt.arrayListOf(new String[]{getString(2131851332), getString(2131849420), getString(2131850407), getString(2131850032)});
        dVar.f54267c = arrayList;
        ViewPager viewPager = this.f112946g;
        ViewPager viewPager2 = viewPager;
        if (viewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            viewPager2 = null;
        }
        viewPager2.setAdapter(dVar);
        ViewPager viewPager3 = this.f112946g;
        ViewPager viewPager4 = viewPager3;
        if (viewPager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            viewPager4 = null;
        }
        viewPager4.setOffscreenPageLimit(3);
        ViewPager viewPager5 = this.f112946g;
        ViewPager viewPager6 = viewPager5;
        if (viewPager5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            viewPager6 = null;
        }
        pagerSlidingTabStripFindViewById.setViewPager(viewPager6);
        j.a(pagerSlidingTabStripFindViewById);
        pagerSlidingTabStripFindViewById.setOnPageChangeListener(new PH0.n(this));
        MultiCaptionTextInputView multiCaptionTextInputView = this.f112945f;
        MultiCaptionTextInputView multiCaptionTextInputView2 = multiCaptionTextInputView;
        if (multiCaptionTextInputView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inputView");
            multiCaptionTextInputView2 = null;
        }
        multiCaptionTextInputView2.setInputListener(new m(this));
        MultiCaptionTextInputView multiCaptionTextInputView3 = this.f112945f;
        if (multiCaptionTextInputView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inputView");
            multiCaptionTextInputView3 = null;
        }
        multiCaptionTextInputView3.getEditText().setOnTouchListener(new View.OnTouchListener(this) { // from class: PH0.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MultiCaptionFragment f18875a;

            {
                this.f18875a = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                MultiCaptionFragment multiCaptionFragment = this.f18875a;
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                MultiCaptionTextInputView multiCaptionTextInputView4 = multiCaptionFragment.f112945f;
                MultiCaptionTextInputView multiCaptionTextInputView5 = multiCaptionTextInputView4;
                if (multiCaptionTextInputView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("inputView");
                    multiCaptionTextInputView5 = null;
                }
                multiCaptionTextInputView5.getEditText().post(new h(multiCaptionFragment, 0));
                return false;
            }
        });
        View view2 = this.h;
        if (view2 != null) {
            final int i7 = 0;
            view2.setOnClickListener(new View.OnClickListener(this, i7) { // from class: PH0.g

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f18876a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f18877b;

                {
                    this.f18876a = i7;
                    this.f18877b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (this.f18876a) {
                        case 0:
                            MultiCaptionFragment multiCaptionFragment = (MultiCaptionFragment) this.f18877b;
                            int i8 = SH0.b.f22895a;
                            SH0.b.b(multiCaptionFragment.p3());
                            break;
                        default:
                            SearchTagLayout.SearchTagView searchTagView = (SearchTagLayout.SearchTagView) this.f18877b;
                            if (searchTagView.d != null && view3.isClickable() && view3.isShown()) {
                                SearchTagLayout parent = searchTagView.getParent();
                                if (parent instanceof SearchTagLayout) {
                                    parent.removeView(searchTagView);
                                }
                                if (searchTagView.d != null) {
                                    Object tag = searchTagView.getTag(1593835520);
                                    searchTagView.d.onDelIconClick(searchTagView, tag instanceof Integer ? ((Integer) tag).intValue() : -1, searchTagView.e);
                                }
                            }
                            break;
                    }
                }
            });
        }
        lf();
        jf(false);
    }

    @Override // dx0.InterfaceC6891b
    @Nullable
    public final e v8() {
        return com.bilibili.studio.editor.moudle.caption.setting.presenter.a.f105787b.f105788a;
    }
}
