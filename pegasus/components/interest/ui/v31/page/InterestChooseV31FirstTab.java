package com.bilibili.pegasus.components.interest.ui.v31.page;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4867j;
import com.bilibili.app.comm.list.widget.utils.s;
import com.bilibili.lib.fasthybrid.common.transitioning.impl.AppletAnimatedActivity;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.magicasakura.widgets.TintFrameLayout;
import com.bilibili.pegasus.components.interest.B;
import com.bilibili.pegasus.components.interest.ui.v31.vm.InterestChooseV31PageViewModel;
import kntr.app.appwidget.guide.ui.o;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.sms.SmsLoginDialogActivityV2;
import tv.danmaku.bili.ui.login.d;
import video.biz.offline.list.logic.statemachine.OfflineDiagnosePageStore;
import video.biz.offline.list.logic.statemachine.w;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v31/page/InterestChooseV31FirstTab.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseV31FirstTab extends androidx_fragment_app_Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public C4867j f76602b;

    public final InterestChooseV31PageViewModel hf() {
        Fragment parentFragment = getParentFragment();
        InterestChooseV31PageViewModel interestChooseV31PageViewModelKf = null;
        InterestChooseV31Dialog interestChooseV31Dialog = parentFragment instanceof InterestChooseV31Dialog ? (InterestChooseV31Dialog) parentFragment : null;
        if (interestChooseV31Dialog != null) {
            interestChooseV31PageViewModelKf = interestChooseV31Dialog.kf();
        }
        return interestChooseV31PageViewModelKf;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C4867j c4867jInflate = C4867j.inflate(layoutInflater);
        this.f76602b = c4867jInflate;
        return c4867jInflate != null ? c4867jInflate.f54062a : null;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f76602b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        StateFlow<Fo0.h> stateFlow;
        Fo0.h hVar;
        super.onViewCreated(view, bundle);
        InterestChooseV31PageViewModel interestChooseV31PageViewModelHf = hf();
        if (interestChooseV31PageViewModelHf == null || (stateFlow = interestChooseV31PageViewModelHf.h) == null || (hVar = (Fo0.h) stateFlow.getValue()) == null) {
            return;
        }
        C4867j c4867j = this.f76602b;
        if (c4867j != null) {
            c4867j.f54068g.setText(hVar.h);
        }
        C4867j c4867j2 = this.f76602b;
        if (c4867j2 != null) {
            c4867j2.f54067f.setText(hVar.f6347n);
        }
        Context context = getContext();
        boolean zIsNightTheme = context != null ? MultipleThemeUtils.isNightTheme(context) : false;
        C4867j c4867j3 = this.f76602b;
        if (c4867j3 != null) {
            c4867j3.f54063b.setAlpha(zIsNightTheme ? 0.7f : 1.0f);
        }
        C4867j c4867j4 = this.f76602b;
        if (c4867j4 != null) {
            c4867j4.f54063b.setVisibility(0);
        }
        C4867j c4867j5 = this.f76602b;
        if (c4867j5 != null) {
            c4867j5.f54064c.setOnClickListener(new YG0.a(2, this, hVar));
        }
        C4867j c4867j6 = this.f76602b;
        if (c4867j6 != null) {
            FrameLayout frameLayout = c4867j6.f54064c;
            OneShotPreDrawListener.add(frameLayout, new f(frameLayout, hVar));
        }
        C4867j c4867j7 = this.f76602b;
        if (c4867j7 != null) {
            c4867j7.f54066e.setItemAnimator(null);
        }
        C4867j c4867j8 = this.f76602b;
        if (c4867j8 != null) {
            RecyclerView recyclerView = c4867j8.f54066e;
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
            gridLayoutManager.setSpanSizeLookup(new g(this));
            recyclerView.setLayoutManager(gridLayoutManager);
        }
        C4867j c4867j9 = this.f76602b;
        if (c4867j9 != null) {
            c4867j9.f54066e.setAdapter(new Mo0.i(new c(this), new d(this)));
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV31FirstTab$initRv$4(this, null), 3, (Object) null);
        final int i7 = 0;
        s.c(this, new Function0(this, i7) { // from class: com.bilibili.pegasus.components.interest.ui.v31.page.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f76614a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f76615b;

            {
                this.f76614a = i7;
                this.f76615b = this;
            }

            public final Object invoke() {
                TintFrameLayout tintFrameLayout;
                Object obj = this.f76615b;
                switch (this.f76614a) {
                    case 0:
                        C4867j c4867j10 = ((InterestChooseV31FirstTab) obj).f76602b;
                        if (c4867j10 != null && (tintFrameLayout = c4867j10.f54062a) != null) {
                            B.a(tintFrameLayout);
                        }
                        break;
                    case 1:
                        AppletAnimatedActivity appletAnimatedActivity = (AppletAnimatedActivity) obj;
                        appletAnimatedActivity.J3();
                        appletAnimatedActivity.finish();
                        break;
                    case 2:
                        ((o) obj).b(false);
                        break;
                    case 3:
                        int i8 = SmsLoginDialogActivityV2.w1;
                        d.c.b("app.sms-login2.verification2.0.show", ((SmsLoginDialogActivityV2) obj).X6());
                        break;
                    default:
                        ((OfflineDiagnosePageStore) obj).b(w.a.a);
                        break;
                }
                return Unit.INSTANCE;
            }
        });
    }
}
