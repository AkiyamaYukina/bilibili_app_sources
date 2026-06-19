package com.bilibili.studio.centerplus.ui.dialog;

import Xz0.g;
import Xz0.j;
import Xz0.k;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.activity.result.ActivityResultCaller;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/ui/dialog/ExitConfirmAlbum1Dialog.class */
public final class ExitConfirmAlbum1Dialog extends FrequencyBaseDialog {
    public ExitConfirmAlbum1Dialog() {
        super(null);
    }

    @Override // com.bilibili.studio.centerplus.ui.dialog.FrequencyBaseDialog
    public final boolean hf() {
        boolean z6;
        AlbumQuitDialog.b bVar = AlbumQuitDialog.f105100e;
        if (bVar.f105108e > 0) {
            z6 = false;
        } else {
            z6 = false;
            if (bVar.f105110g) {
                z6 = false;
                if (bVar.f105104a) {
                    z6 = true;
                }
            }
        }
        return z6;
    }

    @Override // com.bilibili.studio.centerplus.ui.dialog.FrequencyBaseDialog
    @NotNull
    /* JADX INFO: renamed from: if */
    public final FrequencyBaseDialog.a mo9832if() {
        AlbumQuitDialog.b bVar = AlbumQuitDialog.f105100e;
        return new FrequencyBaseDialog.a(0, bVar.f105107d, null, bVar.f105105b, bVar.f105106c, null, 36);
    }

    @Override // com.bilibili.studio.centerplus.ui.dialog.FrequencyBaseDialog
    public final int jf() {
        return 1;
    }

    @Override // com.bilibili.studio.centerplus.ui.dialog.FrequencyBaseDialog
    public final int kf() {
        return 0;
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
        map.put("type", String.valueOf(2));
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.studio.centerplus.ui.dialog.FrequencyBaseDialog
    public final void mf() {
        CharSequence text;
        TextView textView = this.f105257f;
        String string = (textView == null || (text = textView.getText()) == null) ? null : text.toString();
        j.c("sdk_type", KaleidoscopeFactory.SDK_MON);
        j.c("router_topic_id", g.f28463b);
        Map mapB = j.b(k.f28474a);
        HashMap map = (HashMap) mapB;
        map.put("type", String.valueOf(2));
        String str = string;
        if (string == null) {
            str = "";
        }
        map.put("button_name", str);
        Neurons.reportClick(false, "creation.choose-matter.persuade.button.click", mapB);
        dismissDialog();
        ActivityResultCaller parentFragment = getParentFragment();
        a aVar = null;
        if (parentFragment instanceof a) {
            aVar = (a) parentFragment;
        }
        if (aVar != null) {
            aVar.o8();
        }
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        j.c("sdk_type", KaleidoscopeFactory.SDK_MON);
        j.c("router_topic_id", g.f28463b);
        Map mapB = j.b(k.f28474a);
        ((HashMap) mapB).put("type", String.valueOf(2));
        Neurons.reportExposure$default(false, "creation.choose-matter.persuade.0.show", mapB, (List) null, 8, (Object) null);
    }
}
