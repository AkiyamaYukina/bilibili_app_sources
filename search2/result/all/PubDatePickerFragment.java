package com.bilibili.search2.result.all;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import java.lang.reflect.Field;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/PubDatePickerFragment.class */
@StabilityInferred(parameters = 0)
public final class PubDatePickerFragment extends DialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f87151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f87152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f87153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f87154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f87155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Function3<Integer, Integer, Integer, Unit> f87156g;
    public DatePicker h;

    /* JADX WARN: Multi-variable type inference failed */
    public PubDatePickerFragment(int i7, int i8, int i9, long j7, long j8, @NotNull Function3<? super Integer, ? super Integer, ? super Integer, Unit> function3) {
        this.f87151b = i7;
        this.f87152c = i8;
        this.f87153d = i9;
        this.f87154e = j7;
        this.f87155f = j8;
        this.f87156g = function3;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NotNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131494162, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        DatePicker datePicker = (DatePicker) view.findViewById(2131299917);
        this.h = datePicker;
        DatePicker datePicker2 = datePicker;
        if (datePicker == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDatePicker");
            datePicker2 = null;
        }
        datePicker2.init(this.f87151b, this.f87152c, this.f87153d, null);
        DatePicker datePicker3 = this.h;
        DatePicker datePicker4 = datePicker3;
        if (datePicker3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDatePicker");
            datePicker4 = null;
        }
        datePicker4.setMaxDate(this.f87155f);
        DatePicker datePicker5 = this.h;
        if (datePicker5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDatePicker");
            datePicker5 = null;
        }
        datePicker5.setMinDate(this.f87154e);
        view.findViewById(2131308247).setOnClickListener(new com.bilibili.bililive.biz.prop.h(this, 1));
        view.findViewById(2131297884).setOnClickListener(new ViewOnClickListenerC6056j(this, 0));
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void show(@NotNull FragmentManager fragmentManager, @Nullable String str) {
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
