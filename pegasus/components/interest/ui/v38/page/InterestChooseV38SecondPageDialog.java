package com.bilibili.pegasus.components.interest.ui.v38.page;

import Lv.p;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import aq0.C4836M;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.comm.list.widget.utils.PaddingUtilsKt;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.theme.ThemeWatcher;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.magicasakura.widgets.Tintable;
import com.bilibili.pegasus.components.interest.t;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageType;
import com.bilibili.pegasus.components.interest.ui.v38.vm.InterestChooseV38PageViewModel;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.mall.data.page.ticket.TicketBean;
import com.mall.ui.page.ticket.fragment.MallTicketDetailFragment;
import gQ0.o;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v38/page/InterestChooseV38SecondPageDialog.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseV38SecondPageDialog extends DialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public C4836M f76934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final e f76935c = new ThemeWatcher.Observer(this) { // from class: com.bilibili.pegasus.components.interest.ui.v38.page.e

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterestChooseV38SecondPageDialog f76937a;

        {
            this.f76937a = this;
        }

        @Override // com.bilibili.lib.ui.theme.ThemeWatcher.Observer
        public final void onThemeChanged() {
            View view = this.f76937a.getView();
            if (view != null) {
                InterestChooseV38SecondPageDialog.hf(view);
            }
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public static void hf(View view) {
        RecyclerView.Adapter adapter;
        if (view instanceof Tintable) {
            ((Tintable) view).tint();
        }
        if (view instanceof ViewGroup) {
            Iterator it = ViewGroupKt.getChildren((ViewGroup) view).iterator();
            while (it.hasNext()) {
                hf((View) it.next());
            }
            if (!(view instanceof RecyclerView) || (adapter = ((RecyclerView) view).getAdapter()) == null) {
                return;
            }
            adapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            ThemeWatcher.getInstance().subscribe(this.f76935c);
        } else {
            BLog.i("[Interest]InterestChooseV38SecondPageDialog", "onCreate, from recover");
            dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    @NotNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
        WindowManager.LayoutParams attributes;
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null && (attributes = window.getAttributes()) != null) {
            attributes.windowAnimations = 2131889099;
        }
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C4836M c4836mInflate = C4836M.inflate(layoutInflater);
        this.f76934b = c4836mInflate;
        return c4836mInflate.f53753a;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ThemeWatcher.getInstance().unSubscribe(this.f76935c);
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f76934b = null;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NotNull DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        InterestChooseV38PageViewModel interestChooseV38PageViewModel = d.f76936a;
        if (interestChooseV38PageViewModel != null) {
            interestChooseV38PageViewModel.a(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.content.DialogInterface$OnKeyListener, java.lang.Object] */
    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setDimAmount(0.0f);
        StatusBarCompat.tintStatusBar(window, ContextCompat.getColor(requireContext(), R$color.f64616Wh0));
        Dialog dialog2 = getDialog();
        if (dialog2 != 0) {
            dialog2.setOnKeyListener(new Object());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.View$OnClickListener, java.lang.Object] */
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
        StateFlow<InterestChoose> stateFlow;
        final InterestChoose interestChoose;
        super.onViewCreated(view, bundle);
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            ScreenAdjustUtilsKt.collectWindowSize$default(fragmentActivityP3, false, new com.bilibili.bililive.room.ui.roomv3.vertical.global.b(1, this), 1, (Object) null);
        }
        C4836M c4836m = this.f76934b;
        if (c4836m != null) {
            PaddingUtilsKt.setPaddingTop(c4836m.f53758f, ListExtentionsKt.toPx(10));
        }
        C4836M c4836m2 = this.f76934b;
        if (c4836m2 != null) {
            c4836m2.f53758f.setItemAnimator(null);
        }
        C4836M c4836m3 = this.f76934b;
        if (c4836m3 != null) {
            c4836m3.f53758f.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        C4836M c4836m4 = this.f76934b;
        if (c4836m4 != null) {
            c4836m4.f53758f.setAdapter(new Yo0.h(new g(this), new h(0, this)));
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV38SecondPageDialog$initRv$3(this, null), 3, (Object) null);
        InterestChooseV38PageViewModel interestChooseV38PageViewModel = d.f76936a;
        if (interestChooseV38PageViewModel == null || (stateFlow = interestChooseV38PageViewModel.f76946b) == null || (interestChoose = (InterestChoose) stateFlow.getValue()) == null) {
            return;
        }
        C4836M c4836m5 = this.f76934b;
        if (c4836m5 != null) {
            c4836m5.h.setText(interestChoose.M());
        }
        C4836M c4836m6 = this.f76934b;
        if (c4836m6 != null) {
            c4836m6.f53759g.setText(interestChoose.L());
        }
        C4836M c4836m7 = this.f76934b;
        if (c4836m7 != null) {
            c4836m7.f53757e.setVisibility(0);
        }
        C4836M c4836m8 = this.f76934b;
        if (c4836m8 != null) {
            c4836m8.f53757e.setOnClickListener(new p(interestChoose, 2));
        }
        C4836M c4836m9 = this.f76934b;
        if (c4836m9 != null) {
            c4836m9.f53755c.setOnClickListener(new Object());
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV38SecondPageDialog$initConfirmButton$2(this, null), 3, (Object) null);
        C4836M c4836m10 = this.f76934b;
        if (c4836m10 != null) {
            final int i7 = 0;
            c4836m10.f53756d.setOnClickListener(new View.OnClickListener(interestChoose, i7) { // from class: com.bilibili.pegasus.components.interest.ui.v38.page.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f76941a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f76942b;

                {
                    this.f76941a = i7;
                    this.f76942b = interestChoose;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    StateFlow<Integer> stateFlow2;
                    Intent intent;
                    ViewPager viewPager;
                    int currentItem;
                    TicketBean ticketBean;
                    switch (this.f76941a) {
                        case 0:
                            InterestChoose interestChoose2 = (InterestChoose) this.f76942b;
                            Context context = view2.getContext();
                            InterestChooseV38PageViewModel interestChooseV38PageViewModel2 = d.f76936a;
                            int iD = interestChoose2.D();
                            long jO = interestChoose2.O();
                            InterestChooseV38PageViewModel interestChooseV38PageViewModel3 = d.f76936a;
                            t.a(context, interestChooseV38PageViewModel2, iD, jO, (interestChooseV38PageViewModel3 == null || (stateFlow2 = interestChooseV38PageViewModel3.f76958o) == null || ((Number) stateFlow2.getValue()).intValue() != 1) ? InterestPageType.INTEREST_1ST : InterestPageType.INTEREST_2ND, interestChoose2.B(), view2);
                            break;
                        default:
                            MallTicketDetailFragment mallTicketDetailFragment = (MallTicketDetailFragment) this.f76942b;
                            if (mallTicketDetailFragment.p3() != null && (intent = mallTicketDetailFragment.p3().getIntent()) != null && intent.getData() != null && (viewPager = mallTicketDetailFragment.w) != null && mallTicketDetailFragment.r0 != null && (currentItem = viewPager.getCurrentItem()) < ((ArrayList) mallTicketDetailFragment.r0).size() && (ticketBean = (TicketBean) ((ArrayList) mallTicketDetailFragment.r0).get(currentItem)) != null && !TextUtils.isEmpty(ticketBean.id) && mallTicketDetailFragment.Z0 != 0) {
                                MallTicketDetailFragment.tf(true, 2131830733, ticketBean);
                                String string = rT0.e.a().buildUpon().path("ticket/donation/{screenId，ticketId}").appendQueryParameter("screenId", o.s(mallTicketDetailFragment.Z0)).appendQueryParameter("ticketId", ticketBean.id).build().toString();
                                if (!mallTicketDetailFragment.v0) {
                                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(500L);
                                    duration.addUpdateListener(new tT0.d(mallTicketDetailFragment));
                                    duration.addListener(new tT0.e(mallTicketDetailFragment, string));
                                    duration.start();
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
        }
        C4836M c4836m11 = this.f76934b;
        if (c4836m11 != null) {
            FrameLayout frameLayout = c4836m11.f53756d;
            OneShotPreDrawListener.add(frameLayout, new k(frameLayout, interestChoose));
        }
    }
}
