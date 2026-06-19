package com.bilibili.ship.theseus.united.page.intro.module.relate;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.viewunite.common.ButtonMeta;
import com.bapis.bilibili.app.viewunite.common.TranslateButton;
import com.bilibili.adcommon.data.model.AdRelateItem;
import com.bilibili.adcommon.data.model.AdRelateItemKt;
import com.bilibili.app.comm.list.common.api.ListCommonApiManager;
import com.bilibili.app.comm.list.common.report.ListCommonReport;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.app.screen.adjust.widget.ScreenAdjustMenuItemData;
import com.bilibili.framework.exposure.core.ExposureEntryV;
import com.bilibili.gripper.api.ad.biz.videodetail.AdVideoExtraBuilder;
import com.bilibili.gripper.api.ad.core.GAdCoreKt;
import com.bilibili.gripper.api.ad.core.report.ExtraParams;
import com.bilibili.gripper.api.ad.core.report.IAdReporter;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.ui.menu.TitleListMenuItem;
import com.bilibili.moduleservice.main.MainCommonService;
import com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper;
import com.bilibili.pvtracker.PageViewTracker;
import com.bilibili.recommendmode.RecommendMode;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.ship.theseus.united.page.ad.AdRepository;
import com.bilibili.ship.theseus.united.page.castscreen.TheseusCastScreenRepository;
import com.bilibili.ship.theseus.united.page.color.ActivityColorRepository;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.intro.IntroRecycleViewService;
import com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.utils.UnitedDetailStackManager;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import ev0.InterfaceC7008a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import lv0.C7893a;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailRelateService.class */
@StabilityInferred(parameters = 0)
public final class DetailRelateService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f100866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f100867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f100868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f100869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f100870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ActivityColorRepository f100871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final DetailRelateRepository f100872g;

    @NotNull
    public final C8043a h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final TheseusCastScreenRepository f100873i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final PageReportService f100874j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final rW0.a<IntroRecycleViewService> f100875k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final rW0.a<InterfaceC7008a> f100876l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final K0 f100877m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final C6318i f100878n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final C7893a f100879o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f100880p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f100881q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final C6322k f100882r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final AdRepository f100883s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f100884t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f100885u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final B f100886v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final C f100887w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public Function2<? super String, ? super Continuation<? super Unit>, ? extends Object> f100888x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f100889y;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailRelateService$DislikeType.class */
    public static final class DislikeType {
        private static final EnumEntries $ENTRIES;
        private static final DislikeType[] $VALUES;
        public static final DislikeType DISLIKE_ITEM = new DislikeType("DISLIKE_ITEM", 0);
        public static final DislikeType DISLIKE_TITLE = new DislikeType("DISLIKE_TITLE", 1);
        public static final DislikeType FEEDBACK_ITEM = new DislikeType("FEEDBACK_ITEM", 2);
        public static final DislikeType FEEDBACK_TITLE = new DislikeType("FEEDBACK_TITLE", 3);

        private static final /* synthetic */ DislikeType[] $values() {
            return new DislikeType[]{DISLIKE_ITEM, DISLIKE_TITLE, FEEDBACK_ITEM, FEEDBACK_TITLE};
        }

        static {
            DislikeType[] dislikeTypeArr$values = $values();
            $VALUES = dislikeTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(dislikeTypeArr$values);
        }

        private DislikeType(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<DislikeType> getEntries() {
            return $ENTRIES;
        }

        public static DislikeType valueOf(String str) {
            return (DislikeType) Enum.valueOf(DislikeType.class, str);
        }

        public static DislikeType[] values() {
            return (DislikeType[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailRelateService$a.class */
    public final class a implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final o0 f100890a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final b f100891b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DetailRelateService f100892c;

        public a(@NotNull DetailRelateService detailRelateService, @NotNull o0 o0Var, b bVar) {
            this.f100892c = detailRelateService;
            this.f100890a = o0Var;
            this.f100891b = bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x00f7  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b() {
            /*
                Method dump skipped, instruction units count: 524
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateService.a.b():void");
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            b();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailRelateService$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f100893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final DislikeType f100894b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f100895c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final String f100896d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final String f100897e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final Long f100898f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public final Integer f100899g;

        public b(boolean z6, @Nullable DislikeType dislikeType, @Nullable String str, @Nullable String str2, @NotNull String str3, @Nullable Long l7, @Nullable Integer num) {
            this.f100893a = z6;
            this.f100894b = dislikeType;
            this.f100895c = str;
            this.f100896d = str2;
            this.f100897e = str3;
            this.f100898f = l7;
            this.f100899g = num;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f100893a == bVar.f100893a && this.f100894b == bVar.f100894b && Intrinsics.areEqual(this.f100895c, bVar.f100895c) && Intrinsics.areEqual(this.f100896d, bVar.f100896d) && Intrinsics.areEqual(this.f100897e, bVar.f100897e) && Intrinsics.areEqual(this.f100898f, bVar.f100898f) && Intrinsics.areEqual(this.f100899g, bVar.f100899g);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f100893a);
            DislikeType dislikeType = this.f100894b;
            int iHashCode2 = dislikeType == null ? 0 : dislikeType.hashCode();
            String str = this.f100895c;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            String str2 = this.f100896d;
            int iA = I.E.a(((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f100897e);
            Long l7 = this.f100898f;
            int iHashCode4 = l7 == null ? 0 : l7.hashCode();
            Integer num = this.f100899g;
            return ((iA + iHashCode4) * 31) + (num == null ? 0 : num.hashCode());
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("CancelDislikeData(longClick=");
            sb.append(this.f100893a);
            sb.append(", dislikeType=");
            sb.append(this.f100894b);
            sb.append(", reasonId=");
            sb.append(this.f100895c);
            sb.append(", feedbackId=");
            sb.append(this.f100896d);
            sb.append(", option=");
            sb.append(this.f100897e);
            sb.append(", tagId=");
            sb.append(this.f100898f);
            sb.append(", rid=");
            return e4.c.a(sb, this.f100899g, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailRelateService$c.class */
    @StabilityInferred(parameters = 0)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final o0 f100900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f100901b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DislikeType f100902c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final String f100903d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final String f100904e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final String f100905f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final String f100906g;

        @Nullable
        public final Long h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public final Integer f100907i;

        public c(@NotNull o0 o0Var, boolean z6, @NotNull DislikeType dislikeType, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String str4, @Nullable Long l7, @Nullable Integer num) {
            this.f100900a = o0Var;
            this.f100901b = z6;
            this.f100902c = dislikeType;
            this.f100903d = str;
            this.f100904e = str2;
            this.f100905f = str3;
            this.f100906g = str4;
            this.h = l7;
            this.f100907i = num;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f100900a, cVar.f100900a) && this.f100901b == cVar.f100901b && this.f100902c == cVar.f100902c && Intrinsics.areEqual(this.f100903d, cVar.f100903d) && Intrinsics.areEqual(this.f100904e, cVar.f100904e) && Intrinsics.areEqual(this.f100905f, cVar.f100905f) && Intrinsics.areEqual(this.f100906g, cVar.f100906g) && Intrinsics.areEqual(this.h, cVar.h) && Intrinsics.areEqual(this.f100907i, cVar.f100907i);
        }

        public final int hashCode() {
            int iA = androidx.compose.animation.z.a(this.f100900a.hashCode() * 31, 31, this.f100901b);
            int iHashCode = this.f100902c.hashCode();
            String str = this.f100903d;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.f100904e;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.f100905f;
            int iA2 = I.E.a((((((((iHashCode + iA) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f100906g);
            Long l7 = this.h;
            int iHashCode4 = l7 == null ? 0 : l7.hashCode();
            Integer num = this.f100907i;
            return ((iA2 + iHashCode4) * 31) + (num == null ? 0 : num.hashCode());
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("DislikeReportData(card=");
            sb.append(this.f100900a);
            sb.append(", longClick=");
            sb.append(this.f100901b);
            sb.append(", dislikeType=");
            sb.append(this.f100902c);
            sb.append(", reasonId=");
            sb.append(this.f100903d);
            sb.append(", feedbackId=");
            sb.append(this.f100904e);
            sb.append(", title=");
            sb.append(this.f100905f);
            sb.append(", option=");
            sb.append(this.f100906g);
            sb.append(", tagId=");
            sb.append(this.h);
            sb.append(", rid=");
            return e4.c.a(sb, this.f100907i, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailRelateService$d.class */
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f100942a;

        static {
            int[] iArr = new int[RelateCardType.values().length];
            try {
                iArr[RelateCardType.f101047AV.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[RelateCardType.BANGUMI.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[RelateCardType.RESOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[RelateCardType.GAME.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[RelateCardType.CM.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr[RelateCardType.LIVE.ordinal()] = 6;
            } catch (NoSuchFieldError e12) {
            }
            try {
                iArr[RelateCardType.AI_RECOMMEND.ordinal()] = 7;
            } catch (NoSuchFieldError e13) {
            }
            try {
                iArr[RelateCardType.BANGUMI_AV.ordinal()] = 8;
            } catch (NoSuchFieldError e14) {
            }
            try {
                iArr[RelateCardType.SPECIAL.ordinal()] = 9;
            } catch (NoSuchFieldError e15) {
            }
            try {
                iArr[RelateCardType.COURSE.ordinal()] = 10;
            } catch (NoSuchFieldError e16) {
            }
            try {
                iArr[RelateCardType.MINI_PROGRAM.ordinal()] = 11;
            } catch (NoSuchFieldError e17) {
            }
            try {
                iArr[RelateCardType.HISTORY_AV.ordinal()] = 12;
            } catch (NoSuchFieldError e18) {
            }
            try {
                iArr[RelateCardType.LOADING_PLACEHOLDER.ordinal()] = 13;
            } catch (NoSuchFieldError e19) {
            }
            f100942a = iArr;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Inject
    public DetailRelateService(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull ComponentActivity componentActivity, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull ActivityColorRepository activityColorRepository, @NotNull DetailRelateRepository detailRelateRepository, @NotNull C8043a c8043a, @NotNull TheseusCastScreenRepository theseusCastScreenRepository, @NotNull PageReportService pageReportService, @NotNull rW0.a aVar2, @NotNull rW0.a aVar3, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull K0 k02, @NotNull C6318i c6318i, @NotNull C7893a c7893a, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar4, @NotNull IntroContentSizeRepository introContentSizeRepository, @NotNull C6322k c6322k, @NotNull AdRepository adRepository) throws NoWhenBranchMatchedException {
        this.f100866a = coroutineScope;
        this.f100867b = context;
        this.f100868c = componentActivity;
        this.f100869d = hVar;
        this.f100870e = aVar;
        this.f100871f = activityColorRepository;
        this.f100872g = detailRelateRepository;
        this.h = c8043a;
        this.f100873i = theseusCastScreenRepository;
        this.f100874j = pageReportService;
        this.f100875k = aVar2;
        this.f100876l = aVar3;
        this.f100877m = k02;
        this.f100878n = c6318i;
        this.f100879o = c7893a;
        this.f100880p = aVar4;
        this.f100881q = introContentSizeRepository;
        this.f100882r = c6322k;
        this.f100883s = adRepository;
        this.f100884t = FlowKt.stateIn(FlowKt.combine(theseusFloatLayerService.f99660j, theseusFloatLayerService.f99658g, new DetailRelateService$isFloatShowingFlow$1(null)), coroutineScope, SharingStarted.Companion.getEagerly(), Boolean.FALSE);
        ArrayDeque<Integer> arrayDeque = UnitedDetailStackManager.f104843a;
        if (UnitedDetailStackManager.a.f104844a[UnitedDetailStackManager.StackElementType.UNITED_VIDEO.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        this.f100885u = UnitedDetailStackManager.f104843a.size();
        this.f100886v = new B(this);
        this.f100887w = new C(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateService r4, com.bilibili.ship.theseus.united.page.intro.module.relate.o0 r5, java.lang.String r6) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateService.a(com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateService, com.bilibili.ship.theseus.united.page.intro.module.relate.o0, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0255  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.HashMap b(com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateService r5, com.bilibili.ship.theseus.united.page.intro.module.relate.o0 r6) {
        /*
            Method dump skipped, instruction units count: 706
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateService.b(com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateService, com.bilibili.ship.theseus.united.page.intro.module.relate.o0):java.util.HashMap");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateService r5, com.bilibili.ship.theseus.united.page.intro.module.relate.o0 r6, java.lang.String r7) {
        /*
            r0 = r5
            java.lang.Class r0 = r0.getClass()
            r0 = r6
            com.bilibili.ship.theseus.united.page.intro.module.relate.A0 r0 = r0.f101324j
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L1c
            java.lang.String r0 = "DetailRelateService"
            java.lang.String r1 = "reportGameClick, card is null"
            tv.danmaku.android.log.BLog.e(r0, r1)
            goto L81
        L1c:
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r10
            java.lang.String r1 = "game_status"
            r2 = r11
            long r2 = r2.f100809a
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r11
            com.bilibili.ship.theseus.united.page.intro.module.relate.g0 r0 = r0.f100813e
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L4e
            r0 = r8
            java.lang.String r0 = r0.f101214g
            r9 = r0
            r0 = r9
            r8 = r0
            r0 = r9
            if (r0 != 0) goto L52
        L4e:
            java.lang.String r0 = ""
            r8 = r0
        L52:
            r0 = r10
            java.lang.String r1 = "game_list_name"
            r2 = r8
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r11
            com.bilibili.ship.theseus.united.page.intro.module.relate.L0 r0 = r0.f100816i
            if (r0 == 0) goto L6b
            java.lang.String r0 = "1"
            r8 = r0
            goto L6f
        L6b:
            java.lang.String r0 = "0"
            r8 = r0
        L6f:
            r0 = r10
            java.lang.String r1 = "has_wiki"
            r2 = r8
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r10
            r0.o(r1, r2, r3)
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateService.c(com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateService, com.bilibili.ship.theseus.united.page.intro.module.relate.o0, java.lang.String):void");
    }

    public static ExtraParams i(o0 o0Var) {
        boolean z6 = true;
        ExtraParams extraParams = new ExtraParams((Bundle) null, 1, (DefaultConstructorMarker) null);
        m0 m0Var = o0Var.f101325k;
        if (m0Var == null || m0Var.f101299e != 1) {
            z6 = false;
        }
        extraParams.NATURE_AD(z6);
        m0 m0Var2 = o0Var.f101325k;
        String strValueOf = m0Var2 != null ? String.valueOf(m0Var2.f101300f) : null;
        String str = strValueOf;
        if (strValueOf == null) {
            str = "";
        }
        extraParams.UP_MID(str);
        String strValueOf2 = null;
        if (m0Var2 != null) {
            AdRelateItem adRelateItem = m0Var2.f101304k;
            strValueOf2 = null;
            if (adRelateItem != null) {
                strValueOf2 = String.valueOf(adRelateItem.getAvId());
            }
        }
        if (strValueOf2 == null) {
            strValueOf2 = "";
        }
        extraParams.AVID2S(strValueOf2);
        return ConfigManager.Companion.ab2().getWithDefault("ff_ad_relates_feedback_area", false) ? extraParams.AD_FEED_BACK("1") : extraParams.AD_FEED_BACK("0");
    }

    public final void d(final o0 o0Var, final boolean z6, t0 t0Var, final boolean z7, final Function1<? super c, Unit> function1, final Function1<? super b, Unit> function12) {
        String str;
        String str2;
        if (t0Var.f101385a.length() == 0) {
            return;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = t0Var.f101391g;
        if (RecommendMode.isRecommendModeEnable()) {
            str = t0Var.f101386b;
            str2 = t0Var.f101388d;
        } else {
            objectRef.element = t0Var.h;
            str = t0Var.f101387c;
            str2 = t0Var.f101389e;
        }
        o0Var.f101336v = str2;
        List<E0> list = t0Var.f101390f;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            arrayList.add(((E0) it.next()).f100989e);
        }
        int size = arrayList.size();
        final K0 k02 = this.f100877m;
        final String str3 = t0Var.f101385a;
        if (size == 0 || arrayList.size() == 1) {
            k02.a(str3, new Function0(z7, str3, this, o0Var, z6, objectRef, function1, function12) { // from class: com.bilibili.ship.theseus.united.page.intro.module.relate.y

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final boolean f101425a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f101426b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final DetailRelateService f101427c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final o0 f101428d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final boolean f101429e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final Ref.ObjectRef f101430f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final Function1 f101431g;
                public final Function1 h;

                {
                    this.f101425a = z7;
                    this.f101426b = str3;
                    this.f101427c = this;
                    this.f101428d = o0Var;
                    this.f101429e = z6;
                    this.f101430f = objectRef;
                    this.f101431g = function1;
                    this.h = function12;
                }

                public final Object invoke() {
                    DetailRelateService.DislikeType dislikeType = this.f101425a ? DetailRelateService.DislikeType.FEEDBACK_TITLE : DetailRelateService.DislikeType.DISLIKE_TITLE;
                    String str4 = (String) this.f101430f.element;
                    Function1<? super DetailRelateService.c, Unit> function13 = this.f101431g;
                    DetailRelateService detailRelateService = this.f101427c;
                    o0 o0Var2 = this.f101428d;
                    boolean z8 = this.f101429e;
                    String str5 = this.f101426b;
                    detailRelateService.l(o0Var2, z8, str4, str5, dislikeType, null, null, str5, null, null, function13);
                    this.h.invoke(new DetailRelateService.b(z8, dislikeType, null, null, str5, null, null));
                    return Unit.INSTANCE;
                }
            });
            return;
        }
        final C6338z c6338z = new C6338z(z7, t0Var, str3, this, o0Var, z6, objectRef, function1, function12);
        k02.f101023c.add(new TitleListMenuItem(str3, str, arrayList, new com.bilibili.biligame.cloudgame.v2.logic.hmy.f(c6338z)));
        k02.f101024d.add(new ScreenAdjustMenuItemData.TitleList(str3, str, arrayList, 0, new Function1(c6338z, k02) { // from class: com.bilibili.ship.theseus.united.page.intro.module.relate.H0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final C6338z f101011a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final K0 f101012b;

            {
                this.f101011a = c6338z;
                this.f101012b = k02;
            }

            public final Object invoke(Object obj) {
                Integer num = (Integer) obj;
                num.getClass();
                this.f101011a.invoke(num);
                K0 k03 = this.f101012b;
                k03.f101025e.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            }
        }, 8, (DefaultConstructorMarker) null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x095c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x096c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0995  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x09ba  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x09d0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x09fa  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0a1e  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0a38  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0a42  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0a77  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0a97  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0aa1  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0ae1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02e5  */
    /* JADX WARN: Type inference failed for: r4v39, types: [com.bilibili.ship.theseus.united.page.intro.module.relate.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.app.gemini.ui.RunningUIComponent e(final com.bilibili.ship.theseus.united.page.intro.module.relate.o0 r20) {
        /*
            Method dump skipped, instruction units count: 3084
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateService.e(com.bilibili.ship.theseus.united.page.intro.module.relate.o0):com.bilibili.app.gemini.ui.RunningUIComponent");
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.bilibili.ship.theseus.united.page.intro.module.relate.u] */
    public final RunningUIComponent f(final o0 o0Var, final b bVar, int i7, final Function1<? super a, Unit> function1) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        o0Var.f101335u = SystemClock.elapsedRealtime();
        u0 u0Var = new u0(o0Var.f101337w, o0Var.f101336v, this.f100880p.f102939c, this.f100871f, new Function0(o0Var, this, function1, bVar, objectRef) { // from class: com.bilibili.ship.theseus.united.page.intro.module.relate.u

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final o0 f101392a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final DetailRelateService f101393b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Function1 f101394c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final DetailRelateService.b f101395d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final Ref.ObjectRef f101396e;

            {
                this.f101392a = o0Var;
                this.f101393b = this;
                this.f101394c = function1;
                this.f101395d = bVar;
                this.f101396e = objectRef;
            }

            public final Object invoke() {
                u0 u0Var2;
                RunningUIComponent runningUIComponentE;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                o0 o0Var2 = this.f101392a;
                if (jElapsedRealtime - o0Var2.f101335u >= 120000) {
                    com.bilibili.ship.theseus.united.utils.q.b(2131845615);
                } else {
                    DetailRelateService detailRelateService = this.f101393b;
                    detailRelateService.n(o0Var2, "repeal");
                    this.f101394c.invoke(new DetailRelateService.a(detailRelateService, o0Var2, this.f101395d));
                    IntroRecycleViewService introRecycleViewService = (IntroRecycleViewService) detailRelateService.f100875k.get();
                    if (introRecycleViewService != null && (u0Var2 = (u0) this.f101396e.element) != null && (runningUIComponentE = detailRelateService.e(o0Var2)) != null) {
                        introRecycleViewService.e(runningUIComponentE, u0Var2);
                    }
                }
                return Unit.INSTANCE;
            }
        }, new C6334v(this, o0Var, objectRef));
        objectRef.element = u0Var;
        return new RunningUIComponent(u0Var, i7, (Function1) null, 4);
    }

    public final ExposureEntryV g(final Function0<Unit> function0, final Function0<Unit> function02) {
        return new ExposureEntryV(new Function1(this, function0, function02) { // from class: com.bilibili.ship.theseus.united.page.intro.module.relate.r

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final DetailRelateService f101368a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Function0 f101369b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Function0 f101370c;

            {
                this.f101368a = this;
                this.f101369b = function0;
                this.f101370c = function02;
            }

            public final Object invoke(Object obj) {
                Flow flow = (Flow) obj;
                DetailRelateService detailRelateService = this.f101368a;
                Flow flowOnEach = FlowKt.onEach((Flow) detailRelateService.f100886v.invoke(flow), new DetailRelateService$createExposureEntry$1$1(this.f101369b, null));
                CoroutineScope coroutineScope = detailRelateService.f100866a;
                FlowKt.launchIn(flowOnEach, coroutineScope);
                FlowKt.launchIn(FlowKt.onEach((Flow) detailRelateService.f100887w.invoke(flow), new DetailRelateService$createExposureEntry$1$2(this.f101370c, null)), coroutineScope);
                return Unit.INSTANCE;
            }
        });
    }

    public final void h(c cVar) {
        o0 o0Var = cVar.f100900a;
        int i7 = cVar.f100901b ? 2 : 1;
        String str = this.h.a().f123881c;
        LinkedHashMap linkedHashMapA = lh.c.a("from_type", Intrinsics.areEqual("operation", o0Var.f101318c.f101355m) ? "operation" : "recommend");
        linkedHashMapA.put("option", cVar.f100906g);
        String str2 = cVar.f100905f;
        String str3 = str2;
        if (str2 == null) {
            str3 = "";
        }
        linkedHashMapA.put("from_module", str3);
        linkedHashMapA.put("from_avid", this.f100870e.b());
        linkedHashMapA.put("click_type", String.valueOf(i7));
        linkedHashMapA.put("panel_type", "1");
        linkedHashMapA.put("goto", o0Var.f101317b);
        p0 p0Var = o0Var.f101318c;
        linkedHashMapA.put("id", String.valueOf(p0Var.f101354l));
        G0 g02 = o0Var.f101319d;
        String str4 = "";
        if (g02 != null) {
            str4 = g02.f101006d;
            if (str4 == null) {
                str4 = "";
            }
        }
        linkedHashMapA.put("report_data", str4);
        linkedHashMapA.put(EditCustomizeSticker.TAG_MID, String.valueOf(p0Var.f101353k.f104058a));
        linkedHashMapA.put("spmid", o0Var.f101338x);
        linkedHashMapA.put("track_id", p0Var.f101348e);
        String strCurrentPolarisActionId = PageViewTracker.getInstance().currentPolarisActionId();
        if (strCurrentPolarisActionId != null && (!StringsKt.isBlank(strCurrentPolarisActionId))) {
            linkedHashMapA.put("action_id", strCurrentPolarisActionId);
        }
        Long l7 = cVar.h;
        if ((l7 != null ? l7.longValue() : 0L) > 0) {
            linkedHashMapA.put("tag_id", String.valueOf(l7));
        }
        Integer num = cVar.f100907i;
        if ((num != null ? num.intValue() : 0) > 0) {
            linkedHashMapA.put("rid", String.valueOf(num));
        }
        m0 m0Var = o0Var.f101325k;
        if (AdRelateItemKt.isNatureAd(m0Var != null ? m0Var.f101304k : null)) {
            linkedHashMapA.put("nature_ad", CaptureSchema.OLD_INVALID_ID_STRING);
        }
        long j7 = o0Var.f101339y;
        if (j7 != Long.MIN_VALUE) {
            linkedHashMapA.put("tab_id", String.valueOf(j7));
            linkedHashMapA.put("tab_name", o0Var.f101340z);
        }
        ListCommonApiManager.dislike(cVar.f100903d, cVar.f100904e, str, "videodetail.relate", linkedHashMapA);
    }

    public final void j(Rect rect, final o0 o0Var, boolean z6, Function1<? super c, Unit> function1, Function1<? super b, Unit> function12, final Function2<? super TranslateButton, ? super Continuation<? super Unit>, ? extends Object> function2) {
        Object next;
        Pair pair;
        G0 g02 = o0Var.f101319d;
        if (g02 == null) {
            BLog.e("DetailRelateService", "onClickMore, threePoint is null");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f100889y < 500) {
            return;
        }
        this.f100889y = jCurrentTimeMillis;
        K0 k02 = this.f100877m;
        if (g02.f101005c) {
            final String string = this.f100867b.getString(2131841555);
            k02.a(string, new Function0(this, o0Var, string) { // from class: com.bilibili.ship.theseus.united.page.intro.module.relate.w

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final o0 f101412a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final DetailRelateService f101413b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f101414c;

                {
                    this.f101412a = o0Var;
                    this.f101413b = this;
                    this.f101414c = string;
                }

                public final Object invoke() {
                    BLog.i("DetailRelateService", "onClick watch later");
                    o0 o0Var2 = this.f101412a;
                    String strValueOf = String.valueOf(o0Var2.f101318c.f101354l);
                    DetailRelateService detailRelateService = this.f101413b;
                    String str = detailRelateService.h.a().f123879a;
                    MainCommonService mainCommonService = (MainCommonService) BLRouter.get$default(BLRouter.INSTANCE, MainCommonService.class, (String) null, 2, (Object) null);
                    if (mainCommonService != null) {
                        MainCommonService.addToWatchLater$default(mainCommonService, detailRelateService.f100868c, strValueOf, str, o0Var2.f101338x, 12, false, 0, 96, null);
                    }
                    ListCommonReport.reportWatchLaterClick$default(strValueOf, "视频详情页相关视频", (String) null, 4, (Object) null);
                    detailRelateService.t(o0Var2, this.f101414c);
                    return Unit.INSTANCE;
                }
            });
        }
        t0 t0Var = g02.f101004b;
        if (t0Var != null) {
            d(o0Var, z6, t0Var, true, function1, new Yk0.e(function12, 1));
        }
        t0 t0Var2 = g02.f101003a;
        if (t0Var2 != null) {
            d(o0Var, z6, t0Var2, false, function1, new com.bilibili.bililive.media.composition.chain.b(function12, 1));
        }
        final TranslateButton translateButton = g02.f101007e;
        if (translateButton != null) {
            Iterator it = translateButton.getButtonMetasList().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (Intrinsics.areEqual(((ButtonMeta) next).getButtonStatus(), translateButton.getButtonStatus())) {
                        break;
                    }
                }
            }
            if (((ButtonMeta) next) != null) {
                if (Intrinsics.areEqual(translateButton.getButtonStatus(), "VIEW_ORIGIN")) {
                    pair = TuplesKt.to(this.f100867b.getString(2131846660), "看原文");
                } else if (Intrinsics.areEqual(translateButton.getButtonStatus(), "VIEW_TRANSLATED")) {
                    pair = TuplesKt.to(this.f100867b.getString(2131846659), "翻译");
                }
                String str = (String) pair.component1();
                final String str2 = (String) pair.component2();
                k02.a(str, new Function0(this, function2, translateButton, o0Var, str2) { // from class: com.bilibili.ship.theseus.united.page.intro.module.relate.x

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final DetailRelateService f101420a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Function2 f101421b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final TranslateButton f101422c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final o0 f101423d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final String f101424e;

                    {
                        this.f101420a = this;
                        this.f101421b = function2;
                        this.f101422c = translateButton;
                        this.f101423d = o0Var;
                        this.f101424e = str2;
                    }

                    public final Object invoke() {
                        DetailRelateService detailRelateService = this.f101420a;
                        BuildersKt.launch$default(detailRelateService.f100866a, (CoroutineContext) null, (CoroutineStart) null, new DetailRelateService$handleClickMore$4$1$1(this.f101421b, this.f101422c, detailRelateService, this.f101423d, this.f101424e, null), 3, (Object) null);
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        BuildersKt.launch$default(this.f100866a, (CoroutineContext) null, (CoroutineStart) null, new DetailRelateService$handleClickMore$5(this, rect, null), 3, (Object) null);
    }

    public final void k(@NotNull RelateTab relateTab, @NotNull List<o0> list) {
        IntroRecycleViewService introRecycleViewService = (IntroRecycleViewService) this.f100875k.get();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            RunningUIComponent runningUIComponentE = e((o0) it.next());
            if (runningUIComponentE != null) {
                arrayList.add(runningUIComponentE);
            }
        }
        relateTab.f101051d.addAll(arrayList);
        if (relateTab.f101048a != ((Number) this.f100872g.f100857g.getValue()).longValue()) {
            BLog.w("DetailRelateService-insertRelateComponents", "[theseus-united-DetailRelateService-insertRelateComponents] insertComponents, category not match", (Throwable) null);
            return;
        }
        List listPlus = arrayList;
        if (!arrayList.isEmpty()) {
            Iterator it2 = ((ArrayList) introRecycleViewService.f100040f).iterator();
            int i7 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i7 = -1;
                    break;
                } else if (Intrinsics.areEqual(((com.bilibili.ship.theseus.united.page.intro.h) it2.next()).f100064a.getClass(), y0.class)) {
                    break;
                } else {
                    i7++;
                }
            }
            listPlus = arrayList;
            if (i7 < 0) {
                listPlus = CollectionsKt.plus(CollectionsKt.listOf(new RunningUIComponent(new y0(this.f100871f.d()), 0, (Function1) null, 6)), arrayList);
            }
        }
        introRecycleViewService.c(((ArrayList) introRecycleViewService.f100040f).size() - 1, listPlus);
    }

    public final void l(o0 o0Var, boolean z6, String str, String str2, DislikeType dislikeType, String str3, String str4, String str5, Long l7, Integer num, Function1<? super c, Unit> function1) {
        BLog.d("DetailRelateService", "onDislikeReasonClicked, " + str + " " + dislikeType);
        if (dislikeType == DislikeType.DISLIKE_TITLE || dislikeType == DislikeType.DISLIKE_ITEM) {
            if (!RecommendMode.isRecommendModeEnable()) {
                Ei.h.b++;
            }
            if (str != null && str.length() != 0) {
                com.bilibili.ship.theseus.united.utils.q.c(str);
            }
        } else if (str != null && str.length() != 0 && RecommendMode.isRecommendModeEnable()) {
            com.bilibili.ship.theseus.united.utils.q.c(str);
        }
        function1.invoke(new c(o0Var, z6, dislikeType, str3, str4, str2, str5, l7, num));
        t(o0Var, str5);
    }

    public final void m(o0 o0Var) {
        DetailRelateService detailRelateService = o0Var.f101316a == RelateCardType.CM ? null : this;
        if (detailRelateService != null) {
            p0 p0Var = o0Var.f101318c;
            BLog.i("DetailRelateService", "reportAdStockExpose, " + p0Var.f101354l + " " + p0Var.f101344a);
            IAdReporter.exposeAll$default(GAdCoreKt.getGAdReport(), o0Var.f101320e, AdVideoExtraBuilder.INSTANCE.invoke(detailRelateService.f100867b).build().plus(i(o0Var)), (String) null, false, (List) null, (String) null, false, SearchBangumiItem.TYPE_FULLNET_VARIETY, (Object) null);
        }
    }

    public final void n(o0 o0Var, String str) {
        BLog.i("DetailRelateService", "reportCancelClick");
        HashMap map = new HashMap();
        p0 p0Var = o0Var.f101318c;
        map.put("track_id", this.h.a().f123882d);
        map.put("goto", o0Var.f101317b);
        map.put("tab_name", o0Var.f101340z);
        map.put("relatedvideo_spmid", o0Var.f101338x);
        map.put("item_id", String.valueOf(p0Var.f101354l));
        map.put("action", str);
        PageReportService.g(this.f100874j, "united.player-video-detail.relatedvideo.repeal-bar.click", map, 4);
    }

    public final void o(o0 o0Var, String str, HashMap<String, String> map) {
        p0 p0Var = o0Var.f101318c;
        StringBuilder sb = new StringBuilder("reportClick, card: ");
        sb.append(p0Var.f101354l);
        sb.append(" ");
        bilibili.live.app.service.resolver.b.a(sb, p0Var.f101344a, "DetailRelateService");
        map.put("from_track_id", this.h.a().f123882d);
        p0 p0Var2 = o0Var.f101318c;
        map.put("from_source_type", String.valueOf(p0Var2.f101350g));
        map.put("from_source_id", p0Var2.h);
        map.put("track_id", p0Var2.f101348e);
        map.put("goto", o0Var.f101317b);
        map.put("tab_name", o0Var.f101340z);
        map.put("relatedvideo_spmid", o0Var.f101338x);
        map.put("item_id", o0Var.b());
        map.put("unique_id", p0Var2.f101349f);
        map.put("material_id", String.valueOf(p0Var2.f101351i));
        String strC = o0Var.c();
        String str2 = strC;
        if (strC == null) {
            str2 = "";
        }
        map.put("recommend_reason", str2);
        map.put("area", str);
        map.put(MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE, String.valueOf(o0Var.f101333s));
        map.put("relatedvideo_position", String.valueOf(o0Var.f101332r));
        map.put("level", String.valueOf(this.f100885u));
        map.putAll(p0Var2.f101359q);
        this.f100874j.f("united.player-video-detail.relatedvideo.0.click", map, true);
    }

    public final void q(o0 o0Var, HashMap<String, String> map) {
        p0 p0Var = o0Var.f101318c;
        C6322k c6322k = this.f100882r;
        BLog.i("DetailRelateService", "reportExposure, " + p0Var.f101354l + " " + p0Var.f101344a + "-->" + c6322k.f101271a);
        map.put("from_track_id", this.h.a().f123882d);
        p0 p0Var2 = o0Var.f101318c;
        map.put("from_source_type", String.valueOf(p0Var2.f101350g));
        map.put("from_source_id", p0Var2.h);
        map.put("track_id", p0Var2.f101348e);
        map.put("goto", o0Var.f101317b);
        map.put("tab_name", o0Var.f101340z);
        map.put("relatedvideo_spmid", o0Var.f101338x);
        map.put("item_id", o0Var.b());
        map.put("unique_id", p0Var2.f101349f);
        map.put("material_id", String.valueOf(p0Var2.f101351i));
        String strC = o0Var.c();
        String str = strC;
        if (strC == null) {
            str = "";
        }
        map.put("recommend_reason", str);
        map.put(MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE, String.valueOf(o0Var.f101333s));
        map.put("relatedvideo_position", String.valueOf(o0Var.f101332r));
        map.put("level", String.valueOf(this.f100885u));
        map.put("is_shouping", !c6322k.f101271a ? "1" : "0");
        map.putAll(p0Var2.f101359q);
        this.f100874j.h("united.player-video-detail.relatedvideo.0.show", map, true);
    }

    public final void s(o0 o0Var, boolean z6) {
        BLog.i("DetailRelateService", "reportMoreClick");
        HashMap map = new HashMap();
        p0 p0Var = o0Var.f101318c;
        map.put("track_id", this.h.a().f123882d);
        map.put("goto", o0Var.f101317b);
        map.put("tab_name", o0Var.f101340z);
        map.put("relatedvideo_spmid", o0Var.f101338x);
        map.put("item_id", String.valueOf(p0Var.f101354l));
        map.put("click_type", z6 ? "2" : "1");
        PageReportService.g(this.f100874j, "united.player-video-detail.relatedvideo.three-point.click", map, 4);
    }

    public final void t(o0 o0Var, String str) {
        BLog.i("DetailRelateService", "reportMoreOptionClick");
        HashMap map = new HashMap();
        p0 p0Var = o0Var.f101318c;
        map.put("track_id", this.h.a().f123882d);
        map.put("goto", o0Var.f101317b);
        map.put("tab_name", o0Var.f101340z);
        map.put("relatedvideo_spmid", o0Var.f101338x);
        map.put("item_id", String.valueOf(p0Var.f101354l));
        map.put("option", str);
        PageReportService.g(this.f100874j, "united.player-video-detail.relatedvideo.three-point-option.click", map, 4);
    }
}
