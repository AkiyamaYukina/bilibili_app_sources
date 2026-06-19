package com.bilibili.studio.editor.moudle.editormain.ui.fragments.danmaku;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.bilibili.studio.editor.moudle.danmaku.setting.ui.BiliEditorDanmakuListFragment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/danmaku/BiliEditorDanmakuListFragmentV3.class */
public final class BiliEditorDanmakuListFragmentV3 extends BiliEditorDanmakuListFragment {
    @Override // com.bilibili.studio.editor.moudle.danmaku.setting.ui.BiliEditorDanmakuListFragment
    public final void kf() {
        BiliEditorDanmakuListFragment.a aVar = this.f106088m;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // com.bilibili.studio.editor.moudle.danmaku.setting.ui.BiliEditorDanmakuListFragment
    public final void mf() {
        jf().setAlpha(1.0f);
        jf().setEnabled(true);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final Animation onCreateAnimation(int i7, boolean z6, int i8) {
        return z6 ? AnimationUtils.loadAnimation(requireContext(), 2130772427) : AnimationUtils.loadAnimation(requireContext(), 2130772428);
    }

    @Override // com.bilibili.studio.editor.moudle.danmaku.setting.ui.BiliEditorDanmakuListFragment, androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131501846, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View$OnTouchListener, java.lang.Object] */
    @Override // com.bilibili.studio.editor.moudle.danmaku.setting.ui.BiliEditorDanmakuListFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.setOnTouchListener(new Object());
    }
}
