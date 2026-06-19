package com.bilibili.studio.centerplus.ui.dialog;

import Xz0.g;
import Xz0.j;
import Xz0.k;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.studio.centerplus.dialog.AlbumQuitDialog;
import com.bilibili.studio.centerplus.ui.dialog.FrequencyBaseDialog;
import com.bilibili.studio.kaleidoscope.adapter.KaleidoscopeFactory;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/ui/dialog/ExitConfirmAlbum2Dialog.class */
public final class ExitConfirmAlbum2Dialog extends FrequencyBaseDialog {
    public ExitConfirmAlbum2Dialog() {
        super(null);
    }

    @Override // com.bilibili.studio.centerplus.ui.dialog.FrequencyBaseDialog
    public final boolean hf() {
        AlbumQuitDialog.b bVar = AlbumQuitDialog.f105100e;
        return AlbumQuitDialog.f105100e.f105108e > 0;
    }

    @Override // com.bilibili.studio.centerplus.ui.dialog.FrequencyBaseDialog
    /* JADX INFO: renamed from: if */
    public final /* bridge */ /* synthetic */ FrequencyBaseDialog.a mo9832if() {
        return null;
    }

    @Override // com.bilibili.studio.centerplus.ui.dialog.FrequencyBaseDialog
    public final int jf() {
        return 2;
    }

    @Override // com.bilibili.studio.centerplus.ui.dialog.FrequencyBaseDialog
    public final int kf() {
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.studio.centerplus.ui.dialog.FrequencyBaseDialog
    public final void lf() {
        CharSequence text;
        TextView textView = this.f105256e;
        String string = (textView == null || (text = textView.getText()) == null) ? null : text.toString();
        j.c("sdk_type", KaleidoscopeFactory.SDK_MON);
        j.c("router_topic_id", g.f28463b);
        Map mapB = j.b(k.f28474a);
        HashMap map = (HashMap) mapB;
        map.put("type", String.valueOf(1));
        String str = string;
        if (string == null) {
            str = "";
        }
        map.put("button_name", str);
        Neurons.reportClick(false, "creation.choose-matter.persuade.button.click", mapB);
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            fragmentActivityP3.finish();
        }
    }

    @Override // com.bilibili.studio.centerplus.ui.dialog.FrequencyBaseDialog
    public final void mf() {
        CharSequence text;
        TextView textView = this.f105257f;
        String string = (textView == null || (text = textView.getText()) == null) ? null : text.toString();
        j.c("sdk_type", KaleidoscopeFactory.SDK_MON);
        j.c("router_topic_id", g.f28463b);
        Map mapB = j.b(k.f28474a);
        HashMap map = (HashMap) mapB;
        map.put("type", String.valueOf(1));
        String str = string;
        if (string == null) {
            str = "";
        }
        map.put("button_name", str);
        Neurons.reportClick(false, "creation.choose-matter.persuade.button.click", mapB);
        dismissDialog();
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        j.c("sdk_type", KaleidoscopeFactory.SDK_MON);
        j.c("router_topic_id", g.f28463b);
        Map mapB = j.b(k.f28474a);
        ((HashMap) mapB).put("type", String.valueOf(1));
        Neurons.reportExposure$default(false, "creation.choose-matter.persuade.0.show", mapB, (List) null, 8, (Object) null);
    }
}
