package com.bilibili.ogv.operation.entrance.indexpage;

import G.p;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.ogv.operation.entrance.indexpage.BangumFilterLayout;
import com.bilibili.ogv.operation.entrance.indexpage.BangumiCategoryCondition;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.section.adapter.BaseAdapter;
import tv.danmaku.bili.widget.section.holder.BaseViewHolder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/indexpage/BangumFilterLayout.class */
@StabilityInferred(parameters = 0)
public final class BangumFilterLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public d f70095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public e f70096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public c f70097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public LinearLayout f70098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public InterceptRecyclerView f70099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public ScrollLinearLayoutManager f70100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public FrameLayout f70101g;

    @Nullable
    public TextView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public View f70102i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public a f70103j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public List<? extends BangumiCategoryCondition.Item> f70104k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f70105l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public String f70106m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f70107n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f70108o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final ArrayList<BangumiCategoryCondition.Filter> f70109p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f70110q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f70111r;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/indexpage/BangumFilterLayout$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends RecyclerView.Adapter<C0425a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final SparseArray<List<BangumiCategoryCondition.Item>> f70112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final BangumFilterLayout f70113b;

        /* JADX INFO: renamed from: com.bilibili.ogv.operation.entrance.indexpage.BangumFilterLayout$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/indexpage/BangumFilterLayout$a$a.class */
        public final class C0425a extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final RecyclerView f70114a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f70115b;

            public C0425a(@NotNull View view) {
                super(view);
                this.f70114a = (RecyclerView) view.findViewById(2131310644);
                this.f70115b = Uj0.c.b(40.0f, view.getContext());
            }
        }

        public a(@NotNull BangumFilterLayout bangumFilterLayout, @Nullable List<? extends BangumiCategoryCondition.Item> list, @Nullable List<? extends BangumiCategoryCondition.Filter> list2) {
            SparseArray<List<BangumiCategoryCondition.Item>> sparseArray = new SparseArray<>();
            this.f70112a = sparseArray;
            this.f70113b = bangumFilterLayout;
            sparseArray.put(0, list);
            if (list2 != null) {
                int i7 = 1;
                for (BangumiCategoryCondition.Filter filter : list2) {
                    this.f70112a.put(i7, list2.get(i7 - 1).values);
                    i7++;
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f70112a.size();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v13, types: [androidx.recyclerview.widget.RecyclerView$Adapter, com.bilibili.ogv.operation.entrance.indexpage.BangumFilterLayout$b] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
            C0425a c0425a = (C0425a) viewHolder;
            int i8 = 0;
            boolean z6 = i7 == 0;
            List<BangumiCategoryCondition.Item> list = this.f70112a.get(i7);
            c0425a.getClass();
            int size = list.size();
            ?? bVar = new b(z6, this.f70113b, i7, list);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(c0425a.itemView.getContext(), 2, 0, false);
            gridLayoutManager.setSpanSizeLookup(new com.bilibili.ogv.operation.entrance.indexpage.a(size));
            RecyclerView recyclerView = c0425a.f70114a;
            recyclerView.setLayoutManager(gridLayoutManager);
            recyclerView.setAdapter(bVar);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, c0425a.f70115b * (list.size() > Integer.MAX_VALUE ? 2 : 1)));
            for (Object obj : list) {
                if (i8 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (((BangumiCategoryCondition.Item) obj).isSelect) {
                    int i9 = i8;
                    if (bVar.f70119d.size() > Integer.MAX_VALUE) {
                        i9 = i8;
                        if (i8 > 1) {
                            int iCeil = (int) Math.ceil(((double) (bVar.f70119d.size() - 1)) / 2.0d);
                            i9 = i8 <= iCeil ? (i8 * 2) - 1 : (i8 - iCeil) * 2;
                        }
                    }
                    recyclerView.scrollToPosition(i9);
                }
                i8++;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            return new C0425a(p.a(viewGroup, 2131499607, viewGroup, false));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/indexpage/BangumFilterLayout$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f70116a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final BangumFilterLayout f70117b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f70118c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final List<BangumiCategoryCondition.Item> f70119d;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/indexpage/BangumFilterLayout$b$a.class */
        @StabilityInferred(parameters = 0)
        public static final class a extends BaseViewHolder {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f70120c = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final TextView f70121b;

            public a(@NotNull View view, @NotNull b bVar) {
                super(view, bVar);
                this.f70121b = (TextView) view.findViewById(2131304923);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(boolean z6, @Nullable BangumFilterLayout bangumFilterLayout, int i7, @NotNull List<? extends BangumiCategoryCondition.Item> list) {
            this.f70116a = z6;
            this.f70117b = bangumFilterLayout;
            this.f70118c = i7;
            this.f70119d = list;
        }

        public final int N(int i7) {
            int iCeil = i7;
            if (this.f70119d.size() > Integer.MAX_VALUE) {
                iCeil = i7;
                if (i7 > 1) {
                    iCeil = i7 % 2 == 0 ? (i7 / 2) + ((int) Math.ceil(((double) (this.f70119d.size() - 1)) / 2.0d)) : (i7 + 1) / 2;
                }
            }
            return iCeil;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.ogv.operation.entrance.indexpage.BangumFilterLayout$b$a] */
        public final void bindHolder(@NotNull BaseViewHolder baseViewHolder, int i7, @NotNull View view) {
            if (baseViewHolder instanceof a) {
                BangumiCategoryCondition.Item item = (BangumiCategoryCondition.Item) CollectionsKt.getOrNull(this.f70119d, N(i7));
                ?? r02 = (a) baseViewHolder;
                int size = this.f70119d.size();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) r02.f70121b.getLayoutParams();
                if (size > Integer.MAX_VALUE && i7 == 0) {
                    layoutParams.gravity = 48;
                    layoutParams.topMargin = Uj0.c.b(8.0f, r02.itemView.getContext());
                }
                r02.f70121b.setText(item != null ? item.name : null);
                TextView textView = r02.f70121b;
                boolean z6 = false;
                if (item != null) {
                    z6 = false;
                    if (item.isSelect) {
                        z6 = true;
                    }
                }
                textView.setSelected(z6);
                if (item == null || !item.isSelect) {
                    TextView textView2 = r02.f70121b;
                    textView2.setTextColor(ThemeUtils.getColorById(textView2.getContext(), R$color.Text2));
                    textView2.setTypeface(Typeface.DEFAULT);
                } else {
                    TextView textView3 = r02.f70121b;
                    textView3.setTextColor(ThemeUtils.getColorById(textView3.getContext(), R$color.Brand_pink));
                    textView3.setTypeface(Typeface.DEFAULT_BOLD);
                }
            }
        }

        @NotNull
        public final BaseViewHolder createHolder(@NotNull ViewGroup viewGroup, int i7) {
            int i8 = a.f70120c;
            return new a(p.a(viewGroup, 2131499642, viewGroup, false), this);
        }

        public final int getItemCount() {
            return this.f70119d.size();
        }

        public final void handleClick(@NotNull BaseViewHolder baseViewHolder) {
            if (baseViewHolder instanceof a) {
                baseViewHolder.itemView.setOnClickListener(new Hk0.d(0, this, baseViewHolder));
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/indexpage/BangumFilterLayout$c.class */
    public interface c {
        void onClick();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/indexpage/BangumFilterLayout$d.class */
    public interface d {
        void a(int i7, int i8);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/indexpage/BangumFilterLayout$e.class */
    public interface e {
        void a(@NotNull String str);
    }

    @JvmOverloads
    public BangumFilterLayout(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public BangumFilterLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public BangumFilterLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f70106m = "";
        this.f70109p = new ArrayList<>();
        this.f70110q = Uj0.c.b(420.0f, context);
        this.f70111r = Uj0.c.b(40.0f, context);
        setOrientation(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFoldTvState(boolean z6) {
        TextView textView = this.h;
        if (textView != null) {
            textView.setText(getResources().getText(z6 ? 2131821952 : 2131821951));
        }
        Drawable drawable = AppCompatResources.getDrawable(getContext(), z6 ? 2131238387 : 2131231128);
        TextView textView2 = this.h;
        if (textView2 != null) {
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        }
        TextView textView3 = this.h;
        if (textView3 != null) {
            textView3.setCompoundDrawablePadding(4);
        }
    }

    public final int b() {
        List<? extends BangumiCategoryCondition.Item> list = this.f70104k;
        int i7 = (list == null || list.size() <= Integer.MAX_VALUE) ? 0 : 1;
        int size = 5;
        if (this.f70109p.size() <= 5) {
            size = this.f70109p.size();
        }
        int i8 = 0;
        while (i8 < size) {
            List<BangumiCategoryCondition.Item> list2 = this.f70109p.get(i8).values;
            int i9 = i7;
            if ((list2 != null ? list2.size() : 0) > Integer.MAX_VALUE) {
                i9 = i7 + 1;
            }
            i8++;
            i7 = i9;
        }
        return i7;
    }

    public final void c() {
        a aVar = this.f70103j;
        if (aVar != null) {
            int iIntValue = Integer.valueOf(aVar.f70112a.size()).intValue();
            this.f70108o = iIntValue > 5 ? (b() + 5) * this.f70111r : (b() + iIntValue) * this.f70111r;
            int i7 = this.f70111r;
            List<? extends BangumiCategoryCondition.Item> list = this.f70104k;
            int i8 = (list == null || list.size() <= Integer.MAX_VALUE) ? 0 : 1;
            Iterator<BangumiCategoryCondition.Filter> it = this.f70109p.iterator();
            while (it.hasNext()) {
                List<BangumiCategoryCondition.Item> list2 = it.next().values;
                if ((list2 != null ? list2.size() : 0) > Integer.MAX_VALUE) {
                    i8++;
                }
            }
            this.f70107n = (iIntValue + i8) * i7;
        }
    }

    public final void d() {
        this.f70105l = false;
        c();
        ScrollLinearLayoutManager scrollLinearLayoutManager = this.f70100f;
        if (scrollLinearLayoutManager != null) {
            scrollLinearLayoutManager.f70165a = false;
        }
        int i7 = this.f70108o;
        int i8 = this.f70110q;
        int i9 = i7;
        if (i7 > i8) {
            i9 = i8;
        }
        LinearLayout linearLayout = this.f70098d;
        ViewGroup.LayoutParams layoutParams = linearLayout != null ? linearLayout.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.height = i9;
        }
        if (layoutParams != null) {
            layoutParams.width = -1;
        }
        LinearLayout linearLayout2 = this.f70098d;
        if (linearLayout2 != null) {
            linearLayout2.setLayoutParams(layoutParams);
        }
        LinearLayout linearLayout3 = this.f70098d;
        if (linearLayout3 != null) {
            linearLayout3.requestLayout();
        }
        setFoldTvState(this.f70105l);
    }

    public final void e(long j7, boolean z6) {
        this.f70105l = z6;
        c();
        ScrollLinearLayoutManager scrollLinearLayoutManager = this.f70100f;
        if (scrollLinearLayoutManager != null) {
            scrollLinearLayoutManager.f70165a = z6;
        }
        int i7 = z6 ? this.f70108o : this.f70107n;
        int i8 = z6 ? this.f70107n : this.f70108o;
        int i9 = this.f70110q;
        int i10 = i7;
        if (i7 > i9) {
            i10 = i9;
        }
        int i11 = i8;
        if (i8 > i9) {
            i11 = i9;
        }
        ValueAnimator valueAnimatorOfInt = ObjectAnimator.ofInt(i10, i11);
        valueAnimatorOfInt.setDuration(j7);
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt.addListener(new com.bilibili.ogv.operation.entrance.indexpage.b(this));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: Hk0.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BangumFilterLayout f8689a;

            {
                this.f8689a = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BangumFilterLayout bangumFilterLayout = this.f8689a;
                LinearLayout linearLayout = bangumFilterLayout.f70098d;
                ViewGroup.LayoutParams layoutParams = linearLayout != null ? linearLayout.getLayoutParams() : null;
                if (layoutParams != null) {
                    layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                }
                if (layoutParams != null) {
                    layoutParams.width = -1;
                }
                LinearLayout linearLayout2 = bangumFilterLayout.f70098d;
                if (linearLayout2 != null) {
                    linearLayout2.setLayoutParams(layoutParams);
                }
                LinearLayout linearLayout3 = bangumFilterLayout.f70098d;
                if (linearLayout3 != null) {
                    linearLayout3.requestLayout();
                }
            }
        });
        valueAnimatorOfInt.start();
    }

    public final int getMaxHeight() {
        return this.f70110q;
    }

    @NotNull
    public final String getSelectedItem() {
        this.f70106m = "";
        List<? extends BangumiCategoryCondition.Item> list = this.f70104k;
        if (list != null) {
            for (BangumiCategoryCondition.Item item : list) {
                if (item.isSelect) {
                    this.f70106m = p.a(this.f70106m, item.name);
                }
            }
        }
        Iterator<T> it = this.f70109p.iterator();
        while (it.hasNext()) {
            List<BangumiCategoryCondition.Item> list2 = ((BangumiCategoryCondition.Filter) it.next()).values;
            if (list2 != null) {
                List<BangumiCategoryCondition.Item> list3 = list2;
                ArrayList<BangumiCategoryCondition.Item> arrayList = new ArrayList();
                for (Object obj : list3) {
                    BangumiCategoryCondition.Item item2 = (BangumiCategoryCondition.Item) obj;
                    if (item2.isSelect && !Intrinsics.areEqual(item2.keyword, CaptureSchema.OLD_INVALID_ID_STRING)) {
                        arrayList.add(obj);
                    }
                }
                for (BangumiCategoryCondition.Item item3 : arrayList) {
                    this.f70106m = this.f70106m.length() == 0 ? p.a(this.f70106m, item3.name) : B0.a.a(this.f70106m, "・", item3.name);
                }
            }
        }
        return this.f70106m;
    }

    public final void setMaxHeight(int i7) {
        if (i7 > 0) {
            this.f70110q = i7;
        }
    }

    public final void setOnExpandClickListener(@NotNull c cVar) {
        this.f70097c = cVar;
    }

    public final void setOnFilterMenuItemClickListener(@NotNull d dVar) {
        this.f70095a = dVar;
    }

    public final void setOnFilterSortItemClickListener(@NotNull e eVar) {
        this.f70096b = eVar;
    }
}
