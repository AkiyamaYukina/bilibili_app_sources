package com.bilibili.pegasus.channelv2.detail.tab.baike;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bilibili.base.viewbinding.ViewBindingProperty;
import com.bilibili.base.viewbinding.full.CreateMethod;
import com.bilibili.base.viewbinding.full.ReflectionFragmentViewBindings;
import com.bilibili.base.viewbinding.internal.UtilsKt;
import com.bilibili.biligame.ui.widget.z;
import com.bilibili.droid.ScreenUtil;
import com.google.android.material.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import go0.C7369g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/BaikeNavigationBottomSheetDialog.class */
@StabilityInferred(parameters = 0)
public final class BaikeNavigationBottomSheetDialog extends BottomSheetDialogFragment {
    public static final KProperty<Object>[] h = {new PropertyReference1Impl(BaikeNavigationBottomSheetDialog.class, "binding", "getBinding()Lcom/bilibili/app/pegasus/databinding/BiliBaikeNavigationBottomSheetDialogFragmentBinding;", 0)};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public z f75050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f75051d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f75053f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ViewBindingProperty f75049b = ReflectionFragmentViewBindings.viewBindingFragment(this, gl.j.class, CreateMethod.INFLATE, UtilsKt.emptyVbCallback());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public String f75052e = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public String f75054g = "";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/BaikeNavigationBottomSheetDialog$a.class */
    public static final class a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BaikeNavigationBottomSheetDialog f75055a;

        public a(BaikeNavigationBottomSheetDialog baikeNavigationBottomSheetDialog) {
            this.f75055a = baikeNavigationBottomSheetDialog;
        }

        public final void onSlide(View view, float f7) {
            if (f7 < 0.0f) {
                return;
            }
            KProperty<Object>[] kPropertyArr = BaikeNavigationBottomSheetDialog.h;
            BaikeNavigationBottomSheetDialog baikeNavigationBottomSheetDialog = this.f75055a;
            baikeNavigationBottomSheetDialog.hf().e.getLayoutParams().height = f7 > 0.0f ? 0 : (int) (ScreenUtil.getScreenHeight(view.getContext()) * 0.3f);
            baikeNavigationBottomSheetDialog.hf().e.requestLayout();
        }

        public final void onStateChanged(View view, int i7) {
            if (i7 == 5) {
                this.f75055a.dismissAllowingStateLoss();
            }
        }
    }

    public final gl.j hf() {
        return (gl.j) this.f75049b.getValue(this, h[0]);
    }

    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return hf().a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDismiss(@NotNull DialogInterface dialogInterface) {
        super/*androidx.fragment.app.DialogFragment*/.onDismiss(dialogInterface);
        if (this.f75053f) {
            return;
        }
        C7369g.c(this.f75051d, this.f75052e, "3", this.f75054g, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onStart() {
        View viewFindViewById;
        super/*androidx.fragment.app.DialogFragment*/.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (viewFindViewById = dialog.findViewById(R.id.design_bottom_sheet)) == null) {
            return;
        }
        viewFindViewById.setBackgroundColor(0);
        ViewGroup.LayoutParams layoutParams = null;
        BottomSheetBehavior baikeNavigationBottomSheetBehavior = new BaikeNavigationBottomSheetBehavior(viewFindViewById.getContext(), null);
        ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
        if (layoutParams2 != null) {
            if (layoutParams2 instanceof CoordinatorLayout.LayoutParams) {
                layoutParams = layoutParams2;
            }
            CoordinatorLayout.LayoutParams layoutParams3 = (CoordinatorLayout.LayoutParams) layoutParams;
            if (layoutParams3 != null) {
                layoutParams3.setBehavior(baikeNavigationBottomSheetBehavior);
            }
        }
        baikeNavigationBottomSheetBehavior.setPeekHeight((int) (ScreenUtil.getScreenHeight(viewFindViewById.getContext()) * 0.6f));
        baikeNavigationBottomSheetBehavior.setHideable(true);
        hf().e.getLayoutParams().height = (int) (ScreenUtil.getScreenHeight(viewFindViewById.getContext()) * 0.3f);
        ViewGroup.LayoutParams layoutParams4 = viewFindViewById.getLayoutParams();
        if (layoutParams4 != null) {
            layoutParams4.height = (int) (ScreenUtil.getScreenHeight(viewFindViewById.getContext()) * 0.9f);
        }
        baikeNavigationBottomSheetBehavior.addBottomSheetCallback(new a(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b5  */
    /* JADX WARN: Type inference failed for: r0v69, types: [androidx.recyclerview.widget.RecyclerView$Adapter, com.bilibili.pegasus.channelv2.detail.tab.baike.a, si.f] */
    /* JADX WARN: Type inference failed for: r1v22, types: [com.bilibili.pegasus.channelv2.detail.tab.baike.b] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewCreated(@org.jetbrains.annotations.NotNull android.view.View r14, @org.jetbrains.annotations.Nullable android.os.Bundle r15) {
        /*
            Method dump skipped, instruction units count: 1737
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv2.detail.tab.baike.BaikeNavigationBottomSheetDialog.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
