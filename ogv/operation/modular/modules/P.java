package com.bilibili.ogv.operation.modular.modules;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.producers.ability.l0;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.ogv.opbase.CommonCard;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/P.class */
@StabilityInferred(parameters = 0)
public final class P extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f70404g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Pk0.w f70405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f70406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Ak0.c f70407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f70408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BiliImageView f70409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f70410f;

    public P(View view, Pk0.w wVar, String str, Ak0.c cVar) {
        super(view);
        this.f70405a = wVar;
        this.f70406b = str;
        this.f70407c = cVar;
        this.f70408d = (TextView) view.findViewById(2131310619);
        this.f70409e = view.findViewById(2131302584);
        this.f70410f = (TextView) view.findViewById(2131312048);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        View view2 = this.itemView;
        KProperty<Object> kProperty = w.f70777a[0];
        CommonCard commonCard = (CommonCard) view2.getTag(w.f70778b);
        if (commonCard == null) {
            return;
        }
        StringBuilder sbA = l0.a("pgc.", commonCard.f69757e0, ".operation.works.click");
        Map<String, String> map = commonCard.f69701D0;
        Map<String, String> mapEmptyMap = map;
        if (map == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        Neurons.reportClick(false, sbA.toString(), mapEmptyMap);
        this.f70405a.E6(commonCard.f69795y, new Pair[0]);
    }
}
