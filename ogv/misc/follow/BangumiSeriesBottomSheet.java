package com.bilibili.ogv.misc.follow;

import Mn.v;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.ogv.community.bean.BangumiFollowStatus;
import com.bilibili.ogv.community.k;
import com.bilibili.ogv.misc.follow.BangumiSeriesBottomSheet;
import com.bilibili.ogv.misc.follow.api.entity.SeriesItem;
import com.bilibili.pegasus.channelv3.feed.inline.f;
import com.bilibili.upper.module.contribute.up.ui.F1;
import com.google.android.material.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pk0.C8311f;
import pk0.C8312g;
import pk0.C8315j;
import qk0.ViewOnClickListenerC8443B;
import rk0.C8529a;
import tk0.c;
import tv.danmaku.bili.widget.LoadingImageView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/BangumiSeriesBottomSheet.class */
@StabilityInferred(parameters = 0)
public final class BangumiSeriesBottomSheet extends BottomSheetDialogFragment implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public C8315j f69048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public TextView f69049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public TextView f69050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public LoadingImageView f69051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public RecyclerView f69052f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f69053g;

    @Nullable
    public List<SeriesItem> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public a f69054i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public F1 f69055j;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/BangumiSeriesBottomSheet$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f69056b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final BangumiSeriesBottomSheet f69057c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final List<SeriesItem> f69058d = new ArrayList();

        public a(int i7, @NotNull BangumiSeriesBottomSheet bangumiSeriesBottomSheet) {
            this.f69056b = i7;
            this.f69057c = bangumiSeriesBottomSheet;
        }

        @Override // tk0.d.a
        public final void A() {
            this.f127530a.a(((ArrayList) this.f69058d).size(), 100, -1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:123:0x04d4  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x0526  */
        @Override // tk0.AbstractC8668a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void N(int r10, @org.jetbrains.annotations.Nullable androidx.recyclerview.widget.RecyclerView.ViewHolder r11) {
            /*
                Method dump skipped, instruction units count: 1581
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.misc.follow.BangumiSeriesBottomSheet.a.N(int, androidx.recyclerview.widget.RecyclerView$ViewHolder):void");
        }

        @Override // tk0.AbstractC8668a
        @NotNull
        public final RecyclerView.ViewHolder O(int i7, @Nullable ViewGroup viewGroup) {
            int i8 = ViewOnClickListenerC8443B.f126032x;
            return new ViewOnClickListenerC8443B(LayoutInflater.from(viewGroup != null ? viewGroup.getContext() : null).inflate(2131493174, viewGroup, false), this.f69056b, this.f69057c);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/BangumiSeriesBottomSheet$b.class */
    public static final class b extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BottomSheetBehavior<View> f69059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BangumiSeriesBottomSheet f69060b;

        public b(BottomSheetBehavior<View> bottomSheetBehavior, BangumiSeriesBottomSheet bangumiSeriesBottomSheet) {
            this.f69059a = bottomSheetBehavior;
            this.f69060b = bangumiSeriesBottomSheet;
        }

        public final void onSlide(View view, float f7) {
        }

        public final void onStateChanged(View view, int i7) {
            if (i7 == 4) {
                this.f69059a.setState(5);
            } else {
                if (i7 != 5) {
                    return;
                }
                this.f69060b.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<kotlin.Pair<java.lang.Integer, com.bilibili.ogv.misc.follow.api.entity.SeriesItem>> hf(long r7) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.misc.follow.BangumiSeriesBottomSheet.hf(long):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onActivityCreated(@Nullable Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        Window window;
        super/*androidx.fragment.app.DialogFragment*/.onActivityCreated(bundle);
        Context contextRequireContext = requireContext();
        int i7 = contextRequireContext.getResources().getDisplayMetrics().heightPixels;
        int iB = Uj0.c.b(60.0f, contextRequireContext);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setGravity(80);
        }
        Dialog dialog2 = getDialog();
        BottomSheetBehavior bottomSheetBehaviorFrom = null;
        View viewFindViewById = dialog2 != null ? dialog2.findViewById(R.id.design_bottom_sheet) : null;
        if (viewFindViewById != null && (layoutParams = viewFindViewById.getLayoutParams()) != null) {
            layoutParams.height = i7 - iB;
        }
        if (viewFindViewById != null) {
            bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewFindViewById);
        }
        if (bottomSheetBehaviorFrom != null) {
            bottomSheetBehaviorFrom.setPeekHeight(0);
        }
        if (bottomSheetBehaviorFrom != null) {
            bottomSheetBehaviorFrom.setState(3);
        }
        if (bottomSheetBehaviorFrom != null) {
            bottomSheetBehaviorFrom.setBottomSheetCallback(new b(bottomSheetBehaviorFrom, this));
        }
        View view = getView();
        if (view != null) {
            view.post(new v(view, 3));
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        if (Intrinsics.areEqual(view, this.f69050d)) {
            String str = this.f69053g == 1 ? "pgc.my-bangumi.series-list.close.click" : "pgc.my-favorite-cinema.series-list.close.click";
            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
            mapCreateMapBuilder.put("season_id", null);
            Unit unit = Unit.INSTANCE;
            Neurons.reportClick(false, str, MapsKt.build(mapCreateMapBuilder));
            F1 f12 = this.f69055j;
            if (f12 != null) {
                f12.onClick(view);
            }
            dismissAllowingStateLoss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(@Nullable Bundle bundle) {
        MutableLiveData<Pair<Integer, BangumiFollowStatus>> mutableLiveData;
        MutableLiveData<List<SeriesItem>> mutableLiveData2;
        super/*androidx.fragment.app.DialogFragment*/.onCreate(bundle);
        this.f69048b = (C8315j) new ViewModelProvider(this).get(C8315j.class);
        Bundle arguments = getArguments();
        int i7 = arguments != null ? arguments.getInt("type") : 0;
        this.f69053g = i7;
        this.f69054i = new a(i7, this);
        com.bilibili.okretro.call.rxjava.c.a(k.f67553c.subscribe(new Consumer(this) { // from class: pk0.r

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BangumiSeriesBottomSheet f125450a;

            {
                this.f125450a = this;
            }

            public final void accept(Object obj) {
                BangumiSeriesBottomSheet.a aVar;
                BangumiFollowStatus bangumiFollowStatus = (BangumiFollowStatus) obj;
                long j7 = bangumiFollowStatus.h;
                BangumiSeriesBottomSheet bangumiSeriesBottomSheet = this.f125450a;
                Iterator<T> it = bangumiSeriesBottomSheet.hf(j7).iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    int iIntValue = ((Number) pair.getFirst()).intValue();
                    SeriesItem seriesItem = (SeriesItem) pair.getSecond();
                    if (seriesItem == null) {
                        return;
                    }
                    seriesItem.F(bangumiFollowStatus.f67509g);
                    if (iIntValue != -1 && (aVar = bangumiSeriesBottomSheet.f69054i) != null) {
                        aVar.notifyItemChanged(iIntValue);
                    }
                }
            }
        }, Functions.f, Functions.c), getLifecycle());
        C8315j c8315j = this.f69048b;
        if (c8315j != null && (mutableLiveData2 = c8315j.f125429c) != null) {
            mutableLiveData2.observe(this, new Observer(this) { // from class: pk0.s

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BangumiSeriesBottomSheet f125451a;

                {
                    this.f125451a = this;
                }

                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    List<SeriesItem> list = (List) obj;
                    BangumiSeriesBottomSheet bangumiSeriesBottomSheet = this.f125451a;
                    if (list == null || list.isEmpty()) {
                        LoadingImageView loadingImageView = bangumiSeriesBottomSheet.f69051e;
                        if (loadingImageView != null) {
                            loadingImageView.setVisibility(0);
                            LoadingImageView loadingImageView2 = bangumiSeriesBottomSheet.f69051e;
                            if (loadingImageView2 != null) {
                                loadingImageView2.setRefreshError();
                            }
                        }
                    } else {
                        LoadingImageView loadingImageView3 = bangumiSeriesBottomSheet.f69051e;
                        if (loadingImageView3 != null) {
                            loadingImageView3.setRefreshComplete();
                            LoadingImageView loadingImageView4 = bangumiSeriesBottomSheet.f69051e;
                            if (loadingImageView4 != null) {
                                loadingImageView4.setVisibility(8);
                            }
                        }
                    }
                    bangumiSeriesBottomSheet.h = list;
                    BangumiSeriesBottomSheet.a aVar = bangumiSeriesBottomSheet.f69054i;
                    if (aVar != null) {
                        if (list != null) {
                            for (SeriesItem seriesItem : list) {
                                if (seriesItem != null) {
                                    seriesItem.f69158u = true;
                                }
                                ((ArrayList) aVar.f69058d).add(seriesItem);
                            }
                        }
                        aVar.f127530a.b();
                        aVar.notifyDataSetChanged();
                    }
                }
            });
        }
        C8315j c8315j2 = this.f69048b;
        if (c8315j2 == null || (mutableLiveData = c8315j2.f125430d) == null) {
            return;
        }
        mutableLiveData.observe(this, new f(this, 1));
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131493141, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDestroy() {
        super/*com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment*/.onDestroy();
        C8315j c8315j = this.f69048b;
        if (c8315j != null) {
            c8315j.f125427a.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        this.f69049c = (TextView) view.findViewById(2131310619);
        this.f69050d = (TextView) view.findViewById(2131309705);
        this.f69052f = (RecyclerView) view.findViewById(2131306595);
        this.f69051e = view.findViewById(2131303590);
        TextView textView = this.f69050d;
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        TextView textView2 = this.f69049c;
        if (textView2 != null) {
            Context context = getContext();
            textView2.setText(context != null ? context.getString(2131821899) : null);
        }
        RecyclerView recyclerView = this.f69052f;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        RecyclerView recyclerView2 = this.f69052f;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.f69054i);
        }
        a aVar = this.f69054i;
        if (aVar != null) {
            aVar.f127530a.b();
            aVar.notifyDataSetChanged();
        }
        LoadingImageView loadingImageView = this.f69051e;
        if (loadingImageView != null) {
            loadingImageView.setVisibility(0);
            LoadingImageView loadingImageView2 = this.f69051e;
            if (loadingImageView2 != null) {
                loadingImageView2.setRefreshing();
            }
        }
        C8315j c8315j = this.f69048b;
        if (c8315j != null) {
            int i7 = this.f69053g;
            c8315j.f125428b.getClass();
            c8315j.f125427a.add(C8529a.a().getSeriesInfo(com.bilibili.ogv.infra.account.a.f67852b.getAccessKey(), i7).subscribe(new C8311f(c8315j), new C8312g(c8315j)));
        }
        String str = this.f69053g == 1 ? "pgc.my-bangumi.series-list.0.show" : "pgc.my-favorite-cinema.series-list.0.show";
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("season_id", null);
        Unit unit = Unit.INSTANCE;
        Neurons.reportExposure$default(false, str, MapsKt.build(mapCreateMapBuilder), (List) null, 8, (Object) null);
    }
}
