package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit;

import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/batchedit/g.class */
public final /* synthetic */ class C6523g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f106410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BiliEditorCaptionEditFragmentV3 f106411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CaptionInfo f106412c;

    public /* synthetic */ C6523g(boolean z6, BiliEditorCaptionEditFragmentV3 biliEditorCaptionEditFragmentV3, CaptionInfo captionInfo) {
        this.f106410a = z6;
        this.f106411b = biliEditorCaptionEditFragmentV3;
        this.f106412c = captionInfo;
    }

    public final Object invoke(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            CaptionInfo captionInfo = this.f106412c;
            boolean z6 = this.f106410a;
            BiliEditorCaptionEditFragmentV3 biliEditorCaptionEditFragmentV3 = this.f106411b;
            if (z6) {
                biliEditorCaptionEditFragmentV3.uf(captionInfo.txtMax, true);
            } else {
                biliEditorCaptionEditFragmentV3.tf(captionInfo.txtMax, true);
            }
        }
        return Unit.INSTANCE;
    }
}
