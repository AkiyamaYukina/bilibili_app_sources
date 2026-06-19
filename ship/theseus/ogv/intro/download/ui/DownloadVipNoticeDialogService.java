package com.bilibili.ship.theseus.ogv.intro.download.ui;

import android.content.Context;
import android.view.Window;
import androidx.activity.ComponentDialog;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import com.bapis.bilibili.playershared.DolbyItem;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.tencent.connect.common.Constants;
import j5.C7642d;
import java.util.Map;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/DownloadVipNoticeDialogService.class */
@StabilityInferred(parameters = 0)
public final class DownloadVipNoticeDialogService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f92455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PageReportService f92456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ogv.vip.a f92457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableState f92458d = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/DownloadVipNoticeDialogService$VipNoticeDialog.class */
    public final class VipNoticeDialog extends ComponentDialog {
        final DownloadVipNoticeDialogService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VipNoticeDialog(DownloadVipNoticeDialogService downloadVipNoticeDialogService) {
            super(downloadVipNoticeDialogService.f92455a, 0, 2, null);
            this.this$0 = downloadVipNoticeDialogService;
            Window window = getWindow();
            if (window != null) {
                C7642d.a(window, 0);
            }
            Window window2 = getWindow();
            if (window2 != null) {
                window2.requestFeature(1);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/DownloadVipNoticeDialogService$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f92459a;

        static {
            int[] iArr = new int[DownloadHintType.values().length];
            try {
                iArr[DownloadHintType.DOWNLOAD_VIDEO_HINT.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[DownloadHintType.DOWNLOAD_QUALITY_HINT.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[DownloadHintType.DOWNLOAD_RESERVE_HINT.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[DownloadHintType.DOWNLOAD_VIP_CACHE.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[DownloadHintType.DOWNLOAD_AUDIO_HINT.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            f92459a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/DownloadVipNoticeDialogService$b.class */
    public static final class b implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DownloadVipNoticeDialogService f92460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CancellableContinuationImpl f92461b;

        public b(DownloadVipNoticeDialogService downloadVipNoticeDialogService, CancellableContinuationImpl cancellableContinuationImpl) {
            this.f92460a = downloadVipNoticeDialogService;
            this.f92461b = cancellableContinuationImpl;
        }

        public final Object invoke() {
            this.f92460a.f92458d.setValue(null);
            Unit unit = Unit.INSTANCE;
            com.bilibili.ogv.infra.coroutine.a.a(this.f92461b, unit);
            return unit;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/DownloadVipNoticeDialogService$c.class */
    public static final class c implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DownloadVipNoticeDialogService f92462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CancellableContinuationImpl f92463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Function0<Unit> f92464c;

        public c(DownloadVipNoticeDialogService downloadVipNoticeDialogService, CancellableContinuationImpl cancellableContinuationImpl, Function0 function0) {
            this.f92462a = downloadVipNoticeDialogService;
            this.f92463b = cancellableContinuationImpl;
            this.f92464c = function0;
        }

        public final Object invoke() {
            this.f92462a.f92458d.setValue(null);
            Unit unit = Unit.INSTANCE;
            com.bilibili.ogv.infra.coroutine.a.a(this.f92463b, unit);
            this.f92464c.invoke();
            return unit;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/DownloadVipNoticeDialogService$d.class */
    public static final class d implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DownloadVipNoticeDialogService f92465a;

        public d(DownloadVipNoticeDialogService downloadVipNoticeDialogService) {
            this.f92465a = downloadVipNoticeDialogService;
        }

        public final Object invoke(Object obj) {
            this.f92465a.f92458d.setValue(null);
            return Unit.INSTANCE;
        }
    }

    @Inject
    public DownloadVipNoticeDialogService(@NotNull Context context, @NotNull PageReportService pageReportService, @NotNull com.bilibili.ship.theseus.ogv.vip.a aVar) {
        this.f92455a = context;
        this.f92456b = pageReportService;
        this.f92457c = aVar;
    }

    public static /* synthetic */ void g(DownloadVipNoticeDialogService downloadVipNoticeDialogService, int i7, int i8, DolbyItem.Type type, int i9) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        if ((i9 & 4) != 0) {
            type = DolbyItem.Type.NONE;
        }
        downloadVipNoticeDialogService.f(i7, i8, type, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void a(@Nullable Composer composer, final int i7) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2140349457);
        if ((i7 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 3) != 2, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2140349457, i8, -1, "com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadVipNoticeDialogService.Content (DownloadVipNoticeDialogService.kt:166)");
            }
            final m0 m0Var = (m0) this.f92458d.getValue();
            if (m0Var != null) {
                composerStartRestartGroup.startReplaceGroup(-66120840);
                AndroidDialog_androidKt.Dialog(m0Var.f92599d, null, ComposableLambdaKt.rememberComposableLambda(-1468601823, true, new Function2(this, m0Var) { // from class: com.bilibili.ship.theseus.ogv.intro.download.ui.h0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final DownloadVipNoticeDialogService f92567a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final m0 f92568b;

                    {
                        this.f92567a = this;
                        this.f92568b = m0Var;
                    }

                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1468601823, iIntValue, -1, "com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadVipNoticeDialogService.Content.<anonymous> (DownloadVipNoticeDialogService.kt:172)");
                            }
                            this.f92567a.b(this.f92568b, SizeKt.m1377width3ABfNKs(Modifier.Companion, Dp.m3880constructorimpl(280)), composer2, ExposureEntry.$stable | 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer2.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 384, 2);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-65848877);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2(this, i7) { // from class: com.bilibili.ship.theseus.ogv.intro.download.ui.i0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final DownloadVipNoticeDialogService f92572a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f92573b;

                {
                    this.f92572a = this;
                    this.f92573b = i7;
                }

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f92573b | 1);
                    this.f92572a.a((Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x04aa  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(final com.bilibili.ship.theseus.ogv.intro.download.ui.m0 r27, final androidx.compose.ui.Modifier r28, androidx.compose.runtime.Composer r29, final int r30) {
        /*
            Method dump skipped, instruction units count: 1324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadVipNoticeDialogService.b(com.bilibili.ship.theseus.ogv.intro.download.ui.m0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @NotNull
    public final String c(@NotNull DownloadHintType downloadHintType) throws NoWhenBranchMatchedException {
        String string;
        int i7 = a.f92459a[downloadHintType.ordinal()];
        if (i7 == 1) {
            string = this.f92455a.getString(2131854839);
        } else if (i7 == 2) {
            string = this.f92455a.getString(2131854811);
        } else if (i7 == 3) {
            string = this.f92455a.getString(2131854843);
        } else if (i7 == 4) {
            string = this.f92455a.getString(2131854855);
        } else {
            if (i7 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            string = this.f92455a.getString(2131854822);
        }
        return string;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void d(@NotNull DownloadHintType downloadHintType, @NotNull String str) throws NoWhenBranchMatchedException {
        String str2;
        String str3;
        int[] iArr = a.f92459a;
        int i7 = iArr[downloadHintType.ordinal()];
        if (i7 != 1) {
            str2 = Constants.VIA_REPORT_TYPE_CHAT_VIDEO;
            if (i7 != 2) {
                if (i7 == 3) {
                    str2 = "62";
                } else if (i7 == 4) {
                    str2 = "63";
                } else {
                    if (i7 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str2 = Constants.VIA_REPORT_TYPE_CHAT_VIDEO;
                }
            }
        } else {
            str2 = Constants.VIA_REPORT_TYPE_CHAT_AIO;
        }
        int i8 = iArr[downloadHintType.ordinal()];
        if (i8 == 1) {
            str3 = "-ogv";
        } else if (i8 == 2) {
            str3 = "-ogvdef";
        } else if (i8 == 3) {
            str3 = "-order";
        } else if (i8 == 4) {
            str3 = "-special";
        } else {
            if (i8 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            str3 = "-ogvdubi";
        }
        String strA = G.p.a(str, str3);
        Map<String, String> mapEmptyMap = MapsKt.emptyMap();
        com.bilibili.ship.theseus.ogv.vip.a aVar = this.f92457c;
        aVar.getClass();
        RouteRequest.Builder builder = new RouteRequest.Builder("activity://main/vip-buy");
        Qj0.g.b(builder, "appId", str2);
        Qj0.g.b(builder, "appSubId", strA);
        Qj0.g.b(builder, "source_from", "united.player-video-detail.caching.vip.click");
        Map<String, String> mapEmptyMap2 = mapEmptyMap;
        if (mapEmptyMap == null) {
            mapEmptyMap2 = MapsKt.emptyMap();
        }
        Qj0.g.b(builder, "order_report_params", JsonUtilKt.toJson(aVar.b(mapEmptyMap2)));
        Qj0.g.c(aVar.f94836a, builder.build());
    }

    @Nullable
    public final Object e(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull ExposureEntry exposureEntry, @NotNull Function0<Unit> function0, @NotNull Continuation<? super Unit> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        this.f92458d.setValue(new m0(str, str2, str3, new b(this, cancellableContinuationImpl), new c(this, cancellableContinuationImpl, function0), exposureEntry));
        cancellableContinuationImpl.invokeOnCancellation(new d(this));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    public final void f(int i7, int i8, @NotNull DolbyItem.Type type, @Nullable OgvEpisode ogvEpisode) {
        Cu0.a.f1797a.getClass();
        int iA = Cu0.a.a(type);
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        if (i7 != 0) {
            mapCreateMapBuilder.put("quality", String.valueOf(i8));
            mapCreateMapBuilder.put("tune", String.valueOf(iA));
        }
        mapCreateMapBuilder.put("cache_popup_type", String.valueOf(i7));
        if (ogvEpisode != null) {
            mapCreateMapBuilder.put("click_epid", String.valueOf(ogvEpisode.f93555a));
            mapCreateMapBuilder.put("click_epid_status", String.valueOf(ogvEpisode.f93559e.m9146getValue().intValue()));
        }
        PageReportService.g(this.f92456b, "united.player-video-detail.caching.vip.click", MapsKt.build(mapCreateMapBuilder), 4);
    }
}
