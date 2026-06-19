package com.bilibili.ship.theseus.cheese.biz.intro.desc;

import GS0.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bilibili.app.gemini.ui.m;
import com.bilibili.bplus.im.conversation.E0;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.iconfont.IconFont;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.ImageRequestBuilder;
import com.bilibili.lib.image2.bean.DefaultTransformStrategy;
import com.bilibili.lib.image2.bean.ScaleType;
import com.bilibili.lib.image2.bean.ThumbUrlTransformStrategyUtils;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.playerbizcommonv2.utils.p;
import com.bilibili.ship.theseus.cheese.biz.intro.desc.c;
import fu0.C7188j;
import fu0.C7189k;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/desc/c.class */
@StabilityInferred(parameters = 0)
public final class c extends m<C7189k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C0611c f89390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<h> f89391b = SharedFlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_OLDEST, 1, (Object) null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final a f89392c = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/desc/c$a.class */
    public final class a extends RecyclerView.Adapter<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<j> f89393a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f89394b;

        public a(c cVar) {
            this.f89394b = cVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final void onBindViewHolder(@NotNull b bVar, int i7) {
            bVar.p0((j) CollectionsKt.getOrNull(this.f89393a, i7));
            ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(bVar.itemView, new ExposureEntry(com.bilibili.ship.theseus.cheese.biz.report.c.f90464b, new com.bilibili.ship.theseus.cheese.biz.intro.desc.a(i7, this.f89394b)));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return ((ArrayList) this.f89393a).size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7, List list) {
            b bVar = (b) viewHolder;
            if (list.isEmpty()) {
                onBindViewHolder(bVar, i7);
            } else if (list.contains("payload_image_width_changed")) {
                bVar.p0((j) CollectionsKt.getOrNull(this.f89393a, i7));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            return new b(C7188j.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/desc/c$b.class */
    public final class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final C7188j f89395a;

        public b(@NotNull C7188j c7188j) {
            super(c7188j.f119553a);
            this.f89395a = c7188j;
        }

        public final void p0(@Nullable final j jVar) {
            C7188j c7188j = this.f89395a;
            if (jVar == null) {
                return;
            }
            try {
                final Context context = c7188j.f119553a.getContext();
                c7188j.f119553a.post(new Runnable(this, jVar, context) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.desc.d

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final c.b f89398a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final j f89399b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final Context f89400c;

                    {
                        this.f89398a = this;
                        this.f89399b = jVar;
                        this.f89400c = context;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        c.b bVar = this.f89398a;
                        j jVar2 = this.f89399b;
                        Context context2 = this.f89400c;
                        int width = bVar.f89395a.f119553a.getWidth();
                        String str = jVar2.f89417a;
                        double d7 = jVar2.f89418b;
                        C7188j c7188j2 = bVar.f89395a;
                        if (d7 <= 0.0d) {
                            c7188j2.f119554b.setImageURI(Uri.parse(str));
                            BiliImageLoader biliImageLoader = BiliImageLoader.INSTANCE;
                            BiliImageView biliImageView = c7188j2.f119554b;
                            ImageRequestBuilder imageRequestBuilderUseOrigin = biliImageLoader.with(biliImageView.getContext()).url(str).useOrigin();
                            DefaultTransformStrategy defaultTransformStrategyDefaultStrategy = ThumbUrlTransformStrategyUtils.defaultStrategy();
                            defaultTransformStrategyDefaultStrategy.setThumbnailSizeController(new Ba0.d("cheese_detail_overview_img"));
                            imageRequestBuilderUseOrigin.thumbnailUrlTransformStrategy(defaultTransformStrategyDefaultStrategy).imageLoadingListener(new e(bVar, biliImageView, width)).into(biliImageView);
                            return;
                        }
                        if (p.d()) {
                            c7188j2.f119554b.setAspectRatio(1 / ((float) d7));
                        } else {
                            BiliImageView biliImageView2 = c7188j2.f119554b;
                            float f7 = (float) d7;
                            ViewGroup.LayoutParams layoutParams = biliImageView2.getLayoutParams();
                            layoutParams.width = width;
                            layoutParams.height = (int) (width * f7);
                            biliImageView2.setLayoutParams(layoutParams);
                        }
                        BiliImageLoader.INSTANCE.with(context2).url(str).actualImageScaleType(ScaleType.FIT_XY).into(c7188j2.f119554b);
                    }
                });
            } catch (Exception e7) {
                BLog.i("cheese desc image holder error = " + e7);
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.desc.c$c, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/desc/c$c.class */
    @StabilityInferred(parameters = 0)
    public static final class C0611c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final MutableStateFlow f89396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final StateFlow<Integer> f89397b;

        public C0611c(@NotNull MutableStateFlow mutableStateFlow, @NotNull StateFlow stateFlow) {
            this.f89396a = mutableStateFlow;
            this.f89397b = stateFlow;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0611c)) {
                return false;
            }
            C0611c c0611c = (C0611c) obj;
            return Intrinsics.areEqual(this.f89396a, c0611c.f89396a) && Intrinsics.areEqual(this.f89397b, c0611c.f89397b);
        }

        public final int hashCode() {
            return this.f89397b.hashCode() + (this.f89396a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "State(stateFlow=" + this.f89396a + ", horizontalPaddingFlow=" + this.f89397b + ")";
        }
    }

    public c(@NotNull C0611c c0611c) {
        this.f89390a = c0611c;
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        C7189k c7189k = (C7189k) viewBinding;
        Drawable iconDrawable = IconFont.getIconDrawable("arrow_expand_line@900", ContextCompat.getColor(c7189k.f119555a.getContext(), R$color.Text3));
        if (iconDrawable != null) {
            iconDrawable.setBounds(0, 0, NewPlayerUtilsKt.toPx(14.0f), NewPlayerUtilsKt.toPx(14.0f));
            c7189k.f119557c.setCompoundDrawables(null, null, iconDrawable, null);
        }
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new CheeseDescImageComponent$bind$3(c7189k, this, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C7189k c7189kInflate = C7189k.inflate(LayoutInflater.from(context), viewGroup, false);
        c7189kInflate.f119559e.setAdapter(this.f89392c);
        c7189kInflate.f119559e.setLayoutManager(new LinearLayoutManager(c7189kInflate.f119555a.getContext()));
        View view = c7189kInflate.f119560f;
        E0 e02 = com.bilibili.ship.theseus.cheese.biz.report.c.f90463a;
        ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(view, new ExposureEntry(e02, new l(this, 5)));
        ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(c7189kInflate.f119561g, new ExposureEntry(e02, new GS0.m(this, 4)));
        return c7189kInflate;
    }
}
