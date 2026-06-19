package com.bilibili.ship.theseus.ogv.intro.download.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.NetworkInfo;
import androidx.collection.LongSparseArray;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.NestedScrollInteropConnectionKt;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bapis.bilibili.playershared.DolbyItem;
import com.bapis.bilibili.playershared.StreamInfo;
import com.bilibili.base.connectivity.Connectivity;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.droid.ToastHelper;
import com.bilibili.fd_service.FreeDataManager;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.moduleservice.main.MainCommonService;
import com.bilibili.ogv.infra.coroutine.SelectKt$selectCancellingUnselected$scope$1;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.playerbizcommon.utils.PlayerSettingHelper;
import com.bilibili.playerbizcommonv2.widget.subtitle.r0;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository;
import com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadFloatLayerService;
import com.bilibili.ship.theseus.ogv.intro.download.ui.OgvVideoDownloadDialog;
import com.bilibili.ship.theseus.ogv.intro.section.bean.EpisodeRights;
import com.bilibili.ship.theseus.ogv.intro.section.bean.EpisodeSection;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.ogv.intro.section.bean.SectionType;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.ogv.season.PayStatus;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.restrictionlayer.InterfaceC6388m;
import com.bilibili.videodownloader.ui.VideoDownloadWarningDialog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.ConnectivityManagerHelper;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/DownloadFloatLayerService.class */
@StabilityInferred(parameters = 0)
public final class DownloadFloatLayerService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f92428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Gu0.a f92429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final OgvCurrentEpisodeRepository f92430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final OgvSeason f92431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Context f92432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Lifecycle f92433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f92434g;

    @NotNull
    public final DownloadVipNoticeDialogService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final PageReportService f92435i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final BiliAccountInfo f92436j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.g f92437k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final FragmentManager f92438l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ogv.intro.download.service.f f92439m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final InterfaceC6388m f92440n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f92441o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ogv.pub.reserve.b f92442p = (com.bilibili.ogv.pub.reserve.b) ServiceGenerator.createService(com.bilibili.ogv.pub.reserve.b.class);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f92443q = SharedFlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_LATEST, 1, (Object) null);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/DownloadFloatLayerService$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f92444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f92445b;

        static {
            int[] iArr = new int[DownloadHintType.values().length];
            try {
                iArr[DownloadHintType.DOWNLOAD_VIDEO_HINT.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[DownloadHintType.DOWNLOAD_RESERVE_HINT.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[DownloadHintType.DOWNLOAD_AUDIO_HINT.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[DownloadHintType.DOWNLOAD_QUALITY_HINT.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[DownloadHintType.DOWNLOAD_VIP_CACHE.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            f92444a = iArr;
            int[] iArr2 = new int[DolbyItem.Type.values().length];
            try {
                iArr2[DolbyItem.Type.COMMON.ordinal()] = 1;
            } catch (NoSuchFieldError e12) {
            }
            try {
                iArr2[DolbyItem.Type.ATMOS.ordinal()] = 2;
            } catch (NoSuchFieldError e13) {
            }
            f92445b = iArr2;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/DownloadFloatLayerService$b.class */
    public static final class b implements VideoDownloadWarningDialog.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DownloadFloatLayerService f92446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<OgvEpisode> f92447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f92448c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DolbyItem.Type f92449d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Context f92450e;

        public b(DownloadFloatLayerService downloadFloatLayerService, List<OgvEpisode> list, int i7, DolbyItem.Type type, Context context) {
            this.f92446a = downloadFloatLayerService;
            this.f92447b = list;
            this.f92448c = i7;
            this.f92449d = type;
            this.f92450e = context;
        }

        public final void a() {
            Context context = this.f92450e;
            MainCommonService mainCommonService = (MainCommonService) BLRouter.INSTANCE.get(MainCommonService.class, "default");
            if (mainCommonService != null) {
                context.startActivity(mainCommonService.getFreeDataEntranceActivityIntent(context));
            }
        }

        public final void b(int i7) {
            this.f92446a.i(this.f92447b, this.f92448c, this.f92449d, i7);
        }
    }

    @Inject
    public DownloadFloatLayerService(@NotNull CoroutineScope coroutineScope, @NotNull Gu0.a aVar, @NotNull OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, @NotNull OgvSeason ogvSeason, @NotNull Context context, @NotNull Lifecycle lifecycle, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull DownloadVipNoticeDialogService downloadVipNoticeDialogService, @NotNull PageReportService pageReportService, @NotNull BiliAccountInfo biliAccountInfo, @NotNull com.bilibili.ship.theseus.united.page.playingarea.g gVar, @NotNull FragmentManager fragmentManager, @NotNull com.bilibili.ship.theseus.ogv.intro.download.service.f fVar, @NotNull InterfaceC6388m interfaceC6388m, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar2) {
        this.f92428a = coroutineScope;
        this.f92429b = aVar;
        this.f92430c = ogvCurrentEpisodeRepository;
        this.f92431d = ogvSeason;
        this.f92432e = context;
        this.f92433f = lifecycle;
        this.f92434g = hVar;
        this.h = downloadVipNoticeDialogService;
        this.f92435i = pageReportService;
        this.f92436j = biliAccountInfo;
        this.f92437k = gVar;
        this.f92438l = fragmentManager;
        this.f92439m = fVar;
        this.f92440n = interfaceC6388m;
        this.f92441o = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x029f A[EDGE_INSN: B:108:0x029f->B:78:0x029f BREAK  A[LOOP:1: B:70:0x026e->B:110:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0439  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(final com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadFloatLayerService r10, com.bilibili.ship.theseus.ogv.intro.download.ui.b0 r11, com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 1097
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadFloatLayerService.a(com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadFloatLayerService, com.bilibili.ship.theseus.ogv.intro.download.ui.b0, com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadFloatLayerService r5, com.bilibili.ship.theseus.ogv.intro.download.ui.n0 r6, kotlin.coroutines.Continuation r7) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadFloatLayerService.b(com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadFloatLayerService, com.bilibili.ship.theseus.ogv.intro.download.ui.n0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadFloatLayerService r9, com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode r10, int r11, com.bapis.bilibili.playershared.DolbyItem.Type r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadFloatLayerService.c(com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadFloatLayerService, com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode, int, com.bapis.bilibili.playershared.DolbyItem$Type, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static boolean f(Context context) {
        if (Connectivity.isConnectedOrConnecting(Connectivity.getActiveNetworkInfo(context))) {
            return true;
        }
        ToastHelper.showToastShort(context, 2131845526);
        return false;
    }

    public static String h(StreamInfo streamInfo) {
        StringBuilder sb = new StringBuilder();
        sb.append(streamInfo.getNewDescription());
        if (streamInfo.getSuperscript().length() > 0) {
            sb.append(" · ");
            sb.append(streamInfo.getSuperscript());
        }
        return sb.toString();
    }

    public static List l(EpisodeSection episodeSection) {
        ArrayList arrayList;
        if (episodeSection.f93531j != SectionType.FEATURE) {
            List<OgvEpisode> list = episodeSection.h;
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = list.iterator();
            while (true) {
                arrayList = arrayList2;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                EpisodeRights episodeRightsE = ((OgvEpisode) next).e();
                if (episodeRightsE != null && episodeRightsE.a()) {
                    arrayList2.add(next);
                }
            }
        } else {
            List<OgvEpisode> list2 = episodeSection.h;
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it2 = list2.iterator();
            while (true) {
                arrayList = arrayList3;
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                OgvEpisode ogvEpisode = (OgvEpisode) next2;
                EpisodeRights episodeRightsE2 = ogvEpisode.e();
                if (episodeRightsE2 != null && episodeRightsE2.a()) {
                    if (ogvEpisode.f93572s != SectionType.PREVIEW) {
                        arrayList3.add(next2);
                    }
                }
            }
        }
        return arrayList;
    }

    public final void d(c0 c0Var) {
        BuildersKt.launch$default(this.f92428a, (CoroutineContext) null, (CoroutineStart) null, new DownloadFloatLayerService$checkDbReserveToNotifyDataUpdated$1(c0Var, null), 3, (Object) null);
    }

    public final void e(Context context, List<OgvEpisode> list, int i7, DolbyItem.Type type) {
        NetworkInfo activeNetworkInfo;
        b bVar = new b(this, list, i7, type, context);
        VideoDownloadWarningDialog.NetWorkWarningType netWorkWarningType = new VideoDownloadWarningDialog.NetWorkWarningType();
        if (ConnectivityManagerHelper.isActiveNetworkMetered(context) && (activeNetworkInfo = Connectivity.getActiveNetworkInfo(context)) != null) {
            if (Intrinsics.areEqual(activeNetworkInfo.getTypeName().toLowerCase(Locale.ROOT), "wifi")) {
                netWorkWarningType.b = activeNetworkInfo.getExtraInfo();
                netWorkWarningType.a = 2;
            } else {
                netWorkWarningType.b = "bili_safe_mobile_network_0f26185990023e8b";
                netWorkWarningType.a = 1;
            }
        }
        int i8 = netWorkWarningType.a;
        int i9 = 2131836523;
        int i10 = 2131831896;
        int i11 = 2131831903;
        FragmentManager fragmentManager = this.f92438l;
        if (i8 == 2) {
            SharedPreferences sharedPreferences = cK0.a.a;
            if (!cK0.a.a(netWorkWarningType.a())) {
                int i12 = VideoDownloadWarningDialog.n;
                int i13 = netWorkWarningType.a;
                if (i13 == 2) {
                    i11 = 2131831902;
                }
                if (i13 == 2) {
                    i10 = 2131831905;
                }
                c71.b.a.getClass();
                if (!c71.b.b() || FreeDataManager.getInstance().isTf()) {
                    i9 = 0;
                }
                if (fragmentManager.findFragmentByTag("VideoDownloadWarningDialog") == null) {
                    VideoDownloadWarningDialog videoDownloadWarningDialog = new VideoDownloadWarningDialog();
                    videoDownloadWarningDialog.i = netWorkWarningType;
                    videoDownloadWarningDialog.f = i11;
                    videoDownloadWarningDialog.g = i10;
                    videoDownloadWarningDialog.h = i9;
                    videoDownloadWarningDialog.m = context;
                    videoDownloadWarningDialog.setCancelable(false);
                    videoDownloadWarningDialog.l = bVar;
                    videoDownloadWarningDialog.show(fragmentManager, "VideoDownloadWarningDialog");
                    return;
                }
                return;
            }
        } else if (i8 == 1 && !FreeDataManager.getInstance().isTf()) {
            int i14 = VideoDownloadWarningDialog.n;
            int i15 = netWorkWarningType.a;
            if (i15 == 2) {
                i11 = 2131831902;
            }
            if (i15 == 2) {
                i10 = 2131831905;
            }
            c71.b.a.getClass();
            if (!c71.b.b() || FreeDataManager.getInstance().isTf()) {
                i9 = 0;
            }
            if (fragmentManager.findFragmentByTag("VideoDownloadWarningDialog") == null) {
                VideoDownloadWarningDialog videoDownloadWarningDialog2 = new VideoDownloadWarningDialog();
                videoDownloadWarningDialog2.i = netWorkWarningType;
                videoDownloadWarningDialog2.f = i11;
                videoDownloadWarningDialog2.g = i10;
                videoDownloadWarningDialog2.h = i9;
                videoDownloadWarningDialog2.m = context;
                videoDownloadWarningDialog2.setCancelable(false);
                videoDownloadWarningDialog2.l = bVar;
                videoDownloadWarningDialog2.show(fragmentManager, "VideoDownloadWarningDialog");
                return;
            }
            return;
        }
        int networkWithoutCache = ConnectivityMonitor.getInstance().getNetworkWithoutCache();
        int i16 = networkWithoutCache;
        if (FreeDataManager.getInstance().isTf()) {
            i16 = networkWithoutCache;
            if (networkWithoutCache == 2) {
                i16 = 10010;
            }
        }
        i(list, i7, type, i16);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.ship.theseus.ogv.intro.download.ui.d0 g(com.bilibili.ship.theseus.ogv.intro.download.ui.b0 r13, boolean r14, java.util.List<com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode> r15, java.lang.String r16) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadFloatLayerService.g(com.bilibili.ship.theseus.ogv.intro.download.ui.b0, boolean, java.util.List, java.lang.String):com.bilibili.ship.theseus.ogv.intro.download.ui.d0");
    }

    public final long i(List<OgvEpisode> list, int i7, DolbyItem.Type type, int i8) {
        String str;
        com.bilibili.ship.theseus.ogv.intro.download.service.f fVar = this.f92439m;
        if (fVar.f92409b.e()) {
            Iterator<OgvEpisode> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = "";
                    break;
                }
                str = it.next().f93562i;
                if (str.length() > 0) {
                    break;
                }
            }
            for (OgvEpisode ogvEpisode : list) {
                List<com.bilibili.ship.theseus.ogv.intro.download.service.a> list2 = fVar.f92410c;
                OgvSeason ogvSeason = this.f92431d;
                long j7 = ogvSeason.f94449a;
                ((ArrayList) list2).add(new com.bilibili.ship.theseus.ogv.intro.download.service.a(String.valueOf(j7), ogvSeason.f94453e, ogvSeason.f94450b, ogvEpisode, i7, type != DolbyItem.Type.NONE, i8, str));
            }
            boolean zIsEmpty = ((ArrayList) fVar.f92410c).isEmpty();
            com.bilibili.ship.theseus.ogv.intro.download.service.d dVar = fVar.f92409b;
            if (!zIsEmpty || dVar.e()) {
                dVar.g(CollectionsKt.toList(fVar.f92410c));
                ((ArrayList) fVar.f92410c).clear();
            }
        }
        return list.isEmpty() ? -1L : list.get(0).a();
    }

    public final boolean j(OgvEpisode ogvEpisode, int i7, DolbyItem.Type type) {
        boolean z6 = !(type == DolbyItem.Type.ATMOS || type == DolbyItem.Type.COMMON) || BiliAccountInfo.Companion.get().isEffectiveVip();
        Cu0.a.f1797a.getClass();
        PayStatus payStatus = PayStatus.STATUS_ALL_FREE;
        PayStatus payStatus2 = ogvEpisode.f93559e;
        OgvSeason ogvSeason = this.f92431d;
        boolean z7 = payStatus2 == payStatus || ogvSeason.h.a();
        boolean z8 = false;
        if (PlayerSettingHelper.INSTANCE.isVipQuality(i7, "bangumi") ? Cu0.a.b(ogvSeason) : true) {
            z8 = false;
            if (z7) {
                z8 = false;
                if (z6) {
                    z8 = true;
                }
            }
        }
        return z8;
    }

    public final LongSparseArray<com.bilibili.ship.theseus.ogv.intro.download.service.b> k() {
        LongSparseArray<com.bilibili.ship.theseus.ogv.intro.download.service.b> longSparseArray = ((com.bilibili.ship.theseus.ogv.intro.download.service.c) this.f92439m.f92409b.a().getValue()).f92403a.get(String.valueOf(this.f92431d.f94449a));
        LongSparseArray<com.bilibili.ship.theseus.ogv.intro.download.service.b> longSparseArray2 = longSparseArray;
        if (longSparseArray == null) {
            longSparseArray2 = new LongSparseArray<>(0, 1, null);
        }
        return longSparseArray2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            r0 = r8
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadFloatLayerService$qualitiesAndAudios$1
            if (r0 == 0) goto L29
            r0 = r8
            com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadFloatLayerService$qualitiesAndAudios$1 r0 = (com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadFloatLayerService$qualitiesAndAudios$1) r0
            r10 = r0
            r0 = r10
            int r0 = r0.label
            r9 = r0
            r0 = r9
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L29
            r0 = r10
            r1 = r9
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r10
            r8 = r0
            goto L33
        L29:
            com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadFloatLayerService$qualitiesAndAudios$1 r0 = new com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadFloatLayerService$qualitiesAndAudios$1
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            r8 = r0
        L33:
            r0 = r8
            java.lang.Object r0 = r0.result
            r10 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r11 = r0
            r0 = r8
            int r0 = r0.label
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L61
            r0 = r9
            r1 = 1
            if (r0 != r1) goto L57
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r10
            r7 = r0
            goto L8e
        L57:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L61:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            kotlinx.coroutines.CoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getIO()
            r10 = r0
            com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadFloatLayerService$qualitiesAndAudios$data$1 r0 = new com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadFloatLayerService$qualitiesAndAudios$data$1
            r1 = r0
            r2 = r7
            r3 = r6
            r4 = 0
            r1.<init>(r2, r3, r4)
            r7 = r0
            r0 = r8
            r1 = 1
            r0.label = r1
            r0 = r10
            r1 = r7
            r2 = r8
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt.withContext(r0, r1, r2)
            r8 = r0
            r0 = r8
            r7 = r0
            r0 = r8
            r1 = r11
            if (r0 != r1) goto L8e
            r0 = r11
            return r0
        L8e:
            r0 = r7
            kotlin.Pair r0 = (kotlin.Pair) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadFloatLayerService.m(com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Nullable
    public final Object n(@NotNull Continuation<? super Unit> continuation) {
        SnapshotStateList<S> snapshotStateList;
        S s7;
        b0 b0Var = new b0(new I9.c(this, 5), new LH.g(this, 4));
        final n0 n0Var = new n0(b0Var, new r0(1, this, b0Var), new Tt0.e(this, 4), new LH.j(this, 5));
        OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository = this.f92430c;
        OgvEpisode ogvEpisodeC = ogvCurrentEpisodeRepository.c();
        Gu0.a aVar = this.f92429b;
        List<EpisodeSection> listA = ogvEpisodeC != null ? aVar.a(ogvEpisodeC.f93555a) : CollectionsKt.emptyList();
        ArrayList arrayList = new ArrayList();
        EpisodeSection episodeSection = aVar.f7436c;
        if (episodeSection != null) {
            List<OgvEpisode> listL = l(episodeSection);
            if (!listL.isEmpty()) {
                arrayList.add(g(b0Var, episodeSection.f93531j == SectionType.FEATURE, listL, this.f92432e.getString(2131848904)));
            }
        }
        for (EpisodeSection episodeSection2 : listA) {
            List<OgvEpisode> listL2 = l(episodeSection2);
            if (!listL2.isEmpty()) {
                boolean z6 = episodeSection2.f93531j == SectionType.FEATURE;
                String str = episodeSection2.f93523a;
                String string = str;
                if (str.length() == 0) {
                    string = this.f92432e.getString(2131841451);
                }
                arrayList.add(g(b0Var, z6, listL2, string));
            }
        }
        n0Var.f92611f.addAll(arrayList);
        d0 d0Var = (d0) CollectionsKt.firstOrNull(arrayList);
        OgvEpisode ogvEpisode = (d0Var == null || (snapshotStateList = d0Var.f92546d) == null || (s7 = (S) CollectionsKt.firstOrNull(snapshotStateList)) == null) ? null : s7.f92500b;
        if (aVar.m() || ogvEpisode == null) {
            defpackage.a.b("[theseus-ogv-DownloadFloatLayerService-showDownloadFloatDialog] ", "isFeatureAndPreviewEmpty " + aVar.m() + ", firstAllowDownloadEpisode " + ogvEpisode + "...", "DownloadFloatLayerService-showDownloadFloatDialog");
            return Unit.INSTANCE;
        }
        final OgvEpisode ogvEpisodeC2 = ogvCurrentEpisodeRepository.c();
        OgvVideoDownloadDialog ogvVideoDownloadDialog = new OgvVideoDownloadDialog(this.f92432e, OgvVideoDownloadDialog.HeightStyle.BELOW_VIDEO_AREA, this.f92441o.f102939c);
        ComposeView composeView = new ComposeView(this.f92432e, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1893668223, true, new Function2(n0Var, ogvEpisodeC2, this) { // from class: com.bilibili.ship.theseus.ogv.intro.download.ui.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final n0 f92564a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final OgvEpisode f92565b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final DownloadFloatLayerService f92566c;

            {
                this.f92564a = n0Var;
                this.f92565b = ogvEpisodeC2;
                this.f92566c = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1893668223, iIntValue, -1, "com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadFloatLayerService.showDownloadFloatDialog.<anonymous> (DownloadFloatLayerService.kt:130)");
                    }
                    final n0 n0Var2 = this.f92564a;
                    final OgvEpisode ogvEpisode2 = this.f92565b;
                    final DownloadFloatLayerService downloadFloatLayerService = this.f92566c;
                    BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(241713721, true, new Function2(n0Var2, ogvEpisode2, downloadFloatLayerService) { // from class: com.bilibili.ship.theseus.ogv.intro.download.ui.k

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final n0 f92579a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final OgvEpisode f92580b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final DownloadFloatLayerService f92581c;

                        {
                            this.f92579a = n0Var2;
                            this.f92580b = ogvEpisode2;
                            this.f92581c = downloadFloatLayerService;
                        }

                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(241713721, iIntValue2, -1, "com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadFloatLayerService.showDownloadFloatDialog.<anonymous>.<anonymous> (DownloadFloatLayerService.kt:131)");
                                }
                                M.b(this.f92579a, this.f92580b, NestedScrollModifierKt.nestedScroll$default(Modifier.Companion, NestedScrollInteropConnectionKt.rememberNestedScrollInteropConnection(null, composer2, 0, 1), null, 2, null), composer2, 0);
                                this.f92581c.h.a(composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer2.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }, composer, 54), composer, 384, 3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            }
        }));
        ogvVideoDownloadDialog.setContentView(composeView);
        ArrayList arrayList2 = new ArrayList();
        SelectKt$selectCancellingUnselected$scope$1 selectKt$selectCancellingUnselected$scope$1 = new SelectKt$selectCancellingUnselected$scope$1(arrayList2);
        selectKt$selectCancellingUnselected$scope$1.b(new DownloadFloatLayerService$showDownloadFloatDialog$3$1(ogvVideoDownloadDialog, null));
        selectKt$selectCancellingUnselected$scope$1.b(new DownloadFloatLayerService$showDownloadFloatDialog$3$2(this, n0Var, ogvEpisode, null));
        selectKt$selectCancellingUnselected$scope$1.b(new DownloadFloatLayerService$showDownloadFloatDialog$3$3(this, null));
        Unit unit = Unit.INSTANCE;
        Object objFirst = FlowKt.first(FlowKt.merge(arrayList2), continuation);
        return objFirst == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objFirst : Unit.INSTANCE;
    }

    public final void o(final b0 b0Var) {
        PageReportService.g(this.f92435i, "united.player-video-detail.caching.button.click", MapsKt.mapOf(TuplesKt.to(TextSource.CFG_CONTENT, "1")), 4);
        final OgvVideoDownloadDialog ogvVideoDownloadDialog = new OgvVideoDownloadDialog(this.f92432e, OgvVideoDownloadDialog.HeightStyle.WRAP_CONTENT, this.f92441o.f102939c);
        ComposeView composeView = new ComposeView(this.f92432e, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1866000351, true, new Function2(b0Var, ogvVideoDownloadDialog) { // from class: com.bilibili.ship.theseus.ogv.intro.download.ui.m

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b0 f92594a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final OgvVideoDownloadDialog f92595b;

            {
                this.f92594a = b0Var;
                this.f92595b = ogvVideoDownloadDialog;
            }

            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1866000351, iIntValue, -1, "com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadFloatLayerService.showQualityFloatLayer.<anonymous> (DownloadFloatLayerService.kt:1028)");
                    }
                    final OgvVideoDownloadDialog ogvVideoDownloadDialog2 = this.f92595b;
                    final b0 b0Var2 = this.f92594a;
                    BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(1843288425, true, new Function2(b0Var2, ogvVideoDownloadDialog2) { // from class: com.bilibili.ship.theseus.ogv.intro.download.ui.s

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final b0 f92626a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final OgvVideoDownloadDialog f92627b;

                        {
                            this.f92626a = b0Var2;
                            this.f92627b = ogvVideoDownloadDialog2;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object invoke(java.lang.Object r7, java.lang.Object r8) {
                            /*
                                r6 = this;
                                r0 = r7
                                androidx.compose.runtime.Composer r0 = (androidx.compose.runtime.Composer) r0
                                r11 = r0
                                r0 = r8
                                java.lang.Integer r0 = (java.lang.Integer) r0
                                int r0 = r0.intValue()
                                r9 = r0
                                r0 = r9
                                r1 = 3
                                r0 = r0 & r1
                                r1 = 2
                                if (r0 == r1) goto L1b
                                r0 = 1
                                r10 = r0
                                goto L1e
                            L1b:
                                r0 = 0
                                r10 = r0
                            L1e:
                                r0 = r11
                                r1 = r10
                                r2 = r9
                                r3 = 1
                                r2 = r2 & r3
                                boolean r0 = r0.shouldExecute(r1, r2)
                                if (r0 == 0) goto L96
                                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                if (r0 == 0) goto L3c
                                r0 = 1843288425(0x6dde5969, float:8.6017203E27)
                                r1 = r9
                                r2 = -1
                                java.lang.String r3 = "com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadFloatLayerService.showQualityFloatLayer.<anonymous>.<anonymous> (DownloadFloatLayerService.kt:1029)"
                                androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r2, r3)
                            L3c:
                                r0 = r6
                                com.bilibili.ship.theseus.ogv.intro.download.ui.OgvVideoDownloadDialog r0 = r0.f92627b
                                r12 = r0
                                r0 = r11
                                r1 = r12
                                boolean r0 = r0.changedInstance(r1)
                                r10 = r0
                                r0 = r11
                                java.lang.Object r0 = r0.rememberedValue()
                                r8 = r0
                                r0 = r10
                                if (r0 != 0) goto L66
                                r0 = r8
                                r7 = r0
                                r0 = r8
                                androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
                                java.lang.Object r1 = r1.getEmpty()
                                if (r0 != r1) goto L79
                            L66:
                                I90.b r0 = new I90.b
                                r1 = r0
                                r2 = r12
                                r3 = 2
                                r1.<init>(r2, r3)
                                r7 = r0
                                r0 = r11
                                r1 = r7
                                r0.updateRememberedValue(r1)
                            L79:
                                r0 = r7
                                kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
                                r7 = r0
                                r0 = r6
                                com.bilibili.ship.theseus.ogv.intro.download.ui.b0 r0 = r0.f92626a
                                r1 = r7
                                r2 = 0
                                r3 = r11
                                r4 = 0
                                com.bilibili.ship.theseus.ogv.intro.download.ui.Z.a(r0, r1, r2, r3, r4)
                                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                if (r0 == 0) goto L9d
                                androidx.compose.runtime.ComposerKt.traceEventEnd()
                                goto L9d
                            L96:
                                r0 = r11
                                r0.skipToGroupEnd()
                            L9d:
                                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.download.ui.C6179s.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                        }
                    }, composer, 54), composer, 384, 3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            }
        }));
        ogvVideoDownloadDialog.setContentView(composeView);
        BuildersKt.launch$default(this.f92428a, (CoroutineContext) null, (CoroutineStart) null, new DownloadFloatLayerService$showQualityFloatLayer$2(this, ogvVideoDownloadDialog, null), 3, (Object) null);
    }

    public final void p(final b0 b0Var, final List<OgvEpisode> list, final DownloadHintType downloadHintType, OgvSeason.CacheAuthConfig.CacheDialog cacheDialog, Function0<Unit> function0) {
        long j7 = !list.isEmpty() ? list.get(0).f93555a : 0L;
        OgvSeason ogvSeason = this.f92431d;
        final long j8 = j7;
        BuildersKt.launch$default(this.f92428a, (CoroutineContext) null, (CoroutineStart) null, new DownloadFloatLayerService$showVipNoticeDialog$1(cacheDialog, this, downloadHintType, new ExposureEntry(com.bilibili.ship.theseus.united.report.a.f104837a, new Function0(b0Var, downloadHintType, this, j8, list) { // from class: com.bilibili.ship.theseus.ogv.intro.download.ui.t

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b0 f92628a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final DownloadHintType f92629b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final DownloadFloatLayerService f92630c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final long f92631d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final List f92632e;

            {
                this.f92628a = b0Var;
                this.f92629b = downloadHintType;
                this.f92630c = this;
                this.f92631d = j8;
                this.f92632e = list;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object invoke() throws NoWhenBranchMatchedException {
                List list2 = this.f92632e;
                Cu0.a aVar = Cu0.a.f1797a;
                b0 b0Var2 = this.f92628a;
                DolbyItem.Type type = b0Var2.f92535j;
                aVar.getClass();
                int iA = Cu0.a.a(type);
                int i7 = DownloadFloatLayerService.a.f92444a[this.f92629b.ordinal()];
                int i8 = 3;
                if (i7 != 1) {
                    i8 = 3;
                    if (i7 != 2) {
                        if (i7 == 3) {
                            i8 = 2;
                        } else if (i7 == 4) {
                            i8 = 1;
                        } else {
                            if (i7 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i8 = 0;
                        }
                    }
                }
                Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                mapCreateMapBuilder.put("quality", String.valueOf(b0Var2.f92534i));
                mapCreateMapBuilder.put("tune", String.valueOf(iA));
                mapCreateMapBuilder.put("cache_popup_type", String.valueOf(i8));
                mapCreateMapBuilder.put("click_epid", String.valueOf(this.f92631d));
                if (!list2.isEmpty()) {
                    mapCreateMapBuilder.put("click_epid_status", String.valueOf(((OgvEpisode) CollectionsKt.first(list2)).f93559e.m9146getValue().intValue()));
                }
                PageReportService.i(this.f92630c.f92435i, "united.player-video-detail.caching.vip.show", MapsKt.build(mapCreateMapBuilder), 4);
                return Unit.INSTANCE;
            }
        }), function0, ogvSeason.f94450b + "-" + ogvSeason.f94449a + "-" + j7, j7, null), 3, (Object) null);
    }
}
