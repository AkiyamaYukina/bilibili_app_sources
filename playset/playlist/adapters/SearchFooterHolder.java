package com.bilibili.playset.playlist.adapters;

import Ks.e;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import es0.C6973c;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import os0.AbstractC8255a;
import os0.q;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/adapters/SearchFooterHolder.class */
@StabilityInferred(parameters = 0)
public final class SearchFooterHolder extends AbstractC8255a<q> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Companion f85193d = new Companion();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C6973c f85194c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/adapters/SearchFooterHolder$Companion.class */
    public static final class Companion {
        @JvmStatic
        @Keep
        @NotNull
        public final SearchFooterHolder create(@NotNull ViewGroup viewGroup, @Nullable Function0<Unit> function0) {
            SearchFooterHolder searchFooterHolder = new SearchFooterHolder(C6973c.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
            searchFooterHolder.f85194c.f117384g.setOnClickListener(new e(function0, 2));
            return searchFooterHolder;
        }
    }

    public SearchFooterHolder(@NotNull C6973c c6973c) {
        super(c6973c.f117378a);
        this.f85194c = c6973c;
    }

    @JvmStatic
    @Keep
    @NotNull
    public static final SearchFooterHolder create(@NotNull ViewGroup viewGroup, @Nullable Function0<Unit> function0) {
        return f85193d.create(viewGroup, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // os0.AbstractC8256b
    public final void bind() {
        int i7 = ((q) p0()).f124964b;
        C6973c c6973c = this.f85194c;
        if (i7 == 0) {
            ListExtentionsKt.visible(c6973c.f117378a);
            q0();
            c6973c.f117379b.setText(((q) p0()).f124965c);
            ListExtentionsKt.gone(c6973c.f117384g);
            ListExtentionsKt.visible(c6973c.f117381d);
            ListExtentionsKt.visible(c6973c.f117382e);
            return;
        }
        if (i7 == 1) {
            ListExtentionsKt.visible(this.itemView);
            q0();
            c6973c.f117379b.setText(((q) p0()).f124965c);
            ListExtentionsKt.gone(c6973c.f117384g);
            ListExtentionsKt.gone(c6973c.f117381d);
            ListExtentionsKt.gone(c6973c.f117382e);
            return;
        }
        if (i7 == 2) {
            ListExtentionsKt.gone(this.itemView);
            return;
        }
        if (i7 == 3) {
            ListExtentionsKt.gone(c6973c.f117378a);
            return;
        }
        if (i7 == 4) {
            ListExtentionsKt.gone(this.itemView);
            return;
        }
        if (i7 != 5) {
            return;
        }
        ListExtentionsKt.visible(this.itemView);
        q0();
        c6973c.f117379b.setText(((q) p0()).f124965c);
        ListExtentionsKt.visible(c6973c.f117384g);
        ListExtentionsKt.gone(c6973c.f117381d);
        ListExtentionsKt.gone(c6973c.f117382e);
    }

    public final void q0() {
        int iC = com.bilibili.playset.utils.b.c(this.itemView.getContext(), 6, false);
        C6973c c6973c = this.f85194c;
        ViewGroup.LayoutParams layoutParams = c6973c.f117380c.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMarginStart(iC);
        }
        ViewGroup.LayoutParams layoutParams2 = c6973c.f117383f.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = null;
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        }
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.setMarginEnd(iC);
        }
    }
}
