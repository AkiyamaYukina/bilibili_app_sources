package com.bilibili.ship.theseus.cheese.biz.intro.recommend;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bilibili.app.comm.list.common.utils.CommonExtensionKt;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.iconfont.IconFont;
import com.bilibili.iconfont.IconTextDrawable;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.ImageRequestBuilder;
import com.bilibili.lib.image2.view.legacy.ScalableImageView2;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.ship.theseus.cheese.biz.intro.primary.a0;
import com.bilibili.ship.theseus.cheese.biz.intro.recommend.a;
import com.bilibili.ship.theseus.cheese.biz.intro.recommend.s;
import com.bilibili.ship.theseus.united.page.intro.module.relate.C6302a;
import fu0.G;
import fu0.H;
import fu0.I;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/a.class */
@StabilityInferred(parameters = 0)
public final class a extends com.bilibili.app.gemini.ui.m<G> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final d f89933a;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.recommend.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/a$a.class */
    public final class C0629a extends RecyclerView.ViewHolder {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/a$b.class */
    public final class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final H f89934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final w f89935b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f89936c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f89937d;

        public b(@NotNull H h, @NotNull w wVar, boolean z6, int i7) {
            super(h.f119442a);
            this.f89934a = h;
            this.f89935b = wVar;
            this.f89936c = z6;
            this.f89937d = i7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/a$c.class */
    public final class c extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final w f89938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f89939b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f89940c;

        public c(@NotNull a aVar, w wVar, boolean z6, int i7) {
            this.f89938a = wVar;
            this.f89939b = z6;
            this.f89940c = i7;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            int size = this.f89938a.f90013a.f89999b.size();
            return size > 0 ? size + 1 : 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i7) {
            return i7 < getItemCount() - 1 ? 1 : 2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, final int i7) {
            Drawable drawable;
            if (viewHolder instanceof b) {
                w wVar = this.f89938a;
                int size = ((ArrayList) wVar.f90013a.f89999b).size();
                boolean z6 = i7 == size - 1 || (this.f89939b && i7 > 1 && i7 == size - 2 && i7 % 2 == 0);
                final b bVar = (b) viewHolder;
                u uVar = (u) CollectionsKt.getOrNull(wVar.f90013a.f89999b, i7);
                H h = bVar.f89934a;
                Context context = h.f119442a.getContext();
                View.OnClickListener onClickListener = new View.OnClickListener(bVar, i7) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.recommend.b

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final a.b f89944a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final int f89945b;

                    {
                        this.f89944a = bVar;
                        this.f89945b = i7;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f89944a.f89935b.f90015c.invoke(new s.a(this.f89945b));
                    }
                };
                ConstraintLayout constraintLayout = h.f119442a;
                constraintLayout.setOnClickListener(onClickListener);
                ImageRequestBuilder imageRequestBuilderUrl = BiliImageLoader.INSTANCE.with(constraintLayout.getContext()).url(uVar != null ? uVar.f90002a : null);
                ScalableImageView2 scalableImageView2 = h.f119445d;
                imageRequestBuilderUrl.into(scalableImageView2);
                h.h.setText(uVar != null ? uVar.f90003b : null);
                boolean z7 = uVar != null && uVar.f90009i.a();
                int i8 = z7 ? 0 : 8;
                ComposeView composeView = h.f119443b;
                composeView.setVisibility(i8);
                if (uVar != null) {
                    C6302a c6302a = uVar.f90009i;
                    if (c6302a.a()) {
                        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-837256091, true, new com.bilibili.app.comment3.ui.holder.handle.b(c6302a, 1)));
                    }
                }
                TintTextView tintTextView = h.f119448g;
                if (!z7 && (drawable = AppCompatResources.getDrawable(context, 2131235260)) != null) {
                    drawable.setTint(ContextCompat.getColor(context, R$color.Graph_medium));
                    tintTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                }
                tintTextView.setText(uVar != null ? uVar.f90008g : null);
                StringBuilder sb = new StringBuilder();
                TintTextView tintTextView2 = h.f119444c;
                if (uVar != null) {
                    a0 a0Var = uVar.h;
                    IconTextDrawable iconDrawable = IconFont.getIconDrawable(a0Var.f89710d, ContextCompat.getColor(context, R$color.Graph_medium));
                    if (iconDrawable != null) {
                        iconDrawable.setBounds(0, 0, NewPlayerUtilsKt.toPx(16.0f), NewPlayerUtilsKt.toPx(16.0f));
                        tintTextView2.setCompoundDrawables(iconDrawable, null, null, null);
                    }
                    sb.append(a0Var.f89708b);
                }
                String str = uVar != null ? uVar.f90006e : null;
                if (str != null && str.length() != 0) {
                    sb.append(" · ");
                    String str2 = null;
                    if (uVar != null) {
                        str2 = uVar.f90006e;
                    }
                    sb.append(str2);
                }
                tintTextView2.setText(sb);
                h.f119446e.setVisibility(z6 ? 8 : 0);
                boolean z8 = bVar.f89936c;
                int i9 = bVar.f89937d;
                if (!z8) {
                    CommonExtensionKt.setMarginLeft(scalableImageView2, DimenUtilsKt.dpToPx(i9));
                    CommonExtensionKt.setMarginRight(h.f119447f, DimenUtilsKt.dpToPx(i9));
                    CommonExtensionKt.setMarginLeft(h.f119446e, DimenUtilsKt.dpToPx(i9));
                    CommonExtensionKt.setMarginRight(h.f119446e, DimenUtilsKt.dpToPx(i9));
                } else if (i7 % 2 == 0) {
                    CommonExtensionKt.setMarginLeft(scalableImageView2, DimenUtilsKt.dpToPx(i9));
                    CommonExtensionKt.setMarginRight(h.f119447f, DimenUtilsKt.dpToPx(12));
                    CommonExtensionKt.setMarginLeft(h.f119446e, DimenUtilsKt.dpToPx(i9));
                } else {
                    CommonExtensionKt.setMarginLeft(scalableImageView2, DimenUtilsKt.dpToPx(12));
                    CommonExtensionKt.setMarginRight(h.f119447f, DimenUtilsKt.dpToPx(i9));
                    CommonExtensionKt.setMarginRight(h.f119446e, DimenUtilsKt.dpToPx(i9));
                }
                ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(viewHolder.itemView, new ExposureEntry(com.bilibili.ship.theseus.cheese.biz.report.c.f90463a, new Function0(this, i7) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.recommend.c

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final a.c f89946a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final int f89947b;

                    {
                        this.f89946a = this;
                        this.f89947b = i7;
                    }

                    public final Object invoke() {
                        a.c cVar = this.f89946a;
                        List<u> list = cVar.f89938a.f90013a.f89999b;
                        int i10 = this.f89947b;
                        cVar.f89938a.f90015c.invoke(new s.d((u) CollectionsKt.getOrNull(list, i10), i10));
                        return Unit.INSTANCE;
                    }
                }));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i7) {
            RecyclerView.ViewHolder viewHolder;
            if (i7 == 1) {
                viewHolder = new b(H.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false), this.f89938a, this.f89939b, this.f89940c);
            } else {
                I iInflate = I.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                viewHolder = new RecyclerView.ViewHolder(iInflate.f119449a);
                ConstraintLayout constraintLayout = iInflate.f119449a;
                Context context = constraintLayout.getContext();
                constraintLayout.setBackgroundResource(R$color.Bg2);
                iInflate.f119450b.setText(context.getString(2131847382));
                iInflate.f119450b.setPadding(0, NewPlayerUtilsKt.toPx(5.0f), 0, NewPlayerUtilsKt.toPx(16.0f));
            }
            return viewHolder;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/a$d.class */
    @StabilityInferred(parameters = 0)
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final MutableStateFlow f89941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final StateFlow<Integer> f89942b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final StateFlow<Boolean> f89943c;

        public d(@NotNull MutableStateFlow mutableStateFlow, @NotNull StateFlow stateFlow, @NotNull StateFlow stateFlow2) {
            this.f89941a = mutableStateFlow;
            this.f89942b = stateFlow;
            this.f89943c = stateFlow2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.areEqual(this.f89941a, dVar.f89941a) && Intrinsics.areEqual(this.f89942b, dVar.f89942b) && Intrinsics.areEqual(this.f89943c, dVar.f89943c);
        }

        public final int hashCode() {
            return this.f89943c.hashCode() + androidx.core.content.b.a(this.f89942b, this.f89941a.hashCode() * 31, 31);
        }

        @NotNull
        public final String toString() {
            return "State(stateFlow=" + this.f89941a + ", horizontalPaddingFlow=" + this.f89942b + ", isDoubleRelate=" + this.f89943c + ")";
        }
    }

    public a(@NotNull d dVar) {
        this.f89933a = dVar;
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new CheeseRecommendFeedComponent$bind$2(this, (G) viewBinding, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return G.inflate(LayoutInflater.from(context), viewGroup, false);
    }
}
