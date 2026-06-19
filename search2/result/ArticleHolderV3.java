package com.bilibili.search2.result;

import Bl.N;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.compose.foundation.text.selection.C3751q;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.common.utils.ColorTagHandler;
import com.bilibili.app.comm.list.widget.image.ListPlaceHolderImageView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.result.all.SearchResultAllFragment;
import com.tencent.connect.common.Constants;
import dt0.AbstractC6843f;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ArticleHolderV3.class */
@StabilityInferred(parameters = 0)
public final class ArticleHolderV3 extends AbstractC6843f<com.bilibili.search2.api.c> implements View.OnClickListener {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final Companion f87050p = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final N f87051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ConstraintLayout f87052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TextView f87053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final TextView f87054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ListPlaceHolderImageView f87055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final TintTextView f87056f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final TintTextView f87057g;

    @NotNull
    public final TintTextView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final TintTextView f87058i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final TintTextView f87059j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final TextView[] f87060k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f87061l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f87062m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f87063n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f87064o;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ArticleHolderV3$Companion.class */
    public static final class Companion {
        @JvmStatic
        @Keep
        @NotNull
        public final ArticleHolderV3 create(@NotNull ViewGroup viewGroup) {
            return new ArticleHolderV3(N.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
        }
    }

    public ArticleHolderV3(@NotNull N n7) {
        super(n7.a);
        this.f87051a = n7;
        this.f87052b = n7.f;
        TextView textView = n7.i;
        this.f87053c = textView;
        TextView textView2 = n7.b;
        this.f87054d = textView2;
        this.f87055e = n7.c;
        this.f87056f = n7.e;
        this.f87057g = n7.j;
        this.h = n7.h;
        this.f87058i = n7.g;
        this.f87059j = n7.k;
        this.f87060k = new TextView[]{textView, textView2};
        this.f87061l = ListExtentionsKt.toPx(12);
        this.f87062m = ListExtentionsKt.toPx(82);
        this.f87063n = ListExtentionsKt.toPx(133);
    }

    @JvmStatic
    @Keep
    @NotNull
    public static final ArticleHolderV3 create(@NotNull ViewGroup viewGroup) {
        return f87050p.create(viewGroup);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0125  */
    @Override // dt0.AbstractC6839b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void bind() throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 843
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.ArticleHolderV3.bind():void");
    }

    @Override // dt0.AbstractC6839b
    public final void bindFragment(@Nullable Fragment fragment) {
        super.bindFragment(fragment);
        this.f87064o = !(fragment instanceof SearchResultAllFragment);
    }

    @Override // dt0.AbstractC6843f
    @NotNull
    public final View[] getClickStatusViewArray() {
        return this.f87060k;
    }

    @Override // dt0.AbstractC6843f
    @NotNull
    public final String getModuleType() {
        String str;
        if (this.f87064o) {
            String goTo = ((com.bilibili.search2.api.c) getData()).getGoTo();
            str = goTo;
            if (goTo == null) {
                str = "";
            }
        } else {
            String linkType = ((com.bilibili.search2.api.c) getData()).getLinkType();
            str = linkType;
            if (linkType == null) {
                str = "";
            }
        }
        return str;
    }

