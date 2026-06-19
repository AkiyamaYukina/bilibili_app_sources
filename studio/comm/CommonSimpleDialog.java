package com.bilibili.studio.comm;

import ES0.d1;
import TB0.C2887t;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import j5.C7642d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/CommonSimpleDialog.class */
public final class CommonSimpleDialog extends DialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public C2887t f105339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public d1 f105340c;

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Window window;
        setStyle(1, 0);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            C7642d.a(window, 0);
        }
        C2887t c2887tInflate = C2887t.inflate(layoutInflater, viewGroup, false);
        this.f105339b = c2887tInflate;
        return c2887tInflate != null ? c2887tInflate.f23988a : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewCreated(@org.jetbrains.annotations.NotNull android.view.View r7, @org.jetbrains.annotations.Nullable android.os.Bundle r8) {
        /*
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            super.onViewCreated(r1, r2)
            r0 = r6
            TB0.t r0 = r0.f105339b
            r7 = r0
            java.lang.String r0 = ""
            r8 = r0
            r0 = r7
            if (r0 == 0) goto L36
            r0 = r7
            android.widget.TextView r0 = r0.f23991d
            r9 = r0
            r0 = r6
            android.os.Bundle r0 = r0.getArguments()
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L2e
            r0 = r7
            java.lang.String r1 = "TITLE"
            java.lang.String r0 = r0.getString(r1)
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L2e
            goto L31
        L2e:
            java.lang.String r0 = ""
            r7 = r0
        L31:
            r0 = r9
            r1 = r7
            r0.setText(r1)
        L36:
            r0 = r6
            TB0.t r0 = r0.f105339b
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L65
            r0 = r7
            android.widget.TextView r0 = r0.f23989b
            r10 = r0
            r0 = r6
            android.os.Bundle r0 = r0.getArguments()
            r9 = r0
            r0 = r8
            r7 = r0
            r0 = r9
            if (r0 == 0) goto L5f
            r0 = r9
            java.lang.String r1 = "BUTTON_CONENTE"
            java.lang.String r0 = r0.getString(r1)
            r9 = r0
            r0 = r8
            r7 = r0
            r0 = r9
            if (r0 == 0) goto L5f
            r0 = r9
            r7 = r0
        L5f:
            r0 = r10
            r1 = r7
            r0.setText(r1)
        L65:
            r0 = r6
            TB0.t r0 = r0.f105339b
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L7e
            r0 = r7
            android.widget.TextView r0 = r0.f23989b
            Jb.b r1 = new Jb.b
            r2 = r1
            r3 = r6
            r4 = 2
            r2.<init>(r3, r4)
            r0.setOnClickListener(r1)
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.comm.CommonSimpleDialog.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
