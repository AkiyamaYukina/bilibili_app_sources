package com.bilibili.ship.theseus.ogv.intro.section.floatlayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewbinding.ViewBinding;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import zu0.L;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/a.class */
@StabilityInferred(parameters = 0)
public final class a extends com.bilibili.app.gemini.ui.m<L> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f93649a;

    public a(@NotNull String str) {
        this.f93649a = str;
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        ((L) viewBinding).f130517b.setText(this.f93649a);
        return Unit.INSTANCE;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return L.inflate(layoutInflater, viewGroup, false);
    }
}
