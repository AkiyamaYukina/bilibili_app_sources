package com.bilibili.ogv.operation.modular.modules;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.ImageRequestBuilder;
import com.bilibili.lib.image2.bean.IThumbnailSizeController;
import com.bilibili.lib.image2.bean.ThumbUrlTransformStrategyUtils;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.ogv.community.bean.BangumiFollowStatus;
import com.bilibili.ogv.opbase.CommonCard;
import com.bilibili.ogv.opbase.CountInfo;
import com.bilibili.ogvcommon.bangumibadge.BangumiBadgeInfo;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/F.class */
@StabilityInferred(parameters = 0)
public final class F extends RecyclerView.Adapter<G> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Pk0.w f70350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Ak0.c f70351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public List<CommonCard> f70352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final HashSet<Long> f70353d = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final CompositeDisposable f70354e;

    public F(@NotNull Pk0.w wVar, @NotNull Ak0.c cVar) {
        this.f70350a = wVar;
        this.f70351b = cVar;
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        this.f70354e = compositeDisposable;
        compositeDisposable.add(com.bilibili.ogv.community.k.f67553c.subscribe(new Consumer(this) { // from class: com.bilibili.ogv.operation.modular.modules.C

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final F f70339a;

            {
                this.f70339a = this;
            }

            public final void accept(Object obj) {
                BangumiFollowStatus bangumiFollowStatus = (BangumiFollowStatus) obj;
                F f7 = this.f70339a;
                List<CommonCard> list = f7.f70352c;
                if (list == null) {
                    return;
                }
                int i7 = 0;
                for (CommonCard commonCard : list) {
                    if (commonCard != null && commonCard.f69771m == bangumiFollowStatus.h) {
                        commonCard.f69694A.d(bangumiFollowStatus.f67509g);
                        f7.notifyItemChanged(i7);
                        return;
                    }
                    i7++;
                }
            }
        }, Functions.f, Functions.c));
    }

    public static final void N(F f7, Context context, boolean z6, int i7, boolean z7, String str) {
        f7.getClass();
        if (!z7) {
            if (z6) {
                ToastHelper.showToastShort(context, com.bilibili.ogv.pub.season.b.a(i7 <= 0 ? com.bilibili.ogv.pub.season.a.f71781i : new com.bilibili.ogv.pub.season.a(i7)) ? 2131822144 : 2131821903);
                return;
            } else {
                ToastHelper.showToastShort(context, 2131822191);
                return;
            }
        }
        if (str == null || str.length() == 0) {
            ToastHelper.showToastShort(context, 2131821871);
        } else {
            ToastHelper.showToastShort(context, str);
        }
    }

    public static final void O(F f7, boolean z6, long j7) {
        List<CommonCard> list = f7.f70352c;
        if (list == null) {
            return;
        }
        int i7 = 0;
        for (CommonCard commonCard : list) {
            if (commonCard != null && commonCard.f69771m == j7) {
                commonCard.f69694A.d(z6);
                f7.notifyItemChanged(i7);
                return;
            }
            i7++;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List<CommonCard> list = this.f70352c;
        return list != null ? list.size() : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        G g7 = (G) viewHolder;
        List<CommonCard> list = this.f70352c;
        CommonCard commonCard = list != null ? list.get(i7) : null;
        View view = g7.itemView;
        KProperty<Object> kProperty = w.f70777a[0];
        view.setTag(w.f70778b, commonCard);
        if (commonCard == null) {
            g7.f70362i.setVisibility(4);
            g7.f70359e.setVisibility(8);
            g7.f70360f.setVisibility(4);
            g7.f70361g.setVisibility(8);
            return;
        }
        g7.f70362i.setVisibility(0);
        g7.f70359e.setVisibility(0);
        int i8 = commonCard.f69773n;
        com.bilibili.ogv.pub.season.a aVar = com.bilibili.ogv.pub.season.a.f71781i;
        if (com.bilibili.ogv.pub.season.b.a(i8 <= 0 ? aVar : new com.bilibili.ogv.pub.season.a(i8))) {
            TextView textView = g7.f70359e;
            CountInfo countInfoE = commonCard.e();
            String str = "";
            if (countInfoE != null) {
                String strA = countInfoE.a();
                str = "";
                if (strA != null) {
                    str = strA;
                }
            }
            textView.setText(str);
        } else {
            TextView textView2 = g7.f70359e;
            CountInfo countInfoE2 = commonCard.e();
            String str2 = "";
            if (countInfoE2 != null) {
                String strA2 = countInfoE2.a();
                str2 = "";
                if (strA2 != null) {
                    str2 = strA2;
                }
            }
            textView2.setText(str2);
        }
        TextView textView3 = g7.f70362i;
        String str3 = commonCard.f69746a;
        textView3.setText((str3 == null || str3.length() == 0) ? commonCard.f69746a : G.p.a(commonCard.f69746a, " "));
        textView3.setTextColor(g7.f70357c.f319a.get());
        Context context = g7.f70358d.getContext();
        BiliImageLoader biliImageLoader = BiliImageLoader.INSTANCE;
        biliImageLoader.with(context).thumbnailUrlTransformStrategy(ThumbUrlTransformStrategyUtils.stylingStrategy$default("common-ogv", (IThumbnailSizeController) null, 2, (Object) null)).url(commonCard.f69749b).into(g7.f70358d);
        if (commonCard.f69740X) {
            g7.f70360f.setVisibility(0);
            Context context2 = g7.itemView.getContext();
            if (commonCard.f69694A.c()) {
                TextView textView4 = g7.f70360f;
                StateListDrawable stateListDrawable = new StateListDrawable();
                GradientDrawable gradientDrawable = new GradientDrawable();
                float f7 = 4;
                gradientDrawable.setCornerRadius(Uj0.c.a(f7, context2));
                gradientDrawable.setColor(g7.f70357c.h.get());
                Unit unit = Unit.INSTANCE;
                stateListDrawable.addState(new int[]{R.attr.state_enabled, R.attr.state_pressed}, gradientDrawable);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(Uj0.c.a(f7, context2));
                gradientDrawable2.setColor(g7.f70357c.f325g.get());
                stateListDrawable.addState(new int[]{R.attr.state_enabled}, gradientDrawable2);
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(Uj0.c.a(f7, context2));
                gradientDrawable3.setAlpha(76);
                gradientDrawable3.setColor(g7.f70357c.h.get());
                stateListDrawable.addState(new int[0], gradientDrawable3);
                textView4.setBackground(stateListDrawable);
                TextView textView5 = g7.f70360f;
                int i9 = commonCard.f69773n;
                if (i9 > 0) {
                    aVar = new com.bilibili.ogv.pub.season.a(i9);
                }
                textView5.setText(com.bilibili.ogv.pub.season.b.a(aVar) ? 2131821783 : 2131821780);
                g7.f70360f.setTextColor(g7.f70357c.f321c.get());
                g7.f70360f.setCompoundDrawables(null, null, null, null);
            } else {
                TextView textView6 = g7.f70360f;
                StateListDrawable stateListDrawable2 = new StateListDrawable();
                GradientDrawable gradientDrawable4 = new GradientDrawable();
                float f8 = 2;
                gradientDrawable4.setCornerRadius(Uj0.c.a(f8, context2));
                float f9 = 1;
                gradientDrawable4.setStroke(Uj0.c.b(f9, context2), ThemeUtils.getColorById(context2, 2131101466));
                gradientDrawable4.setColor(ThemeUtils.getColorById(context2, R.color.transparent));
                Unit unit2 = Unit.INSTANCE;
                stateListDrawable2.addState(new int[]{-16842910}, gradientDrawable4);
                GradientDrawable gradientDrawable5 = new GradientDrawable();
                gradientDrawable5.setCornerRadius(Uj0.c.a(f8, context2));
                gradientDrawable5.setColor(g7.f70357c.f325g.get());
                gradientDrawable5.setStroke(Uj0.c.b(f9, context2), g7.f70357c.f324f.get());
                stateListDrawable2.addState(new int[]{R.attr.state_pressed}, gradientDrawable5);
                GradientDrawable gradientDrawable6 = new GradientDrawable();
                gradientDrawable6.setCornerRadius(Uj0.c.a(f8, context2));
                gradientDrawable6.setStroke(Uj0.c.b(f9, context2), g7.f70357c.f324f.get());
                gradientDrawable6.setColor(ThemeUtils.getColorById(context2, R.color.transparent));
                stateListDrawable2.addState(new int[0], gradientDrawable6);
                textView6.setBackground(stateListDrawable2);
                TextView textView7 = g7.f70360f;
                int i10 = commonCard.f69773n;
                if (i10 > 0) {
                    aVar = new com.bilibili.ogv.pub.season.a(i10);
                }
                textView7.setText(com.bilibili.ogv.pub.season.b.a(aVar) ? 2131821782 : 2131821779);
                g7.f70360f.setTextColor(g7.f70357c.f324f.get());
                g7.f70360f.setCompoundDrawablesWithIntrinsicBounds(AppCompatResources.getDrawable(context2, 2131231359), (Drawable) null, (Drawable) null, (Drawable) null);
                TextViewCompat.setCompoundDrawableTintList(g7.f70360f, ColorStateList.valueOf(g7.f70357c.f324f.get()));
            }
        } else {
            g7.f70360f.setVisibility(8);
        }
        BangumiBadgeInfo bangumiBadgeInfoU = commonCard.u();
        String strB = bangumiBadgeInfoU != null ? bangumiBadgeInfoU.b() : null;
        if (strB == null || StringsKt.isBlank(strB)) {
            g7.h.setVisibility(8);
            Kl0.a.a(g7.f70361g, commonCard.u(), true, false);
            return;
        }
        g7.h.setVisibility(0);
        ImageRequestBuilder imageRequestBuilderUseOrigin = biliImageLoader.with(g7.h.getContext()).thumbnailUrlTransformStrategy(ThumbUrlTransformStrategyUtils.stylingStrategy$default("common-ogv", (IThumbnailSizeController) null, 2, (Object) null)).useOrigin();
        BangumiBadgeInfo bangumiBadgeInfoU2 = commonCard.u();
        ImageRequestBuilder.enableAnimate$default(imageRequestBuilderUseOrigin.url(bangumiBadgeInfoU2 != null ? bangumiBadgeInfoU2.b() : null), true, (Boolean) null, 2, (Object) null).into(g7.h);
        Kl0.a.a(g7.f70361g, null, true, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        View viewA = p.a(viewGroup, 2131499635, viewGroup, false);
        viewA.getLayoutParams().width = (viewGroup.getResources().getDisplayMetrics().widthPixels - (Uj0.c.b(16.0f, viewGroup.getContext()) * 4)) / 3;
        return new G(viewA, this, this.f70350a, this.f70351b);
    }
}
