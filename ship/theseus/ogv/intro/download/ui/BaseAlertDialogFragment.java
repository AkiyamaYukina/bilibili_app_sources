package com.bilibili.ship.theseus.ogv.intro.download.ui;

import android.R;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.bilibili.mobile.BLMobileHumanActionNative;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/BaseAlertDialogFragment.class */
@Deprecated
public abstract class BaseAlertDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f92417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Button f92418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Button f92419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Button f92420e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/BaseAlertDialogFragment$a.class */
    public final class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BaseAlertDialogFragment f92421a;

        public a(BaseAlertDialogFragment baseAlertDialogFragment) {
            this.f92421a = baseAlertDialogFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int id = view.getId();
            this.f92421a.hf(id != 16908313 ? id != 16908315 ? -2 : -3 : -1);
        }
    }

    public abstract void hf(int i7);

    @NonNull
    /* JADX INFO: renamed from: if, reason: not valid java name */
    public abstract View mo8989if(LayoutInflater layoutInflater, ViewGroup viewGroup);

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            setStyle(1, 2131888016);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(2131500308, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(2131299774);
        View viewMo8989if = mo8989if(layoutInflater, viewGroup2);
        if (viewGroup2 != viewMo8989if) {
            if (viewMo8989if.getParent() == null) {
                viewGroup2.addView(viewMo8989if);
            } else if (viewMo8989if.getParent() != viewGroup2) {
                throw new IllegalStateException("The specified custom view already has a parent.");
            }
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Dialog dialog = getDialog();
        if (dialog != null && getView() != null) {
            Window window = dialog.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            int i7 = dialog.getContext().getResources().getDisplayMetrics().widthPixels;
            int i8 = 1080;
            if (i7 <= 1080) {
                i8 = (i7 * 7) / 8;
            }
            attributes.width = i8;
            attributes.height = -2;
            getView().measure(View.MeasureSpec.makeMeasureSpec(attributes.width, BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            window.setAttributes(attributes);
        }
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f92417b = (TextView) view.findViewById(2131308958);
        View viewFindViewById = view.findViewById(2131297809);
        this.f92418c = (Button) viewFindViewById.findViewById(R.id.button3);
        this.f92419d = (Button) viewFindViewById.findViewById(R.id.button2);
        this.f92420e = (Button) viewFindViewById.findViewById(R.id.button1);
        a aVar = new a(this);
        this.f92418c.setOnClickListener(aVar);
        this.f92419d.setOnClickListener(aVar);
        this.f92420e.setOnClickListener(aVar);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        try {
            Field declaredField = fragmentManager.getClass().getDeclaredField("mStateSaved");
            declaredField.setAccessible(true);
            if (declaredField.getBoolean(fragmentManager)) {
                return;
            }
            super.show(fragmentManager, str);
        } catch (Exception e7) {
            super.show(fragmentManager, str);
        }
    }
}
