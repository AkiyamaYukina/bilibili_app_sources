package com.bilibili.ogv.operation.modular.modules;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.ogv.infra.legacy.exposure.IExposureReporter;
import com.bilibili.ogv.opbase.BadgeControll;
import com.bilibili.ogv.opbase.BadgeInfo;
import com.bilibili.ogv.opbase.CommonCard;
import com.bilibili.ogv.opbase.NewestTime;
import com.bilibili.ogv.operation.modular.modules.O;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/O.class */
@StabilityInferred(parameters = 0)
public final class O extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f70392e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f70393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final RecyclerView f70394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final List<CommonCard> f70395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final a f70396d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/O$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends RecyclerView.Adapter<b> implements IExposureReporter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final List<CommonCard> f70397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Pk0.w f70398b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f70399c;

        public a(@Nullable List list, @NotNull Pk0.w wVar, @Nullable String str) {
            this.f70397a = list;
            this.f70398b = wVar;
            this.f70399c = str;
        }

        public static void N(View view, String str, String str2, int i7) {
            Drawable background = view.getBackground();
            if (str == null || StringsKt.isBlank(str) || str2 == null || StringsKt.isBlank(str2)) {
                i7 = ThemeUtils.getColorById(view.getContext(), i7);
            } else {
                try {
                    i7 = MultipleThemeUtils.isNightTheme(view.getContext()) ? Color.parseColor(str) : Color.parseColor(str2);
                } catch (Exception e7) {
                    i7 = ThemeUtils.getColorById(view.getContext(), i7);
                }
            }
            if (background instanceof GradientDrawable) {
                ((GradientDrawable) background).setColor(i7);
            }
        }

        @Override // com.bilibili.ogv.infra.legacy.exposure.IExposureReporter
        public final void Xa(int i7, @NotNull IExposureReporter.ReporterCheckerType reporterCheckerType, @Nullable View view) {
            CommonCard commonCard;
            CommonCard commonCard2;
            List<CommonCard> list = this.f70397a;
            if (list == null || (commonCard = (CommonCard) CollectionsKt.getOrNull(list, i7)) == null) {
                return;
            }
            String strA = C8770a.a(new StringBuilder("pgc."), this.f70399c, ".operation.0.show");
            Map<String, String> map = commonCard.f69701D0;
            Map<String, String> mapEmptyMap = map;
            if (map == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            Neurons.reportExposure$default(false, strA, mapEmptyMap, (List) null, 8, (Object) null);
            List<CommonCard> list2 = this.f70397a;
            if (list2 == null || (commonCard2 = (CommonCard) CollectionsKt.getOrNull(list2, i7)) == null) {
                return;
            }
            commonCard2.f69736V = true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            List<CommonCard> list = this.f70397a;
            return list != null ? list.size() : 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
            BadgeInfo badgeInfoB;
            BadgeInfo badgeInfoB2;
            BadgeInfo badgeInfoB3;
            BadgeControll badgeControll;
            BadgeControll badgeControll2;
            NewestTime newestTimeA;
            Long newestTime;
            final b bVar = (b) viewHolder;
            List<CommonCard> list = this.f70397a;
            if (list == null || ((ArrayList) list).isEmpty()) {
                return;
            }
            List<CommonCard> list2 = this.f70397a;
            CommonCard commonCard = list2 != null ? (CommonCard) CollectionsKt.getOrNull(list2, i7) : null;
            long jLongValue = (commonCard == null || (badgeControll2 = commonCard.f69788u0) == null || (newestTimeA = badgeControll2.a()) == null || (newestTime = newestTimeA.getNewestTime()) == null) ? 0L : newestTime.longValue();
            String str = (commonCard == null || (badgeControll = commonCard.f69788u0) == null) ? null : badgeControll.f69664a;
            long jOptLong = BiliGlobalPreferenceHelper.getInstance(bVar.itemView.getContext()).optLong(this.f70399c + ":function_b:" + (commonCard != null ? Long.valueOf(commonCard.f69702E) : null), 0L);
            bVar.f70402c.setText(commonCard != null ? commonCard.f69746a : null);
            N(bVar.f70401b, (commonCard == null || (badgeInfoB3 = commonCard.b()) == null) ? null : badgeInfoB3.f69668b, (commonCard == null || (badgeInfoB2 = commonCard.b()) == null) ? null : badgeInfoB2.f69669c, R$color.Ga2);
            Nl0.f.d(bVar.f70400a, commonCard != null ? commonCard.f69749b : null);
            String str2 = commonCard != null ? commonCard.f69763i : null;
            if (str2 == null || str2.length() == 0 || !TextUtils.equals(str, "by_newest_mtime") || jOptLong >= jLongValue) {
                bVar.f70403d.setVisibility(8);
            } else {
                bVar.f70403d.setVisibility(0);
                bVar.f70403d.setText(commonCard != null ? commonCard.f69763i : null);
                TextView textView = bVar.f70403d;
                String str3 = (commonCard == null || (badgeInfoB = commonCard.b()) == null) ? null : badgeInfoB.f69670d;
                String str4 = null;
                if (commonCard != null) {
                    BadgeInfo badgeInfoB4 = commonCard.b();
                    str4 = null;
                    if (badgeInfoB4 != null) {
                        str4 = badgeInfoB4.f69671e;
                    }
                }
                N(textView, str3, str4, R$color.Re5);
            }
            final CommonCard commonCard2 = commonCard;
            final String str5 = str;
            final long j7 = jLongValue;
            bVar.itemView.setOnClickListener(new View.OnClickListener(this, commonCard2, bVar, str5, j7) { // from class: com.bilibili.ogv.operation.modular.modules.N

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final O.a f70387a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final CommonCard f70388b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final O.b f70389c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final String f70390d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final long f70391e;

                {
                    this.f70387a = this;
                    this.f70388b = commonCard2;
                    this.f70389c = bVar;
                    this.f70390d = str5;
                    this.f70391e = j7;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    O.a aVar = this.f70387a;
                    CommonCard commonCard3 = this.f70388b;
                    O.b bVar2 = this.f70389c;
                    String str6 = this.f70390d;
                    long j8 = this.f70391e;
                    String strA = C8770a.a(new StringBuilder("pgc."), aVar.f70399c, ".operation.works.click");
                    Map<String, String> map = commonCard3 != null ? commonCard3.f69701D0 : null;
                    Map<String, String> mapEmptyMap = map;
                    if (map == null) {
                        mapEmptyMap = MapsKt.emptyMap();
                    }
                    Neurons.reportClick(false, strA, mapEmptyMap);
                    if (bVar2.f70403d.getVisibility() == 0) {
                        String strValueOf = commonCard3 != null ? String.valueOf(commonCard3.f69702E) : null;
                        if (strValueOf != null && strValueOf.length() != 0 && TextUtils.equals(str6, "by_newest_mtime") && j8 > 0) {
                            BiliGlobalPreferenceHelper.getInstance(view.getContext()).setLong(aVar.f70399c + ":function_b:" + (commonCard3 != null ? Long.valueOf(commonCard3.f69702E) : null), j8);
                            bVar2.f70403d.setVisibility(8);
                        }
                    }
                    String str7 = null;
                    if (commonCard3 != null) {
                        str7 = commonCard3.f69795y;
                    }
                    aVar.f70398b.E6(str7, new Pair[0]);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            return new b(p.a(viewGroup, 2131499646, viewGroup, false));
        }

        @Override // com.bilibili.ogv.infra.legacy.exposure.IExposureReporter
        public final boolean ve(int i7, @NotNull IExposureReporter.ReporterCheckerType reporterCheckerType) {
            CommonCard commonCard;
            List<CommonCard> list = this.f70397a;
            return (list == null || (commonCard = (CommonCard) CollectionsKt.getOrNull(list, i7)) == null) ? false : !commonCard.f69736V;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/O$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final BiliImageView f70400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final RelativeLayout f70401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final TextView f70402c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final TextView f70403d;

        public b(@NotNull View view) {
            super(view);
            this.f70400a = view.findViewById(2131302505);
            this.f70401b = (RelativeLayout) view.findViewById(2131310429);
            this.f70402c = (TextView) view.findViewById(2131310619);
            this.f70403d = (TextView) view.findViewById(2131297143);
        }
    }

    public O(@NotNull View view, @NotNull Pk0.w wVar, @Nullable String str, @Nullable String str2) {
        super(view);
        this.f70393a = str;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(2131310739);
        this.f70394b = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f70395c = arrayList;
        a aVar = new a(arrayList, wVar, str2);
        this.f70396d = aVar;
        recyclerView.setLayoutManager(new GridLayoutManager(view.getContext(), 3));
        int iB = Uj0.c.b(10.0f, view.getContext());
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.addItemDecoration(new M(iB));
        recyclerView.setAdapter(aVar);
    }
}
