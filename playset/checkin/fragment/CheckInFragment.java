package com.bilibili.playset.checkin.fragment;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.base.viewbinding.ViewBindingProperty;
import com.bilibili.base.viewbinding.full.CreateMethod;
import com.bilibili.base.viewbinding.full.ReflectionFragmentViewBindings;
import com.bilibili.base.viewbinding.internal.UtilsKt;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.swiperefresh.BaseSwipeRefreshFragment;
import com.bilibili.lib.ui.theme.ThemeWatcher;
import com.bilibili.live.streaming.source.CommonSource;
import com.bilibili.magicasakura.widgets.TintProgressDialog;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.playset.C5898c;
import com.bilibili.playset.Q0;
import com.bilibili.playset.api.CheckInService;
import com.bilibili.playset.checkin.CheckInData;
import com.bilibili.playset.checkin.CheckInFinishedList;
import com.bilibili.playset.checkin.CheckInItem;
import com.bilibili.playset.checkin.CheckInList;
import com.bilibili.playset.checkin.CheckInType;
import com.bilibili.playset.checkin.Page;
import com.bilibili.playset.dialog.CheckInBottomSheet;
import com.bilibili.pvtracker.IPvTracker;
import es0.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import ks0.InterfaceC7786b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.dialog.BiliCommonDialog;
import tv.danmaku.bili.widget.dialog.CustomButtonInfo;
import ys0.C9082a;
import ys0.C9087f;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/checkin/fragment/CheckInFragment.class */
@StabilityInferred(parameters = 0)
public final class CheckInFragment extends BaseSwipeRefreshFragment implements ThemeWatcher.Observer, CheckInBottomSheet.b, IPvTracker {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final KProperty<Object>[] f84174l = {new PropertyReference1Impl(CheckInFragment.class, "binding", "getBinding()Lcom/bilibili/playset/databinding/PlaysetFragmentCheckInBinding;", 0)};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ViewBindingProperty f84175b = ReflectionFragmentViewBindings.viewBindingFragment(this, p.class, CreateMethod.INFLATE, UtilsKt.emptyVbCallback());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public C5898c f84176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Zr0.d f84177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public C9087f f84178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public TintProgressDialog f84179f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public CheckInType f84180g;

    @NotNull
    public final Lazy h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final e f84181i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final f f84182j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final g f84183k;

