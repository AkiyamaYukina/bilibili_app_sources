package com.bilibili.search2.result.all;

import Bl.P0;
import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.core.view.OneShotPreDrawListener;
import com.bilibili.app.comm.list.common.utils.ColorTagHandler;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.playerbizcommon.playerinput.utils.InputExtensionsKt;
import com.bilibili.search2.api.SearchNoResultSuggestWord;
import dt0.AbstractC6843f;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/M.class */
@StabilityInferred(parameters = 0)
public final class M extends AbstractC6843f<SearchNoResultSuggestWord> implements Et0.a, Et0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final P0 f87143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TextView f87144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TextView f87145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f87146d;

    public M(@NotNull P0 p02) {
        super(p02.a);
        this.f87143a = p02;
        this.f87144b = p02.b;
        TextView textView = p02.c;
        this.f87145c = textView;
        this.f87146d = ConfigManager.Companion.isHitFF("ff_search_suggest_exp");
        textView.setOnClickListener(new com.bilibili.bililive.biz.rank.online.s(this, 2));
    }

    public static SpannableString q0(@ColorRes int i7, String str, Context context) {
        SpannableString spannableString;
        if (str != null) {
            SpannableString spannableString2 = new SpannableString(str);
            spannableString2.setSpan(new ForegroundColorSpan(ContextCompat.getColor(context, i7)), 0, str.length(), 33);
            spannableString = spannableString2;
        } else {
            spannableString = new SpannableString("");
        }
        return spannableString;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dt0.AbstractC6839b
    public final void bind() {
        final SpannableString spannableStringValueOf;
        P0 p02 = this.f87143a;
        boolean z6 = this.f87146d;
        if (z6) {
            int px = ListExtentionsKt.toPx(com.bilibili.search2.component.e.b(this.itemView.getContext()).f86404e);
            TintTextView tintTextView = p02.e;
            tintTextView.setPadding(px, tintTextView.getPaddingTop(), px, tintTextView.getPaddingBottom());
        } else {
            int px2 = com.bilibili.search2.component.e.g(this.itemView.getContext()) ? ListExtentionsKt.toPx(8) : 0;
            InputExtensionsKt.updateMargin$default(p02.f, px2, px2, 0, 0, 12, null);
        }
        SpannableString spannableString = null;
        if (!z6) {
            ListExtentionsKt.gone(p02.e);
            ListExtentionsKt.visible(p02.f);
            p02.d.setBackgroundColor(ContextCompat.getColor(this.itemView.getContext(), R$color.Ga1));
            this.f87144b.setText(ColorTagHandler.decode$default(this.itemView.getContext(), ((SearchNoResultSuggestWord) getData()).getTitle(), 0, 4, (Object) null));
            if (((SearchNoResultSuggestWord) getData()).isQueryCorrect()) {
                this.f87145c.setText(ColorTagHandler.decode$default(this.itemView.getContext(), this.itemView.getContext().getString(2131847748, ColorTagHandler.processRawTextWithColorTag(((SearchNoResultSuggestWord) getData()).getKeyword())), 0, 4, (Object) null));
                this.f87145c.setVisibility(0);
            } else {
                this.f87145c.setVisibility(8);
            }
            ((SearchNoResultSuggestWord) getData()).setTrackId(null);
            ((SearchNoResultSuggestWord) getData()).setExpStr(null);
            return;
        }
        ListExtentionsKt.visible(p02.a);
        ListExtentionsKt.gone(p02.f);
        p02.d.setBackgroundColor(ContextCompat.getColor(this.itemView.getContext(), R$color.Bg1));
        TintTextView tintTextView2 = p02.e;
        ListExtentionsKt.visible(tintTextView2);
        tintTextView2.setMovementMethod(LinkMovementMethod.getInstance());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String content = ((SearchNoResultSuggestWord) getData()).getContent();
        if (content != null) {
            spannableStringBuilder.append((CharSequence) q0(R$color.Text3, ((SearchNoResultSuggestWord) getData()).getPrefix(), this.itemView.getContext()));
            spannableStringBuilder.append((CharSequence) q0(R$color.Text1, content, this.itemView.getContext()));
            spannableStringBuilder.append((CharSequence) q0(R$color.Text3, ((SearchNoResultSuggestWord) getData()).getSuffix(), this.itemView.getContext()));
            spannableStringValueOf = SpannableString.valueOf(spannableStringBuilder);
        } else {
            spannableStringValueOf = null;
        }
        if (((SearchNoResultSuggestWord) getData()).isQueryCorrect()) {
            spannableStringBuilder.append((CharSequence) q0(R$color.Text3, this.itemView.getContext().getString(2131847755), this.itemView.getContext()));
            SpannableString spannableStringQ0 = q0(R$color.Text_link, ((SearchNoResultSuggestWord) getData()).getKeyword(), this.itemView.getContext());
            L l7 = new L(this);
            String keyword = ((SearchNoResultSuggestWord) getData()).getKeyword();
            spannableStringQ0.setSpan(l7, 0, keyword != null ? keyword.length() : 0, 33);
            spannableStringBuilder.append((CharSequence) spannableStringQ0);
            spannableStringValueOf = SpannableString.valueOf(spannableStringBuilder);
            final int i7 = R$color.Text_link;
            OneShotPreDrawListener.add(p02.e, new Runnable(this, i7, spannableStringValueOf) { // from class: com.bilibili.search2.result.all.K

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final M f87139a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f87140b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Spannable f87141c;

                {
                    this.f87139a = this;
                    this.f87140b = i7;
                    this.f87141c = spannableStringValueOf;
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.search2.result.all.M] */
                @Override // java.lang.Runnable
                public final void run() {
                    ?? r02 = this.f87139a;
                    int i8 = this.f87140b;
                    Spannable spannable = this.f87141c;
                    SpannableString spannableString2 = new SpannableString("…");
                    spannableString2.setSpan(new ForegroundColorSpan(ContextCompat.getColor(r02.itemView.getContext(), i8)), 0, 1, 33);
                    if (spannable != null) {
                        TintTextView tintTextView3 = r02.f87143a.e;
                        tintTextView3.setText(com.bilibili.search2.utils.B.e(2, tintTextView3, spannable, spannableString2));
                    }
                }
            });
        } else {
            final int i8 = R$color.Text1;
            final SpannableString spannableString2 = spannableStringValueOf;
            OneShotPreDrawListener.add(p02.e, new Runnable(this, i8, spannableString2) { // from class: com.bilibili.search2.result.all.K

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final M f87139a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f87140b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Spannable f87141c;

                {
                    this.f87139a = this;
                    this.f87140b = i8;
                    this.f87141c = spannableString2;
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.search2.result.all.M] */
                @Override // java.lang.Runnable
                public final void run() {
                    ?? r02 = this.f87139a;
                    int i82 = this.f87140b;
                    Spannable spannable = this.f87141c;
                    SpannableString spannableString22 = new SpannableString("…");
                    spannableString22.setSpan(new ForegroundColorSpan(ContextCompat.getColor(r02.itemView.getContext(), i82)), 0, 1, 33);
                    if (spannable != null) {
                        TintTextView tintTextView3 = r02.f87143a.e;
                        tintTextView3.setText(com.bilibili.search2.utils.B.e(2, tintTextView3, spannable, spannableString22));
                    }
                }
            });
        }
        if (spannableStringValueOf != null) {
            if (!StringsKt.isBlank(spannableStringValueOf)) {
                spannableString = spannableStringValueOf;
            }
            if (spannableString != null) {
                tintTextView2.setText(spannableString);
                return;
            }
        }
        ListExtentionsKt.gone(p02.a);
    }

    @Override // dt0.AbstractC6843f
    @NotNull
    public final String getDefaultModuleType() {
        return "query-correct";
    }

    @Override // Et0.a
    public final boolean isNeedDrawDivider() {
        return false;
    }

    @Override // Et0.d
    public final boolean needWideScreenMargin() {
        return false;
    }
}
