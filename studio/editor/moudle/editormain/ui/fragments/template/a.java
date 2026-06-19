package com.bilibili.studio.editor.moudle.editormain.ui.fragments.template;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bilibili.studio.editor.moudle.templatev2.vm.k;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/template/a.class */
public final class a implements ViewModelProvider.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorTemplateFragmentV5 f107003a;

    public a(BiliEditorTemplateFragmentV5 biliEditorTemplateFragmentV5) {
        this.f107003a = biliEditorTemplateFragmentV5;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> cls) {
        BiliEditorTemplateFragmentV5 biliEditorTemplateFragmentV5 = this.f107003a;
        return new k(biliEditorTemplateFragmentV5.f106997r, biliEditorTemplateFragmentV5.f106998s, biliEditorTemplateFragmentV5.f105685b, biliEditorTemplateFragmentV5.yf(), biliEditorTemplateFragmentV5.zf(), biliEditorTemplateFragmentV5.f106996q);
    }
}
