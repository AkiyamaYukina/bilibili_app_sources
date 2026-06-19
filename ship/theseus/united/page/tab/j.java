package com.bilibili.ship.theseus.united.page.tab;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import dv0.AbstractC6873k;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/j.class */
@StabilityInferred(parameters = 0)
public final class j extends DataBindingComponent<AbstractC6873k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f103194a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/j$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends androidx.databinding.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f103196b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public ColorStateList f103197c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f103199e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public String f103195a = "";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f103198d = 13.0f;
    }

    public j(@NotNull a aVar) {
        this.f103194a = aVar;
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        AbstractC6873k abstractC6873k = (AbstractC6873k) viewDataBinding;
        a aVar = this.f103194a;
        abstractC6873k.q(aVar);
        ColorStateList colorStateList = aVar.f103197c;
        if (colorStateList != null) {
            abstractC6873k.f117033w.setTextColor(colorStateList);
        }
        TextView textView = abstractC6873k.f117033w;
        textView.setTextSize(aVar.f103198d);
        if (aVar.f103199e) {
            textView.setTypeface(textView.getTypeface(), 1);
        } else {
            textView.setTypeface(textView.getTypeface(), 0);
        }
        abstractC6873k.executePendingBindings();
        return Unit.INSTANCE;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AbstractC6873k.inflate(layoutInflater, viewGroup, false);
    }
}
