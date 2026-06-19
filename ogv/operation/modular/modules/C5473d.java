package com.bilibili.ogv.operation.modular.modules;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.ogv.infra.legacy.exposure.IExposureReporter;
import com.bilibili.ogv.opbase.CommonCard;
import com.bilibili.ogv.operation.modular.modules.C5473d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: renamed from: com.bilibili.ogv.operation.modular.modules.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/d.class */
@StabilityInferred(parameters = 0)
public final class C5473d extends RecyclerView.ViewHolder {
    public static final int h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Pk0.w f70599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f70600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f70601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final RecyclerView f70602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final BiliImageView f70603e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public C5470a f70604f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final a f70605g;

    /* JADX INFO: renamed from: com.bilibili.ogv.operation.modular.modules.d$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/d$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends RecyclerView.Adapter<C0430a> implements IExposureReporter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Context f70606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f70607b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public C5470a f70608c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final Ak0.c f70609d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public C5471b f70610e;

        /* JADX INFO: renamed from: com.bilibili.ogv.operation.modular.modules.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/d$a$a.class */
        @StabilityInferred(parameters = 0)
        public static final class C0430a extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final BiliImageView f70611a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final TextView f70612b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            public final TextView f70613c;

            public C0430a(@NotNull View view) {
                super(view);
                this.f70611a = view.findViewById(2131296401);
                this.f70612b = (TextView) view.findViewById(2131296423);
                this.f70613c = (TextView) view.findViewById(2131314198);
            }
        }

        public a(@NotNull Context context, @Nullable String str, @NotNull C5470a c5470a, @NotNull Ak0.c cVar) {
            this.f70606a = context;
            this.f70607b = str;
            this.f70608c = c5470a;
            this.f70609d = cVar;
        }

        @Override // com.bilibili.ogv.infra.legacy.exposure.IExposureReporter
        public final void Xa(int i7, @NotNull IExposureReporter.ReporterCheckerType reporterCheckerType, @Nullable View view) {
            String strA = C8770a.a(new StringBuilder("pgc."), this.f70607b, ".operation.0.show");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            CommonCard commonCard = (CommonCard) CollectionsKt.getOrNull(this.f70608c.f70430d, i7);
            Map<String, String> map = commonCard != null ? commonCard.f69701D0 : null;
            Map<String, String> mapEmptyMap = map;
            if (map == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            linkedHashMap.putAll(mapEmptyMap);
            Neurons.reportExposure$default(false, strA, linkedHashMap, (List) null, 8, (Object) null);
            CommonCard commonCard2 = (CommonCard) CollectionsKt.getOrNull(this.f70608c.f70430d, i7);
            if (commonCard2 != null) {
                commonCard2.f69736V = true;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return ((ArrayList) this.f70608c.f70430d).size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final long getItemId(int i7) {
            return i7;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i7) {
            String str;
            Integer intOrNull;
            C0430a c0430a = (C0430a) viewHolder;
            View view = c0430a.itemView;
            if (!((ArrayList) this.f70608c.f70430d).isEmpty()) {
                CommonCard commonCard = (CommonCard) CollectionsKt.getOrNull(this.f70608c.f70430d, i7);
                TextView textView = c0430a.f70612b;
                textView.setText(commonCard != null ? commonCard.f69746a : null);
                Integer num = this.f70608c.f70429c;
                textView.setTextColor(num != null ? num.intValue() : this.f70609d.f320b.get());
                String str2 = commonCard != null ? commonCard.f69769l : null;
                BiliImageView biliImageView = c0430a.f70611a;
                if (str2 == null || str2.length() == 0) {
                    String str3 = null;
                    if (commonCard != null) {
                        str3 = commonCard.f69749b;
                    }
                    Nl0.f.d(biliImageView, str3);
                } else {
                    int dimensionPixelSize = this.f70606a.getResources().getDimensionPixelSize(2131165354);
                    String str4 = null;
                    if (commonCard != null) {
                        str4 = commonCard.f69769l;
                    }
                    Nl0.f.b(biliImageView, str4, dimensionPixelSize, dimensionPixelSize);
                }
                int iIntValue = (commonCard == null || (str = commonCard.f69763i) == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) ? 0 : intOrNull.intValue();
                if (iIntValue <= 0) {
                    c0430a.f70613c.setVisibility(8);
                } else {
                    c0430a.f70613c.setVisibility(0);
                    c0430a.f70613c.setText(iIntValue > 99 ? "99+" : String.valueOf(iIntValue));
                }
            }
            view.setOnClickListener(new View.OnClickListener(this, i7) { // from class: com.bilibili.ogv.operation.modular.modules.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final C5473d.a f70525a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f70526b;

                {
                    this.f70525a = this;
                    this.f70526b = i7;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C5473d.a aVar = this.f70525a;
                    int i8 = this.f70526b;
                    C5471b c5471b = aVar.f70610e;
                    if (c5471b != null) {
                        c5471b.invoke(Integer.valueOf(i8));
                    }
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            return new C0430a(LayoutInflater.from(this.f70606a).inflate(2131499625, viewGroup, false));
        }

        @Override // com.bilibili.ogv.infra.legacy.exposure.IExposureReporter
        public final boolean ve(int i7, @NotNull IExposureReporter.ReporterCheckerType reporterCheckerType) {
            CommonCard commonCard = (CommonCard) CollectionsKt.getOrNull(this.f70608c.f70430d, i7);
            boolean z6 = false;
            if (commonCard != null) {
                z6 = false;
                if (!commonCard.f69736V) {
                    z6 = true;
                }
            }
            return z6;
        }
    }

    public C5473d(@NotNull Pk0.w wVar, @NotNull View view, @Nullable String str, @Nullable String str2, @NotNull Ak0.c cVar) {
        super(view);
        this.f70599a = wVar;
        this.f70600b = str;
        this.f70601c = str2;
        this.f70602d = (RecyclerView) view.findViewById(2131302542);
        this.f70603e = view.findViewById(2131297134);
        this.f70604f = new C5470a();
        a aVar = new a(view.getContext(), str2, this.f70604f, cVar);
        aVar.setHasStableIds(true);
        this.f70605g = aVar;
    }
}
