package com.bilibili.search2.result.holder.chatgpt;

import Bl.X0;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.DialogFragment;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.fasthybrid.biz.debug.Z;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.search2.result.holder.chatgpt.api.DisclaimerItem;
import com.bilibili.search2.result.holder.chatgpt.api.Disclaimers;
import com.bilibili.search2.utils.B;
import com.bilibili.studio.module.tuwen.util.BcutVideoClipCropUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/DisclaimerDialogFragment.class */
@StabilityInferred(parameters = 0)
public final class DisclaimerDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public X0 f87914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final k f87915c = new k();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Z f87916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f87917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f87918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Disclaimers f87919g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/DisclaimerDialogFragment$a.class */
    public static final class a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DisclaimerDialogFragment f87920a;

        public a(DisclaimerDialogFragment disclaimerDialogFragment) {
            this.f87920a = disclaimerDialogFragment;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.f87920a.dismiss();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    public final void hf() {
        AnimatorSet animatorSet = new AnimatorSet();
        X0 x02 = this.f87914b;
        X0 x03 = x02;
        if (x02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x03 = null;
        }
        animatorSet.playTogether(ObjectAnimator.ofFloat(x03.a, "alpha", 1.0f, 0.0f));
        animatorSet.setDuration(100L);
        animatorSet.addListener(new a(this));
        animatorSet.start();
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            getParentFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        X0 x0Inflate = X0.inflate(layoutInflater, viewGroup, false);
        this.f87914b = x0Inflate;
        X0 x02 = x0Inflate;
        if (x0Inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x02 = null;
        }
        x02.c.setAlpha(0.0f);
        x02.d.setAlpha(0.0f);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f87917e = arguments.getInt("locationX", 0);
            this.f87918f = arguments.getInt("locationY", 0);
            this.f87919g = (Disclaimers) arguments.getParcelable("disclaimers");
        }
        X0 x03 = this.f87914b;
        if (x03 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x03 = null;
        }
        return x03.a;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NotNull DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        Z z6 = this.f87916d;
        if (z6 != null) {
            z6.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v44, types: [android.view.View$OnClickListener, java.lang.Object] */
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
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Window window;
        Window window2;
        super.onViewCreated(view, bundle);
        if (this.f87919g == null) {
            return;
        }
        X0 x02 = this.f87914b;
        X0 x03 = x02;
        if (x02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            x03 = null;
        }
        final TintImageView tintImageView = x03.d;
        B.w(tintImageView, ListExtentionsKt.toPx(2) + this.f87917e);
        B.y(tintImageView, ListExtentionsKt.toPx(18) + this.f87918f);
        tintImageView.post(new Runnable(tintImageView, this) { // from class: com.bilibili.search2.result.holder.chatgpt.l

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TintImageView f88024a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final DisclaimerDialogFragment f88025b;

            {
                this.f88024a = tintImageView;
                this.f88025b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TintImageView tintImageView2 = this.f88024a;
                DisclaimerDialogFragment disclaimerDialogFragment = this.f88025b;
                tintImageView2.setPivotX(tintImageView2.getWidth() / 2);
                tintImageView2.setPivotY(tintImageView2.getHeight() / 2);
                AnimatorSet animatorSet = new AnimatorSet();
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tintImageView2, BcutVideoClipCropUtil.STORYBOARD_KEY_SCALE_X, 1.0f, 1.4f);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(tintImageView2, BcutVideoClipCropUtil.STORYBOARD_KEY_SCALE_Y, 1.0f, 1.4f);
                X0 x04 = disclaimerDialogFragment.f87914b;
                X0 x05 = x04;
                if (x04 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    x05 = null;
                }
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(x05.c, "alpha", 0.0f, 1.0f);
                X0 x06 = disclaimerDialogFragment.f87914b;
                if (x06 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    x06 = null;
                }
                animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, ObjectAnimator.ofFloat(x06.d, "alpha", 0.0f, 1.0f));
                animatorSet.setDuration(100L);
                animatorSet.start();
            }
        });
        Disclaimers disclaimers = this.f87919g;
        x03.e.setText(disclaimers != null ? disclaimers.f87975a : null);
        x03.f.setAdapter(this.f87915c);
        k kVar = this.f87915c;
        Disclaimers disclaimers2 = this.f87919g;
        List<DisclaimerItem> list = null;
        if (disclaimers2 != null) {
            list = disclaimers2.f87976b;
        }
        ((ArrayList) kVar.f88023a).clear();
        List<DisclaimerItem> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            ((ArrayList) kVar.f88023a).addAll(list2);
            kVar.notifyDataSetChanged();
        }
        x03.a.setOnClickListener(new X60.p(this, 2));
        x03.b.setOnClickListener(new X60.q(this, 3));
        x03.c.setOnClickListener(new Object());
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setLayout(-1, -1);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null) {
            return;
        }
        StatusBarCompat.immersiveStatusBar(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
    }
}
