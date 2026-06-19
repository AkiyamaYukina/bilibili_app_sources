package com.bilibili.lib.projection.internal.search.searchv2;

import De0.AbstractC1568a;
import De0.C1563A;
import De0.C1569b;
import De0.C1572e;
import De0.C1585s;
import De0.C1587u;
import De0.C1589w;
import De0.C1590x;
import De0.C1591y;
import De0.C1592z;
import De0.F;
import De0.G;
import De0.H;
import De0.I;
import Ec.o;
import L3.n0;
import com.bilibili.lib.projection.ProjectionClientConfig;
import com.bilibili.lib.projection.commonburid.CastEventTrackingManager;
import com.bilibili.lib.projection.internal.api.model.ProjectionOperationConfig;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import he0.e;
import ie0.C7564c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.collection.Collections;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/searchv2/SearchPanelExtKt.class */
public final class SearchPanelExtKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy f63780a = LazyKt.lazy(new n0(5));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/searchv2/SearchPanelExtKt$a.class */
    public static final class a implements e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SearchPanelContainer f63781a;

        public a(SearchPanelContainer searchPanelContainer) {
            this.f63781a = searchPanelContainer;
        }

        @Override // he0.e.a
        public final void a() {
            List<? extends AbstractC1568a> list;
            C7564c c7564c = C7564c.f121625a;
            SearchPanelContainer searchPanelContainer = this.f63781a;
            InterfaceC7845m interfaceC7845mH = c7564c.h(searchPanelContainer.getPanelInfo().f63788b);
            C1563A c1563a = null;
            ProjectionClientConfig config = interfaceC7845mH != null ? interfaceC7845mH.getConfig() : null;
            F rvAdapter$biliscreencast_release = searchPanelContainer.getRvAdapter$biliscreencast_release();
            int i7 = -1;
            if (rvAdapter$biliscreencast_release != null) {
                List<? extends AbstractC1568a> list2 = rvAdapter$biliscreencast_release.f2744g;
                i7 = -1;
                if (list2 != null) {
                    Iterator<? extends AbstractC1568a> it = list2.iterator();
                    int i8 = 0;
                    while (true) {
                        i7 = -1;
                        if (!it.hasNext()) {
                            break;
                        }
                        if (it.next() instanceof C1563A) {
                            i7 = i8;
                            break;
                        }
                        i8++;
                    }
                }
            }
            if (i7 >= 0) {
                F rvAdapter$biliscreencast_release2 = searchPanelContainer.getRvAdapter$biliscreencast_release();
                AbstractC1568a abstractC1568a = (rvAdapter$biliscreencast_release2 == null || (list = rvAdapter$biliscreencast_release2.f2744g) == null) ? null : list.get(i7);
                if (abstractC1568a instanceof C1563A) {
                    c1563a = (C1563A) abstractC1568a;
                }
                if (c1563a != null) {
                    c1563a.f2727a = searchPanelContainer.getSearchTipInList();
                    c1563a.f2728b = config;
                    c1563a.f2729c = Integer.valueOf(searchPanelContainer.getPanelInfo().f63788b);
                    c1563a.f2730d = searchPanelContainer.getHasOperationClosed();
                }
                F rvAdapter$biliscreencast_release3 = searchPanelContainer.getRvAdapter$biliscreencast_release();
                if (rvAdapter$biliscreencast_release3 != null) {
                    rvAdapter$biliscreencast_release3.notifyItemChanged(i7);
                }
            }
            SearchBottomArea bottomArea = searchPanelContainer.getBottomArea();
            if (bottomArea != null) {
                bottomArea.setOperationVisible(!searchPanelContainer.getSearchTipInList());
            }
            SearchBottomArea bottomArea2 = searchPanelContainer.getBottomArea();
            if (bottomArea2 != null) {
                bottomArea2.a(config, searchPanelContainer.getPanelInfo().f63788b, searchPanelContainer.getHasOperationClosed(), new o(searchPanelContainer, 1));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(@org.jetbrains.annotations.NotNull com.bilibili.lib.projection.internal.search.searchv2.SearchPanelContainer r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.search.searchv2.SearchPanelExtKt.a(com.bilibili.lib.projection.internal.search.searchv2.SearchPanelContainer, boolean):void");
    }

    public static final void b(@NotNull SearchPanelContainer searchPanelContainer) {
        int i7;
        List<? extends AbstractC1568a> list;
        List<? extends AbstractC1568a> list2;
        List<? extends AbstractC1568a> list3;
        F rvAdapter$biliscreencast_release = searchPanelContainer.getRvAdapter$biliscreencast_release();
        if (rvAdapter$biliscreencast_release == null || (list3 = rvAdapter$biliscreencast_release.f2744g) == null) {
            i7 = -1;
        } else {
            i7 = 0;
            for (AbstractC1568a abstractC1568a : list3) {
                if ((abstractC1568a instanceof C1585s) && ((C1585s) abstractC1568a).f2871a == 1) {
                    break;
                } else {
                    i7++;
                }
            }
            i7 = -1;
        }
        if (i7 >= 0) {
            F rvAdapter$biliscreencast_release2 = searchPanelContainer.getRvAdapter$biliscreencast_release();
            AbstractC1568a abstractC1568a2 = (rvAdapter$biliscreencast_release2 == null || (list2 = rvAdapter$biliscreencast_release2.f2744g) == null) ? null : list2.get(i7);
            C1585s c1585s = abstractC1568a2 instanceof C1585s ? (C1585s) abstractC1568a2 : null;
            if (!searchPanelContainer.getVehicleDevices$biliscreencast_release().isEmpty()) {
                if (c1585s != null) {
                    c1585s.f2872b = true;
                }
                if (c1585s != null) {
                    c1585s.f2873c = searchPanelContainer.getVehicleDevices$biliscreencast_release();
                }
                if (c1585s != null) {
                    c1585s.f2874d = searchPanelContainer.getPanelInfo();
                }
                if (c1585s != null) {
                    c1585s.f2875e = searchPanelContainer.getSearchCallback$biliscreencast_release();
                }
            } else if (c1585s != null) {
                c1585s.f2872b = false;
            }
            F rvAdapter$biliscreencast_release3 = searchPanelContainer.getRvAdapter$biliscreencast_release();
            if (rvAdapter$biliscreencast_release3 != null) {
                rvAdapter$biliscreencast_release3.notifyItemChanged(i7);
            }
        }
        F rvAdapter$biliscreencast_release4 = searchPanelContainer.getRvAdapter$biliscreencast_release();
        int i8 = -1;
        if (rvAdapter$biliscreencast_release4 != null) {
            List<? extends AbstractC1568a> list4 = rvAdapter$biliscreencast_release4.f2744g;
            i8 = -1;
            if (list4 != null) {
                Iterator<? extends AbstractC1568a> it = list4.iterator();
                int i9 = 0;
                while (true) {
                    i8 = -1;
                    if (!it.hasNext()) {
                        break;
                    }
                    AbstractC1568a next = it.next();
                    if ((next instanceof C1589w) && ((C1589w) next).f2878a) {
                        i8 = i9;
                        break;
                    }
                    i9++;
                }
            }
        }
        if (i8 >= 0) {
            boolean zIsEmpty = searchPanelContainer.getVehicleDevices$biliscreencast_release().isEmpty();
            F rvAdapter$biliscreencast_release5 = searchPanelContainer.getRvAdapter$biliscreencast_release();
            AbstractC1568a abstractC1568a3 = (rvAdapter$biliscreencast_release5 == null || (list = rvAdapter$biliscreencast_release5.f2744g) == null) ? null : list.get(i8);
            C1589w c1589w = abstractC1568a3 instanceof C1589w ? (C1589w) abstractC1568a3 : null;
            if (c1589w != null) {
                c1589w.f2879b = !zIsEmpty;
            }
            F rvAdapter$biliscreencast_release6 = searchPanelContainer.getRvAdapter$biliscreencast_release();
            if (rvAdapter$biliscreencast_release6 != null) {
                rvAdapter$biliscreencast_release6.notifyItemChanged(i8);
            }
        }
    }

    public static final void c(@NotNull SearchPanelContainer searchPanelContainer, boolean z6) {
        List<? extends AbstractC1568a> list;
        int i7 = 0;
        boolean searchTipInList = !searchPanelContainer.f63768n ? true : z6 ? false : searchPanelContainer.getSearchTipInList();
        if (searchTipInList) {
            SearchBottomArea bottomArea = searchPanelContainer.getBottomArea();
            if (bottomArea != null) {
                bottomArea.setVisibility(8);
            }
        } else {
            SearchBottomArea bottomArea2 = searchPanelContainer.getBottomArea();
            if (bottomArea2 != null) {
                bottomArea2.setVisibility(0);
            }
        }
        F rvAdapter$biliscreencast_release = searchPanelContainer.getRvAdapter$biliscreencast_release();
        int i8 = -1;
        if (rvAdapter$biliscreencast_release != null) {
            List<? extends AbstractC1568a> list2 = rvAdapter$biliscreencast_release.f2744g;
            i8 = -1;
            if (list2 != null) {
                Iterator<? extends AbstractC1568a> it = list2.iterator();
                while (true) {
                    i8 = -1;
                    if (!it.hasNext()) {
                        break;
                    }
                    if (it.next() instanceof C1587u) {
                        i8 = i7;
                        break;
                    }
                    i7++;
                }
            }
        }
        if (i8 >= 0) {
            F rvAdapter$biliscreencast_release2 = searchPanelContainer.getRvAdapter$biliscreencast_release();
            C1587u c1587u = null;
            AbstractC1568a abstractC1568a = (rvAdapter$biliscreencast_release2 == null || (list = rvAdapter$biliscreencast_release2.f2744g) == null) ? null : list.get(i8);
            if (abstractC1568a instanceof C1587u) {
                c1587u = (C1587u) abstractC1568a;
            }
            if (c1587u != null) {
                c1587u.f2876a = searchTipInList;
            }
            F rvAdapter$biliscreencast_release3 = searchPanelContainer.getRvAdapter$biliscreencast_release();
            if (rvAdapter$biliscreencast_release3 != null) {
                rvAdapter$biliscreencast_release3.notifyItemChanged(i8);
            }
        }
    }

    public static final void d(@NotNull SearchPanelContainer searchPanelContainer, boolean z6) {
        String lightExpand;
        String darkExpand;
        List<? extends AbstractC1568a> list;
        int i7 = 0;
        boolean searchTipInList = !searchPanelContainer.f63768n ? true : z6 ? false : searchPanelContainer.getSearchTipInList();
        InterfaceC7845m interfaceC7845mH = C7564c.f121625a.h(searchPanelContainer.getPanelInfo().f63788b);
        C1563A c1563a = null;
        ProjectionClientConfig config = interfaceC7845mH != null ? interfaceC7845mH.getConfig() : null;
        Lazy lazy = he0.e.f120842a;
        ProjectionOperationConfig projectionOperationConfigB = he0.e.b(String.valueOf(he0.e.f(config)));
        ProjectionOperationConfig.DeviceBannerConfig deviceBanner = projectionOperationConfigB != null ? projectionOperationConfigB.getDeviceBanner() : null;
        if (deviceBanner == null || (lightExpand = deviceBanner.getLightExpand()) == null || lightExpand.length() <= 0 || (darkExpand = deviceBanner.getDarkExpand()) == null || darkExpand.length() <= 0) {
            searchPanelContainer.setActDataListener(new a(searchPanelContainer));
            e.a actDataListener = searchPanelContainer.getActDataListener();
            if (actDataListener != null) {
                Collections.SafeIteratorList<e.a> safeIteratorList = he0.e.f120845d;
                if (safeIteratorList.contains(actDataListener)) {
                    return;
                }
                safeIteratorList.add(actDataListener);
                return;
            }
            return;
        }
        F rvAdapter$biliscreencast_release = searchPanelContainer.getRvAdapter$biliscreencast_release();
        int i8 = -1;
        if (rvAdapter$biliscreencast_release != null) {
            List<? extends AbstractC1568a> list2 = rvAdapter$biliscreencast_release.f2744g;
            i8 = -1;
            if (list2 != null) {
                Iterator<? extends AbstractC1568a> it = list2.iterator();
                while (true) {
                    i8 = -1;
                    if (!it.hasNext()) {
                        break;
                    }
                    if (it.next() instanceof C1563A) {
                        i8 = i7;
                        break;
                    }
                    i7++;
                }
            }
        }
        if (i8 >= 0) {
            F rvAdapter$biliscreencast_release2 = searchPanelContainer.getRvAdapter$biliscreencast_release();
            AbstractC1568a abstractC1568a = (rvAdapter$biliscreencast_release2 == null || (list = rvAdapter$biliscreencast_release2.f2744g) == null) ? null : list.get(i8);
            if (abstractC1568a instanceof C1563A) {
                c1563a = (C1563A) abstractC1568a;
            }
            if (c1563a != null) {
                c1563a.f2727a = searchTipInList;
                c1563a.f2728b = config;
                c1563a.f2729c = Integer.valueOf(searchPanelContainer.getPanelInfo().f63788b);
                c1563a.f2730d = searchPanelContainer.getHasOperationClosed();
            }
            F rvAdapter$biliscreencast_release3 = searchPanelContainer.getRvAdapter$biliscreencast_release();
            if (rvAdapter$biliscreencast_release3 != null) {
                rvAdapter$biliscreencast_release3.notifyItemChanged(i8);
            }
        }
        SearchBottomArea bottomArea = searchPanelContainer.getBottomArea();
        if (bottomArea != null) {
            bottomArea.setOperationVisible(!searchTipInList);
        }
        SearchBottomArea bottomArea2 = searchPanelContainer.getBottomArea();
        if (bottomArea2 != null) {
            bottomArea2.a(config, searchPanelContainer.getPanelInfo().f63788b, searchPanelContainer.getHasOperationClosed(), new Ec.l(searchPanelContainer, 2));
        }
    }

    public static final void e(@NotNull SearchPanelContainer searchPanelContainer) {
        int i7;
        List<? extends AbstractC1568a> list;
        List<? extends AbstractC1568a> list2;
        List<? extends AbstractC1568a> list3;
        F rvAdapter$biliscreencast_release = searchPanelContainer.getRvAdapter$biliscreencast_release();
        if (rvAdapter$biliscreencast_release == null || (list3 = rvAdapter$biliscreencast_release.f2744g) == null) {
            i7 = -1;
        } else {
            i7 = 0;
            for (AbstractC1568a abstractC1568a : list3) {
                if ((abstractC1568a instanceof C1585s) && ((C1585s) abstractC1568a).f2871a == 3) {
                    break;
                } else {
                    i7++;
                }
            }
            i7 = -1;
        }
        if (i7 < 0) {
            return;
        }
        F rvAdapter$biliscreencast_release2 = searchPanelContainer.getRvAdapter$biliscreencast_release();
        AbstractC1568a abstractC1568a2 = (rvAdapter$biliscreencast_release2 == null || (list2 = rvAdapter$biliscreencast_release2.f2744g) == null) ? null : list2.get(i7);
        C1585s c1585s = abstractC1568a2 instanceof C1585s ? (C1585s) abstractC1568a2 : null;
        if (!searchPanelContainer.getThirdPartyDevices$biliscreencast_release().isEmpty()) {
            if (c1585s != null) {
                c1585s.f2872b = true;
            }
            if (c1585s != null) {
                c1585s.f2873c = searchPanelContainer.getThirdPartyDevices$biliscreencast_release();
            }
            if (c1585s != null) {
                c1585s.f2874d = searchPanelContainer.getPanelInfo();
            }
            if (c1585s != null) {
                c1585s.f2875e = searchPanelContainer.getSearchCallback$biliscreencast_release();
            }
        } else if (c1585s != null) {
            c1585s.f2872b = false;
        }
        F rvAdapter$biliscreencast_release3 = searchPanelContainer.getRvAdapter$biliscreencast_release();
        if (rvAdapter$biliscreencast_release3 != null) {
            rvAdapter$biliscreencast_release3.notifyItemChanged(i7);
        }
        F rvAdapter$biliscreencast_release4 = searchPanelContainer.getRvAdapter$biliscreencast_release();
        int i8 = -1;
        if (rvAdapter$biliscreencast_release4 != null) {
            List<? extends AbstractC1568a> list4 = rvAdapter$biliscreencast_release4.f2744g;
            i8 = -1;
            if (list4 != null) {
                Iterator<? extends AbstractC1568a> it = list4.iterator();
                int i9 = 0;
                while (true) {
                    i8 = -1;
                    if (!it.hasNext()) {
                        break;
                    }
                    AbstractC1568a next = it.next();
                    if ((next instanceof I) && ((I) next).f2748b) {
                        i8 = i9;
                        break;
                    }
                    i9++;
                }
            }
        }
        if (i8 >= 0) {
            boolean zIsEmpty = searchPanelContainer.getThirdPartyDevices$biliscreencast_release().isEmpty();
            F rvAdapter$biliscreencast_release5 = searchPanelContainer.getRvAdapter$biliscreencast_release();
            AbstractC1568a abstractC1568a3 = (rvAdapter$biliscreencast_release5 == null || (list = rvAdapter$biliscreencast_release5.f2744g) == null) ? null : list.get(i8);
            I i10 = abstractC1568a3 instanceof I ? (I) abstractC1568a3 : null;
            if (i10 != null) {
                i10.f2749c = !zIsEmpty;
            }
            F rvAdapter$biliscreencast_release6 = searchPanelContainer.getRvAdapter$biliscreencast_release();
            if (rvAdapter$biliscreencast_release6 != null) {
                rvAdapter$biliscreencast_release6.notifyItemChanged(i8);
            }
        }
    }

    public static final void f(@NotNull SearchPanelContainer searchPanelContainer, @Nullable C1592z c1592z) {
        int i7;
        List<? extends AbstractC1568a> list;
        Object next;
        List<? extends AbstractC1568a> list2;
        List<? extends AbstractC1568a> list3;
        F rvAdapter$biliscreencast_release = searchPanelContainer.getRvAdapter$biliscreencast_release();
        if (rvAdapter$biliscreencast_release == null || (list3 = rvAdapter$biliscreencast_release.f2744g) == null) {
            i7 = -1;
        } else {
            i7 = 0;
            for (AbstractC1568a abstractC1568a : list3) {
                if ((abstractC1568a instanceof C1585s) && ((C1585s) abstractC1568a).f2871a == 2) {
                    break;
                } else {
                    i7++;
                }
            }
            i7 = -1;
        }
        if (i7 < 0) {
            return;
        }
        F rvAdapter$biliscreencast_release2 = searchPanelContainer.getRvAdapter$biliscreencast_release();
        AbstractC1568a abstractC1568a2 = (rvAdapter$biliscreencast_release2 == null || (list2 = rvAdapter$biliscreencast_release2.f2744g) == null) ? null : list2.get(i7);
        C1585s c1585s = abstractC1568a2 instanceof C1585s ? (C1585s) abstractC1568a2 : null;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(searchPanelContainer.getBiliTVDevices$biliscreencast_release());
        arrayList.addAll(searchPanelContainer.getPartnerDevices$biliscreencast_release());
        List arrayList2 = new ArrayList();
        if (c1592z != null) {
            List<C1590x> list4 = c1592z.f2892a;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : list4) {
                C1590x c1590x = (C1590x) obj;
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (Intrinsics.areEqual(((ProjectionDeviceInternal) next).getUuid(), c1590x.f2880a)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                if (next == null) {
                    arrayList3.add(obj);
                }
            }
            arrayList2 = CollectionsKt.toMutableList(arrayList3);
        }
        List<C1590x> mutableList = CollectionsKt.toMutableList(CollectionsKt.reversed(arrayList2));
        C1572e c1572e = C1572e.f2836a;
        int size = mutableList.size();
        c1572e.getClass();
        C1572e.f2837b = size;
        if (!mutableList.isEmpty()) {
            for (C1590x c1590x2 : mutableList) {
                C1591y c1591y = new C1591y();
                c1591y.f127202b = c1590x2.f2880a;
                c1591y.f127216q = c1590x2.f2881b;
                c1591y.f127210k = c1590x2.f2882c;
                c1591y.f2888V = c1590x2.f2884e;
                c1591y.f2889W = c1590x2.f2885f;
                c1591y.f2890X = c1590x2.f2886g;
                c1591y.f2891Y = c1590x2.h;
                arrayList.add(c1591y);
            }
        }
        if (!arrayList.isEmpty()) {
            if (c1585s != null) {
                c1585s.f2872b = true;
            }
            if (c1585s != null) {
                c1585s.f2873c = arrayList;
            }
            if (c1585s != null) {
                c1585s.f2874d = searchPanelContainer.getPanelInfo();
            }
            if (c1585s != null) {
                c1585s.f2875e = searchPanelContainer.getSearchCallback$biliscreencast_release();
            }
        } else if (c1585s != null) {
            c1585s.f2872b = false;
        }
        F rvAdapter$biliscreencast_release3 = searchPanelContainer.getRvAdapter$biliscreencast_release();
        if (rvAdapter$biliscreencast_release3 != null) {
            rvAdapter$biliscreencast_release3.notifyItemChanged(i7);
        }
        if (arrayList.isEmpty()) {
            i(searchPanelContainer, true);
        } else {
            i(searchPanelContainer, false);
        }
        if (!searchPanelContainer.getSearchTipInList()) {
            if (arrayList.isEmpty()) {
                SearchBottomArea bottomArea = searchPanelContainer.getBottomArea();
                if (bottomArea != null) {
                    bottomArea.setCastTipVisible(true);
                    return;
                }
                return;
            }
            SearchBottomArea bottomArea2 = searchPanelContainer.getBottomArea();
            if (bottomArea2 != null) {
                bottomArea2.setCastTipVisible(false);
                return;
            }
            return;
        }
        SearchBottomArea bottomArea3 = searchPanelContainer.getBottomArea();
        if (bottomArea3 != null) {
            bottomArea3.setCastTipVisible(false);
        }
        F rvAdapter$biliscreencast_release4 = searchPanelContainer.getRvAdapter$biliscreencast_release();
        int i8 = -1;
        if (rvAdapter$biliscreencast_release4 != null) {
            List<? extends AbstractC1568a> list5 = rvAdapter$biliscreencast_release4.f2744g;
            i8 = -1;
            if (list5 != null) {
                Iterator<? extends AbstractC1568a> it2 = list5.iterator();
                int i9 = 0;
                while (true) {
                    i8 = -1;
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (it2.next() instanceof C1569b) {
                        i8 = i9;
                        break;
                    }
                    i9++;
                }
            }
        }
        if (i8 >= 0) {
            F rvAdapter$biliscreencast_release5 = searchPanelContainer.getRvAdapter$biliscreencast_release();
            AbstractC1568a abstractC1568a3 = (rvAdapter$biliscreencast_release5 == null || (list = rvAdapter$biliscreencast_release5.f2744g) == null) ? null : list.get(i8);
            C1569b c1569b = abstractC1568a3 instanceof C1569b ? (C1569b) abstractC1568a3 : null;
            if (c1569b != null) {
                c1569b.f2820a = arrayList.isEmpty();
            }
            F rvAdapter$biliscreencast_release6 = searchPanelContainer.getRvAdapter$biliscreencast_release();
            if (rvAdapter$biliscreencast_release6 != null) {
                rvAdapter$biliscreencast_release6.notifyItemChanged(i8);
            }
        }
    }

    public static final void g(@NotNull SearchPanelContainer searchPanelContainer) {
        CastEventTrackingManager.Companion.instance().trackClick("main.public.screencast-panel-help.0.click", MapsKt.mapOf(new Pair[]{TuplesKt.to("help_entry", "learn_more"), TuplesKt.to("refresh_index", String.valueOf(searchPanelContainer.getRefreshCount()))}));
    }

    public static final void h(@NotNull SearchPanelContainer searchPanelContainer, boolean z6) {
        List<? extends AbstractC1568a> list;
        F rvAdapter$biliscreencast_release = searchPanelContainer.getRvAdapter$biliscreencast_release();
        int i7 = -1;
        if (rvAdapter$biliscreencast_release != null) {
            List<? extends AbstractC1568a> list2 = rvAdapter$biliscreencast_release.f2744g;
            i7 = -1;
            if (list2 != null) {
                Iterator<? extends AbstractC1568a> it = list2.iterator();
                int i8 = 0;
                while (true) {
                    i7 = -1;
                    if (!it.hasNext()) {
                        break;
                    }
                    if (it.next() instanceof H) {
                        i7 = i8;
                        break;
                    }
                    i8++;
                }
            }
        }
        if (i7 >= 0) {
            F rvAdapter$biliscreencast_release2 = searchPanelContainer.getRvAdapter$biliscreencast_release();
            H h = null;
            AbstractC1568a abstractC1568a = (rvAdapter$biliscreencast_release2 == null || (list = rvAdapter$biliscreencast_release2.f2744g) == null) ? null : list.get(i7);
            if (abstractC1568a instanceof H) {
                h = (H) abstractC1568a;
            }
            if (h != null) {
                h.f2746a = z6;
            }
            F rvAdapter$biliscreencast_release3 = searchPanelContainer.getRvAdapter$biliscreencast_release();
            if (rvAdapter$biliscreencast_release3 != null) {
                rvAdapter$biliscreencast_release3.notifyItemChanged(i7);
            }
        }
    }

    public static final void i(@NotNull SearchPanelContainer searchPanelContainer, boolean z6) {
        List<? extends AbstractC1568a> list;
        F rvAdapter$biliscreencast_release = searchPanelContainer.getRvAdapter$biliscreencast_release();
        int i7 = -1;
        if (rvAdapter$biliscreencast_release != null) {
            List<? extends AbstractC1568a> list2 = rvAdapter$biliscreencast_release.f2744g;
            i7 = -1;
            if (list2 != null) {
                Iterator<? extends AbstractC1568a> it = list2.iterator();
                int i8 = 0;
                while (true) {
                    i7 = -1;
                    if (!it.hasNext()) {
                        break;
                    }
                    if (it.next() instanceof G) {
                        i7 = i8;
                        break;
                    }
                    i8++;
                }
            }
        }
        if (i7 >= 0) {
            F rvAdapter$biliscreencast_release2 = searchPanelContainer.getRvAdapter$biliscreencast_release();
            G g7 = null;
            AbstractC1568a abstractC1568a = (rvAdapter$biliscreencast_release2 == null || (list = rvAdapter$biliscreencast_release2.f2744g) == null) ? null : list.get(i7);
            if (abstractC1568a instanceof G) {
                g7 = (G) abstractC1568a;
            }
            if (g7 != null) {
                g7.f2745a = z6;
            }
            F rvAdapter$biliscreencast_release3 = searchPanelContainer.getRvAdapter$biliscreencast_release();
            if (rvAdapter$biliscreencast_release3 != null) {
                rvAdapter$biliscreencast_release3.notifyItemChanged(i7);
            }
        }
    }
}
