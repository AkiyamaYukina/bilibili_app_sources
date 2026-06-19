package com.bilibili.playerbizcommon.note;

import Bt0.k;
import android.app.Dialog;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.bilibili.base.util.NumberFormat;
import com.bilibili.magicasakura.widgets.TintEditText;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.playerbizcommon.note.NoteEditTimeInfoDialog;
import eR0.f;
import kntr.base.utils.foundation.InputMethodManagerHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/note/NoteEditTimeInfoDialog.class */
public final class NoteEditTimeInfoDialog extends DialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public TintTextView f80229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public TintEditText f80230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public TintTextView f80231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public TintTextView f80232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public TintTextView f80233f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f80234g;

    @Nullable
    public String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public a f80235i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final b f80236j = new b(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/note/NoteEditTimeInfoDialog$a.class */
    public interface a {
        void a(@Nullable String str, @NotNull String str2);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/note/NoteEditTimeInfoDialog$b.class */
    public static final class b implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NoteEditTimeInfoDialog f80237a;

        public b(NoteEditTimeInfoDialog noteEditTimeInfoDialog) {
            this.f80237a = noteEditTimeInfoDialog;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            this.f80237a.hf();
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void dismiss() {
        TintEditText tintEditText = this.f80230c;
        if (tintEditText != null) {
            tintEditText.setText((CharSequence) null);
        }
        hf();
        dismissAllowingStateLoss();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void hf() {
        /*
            r11 = this;
            r0 = r11
            com.bilibili.magicasakura.widgets.TintEditText r0 = r0.f80230c
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L1d
            r0 = r12
            android.text.Editable r0 = r0.getText()
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L1d
            r0 = r12
            java.lang.String r0 = r0.toString()
            r13 = r0
            r0 = r13
            r12 = r0
            r0 = r13
            if (r0 != 0) goto L20
        L1d:
            java.lang.String r0 = ""
            r12 = r0
        L20:
            r0 = r11
            android.content.Context r0 = r0.getContext()
            r15 = r0
            r0 = 0
            r14 = r0
            r0 = r14
            r13 = r0
            r0 = r15
            if (r0 == 0) goto L5b
            r0 = r15
            android.content.res.Resources r0 = r0.getResources()
            r15 = r0
            r0 = r14
            r13 = r0
            r0 = r15
            if (r0 == 0) goto L5b
            r0 = r15
            r1 = 2131837666(0x7f1142e2, float:1.9308533E38)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r12
            int r5 = r5.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "0"
            r7 = 0
            r8 = 2
            r9 = 0
            java.lang.String r5 = kntr.base.localization.NumberFormat_androidKt.format$default(r5, r6, r7, r8, r9)
            r3[r4] = r5
            java.lang.String r0 = r0.getString(r1, r2)
            r13 = r0
        L5b:
            r0 = r11
            com.bilibili.magicasakura.widgets.TintTextView r0 = r0.f80231d
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L69
            r0 = r12
            r1 = r13
            r0.setText(r1)
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.note.NoteEditTimeInfoDialog.hf():void");
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NotNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration.orientation != 1) {
            dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Window window;
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.requestWindowFeature(1);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null) {
            return null;
        }
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.getDecorView().setPadding(0, 0, 0, 0);
        window.setWindowAnimations(2131886233);
        window.setSoftInputMode(51);
        View viewInflate = layoutInflater.inflate(2131495357, viewGroup, false);
        this.f80229b = (TintTextView) viewInflate.findViewById(2131308958);
        this.f80230c = (TintEditText) viewInflate.findViewById(2131303711);
        this.f80231d = (TintTextView) viewInflate.findViewById(2131303759);
        this.f80233f = (TintTextView) viewInflate.findViewById(2131297884);
        this.f80232e = (TintTextView) viewInflate.findViewById(2131308247);
        TintTextView tintTextView = this.f80229b;
        if (tintTextView != null) {
            tintTextView.setText(" | " + NumberFormat.formatPlayTime(this.f80234g));
        }
        TintEditText tintEditText = this.f80230c;
        if (tintEditText != null) {
            tintEditText.addTextChangedListener(this.f80236j);
        }
        TintTextView tintTextView2 = this.f80233f;
        if (tintTextView2 != null) {
            final int i7 = 0;
            tintTextView2.setOnClickListener(new View.OnClickListener(this, i7) { // from class: Oq0.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f18008a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f18009b;

                {
                    this.f18008a = i7;
                    this.f18009b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (this.f18008a) {
                        case 0:
                            ((NoteEditTimeInfoDialog) this.f18009b).dismiss();
                            break;
                        default:
                            ((f) this.f18009b).u0();
                            break;
                    }
                }
            });
        }
        TintTextView tintTextView3 = this.f80232e;
        if (tintTextView3 != null) {
            tintTextView3.setOnClickListener(new k(this, 1));
        }
        hf();
        return viewInflate;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        InputMethodManagerHelper.hideSoftInput(getContext(), this.f80230c, 2);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void showNow(@NotNull FragmentManager fragmentManager, @Nullable String str) {
        if (fragmentManager.isStateSaved()) {
            return;
        }
        super.showNow(fragmentManager, str);
    }
}
