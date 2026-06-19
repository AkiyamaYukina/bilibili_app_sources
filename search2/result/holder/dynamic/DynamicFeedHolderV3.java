package com.bilibili.search2.result.holder.dynamic;

import Bl.a0;
import CR0.g;
import G.p;
import Os0.e;
import Xs0.b;
import android.graphics.Rect;
import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.compose.foundation.text.selection.C3751q;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.C4496a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.content.ContextCompat;
import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.app.Fragment;
import bk.x;
import com.bilibili.app.comm.list.common.utils.ColorTagHandler;
import com.bilibili.app.comm.list.widget.image.ListPlaceHolderImageView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.SearchDynamicItem;
import com.bilibili.search2.result.all.SearchResultAllFragment;
import com.bilibili.search2.result.holder.dynamic.DynamicFeedHolderV3;
import com.bilibili.search2.share.r;
import com.bilibili.search2.utils.B;
import com.bilibili.search2.utils.CoverAspectRatio;
import com.bilibili.search2.utils.extension.c;
import com.bilibili.search2.utils.k;
import com.bilibili.search2.utils.s;
import com.tencent.connect.common.Constants;
import dt0.AbstractC6843f;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.VectorTextView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/dynamic/DynamicFeedHolderV3.class */
@StabilityInferred(parameters = 0)
public final class DynamicFeedHolderV3 extends AbstractC6843f<SearchDynamicItem> implements View.OnClickListener {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final Companion f88127q = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a0 f88128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ConstraintLayout f88129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final LinearLayout f88130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final LinearLayout f88131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final BiliImageView f88132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final TextView f88133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final TextView f88134g;

    @NotNull
    public final TextView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final VectorTextView f88135i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final TintTextView f88136j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final ListPlaceHolderImageView f88137k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final TextView[] f88138l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f88139m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f88140n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f88141o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f88142p;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/dynamic/DynamicFeedHolderV3$Companion.class */
    public static final class Companion {
        @JvmStatic
        @Keep
        @NotNull
        public final DynamicFeedHolderV3 create(@NotNull ViewGroup viewGroup) {
            return new DynamicFeedHolderV3(a0.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
        }
    }

    public DynamicFeedHolderV3(@NotNull a0 a0Var) {
        super(a0Var.a);
        this.f88128a = a0Var;
        this.f88129b = a0Var.a;
        this.f88130c = a0Var.j;
        this.f88131d = a0Var.g;
        this.f88132e = a0Var.b;
        TextView textView = a0Var.k;
        this.f88133f = textView;
        this.f88134g = a0Var.h;
        TextView textView2 = a0Var.i;
        this.h = textView2;
        this.f88135i = a0Var.f;
        this.f88136j = a0Var.d;
        this.f88137k = a0Var.c;
        this.f88138l = new TextView[]{textView2, textView};
        this.f88140n = ListExtentionsKt.toPx(12);
        this.f88141o = ListExtentionsKt.toPx(82);
        this.f88142p = ListExtentionsKt.toPx(133);
    }

