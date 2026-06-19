package com.bilibili.studio.centerplus.ui.dialog;

import Xz0.g;
import Xz0.j;
import Xz0.k;
import android.os.Bundle;
import android.view.View;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.studio.centerplus.ui.dialog.FrequencyBaseDialog;
import com.bilibili.studio.kaleidoscope.adapter.KaleidoscopeFactory;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/ui/dialog/ExitConfirmPublish1Dialog.class */
public final class ExitConfirmPublish1Dialog extends FrequencyBaseDialog {
    public ExitConfirmPublish1Dialog() {
        super(null);
    }

    @Override // com.bilibili.studio.centerplus.ui.dialog.FrequencyBaseDialog
    public final boolean hf() {
        return true;
    }

    @Override // com.bilibili.studio.centerplus.ui.dialog.FrequencyBaseDialog
    /* JADX INFO: renamed from: if */
    public final /* bridge */ /* synthetic */ FrequencyBaseDialog.a mo9832if() {
        return null;
    }

    @Override // com.bilibili.studio.centerplus.ui.dialog.FrequencyBaseDialog
    public final int jf() {
        return 4;
    }

    @Override // com.bilibili.studio.centerplus.ui.dialog.FrequencyBaseDialog
    public final int kf() {
        return 1;
    }

    @Override // com.bilibili.studio.centerplus.ui.dialog.FrequencyBaseDialog
    public final void lf() {
        j.c("sdk_type", KaleidoscopeFactory.SDK_MON);
        j.c("router_topic_id", g.f28463b);
        Map mapB = j.b(k.f28474a);
        HashMap map = (HashMap) mapB;
        map.put("mid_type", String.valueOf(1));
        map.put("click_type", "cancel");
        Neurons.reportClick(false, "creation.new-publish.0.pop-up.click", mapB);
    }

    @Override // com.bilibili.studio.centerplus.ui.dialog.FrequencyBaseDialog
    public final void mf() {
        j.c("sdk_type", KaleidoscopeFactory.SDK_MON);
        j.c("router_topic_id", g.f28463b);
        Map mapB = j.b(k.f28474a);
        HashMap map = (HashMap) mapB;
        map.put("mid_type", String.valueOf(1));
        map.put("click_type", "publish");
        Neurons.reportClick(false, "creation.new-publish.0.pop-up.click", mapB);
        dismissDialog();
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        j.c("sdk_type", KaleidoscopeFactory.SDK_MON);
        j.c("router_topic_id", g.f28463b);
        Map mapB = j.b(k.f28474a);
        ((HashMap) mapB).put("mid_type", String.valueOf(1));
        Neurons.reportExposure$default(false, "creation.new-publish.0.pop-up.show", mapB, (List) null, 8, (Object) null);
    }
}
