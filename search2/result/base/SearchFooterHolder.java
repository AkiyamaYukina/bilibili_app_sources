package com.bilibili.search2.result.base;

import Bl.F;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.comm.list.widget.utils.PaddingUtilsKt;
import dt0.AbstractC6838a;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/SearchFooterHolder.class */
@StabilityInferred(parameters = 0)
public final class SearchFooterHolder extends AbstractC6838a<s, F> implements Et0.a, Et0.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Companion f87530c = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f87531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProgressBar f87532b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/SearchFooterHolder$Companion.class */
    public static final class Companion {
        @JvmStatic
        @Keep
        @NotNull
        public final SearchFooterHolder create(@NotNull ViewGroup viewGroup) {
            return new SearchFooterHolder(F.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchFooterHolder(@NotNull F f7) {
        super(f7.getRoot());
        this.f87531a = (TextView) this.itemView.findViewById(2131308733);
        this.f87532b = (ProgressBar) this.itemView.findViewById(2131303590);
    }

    @JvmStatic
    @Keep
    @NotNull
    public static final SearchFooterHolder create(@NotNull ViewGroup viewGroup) {
        return f87530c.create(viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dt0.AbstractC6839b
    public final void bind() {
        int i7 = ((s) getData()).f87607a;
        if (i7 == 0) {
            ListExtentionsKt.visible(this.itemView);
            PaddingUtilsKt.setPaddingBottom(this.itemView, ListExtentionsKt.toPx(18));
            ListExtentionsKt.visible(this.f87532b);
            ListExtentionsKt.gone(this.f87531a);
            this.itemView.setClickable(false);
            return;
        }
        if (i7 == 1) {
            ListExtentionsKt.visible(this.itemView);
            PaddingUtilsKt.setPaddingBottom(this.itemView, ListExtentionsKt.toPx(58));
            ListExtentionsKt.gone(this.f87532b);
            ListExtentionsKt.visible(this.f87531a);
            CharSequence charSequence = ((s) getData()).f87609c;
            if (charSequence != null) {
                this.f87531a.setText(charSequence);
            } else {
                TextView textView = this.f87531a;
                Integer num = ((s) getData()).f87608b;
                textView.setText(num != null ? num.intValue() : 2131841701);
            }
            this.itemView.setClickable(false);
            return;
        }
        if (i7 == 2) {
            ListExtentionsKt.visible(this.itemView);
            PaddingUtilsKt.setPaddingBottom(this.itemView, ListExtentionsKt.toPx(18));
            ListExtentionsKt.invisible(this.f87532b);
            ListExtentionsKt.invisible(this.f87531a);
            this.itemView.setClickable(false);
            return;
        }
        if (i7 == 3) {
            ListExtentionsKt.gone(this.itemView);
            return;
        }
        if (i7 != 4) {
            return;
        }
        ListExtentionsKt.visible(this.itemView);
        PaddingUtilsKt.setPaddingBottom(this.itemView, ListExtentionsKt.toPx(18));
        ListExtentionsKt.invisible(this.f87532b);
        ListExtentionsKt.invisible(this.f87531a);
        this.itemView.setClickable(false);
    }

    @Override // Et0.a
    public final boolean isNeedDrawDivider() {
        return false;
    }

    @Override // Et0.d
    public final boolean needWideScreenMargin() {
        return false;
    }

    @Override // dt0.AbstractC6843f
    public final void onCardExpose() {
    }
}
