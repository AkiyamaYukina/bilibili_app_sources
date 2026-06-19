package com.bilibili.ship.theseus.united.page.intro.module.guidestrip;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import cV0.T;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.iconfont.IconFont;
import com.bilibili.iconfont.IconTextDrawable;
import com.bilibili.ship.theseus.united.page.color.ActivityColorRepository;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.intro.module.guidestrip.f;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import ov0.InterfaceC8269a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/guidestrip/GuideStripUIComponentService.class */
@StabilityInferred(parameters = 0)
public final class GuideStripUIComponentService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f100069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PageReportService f100070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final InterfaceC8269a f100071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ActivityColorRepository f100072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f100073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final e f100074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f100075g;

    @NotNull
    public final IntroContentSizeRepository h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f100076i;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/guidestrip/GuideStripUIComponentService$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f100077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f100078b;

        static {
            int[] iArr = new int[HonorJumpType.values().length];
            try {
                iArr[HonorJumpType.HONOR_JUMP_TYPE_UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[HonorJumpType.HONOR_OPEN_URL.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[HonorJumpType.HONOR_HALF_SCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[HonorJumpType.HONOR_POPUP.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            f100077a = iArr;
            int[] iArr2 = new int[HonorType.values().length];
            try {
                iArr2[HonorType.TYPE_HONOR_PROFESSION.ordinal()] = 1;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr2[HonorType.TYPE_NONE.ordinal()] = 2;
            } catch (NoSuchFieldError e12) {
            }
            f100078b = iArr2;
        }
    }

    @Inject
    public GuideStripUIComponentService(@NotNull Context context, @NotNull PageReportService pageReportService, @NotNull InterfaceC8269a interfaceC8269a, @NotNull ActivityColorRepository activityColorRepository, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull e eVar, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull IntroContentSizeRepository introContentSizeRepository, @NotNull CoroutineScope coroutineScope) {
        this.f100069a = context;
        this.f100070b = pageReportService;
        this.f100071c = interfaceC8269a;
        this.f100072d = activityColorRepository;
        this.f100073e = theseusFloatLayerService;
        this.f100074f = eVar;
        this.f100075g = aVar;
        this.h = introContentSizeRepository;
        this.f100076i = coroutineScope;
    }

    public static final void a(GuideStripUIComponentService guideStripUIComponentService, String str, String str2) {
        guideStripUIComponentService.getClass();
        PageReportService.g(guideStripUIComponentService.f100070b, "united.player-video-detail.professional-confirm-popup.button.click", MapsKt.mapOf(new Pair[]{TuplesKt.to("popup_type", str), TuplesKt.to("action_type", str2)}), 4);
    }

    @NotNull
    public final RunningUIComponent b(@NotNull GuideStripVo guideStripVo) {
        int iIntValue;
        f.a aVar = new f.a(new ExposureEntry(com.bilibili.ship.theseus.united.report.a.f104837a, new T(1, this, guideStripVo)), new g(this, guideStripVo), new h(this, guideStripVo), guideStripVo.f100088k == HonorType.TYPE_HONOR_PROFESSION);
        if (a.f100078b[guideStripVo.f100088k.ordinal()] == 2) {
            aVar.m(0);
        } else {
            aVar.m(Uj0.c.b(50, this.f100069a));
            int iA = (int) Uj0.c.a(6, this.f100069a);
            if (iA != aVar.f100136o) {
                aVar.f100136o = iA;
                aVar.notifyPropertyChanged(252);
            }
            int iA2 = (int) Uj0.c.a(12, this.f100069a);
            if (iA2 != aVar.f100137p) {
                aVar.f100137p = iA2;
                aVar.notifyPropertyChanged(251);
            }
        }
        if (Cj0.a.a(this.f100069a)) {
            int i7 = aVar.f100127e;
            int i8 = guideStripVo.h;
            if (i8 != i7) {
                aVar.f100127e = i8;
                aVar.notifyPropertyChanged(32);
            }
            int i9 = aVar.f100128f;
            int i10 = guideStripVo.f100084f;
            if (i10 != i9) {
                aVar.f100128f = i10;
                aVar.notifyPropertyChanged(632);
            }
            String str = aVar.f100131j;
            String str2 = guideStripVo.f100080b;
            if (!Intrinsics.areEqual(str2, str)) {
                aVar.f100131j = str2;
                aVar.notifyPropertyChanged(288);
            }
            boolean z6 = str2.length() > 0;
            if (z6 != aVar.f100133l) {
                aVar.f100133l = z6;
                aVar.notifyPropertyChanged(289);
            }
        } else {
            int i11 = aVar.f100127e;
            int i12 = guideStripVo.f100085g;
            if (i12 != i11) {
                aVar.f100127e = i12;
                aVar.notifyPropertyChanged(32);
            }
            int i13 = aVar.f100128f;
            int i14 = guideStripVo.f100083e;
            if (i14 != i13) {
                aVar.f100128f = i14;
                aVar.notifyPropertyChanged(632);
            }
            String str3 = aVar.f100131j;
            String str4 = guideStripVo.f100079a;
            if (!Intrinsics.areEqual(str4, str3)) {
                aVar.f100131j = str4;
                aVar.notifyPropertyChanged(288);
            }
            boolean z7 = str4.length() > 0;
            if (z7 != aVar.f100133l) {
                aVar.f100133l = z7;
                aVar.notifyPropertyChanged(289);
            }
        }
        ActivityColorRepository activityColorRepository = this.f100072d;
        Integer numC = activityColorRepository.c();
        if (numC != null) {
            int iIntValue2 = numC.intValue();
            if (iIntValue2 != aVar.f100128f) {
                aVar.f100128f = iIntValue2;
                aVar.notifyPropertyChanged(632);
            }
            if (iIntValue2 != aVar.f100132k) {
                aVar.f100132k = iIntValue2;
                aVar.notifyPropertyChanged(287);
            }
        }
        Integer numF = activityColorRepository.f();
        if (numF != null && (iIntValue = numF.intValue()) != aVar.f100127e) {
            aVar.f100127e = iIntValue;
            aVar.notifyPropertyChanged(32);
        }
        String str5 = guideStripVo.f100091n;
        if (!StringsKt.isBlank(str5)) {
            IconTextDrawable iconDrawable = IconFont.getIconDrawable(str5, aVar.f100128f);
            if (!Intrinsics.areEqual(iconDrawable, aVar.f100138q)) {
                aVar.f100138q = iconDrawable;
                aVar.notifyPropertyChanged(185);
            }
        }
        String strD = guideStripVo.d();
        if (!Intrinsics.areEqual(strD, aVar.f100129g)) {
            aVar.f100129g = strD;
            aVar.notifyPropertyChanged(655);
        }
        String strA = guideStripVo.a();
        if (!Intrinsics.areEqual(strA, aVar.f100130i)) {
            aVar.f100130i = strA;
            aVar.notifyPropertyChanged(79);
        }
        String strC = guideStripVo.c();
        if (!Intrinsics.areEqual(strC, aVar.h)) {
            aVar.h = strC;
            aVar.notifyPropertyChanged(621);
        }
        return new RunningUIComponent(new f(aVar, this.h.f100020a), 0, new GuideStripUIComponentService$create$1(this, guideStripVo, aVar, null), 2);
    }
}
