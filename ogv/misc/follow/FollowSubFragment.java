package com.bilibili.ogv.misc.follow;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.api.BiliApiException;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.ui.BaseSwipeRecyclerViewFragment;
import com.bilibili.lib.ui.mixin.Flag;
import com.bilibili.lib.ui.theme.ThemeWatcher;
import com.bilibili.ogv.community.bean.BangumiFollowStatus;
import com.bilibili.ogv.community.k;
import com.bilibili.ogv.misc.follow.FollowSubFragment;
import com.bilibili.ogv.misc.follow.api.entity.BangumiMineFollowV2;
import com.bilibili.ogv.misc.follow.api.entity.FollowMovableList;
import com.bilibili.ogv.misc.follow.api.entity.ItemData;
import com.bilibili.ogv.misc.follow.api.entity.UpdateFollowRqEntity;
import com.bilibili.okretro.call.rxjava.BiliRxApiException;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pk0.C8318m;
import pk0.C8327v;
import pk0.C8330y;
import pk0.C8331z;
import pk0.DialogC8322q;
import qk0.C8448c;
import tv.danmaku.bili.widget.LoadingImageView;
import tv.danmaku.bili.widget.section.adapter.BaseSectionAdapter;
import tv.danmaku.bili.widget.section.adapter.PageAdapter;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/FollowSubFragment.class */
@StabilityInferred(parameters = 0)
public final class FollowSubFragment extends BaseSwipeRecyclerViewFragment implements PageAdapter.Page {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Set<Activity> f69078t = Collections.newSetFromMap(new WeakHashMap());

    @Nullable
    public C8327v h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public DialogC8322q f69080j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Disposable f69081k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f69084n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f69085o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f69087q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public C8448c f69088r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public C8318m f69089s;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final HashSet<Long> f69079i = new HashSet<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f69082l = 20;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f69083m = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f69086p = 2;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/FollowSubFragment$a.class */
    public static final class a<T> implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FollowSubFragment f69090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f69091b;

        public a(FollowSubFragment followSubFragment, boolean z6) {
            this.f69090a = followSubFragment;
            this.f69091b = z6;
        }

