package com.bilibili.upper.module.manuscript.fragment;

import Bs.o;
import Xz0.j;
import Xz0.k;
import YN0.N;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.lib.infoeyes.InfoEyesManager;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.lib.ui.mixin.Flag;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.pvtracker.PageViewTracker;
import com.bilibili.studio.kaleidoscope.adapter.KaleidoscopeFactory;
import com.bilibili.upper.api.bean.manuscript.ArcAudit;
import com.bilibili.upper.api.bean.manuscript.ArchivePre;
import com.bilibili.upper.api.bean.manuscript.VideoEditItem;
import com.bilibili.upper.api.bean.manuscript.VideoItem;
import com.bilibili.upper.api.service.UpperVerifyCodeApiService;
import com.bilibili.upper.module.contribute.up.ui.collections.api.PublishCollectionChapterApiService;
import com.bilibili.upper.module.manuscript.fragment.ManuscriptsListFragment;
import com.bilibili.upper.module.manuscript.model.ArchiveAppealViewModel;
import com.bilibili.upper.module.manuscript.vm.ManuscriptListViewModel;
import com.bilibili.upper.widget.CheckableAdapter;
import com.bilibili.upper.widget.ClockInTipView;
import com.bilibili.upper.widget.PageTipView;
import com.bilibili.upper.widget.text.UpperCommonEditText;
import com.mall.ui.page.home.view.u0;
import com.mall.ui.page.home.view.v0;
import com.squareup.otto.Subscribe;
import eJ0.C6931i;
import eJ0.t;
import fI0.C7042a;
import gI0.C7264n;
import gI0.K;
import gI0.w;
import iI0.C7550l;
import iI0.C7551m;
import iI0.C7552n;
import iI0.C7553o;
import iI0.C7554p;
import iI0.C7555q;
import iI0.C7556r;
import iI0.C7558t;
import jJ0.C7652a;
import jJ0.C7653b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.collections.MapsKt;
import lI0.InterfaceC7820a;
import nI0.n;
import rI0.ViewOnClickListenerC8516b;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.utils.DpUtils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/fragment/ManuscriptsListFragment.class */
public class ManuscriptsListFragment extends BaseFragment implements LF0.e, View.OnClickListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ImageView f113609A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ViewOnClickListenerC8516b f113610B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public UpperCommonEditText f113611C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public C7558t f113612D;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Animation f113614F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Animation f113615G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public ArchiveAppealViewModel f113616H;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ManuscriptListViewModel f113621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f113622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PageTipView f113623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ClockInTipView f113624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RecyclerView f113625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RecyclerView f113626g;
    public View h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f113630l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public GridLayoutManager f113631m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public w f113632n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List<ArcAudit> f113633o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public e f113634p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C7556r f113635q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C7551m f113636r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C7550l f113637s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public View f113639u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public SwipeRefreshLayout f113640v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f113641w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ViewGroup f113642x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ViewGroup f113643y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public TextView f113644z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f113627i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f113628j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f113629k = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f113638t = false;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public volatile boolean f113613E = true;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final List<BiliCall<?>> f113617I = new ArrayList();

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final a f113618J = new a(this);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public AlertDialog f113619K = null;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f113620L = 0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/fragment/ManuscriptsListFragment$a.class */
    public final class a implements QF0.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ManuscriptsListFragment f113645a;

        public a(ManuscriptsListFragment manuscriptsListFragment) {
            this.f113645a = manuscriptsListFragment;
        }

        @Override // QF0.e
        public final void a(@NonNull QF0.f fVar) {
            this.f113645a.refresh();
        }

        @Override // QF0.e
        public final void b(@NonNull final QF0.f fVar) {
            final ManuscriptsListFragment manuscriptsListFragment = this.f113645a;
            if (manuscriptsListFragment.getContext() == null) {
                return;
            }
            if (BiliGlobalPreferenceHelper.getInstance(manuscriptsListFragment.getContext()).optBoolean("FREE_DATA", false)) {
                if (fVar != null) {
                    fVar.start();
                }
            } else {
                if (manuscriptsListFragment.f113619K == null) {
                    manuscriptsListFragment.f113619K = new AlertDialog.Builder(manuscriptsListFragment.getContext()).setTitle(2131851264).setPositiveButton(2131851208, new DialogInterface.OnClickListener(manuscriptsListFragment, fVar) { // from class: iI0.k

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final ManuscriptsListFragment f121596a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final QF0.f f121597b;

                        {
                            this.f121596a = manuscriptsListFragment;
                            this.f121597b = fVar;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i7) {
                            ManuscriptsListFragment manuscriptsListFragment2 = this.f121596a;
                            QF0.f fVar2 = this.f121597b;
                            BiliGlobalPreferenceHelper.getInstance(manuscriptsListFragment2.getContext()).setBoolean("FREE_DATA", true);
                            manuscriptsListFragment2.f113620L = 1;
                            dialogInterface.dismiss();
                            if (fVar2 != null) {
                                fVar2.start();
                            }
                        }
                    }).setNegativeButton(2131851368, new DialogInterface.OnClickListener(manuscriptsListFragment, fVar) { // from class: iI0.h

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final ManuscriptsListFragment f121592a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final QF0.f f121593b;

                        {
                            this.f121592a = manuscriptsListFragment;
                            this.f121593b = fVar;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i7) {
                            ManuscriptsListFragment manuscriptsListFragment2 = this.f121592a;
                            QF0.f fVar2 = this.f121593b;
                            manuscriptsListFragment2.f113620L = 2;
                            dialogInterface.dismiss();
                            if (fVar2 != null) {
                                fVar2.pause();
                            }
                        }
                    }).setCancelable(false).create();
                }
                if (manuscriptsListFragment.f113620L == 0) {
                    manuscriptsListFragment.f113619K.show();
                }
            }
        }

        @Override // QF0.e
        public final void c(@NonNull QF0.f fVar) {
        }

        @Override // QF0.e
        public final void d(@NonNull QF0.f fVar) {
            this.f113645a.refresh();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/fragment/ManuscriptsListFragment$b.class */
    public final class b extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ManuscriptsListFragment f113646a;

        public b(ManuscriptsListFragment manuscriptsListFragment) {
            this.f113646a = manuscriptsListFragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
            super.getItemOffsets(rect, view, recyclerView, state);
            rect.right = Math.round(DpUtils.dp2px(this.f113646a.getContext(), 8.0f));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/fragment/ManuscriptsListFragment$c.class */
    public final class c extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ManuscriptsListFragment f113647a;

        public c(ManuscriptsListFragment manuscriptsListFragment) {
            this.f113647a = manuscriptsListFragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i7) {
            super.onScrollStateChanged(recyclerView, i7);
            if (i7 == 0) {
                ManuscriptsListFragment manuscriptsListFragment = this.f113647a;
                if (manuscriptsListFragment.f113626g.canScrollHorizontally(1)) {
                    return;
                }
                Context context = manuscriptsListFragment.getContext();
                Lazy lazy = zw0.b.f130950a;
                String str = DeviceDecision.INSTANCE.getBoolean("uper.enable_season_manager_sort", true) ? "activity://uper/collection/list/new" : "activity://uper/collection/list/";
                if (context != null) {
                    t.a(1, str, context);
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/fragment/ManuscriptsListFragment$d.class */
    public final class d implements InterfaceC7820a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ManuscriptsListFragment f113648a;

        public d(ManuscriptsListFragment manuscriptsListFragment) {
            this.f113648a = manuscriptsListFragment;
        }

        @Override // lI0.InterfaceC7820a
        public final void a(n nVar) {
            BLog.i("ManuscriptsListFragment", " (MDV) ManuscriptListFragment beforeDelete");
            ManuscriptsListFragment manuscriptsListFragment = this.f113648a;
            manuscriptsListFragment.getClass();
            BiliCall<?> encodeMobileNumber = ((UpperVerifyCodeApiService) ServiceGenerator.createService(UpperVerifyCodeApiService.class)).getEncodeMobileNumber();
            encodeMobileNumber.enqueue(new C7552n(manuscriptsListFragment, nVar));
            manuscriptsListFragment.tf(encodeMobileNumber);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/fragment/ManuscriptsListFragment$e.class */
    public final class e extends C7653b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ManuscriptsListFragment f113649b;

        public e(ManuscriptsListFragment manuscriptsListFragment) {
            this.f113649b = manuscriptsListFragment;
        }

        @Override // jJ0.C7653b
        public final void onLastItemVisible() {
            ManuscriptsListFragment manuscriptsListFragment = this.f113649b;
            if (manuscriptsListFragment.f113630l) {
                return;
            }
            manuscriptsListFragment.lf(false);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/fragment/ManuscriptsListFragment$f.class */
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f113650a;

        public f(int i7) {
            this.f113650a = i7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/fragment/ManuscriptsListFragment$g.class */
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f113651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f113652b;

        public g(long j7, int i7) {
            this.f113651a = j7;
            this.f113652b = i7;
        }
    }

    public static void jf(ManuscriptsListFragment manuscriptsListFragment) {
        manuscriptsListFragment.f113622c.setVisibility(0);
        Drawable drawable = manuscriptsListFragment.f113622c.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).stop();
        }
        manuscriptsListFragment.f113622c.setImageResource(2131236934);
        InfoEyesManager.getInstance().report2(false, "000377", new String[]{"ugc_center_contribution_null_show", "show"});
    }

    public static int kf(long j7, List list) {
        int size = list.size();
        if (size <= 0) {
            return -1;
        }
        for (int i7 = 0; i7 < size; i7++) {
            if ((((ArcAudit) list.get(i7)).archive instanceof VideoEditItem) && ((ArcAudit) list.get(i7)).archive.taskId == j7) {
                return i7;
            }
        }
        return -1;
    }

    public static int nf(int i7) {
        int i8;
        switch (i7) {
            case 0:
            case 1:
            case 4:
            case 8:
                i8 = 1000;
                break;
            case 2:
                i8 = 1002;
                break;
            case 3:
            case 9:
            case 10:
            case 11:
                i8 = 1001;
                break;
            case 5:
                i8 = 0;
                break;
            case 6:
                i8 = 1003;
                break;
            case 7:
            default:
                i8 = -1;
                break;
            case 12:
                i8 = 1004;
                break;
            case 13:
                i8 = 1005;
                break;
            case 14:
                i8 = 1006;
                break;
        }
        return i8;
    }

    @Override // LF0.e
    public final void Cb(long j7) {
        Xz0.d.f28458a.getClass();
        Xz0.d.L("start", "", "ManuscriptsListFragment", "");
        refresh();
        uf(of());
    }

    @Override // LF0.e
    public final void De(long j7) {
        Xz0.d.f28458a.getClass();
        Xz0.d.L("uploadPending", "", "ManuscriptsListFragment", "");
        refresh();
        uf(true);
    }

    @Override // LF0.e
    public final void J(long j7) {
    }

    @Override // LF0.e
    public final void Pa(long j7) {
        refresh();
    }

    @Override // LF0.e
    public final void Y3(long j7, String str, String str2) {
        Xz0.d.f28458a.getClass();
        Xz0.d.L("error", str, "ManuscriptsListFragment", str2);
        ToastHelper.showToastShort(getContext(), str);
        refresh();
        uf(of());
    }

    @Override // LF0.e
    public final void Yb(long j7) {
        Xz0.d.f28458a.getClass();
        Xz0.d.L("success", "", "ManuscriptsListFragment", "");
        uf(of());
    }

    @Override // LF0.e
    public final void a2(long j7, String str) {
        List<QF0.f> listI;
        int iKf;
        if (this.f113622c.getVisibility() != 0) {
            BLog.i("ManuscriptsListFragment", "------uploadProgress---");
            int i7 = this.f113627i;
            if ((i7 == 0 || i7 == 1) && (listI = LF0.d.j(getApplicationContext()).i()) != null) {
                ArrayList arrayList = (ArrayList) listI;
                if (arrayList.size() != 0 && this.f113632n != null) {
                    for (int i8 = 0; i8 < arrayList.size(); i8++) {
                        QF0.f fVar = (QF0.f) arrayList.get(i8);
                        if (fVar.K() != null && ((fVar.getTaskStatus() == 0 || fVar.getTaskStatus() == 4) && (iKf = kf(fVar.getTaskId(), this.f113633o)) != -1 && (((ArcAudit) ((ArrayList) this.f113633o).get(iKf)).archive instanceof VideoEditItem))) {
                            VideoEditItem videoEditItem = ((ArcAudit) ((ArrayList) this.f113633o).get(iKf)).archive;
                            ((VideoItem) videoEditItem).aid = fVar.getAvid();
                            ((VideoItem) videoEditItem).duration = fVar.getDuration();
                            videoEditItem.taskStatus = fVar.getTaskStatus();
                            videoEditItem.uploadStatus = fVar.Y();
                            videoEditItem.uploadTagStatus = fVar.G();
                            videoEditItem.progress = fVar.getProgress();
                            videoEditItem.uploadTaskId = fVar.getUploadId();
                            videoEditItem.isNewUploadTask = fVar.isNewUploadTask();
                            if (fVar.K() != null) {
                                ((VideoItem) videoEditItem).title = fVar.K().title;
                                ((VideoItem) videoEditItem).cover = fVar.K().cover;
                            }
                            videoEditItem.taskId = fVar.getTaskId();
                            int iNf = nf(fVar.getTaskStatus());
                            if (iNf != -1) {
                                if (iNf != 0) {
                                    ((VideoItem) videoEditItem).statePanel = iNf;
                                }
                                w wVar = this.f113632n;
                                long taskId = fVar.getTaskId();
                                int size = ((ArrayList) wVar.f119946a).size();
                                if (size > 0) {
                                    int i9 = 0;
                                    while (true) {
                                        if (i9 >= size) {
                                            break;
                                        }
                                        if (((ArcAudit) ((ArrayList) wVar.f119946a).get(i9)).archive != null && (((ArcAudit) ((ArrayList) wVar.f119946a).get(i9)).archive instanceof VideoEditItem) && ((ArcAudit) ((ArrayList) wVar.f119946a).get(i9)).archive.taskId == taskId) {
                                            ((ArcAudit) ((ArrayList) wVar.f119946a).get(i9)).archive = videoEditItem;
                                            wVar.notifyItemChanged(i9, NotificationCompat.CATEGORY_PROGRESS);
                                            break;
                                        }
                                        i9++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (this.f113613E) {
            uf(of());
        }
    }

    @Subscribe
    public void deleteItem(f fVar) {
        int i7;
        List<ArcAudit> list;
        if (fVar == null || (i7 = fVar.f113650a) < 0 || (list = this.f113633o) == null || i7 >= ((ArrayList) list).size()) {
            return;
        }
        ((ArrayList) this.f113633o).remove(i7);
        refresh();
        this.f113632n.W(this.f113633o);
        this.f113632n.notifyDataSetChanged();
    }

    @Override // LF0.e
    public final void f4(long j7) {
        this.f113625f.postDelayed(new YO.d(this, 1), 1500L);
    }

    @Override // LF0.e
    public final void l7(long j7) {
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void lf(boolean r12) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.manuscript.fragment.ManuscriptsListFragment.lf(boolean):void");
    }

    @Override // LF0.e
    public final void ma(long j7) {
        refresh();
        uf(true);
    }

    public final void mf() {
        RecyclerView recyclerView = this.f113625f;
        if (recyclerView != null) {
            recyclerView.postDelayed(new Runnable(this) { // from class: iI0.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ManuscriptsListFragment f121594a;

                {
                    this.f121594a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f121594a.lf(true);
                }
            }, 1500L);
        }
    }

    public final boolean of() {
        List<QF0.f> listI = LF0.d.j(getApplicationContext()).i();
        if (listI == null) {
            return true;
        }
        ArrayList<QF0.f> arrayList = (ArrayList) listI;
        if (arrayList.isEmpty()) {
            return true;
        }
        for (QF0.f fVar : arrayList) {
            if (fVar.getTaskStatus() == 4 || fVar.getTaskStatus() == 14 || fVar.getTaskStatus() == 12 || fVar.getTaskStatus() == 13) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f113633o = new ArrayList();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), 1);
        this.f113631m = gridLayoutManager;
        gridLayoutManager.setSmoothScrollbarEnabled(true);
        this.f113625f.setLayoutManager(this.f113631m);
        w wVar = new w(this.f113633o, 0);
        this.f113632n = wVar;
        wVar.f119949d = "稿件管理页";
        wVar.f119951f = new d(this);
        C7652a c7652a = new C7652a(wVar);
        c7652a.addFooterView(this.f113639u);
        this.f113625f.setAdapter(c7652a);
        e eVar = new e(this);
        this.f113634p = eVar;
        this.f113625f.addOnScrollListener(eVar);
        this.f113635q = new C7556r(this);
        this.f113637s = new C7550l(this);
        this.f113636r = new C7551m(this);
        pf();
        this.f113616H = (ArchiveAppealViewModel) new ViewModelProvider(this).get(ArchiveAppealViewModel.class);
        this.f113621b = (ManuscriptListViewModel) new ViewModelProvider(this).get(ManuscriptListViewModel.class);
        if (p3() != null) {
            this.f113616H.f113661c.observe(getViewLifecycleOwner(), new u0(1, this));
            this.f113621b.f113678c.observe(getViewLifecycleOwner(), new v0(1, this));
        }
        this.f113632n.f119952g = new com.bilibili.lib.fasthybrid.runtime.d(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v52, types: [android.view.View$OnClickListener, java.lang.Object, rI0.b] */
    /* JADX WARN: Type inference failed for: r0v62, types: [androidx.recyclerview.widget.RecyclerView$Adapter, com.bilibili.upper.widget.CheckableAdapter, gI0.K] */
    /* JADX WARN: Type inference failed for: r0v77, types: [androidx.recyclerview.widget.RecyclerView$Adapter, com.bilibili.upper.widget.CheckableAdapter, gI0.n] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id != 2131315862 && id != 2131315864) {
            if (id == 2131315867) {
                InfoEyesManager.getInstance().report2(false, "000225", new String[]{"ugc_center_contribution_search", "click"});
                j.c("sdk_type", KaleidoscopeFactory.SDK_MON);
                j.c("router_topic_id", Xz0.g.f28463b);
                tw0.f.f127691a.d(false, "creation.creation-contribution.0.search.click", j.b(k.f28475b));
                BLRouter.routeTo(new RouteRequest.Builder(Uri.parse("activity://uper//manuscript_search/")).extras(new IZ0.b(2)).build(), getContext());
                return;
            }
            return;
        }
        ViewOnClickListenerC8516b viewOnClickListenerC8516b = null;
        if (getContext() != null) {
            if (this.f113610B == null) {
                Context context = getContext();
                ViewGroup viewGroup = this.f113643y;
                List<ArchivePre.SortField> listJ0 = this.f113621b.J0();
                final ?? obj = new Object();
                View viewInflate = LayoutInflater.from(context).inflate(2131494696, (ViewGroup) null);
                RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(2131307200);
                RecyclerView recyclerView2 = (RecyclerView) viewInflate.findViewById(2131307202);
                ?? checkableAdapter = new CheckableAdapter();
                ArrayList arrayList = new ArrayList();
                checkableAdapter.f119794d = arrayList;
                checkableAdapter.f119793c = context;
                arrayList.addAll(listJ0);
                CheckableAdapter.CheckMode checkMode = CheckableAdapter.CheckMode.SINGLE_AT_LEAST_ONE;
                checkableAdapter.f114377b = checkMode;
                checkableAdapter.P();
                if (checkableAdapter.getItemCount() > 0 && checkableAdapter.f114377b == checkMode) {
                    checkableAdapter.f114376a.put(0, true);
                }
                obj.f126646c = checkableAdapter;
                recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
                recyclerView.setAdapter(checkableAdapter);
                int[] iArr = C7042a.f117735a;
                ?? checkableAdapter2 = new CheckableAdapter();
                checkableAdapter2.f119886c = context;
                checkableAdapter2.f119887d = iArr;
                checkableAdapter2.f114377b = checkMode;
                checkableAdapter2.P();
                if (checkableAdapter2.getItemCount() > 0 && checkableAdapter2.f114377b == checkMode) {
                    checkableAdapter2.f114376a.put(0, true);
                }
                obj.f126645b = checkableAdapter2;
                recyclerView2.setLayoutManager(new LinearLayoutManager(context, 0, false));
                recyclerView2.setAdapter(checkableAdapter2);
                TextView textView = (TextView) viewInflate.findViewById(2131307199);
                TextView textView2 = (TextView) viewInflate.findViewById(2131307201);
                textView.setOnClickListener(obj);
                textView2.setOnClickListener(obj);
                PopupWindow popupWindow = new PopupWindow(viewInflate, viewGroup.getWidth() > 0 ? viewGroup.getWidth() : -1, C6931i.a(context, 126.0f));
                obj.f126647d = popupWindow;
                popupWindow.setBackgroundDrawable(ContextCompat.getDrawable(context, 2131241418));
                popupWindow.setAnimationStyle(2131888087);
                popupWindow.setOutsideTouchable(true);
                popupWindow.setFocusable(true);
                obj.f126648e = viewGroup;
                viewGroup.addOnLayoutChangeListener(new View.OnLayoutChangeListener(obj) { // from class: rI0.a

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final ViewOnClickListenerC8516b f126643a;

                    {
                        this.f126643a = obj;
                    }

                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view2, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
                        ViewOnClickListenerC8516b viewOnClickListenerC8516b2 = this.f126643a;
                        viewOnClickListenerC8516b2.getClass();
                        int i15 = i13 - i11;
                        if (i9 - i7 == i15 || i15 <= 0 || !viewOnClickListenerC8516b2.f126647d.isShowing()) {
                            return;
                        }
                        ViewOnClickListenerC8516b.a(viewOnClickListenerC8516b2.f126647d);
                    }
                });
                this.f113610B = obj;
                popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener(this) { // from class: iI0.j

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final ManuscriptsListFragment f121595a;

                    {
                        this.f121595a = this;
                    }

                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        this.f121595a.sf(false);
                    }
                });
                this.f113610B.f126644a = new C7555q(this);
            }
            viewOnClickListenerC8516b = this.f113610B;
        }
        if (viewOnClickListenerC8516b != null) {
            int i7 = this.f113627i;
            C7264n c7264n = viewOnClickListenerC8516b.f126645b;
            c7264n.P();
            c7264n.f114376a.put(new int[]{i7}[0], true);
            viewOnClickListenerC8516b.f126645b.notifyDataSetChanged();
            int i8 = this.f113628j;
            K k7 = viewOnClickListenerC8516b.f126646c;
            k7.P();
            k7.f114376a.put(new int[]{i8}[0], true);
            viewOnClickListenerC8516b.f126646c.notifyDataSetChanged();
            int width = viewOnClickListenerC8516b.f126648e.getWidth();
            if (width > 0) {
                viewOnClickListenerC8516b.f126647d.setWidth(width);
            }
            viewOnClickListenerC8516b.f126647d.showAsDropDown(viewOnClickListenerC8516b.f126648e);
        }
        sf(true);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        BLog.e("ManuscriptsListFragment", "---onCreate-");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(2131494216, viewGroup, false);
        this.f113623d = (PageTipView) viewInflate.findViewById(2131315873);
        this.f113624e = (ClockInTipView) viewInflate.findViewById(2131315769);
        this.f113625f = (RecyclerView) viewInflate.findViewById(2131306595);
        this.f113622c = (ImageView) viewInflate.findViewById(2131303590);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewInflate.findViewById(2131312002);
        this.f113640v = swipeRefreshLayout;
        swipeRefreshLayout.setColorSchemeColors(ThemeUtils.getColorById(getContext(), 2131103284));
        this.f113640v.setOnRefreshListener(new N(this));
        this.f113639u = layoutInflater.inflate(2131494692, viewGroup, false);
        rf();
        this.f113609A = (ImageView) viewInflate.findViewById(2131315862);
        this.f113644z = (TextView) viewInflate.findViewById(2131315864);
        this.f113643y = (ViewGroup) viewInflate.findViewById(2131315863);
        this.f113642x = (ViewGroup) viewInflate.findViewById(2131315860);
        UpperCommonEditText upperCommonEditText = (UpperCommonEditText) viewInflate.findViewById(2131315867);
        this.f113611C = upperCommonEditText;
        upperCommonEditText.setAutoShowSoftKeyboard(false);
        this.f113609A.setOnClickListener(this);
        this.f113644z.setOnClickListener(this);
        UpperCommonEditText upperCommonEditText2 = this.f113611C;
        upperCommonEditText2.f114602b = false;
        upperCommonEditText2.setOnClickListener(this);
        this.f113641w = viewInflate.findViewById(2131315865);
        vf(false);
        this.f113614F = AnimationUtils.loadAnimation(getContext(), 2130771987);
        this.f113615G = AnimationUtils.loadAnimation(getContext(), 2130771986);
        this.f113642x.setVisibility(0);
        return viewInflate;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        BLog.e("ManuscriptsListFragment", "---onDestroy-");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:43:0x0132
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.manuscript.fragment.ManuscriptsListFragment.onDestroyView():void");
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public final void onFragmentHide(@NonNull Flag flag) {
        super.onFragmentHide(flag);
        HB0.b bVar = HB0.b.f8155a;
        String strL = HB0.b.l("creation.creation-contribution.0.0.pv", null);
        tw0.f fVar = tw0.f.f127691a;
        Map mapEmptyMap = MapsKt.emptyMap();
        tw0.f.b();
        PageViewTracker.end("creation.creation-contribution.0.0.pv", 0, strL, mapEmptyMap);
        tw0.f.a("creation.creation-contribution.0.0.pv", "pv_end", strL, mapEmptyMap);
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public final void onFragmentShow(@NonNull Flag flag) {
        super.onFragmentShow(flag);
        HB0.b bVar = HB0.b.f8155a;
        tw0.f.c("creation.creation-contribution.0.0.pv", HB0.b.l("creation.creation-contribution.0.0.pv", null));
        BiliCall<?> collectionDataList = ((PublishCollectionChapterApiService) ServiceGenerator.createService(PublishCollectionChapterApiService.class)).getCollectionDataList(1, 5, "", 0);
        collectionDataList.enqueue(new C7553o(this));
        tf(collectionDataList);
        BiliCall<?> publishCollectionGray = ((PublishCollectionChapterApiService) ServiceGenerator.createService(PublishCollectionChapterApiService.class)).getPublishCollectionGray();
        publishCollectionGray.enqueue(new C7554p(this));
        tf(publishCollectionGray);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        QE0.c.a().getClass();
        ArrayList arrayList = (ArrayList) QE0.c.f19816d;
        if (arrayList.contains(this)) {
            QE0.c.f19815c.unregister(this);
            arrayList.remove(this);
        }
        uf(true);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        QE0.c.a().getClass();
        ArrayList arrayList = (ArrayList) QE0.c.f19816d;
        if (!arrayList.contains(this)) {
            arrayList.add(this);
            QE0.c.f19815c.register(this);
        }
        this.f113616H.J0();
        uf(of());
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(2131318327);
        this.h = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(0);
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(2131318339);
        this.f113626g = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            this.f113626g.addItemDecoration(new b(this));
            j.c("sdk_type", KaleidoscopeFactory.SDK_MON);
            j.c("router_topic_id", Xz0.g.f28463b);
            tw0.f.e("creation.creation-contribution.0.avid-list.show", j.b(k.f28474a));
            C7558t c7558t = new C7558t(getContext());
            this.f113612D = c7558t;
            c7558t.N(null);
            this.f113626g.setAdapter(this.f113612D);
            this.f113626g.addOnScrollListener(new c(this));
        }
    }

    public final void pf() {
        View view = this.f113639u;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public final void qf() {
        Drawable drawable = this.f113622c.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).stop();
        }
        this.f113622c.setVisibility(8);
    }

    public final void refresh() {
        List<QF0.f> listI;
        int i7 = this.f113627i;
        if ((i7 == 0 || i7 == 1) && (listI = LF0.d.j(getApplicationContext()).i()) != null) {
            ArrayList arrayList = (ArrayList) listI;
            if (arrayList.isEmpty()) {
                return;
            }
            rf();
            if (this.f113632n == null) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = this.f113633o == null ? new ArrayList() : new ArrayList(this.f113633o);
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                QF0.f fVar = (QF0.f) arrayList.get(i8);
                if (fVar.K() != null) {
                    VideoEditItem videoEditItem = new VideoEditItem();
                    ((VideoItem) videoEditItem).aid = fVar.getAvid();
                    ((VideoItem) videoEditItem).title = fVar.K().title;
                    ((VideoItem) videoEditItem).duration = fVar.getDuration();
                    videoEditItem.taskStatus = fVar.getTaskStatus();
                    videoEditItem.uploadStatus = fVar.Y();
                    videoEditItem.uploadTagStatus = fVar.G();
                    videoEditItem.uploadTaskId = fVar.getUploadId();
                    videoEditItem.isNewUploadTask = fVar.isNewUploadTask();
                    videoEditItem.progress = fVar.getProgress();
                    ((VideoItem) videoEditItem).cover = fVar.K().cover;
                    videoEditItem.taskId = fVar.getTaskId();
                    ArrayList arrayList4 = arrayList3;
                    if (fVar.getAvid() != 0) {
                        long avid = fVar.getAvid();
                        if (arrayList3 != null) {
                            int i9 = 0;
                            while (true) {
                                arrayList4 = arrayList3;
                                if (i9 >= arrayList3.size()) {
                                    break;
                                }
                                ArcAudit arcAudit = (ArcAudit) arrayList3.get(i9);
                                VideoItem videoItem = arcAudit.archive;
                                if (videoItem != null && videoItem.aid == avid && !(videoItem instanceof VideoEditItem)) {
                                    arrayList3.remove(arcAudit);
                                    arrayList4 = arrayList3;
                                    break;
                                }
                                i9++;
                            }
                        } else {
                            arrayList4 = null;
                        }
                    }
                    int iNf = nf(fVar.getTaskStatus());
                    if (iNf == -1) {
                        arrayList3 = arrayList4;
                    } else {
                        if (iNf != 0) {
                            ((VideoItem) videoEditItem).statePanel = iNf;
                        }
                        int iKf = kf(fVar.getTaskId(), arrayList4);
                        if (iKf != -1) {
                            ((ArcAudit) arrayList4.get(iKf)).archive = videoEditItem;
                            arrayList3 = arrayList4;
                        } else {
                            ArcAudit arcAudit2 = new ArcAudit();
                            arcAudit2.archive = videoEditItem;
                            arrayList2.add(arcAudit2);
                            arrayList3 = arrayList4;
                        }
                    }
                }
            }
            arrayList2.addAll(arrayList3);
            ((ArrayList) this.f113633o).clear();
            ((ArrayList) this.f113633o).addAll(arrayList2);
            this.f113632n.W(arrayList2);
            this.f113632n.notifyDataSetChanged();
        }
    }

    @Subscribe
    public void refreshEvent(g gVar) {
        List<ArcAudit> list = this.f113632n.f119946a;
        if (list != null) {
            ArrayList arrayList = (ArrayList) list;
            if (arrayList.isEmpty()) {
                return;
            }
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                VideoItem videoItem = ((ArcAudit) arrayList.get(i7)).archive;
                if (videoItem != null && gVar.f113651a == videoItem.aid) {
                    videoItem.is_only_self = gVar.f113652b;
                    this.f113632n.notifyItemChanged(i7);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void rf() {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.manuscript.fragment.ManuscriptsListFragment.rf():void");
    }

    public final void sf(boolean z6) {
        if (z6) {
            this.f113641w.setVisibility(0);
            this.f113641w.startAnimation(this.f113614F);
        } else {
            this.f113641w.setVisibility(8);
            this.f113641w.startAnimation(this.f113615G);
        }
    }

    @Subscribe
    public void shareItem(eJ0.w wVar) {
        if (wVar != null) {
            wVar.a(getContext());
        }
    }

    @Override // LF0.e
    public final void t3(long j7, String str) {
        refresh();
    }

    public final void tf(@Nullable BiliCall<?> biliCall) {
        ((ArrayList) this.f113617I).add(biliCall);
    }

    public final void uf(boolean z6) {
        try {
            Window window = p3().getWindow();
            if (window == null) {
                return;
            }
            if (z6) {
                window.clearFlags(128);
            } else {
                window.addFlags(128);
            }
            this.f113613E = z6;
        } catch (Exception e7) {
            o.a(e7, new StringBuilder("error message is "), "ManuscriptsListFragment");
        }
    }

    public final void vf(boolean z6) {
        if (z6) {
            if (getContext() != null) {
                this.f113644z.setTextColor(ContextCompat.getColor(getContext(), 2131104274));
            }
            this.f113609A.setImageResource(2131236498);
        } else {
            if (getContext() != null) {
                this.f113644z.setTextColor(ContextCompat.getColor(getContext(), 2131104173));
            }
            this.f113609A.setImageResource(2131236497);
        }
    }
}
