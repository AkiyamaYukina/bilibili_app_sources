package com.bilibili.playset.detail;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import bR0.n;
import com.bilibili.lib.ui.BaseFragment;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/MultiTypeListDetailContainerFragment.class */
@StabilityInferred(parameters = 0)
public final class MultiTypeListDetailContainerFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f84255b = LazyKt.lazy(new n(this, 4));

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        ComposeView composeView = new ComposeView(layoutInflater.getContext(), null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-714069492, true, new Zu.c(this, 2)));
        return composeView;
    }
}
