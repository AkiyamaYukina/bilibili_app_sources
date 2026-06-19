package com.bilibili.ogv.operation.modular.modules;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.ogv.opbase.CommonCard;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/G.class */
@StabilityInferred(parameters = 0)
public final class G extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final F f70355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Pk0.w f70356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Ak0.c f70357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final BiliImageView f70358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final TextView f70359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final TextView f70360f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final TextView f70361g;

    @NotNull
    public final BiliImageView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final TextView f70362i;

    public G(@NotNull View view, @NotNull F f7, @NotNull Pk0.w wVar, @NotNull Ak0.c cVar) {
        super(view);
        this.f70355a = f7;
        this.f70356b = wVar;
        this.f70357c = cVar;
        BiliImageView biliImageViewFindViewById = view.findViewById(2131298941);
        this.f70358d = biliImageViewFindViewById;
        this.f70359e = (TextView) view.findViewById(2131299663);
        TextView textView = (TextView) view.findViewById(2131301778);
        this.f70360f = textView;
        this.f70361g = (TextView) view.findViewById(2131297143);
        this.h = view.findViewById(2131310568);
        this.f70362i = (TextView) view.findViewById(2131308958);
        biliImageViewFindViewById.getLayoutParams().height = (int) (view.getLayoutParams().width * 1.3333334f);
        textView.setOnClickListener(this);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        String str;
        View view2 = this.itemView;
        KProperty<Object> kProperty = w.f70777a[0];
        CommonCard commonCard = (CommonCard) view2.getTag(w.f70778b);
        if (commonCard == null) {
            return;
        }
        str = "";
        if (Intrinsics.areEqual(view, this.itemView)) {
            StringBuilder sb = new StringBuilder("pgc.");
            String str2 = commonCard.f69757e0;
            if (str2 == null) {
                str2 = str;
            }
            sb.append(str2);
            sb.append(".upcoming.works.click");
            Map<String, String> map = commonCard.f69701D0;
            Map<String, String> mapEmptyMap = map;
            if (map == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            Neurons.reportClick(false, sb.toString(), mapEmptyMap);
            this.f70356b.E6(commonCard.f69795y, new Pair[0]);
            return;
        }
        if (Intrinsics.areEqual(view, this.f70360f)) {
            StringBuilder sb2 = new StringBuilder("pgc.");
            String str3 = commonCard.f69757e0;
            sb2.append(str3 != null ? str3 : "");
            sb2.append(".upcoming.follow.click");
            Map<String, String> map2 = commonCard.f69701D0;
            Map<String, String> mapEmptyMap2 = map2;
            if (map2 == null) {
                mapEmptyMap2 = MapsKt.emptyMap();
            }
            Neurons.reportClick(false, sb2.toString(), mapEmptyMap2);
            F f7 = this.f70355a;
            Context context = view.getContext();
            f7.getClass();
            boolean zC = commonCard.f69694A.c();
            long j7 = commonCard.f69771m;
            int i7 = commonCard.f69773n;
            if (!com.bilibili.ogv.infra.account.a.f67852b.isLogin()) {
                f7.f70350a.j();
            } else {
                if (f7.f70353d.contains(Long.valueOf(j7))) {
                    return;
                }
                f7.f70353d.add(Long.valueOf(j7));
                f7.f70354e.add(com.bilibili.ogv.community.k.a(j7, zC).subscribe(new D(f7, j7, zC, context, i7), new E(f7, j7, zC, context, i7)));
            }
        }
    }
}
