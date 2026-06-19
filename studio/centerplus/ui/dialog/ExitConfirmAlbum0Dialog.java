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
import com.bilibili.studio.centerplus.ui.dialog.a;
import com.bilibili.studio.kaleidoscope.adapter.KaleidoscopeFactory;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/ui/dialog/ExitConfirmAlbum0Dialog.class */
public final class ExitConfirmAlbum0Dialog extends FrequencyBaseDialog {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public a.C1183a f105253q;

    public ExitConfirmAlbum0Dialog() {
        super(null);
    }

    @Override // com.bilibili.studio.centerplus.ui.dialog.FrequencyBaseDialog
    public final boolean hf() {
        boolean z6 = false;
        if (AlbumQuitDialog.f105100e.f105108e > 0) {
            ActivityResultCaller activityResultCaller = this.f105254c;
            z6 = false;
            if (activityResultCaller instanceof a) {
                a.C1183a c1183aMb = ((a) activityResultCaller).Mb();
                this.f105253q = c1183aMb;
                z6 = false;
                if (c1183aMb != null) {
                    z6 = true;
                }
            }
        }
        return z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    @Override // com.bilibili.studio.centerplus.ui.dialog.FrequencyBaseDialog
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: if, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.studio.centerplus.ui.dialog.FrequencyBaseDialog.a mo9832if() {
        /*
            r10 = this;
            r0 = r10
            com.bilibili.studio.centerplus.ui.dialog.a$a r0 = r0.f105253q
            r13 = r0
            r0 = 0
            r12 = r0
            r0 = r13
            if (r0 == 0) goto L13
            r0 = r13
            java.lang.String r0 = r0.f105273a
            r11 = r0
            goto L15
        L13:
            r0 = 0
            r11 = r0
        L15:
            r0 = r13
            if (r0 == 0) goto L1e
            r0 = r13
            java.lang.String r0 = r0.f105274b
            r12 = r0
        L1e:
            r0 = r13
            if (r0 == 0) goto L36
            r0 = r13
            java.lang.String r0 = r0.f105275c
            r14 = r0
            r0 = r14
            r13 = r0
            r0 = r14
            if (r0 != 0) goto L33
            goto L36
        L33:
            goto L3c
        L36:
            java.lang.String r0 = ""
            r13 = r0
            goto L33
        L3c:
            com.bilibili.studio.centerplus.ui.dialog.FrequencyBaseDialog$a r0 = new com.bilibili.studio.centerplus.ui.dialog.FrequencyBaseDialog$a
            r1 = r0
            r2 = 1
            r3 = r11
            r4 = r12
            r5 = 0
            r6 = 0
            r7 = r13
            r8 = 24
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.centerplus.ui.dialog.ExitConfirmAlbum0Dialog.mo9832if():com.bilibili.studio.centerplus.ui.dialog.FrequencyBaseDialog$a");
    }

    @Override // com.bilibili.studio.centerplus.ui.dialog.FrequencyBaseDialog
    public final int jf() {
        return 0;
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
        map.put("type", String.valueOf(3));
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
        map.put("type", String.valueOf(3));
        String str = string;
        if (string == null) {
            str = "";
        }
        map.put("button_name", str);
        Neurons.reportClick(false, "creation.choose-matter.persuade.button.click", mapB);
        dismissDialog();
        if (getParentFragment() instanceof a) {
            ((a) getParentFragment()).jb();
        }
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        j.c("sdk_type", KaleidoscopeFactory.SDK_MON);
        j.c("router_topic_id", g.f28463b);
        Map mapB = j.b(k.f28474a);
        ((HashMap) mapB).put("type", String.valueOf(3));
        Neurons.reportExposure$default(false, "creation.choose-matter.persuade.0.show", mapB, (List) null, 8, (Object) null);
    }
}
