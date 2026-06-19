package com.bilibili.search2.result.holder.chatgpt;

import Bl.M;
import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.compose.foundation.text.selection.C3751q;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.C4496a;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.content.ContextCompat;
import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.app.Fragment;
import com.bilibili.app.comm.list.common.utils.ColorTagHandler;
import com.bilibili.app.comm.list.widget.image.ListPlaceHolderImageView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.search2.result.all.SearchResultAllFragment;
import com.bilibili.search2.utils.B;
import com.bilibili.search2.widget.SearchArticleConstraintLayout;
import com.tencent.connect.common.Constants;
import kotlin.jvm.JvmStatic;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/SmallArticleHolder.class */
@StabilityInferred(parameters = 0)
public final class SmallArticleHolder extends a<com.bilibili.search2.result.holder.chatgpt.api.d> implements View.OnClickListener {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final Companion f87949p = new Companion();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final M f87950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final SearchChatGptHolder f87951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final SearchArticleConstraintLayout f87952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final TextView f87953f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final TextView f87954g;

    @NotNull
    public final ListPlaceHolderImageView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final TintTextView f87955i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final TintTextView f87956j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final TintTextView f87957k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final TintTextView f87958l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final TextView[] f87959m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f87960n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f87961o;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/SmallArticleHolder$Companion.class */
    public static final class Companion {
        @JvmStatic
        @Keep
        @NotNull
        public final SmallArticleHolder create(@NotNull ViewGroup viewGroup, @NotNull SearchChatGptHolder searchChatGptHolder) {
            return new SmallArticleHolder(M.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false), searchChatGptHolder);
        }
    }

    public SmallArticleHolder(@NotNull M m7, @NotNull SearchChatGptHolder searchChatGptHolder) {
        super(m7.a);
        this.f87950c = m7;
        this.f87951d = searchChatGptHolder;
        this.f87952e = m7.a;
        TextView textView = m7.g;
        this.f87953f = textView;
        TextView textView2 = m7.b;
        this.f87954g = textView2;
        this.h = m7.c;
        this.f87955i = m7.d;
        this.f87956j = m7.h;
        this.f87957k = m7.f;
        this.f87958l = m7.e;
        this.f87959m = new TextView[]{textView, textView2};
        this.f87960n = ListExtentionsKt.toPx(12);
    }

    @JvmStatic
    @Keep
    @NotNull
    public static final SmallArticleHolder create(@NotNull ViewGroup viewGroup, @NotNull SearchChatGptHolder searchChatGptHolder) {
        return f87949p.create(viewGroup, searchChatGptHolder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dt0.AbstractC6839b
    public final void bind() {
        String badge;
        this.f87950c.a.setOnClickListener(this);
        String publishTime = ((com.bilibili.search2.result.holder.chatgpt.api.d) getData()).getPublishTime();
        if (publishTime == null || StringsKt.isBlank(publishTime)) {
            this.f87958l.setVisibility(8);
        } else {
            this.f87958l.setText(" · " + ((com.bilibili.search2.result.holder.chatgpt.api.d) getData()).getPublishTime());
        }
        if (this.f87961o || (badge = ((com.bilibili.search2.result.holder.chatgpt.api.d) getData()).getBadge()) == null || StringsKt.isBlank(badge)) {
            this.f87957k.setVisibility(8);
        } else {
            this.f87957k.setText(((com.bilibili.search2.result.holder.chatgpt.api.d) getData()).getBadge());
        }
        this.f87956j.setText(TextUtils.isEmpty(((com.bilibili.search2.result.holder.chatgpt.api.d) getData()).getAuthor()) ? "-" : ((com.bilibili.search2.result.holder.chatgpt.api.d) getData()).getAuthor());
        this.f87955i.setText(com.bilibili.search2.utils.k.a(((com.bilibili.search2.result.holder.chatgpt.api.d) getData()).getLike(), "-"));
        String cover = ((com.bilibili.search2.result.holder.chatgpt.api.d) getData()).getCover();
        if (cover == null || StringsKt.isBlank(cover)) {
            this.h.setVisibility(8);
            r0(false);
            s0(false);
        } else {
            this.h.setVisibility(0);
            com.bilibili.search2.utils.extension.c.a(this.h, cover, null, false, null, null, 0, 0, 254);
            r0(true);
            s0(true);
        }
        String desc = ((com.bilibili.search2.result.holder.chatgpt.api.d) getData()).getDesc();
        if (desc != null) {
            this.f87954g.setText(ColorTagHandler.decode$default(this.itemView.getContext(), desc, 0, 4, (Object) null));
        }
        OneShotPreDrawListener.add(this.f87953f, new Runnable(this) { // from class: com.bilibili.search2.result.holder.chatgpt.y

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SmallArticleHolder f88052a;

            {
                this.f88052a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                SmallArticleHolder smallArticleHolder = this.f88052a;
                CharSequence text = smallArticleHolder.f87954g.getText();
                int maxLines = smallArticleHolder.f87954g.getMaxLines();
                String string = smallArticleHolder.f87950c.a.getContext().getString(2131847833);
                SpannableString spannableString = new SpannableString(C4496a.a("…", string));
                spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(smallArticleHolder.f87954g.getContext(), R$color.Lb6)), 1, string.length() + 1, 33);
                TextView textView = smallArticleHolder.f87954g;
                textView.setText(B.e(maxLines, textView, text, spannableString));
            }
        });
    }

    @Override // dt0.AbstractC6839b
    public final void bindFragment(@Nullable Fragment fragment) {
        super.bindFragment(fragment);
        this.f87961o = !(fragment instanceof SearchResultAllFragment);
    }

    @Override // dt0.AbstractC6843f
    @Nullable
    public final View[] getClickStatusViewArray() {
        return this.f87959m;
    }

    @Override // dt0.AbstractC6843f
    @NotNull
    public final String getModuleType() {
        String str;
        if (this.f87961o) {
            String goTo = ((com.bilibili.search2.result.holder.chatgpt.api.d) getData()).getGoTo();
            str = goTo;
            if (goTo == null) {
                str = "";
            }
        } else {
            String linkType = ((com.bilibili.search2.result.holder.chatgpt.api.d) getData()).getLinkType();
            str = linkType;
            if (linkType == null) {
                str = "";
            }
        }
        return str;
    }

    @Override // dt0.AbstractC6843f
    public final void onCardExpose() {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        String uri = ((com.bilibili.search2.result.holder.chatgpt.api.d) getData()).getUri();
        if (uri != null) {
            Uri uri2 = Uri.parse(uri);
            if (!this.f87961o) {
                uri = C3751q.b(uri2, "from", "main.search-result.0.0");
            } else if (uri2.getQueryParameter("column_from") == null) {
                uri = C3751q.b(uri2, "column_from", Constants.VIA_REPORT_TYPE_WPA_STATE);
            }
            Os0.e.g(Os0.e.f18030a, view.getContext(), uri);
            this.f87951d.x0("opus");
            clickWithRefreshStatusViews(this.f87959m);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r0(boolean z6) {
        String badge;
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this.f87952e);
        if (z6) {
            constraintSet.clear(2131308958, 3);
            constraintSet.connect(2131308958, 3, 2131298941, 3, 0);
        } else {
            constraintSet.clear(2131308958, 3);
            constraintSet.connect(2131308958, 3, 2131308671, 3, this.f87960n);
        }
        constraintSet.applyTo(this.f87952e);
        String title = ((com.bilibili.search2.result.holder.chatgpt.api.d) getData()).getTitle();
        if (title != null) {
            CharSequence charSequenceDecode$default = ColorTagHandler.decode$default(this.itemView.getContext(), title, 0, 4, (Object) null);
            CharSequence charSequence = charSequenceDecode$default;
            if (!z6) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceDecode$default);
                String badge2 = ((com.bilibili.search2.result.holder.chatgpt.api.d) getData()).getBadge();
                charSequence = spannableStringBuilder;
                if (badge2 != null) {
                    if (StringsKt.isBlank(badge2)) {
                        charSequence = spannableStringBuilder;
                    } else {
                        int color = this.itemView.getContext().getResources().getColor(2131103591);
                        int color2 = this.itemView.getContext().getResources().getColor(2131103284);
                        com.bilibili.search2.result.holder.chatgpt.api.d dVar = (com.bilibili.search2.result.holder.chatgpt.api.d) getBindData();
                        String badge3 = null;
                        if (dVar != null) {
                            badge3 = dVar.getBadge();
                        }
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(G.p.a(badge3, " "));
                        spannableStringBuilder2.append(charSequenceDecode$default);
                        ht0.e eVar = new ht0.e(color, ListExtentionsKt.toPx(10), ListExtentionsKt.toPx(2), ListExtentionsKt.toPx(2), 0.0f, color2, ListExtentionsKt.toPx(2), 0.0f);
                        com.bilibili.search2.result.holder.chatgpt.api.d dVar2 = (com.bilibili.search2.result.holder.chatgpt.api.d) getBindData();
                        spannableStringBuilder2.setSpan(eVar, 0, (dVar2 == null || (badge = dVar2.getBadge()) == null) ? 0 : badge.length(), 17);
                        charSequence = spannableStringBuilder2;
                    }
                }
            }
            this.f87953f.setText(charSequence);
        }
    }

    public final void s0(boolean z6) {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this.f87952e);
        if (z6) {
            constraintSet.clear(2131307587, 4);
            constraintSet.clear(2131307587, 3);
            constraintSet.connect(2131307587, 4, 2131298941, 4, 0);
        } else {
            constraintSet.clear(2131307587, 4);
            constraintSet.clear(2131307587, 3);
            constraintSet.connect(2131307587, 3, 2131296873, 4, ListExtentionsKt.toPx(8));
            constraintSet.connect(2131307587, 4, 2131308671, 4, this.f87960n);
        }
        constraintSet.applyTo(this.f87952e);
    }
}
