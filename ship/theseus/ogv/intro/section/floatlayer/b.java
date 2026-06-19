package com.bilibili.ship.theseus.ogv.intro.section.floatlayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewbinding.ViewBinding;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import zu0.C9258v;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/b.class */
@StabilityInferred(parameters = 0)
public final class b extends com.bilibili.app.gemini.ui.m<C9258v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f93650a;

    public b(@NotNull String str) {
        this.f93650a = str;
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        ((C9258v) viewBinding).f130897b.setText(this.f93650a);
        return Unit.INSTANCE;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C9258v.inflate(layoutInflater, viewGroup, false);
    }
}
