package com.bilibili.playset.channel;

import C61.k;
import I3.E1;
import UD.Y;
import Xr0.c;
import Xr0.d;
import Xr0.e;
import Xr0.g;
import Xr0.n;
import Xr0.o;
import Xr0.p;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comment3.ui.nextholderexp3.handle.CommentNextExperiment3ContentRichTextHandler;
import com.bilibili.bililive.room.ui.common.user.card.LiveQualityAnchorDescFragment;
import com.bilibili.bililive.shared.router.LiveRouterHelper;
import com.bilibili.bililive.videoliveplayer.ui.roomv3.panel.LiveOpenAnchorCardParam;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.lib.ui.BaseSwipeRefreshFragment;
import com.bilibili.magicasakura.widgets.TintProgressDialog;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.playset.api.PlaySetAppService;
import com.bilibili.playset.channel.CollectionChannelFragment;
import com.bilibili.playset.channel.CollectionChannelItem;
import com.bilibili.playset.dialog.PlaylistDetailBottomSheet;
import com.mall.ui.page.base.share.MallCommonShareDialog;
import java.util.ArrayList;
import kntr.base.localization.NumberFormat_androidKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.swiperefresh.SwipeRefreshLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/channel/CollectionChannelFragment.class */
@StabilityInferred(parameters = 0)
public final class CollectionChannelFragment extends BaseSwipeRefreshFragment {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f84152g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f84153i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Xr0.a f84155k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public TintProgressDialog f84156l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public RecyclerView f84157m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public TintTextView f84158n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public ImageView f84159o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public TextView f84160p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public TextView f84161q;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f84151f = true;

