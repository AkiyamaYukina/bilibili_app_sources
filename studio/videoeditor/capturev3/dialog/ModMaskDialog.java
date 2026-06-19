package com.bilibili.studio.videoeditor.capturev3.dialog;

import AO0.g;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment;
import com.freeletics.flowredux.dsl.e;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/dialog/ModMaskDialog.class */
public class ModMaskDialog extends DialogFragment implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f109137b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f109138c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/dialog/ModMaskDialog$a.class */
    public final class a implements View.OnKeyListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ModMaskDialog f109139a;

        public a(ModMaskDialog modMaskDialog) {
            this.f109139a = modMaskDialog;
        }

        @Override // android.view.View.OnKeyListener
        public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0 || i7 != 4) {
                return false;
            }
            g.a(1, System.currentTimeMillis() - this.f109139a.f109137b);
            ModMaskDialog modMaskDialog = this.f109139a;
            e eVar = modMaskDialog.f109138c;
            if (eVar == null) {
                modMaskDialog.p3().finish();
                return true;
            }
            int i8 = IndependentCaptureFragment.f109161L;
            ((IndependentCaptureFragment) eVar.a).vf();
            return true;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == 2131298372) {
            g.a(1, System.currentTimeMillis() - this.f109137b);
            e eVar = this.f109138c;
            if (eVar == null) {
                p3().finish();
            } else {
                int i7 = IndependentCaptureFragment.f109161L;
                ((IndependentCaptureFragment) eVar.a).vf();
            }
        }
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, 2131888085);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(2131493926, viewGroup, false);
        viewInflate.findViewById(2131298372).setOnClickListener(this);
        return viewInflate;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        getView().setFocusableInTouchMode(true);
        getView().requestFocus();
        getView().setOnKeyListener(new a(this));
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        getDialog().getWindow().setLayout(-1, -1);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f109137b = System.currentTimeMillis();
    }
}
