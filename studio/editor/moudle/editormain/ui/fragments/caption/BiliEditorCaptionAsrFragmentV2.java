package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption;

import TB0.C2886s;
import Xz0.d;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.studio.editor.moudle.caption.ui.BiliEditorCaptionAsrFragment;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/BiliEditorCaptionAsrFragmentV2.class */
public final class BiliEditorCaptionAsrFragmentV2 extends BiliEditorCaptionAsrFragment {
    @Override // com.bilibili.studio.editor.moudle.caption.ui.BiliEditorCaptionAsrFragment
    @NotNull
    public final ConstraintLayout Af(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        C2886s c2886sInflate = C2886s.inflate(layoutInflater, viewGroup, false);
        this.f106011l.e(c2886sInflate);
        return c2886sInflate.f23974a;
    }

    @Override // com.bilibili.studio.editor.moudle.caption.ui.BiliEditorCaptionAsrFragment, com.bilibili.studio.editor.base.BiliEditorBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        d.f28458a.getClass();
        Neurons.reportExposure$default(false, "creation.new-video-editor.speech-recognition.panel.show", d.e(), (List) null, 8, (Object) null);
    }
}
