package com.bilibili.tgwt.square;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.lib.neuron.api.Neurons;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.bili.widget.Banner;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/b.class */
@StabilityInferred(parameters = 0)
public final class b implements UIComponent<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f112105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final c f112106b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/b$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a implements UIComponent.ViewEntry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final View f112107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Banner f112108b;

        public a(@NotNull View view) {
            this.f112107a = view;
            this.f112108b = view.findViewById(2131296911);
        }

        @NotNull
        public final View getRoot() {
            return this.f112107a;
        }
    }

    public b(int i7, @NotNull c cVar) {
        this.f112105a = i7;
        this.f112106b = cVar;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        Unit unit;
        a aVar = (a) viewEntry;
        final View view = aVar.f112107a;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = CollectionsKt.emptyList();
        c cVar = this.f112106b;
        final List<CommonCard> list = cVar.f112109a;
        float dimension = view.getResources().getDimension(2131165364);
        Banner banner = aVar.f112108b;
        banner.setRadius(dimension);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, 0});
        gradientDrawable.setGradientType(0);
        view.setBackground(gradientDrawable);
        if (list.isEmpty()) {
            banner.setVisibility(8);
            unit = Unit.INSTANCE;
        } else {
            int i7 = cVar.f112110b;
            if (i7 != 0) {
                banner.setIndicatorGravity(i7);
            }
            banner.setOnBannerClickListener(new Banner.b(objectRef, list, view) { // from class: com.bilibili.tgwt.square.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Ref.ObjectRef f112102a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final List f112103b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final View f112104c;

                {
                    this.f112102a = objectRef;
                    this.f112103b = list;
                    this.f112104c = view;
                }

                public final void W(Banner.BannerItem bannerItem) {
                    List list2 = this.f112103b;
                    View view2 = this.f112104c;
                    CommonCard commonCard = (CommonCard) list2.get(CollectionsKt.indexOf((List) this.f112102a.element, bannerItem));
                    Map<String, String> map = commonCard.f112024f;
                    Map<String, String> mapEmptyMap = map;
                    if (map == null) {
                        mapEmptyMap = MapsKt.emptyMap();
                    }
                    Neurons.reportClick(false, "pgc.watch-together-plaza.banner.0.click", mapEmptyMap);
                    Qj0.g.c(view2.getContext(), RouteRequestKt.toRouteRequest(commonCard.f112023e));
                }
            });
            List listTake = CollectionsKt.take(list, 6);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake, 10));
            Iterator it = listTake.iterator();
            while (it.hasNext()) {
                arrayList.add(new k((CommonCard) it.next()));
            }
            objectRef.element = arrayList;
            banner.setBannerItems(arrayList);
            if (((List) objectRef.element).size() < 2) {
                banner.setIndicatorVisible(false);
            } else {
                banner.setIndicatorVisible(true);
            }
            banner.startFlippingWithDelay(2500);
            unit = Unit.INSTANCE;
        }
        return unit;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(context).inflate(this.f112105a, viewGroup, false);
        int iB = Uj0.c.b(12, context);
        viewInflate.setPadding(iB, iB, iB, 0);
        return new a(viewInflate);
    }

    @NotNull
    public final Object viewReusingKey() {
        return CollectionsKt.listOf(new Object[]{super.viewReusingKey(), Integer.valueOf(this.f112105a)});
    }
}
