package com.bilibili.studio.editor.moudle.editormain.ui.fragments;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import fz0.InterfaceC7206a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/BiliEditorMainBaseFragment.class */
public abstract class BiliEditorMainBaseFragment extends BaseFragment implements View.OnTouchListener, InterfaceC7206a {
    @Override // fz0.InterfaceC7206a
    public void La(@NotNull Function1<? super Boolean, Unit> function1) {
        function1.invoke(Boolean.TRUE);
    }

    @Override // fz0.InterfaceC7206a
    @Nullable
    public EditVideoInfo Q0() {
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final Animation onCreateAnimation(int i7, boolean z6, int i8) {
        return z6 ? AnimationUtils.loadAnimation(requireContext(), 2130772427) : AnimationUtils.loadAnimation(requireContext(), 2130772428);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(@Nullable View view, @Nullable MotionEvent motionEvent) {
        if (motionEvent == null || motionEvent.getAction() != 1 || view == null) {
            return true;
        }
        view.performClick();
        return true;
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.setOnTouchListener(this);
    }
}