    @Override // dt0.AbstractC6843f
    public final void onCardExpose() {
        if (!((com.bilibili.search2.api.c) getData()).isExposed()) {
            com.bilibili.search2.api.c cVar = (com.bilibili.search2.api.c) getData();
            RecyclerView recyclerView = getRecyclerView();
            boolean z6 = false;
            if ((recyclerView != null ? recyclerView.computeVerticalScrollOffset() : 0) == 0) {
                z6 = true;
            }
            cVar.setAtFirstScreen(z6);
        }
        Xs0.b.k(this.f87064o ? "read.column-search.search-card.all.show" : "search.search-result.search-card.all.show", getModuleType(), (com.bilibili.search2.api.c) getData(), null, q0(), !this.f87064o, null, null, null, 936);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        String uri = ((com.bilibili.search2.api.c) getData()).getUri();
        if (uri != null) {
            Uri uri2 = Uri.parse(uri);
            if (!this.f87064o) {
                uri = C3751q.b(uri2, "from", "main.search-result.0.0");
            } else if (uri2.getQueryParameter("column_from") == null) {
                uri = C3751q.b(uri2, "column_from", Constants.VIA_REPORT_TYPE_WPA_STATE);
            }
            Os0.e.g(Os0.e.f18030a, view.getContext(), uri);
            Xs0.b.i(this.f87064o ? "read.column-search.search-card.all.click" : "search.search-result.search-card.all.click", null, getModuleType(), (BaseSearchItem) getData(), null, null, Xs0.b.d((BaseSearchItem) getData(), null, null, 3), null, null, q0(), false, null, 7040);
            clickWithRefreshStatusViews(this.f87060k);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<String, String> q0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (this.f87064o) {
            linkedHashMap.put("server_page_pos", String.valueOf(getBindingAdapterPosition() + 1));
            String goTo = ((com.bilibili.search2.api.c) getData()).getGoTo();
            String str = goTo;
            if (goTo == null) {
                str = "";
            }
            linkedHashMap.put("goto", str);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r0(boolean z6) {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this.f87052b);
        if (z6) {
            constraintSet.clear(2131308958, 3);
            constraintSet.connect(2131308958, 3, 2131298941, 3, 0);
        } else {
            constraintSet.clear(2131308958, 3);
            constraintSet.connect(2131308958, 3, 2131308671, 3, this.f87061l);
        }
        constraintSet.applyTo(this.f87052b);
        String title = ((com.bilibili.search2.api.c) getData()).getTitle();
        if (title != null) {
            CharSequence charSequenceDecode$default = ColorTagHandler.decode$default(this.itemView.getContext(), title, 0, 4, (Object) null);
            CharSequence charSequence = charSequenceDecode$default;
            if (!z6) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceDecode$default);
                String badge = ((com.bilibili.search2.api.c) getData()).getBadge();
                charSequence = spannableStringBuilder;
                if (badge != null) {
                    if (StringsKt.isBlank(badge)) {
                        charSequence = spannableStringBuilder;
                    } else {
                        int color = this.itemView.getContext().getResources().getColor(2131103591);
                        int color2 = this.itemView.getContext().getResources().getColor(2131103284);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(G.p.a(((com.bilibili.search2.api.c) getData()).getBadge(), " "));
                        spannableStringBuilder2.append(charSequenceDecode$default);
                        ht0.e eVar = new ht0.e(color, ListExtentionsKt.toPx(10), ListExtentionsKt.toPx(2), ListExtentionsKt.toPx(2), 0.0f, color2, ListExtentionsKt.toPx(2), 0.0f);
                        String badge2 = ((com.bilibili.search2.api.c) getData()).getBadge();
                        spannableStringBuilder2.setSpan(eVar, 0, badge2 != null ? badge2.length() : 0, 17);
                        charSequence = spannableStringBuilder2;
                    }
                }
            }
            this.f87053c.setText(charSequence);
        }
    }

    public final void s0(boolean z6, boolean z7) {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this.f87052b);
        if (z6) {
            constraintSet.clear(2131307587, 4);
            constraintSet.clear(2131307587, 3);
            constraintSet.connect(2131307587, 4, 2131298941, 4, 0);
        } else {
            constraintSet.clear(2131307587, 4);
            constraintSet.clear(2131307587, 3);
            constraintSet.connect(2131307587, 3, 2131296873, 4, ListExtentionsKt.toPx(8));
            constraintSet.connect(2131307587, 4, 2131308671, 4, this.f87061l);
        }
        if (z7) {
            constraintSet.clear(2131321877, 4);
            constraintSet.clear(2131321877, 3);
            constraintSet.connect(2131321877, 4, 2131307587, 3, ListExtentionsKt.toPx(4));
        }
        constraintSet.applyTo(this.f87052b);
    }
}
