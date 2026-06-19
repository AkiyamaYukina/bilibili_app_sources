package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit;

import TB0.C2872d;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bilibili.droid.ToastHelper;
import com.bilibili.studio.editor.moudle.caption.ui.CaptionEditText;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.BiliEditorCaptionEditFragmentV3;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/batchedit/BiliEditorCaptionEditFragmentV3$initView$2$1.class */
final /* synthetic */ class BiliEditorCaptionEditFragmentV3$initView$2$1 extends FunctionReferenceImpl implements Function3<View, BiliEditorCaptionEditFragmentV3.b, Integer, Unit> {
    public BiliEditorCaptionEditFragmentV3$initView$2$1(Object obj) {
        super(3, obj, BiliEditorCaptionEditFragmentV3.class, "onBindView", "onBindView(Landroid/view/View;Lcom/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/batchedit/BiliEditorCaptionEditFragmentV3$CaptionEdition;I)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((View) obj, (BiliEditorCaptionEditFragmentV3.b) obj2, ((Number) obj3).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(final View view, final BiliEditorCaptionEditFragmentV3.b bVar, final int i7) {
        final BiliEditorCaptionEditFragmentV3 biliEditorCaptionEditFragmentV3 = (BiliEditorCaptionEditFragmentV3) ((CallableReference) this).receiver;
        biliEditorCaptionEditFragmentV3.getClass();
        final C2872d c2872dBind = C2872d.bind(view);
        c2872dBind.f23754d.setText(bVar.f106340c);
        String str = bVar.f106339b;
        final CaptionEditText captionEditText = c2872dBind.f23753c;
        captionEditText.setTextSilently(str);
        captionEditText.setFocusedTextColor(-1);
        captionEditText.setSelected(false);
        c2872dBind.f23752b.setOnClickListener(new RI.c(biliEditorCaptionEditFragmentV3, 4));
        captionEditText.setOnTextChange(new Function4(i7, c2872dBind, view, captionEditText, bVar, biliEditorCaptionEditFragmentV3) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliEditorCaptionEditFragmentV3 f106413a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BiliEditorCaptionEditFragmentV3.b f106414b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final CaptionEditText f106415c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final int f106416d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final C2872d f106417e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final View f106418f;

            {
                this.f106413a = biliEditorCaptionEditFragmentV3;
                this.f106414b = bVar;
                this.f106415c = captionEditText;
                this.f106416d = i7;
                this.f106417e = c2872dBind;
                this.f106418f = view;
            }

            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                View view2 = this.f106418f;
                String str2 = (String) obj;
                ((Integer) obj2).getClass();
                ((Integer) obj3).getClass();
                ((Integer) obj4).getClass();
                BiliEditorCaptionEditFragmentV3 biliEditorCaptionEditFragmentV32 = this.f106413a;
                CaptionInfo captionInfo = biliEditorCaptionEditFragmentV32.f106322k.get(biliEditorCaptionEditFragmentV32.f106331t).f106338a;
                biliEditorCaptionEditFragmentV32.f106312B = true;
                if (str2.length() == 0) {
                    biliEditorCaptionEditFragmentV32.nf();
                } else {
                    My0.b bVar2 = biliEditorCaptionEditFragmentV32.of().f106709d;
                    Ly0.t tVar = bVar2.f16510f;
                    tVar.F(captionInfo);
                    P50.p pVar = tVar.f14993o;
                    if (pVar != null) {
                        String text = pVar.getText();
                        if (!TextUtils.isEmpty(str2)) {
                            Intrinsics.areEqual(str2, text);
                        }
                        tVar.f14993o.setText(str2);
                        captionInfo.isTemp = false;
                        captionInfo.text = str2;
                        captionInfo.textOrigin = str2;
                        bVar2.f16506b.t();
                        tVar.B();
                        Oy0.d.d(bVar2.f16511g, true, "EditorCaptionMultiEditUseCase.updateCaptionBatchEditContent", false, null, 12);
                    }
                    ((ArrayList) biliEditorCaptionEditFragmentV32.f106313C).add(Long.valueOf(captionInfo.id));
                }
                CaptionEditText captionEditText2 = this.f106415c;
                BiliEditorCaptionEditFragmentV3.qf(this.f106416d, this.f106417e, view2, captionEditText2, this.f106414b, biliEditorCaptionEditFragmentV32);
                return Unit.INSTANCE;
            }
        });
        captionEditText.setOnSelectionChange(new Function2(i7, c2872dBind, view, captionEditText, bVar, biliEditorCaptionEditFragmentV3) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliEditorCaptionEditFragmentV3.b f106392a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CaptionEditText f106393b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f106394c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final BiliEditorCaptionEditFragmentV3 f106395d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final C2872d f106396e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final View f106397f;

            {
                this.f106392a = bVar;
                this.f106393b = captionEditText;
                this.f106394c = i7;
                this.f106395d = biliEditorCaptionEditFragmentV3;
                this.f106396e = c2872dBind;
                this.f106397f = view;
            }

            public final Object invoke(Object obj, Object obj2) {
                View view2 = this.f106397f;
                ((Integer) obj).getClass();
                ((Integer) obj2).getClass();
                CaptionEditText captionEditText2 = this.f106393b;
                BiliEditorCaptionEditFragmentV3.qf(this.f106394c, this.f106396e, view2, captionEditText2, this.f106392a, this.f106395d);
                return Unit.INSTANCE;
            }
        });
        captionEditText.setOnFocusChange(new Function1(i7, c2872dBind, view, captionEditText, bVar, biliEditorCaptionEditFragmentV3) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliEditorCaptionEditFragmentV3.b f106398a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CaptionEditText f106399b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f106400c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final BiliEditorCaptionEditFragmentV3 f106401d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final C2872d f106402e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final View f106403f;

            {
                this.f106398a = bVar;
                this.f106399b = captionEditText;
                this.f106400c = i7;
                this.f106401d = biliEditorCaptionEditFragmentV3;
                this.f106402e = c2872dBind;
                this.f106403f = view;
            }

            public final Object invoke(Object obj) {
                View view2 = this.f106403f;
                ((Boolean) obj).getClass();
                CaptionEditText captionEditText2 = this.f106399b;
                BiliEditorCaptionEditFragmentV3.qf(this.f106400c, this.f106402e, view2, captionEditText2, this.f106398a, this.f106401d);
                return Unit.INSTANCE;
            }
        });
        captionEditText.setOnTextAfterChange(new Function1(biliEditorCaptionEditFragmentV3, bVar, captionEditText) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliEditorCaptionEditFragmentV3 f106404a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BiliEditorCaptionEditFragmentV3.b f106405b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final CaptionEditText f106406c;

            {
                this.f106404a = biliEditorCaptionEditFragmentV3;
                this.f106405b = bVar;
                this.f106406c = captionEditText;
            }

            public final Object invoke(Object obj) {
                String str2 = (String) obj;
                Context context = this.f106404a.getContext();
                if (context != null) {
                    int length = str2.length();
                    BiliEditorCaptionEditFragmentV3.b bVar2 = this.f106405b;
                    if (length > bVar2.f106338a.txtMax) {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String string = context.getString(2131841809);
                        CaptionInfo captionInfo = bVar2.f106338a;
                        ToastHelper.showToastShort(context, String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(captionInfo.txtMax)}, 1)));
                        String strSubstring = str2.substring(0, captionInfo.txtMax);
                        CaptionEditText captionEditText2 = this.f106406c;
                        captionEditText2.setText(strSubstring);
                        int i8 = captionInfo.txtMax;
                        if (i8 > 0) {
                            captionEditText2.setSelection(i8);
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        });
        if (!Intrinsics.areEqual(bVar, biliEditorCaptionEditFragmentV3.f106329r)) {
            c2872dBind.f23751a.setSelected(false);
            c2872dBind.f23752b.setVisibility(4);
            captionEditText.setTextColor(biliEditorCaptionEditFragmentV3.f106317G);
            return;
        }
        biliEditorCaptionEditFragmentV3.f106327p = i7;
        biliEditorCaptionEditFragmentV3.f106311A = view;
        biliEditorCaptionEditFragmentV3.f106330s = captionEditText;
        biliEditorCaptionEditFragmentV3.f106331t = i7;
        if (biliEditorCaptionEditFragmentV3.f106325n) {
            captionEditText.setSelection(biliEditorCaptionEditFragmentV3.f106332u);
            captionEditText.getSelectionStart();
            captionEditText.requestFocus();
        } else {
            c2872dBind.f23751a.setSelected(true);
            c2872dBind.f23752b.setVisibility(0);
            captionEditText.setTextColor(-1);
        }
    }
}
