package com.bilibili.ship.theseus.ugc.intro.mhy;

import Vn.A;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.ship.theseus.ugc.intro.mhy.d;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import ev0.InterfaceC7008a;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import javax.inject.Inject;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/mhy/UgcStarRailService.class */
@StabilityInferred(parameters = 0)
public final class UgcStarRailService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PageReportService f97079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final rW0.a<InterfaceC7008a> f97080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f97081c;

    @Inject
    public UgcStarRailService(@NotNull PageReportService pageReportService, @NotNull rW0.a<InterfaceC7008a> aVar, @NotNull IntroContentSizeRepository introContentSizeRepository) {
        this.f97079a = pageReportService;
        this.f97080b = aVar;
        this.f97081c = introContentSizeRepository;
    }

    public static final void b(a aVar, MutableStateFlow<d.C0840d> mutableStateFlow, UgcStarRailService ugcStarRailService) {
        int iNextIndex;
        ArrayList arrayList = (ArrayList) aVar.f97083b;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (listIterator.hasPrevious()) {
            int i7 = ((b) listIterator.previous()).f97088e;
            if (i7 == 2 || i7 == 1) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        iNextIndex = -1;
        int iCoerceAtLeast = RangesKt.coerceAtLeast(iNextIndex, 0);
        List<b> list = aVar.f97083b;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i8 = 0;
        for (Object obj : list) {
            if (i8 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            b bVar = (b) obj;
            StringBuilder sbB = A.b(bVar.f97088e, i8, "StarRail.toStarRail, status:", " index:", ", last:");
            sbB.append(iCoerceAtLeast);
            defpackage.a.b("[theseus-ugc-UgcStarRailService-create$updateStarRailState] ", sbB.toString(), "UgcStarRailService-create$updateStarRailState");
            boolean z6 = i8 == iCoerceAtLeast;
            ugcStarRailService.getClass();
            int i9 = bVar.f97088e;
            arrayList2.add(i9 != 1 ? i9 != 2 ? new d.c(i8, bVar.f97089f) : z6 ? new d.c(i8, bVar.f97092j) : new d.c(i8, bVar.f97091i) : z6 ? new d.c(i8, bVar.h) : new d.c(i8, bVar.f97090g));
            i8++;
        }
        mutableStateFlow.setValue(new d.C0840d(aVar.f97082a, arrayList2));
    }

    @NotNull
    public final RunningUIComponent a(@NotNull a aVar) {
        int iNextIndex;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new d.C0840d("", CollectionsKt.emptyList()));
        b(aVar, MutableStateFlow, this);
        ArrayList arrayList = (ArrayList) aVar.f97083b;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            if (((b) listIterator.previous()).f97088e == 1) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        return new RunningUIComponent(new d(RangesKt.coerceAtLeast(iNextIndex, 0), MutableStateFlow, this.f97081c.f100020a, new UgcStarRailService$create$component$1(aVar, this)), 0, new UgcStarRailService$create$1(aVar, MutableStateFlow, this, null), 2);
    }
}
