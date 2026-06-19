package com.bilibili.pegasus.fakepegasus;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.base.viewbinding.ViewBindingProperty;
import com.bilibili.base.viewbinding.full.CreateMethod;
import com.bilibili.base.viewbinding.full.ReflectionFragmentViewBindings;
import com.bilibili.base.viewbinding.internal.UtilsKt;
import com.bilibili.lib.ui.BaseFragment;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/fakepegasus/FakeVideoDetailFragment.class */
@StabilityInferred(parameters = 0)
public final class FakeVideoDetailFragment extends BaseFragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final KProperty<Object>[] f77444c = {new PropertyReference1Impl(FakeVideoDetailFragment.class, "binding", "getBinding()Lcom/bilibili/app/pegasus/databinding/BiliAppFakeVideoDetailLayoutBinding;", 0)};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ViewBindingProperty f77445b = ReflectionFragmentViewBindings.viewBindingFragment(this, gl.c.class, CreateMethod.INFLATE, UtilsKt.emptyVbCallback());

    public final gl.c jf() {
        return (gl.c) this.f77445b.getValue(this, f77444c[0]);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return jf().a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        jf().b.setOnClickListener(new Object());
        jf().c.setLayoutManager(new LinearLayoutManager(view.getContext()));
        jf().c.setAdapter(new RecyclerView.Adapter());
    }
}
