package com.bilibili.ship.theseus.cheese.biz.intro.selection;

import Eg.j;
import I.E;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.bilibili.app.gemini.ui.m;
import com.bilibili.biligame.compose.widget.G;
import com.bilibili.bililive.room.ui.roomv3.player.controller.widget.G0;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository$special$$inlined$map$1;
import eu0.C6985d;
import fu0.C7180b;
import fu0.C7181c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import nu0.C8143b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.utils.DpUtils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/selection/a.class */
@StabilityInferred(parameters = 0)
public final class a extends m<C7181c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow f90046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f90047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f90048c = -1;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.selection.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/selection/a$a.class */
    public final class C0634a extends RecyclerView.Adapter<C0635a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f90049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final List<b> f90050b = new ArrayList();

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.selection.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/selection/a$a$a.class */
        public final class C0635a extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final C7180b f90051a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final C0634a f90052b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0635a(@NotNull C0634a c0634a, C7180b c7180b) {
                super(c7180b.f119525a);
                this.f90052b = c0634a;
                this.f90051a = c7180b;
            }

            public static void p0(float f7, View view) {
                if (view instanceof ViewGroup) {
                    Iterator it = ViewGroupKt.getChildren((ViewGroup) view).iterator();
                    while (it.hasNext()) {
                        ((View) it.next()).setAlpha(f7);
                    }
                }
                view.setAlpha(f7);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return ((ArrayList) this.f90050b).size();
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0302 -> B:49:0x029a). Please report as a decompilation issue!!! */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
            C6985d c6985d;
            int style;
            int style2;
            C0635a c0635a = (C0635a) viewHolder;
            b bVar = (b) CollectionsKt.getOrNull(this.f90050b, i7);
            c0635a.getClass();
            if (bVar == null || (c6985d = bVar.f90053a) == null) {
                return;
            }
            C7180b c7180b = c0635a.f90051a;
            Context context = c7180b.f119525a.getContext();
            View.OnClickListener jVar = new j(bVar, 2);
            ConstraintLayout constraintLayout = c7180b.f119525a;
            constraintLayout.setOnClickListener(jVar);
            ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(c0635a.itemView, new ExposureEntry(com.bilibili.ship.theseus.cheese.biz.report.c.f90463a, new Z80.a(bVar, 2)));
            String str = MultipleThemeUtils.isNightTheme(context) ? "theseus_detail_playing_night.json" : "theseus_detail_playing.json";
            LottieAnimationView lottieAnimationView = c7180b.f119527c;
            lottieAnimationView.setAnimation(str);
            lottieAnimationView.setVisibility(c6985d.f117525u ? 0 : 8);
            if (c6985d.f117525u && c0635a.f90052b.f90049a && c6985d.f117516l) {
                lottieAnimationView.playAnimation();
            } else {
                lottieAnimationView.pauseAnimation();
            }
            c7180b.f119526b.setTextColor(ContextCompat.getColor(context, c6985d.f117525u ? 2131104469 : R$color.Text1));
            c7180b.f119528d.setText(c6985d.f117520p.f117557a);
            TextView textView = c7180b.f119528d;
            int i8 = 8;
            if (textView.getText().length() > 0) {
                i8 = 0;
            }
            textView.setVisibility(i8);
            c7180b.f119528d.setBackground(AppCompatResources.getDrawable(context, 2131240838));
            long j7 = c6985d.f117508c;
            String strValueOf = j7 > 0 ? String.valueOf(j7) : "";
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (lottieAnimationView.getVisibility() == 0) {
                ColorDrawable colorDrawable = new ColorDrawable(0);
                colorDrawable.setBounds(new Rect(0, 0, (int) DpUtils.dp2px(context, 12.0f), (int) DpUtils.dp2px(context, 12.0f)));
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.setSpan(new ImageSpan(colorDrawable), 0, 1, 33);
            }
            if (!StringsKt.isBlank(strValueOf)) {
                if (lottieAnimationView.getVisibility() == 0) {
                    ColorDrawable colorDrawable2 = new ColorDrawable(0);
                    colorDrawable2.setBounds(new Rect(0, 0, (int) DpUtils.dp2px(context, 2.0f), (int) DpUtils.dp2px(context, 2.0f)));
                    spannableStringBuilder.append((CharSequence) " ");
                    spannableStringBuilder.setSpan(new ImageSpan(colorDrawable2), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                }
                try {
                    style2 = Typeface.create("sans-serif-medium", 0).getStyle();
                } catch (Exception e7) {
                    style2 = 1;
                }
                StyleSpan styleSpan = new StyleSpan(style2);
                spannableStringBuilder.append((CharSequence) strValueOf);
                spannableStringBuilder.setSpan(styleSpan, spannableStringBuilder.length() - strValueOf.length(), spannableStringBuilder.length(), 33);
            }
            spannableStringBuilder.append((CharSequence) " ");
            ColorDrawable colorDrawable3 = new ColorDrawable(0);
            colorDrawable3.setBounds(new Rect(0, 0, (int) DpUtils.dp2px(context, 2.0f), (int) DpUtils.dp2px(context, 2.0f)));
            spannableStringBuilder.setSpan(new ImageSpan(colorDrawable3), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            String str2 = c6985d.f117512g;
            spannableStringBuilder.append((CharSequence) str2);
            if (c6985d.f117525u) {
                try {
                    style = Typeface.create("sans-serif-medium", 0).getStyle();
                } catch (Exception e8) {
                    style = 1;
                }
                StyleSpan styleSpan2 = new StyleSpan(style);
                int length = spannableStringBuilder.length() - str2.length();
                if (length >= 0) {
                    spannableStringBuilder.setSpan(styleSpan2, length, spannableStringBuilder.length(), 33);
                }
            }
            c7180b.f119526b.setText(spannableStringBuilder);
            if (c6985d.f117506a == 2 ? c6985d.f117507b.f117565c : c6985d.f117517m) {
                C0635a.p0(1.0f, constraintLayout);
            } else {
                C0635a.p0(0.7f, constraintLayout);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            return new C0635a(this, C7180b.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/selection/a$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final C6985d f90053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final d f90054b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final G f90055c;

        public b(@NotNull C6985d c6985d, @NotNull d dVar, @NotNull G g7) {
            this.f90053a = c6985d;
            this.f90054b = dVar;
            this.f90055c = g7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f90053a, bVar.f90053a) && Intrinsics.areEqual(this.f90054b, bVar.f90054b) && Intrinsics.areEqual(this.f90055c, bVar.f90055c);
        }

        public final int hashCode() {
            int iHashCode = this.f90053a.hashCode();
            return this.f90055c.hashCode() + ((hashCode() + (iHashCode * 31)) * 31);
        }

        @NotNull
        public final String toString() {
            return "ItemState(data=" + this.f90053a + ", onClick=" + this.f90054b + ", onExposure=" + this.f90055c + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/selection/a$c.class */
    @StabilityInferred(parameters = 0)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<b> f90056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f90057b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final G0 f90058c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final CheesePlayRepository$special$$inlined$map$1 f90059d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final Flow<Boolean> f90060e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final StateFlow<Integer> f90061f;

        public c(@NotNull List list, @NotNull String str, @NotNull G0 g02, @NotNull CheesePlayRepository$special$$inlined$map$1 cheesePlayRepository$special$$inlined$map$1, @NotNull Flow flow, @NotNull StateFlow stateFlow) {
            this.f90056a = list;
            this.f90057b = str;
            this.f90058c = g02;
            this.f90059d = cheesePlayRepository$special$$inlined$map$1;
            this.f90060e = flow;
            this.f90061f = stateFlow;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f90056a, cVar.f90056a) && Intrinsics.areEqual(this.f90057b, cVar.f90057b) && Intrinsics.areEqual(this.f90058c, cVar.f90058c) && Intrinsics.areEqual(this.f90059d, cVar.f90059d) && Intrinsics.areEqual(this.f90060e, cVar.f90060e) && Intrinsics.areEqual(this.f90061f, cVar.f90061f);
        }

        public final int hashCode() {
            int iA = E.a(this.f90056a.hashCode() * 31, 31, this.f90057b);
            int iHashCode = this.f90058c.hashCode();
            int iHashCode2 = this.f90059d.hashCode();
            return this.f90061f.hashCode() + ((this.f90060e.hashCode() + ((iHashCode2 + ((iHashCode + iA) * 31)) * 31)) * 31);
        }

        @NotNull
        public final String toString() {
            return "State(itemsState=" + this.f90056a + ", catalogText=" + this.f90057b + ", onCatalogClick=" + this.f90058c + ", selectedEpisode=" + this.f90059d + ", alreadyPlay=" + this.f90060e + ", horizontalPaddingFlow=" + this.f90061f + ")";
        }
    }

    public a(@NotNull MutableStateFlow mutableStateFlow) {
        this.f90046a = mutableStateFlow;
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        C7181c c7181c = (C7181c) viewBinding;
        Object objCollectLatest = FlowKt.collectLatest(this.f90046a, new CheeseSeasonSelectionComponent$bind$2(c7181c, c7181c.f119529a.getContext(), this, null), continuation);
        if (objCollectLatest != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCollectLatest = Unit.INSTANCE;
        }
        return objCollectLatest;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C7181c c7181cInflate = C7181c.inflate(layoutInflater, viewGroup, false);
        c7181cInflate.f119533e.addItemDecoration(new C8143b(0, (int) DpUtils.dp2px(context, 8.0f), 0));
        c7181cInflate.f119533e.setAdapter(new C0634a());
        return c7181cInflate;
    }
}
