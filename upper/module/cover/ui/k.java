package com.bilibili.upper.module.cover.ui;

import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.upper.module.cover_v2.ui.MultiCoverOperateView;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover/ui/k.class */
public final class k implements MultiCoverOperateView.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UpperCoverEditorActivity f112769a;

    public k(UpperCoverEditorActivity upperCoverEditorActivity) {
        this.f112769a = upperCoverEditorActivity;
    }

    @Override // com.bilibili.upper.module.cover_v2.ui.MultiCoverOperateView.a
    public final void a(String str) {
        Neurons.reportClick(false, "creation.publish.cover-service.5.click", new LinkedHashMap());
        int i7 = UpperCoverEditorActivity.f112688Y;
        UpperCoverEditorActivity upperCoverEditorActivity = this.f112769a;
        upperCoverEditorActivity.Q6(str);
        MultiCoverOperateView multiCoverOperateView = upperCoverEditorActivity.f112694F;
        MultiCoverOperateView multiCoverOperateView2 = multiCoverOperateView;
        if (multiCoverOperateView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("subCoverOperateView");
            multiCoverOperateView2 = null;
        }
        long currentSeekTime = multiCoverOperateView2.getCurrentSeekTime();
        KH0.i iVarC3 = upperCoverEditorActivity.C3();
        if (iVarC3 != null) {
            iVarC3.j(currentSeekTime);
        }
        upperCoverEditorActivity.R6();
    }

    @Override // com.bilibili.upper.module.cover_v2.ui.MultiCoverOperateView.a
    public final void b() {
        Neurons.reportClick(false, "creation.publish.cover-service.3.click", new LinkedHashMap());
        UpperCoverEditorActivity.P6(this.f112769a);
    }

    @Override // com.bilibili.upper.module.cover_v2.ui.MultiCoverOperateView.a
    public final void c(String str) {
        int i7 = UpperCoverEditorActivity.f112688Y;
        UpperCoverEditorActivity upperCoverEditorActivity = this.f112769a;
        upperCoverEditorActivity.Q6(str);
        upperCoverEditorActivity.R6();
    }
}
