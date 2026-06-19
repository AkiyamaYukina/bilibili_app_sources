package com.bilibili.upper.module.template.fragment;

import Hx.q;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import bF0.F1;
import com.bilibili.biligame.ui.pointmall.record.B;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.studio.template.data.VideoTemplateBean;
import com.bilibili.upper.module.template.vm.j;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/template/fragment/TemplatePreviewFragment.class */
@StabilityInferred(parameters = 0)
public final class TemplatePreviewFragment extends BaseFragment implements com.bilibili.upper.module.template.fragment.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f113999b = LazyKt.lazy(new M8.f(this, 6));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public F1 f114000c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/template/fragment/TemplatePreviewFragment$a.class */
    public static final /* synthetic */ class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f114001a;

        public a(Function1 function1) {
            this.f114001a = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            boolean zAreEqual = false;
            if (obj instanceof Observer) {
                zAreEqual = false;
                if (obj instanceof FunctionAdapter) {
                    zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            return zAreEqual;
        }

        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f114001a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f114001a.invoke(obj);
        }
    }

    @NotNull
    public final j jf() {
        return (j) this.f113999b.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        F1 f1Inflate = F1.inflate(getLayoutInflater(), viewGroup, false);
        this.f114000c = f1Inflate;
        return f1Inflate != null ? f1Inflate.f54736a : null;
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        F1 f12 = this.f114000c;
        if (f12 != null) {
            f12.f54748n.setSurfaceTextureListener(new g(this));
        }
        F1 f13 = this.f114000c;
        if (f13 != null) {
            f13.f54748n.setOnClickListener(new B(this, 2));
        }
        jf().f114062g.observe(getViewLifecycleOwner(), new a(new q(this, 3)));
        jf().f114058c.observe(getViewLifecycleOwner(), new a(new Jq.b(this, 3)));
        jf().f114059d.observe(getViewLifecycleOwner(), new a(new Bn.a(this, 3)));
        jf().f114060e.observe(getViewLifecycleOwner(), new a(new Jq.c(this, 1)));
        Bundle arguments = getArguments();
        VideoTemplateBean videoTemplateBean = arguments != null ? (VideoTemplateBean) arguments.getParcelable("data") : null;
        if (videoTemplateBean != null) {
            jf().f114062g.setValue(videoTemplateBean);
        }
    }

    @Override // com.bilibili.upper.module.template.fragment.a
    public final void pause() {
        jf().K0();
    }

    @Override // com.bilibili.upper.module.template.fragment.a
    public final void replay() {
        j jVarJf = jf();
        jVarJf.f114057b.f17106a.seekTo(0L);
        jVarJf.L0();
    }

    @Override // com.bilibili.upper.module.template.fragment.a
    public final void resume() {
        jf().L0();
    }

    @Override // com.bilibili.upper.module.template.fragment.a
    public final void setEnable(boolean z6) {
        jf().h = z6;
    }
}
