package com.bilibili.ship.theseus.united.page.intro.module.insertedbanner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import dv0.AbstractC6850B;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/insertedbanner/b.class */
@StabilityInferred(parameters = 0)
public final class b extends DataBindingComponent<AbstractC6850B> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f100168a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/insertedbanner/b$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends androidx.databinding.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final f f100169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final f f100170b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f100171c;

        public a(@NotNull f fVar, @NotNull f fVar2) {
            this.f100169a = fVar;
            this.f100170b = fVar2;
        }
    }

    public b(@NotNull a aVar) {
        this.f100168a = aVar;
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        AbstractC6850B abstractC6850B = (AbstractC6850B) viewDataBinding;
        abstractC6850B.q(this.f100168a);
        abstractC6850B.executePendingBindings();
        return Unit.INSTANCE;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AbstractC6850B.inflate(layoutInflater, viewGroup, false);
    }
}
