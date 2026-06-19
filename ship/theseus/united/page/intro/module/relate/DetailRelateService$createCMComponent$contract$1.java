package com.bilibili.ship.theseus.united.page.intro.module.relate;

import android.graphics.Rect;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.adcommon.data.model.AdRelateItem;
import com.bilibili.adcommon.utils.ext.JSONObjectCreator;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.framework.exposure.core.ExposureEntryV;
import com.bilibili.gripper.api.ad.biz.videodetail.AdVideoExtraBuilder;
import com.bilibili.gripper.api.ad.biz.videodetail.IPanelData;
import com.bilibili.gripper.api.ad.biz.videodetail.relate.IAdRelateCallback;
import com.bilibili.gripper.api.ad.biz.widgetexpose.AdWidgetExposeData;
import com.bilibili.gripper.api.ad.core.GAdCoreKt;
import com.bilibili.gripper.api.ad.core.GAdDislike;
import com.bilibili.gripper.api.ad.core.dislike.IAdDislike;
import com.bilibili.gripper.api.ad.core.report.ReportPresetKt;
import com.bilibili.ship.theseus.united.page.intro.IntroRecycleViewService;
import com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateService;
import com.bilibili.ship.theseus.united.page.intro.module.relate.ad.RelateCMComponent;
import java.util.HashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailRelateService$createCMComponent$contract$1.class */
public final class DetailRelateService$createCMComponent$contract$1 implements IAdRelateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f100926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DetailRelateService f100927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdRelateItem f100928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ref.ObjectRef<Function0<AdWidgetExposeData>> f100929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ExposureEntryV f100930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o0 f100931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Ref.ObjectRef<RelateCMComponent> f100932g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m0 f100933i;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailRelateService$createCMComponent$contract$1$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f100934a;

        static {
            int[] iArr = new int[IAdRelateCallback.Area.values().length];
            try {
                iArr[IAdRelateCallback.Area.Card.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[IAdRelateCallback.Area.Button.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[IAdRelateCallback.Area.Other.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f100934a = iArr;
        }
    }

    public DetailRelateService$createCMComponent$contract$1(DetailRelateService detailRelateService, AdRelateItem adRelateItem, Ref.ObjectRef<Function0<AdWidgetExposeData>> objectRef, ExposureEntryV exposureEntryV, o0 o0Var, Ref.ObjectRef<RelateCMComponent> objectRef2, int i7, m0 m0Var) {
        this.f100927b = detailRelateService;
        this.f100928c = adRelateItem;
        this.f100929d = objectRef;
        this.f100930e = exposureEntryV;
        this.f100931f = o0Var;
        this.f100932g = objectRef2;
        this.h = i7;
        this.f100933i = m0Var;
    }

    public final Flow<Integer> getHorizontalPaddingFlow() {
        return this.f100927b.f100881q.f100020a;
    }

    public final CoroutineScope getScope() {
        return this.f100927b.f100866a;
    }

    public final WindowSizeClass getWindowSize() {
        return this.f100927b.f100880p.b();
    }

    public final Flow<WindowSizeClass> getWindowSizeFlow() {
        return this.f100927b.f100880p.f102939c;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onClickDislike(java.lang.String r14, long r15, com.bilibili.app.comm.list.common.data.DislikeReason r17, int r18) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateService$createCMComponent$contract$1.onClickDislike(java.lang.String, long, com.bilibili.app.comm.list.common.data.DislikeReason, int):void");
    }

    public final void onClickDislike(final String str, Rect rect, boolean z6) {
        this.f100927b.s(this.f100931f, z6);
        final m0 m0Var = this.f100933i;
        final DetailRelateService detailRelateService = this.f100927b;
        final o0 o0Var = this.f100931f;
        Function1<? super DetailRelateService.c, Unit> function1 = new Function1(detailRelateService, o0Var, m0Var) { // from class: com.bilibili.ship.theseus.united.page.intro.module.relate.N

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final DetailRelateService f101029a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final o0 f101030b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final m0 f101031c;

            {
                this.f101029a = detailRelateService;
                this.f101030b = o0Var;
                this.f101031c = m0Var;
            }

            public final Object invoke(Object obj) {
                final DetailRelateService.c cVar = (DetailRelateService.c) obj;
                DetailRelateService detailRelateService2 = this.f101029a;
                detailRelateService2.h(cVar);
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = "reason_id";
                final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                objectRef2.element = cVar.f100903d;
                DetailRelateService.DislikeType dislikeType = DetailRelateService.DislikeType.FEEDBACK_TITLE;
                DetailRelateService.DislikeType dislikeType2 = cVar.f100902c;
                if (dislikeType == dislikeType2 || DetailRelateService.DislikeType.FEEDBACK_ITEM == dislikeType2) {
                    objectRef.element = "feedback_id";
                    objectRef2.element = cVar.f100904e;
                }
                GAdDislike gAdDislike = GAdCoreKt.getGAdDislike();
                o0 o0Var2 = this.f101030b;
                AdRelateItem adRelateItem = o0Var2.f101325k.f101304k;
                String str2 = (String) objectRef.element;
                int iC = com.bilibili.ogv.infra.util.i.c((String) objectRef2.element);
                final m0 m0Var2 = this.f101031c;
                String goTo = m0Var2.f101304k.getGoTo();
                AdRelateItem adRelateItem2 = m0Var2.f101304k;
                IAdDislike.videoDislike$default(gAdDislike, (String) null, adRelateItem, Integer.valueOf(iC), Long.valueOf(adRelateItem2.getAvId()), goTo, str2, true, o0Var2.f101338x, o0Var2.f101318c.f101348e, 1, (Object) null);
                GAdCoreKt.getGAdReport().closed(o0Var2.f101325k.f101304k, (Long) null, AdVideoExtraBuilder.INSTANCE.invoke(detailRelateService2.f100867b).build());
                GAdCoreKt.getGAdReport().uiEvent("feedback_reason_click", ReportPresetKt.toReportPreset(adRelateItem2), new Function1(m0Var2, objectRef, objectRef2, cVar) { // from class: com.bilibili.ship.theseus.united.page.intro.module.relate.Q

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final m0 f101039a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Ref.ObjectRef f101040b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final Ref.ObjectRef f101041c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final DetailRelateService.c f101042d;

                    {
                        this.f101039a = m0Var2;
                        this.f101040b = objectRef;
                        this.f101041c = objectRef2;
                        this.f101042d = cVar;
                    }

                    public final Object invoke(Object obj2) {
                        JSONObjectCreator jSONObjectCreator = (JSONObjectCreator) obj2;
                        jSONObjectCreator.to("nature_ad", "1");
                        m0 m0Var3 = this.f101039a;
                        jSONObjectCreator.to(GameCardButton.extraAvid, Long.valueOf(m0Var3.f101304k.getAvId()));
                        jSONObjectCreator.to("upmid", Long.valueOf(m0Var3.f101304k.getUpperMid()));
                        jSONObjectCreator.to((String) this.f101040b.element, this.f101041c.element);
                        jSONObjectCreator.to("event_from", "video_relate");
                        DetailRelateService.c cVar2 = this.f101042d;
                        jSONObjectCreator.to("tag_id", cVar2.h);
                        jSONObjectCreator.to("rid", String.valueOf(cVar2.f100907i));
                        return Unit.INSTANCE;
                    }
                });
                return Unit.INSTANCE;
            }
        };
        final Ref.ObjectRef<RelateCMComponent> objectRef = this.f100932g;
        final int i7 = this.h;
        detailRelateService.j(rect, o0Var, z6, function1, new Function1(detailRelateService, objectRef, o0Var, i7, str, this) { // from class: com.bilibili.ship.theseus.united.page.intro.module.relate.O

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final DetailRelateService f101032a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Ref.ObjectRef f101033b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final o0 f101034c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final int f101035d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final String f101036e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final DetailRelateService$createCMComponent$contract$1 f101037f;

            {
                this.f101032a = detailRelateService;
                this.f101033b = objectRef;
                this.f101034c = o0Var;
                this.f101035d = i7;
                this.f101036e = str;
                this.f101037f = this;
            }

            public final Object invoke(Object obj) {
                RelateCMComponent relateCMComponent;
                Unit unit;
                DetailRelateService.b bVar = (DetailRelateService.b) obj;
                DetailRelateService detailRelateService2 = this.f101032a;
                IntroRecycleViewService introRecycleViewService = (IntroRecycleViewService) detailRelateService2.f100875k.get();
                if (introRecycleViewService == null || (relateCMComponent = (RelateCMComponent) this.f101033b.element) == null) {
                    unit = Unit.INSTANCE;
                } else {
                    String str2 = this.f101036e;
                    String str3 = str2;
                    if (str2 == null) {
                        str3 = "";
                    }
                    o0 o0Var2 = this.f101034c;
                    o0Var2.f101337w = str3;
                    introRecycleViewService.e(detailRelateService2.f(o0Var2, bVar, this.f101035d, new com.bilibili.compose.popup.c(1, this.f101037f, o0Var2)), relateCMComponent);
                    unit = Unit.INSTANCE;
                }
                return unit;
            }
        }, null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void onClickItem(IAdRelateCallback.Area area, Map<String, String> map) throws NoWhenBranchMatchedException {
        String str;
        int i7 = a.f100934a[area.ordinal()];
        if (i7 == 1) {
            str = "card";
        } else if (i7 == 2) {
            str = "button";
        } else {
            if (i7 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "gift";
        }
        o0 o0Var = this.f100931f;
        DetailRelateService detailRelateService = this.f100927b;
        Map mapPlus = map != null ? MapsKt.plus(map, DetailRelateService.b(detailRelateService, o0Var)) : null;
        Map mapEmptyMap = mapPlus;
        if (mapPlus == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        detailRelateService.o(o0Var, str, new HashMap<>(mapEmptyMap));
    }

    public final <T extends IPanelData> void showPanel(int i7, T t7) {
        DetailRelateService detailRelateService = this.f100927b;
        BuildersKt.launch$default(detailRelateService.f100866a, (CoroutineContext) null, (CoroutineStart) null, new DetailRelateService$createCMComponent$contract$1$showPanel$1(detailRelateService, i7, t7, null), 3, (Object) null);
    }
}
