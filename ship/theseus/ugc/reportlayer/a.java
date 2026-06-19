package com.bilibili.ship.theseus.ugc.reportlayer;

import Vu0.AbstractC2972k;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import com.bilibili.bililive.room.ui.playtogether.l;
import com.bilibili.bililive.room.ui.playtogether.m;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/reportlayer/a.class */
@StabilityInferred(parameters = 0)
public final class a extends DataBindingComponent<AbstractC2972k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C0925a f98483a;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.reportlayer.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/reportlayer/a$a.class */
    @StabilityInferred(parameters = 0)
    public static final class C0925a extends androidx.databinding.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final c f98484a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final l f98485b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final m f98486c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f98487d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f98488e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public String f98489f = "";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public ua0.c f98490g;

        public C0925a(@NotNull c cVar, @NotNull l lVar, @NotNull m mVar) {
            this.f98484a = cVar;
            this.f98485b = lVar;
            this.f98486c = mVar;
        }
    }

    public a(@NotNull C0925a c0925a) {
        this.f98483a = c0925a;
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        AbstractC2972k abstractC2972k = (AbstractC2972k) viewDataBinding;
        abstractC2972k.q(this.f98483a);
        abstractC2972k.executePendingBindings();
        return Unit.INSTANCE;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AbstractC2972k.inflate(layoutInflater, viewGroup, false);
    }
}
