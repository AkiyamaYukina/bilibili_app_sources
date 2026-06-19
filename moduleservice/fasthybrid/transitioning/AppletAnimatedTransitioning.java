package com.bilibili.moduleservice.fasthybrid.transitioning;

import com.bilibili.moduleservice.fasthybrid.transitioning.AppletContextTransitioning;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/fasthybrid/transitioning/AppletAnimatedTransitioning.class */
public abstract class AppletAnimatedTransitioning<TransitionContext extends AppletContextTransitioning> {
    public abstract void animateTransition(@NotNull TransitionContext transitioncontext);

    public void animationEnded() {
    }

    public abstract boolean canAnimateTransition(@NotNull TransitionContext transitioncontext);

    public abstract void prepareTransitionView(@NotNull TransitionContext transitioncontext);
}
