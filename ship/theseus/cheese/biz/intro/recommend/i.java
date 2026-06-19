package com.bilibili.ship.theseus.cheese.biz.intro.recommend;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.ship.theseus.cheese.biz.intro.recommend.i;
import com.bilibili.ship.theseus.cheese.biz.intro.recommend.s;
import fu0.J;
import fu0.K;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import nu0.C8143b;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.utils.DpUtils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/i.class */
@StabilityInferred(parameters = 0)
public final class i extends com.bilibili.app.gemini.ui.m<K> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow f89965a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/i$a.class */
    public final class a extends RecyclerView.Adapter<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final w f89966a;

        public a(@NotNull i iVar, w wVar) {
            this.f89966a = wVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f89966a.f90013a.f89999b.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i7) {
            final b bVar = (b) viewHolder;
            ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(bVar.itemView, new ExposureEntry(com.bilibili.ship.theseus.cheese.biz.report.c.f90463a, new Function0(this, i7) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.recommend.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final i.a f89963a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f89964b;

                {
                    this.f89963a = this;
                    this.f89964b = i7;
                }

                public final Object invoke() {
                    i.a aVar = this.f89963a;
                    List<u> list = aVar.f89966a.f90013a.f89999b;
                    int i8 = this.f89964b;
                    aVar.f89966a.f90015c.invoke(new s.d((u) CollectionsKt.getOrNull(list, i8), i8));
                    return Unit.INSTANCE;
                }
            }));
            u uVar = (u) CollectionsKt.getOrNull(this.f89966a.f90013a.f89999b, i7);
            BiliImageLoader biliImageLoader = BiliImageLoader.INSTANCE;
            J j7 = bVar.f89967a;
            biliImageLoader.with(j7.f119452a.getContext()).url(uVar != null ? uVar.f90002a : null).into(j7.f119454c);
            j7.f119457f.setText(uVar != null ? uVar.f90003b : null);
            j7.f119453b.setText(uVar != null ? uVar.f90006e : null);
            View view = j7.f119456e;
            String str = null;
            if (uVar != null) {
                str = uVar.f90006e;
            }
            view.setVisibility((str == null || str.length() == 0) ? 8 : 0);
            j7.f119452a.setOnClickListener(new View.OnClickListener(bVar, i7) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.recommend.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final i.b f89969a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f89970b;

                {
                    this.f89969a = bVar;
                    this.f89970b = i7;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f89969a.f89968b.f90015c.invoke(new s.a(this.f89970b));
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            return new b(J.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false), this.f89966a);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/i$b.class */
    public final class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final J f89967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final w f89968b;

        public b(@NotNull J j7, @NotNull w wVar) {
            super(j7.f119452a);
            this.f89967a = j7;
            this.f89968b = wVar;
        }
    }

    public i(@NotNull MutableStateFlow mutableStateFlow) {
        this.f89965a = mutableStateFlow;
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        Object objCollectLatest = FlowKt.collectLatest(this.f89965a, new CheeseRecommendMulComponent$bind$2((K) viewBinding, this, null), continuation);
        if (objCollectLatest != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCollectLatest = Unit.INSTANCE;
        }
        return objCollectLatest;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        K kInflate = K.inflate(LayoutInflater.from(context), viewGroup, false);
        int iDp2px = (int) DpUtils.dp2px(context, 10.0f);
        kInflate.f119461d.addItemDecoration(new C8143b(iDp2px, iDp2px, iDp2px));
        return kInflate;
    }
}
