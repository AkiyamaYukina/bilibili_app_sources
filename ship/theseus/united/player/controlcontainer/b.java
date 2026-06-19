package com.bilibili.ship.theseus.united.player.controlcontainer;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.player.oldway.ControlContainerLazyService;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.ControlContainerType;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.widget.IControlWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/controlcontainer/b.class */
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f104435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f104436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Context f104437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ImmutableMap f104438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ImmutableSet f104439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f104440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ControlContainerLazyService f104441g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/controlcontainer/b$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f104442a;

        static {
            int[] iArr = new int[ControlContainerType.values().length];
            try {
                iArr[ControlContainerType.HALF_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[ControlContainerType.LANDSCAPE_FULLSCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[ControlContainerType.VERTICAL_FULLSCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f104442a = iArr;
        }
    }

    @Inject
    public b(@NotNull CoroutineScope coroutineScope, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull Context context, @NotNull ImmutableMap immutableMap, @NotNull ImmutableSet immutableSet, @NotNull IControlContainerService iControlContainerService, @NotNull ControlContainerLazyService controlContainerLazyService) {
        this.f104435a = coroutineScope;
        this.f104436b = hVar;
        this.f104437c = context;
        this.f104438d = immutableMap;
        this.f104439e = immutableSet;
        this.f104440f = iControlContainerService;
        this.f104441g = controlContainerLazyService;
        iControlContainerService.hide();
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new ControlContainerSetup$1(this, null), 3, (Object) null);
    }

    public static final void a(b bVar, ControlContainerType controlContainerType, com.bilibili.app.gemini.player.widget.a aVar) {
        List<Class> listD;
        List<Class> listE;
        List list;
        List listB;
        List list2;
        List listC;
        List listG;
        List listF;
        List listH;
        bVar.getClass();
        int i7 = a.f104442a[controlContainerType.ordinal()];
        IControlContainerService iControlContainerService = bVar.f104440f;
        if (i7 == 1) {
            if (!aVar.b && (listE = aVar.e()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Class cls : listE) {
                    ControlContainerType controlContainerType2 = ControlContainerType.HALF_SCREEN;
                    IControlWidget iControlWidgetA = aVar.a(cls, controlContainerType2);
                    if (iControlWidgetA != null) {
                        arrayList.add(iControlWidgetA);
                    }
                    aVar.b = iControlContainerService.insertSlotWidgets(controlContainerType2, 2131310322, arrayList);
                }
            }
            if (aVar.d || (listD = aVar.d()) == null) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Class cls2 : listD) {
                ControlContainerType controlContainerType3 = ControlContainerType.HALF_SCREEN;
                IControlWidget iControlWidgetA2 = aVar.a(cls2, controlContainerType3);
                if (iControlWidgetA2 != null) {
                    arrayList2.add(iControlWidgetA2);
                }
                aVar.d = iControlContainerService.insertSlotWidgets(controlContainerType3, 2131301071, arrayList2);
            }
            return;
        }
        if (i7 != 2) {
            if (i7 != 3) {
                return;
            }
            if (!aVar.r && (listH = aVar.h()) != null) {
                ArrayList arrayList3 = new ArrayList();
                Iterator it = listH.iterator();
                while (it.hasNext()) {
                    IControlWidget iControlWidgetA3 = aVar.a((Class) it.next(), ControlContainerType.VERTICAL_FULLSCREEN);
                    if (iControlWidgetA3 != null) {
                        arrayList3.add(iControlWidgetA3);
                    }
                }
                aVar.r = iControlContainerService.insertSlotWidgets(ControlContainerType.VERTICAL_FULLSCREEN, 2131310322, arrayList3);
            }
            if (!aVar.p && (listF = aVar.f()) != null) {
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = listF.iterator();
                while (it2.hasNext()) {
                    IControlWidget iControlWidgetA4 = aVar.a((Class) it2.next(), ControlContainerType.VERTICAL_FULLSCREEN);
                    if (iControlWidgetA4 != null) {
                        arrayList4.add(iControlWidgetA4);
                    }
                }
                aVar.p = iControlContainerService.insertSlotWidgets(ControlContainerType.VERTICAL_FULLSCREEN, 2131304960, arrayList4);
            }
            if (aVar.n || (listG = aVar.g()) == null) {
                return;
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator it3 = listG.iterator();
            while (it3.hasNext()) {
                IControlWidget iControlWidgetA5 = aVar.a((Class) it3.next(), ControlContainerType.VERTICAL_FULLSCREEN);
                if (iControlWidgetA5 != null) {
                    arrayList5.add(iControlWidgetA5);
                }
            }
            aVar.n = iControlContainerService.insertSlotWidgets(ControlContainerType.VERTICAL_FULLSCREEN, 2131304992, arrayList5);
            return;
        }
        if (!aVar.f && (listC = aVar.c()) != null) {
            ArrayList arrayList6 = new ArrayList();
            Iterator it4 = listC.iterator();
            while (it4.hasNext()) {
                IControlWidget iControlWidgetA6 = aVar.a((Class) it4.next(), ControlContainerType.LANDSCAPE_FULLSCREEN);
                if (iControlWidgetA6 != null) {
                    arrayList6.add(iControlWidgetA6);
                }
            }
            aVar.f = iControlContainerService.insertSlotWidgets(ControlContainerType.LANDSCAPE_FULLSCREEN, 2131304994, arrayList6);
        }
        if (!aVar.h && (list2 = aVar.i) != null) {
            ArrayList arrayList7 = new ArrayList();
            Iterator it5 = list2.iterator();
            while (it5.hasNext()) {
                IControlWidget iControlWidgetA7 = aVar.a((Class) it5.next(), ControlContainerType.LANDSCAPE_FULLSCREEN);
                if (iControlWidgetA7 != null) {
                    arrayList7.add(iControlWidgetA7);
                }
            }
            aVar.h = iControlContainerService.insertSlotWidgets(ControlContainerType.LANDSCAPE_FULLSCREEN, 2131313614, arrayList7);
        }
        if (!aVar.l && (listB = aVar.b()) != null) {
            ArrayList arrayList8 = new ArrayList();
            Iterator it6 = listB.iterator();
            while (it6.hasNext()) {
                IControlWidget iControlWidgetA8 = aVar.a((Class) it6.next(), ControlContainerType.LANDSCAPE_FULLSCREEN);
                if (iControlWidgetA8 != null) {
                    arrayList8.add(iControlWidgetA8);
                }
            }
            aVar.l = iControlContainerService.insertSlotWidgets(ControlContainerType.LANDSCAPE_FULLSCREEN, 2131301071, arrayList8);
        }
        if (aVar.j || (list = aVar.k) == null) {
            return;
        }
        ArrayList arrayList9 = new ArrayList();
        Iterator it7 = list.iterator();
        while (it7.hasNext()) {
            IControlWidget iControlWidgetA9 = aVar.a((Class) it7.next(), ControlContainerType.LANDSCAPE_FULLSCREEN);
            if (iControlWidgetA9 != null) {
                arrayList9.add(iControlWidgetA9);
            }
        }
        aVar.j = iControlContainerService.insertSlotWidgets(ControlContainerType.LANDSCAPE_FULLSCREEN, 2131297903, arrayList9);
    }
}
