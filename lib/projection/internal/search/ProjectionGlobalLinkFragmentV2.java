package com.bilibili.lib.projection.internal.search;

import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.bilibili.base.BiliContext;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.droid.ScreenUtil;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.projection.internal.base.BaseProjectionDialogFragment;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.engine.DefaultProjectionEngineManager;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem;
import com.bilibili.lib.projection.internal.search.ProjectionGlobalLinkFragmentV2;
import com.bilibili.magicasakura.widgets.Tintable;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.xpref.Xpref;
import ge0.InterfaceC7274d;
import he0.C7433b;
import ie0.C7564c;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.RangesKt;
import le0.C7838f;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/ProjectionGlobalLinkFragmentV2.class */
public final class ProjectionGlobalLinkFragmentV2 extends BaseProjectionDialogFragment implements IPvTracker, Tintable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C5322a f63553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final K f63554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f63555f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public b f63556g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public InterfaceC7845m f63557i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final CompositeDisposable f63558j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f63559k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public View f63560l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final ArrayList<Boolean> f63561m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final C5324c f63562n;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/ProjectionGlobalLinkFragmentV2$a.class */
    public static final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f63563d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final TextView f63564a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final View f63565b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final TextView f63566c;

        public a(@NotNull View view) {
            super(view);
            this.f63564a = (TextView) view.findViewById(2131316285);
            this.f63565b = view.findViewById(2131316283);
            this.f63566c = (TextView) view.findViewById(2131316284);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/ProjectionGlobalLinkFragmentV2$b.class */
    public final class b extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public List<InterfaceC7274d> f63567a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ProjectionGlobalLinkFragmentV2 f63568b;

        public b(ProjectionGlobalLinkFragmentV2 projectionGlobalLinkFragmentV2) {
            this.f63568b = projectionGlobalLinkFragmentV2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f63567a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i7) {
            return 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i7) {
            if (viewHolder instanceof a) {
                InterfaceC7274d interfaceC7274d = this.f63567a.get(i7);
                ProjectionDeviceInternal projectionDeviceInternal = interfaceC7274d instanceof ProjectionDeviceInternal ? (ProjectionDeviceInternal) interfaceC7274d : null;
                if (projectionDeviceInternal == null) {
                    return;
                }
                a aVar = (a) viewHolder;
                aVar.f63564a.setText(Ie0.d.d(projectionDeviceInternal));
                final ProjectionDeviceInternal projectionDeviceInternal2 = projectionDeviceInternal;
                aVar.f63566c.setOnClickListener(new View.OnClickListener(projectionDeviceInternal2, this) { // from class: com.bilibili.lib.projection.internal.search.f

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final ProjectionDeviceInternal f63722a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final ProjectionGlobalLinkFragmentV2.b f63723b;

                    {
                        this.f63722a = projectionDeviceInternal2;
                        this.f63723b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Application application;
                        ProjectionDeviceInternal projectionDeviceInternal3 = this.f63722a;
                        ProjectionGlobalLinkFragmentV2.b bVar = this.f63723b;
                        com.bilibili.lib.projection.internal.reporter.a aVar2 = C7564c.f121634k;
                        aVar2.v(projectionDeviceInternal3, 2, 2);
                        bVar.getClass();
                        if (Ie0.d.k() && (application = BiliContext.application()) != null) {
                            SharedPreferences sharedPreferences = Xpref.getSharedPreferences(application, "pref_projection");
                            if (!sharedPreferences.getBoolean("pref_projection_global_link_first_connect_device", false)) {
                                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                                editorEdit.putBoolean("pref_projection_global_link_first_connect_device", true);
                                editorEdit.apply();
                            }
                        }
                        ProjectionGlobalLinkFragmentV2 projectionGlobalLinkFragmentV2 = bVar.f63568b;
                        projectionGlobalLinkFragmentV2.getClass();
                        BLog.i("ProjectionTrack", "select device by user device = " + projectionDeviceInternal3);
                        C7564c.f121640q.j(projectionGlobalLinkFragmentV2.f63555f, projectionDeviceInternal3);
                        K k7 = projectionGlobalLinkFragmentV2.f63554e;
                        String strD = Ie0.d.d(projectionDeviceInternal3);
                        TextView textView = k7.f63548i;
                        if (textView != null) {
                            textView.setText(strD);
                        }
                        projectionGlobalLinkFragmentV2.f63554e.a(PageState.CONNECTED, false);
                        InterfaceC7845m interfaceC7845m = projectionGlobalLinkFragmentV2.f63557i;
                        ProjectionDeviceInternal projectionDeviceInternal4 = null;
                        IProjectionItem iProjectionItemN = interfaceC7845m != null ? interfaceC7845m.n(false) : null;
                        StandardProjectionItem standardProjectionItem = iProjectionItemN instanceof StandardProjectionItem ? (StandardProjectionItem) iProjectionItemN : null;
                        ProjectionDeviceInternal projectionDeviceInternalJf = projectionGlobalLinkFragmentV2.jf();
                        if (projectionDeviceInternalJf != null) {
                            projectionDeviceInternal4 = projectionDeviceInternalJf;
                        }
                        aVar2.z(standardProjectionItem, projectionDeviceInternal4, 3);
                    }
                });
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i7) {
            int i8 = a.f63563d;
            return new a(p.a(viewGroup, 2131499769, viewGroup, false));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/ProjectionGlobalLinkFragmentV2$c.class */
    public static final class c extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FragmentActivity f63569a;

        public c(FragmentActivity fragmentActivity) {
            this.f63569a = fragmentActivity;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int iCoerceAtLeast = RangesKt.coerceAtLeast(0, (recyclerView.getMeasuredWidth() - ScreenUtil.dip2px(this.f63569a, 320.0f)) / 2);
            if (childAdapterPosition == 0) {
                rect.left = iCoerceAtLeast;
            } else if (childAdapterPosition == state.getItemCount() - 1) {
                rect.right = iCoerceAtLeast;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bilibili.lib.projection.internal.search.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.bilibili.lib.projection.internal.search.K, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.bilibili.lib.projection.internal.search.c] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.bilibili.lib.projection.internal.widget.a, java.lang.Object] */
    public ProjectionGlobalLinkFragmentV2() {
        ?? obj = new Object();
        PageState pageState = PageState.DEFAULT;
        obj.f63715k = pageState;
        this.f63553d = obj;
        ?? obj2 = new Object();
        obj2.f63551l = new Object();
        obj2.f63552m = pageState;
        this.f63554e = obj2;
        this.f63558j = new CompositeDisposable();
        Boolean bool = Boolean.FALSE;
        this.f63561m = CollectionsKt.arrayListOf(new Boolean[]{bool, bool, bool});
        this.f63562n = new ConnectivityMonitor.OnNetworkChangedListener(this) { // from class: com.bilibili.lib.projection.internal.search.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ProjectionGlobalLinkFragmentV2 f63718a;

            {
                this.f63718a = this;
            }

            public final void onChanged(int i7) {
                List<InterfaceC7274d> list;
                List<InterfaceC7274d> list2;
                T7.a.a(i7, "current network -> ", "ProjectionGlobalLinkFragmentV2");
                ProjectionGlobalLinkFragmentV2 projectionGlobalLinkFragmentV2 = this.f63718a;
                ProjectionGlobalLinkFragmentV2.b bVar = projectionGlobalLinkFragmentV2.f63556g;
                int size = (bVar == null || (list2 = bVar.f63567a) == null) ? 0 : list2.size();
                ProjectionGlobalLinkFragmentV2.b bVar2 = projectionGlobalLinkFragmentV2.f63556g;
                if (bVar2 != null && (list = bVar2.f63567a) != null) {
                    list.clear();
                }
                ProjectionGlobalLinkFragmentV2.b bVar3 = projectionGlobalLinkFragmentV2.f63556g;
                if (bVar3 != null) {
                    bVar3.notifyItemRangeChanged(0, size);
                }
            }
        };
    }

    @Override // com.bilibili.lib.projection.internal.base.BaseProjectionDialogFragment
    public final int getDialogViewRes() {
        Resources resources;
        Configuration configuration;
        Context context = getContext();
        return (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null || (configuration.screenLayout & 15) < 3) ? 2131497860 : 2131503005;
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "player.throwing-screen-devicelist.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        Bundle bundle = new Bundle();
        List<Float> list = C7433b.f120827a;
        int i7 = this.h;
        int i8 = 2;
        if (i7 != 1) {
            i8 = i7 != 2 ? 1 : 3;
        }
        bundle.putString("type", String.valueOf(i8));
        bundle.putString("platform", "0");
        return bundle;
    }

    @Override // com.bilibili.lib.projection.internal.base.BaseProjectionDialogFragment
    public final float hf() {
        return 0.5f;
    }

    @Override // com.bilibili.lib.projection.internal.base.BaseProjectionDialogFragment
    public final void initSavedData() {
        this.f63012c = true;
    }

    @Override // com.bilibili.lib.projection.internal.base.BaseProjectionDialogFragment
    public final void initView(@NotNull View view) {
        TextView textView;
        TextView textView2;
        this.f63560l = view;
        C5322a c5322a = this.f63553d;
        c5322a.getClass();
        c5322a.f63715k = PageState.DEFAULT;
        c5322a.f63706a = (ImageView) view.findViewById(2131305085);
        c5322a.f63707b = (Group) view.findViewById(2131305086);
        c5322a.f63708c = (Group) view.findViewById(2131303779);
        c5322a.f63709d = (ImageView) view.findViewById(2131305087);
        TextView textView3 = (TextView) view.findViewById(2131305113);
        if (textView3 != null) {
            textView3.setOnClickListener(new QS0.d(c5322a, 2));
        }
        c5322a.f63710e = (TextView) view.findViewById(2131303781);
        c5322a.f63711f = (TextView) view.findViewById(2131303778);
        c5322a.f63712g = (TextView) view.findViewById(2131303777);
        c5322a.h = view.findViewById(2131303773);
        c5322a.f63713i = (TextView) view.findViewById(2131305119);
        c5322a.f63714j = (TextView) view.findViewById(2131305118);
        DeviceDecision deviceDecision = DeviceDecision.INSTANCE;
        String strDd = deviceDecision.dd("cast.bilian_danmaku_guide_title", (String) null);
        if (strDd != null && strDd.length() != 0 && (textView2 = c5322a.f63713i) != null) {
            textView2.setText(strDd);
        }
        String strDd2 = deviceDecision.dd("cast.bilian_danmaku_guide_subtitle", (String) null);
        if (strDd2 != null && strDd2.length() != 0 && (textView = c5322a.f63714j) != null) {
            textView.setText(strDd2);
        }
        View.OnClickListener jVar = new QS0.j(1, this);
        ImageView imageView = c5322a.f63709d;
        if (imageView != null) {
            imageView.setOnClickListener(jVar);
        }
        boolean z6 = true;
        final boolean z7 = true;
        View.OnClickListener onClickListener = new View.OnClickListener(z7, this) { // from class: com.bilibili.lib.projection.internal.search.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f63720a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ProjectionGlobalLinkFragmentV2 f63721b;

            {
                this.f63720a = z7;
                this.f63721b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                boolean z8 = this.f63720a;
                ProjectionGlobalLinkFragmentV2 projectionGlobalLinkFragmentV2 = this.f63721b;
                if (z8) {
                    com.bilibili.lib.projection.internal.reporter.a aVar = C7564c.f121634k;
                    aVar.getClass();
                    he0.j.f120871a.b("main.global-screencast.new-user-guide.2.click", null, null, aVar.f63524a, new ze0.t(3));
                } else {
                    com.bilibili.lib.projection.internal.reporter.a aVar2 = C7564c.f121634k;
                    ProjectionDeviceInternal projectionDeviceInternalJf = projectionGlobalLinkFragmentV2.jf();
                    if (projectionDeviceInternalJf == null) {
                        projectionDeviceInternalJf = null;
                    }
                    aVar2.v(projectionDeviceInternalJf, 1, 4);
                }
                BLRouter.routeTo(RouteRequestKt.toRouteRequest("https://www.bilibili.com/blackboard/activity-KYPf00wj89.html"), projectionGlobalLinkFragmentV2);
            }
        };
        TextView textView4 = c5322a.f63710e;
        if (textView4 != null) {
            textView4.setOnClickListener(onClickListener);
        }
        K k7 = this.f63554e;
        k7.getClass();
        k7.f63552m = PageState.DEFAULT;
        k7.f63541a = (Group) view.findViewById(2131305098);
        k7.f63542b = (Group) view.findViewById(2131305094);
        k7.f63543c = (Group) view.findViewById(2131305093);
        k7.f63544d = (ImageView) view.findViewById(2131305108);
        k7.f63545e = (TextView) view.findViewById(2131305111);
        k7.f63546f = (TextView) view.findViewById(2131305105);
        k7.f63547g = (TextView) view.findViewById(2131305109);
        k7.h = (TextView) view.findViewById(2131305092);
        k7.f63548i = (TextView) view.findViewById(2131305103);
        k7.f63549j = (RecyclerView) view.findViewById(2131305097);
        k7.f63550k = (LinearLayout) view.findViewById(2131305100);
        new LinearSnapHelper().attachToRecyclerView(k7.f63549j);
        com.bilibili.lib.projection.internal.widget.a aVar = k7.f63551l;
        aVar.getClass();
        aVar.f63862a = view.findViewById(2131305095);
        aVar.f63863b = (LottieAnimationView) view.findViewById(2131305104);
        aVar.f63864c = (TextView) view.findViewById(2131305103);
        aVar.f63865d = (TextView) view.findViewById(2131305102);
        aVar.f63866e = (TextView) view.findViewById(2131305105);
        aVar.f63868g = (TextView) view.findViewById(2131305109);
        aVar.h = (TextView) view.findViewById(2131305092);
        aVar.f63867f = (TextView) view.findViewById(2131305096);
        Context context = view.getContext();
        aVar.getClass();
        aVar.f63869i = AnimationUtils.loadAnimation(context, 2130772306);
        aVar.f63871k = AnimationUtils.loadAnimation(context, 2130772310);
        aVar.f63870j = AnimationUtils.loadAnimation(context, 2130772309);
        View.OnClickListener jVar2 = new QS0.j(1, this);
        ImageView imageView2 = k7.f63544d;
        if (imageView2 != null) {
            imageView2.setOnClickListener(jVar2);
        }
        final boolean z8 = false;
        View.OnClickListener onClickListener2 = new View.OnClickListener(z8, this) { // from class: com.bilibili.lib.projection.internal.search.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f63720a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ProjectionGlobalLinkFragmentV2 f63721b;

            {
                this.f63720a = z8;
                this.f63721b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                boolean z82 = this.f63720a;
                ProjectionGlobalLinkFragmentV2 projectionGlobalLinkFragmentV2 = this.f63721b;
                if (z82) {
                    com.bilibili.lib.projection.internal.reporter.a aVar2 = C7564c.f121634k;
                    aVar2.getClass();
                    he0.j.f120871a.b("main.global-screencast.new-user-guide.2.click", null, null, aVar2.f63524a, new ze0.t(3));
                } else {
                    com.bilibili.lib.projection.internal.reporter.a aVar22 = C7564c.f121634k;
                    ProjectionDeviceInternal projectionDeviceInternalJf = projectionGlobalLinkFragmentV2.jf();
                    if (projectionDeviceInternalJf == null) {
                        projectionDeviceInternalJf = null;
                    }
                    aVar22.v(projectionDeviceInternalJf, 1, 4);
                }
                BLRouter.routeTo(RouteRequestKt.toRouteRequest("https://www.bilibili.com/blackboard/activity-KYPf00wj89.html"), projectionGlobalLinkFragmentV2);
            }
        };
        TextView textView5 = k7.f63545e;
        if (textView5 != null) {
            textView5.setOnClickListener(onClickListener2);
        }
        C5322a c5322a2 = this.f63553d;
        View.OnClickListener rVar = new XO.r(this, 2);
        TextView textView6 = c5322a2.f63712g;
        if (textView6 != null) {
            textView6.setOnClickListener(rVar);
        }
        C5322a c5322a3 = this.f63553d;
        On0.p pVar = new On0.p(this, 1);
        TextView textView7 = c5322a3.f63711f;
        if (textView7 != null) {
            textView7.setOnClickListener(pVar);
        }
        BiliImageView biliImageView = this.f63553d.h;
        if (biliImageView != null) {
            BiliImageLoader.INSTANCE.with(this).url("https://i0.hdslb.com/bfs/app/6b8783ec2a61511751ce18f722c039c8b2d9774c.png").into(biliImageView);
        }
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            b bVar = new b(this);
            this.f63556g = bVar;
            K k8 = this.f63554e;
            c cVar = new c(fragmentActivityP3);
            k8.getClass();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(fragmentActivityP3, 0, false);
            RecyclerView recyclerView = k8.f63549j;
            if (recyclerView != null) {
                recyclerView.setLayoutManager(linearLayoutManager);
            }
            RecyclerView recyclerView2 = k8.f63549j;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(bVar);
            }
            RecyclerView recyclerView3 = k8.f63549j;
            if (recyclerView3 != null) {
                recyclerView3.addItemDecoration(cVar);
            }
        }
        K k9 = this.f63554e;
        On0.q qVar = new On0.q(this, 1);
        TextView textView8 = k9.f63546f;
        if (textView8 != null) {
            textView8.setOnClickListener(qVar);
        }
        K k10 = this.f63554e;
        Jq0.h hVar = new Jq0.h(this, 2);
        LinearLayout linearLayout = k10.f63550k;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(hVar);
        }
        boolean zK = Ie0.d.k();
        Application application = BiliContext.application();
        if (application != null) {
            z6 = true ^ Xpref.getSharedPreferences(application, "pref_projection").getBoolean(zK ? "pref_projection_global_link_first_connect_device" : "pref_projection_global_link_first_click_button", false);
        }
        if (z6) {
            this.f63553d.a(PageState.SHOW, this.f63559k);
        } else {
            lf(this.f63559k);
        }
        if (this.f63559k) {
            this.f63559k = false;
        }
    }

    public final ProjectionDeviceInternal jf() {
        C7838f.a aVarI;
        InterfaceC7845m interfaceC7845mH = C7564c.f121625a.h(this.f63555f);
        return (interfaceC7845mH == null || (aVarI = interfaceC7845mH.i()) == null) ? null : aVarI.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void kf(java.lang.String r6, java.util.List r7, boolean r8) {
        /*
            Method dump skipped, instruction units count: 598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.search.ProjectionGlobalLinkFragmentV2.kf(java.lang.String, java.util.List, boolean):void");
    }

    public final void lf(boolean z6) {
        this.f63553d.a(PageState.DISMISS, z6);
        this.f63554e.a(PageState.SHOW, z6);
        if (!ConnectivityMonitor.getInstance().hasListener(this.f63562n)) {
            ConnectivityMonitor.getInstance().register(this.f63562n);
        }
        CompositeDisposable compositeDisposable = this.f63558j;
        DefaultProjectionEngineManager defaultProjectionEngineManager = C7564c.f121640q;
        compositeDisposable.add(defaultProjectionEngineManager.v().subscribe(new C5328g(this)));
        this.f63558j.add(defaultProjectionEngineManager.f63102c.subscribe(new C5329h(this)));
        defaultProjectionEngineManager.M(this.f63555f);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NotNull Configuration configuration) {
        final Window window;
        super.onConfigurationChanged(configuration);
        this.f63559k = true;
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        View viewInflate = LayoutInflater.from(window.getContext()).inflate(getDialogViewRes(), (ViewGroup) null);
        window.setContentView(viewInflate);
        this.f63558j.clear();
        initView(viewInflate);
        viewInflate.post(new Runnable(window) { // from class: com.bilibili.lib.projection.internal.search.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Window f63719a;

            {
                this.f63719a = window;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Window window2 = this.f63719a;
                WindowManager.LayoutParams attributes = window2.getAttributes();
                attributes.gravity = 80;
                attributes.width = -1;
                attributes.height = -2;
                window2.setAttributes(attributes);
            }
        });
    }

    @Override // com.bilibili.lib.projection.internal.base.BaseProjectionDialogFragment, androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        IProjectionItem iProjectionItemN;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        int i7 = arguments != null ? arguments.getInt("key_client_id") : 0;
        this.f63555f = i7;
        InterfaceC7845m interfaceC7845mH = C7564c.f121625a.h(i7);
        this.f63557i = interfaceC7845mH;
        this.h = (interfaceC7845mH == null || (iProjectionItemN = interfaceC7845mH.n(false)) == null) ? 1 : iProjectionItemN.getClientType();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ConnectivityMonitor.getInstance().unregister(this.f63562n);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NotNull DialogInterface dialogInterface) {
        this.f63558j.clear();
        synchronized (this.f63561m) {
            ArrayList<Boolean> arrayList = this.f63561m;
            Boolean bool = Boolean.FALSE;
            arrayList.set(0, bool);
            this.f63561m.set(1, bool);
            this.f63561m.set(2, bool);
            Unit unit = Unit.INSTANCE;
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Dialog dialog = getDialog();
        if (dialog == null) {
            return;
        }
        Window window = dialog.getWindow();
        if (window != null) {
            window.setWindowAnimations(2131887292);
        }
        WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
        if (attributes != null) {
            attributes.gravity = 80;
        }
        if (attributes != null) {
            attributes.width = -1;
        }
        if (window != null) {
            window.setAttributes(attributes);
        }
        super.onStart();
    }

    @Override // com.bilibili.magicasakura.widgets.Tintable
    public final void tint() {
    }
}
