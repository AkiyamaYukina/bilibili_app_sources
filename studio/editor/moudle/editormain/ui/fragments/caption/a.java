package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption;

import androidx.fragment.app.FragmentManager;
import com.bilibili.studio.editor.moudle.caption.tts.bean.TtsServerEntity;
import com.bilibili.studio.videoeditor.widgets.confirmdialog.BiliEditorConfirmDialog;
import jx0.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/a.class */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorTtsFragmentV2 f106306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f106307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TtsServerEntity.TtsServerBean f106308c;

    public /* synthetic */ a(BiliEditorTtsFragmentV2 biliEditorTtsFragmentV2, float f7, TtsServerEntity.TtsServerBean ttsServerBean) {
        this.f106306a = biliEditorTtsFragmentV2;
        this.f106307b = f7;
        this.f106308c = ttsServerBean;
    }

    public final Object invoke(Object obj) {
        BiliEditorConfirmDialog biliEditorConfirmDialog;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        BiliEditorTtsFragmentV2 biliEditorTtsFragmentV2 = this.f106306a;
        if (zBooleanValue) {
            biliEditorTtsFragmentV2.nf(this.f106307b, true, this.f106308c);
        } else {
            h hVar = biliEditorTtsFragmentV2.f106299i;
            if (hVar != null) {
                FragmentManager childFragmentManager = biliEditorTtsFragmentV2.getChildFragmentManager();
                BiliEditorConfirmDialog biliEditorConfirmDialog2 = hVar.i;
                if ((biliEditorConfirmDialog2 == null || !biliEditorConfirmDialog2.isRemoving()) && biliEditorTtsFragmentV2.isAdded() && !biliEditorTtsFragmentV2.isDetached() && (biliEditorConfirmDialog = hVar.i) != null && biliEditorConfirmDialog.isAdded()) {
                    childFragmentManager.beginTransaction().remove(hVar.i).commitNowAllowingStateLoss();
                }
            }
        }
        return Unit.INSTANCE;
    }
}
