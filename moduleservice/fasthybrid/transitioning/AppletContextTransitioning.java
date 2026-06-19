package com.bilibili.moduleservice.fasthybrid.transitioning;

import android.view.View;
import com.bilibili.moduleservice.fasthybrid.transitioning.data.TransitioningOperation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/fasthybrid/transitioning/AppletContextTransitioning.class */
public interface AppletContextTransitioning {
    @NotNull
    Function0<Unit> getCompleteTransition();

    @Nullable
    View getContainerView();

    @NotNull
    TransitioningOperation getOperation();

    @Nullable
    TransitionPopTarget getTransitionPopTarget();
}
