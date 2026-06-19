package com.bilibili.teenagersmode.ui;

import com.bilibili.lib.image2.bean.ImageTintableCallback;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.teenagersmode.ui.TeenagersModePwdFragment;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/p.class */
public final /* synthetic */ class p implements TeenagersModePwdFragment.f, ImageTintableCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f110684a;

    public /* synthetic */ p(Object obj) {
        this.f110684a = obj;
    }

    @Override // com.bilibili.teenagersmode.ui.TeenagersModePwdFragment.f
    public void onFinished() {
        final TeenagersModePwdFragment teenagersModePwdFragment = (TeenagersModePwdFragment) this.f110684a;
        if (teenagersModePwdFragment.p3() == null) {
            return;
        }
        teenagersModePwdFragment.rf(2, new TeenagersModePwdFragment.g(teenagersModePwdFragment) { // from class: com.bilibili.teenagersmode.ui.o

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TeenagersModePwdFragment f110683a;

            {
                this.f110683a = teenagersModePwdFragment;
            }

            @Override // com.bilibili.teenagersmode.ui.TeenagersModePwdFragment.g
            public final void a(String str) {
                TeenagersModePwdFragment teenagersModePwdFragment2 = this.f110683a;
                teenagersModePwdFragment2.f110627d = str;
                teenagersModePwdFragment2.mf(3);
                teenagersModePwdFragment2.f110625b.j0();
            }
        });
    }

    public void tint() {
        BiliImageView biliImageView = (BiliImageView) this.f110684a;
        if (MultipleThemeUtils.isNightTheme(biliImageView.getContext())) {
            biliImageView.setAlpha(0.2f);
        }
    }
}
