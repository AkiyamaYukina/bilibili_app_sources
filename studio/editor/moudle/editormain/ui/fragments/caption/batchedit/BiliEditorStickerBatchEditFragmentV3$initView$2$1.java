package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit;

import TB0.C2873e;
import android.view.View;
import com.bilibili.ad.adview.search.inline.card155.J;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.ImageRequestBuilder;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.studio.editor.moudle.caption.ui.CaptionEditText;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.BiliEditorStickerBatchEditFragmentV3;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm.M;
import com.bilibili.studio.editor.repository.data.BiliEditorStickerInfo;
import com.bilibili.studio.editor.timeline.backup.BackUpTag;
import com.bilibili.studio.videoeditor.extension.FragmentExtKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/batchedit/BiliEditorStickerBatchEditFragmentV3$initView$2$1.class */
final /* synthetic */ class BiliEditorStickerBatchEditFragmentV3$initView$2$1 extends FunctionReferenceImpl implements Function3<View, BiliEditorStickerBatchEditFragmentV3.b, Integer, Unit> {
    public BiliEditorStickerBatchEditFragmentV3$initView$2$1(Object obj) {
        super(3, obj, BiliEditorStickerBatchEditFragmentV3.class, "onBindView", "onBindView(Landroid/view/View;Lcom/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/batchedit/BiliEditorStickerBatchEditFragmentV3$CaptionAndStickerEdition;I)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((View) obj, (BiliEditorStickerBatchEditFragmentV3.b) obj2, ((Number) obj3).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(final View view, final BiliEditorStickerBatchEditFragmentV3.b bVar, final int i7) {
        String cover;
        String str;
        final BiliEditorStickerBatchEditFragmentV3 biliEditorStickerBatchEditFragmentV3 = (BiliEditorStickerBatchEditFragmentV3) ((CallableReference) this).receiver;
        biliEditorStickerBatchEditFragmentV3.getClass();
        final C2873e c2873eBind = C2873e.bind(view);
        final CaptionEditText captionEditText = c2873eBind.f23764c;
        captionEditText.setTextSilently(bVar.f106372c);
        BiliEditorStickerBatchEditFragmentV3.b bVar2 = biliEditorStickerBatchEditFragmentV3.f106362s;
        if ((bVar2 != null ? bVar2.f106370a : null) == null) {
            captionEditText.setFocusedTextColor(biliEditorStickerBatchEditFragmentV3.f106349E);
        } else {
            captionEditText.setFocusedTextColor(-1);
        }
        captionEditText.setSelected(false);
        CaptionInfo captionInfo = bVar.f106370a;
        if (captionInfo == null || ((str = captionInfo.text) != null && str.length() == 0)) {
            captionEditText.setVisibility(4);
        } else {
            captionEditText.setVisibility(0);
        }
        ImageRequestBuilder imageRequestBuilderWith = BiliImageLoader.INSTANCE.with(view.getContext());
        BiliEditorStickerInfo biliEditorStickerInfo = bVar.f106371b;
        ImageRequestBuilder imageRequestBuilderEnableAutoPlayAnimation$default = ImageRequestBuilder.enableAutoPlayAnimation$default(ImageRequestBuilder.enableAnimate$default(imageRequestBuilderWith.url(biliEditorStickerInfo != null ? biliEditorStickerInfo.getCover() : null), true, (Boolean) null, 2, (Object) null), true, false, 2, (Object) null);
        BiliImageView biliImageView = c2873eBind.f23766e;
        imageRequestBuilderEnableAutoPlayAnimation$default.into(biliImageView);
        if (biliEditorStickerInfo != null && (cover = biliEditorStickerInfo.getCover()) != null && cover.length() > 0) {
            biliImageView.setOnClickListener(new View.OnClickListener(biliEditorStickerBatchEditFragmentV3, bVar) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.q

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BiliEditorStickerBatchEditFragmentV3 f106427a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final BiliEditorStickerBatchEditFragmentV3.b f106428b;

                {
                    this.f106427a = biliEditorStickerBatchEditFragmentV3;
                    this.f106428b = bVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void onClick(android.view.View r11) {
                    /*
                        Method dump skipped, instruction units count: 223
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.q.onClick(android.view.View):void");
                }
            });
        }
        if (biliEditorStickerInfo == null && captionInfo == null) {
            c2873eBind.f23763b.setVisibility(8);
        } else {
            c2873eBind.f23763b.setVisibility(0);
            c2873eBind.f23763b.setOnClickListener(new J(biliEditorStickerBatchEditFragmentV3, 1));
        }
        if (captionInfo == null) {
            c2873eBind.f23762a.setOnClickListener(new View.OnClickListener(view, biliEditorStickerBatchEditFragmentV3, bVar, i7) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.r

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final View f106429a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final BiliEditorStickerBatchEditFragmentV3 f106430b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final BiliEditorStickerBatchEditFragmentV3.b f106431c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f106432d;

                {
                    this.f106429a = view;
                    this.f106430b = biliEditorStickerBatchEditFragmentV3;
                    this.f106431c = bVar;
                    this.f106432d = i7;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    View view3 = this.f106429a;
                    BiliEditorStickerBatchEditFragmentV3 biliEditorStickerBatchEditFragmentV32 = this.f106430b;
                    BiliEditorStickerBatchEditFragmentV3.b bVar3 = this.f106431c;
                    int i8 = this.f106432d;
                    if (view3.isSelected()) {
                        return;
                    }
                    M mLf = biliEditorStickerBatchEditFragmentV32.lf();
                    BiliEditorStickerInfo biliEditorStickerInfo2 = bVar3.f106371b;
                    mLf.L0(biliEditorStickerInfo2 != null ? biliEditorStickerInfo2.inPoint : 0L);
                    if (biliEditorStickerBatchEditFragmentV32.f106350F == 2) {
                        biliEditorStickerBatchEditFragmentV32.lf().K0(bVar3.f106371b);
                    }
                    biliEditorStickerBatchEditFragmentV32.kf(view3, bVar3, i8, false);
                }
            });
        }
        captionEditText.setOnTextChange(new Function4(i7, c2873eBind, view, captionEditText, bVar, biliEditorStickerBatchEditFragmentV3) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.s

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliEditorStickerBatchEditFragmentV3 f106433a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BiliEditorStickerBatchEditFragmentV3.b f106434b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final CaptionEditText f106435c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final View f106436d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final int f106437e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final C2873e f106438f;

            {
                this.f106433a = biliEditorStickerBatchEditFragmentV3;
                this.f106434b = bVar;
                this.f106435c = captionEditText;
                this.f106436d = view;
                this.f106437e = i7;
                this.f106438f = c2873eBind;
            }

            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                int i8;
                Long l7;
                View view2 = this.f106436d;
                String str2 = (String) obj;
                ((Integer) obj2).getClass();
                ((Integer) obj3).getClass();
                ((Integer) obj4).getClass();
                BiliEditorStickerBatchEditFragmentV3 biliEditorStickerBatchEditFragmentV32 = this.f106433a;
                BiliEditorStickerBatchEditFragmentV3.b bVar3 = biliEditorStickerBatchEditFragmentV32.f106356m.get(biliEditorStickerBatchEditFragmentV32.f106364u);
                CaptionInfo captionInfo2 = bVar3.f106370a;
                if (str2.length() == 0) {
                    if (FragmentExtKt.isFragmentActive(biliEditorStickerBatchEditFragmentV32)) {
                        biliEditorStickerBatchEditFragmentV32.lf().f106679d.j();
                        Xz0.d dVar = Xz0.d.f28458a;
                        boolean z6 = biliEditorStickerBatchEditFragmentV32.f106361r;
                        dVar.getClass();
                        Xz0.d.n("delete", z6);
                        if (biliEditorStickerBatchEditFragmentV32.f106362s != null && (i8 = biliEditorStickerBatchEditFragmentV32.f106364u) >= 0 && i8 < biliEditorStickerBatchEditFragmentV32.f106356m.size() && Intrinsics.areEqual(biliEditorStickerBatchEditFragmentV32.f106356m.get(biliEditorStickerBatchEditFragmentV32.f106364u), biliEditorStickerBatchEditFragmentV32.f106362s)) {
                            if (biliEditorStickerBatchEditFragmentV32.f106368y.contains(Long.valueOf(biliEditorStickerBatchEditFragmentV32.f106362s.f106370a.id))) {
                                biliEditorStickerBatchEditFragmentV32.f106368y.remove(Long.valueOf(biliEditorStickerBatchEditFragmentV32.f106362s.f106370a.id));
                            }
                            biliEditorStickerBatchEditFragmentV32.f106369z.add(Long.valueOf(biliEditorStickerBatchEditFragmentV32.f106362s.f106370a.id));
                            CaptionInfo captionInfo3 = biliEditorStickerBatchEditFragmentV32.f106362s.f106370a;
                            if (captionInfo3 != null) {
                                M mLf = biliEditorStickerBatchEditFragmentV32.lf();
                                mLf.f106682g.o(captionInfo3.timelineCaption);
                                mLf.N0();
                            }
                            BiliEditorStickerBatchEditFragmentV3.b bVar4 = biliEditorStickerBatchEditFragmentV32.f106362s;
                            bVar4.f106375f = true;
                            if (bVar4.f106371b == null) {
                                biliEditorStickerBatchEditFragmentV32.f106356m.remove(biliEditorStickerBatchEditFragmentV32.f106364u);
                                if (biliEditorStickerBatchEditFragmentV32.f106356m.isEmpty()) {
                                    biliEditorStickerBatchEditFragmentV32.f106362s = null;
                                    biliEditorStickerBatchEditFragmentV32.f106364u = 0;
                                    biliEditorStickerBatchEditFragmentV32.f106365v = 0;
                                    biliEditorStickerBatchEditFragmentV32.qf();
                                    biliEditorStickerBatchEditFragmentV32.pf();
                                } else if (biliEditorStickerBatchEditFragmentV32.f106364u < biliEditorStickerBatchEditFragmentV32.f106356m.size()) {
                                    BiliEditorStickerBatchEditFragmentV3.b bVar5 = biliEditorStickerBatchEditFragmentV32.f106356m.get(biliEditorStickerBatchEditFragmentV32.f106364u);
                                    biliEditorStickerBatchEditFragmentV32.f106362s = bVar5;
                                    biliEditorStickerBatchEditFragmentV32.f106365v = bVar5.f106372c.length();
                                    String str3 = biliEditorStickerBatchEditFragmentV32.f106362s.f106372c;
                                } else {
                                    int i9 = biliEditorStickerBatchEditFragmentV32.f106364u - 1;
                                    biliEditorStickerBatchEditFragmentV32.f106364u = i9;
                                    BiliEditorStickerBatchEditFragmentV3.b bVar6 = biliEditorStickerBatchEditFragmentV32.f106356m.get(i9);
                                    biliEditorStickerBatchEditFragmentV32.f106362s = bVar6;
                                    biliEditorStickerBatchEditFragmentV32.f106365v = bVar6.f106372c.length();
                                    String str4 = biliEditorStickerBatchEditFragmentV32.f106362s.f106372c;
                                }
                                biliEditorStickerBatchEditFragmentV32.rf();
                                Xw0.c<BiliEditorStickerBatchEditFragmentV3.b> cVar = biliEditorStickerBatchEditFragmentV32.f106352i;
                                Xw0.c<BiliEditorStickerBatchEditFragmentV3.b> cVar2 = cVar;
                                if (cVar == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("editionsAdapter");
                                    cVar2 = null;
                                }
                                cVar2.notifyItemChanged(biliEditorStickerBatchEditFragmentV32.f106364u);
                                Xw0.c<BiliEditorStickerBatchEditFragmentV3.b> cVar3 = biliEditorStickerBatchEditFragmentV32.f106352i;
                                if (cVar3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("editionsAdapter");
                                    cVar3 = null;
                                }
                                cVar3.notifyItemMoved(biliEditorStickerBatchEditFragmentV32.f106364u, biliEditorStickerBatchEditFragmentV32.f106356m.size() - biliEditorStickerBatchEditFragmentV32.f106364u);
                                BiliEditorStickerBatchEditFragmentV3.b bVar7 = biliEditorStickerBatchEditFragmentV32.f106362s;
                                if (bVar7 != null && (l7 = bVar7.f106374e) != null) {
                                    biliEditorStickerBatchEditFragmentV32.lf().L0(l7.longValue());
                                }
                                biliEditorStickerBatchEditFragmentV32.f106360q = biliEditorStickerBatchEditFragmentV32.f106364u;
                            }
                        }
                    }
                } else if (captionInfo2 != null) {
                    if (bVar3.f106375f) {
                        M mLf2 = biliEditorStickerBatchEditFragmentV32.lf();
                        boolean zK = mLf2.f106682g.k(captionInfo2);
                        mLf2.M0(captionInfo2, str2);
                        if (zK) {
                            mLf2.f106683i.h.f(captionInfo2, true);
                        }
                        bVar3.f106375f = false;
                    } else {
                        biliEditorStickerBatchEditFragmentV32.lf().M0(captionInfo2, str2);
                        if (!biliEditorStickerBatchEditFragmentV32.f106368y.contains(Long.valueOf(captionInfo2.id))) {
                            biliEditorStickerBatchEditFragmentV32.f106368y.add(Long.valueOf(captionInfo2.id));
                        }
                    }
                }
                BiliEditorStickerBatchEditFragmentV3.nf(this.f106437e, this.f106438f, view2, this.f106435c, this.f106434b, biliEditorStickerBatchEditFragmentV32);
                return Unit.INSTANCE;
            }
        });
        captionEditText.setOnSelectionChange(new Function2(i7, c2873eBind, view, captionEditText, bVar, biliEditorStickerBatchEditFragmentV3) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.t

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliEditorStickerBatchEditFragmentV3.b f106439a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CaptionEditText f106440b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final BiliEditorStickerBatchEditFragmentV3 f106441c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final View f106442d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final int f106443e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final C2873e f106444f;

            {
                this.f106439a = bVar;
                this.f106440b = captionEditText;
                this.f106441c = biliEditorStickerBatchEditFragmentV3;
                this.f106442d = view;
                this.f106443e = i7;
                this.f106444f = c2873eBind;
            }

            public final Object invoke(Object obj, Object obj2) {
                View view2 = this.f106442d;
                ((Integer) obj).getClass();
                ((Integer) obj2).getClass();
                CaptionEditText captionEditText2 = this.f106440b;
                BiliEditorStickerBatchEditFragmentV3.nf(this.f106443e, this.f106444f, view2, captionEditText2, this.f106439a, this.f106441c);
                return Unit.INSTANCE;
            }
        });
        captionEditText.setOnFocusChange(new Function1(i7, c2873eBind, view, captionEditText, bVar, biliEditorStickerBatchEditFragmentV3) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.u

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliEditorStickerBatchEditFragmentV3 f106445a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BiliEditorStickerBatchEditFragmentV3.b f106446b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final CaptionEditText f106447c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final View f106448d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final int f106449e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final C2873e f106450f;

            {
                this.f106445a = biliEditorStickerBatchEditFragmentV3;
                this.f106446b = bVar;
                this.f106447c = captionEditText;
                this.f106448d = view;
                this.f106449e = i7;
                this.f106450f = c2873eBind;
            }

            public final Object invoke(Object obj) {
                View view2 = this.f106448d;
                ((Boolean) obj).getClass();
                CaptionEditText captionEditText2 = this.f106447c;
                C2873e c2873e = this.f106450f;
                BiliEditorStickerBatchEditFragmentV3.b bVar3 = this.f106446b;
                BiliEditorStickerBatchEditFragmentV3 biliEditorStickerBatchEditFragmentV32 = this.f106445a;
                BiliEditorStickerBatchEditFragmentV3.nf(this.f106449e, c2873e, view2, captionEditText2, bVar3, biliEditorStickerBatchEditFragmentV32);
                biliEditorStickerBatchEditFragmentV32.lf().J0(BackUpTag.CAPTION_EDIT);
                return Unit.INSTANCE;
            }
        });
        captionEditText.setOnTextAfterChange(new v(biliEditorStickerBatchEditFragmentV3, bVar, captionEditText));
        boolean zAreEqual = Intrinsics.areEqual(bVar, biliEditorStickerBatchEditFragmentV3.f106362s);
        CaptionEditText captionEditText2 = c2873eBind.f23764c;
        if (!zAreEqual) {
            T7.a.a(i7, "select not index is ", "BiliEditorStickerBatchEditFragment");
            c2873eBind.f23762a.setSelected(false);
            c2873eBind.f23763b.setVisibility(8);
            c2873eBind.f23765d.setVisibility(0);
            captionEditText2.setTextColor(biliEditorStickerBatchEditFragmentV3.f106349E);
            return;
        }
        T7.a.a(i7, "select index is ", "BiliEditorStickerBatchEditFragment");
        biliEditorStickerBatchEditFragmentV3.f106360q = i7;
        biliEditorStickerBatchEditFragmentV3.f106367x = view;
        biliEditorStickerBatchEditFragmentV3.f106363t = captionEditText;
        biliEditorStickerBatchEditFragmentV3.f106364u = i7;
        c2873eBind.f23765d.setVisibility(8);
        biliEditorStickerBatchEditFragmentV3.qf();
        view.setSelected(true);
        if (!biliEditorStickerBatchEditFragmentV3.f106358o) {
            c2873eBind.f23763b.setVisibility(0);
            captionEditText2.setTextColor(-1);
        } else if (captionInfo == null) {
            c2873eBind.f23763b.setVisibility(0);
        } else {
            captionEditText.requestFocus();
        }
    }
}
