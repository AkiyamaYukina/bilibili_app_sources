package com.bilibili.pegasus.components.interest.ui;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import aq0.V0;
import com.bilibili.base.viewbinding.ViewBindingProperty;
import com.bilibili.base.viewbinding.full.CreateMethod;
import com.bilibili.base.viewbinding.full.ReflectionFragmentViewBindings;
import com.bilibili.base.viewbinding.internal.UtilsKt;
import com.bilibili.pegasus.components.interest.ui.vm.InterestChooseViewModel;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/SubCategoryInterestChooseDialog.class */
@StabilityInferred(parameters = 0)
public final class SubCategoryInterestChooseDialog extends BaseInterestChooseDialog {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final KProperty<Object>[] f76378i = {new PropertyReference1Impl(SubCategoryInterestChooseDialog.class, "binding", "getBinding()Lcom/bilibili/pegasusBiz/databinding/LayoutPegasusSubCategoryInterestChooseDialogBinding;", 0)};

    @NotNull
    public final ViewBindingProperty h = ReflectionFragmentViewBindings.viewBindingFragment(this, V0.class, CreateMethod.INFLATE, UtilsKt.emptyVbCallback());

    public final V0 jf() {
        return (V0) this.h.getValue(this, f76378i[0]);
    }

    @Override // com.bilibili.pegasus.components.interest.ui.BaseInterestChooseDialog, androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        InterestChooseViewModel interestChooseViewModel = new InterestChooseViewModel();
        interestChooseViewModel.f76970a.setValue(this.f76374d);
        com.bilibili.pegasus.components.interest.ui.vm.a.f76985a = interestChooseViewModel;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.requestWindowFeature(1);
        }
        return jf().f53898a;
    }

    @Override // com.bilibili.pegasus.components.interest.ui.BaseInterestChooseDialog, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        com.bilibili.pegasus.components.interest.ui.vm.a.f76985a = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDismiss(@org.jetbrains.annotations.NotNull android.content.DialogInterface r15) {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.SubCategoryInterestChooseDialog.onDismiss(android.content.DialogInterface):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:196:0x05a4  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewCreated(@org.jetbrains.annotations.NotNull android.view.View r9, @org.jetbrains.annotations.Nullable android.os.Bundle r10) {
        /*
            Method dump skipped, instruction units count: 1456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.SubCategoryInterestChooseDialog.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
