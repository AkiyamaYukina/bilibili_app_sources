package com.bilibili.ship.theseus.united.page.intro.module.insertedbanner;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.lib.theme.R$color;
import com.bilibili.ship.theseus.united.page.color.ActivityColorRepository;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.intro.module.insertedbanner.InsertedBanner;
import com.bilibili.ship.theseus.united.page.intro.module.insertedbanner.b;
import com.bilibili.ship.theseus.united.page.intro.module.insertedbanner.g;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import ov0.InterfaceC8269a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/insertedbanner/InsertedBannerUIComponentService.class */
@StabilityInferred(parameters = 0)
public final class InsertedBannerUIComponentService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PageReportService f100155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f100156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final InterfaceC8269a f100157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Context f100158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ActivityColorRepository f100159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f100160f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/insertedbanner/InsertedBannerUIComponentService$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f100161a;

        static {
            int[] iArr = new int[InsertedBanner.Item.NavigationType.values().length];
            try {
                iArr[InsertedBanner.Item.NavigationType.OPEN_URL.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[InsertedBanner.Item.NavigationType.HALF_SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[InsertedBanner.Item.NavigationType.OPEN_URL_BY_EXTERNAL_BROWSER.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f100161a = iArr;
        }
    }

    @Inject
    public InsertedBannerUIComponentService(@NotNull PageReportService pageReportService, @NotNull CoroutineScope coroutineScope, @NotNull InterfaceC8269a interfaceC8269a, @NotNull Context context, @NotNull ActivityColorRepository activityColorRepository, @NotNull IntroContentSizeRepository introContentSizeRepository) {
        this.f100155a = pageReportService;
        this.f100156b = coroutineScope;
        this.f100157c = interfaceC8269a;
        this.f100158d = context;
        this.f100159e = activityColorRepository;
        this.f100160f = introContentSizeRepository;
    }

    @NotNull
    public final RunningUIComponent a(@NotNull InsertedBanner insertedBanner) {
        g.a aVar = new g.a();
        String str = aVar.f100183a;
        String str2 = insertedBanner.f100148a;
        if (!Intrinsics.areEqual(str2, str)) {
            aVar.f100183a = str2;
            aVar.notifyPropertyChanged(640);
        }
        Integer numH = this.f100159e.h();
        int iIntValue = numH != null ? numH.intValue() : ContextCompat.getColor(this.f100158d, R$color.Text1);
        if (iIntValue != aVar.f100184b) {
            aVar.f100184b = iIntValue;
            aVar.notifyPropertyChanged(646);
        }
        List<InsertedBanner.Item> listA = insertedBanner.a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.bilibili.ship.theseus.united.page.intro.module.insertedbanner.a(d((InsertedBanner.Item) it.next())));
        }
        return new RunningUIComponent(new g(aVar, arrayList), 0, new InsertedBannerUIComponentService$create$1(this, aVar, null), 2);
    }

    @NotNull
    public final RunningUIComponent b(@NotNull c cVar) {
        b.a aVar = new b.a(d(cVar.f100172a), d(cVar.f100173b));
        return new RunningUIComponent(new b(aVar), 0, new InsertedBannerUIComponentService$create$3(this, aVar, null), 2);
    }

    @NotNull
    public final RunningUIComponent c(@NotNull e eVar) {
        f fVarD = d(eVar.f100175a);
        return new RunningUIComponent(new d(fVarD), 0, new InsertedBannerUIComponentService$create$2(this, fVarD, null), 2);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.bilibili.ship.theseus.united.page.intro.module.insertedbanner.h] */
    public final f d(final InsertedBanner.Item item) {
        final int i7 = 0;
        f fVar = new f(new Function0(i7, this, item) { // from class: com.bilibili.ship.theseus.united.page.intro.module.insertedbanner.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f100186a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f100187b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f100188c;

            {
                this.f100186a = i7;
                this.f100187b = this;
                this.f100188c = item;
            }

            public final Object invoke() {
                switch (this.f100186a) {
                    case 0:
                        PageReportService.i(((InsertedBannerUIComponentService) this.f100187b).f100155a, "united.player-video-detail.middle-banner.0.show", ((InsertedBanner.Item) this.f100188c).f100154d, 4);
                        break;
                    default:
                        Object[] objArr = (Object[]) ((Ref.ObjectRef) this.f100188c).element;
                        ((xb0.b) this.f100187b).b(objArr.length, objArr);
                        break;
                }
                return Unit.INSTANCE;
            }
        }, new i(this, item));
        String str = item.f100151a;
        if (!Intrinsics.areEqual(str, fVar.f100178c)) {
            fVar.f100178c = str;
            fVar.notifyPropertyChanged(291);
        }
        return fVar;
    }
}