    /* JADX WARN: Type inference failed for: r1v6, types: [com.bilibili.playset.checkin.fragment.e] */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.bilibili.playset.checkin.fragment.f] */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.bilibili.playset.checkin.fragment.g] */
    public CheckInFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.playset.checkin.fragment.CheckInFragment$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m8464invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.playset.checkin.fragment.CheckInFragment$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m8465invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.h = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(Yr0.h.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.playset.checkin.fragment.CheckInFragment$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m8466invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.playset.checkin.fragment.CheckInFragment$special$$inlined$viewModels$default$4
            final Function0 $extrasProducer;
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$extrasProducer = function02;
                this.$owner$delegate = lazy;
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.lifecycle.viewmodel.CreationExtras m8467invoke() {
                /*
                    r2 = this;
                    r0 = r2
                    kotlin.jvm.functions.Function0 r0 = r0.$extrasProducer
                    r3 = r0
                    r0 = r3
                    if (r0 == 0) goto L19
                    r0 = r3
                    java.lang.Object r0 = r0.invoke()
                    androidx.lifecycle.viewmodel.CreationExtras r0 = (androidx.lifecycle.viewmodel.CreationExtras) r0
                    r4 = r0
                    r0 = r4
                    r3 = r0
                    r0 = r4
                    if (r0 != 0) goto L44
                L19:
                    r0 = r2
                    kotlin.Lazy r0 = r0.$owner$delegate
                    androidx.lifecycle.ViewModelStoreOwner r0 = androidx.fragment.app.FragmentViewModelLazyKt.m4417access$viewModels$lambda1(r0)
                    r3 = r0
                    r0 = r3
                    boolean r0 = r0 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
                    if (r0 == 0) goto L30
                    r0 = r3
                    androidx.lifecycle.HasDefaultViewModelProviderFactory r0 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r0
                    r3 = r0
                    goto L32
                L30:
                    r0 = 0
                    r3 = r0
                L32:
                    r0 = r3
                    if (r0 == 0) goto L40
                    r0 = r3
                    androidx.lifecycle.viewmodel.CreationExtras r0 = r0.getDefaultViewModelCreationExtras()
                    r3 = r0
                    goto L44
                L40:
                    androidx.lifecycle.viewmodel.CreationExtras$Empty r0 = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE
                    r3 = r0
                L44:
                    r0 = r3
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.checkin.fragment.CheckInFragment$special$$inlined$viewModels$default$4.m8467invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.playset.checkin.fragment.CheckInFragment$special$$inlined$viewModels$default$5
            final Lazy $owner$delegate;
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
                this.$owner$delegate = lazy;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.lifecycle.ViewModelProvider.Factory m8468invoke() {
                /*
                    r2 = this;
                    r0 = r2
                    kotlin.Lazy r0 = r0.$owner$delegate
                    androidx.lifecycle.ViewModelStoreOwner r0 = androidx.fragment.app.FragmentViewModelLazyKt.m4417access$viewModels$lambda1(r0)
                    r3 = r0
                    r0 = r3
                    boolean r0 = r0 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
                    if (r0 == 0) goto L17
                    r0 = r3
                    androidx.lifecycle.HasDefaultViewModelProviderFactory r0 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r0
                    r3 = r0
                    goto L19
                L17:
                    r0 = 0
                    r3 = r0
                L19:
                    r0 = r3
                    if (r0 == 0) goto L2a
                    r0 = r3
                    androidx.lifecycle.ViewModelProvider$Factory r0 = r0.getDefaultViewModelProviderFactory()
                    r4 = r0
                    r0 = r4
                    r3 = r0
                    r0 = r4
                    if (r0 != 0) goto L32
                L2a:
                    r0 = r2
                    androidx.fragment.app.Fragment r0 = r0.$this_viewModels
                    androidx.lifecycle.ViewModelProvider$Factory r0 = r0.getDefaultViewModelProviderFactory()
                    r3 = r0
                L32:
                    r0 = r3
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.checkin.fragment.CheckInFragment$special$$inlined$viewModels$default$5.m8468invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
        this.f84181i = new Observer(this) { // from class: com.bilibili.playset.checkin.fragment.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CheckInFragment f84203a;

            {
                this.f84203a = this;
            }

            /* JADX WARN: Type inference failed for: r0v160, types: [java.lang.Object, ys0.a$a] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, ys0.a$a] */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                C5898c.a aVar;
                Zr0.d dVar;
                List<InterfaceC7786b> items;
                Integer hasMore;
                Integer total;
                List<InterfaceC7786b> items2;
                Integer hasMore2;
                Integer total2;
                Pair pair = (Pair) obj;
                KProperty<Object>[] kPropertyArr = CheckInFragment.f84174l;
                int iIntValue = ((Number) pair.getFirst()).intValue();
                CheckInFragment checkInFragment = this.f84203a;
                if (iIntValue == 0) {
                    checkInFragment.setRefreshStart();
                    return;
                }
                if (iIntValue != 1) {
                    if (iIntValue != 2) {
                        return;
                    }
                    checkInFragment.setRefreshCompleted();
                    RecyclerView recyclerView = checkInFragment.kf().f117461b;
                    C9087f c9087f = checkInFragment.f84178e;
                    if (c9087f != null) {
                        recyclerView.removeItemDecoration(c9087f);
                    }
                    ?? obj2 = new Object();
                    obj2.f129826b = 2131235614;
                    obj2.f129825a = !ConnectivityMonitor.getInstance().isNetworkActive() ? 2131846984 : 2131841412;
                    recyclerView.setAdapter(new C9082a(obj2));
                    return;
                }
                checkInFragment.setRefreshCompleted();
                CheckInData checkInData = (CheckInData) pair.getSecond();
                if (checkInData == null) {
                    RecyclerView recyclerView2 = checkInFragment.kf().f117461b;
                    ?? obj3 = new Object();
                    obj3.f129826b = 2131235594;
                    obj3.f129825a = 2131841736;
                    recyclerView2.setAdapter(new C9082a(obj3));
                    return;
                }
                ArrayList arrayList = new ArrayList();
                CheckInList current = checkInData.getCurrent();
                if (current != null) {
                    Page page = current.getPage();
                    current.setTotalCount((page == null || (total2 = page.getTotal()) == null) ? 0 : total2.intValue());
                    List<InterfaceC7786b> items3 = current.getItems();
                    InterfaceC7786b interfaceC7786b = (items3 == null || items3.isEmpty()) ? null : current.getItems().get(current.getItems().size() - 1);
                    boolean z6 = interfaceC7786b instanceof com.bilibili.playset.api.f;
                    com.bilibili.playset.api.f fVar = z6 ? (com.bilibili.playset.api.f) interfaceC7786b : new com.bilibili.playset.api.f();
                    Page page2 = current.getPage();
                    if (page2 == null || (hasMore2 = page2.getHasMore()) == null || hasMore2.intValue() != 1) {
                        fVar.f84073a = 3;
                    } else {
                        fVar.f84073a = 1;
                    }
                    if (!z6 && (items2 = current.getItems()) != null) {
                        items2.add(fVar);
                    }
                    arrayList.add(current);
                }
                CheckInFinishedList past = checkInData.getPast();
                if (past != null) {
                    Page page3 = past.getPage();
                    past.setTotalCount((page3 == null || (total = page3.getTotal()) == null) ? 0 : total.intValue());
                    List<InterfaceC7786b> items4 = past.getItems();
                    InterfaceC7786b interfaceC7786b2 = null;
                    if (items4 != null) {
                        interfaceC7786b2 = items4.isEmpty() ? null : past.getItems().get(past.getItems().size() - 1);
                    }
                    boolean z7 = interfaceC7786b2 instanceof com.bilibili.playset.api.f;
                    com.bilibili.playset.api.f fVar2 = z7 ? (com.bilibili.playset.api.f) interfaceC7786b2 : new com.bilibili.playset.api.f();
                    Page page4 = past.getPage();
                    if (page4 == null || (hasMore = page4.getHasMore()) == null || hasMore.intValue() != 1) {
                        fVar2.f84073a = 3;
                    } else {
                        fVar2.f84073a = 1;
                    }
                    if (!z7 && (items = past.getItems()) != null) {
                        items.add(fVar2);
                    }
                    arrayList.add(past);
                }
                Zr0.d dVar2 = checkInFragment.f84177d;
                if (dVar2 != null) {
                    dVar2.f123367a.f123360a.clear();
                    dVar2.notifyItemRangeRemoved(0, dVar2.getItemCount());
                }
                checkInFragment.f84177d = new Zr0.d(checkInFragment, arrayList);
                C9087f c9087f2 = checkInFragment.f84178e;
                if (c9087f2 != null) {
                    c9087f2.a();
                }
                RecyclerView recyclerView3 = checkInFragment.kf().f117461b;
                checkInFragment.f84178e = new C9087f(recyclerView3, checkInFragment.f84177d);
                recyclerView3.stopScroll();
                recyclerView3.addItemDecoration(checkInFragment.f84178e);
                recyclerView3.setAdapter(checkInFragment.f84177d);
                C5898c c5898c = checkInFragment.f84176c;
                if (c5898c == null || (aVar = c5898c.f84125n) == null || (dVar = checkInFragment.f84177d) == null) {
                    return;
                }
                dVar.registerAdapterDataObserver(aVar);
            }
        };
        this.f84182j = new Observer(this) { // from class: com.bilibili.playset.checkin.fragment.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CheckInFragment f84204a;

            {
                this.f84204a = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                Pair pair = (Pair) obj;
                KProperty<Object>[] kPropertyArr = CheckInFragment.f84174l;
                Bundle bundle = (Bundle) pair.getSecond();
                int iIntValue = ((Number) pair.getFirst()).intValue();
                CheckInFragment checkInFragment = this.f84204a;
                Integer numValueOf = null;
                if (iIntValue == 0) {
                    checkInFragment.f84179f = TintProgressDialog.show(checkInFragment.getContext(), null, checkInFragment.getResources().getString(2131842520), true, false);
                    return;
                }
                if (iIntValue != 1) {
                    if (iIntValue != 2) {
                        return;
                    }
                    TintProgressDialog tintProgressDialog = checkInFragment.f84179f;
                    if (tintProgressDialog != null) {
                        tintProgressDialog.dismiss();
                    }
                    ToastHelper.showToastShort(checkInFragment.getContext(), 2131842570);
                    return;
                }
                TintProgressDialog tintProgressDialog2 = checkInFragment.f84179f;
                if (tintProgressDialog2 != null) {
                    tintProgressDialog2.dismiss();
                }
                ToastHelper.showToastShort(checkInFragment.getContext(), 2131842464);
                if (checkInFragment.f84177d == null) {
                    return;
                }
                String string = bundle != null ? bundle.getString("check_in_id") : null;
                if (bundle != null) {
                    numValueOf = Integer.valueOf(bundle.getInt("check_in_group"));
                }
                Zr0.d dVar = checkInFragment.f84177d;
                if (dVar != null) {
                    dVar.S(numValueOf, string);
                }
            }
        };
        this.f84183k = new Observer(this) { // from class: com.bilibili.playset.checkin.fragment.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CheckInFragment f84205a;

            {
                this.f84205a = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                Pair pair = (Pair) obj;
                KProperty<Object>[] kPropertyArr = CheckInFragment.f84174l;
                Bundle bundle = (Bundle) pair.getSecond();
                int iIntValue = ((Number) pair.getFirst()).intValue();
                CheckInFragment checkInFragment = this.f84205a;
                Integer numValueOf = null;
                if (iIntValue == 0) {
                    checkInFragment.f84179f = TintProgressDialog.show(checkInFragment.getContext(), null, checkInFragment.getResources().getString(2131842625), true, false);
                    return;
                }
                if (iIntValue != 1) {
                    if (iIntValue != 2) {
                        return;
                    }
                    TintProgressDialog tintProgressDialog = checkInFragment.f84179f;
                    if (tintProgressDialog != null) {
                        tintProgressDialog.dismiss();
                    }
                    ToastHelper.showToastShort(checkInFragment.getContext(), 2131842618);
                    return;
                }
                TintProgressDialog tintProgressDialog2 = checkInFragment.f84179f;
                if (tintProgressDialog2 != null) {
                    tintProgressDialog2.dismiss();
                }
                ToastHelper.showToastShort(checkInFragment.getContext(), 2131842565);
                if (checkInFragment.f84177d == null) {
                    return;
                }
                String string = bundle != null ? bundle.getString("check_in_id") : null;
                if (bundle != null) {
                    numValueOf = Integer.valueOf(bundle.getInt("check_in_group"));
                }
                Zr0.d dVar = checkInFragment.f84177d;
                if (dVar != null) {
                    dVar.S(numValueOf, string);
                }
            }
        };
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "main.my-favorite-clockin.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @Nullable
    public final Bundle getPvExtra() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, tv.danmaku.bili.widget.dialog.BiliCommonDialog$OnDialogTextClickListener] */
    /* JADX WARN: Type inference failed for: r2v21, types: [android.content.DialogInterface$OnClickListener, java.lang.Object] */
    @Override // com.bilibili.playset.dialog.CheckInBottomSheet.b
    public final void h(int i7) {
        String str;
        Integer checkInType;
        Integer checkInType2;
        String sourceId = null;
        if (i7 != 0) {
            switch (i7) {
                case 14:
                    BLRouter.routeTo$default(new RouteRequest.Builder(Uri.parse("bilibili://main/checkin/notice")).extras(new YL.h(this, 1)).build(), (Context) null, 2, (Object) null);
                    str = "每日提醒";
                    break;
                case 15:
                    BLRouter.routeTo$default(new RouteRequest.Builder(Uri.parse("bilibili://main/checkin/history")).extras(new YL.f(this, 2)).build(), (Context) null, 2, (Object) null);
                    str = "查看记录";
                    break;
                case 16:
                    CheckInType checkInType3 = this.f84180g;
                    int iIntValue = (checkInType3 == null || (checkInType2 = checkInType3.getCheckInType()) == null) ? 0 : checkInType2.intValue();
                    if (iIntValue == 1) {
                        Context context = getContext();
                        if (context != null) {
                            BiliCommonDialog.Builder.setNegativeButton$default(BiliCommonDialog.Builder.setPositiveButton$default(new BiliCommonDialog.Builder(context).setTitle(2131842617), 2131842632, new BiliCommonDialog.OnDialogTextClickListener(this) { // from class: com.bilibili.playset.checkin.fragment.a

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final CheckInFragment f84201a;

                                {
                                    this.f84201a = this;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:6:0x0042  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public final void onDialogTextClicked(android.view.View r7, tv.danmaku.bili.widget.dialog.BiliCommonDialog r8) {
                                    /*
                                        Method dump skipped, instruction units count: 201
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.checkin.fragment.a.onDialogTextClicked(android.view.View, tv.danmaku.bili.widget.dialog.BiliCommonDialog):void");
                                }
                            }, false, (CustomButtonInfo) null, 12, (Object) null), 2131841721, (BiliCommonDialog.OnDialogTextClickListener) new Object(), false, (CustomButtonInfo) null, 12, (Object) null).build().show(getChildFragmentManager(), "check-in-cancel");
                        }
                    } else if (iIntValue == 2) {
                        ToastHelper.showToastLong(getContext(), 2131842490);
                    }
                    str = "取消参与";
                    break;
                case 17:
                    new AlertDialog.Builder(getContext()).setTitle("").setMessage(getString(2131842508)).setNegativeButton(2131841494, (DialogInterface.OnClickListener) new Object()).setPositiveButton(2131841455, new DialogInterface.OnClickListener(this) { // from class: com.bilibili.playset.checkin.fragment.d

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final CheckInFragment f84202a;

                        {
                            this.f84202a = this;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:6:0x0048  */
                        @Override // android.content.DialogInterface.OnClickListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final void onClick(android.content.DialogInterface r7, int r8) {
                            /*
                                Method dump skipped, instruction units count: 204
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.checkin.fragment.d.onClick(android.content.DialogInterface, int):void");
                        }
                    }).show();
                    str = "删除打卡";
                    break;
                default:
                    str = null;
                    break;
            }
        } else {
            str = "取消";
        }
        if (str == null) {
            return;
        }
        CheckInType checkInType4 = this.f84180g;
        boolean z6 = checkInType4 instanceof CheckInItem;
        if (checkInType4 != null) {
            sourceId = checkInType4.getSourceId();
        }
        CheckInType checkInType5 = this.f84180g;
        int iIntValue2 = (checkInType5 == null || (checkInType = checkInType5.getCheckInType()) == null) ? 0 : checkInType.intValue();
        HashMap mapA = pf.f.a(4, "option", str, CommonSource.SOURCE_ID, sourceId);
        mapA.put("card_sort", Integer.toString(z6 ? 1 : 0));
        mapA.put("checkin_type", Integer.toString(iIntValue2));
        Neurons.reportClick(false, "main.my-favorite-clockin.option-more.option-more-floating.click", mapA);
    }

    public final p kf() {
        return (p) this.f84175b.getValue(this, f84174l[0]);
    }

    public final void lf() {
        BiliAccounts biliAccounts = BiliAccounts.get(getContext());
        Yr0.h hVarMf = mf();
        long jMid = biliAccounts.mid();
        ((Q0) hVarMf.f29076a.getValue()).setValue(TuplesKt.to(0, (Object) null));
        ((CheckInService) ServiceGenerator.createService(CheckInService.class)).getCheckInList(jMid, 3, 0).enqueue(new Yr0.d(hVarMf));
    }

    public final Yr0.h mf() {
        return (Yr0.h) this.h.getValue();
    }

    @Override // com.bilibili.lib.ui.swiperefresh.BaseSwipeRefreshFragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable SwipeRefreshLayout swipeRefreshLayout, @Nullable Bundle bundle) {
        return kf().f117460a;
    }

    @Override // com.bilibili.lib.ui.swiperefresh.BaseSwipeRefreshFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ThemeWatcher.getInstance().unSubscribe(this);
        TintProgressDialog tintProgressDialog = this.f84179f;
        if (tintProgressDialog != null) {
            tintProgressDialog.dismiss();
        }
    }

    @Override // com.bilibili.lib.ui.swiperefresh.BaseSwipeRefreshFragment, androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public final void onRefresh() {
        super.onRefresh();
        lf();
    }

    @Override // com.bilibili.lib.ui.theme.ThemeWatcher.Observer
    public final void onThemeChanged() {
        C9087f c9087f = this.f84178e;
        if (c9087f != null) {
            ((HashMap) c9087f.f129851e).clear();
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = kf().f117461b;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        if (recyclerView.getItemAnimator() == null || this.f84176c == null) {
            C5898c c5898c = new C5898c();
            this.f84176c = c5898c;
            c5898c.setAddDuration(200L);
            c5898c.setRemoveDuration(200L);
            C5898c c5898c2 = this.f84176c;
            if (c5898c2 != null) {
                c5898c2.f84123l = recyclerView;
            }
            recyclerView.setItemAnimator(c5898c2);
        }
        Zr0.d dVar = this.f84177d;
        if (dVar != null) {
            C9087f c9087f = this.f84178e;
            if (c9087f != null) {
                c9087f.a();
            }
            this.f84178e = new C9087f(kf().f117461b, dVar);
            RecyclerView recyclerView2 = kf().f117461b;
            recyclerView2.stopScroll();
            recyclerView2.addItemDecoration(this.f84178e);
            recyclerView2.setAdapter(this.f84177d);
        }
        ((Q0) mf().f29076a.getValue()).observe(getViewLifecycleOwner(), this.f84181i);
        ((Q0) mf().f29077b.getValue()).observe(getViewLifecycleOwner(), this.f84182j);
        ((Q0) mf().f29081f.getValue()).observe(getViewLifecycleOwner(), this.f84183k);
        lf();
        ThemeWatcher.getInstance().subscribe(this);
    }
}
