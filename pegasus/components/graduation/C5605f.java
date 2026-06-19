package com.bilibili.pegasus.components.graduation;

import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.homepage.splash.SplashViewModel;
import com.bilibili.pegasus.components.graduation.Graduation26Component;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.bilibili.pegasus.components.graduation.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/f.class */
public final /* synthetic */ class C5605f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Graduation26Component f76116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView f76117b;

    public /* synthetic */ C5605f(Graduation26Component graduation26Component, RecyclerView recyclerView) {
        this.f76116a = graduation26Component;
        this.f76117b = recyclerView;
    }

    public final Object invoke(Object obj) {
        return Graduation26Component.AnonymousClass1.invokeSuspend$lambda$0(this.f76116a, this.f76117b, (SplashViewModel.SplashExitInfo) obj);
    }
}