        public final void accept(Object obj) {
            FollowSubFragment.jf(this.f69090a, (BangumiMineFollowV2) obj, this.f69091b);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/FollowSubFragment$b.class */
    public static final class b<T> implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FollowSubFragment f69092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f69093b;

        public b(FollowSubFragment followSubFragment, boolean z6) {
            this.f69092a = followSubFragment;
            this.f69093b = z6;
        }

        public final void accept(Object obj) {
            Object obj2 = (Throwable) obj;
            boolean z6 = obj2 instanceof BiliRxApiException;
            boolean z7 = this.f69093b;
            FollowSubFragment followSubFragment = this.f69092a;
            if (z6) {
                BiliRxApiException biliRxApiException = (BiliRxApiException) obj2;
                if (biliRxApiException.getCode() == 0 && biliRxApiException.getData() == null) {
                    FollowSubFragment.jf(followSubFragment, null, z7);
                    return;
                }
                return;
            }
            Set<Activity> set = FollowSubFragment.f69078t;
            followSubFragment.setRefreshCompleted();
            followSubFragment.f69084n = false;
            if (z7) {
                followSubFragment.f69083m--;
                C8448c c8448c = followSubFragment.f69088r;
                if (c8448c != null) {
                    c8448c.showFooterError();
                    return;
                }
                return;
            }
            C8448c c8448c2 = followSubFragment.f69088r;
            if (c8448c2 != null) {
                c8448c2.O();
            }
            followSubFragment.showErrorTips();
            followSubFragment.lf();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/FollowSubFragment$c.class */
    public static final class c<T> implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FollowSubFragment f69094a;

        public c(FollowSubFragment followSubFragment) {
            this.f69094a = followSubFragment;
        }

        public final void accept(Object obj) {
            MutableLiveData<Boolean> mutableLiveData;
            SparseBooleanArray sparseBooleanArray;
            SparseArray<FollowMovableList> sparseArray;
            FollowMovableList followMovableList;
            List<Long> listA;
            int iIntValue = ((Integer) obj).intValue();
            FollowSubFragment followSubFragment = this.f69094a;
            if (followSubFragment.f69087q == iIntValue) {
                C8318m c8318m = followSubFragment.f69089s;
                if (c8318m != null && (sparseArray = c8318m.f125441f) != null && (followMovableList = sparseArray.get(followSubFragment.f69086p)) != null && (listA = followMovableList.a()) != null) {
                    listA.clear();
                }
                C8318m c8318m2 = followSubFragment.f69089s;
                if (c8318m2 != null && (sparseBooleanArray = c8318m2.f125442g) != null) {
                    sparseBooleanArray.put(followSubFragment.f69086p, false);
                }
                C8318m c8318m3 = followSubFragment.f69089s;
                if (c8318m3 != null && (mutableLiveData = c8318m3.f125439d) != null) {
                    mutableLiveData.setValue(Boolean.FALSE);
                }
                followSubFragment.f69083m = 1;
                followSubFragment.f69085o = false;
                followSubFragment.kf(false);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/FollowSubFragment$d.class */
    public static final class d<T> implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FollowSubFragment f69095a;

        public d(FollowSubFragment followSubFragment) {
            this.f69095a = followSubFragment;
        }

        public final void accept(Object obj) {
            List<ItemData> listA;
            Object next;
            MutableLiveData<Boolean> mutableLiveData;
            SparseBooleanArray sparseBooleanArray;
            SparseArray<FollowMovableList> sparseArray;
            FollowMovableList followMovableList;
            List<Long> listA2;
            BangumiFollowStatus bangumiFollowStatus = (BangumiFollowStatus) obj;
            Set<Activity> set = FollowSubFragment.f69078t;
            FollowSubFragment followSubFragment = this.f69095a;
            followSubFragment.getClass();
            int i7 = bangumiFollowStatus.f67510i;
            int i8 = com.bilibili.ogv.pub.season.b.a(i7 <= 0 ? com.bilibili.ogv.pub.season.a.f71781i : new com.bilibili.ogv.pub.season.a(i7)) ? 1 : 2;
            if (bangumiFollowStatus.f67509g) {
                if (followSubFragment.f69087q == i8) {
                    C8318m c8318m = followSubFragment.f69089s;
                    if (c8318m != null && (sparseArray = c8318m.f125441f) != null && (followMovableList = sparseArray.get(followSubFragment.f69086p)) != null && (listA2 = followMovableList.a()) != null) {
                        listA2.clear();
                    }
                    C8318m c8318m2 = followSubFragment.f69089s;
                    if (c8318m2 != null && (sparseBooleanArray = c8318m2.f125442g) != null) {
                        sparseBooleanArray.put(followSubFragment.f69086p, false);
                    }
                    C8318m c8318m3 = followSubFragment.f69089s;
                    if (c8318m3 != null && (mutableLiveData = c8318m3.f125439d) != null) {
                        mutableLiveData.setValue(Boolean.FALSE);
                    }
                    followSubFragment.f69083m = 1;
                    followSubFragment.f69085o = false;
                    followSubFragment.kf(false);
                    return;
                }
                return;
            }
            C8448c c8448c = followSubFragment.f69088r;
            if (c8448c != null) {
                long j7 = bangumiFollowStatus.h;
                BangumiMineFollowV2 bangumiMineFollowV2 = c8448c.f126085k;
                if (bangumiMineFollowV2 != null && (listA = bangumiMineFollowV2.a()) != null) {
                    Iterator<T> it = listA.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it.next();
                            if (((ItemData) next).d() == j7) {
                                break;
                            }
                        }
                    }
                    TypeIntrinsics.asMutableCollection(listA).remove((ItemData) next);
                    c8448c.notifySectionData();
                }
                if (c8448c.P()) {
                    c8448c.O();
                }
            }
            C8448c c8448c2 = followSubFragment.f69088r;
            if (c8448c2 == null || !c8448c2.P()) {
                return;
            }
            followSubFragment.showEmptyTips();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/FollowSubFragment$e.class */
    public static final class e extends Nl0.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FollowSubFragment f69096b;

        public e(FollowSubFragment followSubFragment) {
            this.f69096b = followSubFragment;
        }

        @Override // Nl0.e
        public final void onLastItemVisible() {
            C8448c c8448c;
            BangumiMineFollowV2 bangumiMineFollowV2;
            List<ItemData> listA;
            FollowSubFragment followSubFragment = this.f69096b;
            if (followSubFragment.f69085o) {
                C8448c c8448c2 = followSubFragment.f69088r;
                if (((c8448c2 == null || (bangumiMineFollowV2 = c8448c2.f126085k) == null || (listA = bangumiMineFollowV2.a()) == null) ? 0 : listA.size()) > 0 && (c8448c = followSubFragment.f69088r) != null) {
                    c8448c.showFooterEmpty();
                }
            }
            C8448c c8448c3 = followSubFragment.f69088r;
            int itemCount = 0;
            if (c8448c3 != null) {
                itemCount = c8448c3.getItemCount();
            }
            if (itemCount > 1) {
                followSubFragment.kf(true);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/FollowSubFragment$f.class */
    public static final class f<T> implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UpdateFollowRqEntity f69097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FollowSubFragment f69098b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f69099c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Function0<Unit> f69100d;

        public f(UpdateFollowRqEntity updateFollowRqEntity, FollowSubFragment followSubFragment, int i7, Function0<Unit> function0) {
            this.f69097a = updateFollowRqEntity;
            this.f69098b = followSubFragment;
            this.f69099c = i7;
            this.f69100d = function0;
        }

        public final void accept(Object obj) {
            UpdateFollowRqEntity updateFollowRqEntity = this.f69097a;
            updateFollowRqEntity.markCurrentSuccess();
            boolean zHasNext = updateFollowRqEntity.hasNext();
            Function0<Unit> function0 = this.f69100d;
            FollowSubFragment followSubFragment = this.f69098b;
            if (zHasNext) {
                Set<Activity> set = FollowSubFragment.f69078t;
                followSubFragment.nf(this.f69099c, updateFollowRqEntity, function0);
                return;
            }
            Set<Activity> set2 = FollowSubFragment.f69078t;
            DialogC8322q dialogC8322q = followSubFragment.f69080j;
            if (dialogC8322q != null) {
                dialogC8322q.hide();
            }
            if (updateFollowRqEntity.isSuccess()) {
                ToastHelper.showToastShort(followSubFragment.getContext(), 2131821915);
            } else {
                ToastHelper.showToastShort(followSubFragment.getContext(), 2131832098);
            }
            function0.invoke();
            followSubFragment.f69079i.clear();
            followSubFragment.mf();
            C8448c c8448c = followSubFragment.f69088r;
            if (c8448c != null) {
                c8448c.f126089o = false;
                c8448c.Q(false);
            }
            if (updateFollowRqEntity.isPartSuccess()) {
                Lazy lazy = C8330y.f125459a;
                C8330y.f125460b.onNext(Integer.valueOf(followSubFragment.f69087q));
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/FollowSubFragment$g.class */
    public static final class g<T> implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UpdateFollowRqEntity f69101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FollowSubFragment f69102b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f69103c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Function0<Unit> f69104d;

        public g(UpdateFollowRqEntity updateFollowRqEntity, FollowSubFragment followSubFragment, int i7, Function0<Unit> function0) {
            this.f69101a = updateFollowRqEntity;
            this.f69102b = followSubFragment;
            this.f69103c = i7;
            this.f69104d = function0;
        }

        public final void accept(Object obj) {
            Throwable th = (Throwable) obj;
            UpdateFollowRqEntity updateFollowRqEntity = this.f69101a;
            updateFollowRqEntity.markCurrentFail();
            boolean zHasNext = updateFollowRqEntity.hasNext();
            Function0<Unit> function0 = this.f69104d;
            FollowSubFragment followSubFragment = this.f69102b;
            if (zHasNext) {
                Set<Activity> set = FollowSubFragment.f69078t;
                followSubFragment.nf(this.f69103c, updateFollowRqEntity, function0);
                return;
            }
            Set<Activity> set2 = FollowSubFragment.f69078t;
            DialogC8322q dialogC8322q = followSubFragment.f69080j;
            if (dialogC8322q != null) {
                dialogC8322q.hide();
            }
            function0.invoke();
            followSubFragment.f69079i.clear();
            followSubFragment.mf();
            C8448c c8448c = followSubFragment.f69088r;
            if (c8448c != null) {
                c8448c.f126089o = false;
                c8448c.Q(false);
            }
            if (updateFollowRqEntity.isPartSuccess()) {
                Lazy lazy = C8330y.f125459a;
                C8330y.f125460b.onNext(Integer.valueOf(followSubFragment.f69087q));
            }
            if (th instanceof BiliApiException) {
                ToastHelper.showToastShort(followSubFragment.getContext(), 2131832098);
            } else {
                ToastHelper.showToastShort(followSubFragment.getContext(), 2131832113);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023c A[LOOP:3: B:77:0x0232->B:79:0x023c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02c8  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void jf(com.bilibili.ogv.misc.follow.FollowSubFragment r5, com.bilibili.ogv.misc.follow.api.entity.BangumiMineFollowV2 r6, boolean r7) {
        /*
            Method dump skipped, instruction units count: 777
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.misc.follow.FollowSubFragment.jf(com.bilibili.ogv.misc.follow.FollowSubFragment, com.bilibili.ogv.misc.follow.api.entity.BangumiMineFollowV2, boolean):void");
    }

    public final boolean canScrollUp() {
        return false;
    }

    @NotNull
    public final Fragment getFragment() {
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void kf(boolean r9) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.misc.follow.FollowSubFragment.kf(boolean):void");
    }

    public final void lf() {
        MutableLiveData<Pair<Integer, Boolean>> mutableLiveData;
        C8318m c8318m = this.f69089s;
        if (c8318m == null || (mutableLiveData = c8318m.f125437b) == null) {
            return;
        }
        int i7 = this.f69086p;
        C8448c c8448c = this.f69088r;
        mutableLiveData.setValue(new Pair<>(Integer.valueOf(i7), Boolean.valueOf((c8448c == null || c8448c.P()) ? false : true)));
    }

    public final void mf() {
        MutableLiveData<Pair<Integer, Integer>> mutableLiveData;
        SparseArray<FollowMovableList> sparseArray;
        FollowMovableList followMovableList;
        C8318m c8318m = this.f69089s;
        List<Long> listA = (c8318m == null || (sparseArray = c8318m.f125441f) == null || (followMovableList = sparseArray.get(this.f69086p)) == null) ? null : followMovableList.a();
        C8318m c8318m2 = this.f69089s;
        if (c8318m2 == null || (mutableLiveData = c8318m2.f125438c) == null) {
            return;
        }
        mutableLiveData.setValue(new Pair<>(Integer.valueOf(this.f69079i.size()), Integer.valueOf(listA != null ? listA.size() : 0)));
    }

    public final void nf(int i7, UpdateFollowRqEntity updateFollowRqEntity, Function0<Unit> function0) {
        UpdateFollowRqEntity.Segment next = updateFollowRqEntity.next();
        if (next == null) {
            return;
        }
        Lazy lazy = C8330y.f125459a;
        this.f69081k = C8330y.a(i7, next.getIds()).subscribe(new f(updateFollowRqEntity, this, i7, function0), new g(updateFollowRqEntity, this, i7, function0));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void of(boolean r4) {
        /*
            r3 = this;
            r0 = r4
            if (r0 == 0) goto L56
            r0 = r3
            pk0.m r0 = r0.f69089s
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L31
            r0 = r5
            android.util.SparseArray<com.bilibili.ogv.misc.follow.api.entity.FollowMovableList> r0 = r0.f125441f
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L31
            r0 = r5
            r1 = r3
            int r1 = r1.f69086p
            java.lang.Object r0 = r0.get(r1)
            com.bilibili.ogv.misc.follow.api.entity.FollowMovableList r0 = (com.bilibili.ogv.misc.follow.api.entity.FollowMovableList) r0
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L31
            r0 = r5
            java.util.List r0 = r0.a()
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L35
        L31:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            r5 = r0
        L35:
            r0 = r3
            java.util.HashSet<java.lang.Long> r0 = r0.f69079i
            r1 = r5
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r0 = r0.addAll(r1)
            r0 = r3
            r0.mf()
            r0 = r3
            qk0.c r0 = r0.f69088r
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L6f
            r0 = r5
            r1 = 1
            r0.Q(r1)
            goto L6f
        L56:
            r0 = r3
            java.util.HashSet<java.lang.Long> r0 = r0.f69079i
            r0.clear()
            r0 = r3
            r0.mf()
            r0 = r3
            qk0.c r0 = r0.f69088r
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L6f
            r0 = r5
            r1 = 0
            r0.Q(r1)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.misc.follow.FollowSubFragment.of(boolean):void");
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [pk0.v] */
    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        MutableLiveData<Pair<Boolean, Integer>> mutableLiveData;
        super.onCreate(bundle);
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            this.f69089s = (C8318m) new ViewModelProvider(parentFragment).get(C8318m.class);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f69086p = arguments.getInt(NotificationCompat.CATEGORY_STATUS, 2);
            this.f69087q = arguments.getInt("type", 0);
        }
        int i7 = this.f69087q;
        int i8 = this.f69086p;
        C8318m c8318m = this.f69089s;
        this.f69088r = new C8448c(this, i7, this, i8, c8318m != null ? c8318m.f125444j : null);
        com.bilibili.okretro.call.rxjava.c.a(C8330y.f125460b.subscribe(new c(this)), getLifecycle());
        com.bilibili.okretro.call.rxjava.c.a(k.f67553c.subscribe(new d(this)), getLifecycle());
        this.h = new ThemeWatcher.Observer(this) { // from class: pk0.v

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final FollowSubFragment f125454a;

            {
                this.f125454a = this;
            }

            @Override // com.bilibili.lib.ui.theme.ThemeWatcher.Observer
            public final void onThemeChanged() {
                C8448c c8448c = this.f125454a.f69088r;
                if (c8448c != null) {
                    c8448c.notifySectionData();
                }
            }
        };
        ThemeWatcher.getInstance().subscribe(this.h);
        C8318m c8318m2 = this.f69089s;
        if (c8318m2 == null || (mutableLiveData = c8318m2.h) == null) {
            return;
        }
        mutableLiveData.observe(this, new Observer(this) { // from class: pk0.w

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final FollowSubFragment f125455a;

            {
                this.f125455a = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                Pair pair = (Pair) obj;
                Set<Activity> set = FollowSubFragment.f69078t;
                FollowSubFragment followSubFragment = this.f125455a;
                DialogC8322q dialogC8322q = followSubFragment.f69080j;
                if (dialogC8322q != null) {
                    dialogC8322q.hide();
                }
                if (pair == null || ((Number) pair.getSecond()).intValue() != followSubFragment.f69086p) {
                    return;
                }
                if (((Boolean) pair.getFirst()).booleanValue()) {
                    followSubFragment.mf();
                } else {
                    ToastHelper.showToastShort(followSubFragment.getContext(), 2131832098);
                }
            }
        });
    }

    @Override // com.bilibili.lib.ui.BaseSwipeRecyclerViewFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ThemeWatcher.getInstance().unSubscribe(this.h);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Disposable disposable = this.f69081k;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f69081k = null;
        super.onDestroyView();
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public final void onFragmentShow(@NotNull Flag flag) {
        super.onFragmentShow(flag);
        lf();
    }

    @Override // com.bilibili.lib.ui.BaseSwipeRefreshFragment
    public final void onRefresh() {
        super.onRefresh();
        this.f69083m = 1;
        this.f69085o = false;
        kf(false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        BaseSectionAdapter baseSectionAdapter;
        super.onResume();
        if (!com.bilibili.ogv.infra.account.a.f67851a.isEffectiveVip() || (baseSectionAdapter = this.f69088r) == null || ((ArrayList) baseSectionAdapter.f126090p).isEmpty()) {
            return;
        }
        ((ArrayList) baseSectionAdapter.f126090p).clear();
        baseSectionAdapter.removeSection(0);
        baseSectionAdapter.notifySectionData(false);
        baseSectionAdapter.notifyItemRemoved(0);
    }

    @Override // com.bilibili.lib.ui.BaseSwipeRecyclerViewFragment
    public final void onViewCreated(@Nullable final RecyclerView recyclerView, @Nullable Bundle bundle) {
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(this.f69088r);
            recyclerView.addOnScrollListener(new e(this));
            LoadingImageView loadingImageView = this.f64720g;
            if (loadingImageView != null) {
                final FrameLayout frameLayout = (FrameLayout) loadingImageView.getParent();
                frameLayout.post(new Runnable(this, frameLayout, recyclerView) { // from class: pk0.x

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final FollowSubFragment f125456a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final FrameLayout f125457b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final RecyclerView f125458c;

                    {
                        this.f125456a = this;
                        this.f125457b = frameLayout;
                        this.f125458c = recyclerView;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        FollowSubFragment followSubFragment = this.f125456a;
                        FrameLayout frameLayout2 = this.f125457b;
                        RecyclerView recyclerView2 = this.f125458c;
                        Set<Activity> set = FollowSubFragment.f69078t;
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) followSubFragment.f64720g.getLayoutParams();
                        layoutParams.topMargin = ((frameLayout2.getHeight() - Uj0.c.b(40.0f, recyclerView2.getContext())) - 440) / 2;
                        layoutParams.gravity = 1;
                        followSubFragment.f64720g.setLayoutParams(layoutParams);
                    }
                });
            }
        }
        this.f69083m = 1;
        this.f69085o = false;
        kf(false);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [android.app.Dialog, pk0.q] */
    public final void pf(String str) {
        DialogC8322q dialogC8322q = this.f69080j;
        if (dialogC8322q != null) {
            dialogC8322q.hide();
        }
        int i7 = DialogC8322q.f125448b;
        Context contextRequireContext = requireContext();
        ?? dialog = new Dialog(contextRequireContext, 2131886290);
        View viewInflate = LayoutInflater.from(contextRequireContext).inflate(2131493128, (ViewGroup) null);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setContentView(viewInflate, new WindowManager.LayoutParams(-1, -1));
        }
        dialog.f125449a = (ImageView) viewInflate.findViewById(2131305922);
        ((TextView) viewInflate.findViewById(2131304642)).setText(str);
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        dialog.show();
        this.f69080j = dialog;
    }

    public final void qf(int i7, @NotNull Function0<Unit> function0) {
        List<ItemData> list;
        UpdateFollowRqEntity updateFollowRqEntity;
        List<ItemData> listA;
        C8331z.a(this.f69087q == 1 ? "pgc.my-bangumi.0.multi-move.click" : "pgc.my-favorite-cinema.0.multi-move.click", null, C8331z.b(this.f69086p), C8331z.b(i7));
        C8448c c8448c = this.f69088r;
        if (c8448c != null) {
            ((ArrayList) c8448c.f126086l).clear();
            BangumiMineFollowV2 bangumiMineFollowV2 = c8448c.f126085k;
            if (bangumiMineFollowV2 != null && (listA = bangumiMineFollowV2.a()) != null) {
                for (ItemData itemData : listA) {
                    if (itemData.f69140o && itemData.f69139n) {
                        ((ArrayList) c8448c.f126086l).add(itemData);
                    }
                }
            }
            list = c8448c.f126086l;
        } else {
            list = null;
        }
        int i8 = 0;
        if (this.f69079i.isEmpty()) {
            UpdateFollowRqEntity.Companion.getClass();
            if (list == null || !list.isEmpty()) {
                UpdateFollowRqEntity updateFollowRqEntity2 = new UpdateFollowRqEntity(null);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = null;
                int i9 = 0;
                for (Object obj : list) {
                    if (i9 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    ItemData itemData2 = (ItemData) obj;
                    if (i9 % 30 == 0) {
                        UpdateFollowRqEntity.Segment segment = new UpdateFollowRqEntity.Segment();
                        arrayList2 = new ArrayList();
                        segment.setIds(arrayList2);
                        arrayList.add(segment);
                    }
                    if (itemData2 != null && arrayList2 != null) {
                        arrayList2.add(String.valueOf(itemData2.d()));
                    }
                    i9++;
                }
                updateFollowRqEntity2.setSegments(arrayList);
                updateFollowRqEntity = updateFollowRqEntity2;
            } else {
                updateFollowRqEntity = null;
            }
        } else {
            UpdateFollowRqEntity.a aVar = UpdateFollowRqEntity.Companion;
            List list2 = CollectionsKt.toList(this.f69079i);
            aVar.getClass();
            if (list2 == null || !list2.isEmpty()) {
                UpdateFollowRqEntity updateFollowRqEntity3 = new UpdateFollowRqEntity(null);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = null;
                for (Object obj2 : list2) {
                    if (i8 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    long jLongValue = ((Number) obj2).longValue();
                    if (i8 % 30 == 0) {
                        UpdateFollowRqEntity.Segment segment2 = new UpdateFollowRqEntity.Segment();
                        arrayList4 = new ArrayList();
                        segment2.setIds(arrayList4);
                        arrayList3.add(segment2);
                    }
                    if (arrayList4 != null) {
                        arrayList4.add(String.valueOf(jLongValue));
                    }
                    i8++;
                }
                updateFollowRqEntity3.setSegments(arrayList3);
                updateFollowRqEntity = updateFollowRqEntity3;
            } else {
                updateFollowRqEntity = null;
            }
        }
        if (updateFollowRqEntity != null) {
            pf(getString(2131821914));
            nf(i7, updateFollowRqEntity, function0);
        }
    }

    public final void showEmptyTips() {
        int i7;
        LoadingImageView loadingImageView = this.f64720g;
        if (loadingImageView != null) {
            if (!loadingImageView.isShown()) {
                this.f64720g.setVisibility(0);
            }
            this.f64720g.setImageResource(2131235613);
            if (this.f69087q == 1) {
                int i8 = this.f69086p;
                if (i8 != 1) {
                    i7 = 2131821883;
                    if (i8 != 2) {
                        i7 = i8 != 3 ? 2131821883 : 2131821882;
                    }
                } else {
                    i7 = 2131821881;
                }
            } else {
                int i9 = this.f69086p;
                if (i9 != 1) {
                    i7 = 2131821886;
                    if (i9 != 2) {
                        i7 = i9 != 3 ? 2131821886 : 2131821885;
                    }
                } else {
                    i7 = 2131821884;
                }
            }
            this.f64720g.showEmptyTips(i7);
        }
    }
}