    @JvmStatic
    @Keep
    @NotNull
    public static final DynamicFeedHolderV3 create(@NotNull ViewGroup viewGroup) {
        return f88127q.create(viewGroup);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // dt0.AbstractC6839b
    public final void bind() throws NoWhenBranchMatchedException {
        this.f88129b.setOnClickListener(this);
        List<String> listS = ((SearchDynamicItem) getData()).s();
        String str = listS != null ? (String) CollectionsKt.getOrNull(listS, 0) : null;
        int i7 = 8;
        if (str == null || StringsKt.isBlank(str)) {
            this.f88137k.setVisibility(8);
            t0(false);
            s0(false);
            r0(false);
        } else {
            if (this.f88139m) {
                s.e(this.f88137k, this.itemView.getContext(), new Pair(Integer.valueOf(this.f88141o), Integer.valueOf(this.f88141o)), new Pair(Integer.valueOf(this.f88142p), Integer.valueOf(this.f88142p)));
            } else {
                s.c(this.f88137k, this.itemView.getContext(), CoverAspectRatio.RATIO_1_1, false, true, true, 10);
            }
            this.f88137k.setVisibility(0);
            c.a(this.f88137k, str, null, false, null, null, 0, 0, 254);
            String badge = ((SearchDynamicItem) getData()).getBadge();
            if (badge == null || StringsKt.isBlank(badge)) {
                this.f88136j.setVisibility(8);
            } else {
                this.f88136j.setText(((SearchDynamicItem) getData()).getBadge());
                this.f88136j.setVisibility(0);
            }
            t0(true);
            s0(true);
            r0(true);
        }
        if (((SearchDynamicItem) getData()).v() != null) {
            SearchDynamicItem.Upper upperV = ((SearchDynamicItem) getData()).v();
            String title = upperV != null ? upperV.getTitle() : null;
            if (title == null || StringsKt.isBlank(title)) {
                this.f88133f.setVisibility(8);
            } else {
                TextView textView = this.f88133f;
                SearchDynamicItem.Upper upperV2 = ((SearchDynamicItem) getData()).v();
                textView.setText(upperV2 != null ? upperV2.getTitle() : null);
                this.f88133f.setVisibility(0);
            }
            SearchDynamicItem.Upper upperV3 = ((SearchDynamicItem) getData()).v();
            String pTimeText = upperV3 != null ? upperV3.getPTimeText() : null;
            if (pTimeText == null || StringsKt.isBlank(pTimeText)) {
                this.f88134g.setVisibility(8);
            } else {
                String str2 = ((SearchDynamicItem) getData()).u() != null ? " · " : "";
                TextView textView2 = this.f88134g;
                SearchDynamicItem.Upper upperV4 = ((SearchDynamicItem) getData()).v();
                x.a(textView2, str2, upperV4 != null ? upperV4.getPTimeText() : null);
                this.f88134g.setVisibility(0);
            }
        }
        final a0 a0Var = this.f88128a;
        ImageView imageView = a0Var.e;
        r rVar = r.f88699a;
        BaseSearchItem.Feedback feedback = ((SearchDynamicItem) getData()).getFeedback();
        rVar.getClass();
        imageView.setVisibility(ListExtentionsKt.toVisibility(r.e(feedback)));
        this.f88129b.post(new Runnable(a0Var, this) { // from class: ht0.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a0 f121466a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final DynamicFeedHolderV3 f121467b;

            {
                this.f121466a = a0Var;
                this.f121467b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a0 a0Var2 = this.f121466a;
                DynamicFeedHolderV3 dynamicFeedHolderV3 = this.f121467b;
                DynamicFeedHolderV3.Companion companion = DynamicFeedHolderV3.f88127q;
                Rect rect = new Rect();
                a0Var2.e.getHitRect(rect);
                int px = ListExtentionsKt.toPx(9);
                rect.top -= px;
                rect.bottom += px;
                rect.left -= px;
                rect.right += px;
                dynamicFeedHolderV3.f88129b.setTouchDelegate(new TouchDelegate(rect, a0Var2.e));
            }
        });
        a0Var.e.setOnClickListener(new g(this, 3));
        BiliImageView biliImageView = this.f88132e;
        SearchDynamicItem.Upper upperV5 = ((SearchDynamicItem) getData()).v();
        String cover = null;
        if (upperV5 != null) {
            cover = upperV5.getCover();
        }
        B.g(biliImageView, cover, 0, ListExtentionsKt.toPx(0.5d), R$color.Ga2, 2131233999, 4);
        VectorTextView vectorTextView = this.f88135i;
        if (((SearchDynamicItem) getData()).u() != null) {
            i7 = 0;
        }
        vectorTextView.setVisibility(i7);
        if (((SearchDynamicItem) getData()).u() != null) {
            VectorTextView vectorTextView2 = this.f88135i;
            SearchDynamicItem.Stat statU = ((SearchDynamicItem) getData()).u();
            int like = 0;
            if (statU != null) {
                like = statU.getLike();
            }
            vectorTextView2.setText(k.a(like, "-"));
        }
    }

    @Override // dt0.AbstractC6839b
    public final void bindFragment(@Nullable Fragment fragment) {
        super.bindFragment(fragment);
        this.f88139m = !(fragment instanceof SearchResultAllFragment);
    }

    @Override // dt0.AbstractC6843f
    @NotNull
    public final View[] getClickStatusViewArray() {
        return this.f88138l;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    @Override // dt0.AbstractC6843f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCardExpose() {
        /*
            r11 = this;
            r0 = r11
            java.lang.Object r0 = r0.getData()
            com.bilibili.search2.api.SearchDynamicItem r0 = (com.bilibili.search2.api.SearchDynamicItem) r0
            boolean r0 = r0.isExposed()
            if (r0 != 0) goto L38
            r0 = r11
            java.lang.Object r0 = r0.getData()
            com.bilibili.search2.api.SearchDynamicItem r0 = (com.bilibili.search2.api.SearchDynamicItem) r0
            r14 = r0
            r0 = r11
            androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()
            r15 = r0
            r0 = 0
            r13 = r0
            r0 = r15
            if (r0 == 0) goto L2b
            r0 = r15
            int r0 = r0.computeVerticalScrollOffset()
            r12 = r0
            goto L2d
        L2b:
            r0 = 0
            r12 = r0
        L2d:
            r0 = r12
            if (r0 != 0) goto L33
            r0 = 1
            r13 = r0
        L33:
            r0 = r14
            r1 = r13
            r0.setAtFirstScreen(r1)
        L38:
            r0 = r11
            boolean r0 = r0.f88139m
            if (r0 == 0) goto L47
            java.lang.String r0 = "read.column-search.search-card.all.show"
            r15 = r0
        L44:
            goto L4f
        L47:
            java.lang.String r0 = "search.search-result.search-card.all.show"
            r15 = r0
            goto L44
        L4f:
            r0 = r11
            java.lang.Object r0 = r0.getData()
            com.bilibili.search2.api.BaseSearchItem r0 = (com.bilibili.search2.api.BaseSearchItem) r0
            r14 = r0
            r0 = r11
            boolean r0 = r0.f88139m
            if (r0 == 0) goto L75
            r0 = r14
            java.lang.String r0 = r0.getGoTo()
            r16 = r0
            r0 = r16
            r14 = r0
            r0 = r16
            if (r0 != 0) goto L72
        L6c:
            java.lang.String r0 = ""
            r14 = r0
            goto L86
        L72:
            goto L86
        L75:
            r0 = r14
            java.lang.String r0 = r0.getLinkType()
            r16 = r0
            r0 = r16
            r14 = r0
            r0 = r16
            if (r0 != 0) goto L72
            goto L6c
        L86:
            r0 = r11
            java.lang.Object r0 = r0.getData()
            com.bilibili.search2.api.SearchDynamicItem r0 = (com.bilibili.search2.api.SearchDynamicItem) r0
            r16 = r0
            r0 = r11
            boolean r0 = r0.f88139m
            r13 = r0
            r0 = r15
            r1 = r14
            r2 = r16
            r3 = 0
            r4 = r11
            java.util.Map r4 = r4.q0()
            r5 = r13
            r6 = 1
            r5 = r5 ^ r6
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 936(0x3a8, float:1.312E-42)
            Xs0.b.k(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.holder.dynamic.DynamicFeedHolderV3.onCardExpose():void");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        String str;
        String uri = ((SearchDynamicItem) getData()).getUri();
        if (uri != null) {
            Uri uri2 = Uri.parse(uri);
            if (!this.f88139m) {
                uri = uri2.buildUpon().appendQueryParameter("from", "3").appendQueryParameter("from_spmid", "search.search-result.0.0").build().toString();
            } else if (uri2.getQueryParameter("column_from") == null) {
                uri = C3751q.b(uri2, "column_from", Constants.VIA_REPORT_TYPE_WPA_STATE);
            }
            e.g(e.f18030a, view.getContext(), uri);
        }
        String str2 = this.f88139m ? "read.column-search.search-card.all.click" : "search.search-result.search-card.all.click";
        BaseSearchItem baseSearchItem = (BaseSearchItem) getData();
        if (this.f88139m) {
            String goTo = baseSearchItem.getGoTo();
            str = goTo;
            if (goTo == null) {
                str = "";
            }
        } else {
            String linkType = baseSearchItem.getLinkType();
            str = linkType;
            if (linkType == null) {
                str = "";
            }
        }
        b.i(str2, null, str, (BaseSearchItem) getData(), null, null, b.d((BaseSearchItem) getData(), null, null, 3), null, null, q0(), false, null, 7040);
        clickWithRefreshStatusViews(this.f88138l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<String, String> q0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (this.f88139m) {
            linkedHashMap.put("server_page_pos", String.valueOf(getBindingAdapterPosition() + 1));
            String goTo = ((SearchDynamicItem) getData()).getGoTo();
            String str = goTo;
            if (goTo == null) {
                str = "";
            }
            linkedHashMap.put("goto", str);
        }
        return linkedHashMap;
    }

    public final void r0(boolean z6) {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this.f88129b);
        if (z6) {
            constraintSet.clear(this.f88131d.getId(), 4);
            constraintSet.clear(this.f88131d.getId(), 3);
            constraintSet.connect(this.f88131d.getId(), 4, 2131298941, 4, 0);
        } else {
            constraintSet.clear(this.f88131d.getId(), 4);
            constraintSet.clear(this.f88131d.getId(), 3);
            constraintSet.connect(this.f88131d.getId(), 3, 2131308958, 4, ListExtentionsKt.toPx(8));
            constraintSet.connect(this.f88131d.getId(), 4, 0, 4, this.f88140n);
        }
        constraintSet.applyTo(this.f88129b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s0(boolean z6) {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this.f88129b);
        if (z6) {
            constraintSet.clear(2131308958, 3);
            constraintSet.connect(2131308958, 3, this.f88130c.getId(), 4, ListExtentionsKt.toPx(3));
        } else {
            constraintSet.clear(2131308958, 3);
            constraintSet.connect(2131308958, 3, this.f88130c.getId(), 4, ListExtentionsKt.toPx(8));
        }
        constraintSet.applyTo(this.f88129b);
        String title = ((SearchDynamicItem) getData()).getTitle();
        if (title != null) {
            CharSequence charSequenceDecode$default = ColorTagHandler.decode$default(this.itemView.getContext(), title, 0, 4, (Object) null);
            CharSequence charSequence = charSequenceDecode$default;
            if (!z6) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceDecode$default);
                String badge = ((SearchDynamicItem) getData()).getBadge();
                charSequence = spannableStringBuilder;
                if (badge != null) {
                    if (StringsKt.isBlank(badge)) {
                        charSequence = spannableStringBuilder;
                    } else {
                        int color = this.itemView.getContext().getResources().getColor(2131103591);
                        int color2 = this.itemView.getContext().getResources().getColor(2131103284);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(p.a(((SearchDynamicItem) getData()).getBadge(), " "));
                        spannableStringBuilder2.append(charSequenceDecode$default);
                        ht0.e eVar = new ht0.e(color, ListExtentionsKt.toPx(10), ListExtentionsKt.toPx(2), ListExtentionsKt.toPx(2), 0.0f, color2, ListExtentionsKt.toPx(2), 0.0f);
                        String badge2 = ((SearchDynamicItem) getData()).getBadge();
                        spannableStringBuilder2.setSpan(eVar, 0, badge2 != null ? badge2.length() : 0, 17);
                        charSequence = spannableStringBuilder2;
                    }
                }
            }
            this.h.setText(charSequence);
            if (charSequence != null) {
                final CharSequence charSequence2 = charSequence;
                OneShotPreDrawListener.add(this.h, new Runnable(this, charSequence2) { // from class: ht0.b

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final DynamicFeedHolderV3 f121468a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final CharSequence f121469b;

                    {
                        this.f121468a = this;
                        this.f121469b = charSequence2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        DynamicFeedHolderV3 dynamicFeedHolderV3 = this.f121468a;
                        CharSequence charSequence3 = this.f121469b;
                        String string = dynamicFeedHolderV3.f88128a.a.getContext().getString(2131847833);
                        SpannableString spannableString = new SpannableString(C4496a.a("…", string));
                        spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(dynamicFeedHolderV3.h.getContext(), R$color.Lb6)), 1, string.length() + 1, 33);
                        TextView textView = dynamicFeedHolderV3.h;
                        textView.setText(B.e(2, textView, charSequence3, spannableString));
                    }
                });
            }
        }
    }

    public final void t0(boolean z6) {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this.f88129b);
        if (z6) {
            constraintSet.clear(this.f88130c.getId(), 3);
            constraintSet.connect(this.f88130c.getId(), 3, 2131298941, 3, 0);
        } else {
            constraintSet.clear(this.f88130c.getId(), 3);
            constraintSet.connect(this.f88130c.getId(), 3, 2131308671, 3, this.f88140n);
        }
        constraintSet.applyTo(this.f88129b);
    }
}