    @NotNull
    public String h = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public String f84154j = "";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final Lazy f84162r = LazyKt.lazy(new E1(6));

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final b f84163s = new b(this);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final com.bilibili.playset.playlist.helper.a f84164t = new com.bilibili.playset.playlist.helper.a(new k(this, 1));

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final Lazy f84165u = LazyKt.lazy(new Xr0.b(this, 0));

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final c f84166v = new c(this, 0);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final d f84167w = new d(this, 0);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final e f84168x = new Observer(this) { // from class: Xr0.e

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CollectionChannelFragment f28289a;

        {
            this.f28289a = this;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            CollectionChannelItem collectionChannelItem;
            Bundle bundle = (Bundle) obj;
            int i7 = bundle.getInt("key_status");
            CollectionChannelFragment collectionChannelFragment = this.f28289a;
            int i8 = 0;
            if (i7 == 0) {
                collectionChannelFragment.f84156l = TintProgressDialog.show(collectionChannelFragment.getContext(), null, collectionChannelFragment.getResources().getString(2131842520), true, false);
                return;
            }
            if (i7 == 1) {
                TintProgressDialog tintProgressDialog = collectionChannelFragment.f84156l;
                if (tintProgressDialog != null) {
                    tintProgressDialog.dismiss();
                }
                ToastHelper.showToastShort(collectionChannelFragment.getContext(), 2131841692);
                return;
            }
            if (i7 != 2) {
                return;
            }
            TintProgressDialog tintProgressDialog2 = collectionChannelFragment.f84156l;
            if (tintProgressDialog2 != null) {
                tintProgressDialog2.dismiss();
            }
            int i9 = bundle.getInt("key_data_index", -1);
            long j7 = bundle.getLong("key_data_id");
            a aVar = collectionChannelFragment.f84155k;
            if (aVar == null || (collectionChannelItem = (CollectionChannelItem) CollectionsKt.getOrNull(aVar.f28282e, i9)) == null || collectionChannelItem.getChannelId() != j7) {
                a aVar2 = collectionChannelFragment.f84155k;
                if (aVar2 != null) {
                    for (Object obj2 : (ArrayList) aVar2.f28282e) {
                        if (i8 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (((CollectionChannelItem) obj2).getChannelId() == j7) {
                            ((ArrayList) aVar2.f28282e).remove(i8);
                            if (((ArrayList) aVar2.f28282e).isEmpty()) {
                                aVar2.notifyDataSetChanged();
                            } else {
                                aVar2.notifyItemRemoved(i8);
                            }
                        }
                        i8++;
                    }
                }
            } else {
                a aVar3 = collectionChannelFragment.f84155k;
                if (aVar3 != null) {
                    ((ArrayList) aVar3.f28282e).remove(i9);
                    if (((ArrayList) aVar3.f28282e).isEmpty()) {
                        aVar3.notifyDataSetChanged();
                    } else {
                        aVar3.notifyItemRemoved(i9);
                    }
                }
            }
            a aVar4 = collectionChannelFragment.f84155k;
            if (aVar4 != null && ((ArrayList) aVar4.f28282e).isEmpty()) {
                collectionChannelFragment.kf(2131235613, 2131842626);
                return;
            }
            int i10 = collectionChannelFragment.f84153i;
            if (i10 > 0) {
                collectionChannelFragment.lf(i10 - 1);
            }
        }
    };

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/channel/CollectionChannelFragment$a.class */
    public static final class a implements PlaylistDetailBottomSheet.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CollectionChannelItem f84169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PlaylistDetailBottomSheet f84170b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CollectionChannelFragment f84171c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f84172d;

        public a(CollectionChannelItem collectionChannelItem, PlaylistDetailBottomSheet playlistDetailBottomSheet, CollectionChannelFragment collectionChannelFragment, int i7) {
            this.f84169a = collectionChannelItem;
            this.f84170b = playlistDetailBottomSheet;
            this.f84171c = collectionChannelFragment;
            this.f84172d = i7;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0081  */
        @Override // com.bilibili.playset.dialog.PlaylistDetailBottomSheet.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void h(int r9) {
            /*
                r8 = this;
                r0 = r9
                r1 = 13
                if (r0 != r1) goto Lba
                r0 = r8
                com.bilibili.playset.channel.CollectionChannelItem r0 = r0.f84169a
                r14 = r0
                r0 = r14
                if (r0 == 0) goto L46
                r0 = r14
                long r0 = r0.getChannelId()
                r10 = r0
                r0 = r14
                java.lang.String r0 = r0.getChannelName()
                r13 = r0
                java.util.HashMap r0 = new java.util.HashMap
                r1 = r0
                r2 = 2
                r1.<init>(r2)
                r12 = r0
                r0 = r12
                java.lang.String r1 = "channel_id"
                r2 = r10
                java.lang.String r2 = java.lang.Long.toString(r2)
                java.lang.Object r0 = r0.put(r1, r2)
                r0 = r12
                java.lang.String r1 = "channel_name"
                r2 = r13
                java.lang.Object r0 = r0.put(r1, r2)
                r0 = 0
                java.lang.String r1 = "main.my-favorite.channel.cancel-favorite.click"
                r2 = r12
                com.bilibili.lib.neuron.api.Neurons.reportClick(r0, r1, r2)
            L46:
                r0 = r8
                com.bilibili.playset.dialog.PlaylistDetailBottomSheet r0 = r0.f84170b
                r12 = r0
                r0 = r12
                androidx.fragment.app.FragmentActivity r0 = r0.p3()
                r13 = r0
                r0 = r13
                if (r0 == 0) goto Lba
                androidx.appcompat.app.AlertDialog$Builder r0 = new androidx.appcompat.app.AlertDialog$Builder
                r1 = r0
                r2 = r13
                r3 = 2131887243(0x7f12048b, float:1.9409088E38)
                r1.<init>(r2, r3)
                r15 = r0
                r0 = r12
                android.content.res.Resources r0 = r0.getResources()
                r16 = r0
                r0 = r14
                if (r0 == 0) goto L81
                r0 = r14
                java.lang.String r0 = r0.getChannelName()
                r13 = r0
                r0 = r13
                r12 = r0
                r0 = r13
                if (r0 != 0) goto L85
            L81:
                java.lang.String r0 = ""
                r12 = r0
            L85:
                r0 = r15
                r1 = r16
                r2 = 2131842468(0x7f1155a4, float:1.9318273E38)
                r3 = 1
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r4 = r3
                r5 = 0
                r6 = r12
                r4[r5] = r6
                java.lang.String r1 = r1.getString(r2, r3)
                androidx.appcompat.app.AlertDialog$Builder r0 = r0.setTitle(r1)
                r1 = 2131841494(0x7f1151d6, float:1.9316298E38)
                r2 = 0
                androidx.appcompat.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
                r1 = 2131841445(0x7f1151a5, float:1.9316198E38)
                Xr0.j r2 = new Xr0.j
                r3 = r2
                r4 = r8
                com.bilibili.playset.channel.CollectionChannelFragment r4 = r4.f84171c
                r5 = r8
                int r5 = r5.f84172d
                r6 = r14
                r3.<init>(r4, r5, r6)
                androidx.appcompat.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)
                androidx.appcompat.app.AlertDialog r0 = r0.show()
            Lba:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.channel.CollectionChannelFragment.a.h(int):void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/channel/CollectionChannelFragment$b.class */
    public static final class b extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CollectionChannelFragment f84173a;

        public b(CollectionChannelFragment collectionChannelFragment) {
            this.f84173a = collectionChannelFragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
            int childCount;
            if (i8 > 0 && (childCount = recyclerView.getChildCount()) > 0 && (recyclerView.getChildViewHolder(recyclerView.getChildAt(childCount - 1)) instanceof xs0.k)) {
                CollectionChannelFragment collectionChannelFragment = this.f84173a;
                if (collectionChannelFragment.f84152g || !collectionChannelFragment.f84151f) {
                    return;
                }
                collectionChannelFragment.mf();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void jf(boolean r4, com.bilibili.playset.channel.RspCollectionChannel r5) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.channel.CollectionChannelFragment.jf(boolean, com.bilibili.playset.channel.RspCollectionChannel):void");
    }

    public final void kf(int i7, int i8) {
        RecyclerView recyclerView = this.f84157m;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        TextView textView = this.f84160p;
        if (textView != null) {
            textView.setVisibility(8);
        }
        TextView textView2 = this.f84161q;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        ImageView imageView = this.f84159o;
        if (imageView != null) {
            imageView.setImageResource(i7);
        }
        ImageView imageView2 = this.f84159o;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        TintTextView tintTextView = this.f84158n;
        if (tintTextView != null) {
            tintTextView.setText(i8);
        }
        TintTextView tintTextView2 = this.f84158n;
        if (tintTextView2 != null) {
            tintTextView2.setVisibility(0);
        }
    }

    public final void lf(int i7) {
        this.f84153i = i7;
        TextView textView = this.f84160p;
        if (textView != null) {
            textView.setVisibility(0);
        }
        TextView textView2 = this.f84160p;
        if (textView2 != null) {
            Resources resources = getResources();
            int i8 = this.f84153i;
            textView2.setText(resources.getQuantityString(2131689619, i8, NumberFormat_androidKt.format$default(Integer.valueOf(i8), (String) null, 0, 3, (Object) null)));
        }
    }

    public final void mf() {
        this.f84152g = true;
        p pVarNf = nf();
        String str = this.h;
        ((MutableLiveData) pVarNf.f28311b.getValue()).setValue(TuplesKt.to(0, (Object) null));
        ((PlaySetAppService) ServiceGenerator.createService(PlaySetAppService.class)).getChannels(20, str).enqueue(new o(pVarNf));
    }

    public final p nf() {
        return (p) this.f84165u.getValue();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [Xr0.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [Xr0.h] */
    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.f84155k = new Xr0.a(new Object(), new g(this, 0), new View.OnClickListener(this, 0) { // from class: Xr0.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f28292a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f28293b;

            {
                this.f28292a = i;
                this.f28293b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (this.f28292a) {
                    case 0:
                        ((CollectionChannelFragment) this.f28293b).mf();
                        break;
                    case 1:
                        ((MallCommonShareDialog) this.f28293b).jf(2);
                        break;
                    default:
                        com.bilibili.app.comm.supermenu.core.a aVar = (com.bilibili.app.comm.supermenu.core.a) this.f28293b;
                        if (!TextUtils.isEmpty(aVar.q)) {
                            BLRouter.routeTo(new RouteRequest.Builder(aVar.q).build(), aVar.getContext());
                        } else {
                            aVar.dismiss();
                        }
                        break;
                }
            }
        });
        ((MutableLiveData) nf().f28310a.getValue()).observe(this, this.f84166v);
        ((MutableLiveData) nf().f28311b.getValue()).observe(this, this.f84167w);
        ((MutableLiveData) nf().f28312c.getValue()).observe(this, this.f84168x);
    }

    @Override // com.bilibili.lib.ui.BaseSwipeRefreshFragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable SwipeRefreshLayout swipeRefreshLayout, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131499697, (ViewGroup) swipeRefreshLayout, false);
    }

    @Override // com.bilibili.lib.ui.BaseSwipeRefreshFragment
    public final void onRefresh() {
        super.onRefresh();
        com.bilibili.playset.playlist.helper.a aVar = this.f84164t;
        aVar.f85322b = -1;
        aVar.f85323c = -1;
        p pVarNf = nf();
        ((MutableLiveData) pVarNf.f28310a.getValue()).setValue(TuplesKt.to(0, (Object) null));
        ((PlaySetAppService) ServiceGenerator.createService(PlaySetAppService.class)).getChannels(20, "").enqueue(new n(pVarNf));
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Xr0.a aVar = this.f84155k;
        if (aVar == null || !((ArrayList) aVar.f28282e).isEmpty()) {
            return;
        }
        setRefreshStart();
        onRefresh();
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f84157m = (RecyclerView) view.findViewById(2131306595);
        this.f84158n = (TintTextView) view.findViewById(2131310613);
        this.f84159o = (ImageView) view.findViewById(2131304541);
        this.f84160p = (TextView) view.findViewById(2131315425);
        TextView textView = (TextView) view.findViewById(2131314850);
        this.f84161q = textView;
        if (textView != null) {
            final int i7 = 0;
            textView.setOnClickListener(new View.OnClickListener(this, i7) { // from class: Xr0.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f28294a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f28295b;

                {
                    this.f28294a = i7;
                    this.f28295b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (this.f28294a) {
                        case 0:
                            CollectionChannelFragment collectionChannelFragment = (CollectionChannelFragment) this.f28295b;
                            if (!StringsKt.isBlank(collectionChannelFragment.f84154j)) {
                                BLRouter.routeTo(RouteRequestKt.toRouteRequest(collectionChannelFragment.f84154j), collectionChannelFragment);
                            }
                            break;
                        case 1:
                            Y y6 = ((CommentNextExperiment3ContentRichTextHandler) this.f28295b).b;
                            if (y6 != null) {
                                y6.invoke(view2.getContext());
                            }
                            break;
                        default:
                            LiveQualityAnchorDescFragment liveQualityAnchorDescFragment = (LiveQualityAnchorDescFragment) this.f28295b;
                            LiveQualityAnchorDescFragment.a aVar = LiveQualityAnchorDescFragment.f;
                            liveQualityAnchorDescFragment.dismissAllowingStateLoss();
                            LiveOpenAnchorCardParam liveOpenAnchorCardParam = new LiveOpenAnchorCardParam();
                            Bundle arguments = liveQualityAnchorDescFragment.getArguments();
                            liveOpenAnchorCardParam.setUid(arguments != null ? arguments.getLong("live:anchorId") : 0L);
                            LiveRouterHelper.openRoomAnchorCard(liveOpenAnchorCardParam);
                            break;
                    }
                }
            });
        }
        RecyclerView recyclerView = this.f84157m;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        RecyclerView recyclerView2 = this.f84157m;
        if (recyclerView2 != null) {
            recyclerView2.addOnScrollListener(this.f84163s);
        }
        RecyclerView recyclerView3 = this.f84157m;
        if (recyclerView3 != null) {
            recyclerView3.addOnScrollListener(this.f84164t);
        }
        RecyclerView recyclerView4 = this.f84157m;
        if (recyclerView4 != null) {
            recyclerView4.setAdapter(this.f84155k);
        }
        int i8 = this.f84153i;
        if (i8 > 0) {
            lf(i8);
        }
    }
}
