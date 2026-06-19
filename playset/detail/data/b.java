package com.bilibili.playset.detail.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.EnvironmentCompat;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.playerbizcommon.IVideoLikeRouteService;
import com.bilibili.playset.api.MultitypeMedia;
import com.bilibili.playset.api.MultitypePlaylist;
import com.bilibili.playset.api.Upper;
import com.bilibili.playset.detail.MultiTypeListDetailViewModel;
import com.bilibili.playset.detail.data.f;
import com.bilibili.playset.playlist.adapters.FavFooterItem$Companion$LoadMoreType;
import com.bilibili.playset.playlist.helper.b;
import com.bilibili.pvtracker.PageViewTracker;
import gs0.C7377a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/b.class */
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C7377a f84454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final q f84455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public MultiTypeListDetailViewModel f84456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public CoroutineScope f84457d;

    @Inject
    public b(@NotNull C7377a c7377a, @NotNull q qVar) {
        this.f84454a = c7377a;
        this.f84455b = qVar;
    }

    public final void a(@NotNull f fVar, @NotNull h hVar) {
        String string;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        MultiTypeListDetailViewModel multiTypeListDetailViewModel;
        Object value5;
        Object value6;
        boolean z6 = fVar instanceof f.l;
        C7377a c7377a = this.f84454a;
        if (z6) {
            f.l lVar = (f.l) fVar;
            MultiTypeListDetailViewModel multiTypeListDetailViewModel2 = this.f84456c;
            if (multiTypeListDetailViewModel2 != null) {
                MutableStateFlow<h> mutableStateFlowP0 = multiTypeListDetailViewModel2.P0();
                do {
                    value6 = mutableStateFlowP0.getValue();
                } while (!mutableStateFlowP0.compareAndSet(value6, h.a(hVar, lVar.f84483a, lVar.f84484b, null, null, null, false, false, false, false, false, false, false, null, false, false, false, false, lVar.f84485c, 0, 3145724)));
            }
            ((LinkedHashMap) c7377a.f120777a).clear();
            CoroutineScope coroutineScope = this.f84457d;
            if (coroutineScope != null) {
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new ActionHandler$handleInitial$2(this, lVar, null), 3, (Object) null);
                return;
            }
            return;
        }
        if (fVar instanceof f.n) {
            f.n nVar = (f.n) fVar;
            CoroutineScope coroutineScope2 = this.f84457d;
            if (coroutineScope2 != null) {
                BuildersKt.launch$default(coroutineScope2, (CoroutineContext) null, (CoroutineStart) null, new ActionHandler$handleLoadData$1(this, hVar, nVar, null), 3, (Object) null);
                return;
            }
            return;
        }
        if (fVar instanceof f.o) {
            CoroutineScope coroutineScope3 = this.f84457d;
            if (coroutineScope3 != null) {
                BuildersKt.launch$default(coroutineScope3, (CoroutineContext) null, (CoroutineStart) null, new ActionHandler$handleLoadMore$1(this, hVar, null), 3, (Object) null);
                return;
            }
            return;
        }
        if (fVar instanceof f.b) {
            if (!o.b()) {
                MultiTypeListDetailViewModel multiTypeListDetailViewModel3 = this.f84456c;
                if (multiTypeListDetailViewModel3 != null) {
                    multiTypeListDetailViewModel3.N0(new ActionHandler$handleChangeLike$2(null));
                    return;
                }
                return;
            }
            boolean z7 = hVar.h;
            Upper upper = hVar.f84517e.upper;
            if (upper != null) {
                long j7 = upper.mid;
                CoroutineScope coroutineScope4 = this.f84457d;
                if (coroutineScope4 != null) {
                    BuildersKt.launch$default(coroutineScope4, (CoroutineContext) null, (CoroutineStart) null, new ActionHandler$handleChangeLike$1$1(this, hVar, z7, j7, null), 3, (Object) null);
                }
                b.a aVar = b.a.f85324a;
                aVar.a("playlist.playlist-detail.PLlike.0.click");
                aVar.c(IVideoLikeRouteService.ACTION_LIKE, !z7 ? "1" : "2");
                aVar.c("playlist_id", String.valueOf(hVar.f84513a));
                String strCurrentPolarisActionId = PageViewTracker.getInstance().currentPolarisActionId();
                if (strCurrentPolarisActionId == null) {
                    strCurrentPolarisActionId = "";
                }
                aVar.c("action_id", strCurrentPolarisActionId);
                b.a.b();
                return;
            }
            return;
        }
        if (fVar instanceof f.a) {
            if (!o.b()) {
                MultiTypeListDetailViewModel multiTypeListDetailViewModel4 = this.f84456c;
                if (multiTypeListDetailViewModel4 != null) {
                    multiTypeListDetailViewModel4.N0(new ActionHandler$handleChangeFav$7(null));
                    return;
                }
                return;
            }
            if (!hVar.f84522k) {
                MultiTypeListDetailViewModel multiTypeListDetailViewModel5 = this.f84456c;
                if (multiTypeListDetailViewModel5 != null) {
                    multiTypeListDetailViewModel5.N0(new ActionHandler$handleChangeFav$1(null));
                    return;
                }
                return;
            }
            Pair pair = TuplesKt.to("favoritePL", "2");
            String strCurrentPolarisActionId2 = PageViewTracker.getInstance().currentPolarisActionId();
            String str = strCurrentPolarisActionId2;
            if (strCurrentPolarisActionId2 == null) {
                str = "";
            }
            Neurons.reportClick(false, "playlist.playlist-detail.PLfavorite.0.click", MapsKt.mapOf(new Pair[]{pair, TuplesKt.to("action_id", str)}));
            if (hVar.f84521j) {
                MultiTypeListDetailViewModel multiTypeListDetailViewModel6 = this.f84456c;
                if (multiTypeListDetailViewModel6 != null) {
                    MutableStateFlow<h> mutableStateFlowP02 = multiTypeListDetailViewModel6.P0();
                    do {
                        value4 = mutableStateFlowP02.getValue();
                    } while (!mutableStateFlowP02.compareAndSet(value4, q.a((h) multiTypeListDetailViewModel6.P0().getValue(), false)));
                }
                CoroutineScope coroutineScope5 = this.f84457d;
                if (coroutineScope5 != null) {
                    BuildersKt.launch$default(coroutineScope5, (CoroutineContext) null, (CoroutineStart) null, new ActionHandler$handleChangeFav$5(this, hVar, null), 3, (Object) null);
                }
            } else {
                MultiTypeListDetailViewModel multiTypeListDetailViewModel7 = this.f84456c;
                if (multiTypeListDetailViewModel7 != null) {
                    MutableStateFlow<h> mutableStateFlowP03 = multiTypeListDetailViewModel7.P0();
                    do {
                        value5 = mutableStateFlowP03.getValue();
                    } while (!mutableStateFlowP03.compareAndSet(value5, q.a((h) multiTypeListDetailViewModel7.P0().getValue(), true)));
                }
                CoroutineScope coroutineScope6 = this.f84457d;
                if (coroutineScope6 != null) {
                    BuildersKt.launch$default(coroutineScope6, (CoroutineContext) null, (CoroutineStart) null, new ActionHandler$handleChangeFav$3(this, hVar, null), 3, (Object) null);
                }
            }
            if (!hVar.f84526o || (multiTypeListDetailViewModel = this.f84456c) == null) {
                return;
            }
            multiTypeListDetailViewModel.N0(new ActionHandler$handleChangeFav$6(hVar, null));
            return;
        }
        if (fVar instanceof f.t) {
            if (!hVar.f84524m) {
                MultiTypeListDetailViewModel multiTypeListDetailViewModel8 = this.f84456c;
                if (multiTypeListDetailViewModel8 != null) {
                    multiTypeListDetailViewModel8.N0(new ActionHandler$handleShare$3(null));
                    return;
                }
                return;
            }
            if (o.b()) {
                MultiTypeListDetailViewModel multiTypeListDetailViewModel9 = this.f84456c;
                if (multiTypeListDetailViewModel9 != null) {
                    multiTypeListDetailViewModel9.N0(new ActionHandler$handleShare$1(hVar, null));
                    return;
                }
                return;
            }
            MultiTypeListDetailViewModel multiTypeListDetailViewModel10 = this.f84456c;
            if (multiTypeListDetailViewModel10 != null) {
                multiTypeListDetailViewModel10.N0(new ActionHandler$handleShare$2(null));
                return;
            }
            return;
        }
        if (fVar instanceof f.g) {
            f.g gVar = (f.g) fVar;
            MultitypeMedia multitypeMediaB = com.bilibili.playset.api.g.b(gVar.f84475a);
            com.bilibili.playset.api.c cVar = gVar.f84475a;
            if (cVar.y()) {
                MultiTypeListDetailViewModel multiTypeListDetailViewModel11 = this.f84456c;
                if (multiTypeListDetailViewModel11 != null) {
                    multiTypeListDetailViewModel11.N0(new ActionHandler$handleClickFavItem$1(gVar, null));
                }
            } else {
                String strI = cVar.i();
                if (strI != null) {
                    if (cVar.x()) {
                        MultiTypeListDetailViewModel multiTypeListDetailViewModel12 = this.f84456c;
                        if (multiTypeListDetailViewModel12 != null) {
                            multiTypeListDetailViewModel12.N0(new ActionHandler$handleClickFavItem$2$1(strI, null));
                        }
                    } else {
                        MultiTypeListDetailViewModel multiTypeListDetailViewModel13 = this.f84456c;
                        if (multiTypeListDetailViewModel13 != null) {
                            multiTypeListDetailViewModel13.N0(new ActionHandler$handleClickFavItem$2$2(strI, null));
                        }
                    }
                }
            }
            Upper upper2 = hVar.f84517e.upper;
            long j8 = upper2 != null ? upper2.mid : 0L;
            long j9 = j8;
            if (j8 == 0) {
                j9 = hVar.f84514b;
            }
            boolean z8 = o.b() && j9 == com.bilibili.adcommon.utils.a.a();
            int iL = cVar.l();
            if (iL == 2) {
                c7377a.getClass();
                int i7 = C7377a.C1279a.f120778a[multitypeMediaB.getCardType().ordinal()];
                String str2 = i7 != 1 ? i7 != 2 ? i7 != 3 ? EnvironmentCompat.MEDIA_UNKNOWN : "drama_ugcvideo_detail" : "ugcvideo_detail" : "drama";
                BLog.i("PlayListDetailReportManager", "reportUgcOrSeasonClickEvent -> deduplication - media = " + cVar.t());
                com.bilibili.playset.utils.e.a(cVar, multitypeMediaB.getId(), hVar.f84513a, str2, z8 ? "1" : "2");
                return;
            }
            if (iL == 12) {
                c7377a.getClass();
                BLog.i("PlayListDetailReportManager", "reportAudioClickEvent -> deduplication - media = " + cVar.t());
                com.bilibili.playset.utils.e.a(cVar, multitypeMediaB.getId(), hVar.f84513a, "music_detail", z8 ? "1" : "2");
                return;
            }
            if (iL == 24 || iL == 42) {
                c7377a.getClass();
                BLog.i("PlayListDetailReportManager", "reportOgvClickEvent -> deduplication - media = " + cVar.t());
                com.bilibili.playset.utils.e.a(cVar, multitypeMediaB.getId(), hVar.f84513a, "pgcvideo_detail", z8 ? "1" : "2");
                return;
            }
            return;
        }
        if (fVar instanceof f.h) {
            f.h hVar2 = (f.h) fVar;
            if (hVar2.f84478a.l() == 302 || hVar2.f84478a.l() == 12) {
                MultiTypeListDetailViewModel multiTypeListDetailViewModel14 = this.f84456c;
                if (multiTypeListDetailViewModel14 != null) {
                    multiTypeListDetailViewModel14.N0(new ActionHandler$handleClickFavItemMore$1(hVar2, null));
                    return;
                }
                return;
            }
            MultiTypeListDetailViewModel multiTypeListDetailViewModel15 = this.f84456c;
            if (multiTypeListDetailViewModel15 != null) {
                multiTypeListDetailViewModel15.N0(new ActionHandler$handleClickFavItemMore$2(hVar2, null));
                return;
            }
            return;
        }
        if (fVar instanceof f.i) {
            f.i iVar = (f.i) fVar;
            CoroutineScope coroutineScope7 = this.f84457d;
            if (coroutineScope7 != null) {
                BuildersKt.launch$default(coroutineScope7, (CoroutineContext) null, (CoroutineStart) null, new ActionHandler$handleDeleteMedia$1(this, iVar, hVar, null), 3, (Object) null);
                return;
            }
            return;
        }
        if (fVar instanceof f.C0567f) {
            f.C0567f c0567f = (f.C0567f) fVar;
            CoroutineScope coroutineScope8 = this.f84457d;
            if (coroutineScope8 != null) {
                BuildersKt.launch$default(coroutineScope8, (CoroutineContext) null, (CoroutineStart) null, new ActionHandler$handleClickClearInvalidVideo$1(this, c0567f, hVar, null), 3, (Object) null);
            }
            cf.p.b("button_name", "remove_invalid", "playlist.playlist-detail.detailpage-bottom.0.click", false);
            return;
        }
        if (fVar instanceof f.e) {
            f.e eVar = (f.e) fVar;
            CoroutineScope coroutineScope9 = this.f84457d;
            if (coroutineScope9 != null) {
                BuildersKt.launch$default(coroutineScope9, (CoroutineContext) null, (CoroutineStart) null, new ActionHandler$handleClearInvalidVideo$1(this, eVar, hVar, null), 3, (Object) null);
                return;
            }
            return;
        }
        if (fVar instanceof f.d) {
            MultiTypeListDetailViewModel multiTypeListDetailViewModel16 = this.f84456c;
            if (multiTypeListDetailViewModel16 != null) {
                multiTypeListDetailViewModel16.N0(new ActionHandler$handleClearAllInvalidVideo$1(hVar, null));
                return;
            }
            return;
        }
        if (fVar instanceof f.r) {
            Neurons.reportClick$default(false, "playlist.playlist-detail.search.0.click", (Map) null, 4, (Object) null);
            MultiTypeListDetailViewModel multiTypeListDetailViewModel17 = this.f84456c;
            if (multiTypeListDetailViewModel17 != null) {
                multiTypeListDetailViewModel17.N0(new ActionHandler$handlePlaylistSearch$1(hVar, null));
                return;
            }
            return;
        }
        if (fVar instanceof f.p) {
            MultiTypeListDetailViewModel multiTypeListDetailViewModel18 = this.f84456c;
            if (multiTypeListDetailViewModel18 != null) {
                multiTypeListDetailViewModel18.N0(new ActionHandler$handlePlaylistBatchManager$1(hVar, null));
                return;
            }
            return;
        }
        if (fVar instanceof f.q) {
            f.q qVar = (f.q) fVar;
            MultiTypeListDetailViewModel multiTypeListDetailViewModel19 = this.f84456c;
            if (multiTypeListDetailViewModel19 != null) {
                multiTypeListDetailViewModel19.N0(new ActionHandler$handlePlaylistOverflow$1(hVar, qVar, null));
                return;
            }
            return;
        }
        if (fVar instanceof f.c) {
            CoroutineScope coroutineScope10 = this.f84457d;
            if (coroutineScope10 != null) {
                BuildersKt.launch$default(coroutineScope10, (CoroutineContext) null, (CoroutineStart) null, new ActionHandler$handleCleanInvalid$1(this, hVar, null), 3, (Object) null);
                return;
            }
            return;
        }
        if (fVar instanceof f.x) {
            f.x xVar = (f.x) fVar;
            CoroutineScope coroutineScope11 = this.f84457d;
            if (coroutineScope11 != null) {
                BuildersKt.launch$default(coroutineScope11, (CoroutineContext) null, (CoroutineStart) null, new ActionHandler$handleToTop$1(this, xVar, null), 3, (Object) null);
                return;
            }
            return;
        }
        if (fVar instanceof f.j) {
            CoroutineScope coroutineScope12 = this.f84457d;
            if (coroutineScope12 != null) {
                BuildersKt.launch$default(coroutineScope12, (CoroutineContext) null, (CoroutineStart) null, new ActionHandler$handleDeletePlaylist$1(this, hVar, null), 3, (Object) null);
                return;
            }
            return;
        }
        if (fVar instanceof f.u) {
            f.u uVar = (f.u) fVar;
            CoroutineScope coroutineScope13 = this.f84457d;
            if (coroutineScope13 != null) {
                BuildersKt.launch$default(coroutineScope13, (CoroutineContext) null, (CoroutineStart) null, new ActionHandler$handleSortMedias$1(this, uVar, null), 3, (Object) null);
                return;
            }
            return;
        }
        if (fVar instanceof f.k) {
            MultiTypeListDetailViewModel multiTypeListDetailViewModel20 = this.f84456c;
            if (multiTypeListDetailViewModel20 != null) {
                MutableStateFlow<h> mutableStateFlowP04 = multiTypeListDetailViewModel20.P0();
                do {
                    value3 = mutableStateFlowP04.getValue();
                } while (!mutableStateFlowP04.compareAndSet(value3, h.a(hVar, 0L, 0L, null, null, null, false, false, false, false, false, false, false, null, false, false, true, false, 0, 0, 3932159)));
                return;
            }
            return;
        }
        if (fVar instanceof f.y) {
            final f.y yVar = (f.y) fVar;
            Upper upper3 = hVar.f84517e.upper;
            long j10 = upper3 != null ? upper3.mid : 0L;
            long j11 = j10;
            if (j10 == 0) {
                j11 = hVar.f84514b;
            }
            boolean z9 = o.b() && j11 == com.bilibili.adcommon.utils.a.a();
            MultiTypeListDetailViewModel multiTypeListDetailViewModel21 = this.f84456c;
            if (multiTypeListDetailViewModel21 != null) {
                final boolean z10 = z9;
                multiTypeListDetailViewModel21.Y0(new Function1(this, yVar, z10) { // from class: com.bilibili.playset.detail.data.a

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final b f84451a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final f.y f84452b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final boolean f84453c;

                    {
                        this.f84451a = this;
                        this.f84452b = yVar;
                        this.f84453c = z10;
                    }

                    public final Object invoke(Object obj) {
                        h hVar3 = (h) obj;
                        q qVar2 = this.f84451a.f84455b;
                        f.y yVar2 = this.f84452b;
                        String str3 = yVar2.f84500a;
                        MultitypePlaylist.Info info = hVar3.f84517e;
                        boolean z11 = true;
                        int i8 = yVar2.f84502c ? info.attr | 1 : info.attr & (-2);
                        MultitypePlaylist.Info infoA = c.a(info, i8, null, yVar2.f84501b, 0, str3, 122750);
                        boolean z12 = (i8 & 1) == 0;
                        boolean z13 = this.f84453c;
                        boolean z14 = z12 && !z13;
                        if (((i8 >> 1) & 1) != 0) {
                            z11 = false;
                        }
                        return h.a(hVar3, 0L, 0L, null, null, infoA, z13, z11, false, true, false, z14, z12, null, false, false, false, false, 0, 0, 4188815);
                    }
                });
                return;
            }
            return;
        }
        if (fVar instanceof f.z) {
            f.z zVar = (f.z) fVar;
            MultiTypeListDetailViewModel multiTypeListDetailViewModel22 = this.f84456c;
            if (multiTypeListDetailViewModel22 != null) {
                MutableStateFlow<h> mutableStateFlowP05 = multiTypeListDetailViewModel22.P0();
                do {
                    value2 = mutableStateFlowP05.getValue();
                } while (!mutableStateFlowP05.compareAndSet(value2, q.b((h) multiTypeListDetailViewModel22.P0().getValue(), zVar.f84503a)));
                return;
            }
            return;
        }
        if (fVar instanceof f.v) {
            MultiTypeListDetailViewModel multiTypeListDetailViewModel23 = this.f84456c;
            if (multiTypeListDetailViewModel23 != null) {
                MutableStateFlow<h> mutableStateFlowP06 = multiTypeListDetailViewModel23.P0();
                do {
                    value = mutableStateFlowP06.getValue();
                } while (!mutableStateFlowP06.compareAndSet(value, q.b((h) multiTypeListDetailViewModel23.P0().getValue(), FavFooterItem$Companion$LoadMoreType.LOAD_MORE_STATUS_GONE)));
                return;
            }
            return;
        }
        if (fVar instanceof f.w) {
            com.bilibili.playset.api.c cVar2 = ((f.w) fVar).f84498a;
            if (cVar2.n() == 10) {
                BLog.i("ActionHandler", "translating");
                return;
            }
            if (cVar2.n() == 2) {
                cVar2.q(1);
                BLog.i("ActionHandler", "translated");
                return;
            } else if (cVar2.n() == 1 && !StringsKt.isBlank(cVar2.m())) {
                cVar2.q(2);
                BLog.i("ActionHandler", "translate title not blank");
                return;
            } else {
                CoroutineScope coroutineScope14 = this.f84457d;
                if (coroutineScope14 != null) {
                    BuildersKt.launch$default(coroutineScope14, (CoroutineContext) null, (CoroutineStart) null, new ActionHandler$handleSwitchTranslate$1(this, cVar2, null), 3, (Object) null);
                    return;
                }
                return;
            }
        }
        if (fVar instanceof f.s) {
            f.s sVar = (f.s) fVar;
            CoroutineScope coroutineScope15 = this.f84457d;
            if (coroutineScope15 != null) {
                BuildersKt.launch$default(coroutineScope15, (CoroutineContext) null, (CoroutineStart) null, new ActionHandler$handleReportShareSuccess$1(this, sVar, null), 3, (Object) null);
                return;
            }
            return;
        }
        if (fVar instanceof f.m) {
            MultitypeMedia multitypeMediaB2 = com.bilibili.playset.api.g.b(((f.m) fVar).f84486a);
            long j12 = hVar.f84513a;
            c7377a.getClass();
            MultitypeMedia multitypeMedia = multitypeMediaB2.season;
            if (multitypeMedia == null) {
                string = String.valueOf(multitypeMediaB2.id);
            } else {
                long j13 = multitypeMediaB2.id;
                long j14 = multitypeMedia.id;
                StringBuilder sb = new StringBuilder();
                sb.append(j13);
                sb.append(Long.valueOf(j14));
                string = sb.toString();
            }
            Object obj = ((LinkedHashMap) c7377a.f120777a).get(string);
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.areEqual(obj, bool)) {
                return;
            }
            c7377a.f120777a.put(string, bool);
            defpackage.a.b("reportMediaExposure -> before deduplication - media = ", multitypeMediaB2.title, "PlayListDetailReportManager");
            int i8 = multitypeMediaB2.type;
            String str3 = i8 != 2 ? i8 != 21 ? i8 != 24 ? null : "pgcvideo_detail" : "drama" : multitypeMediaB2.season != null ? "drama_ugcvideo_detail" : "ugcvideo_detail";
            if (str3 == null) {
                return;
            }
            BLog.i("PlayListDetailReportManager", "reportMediaExposure -> after deduplication - media = " + multitypeMediaB2.title);
            Pair pair2 = TuplesKt.to("flow", str3);
            String strCurrentPolarisActionId3 = PageViewTracker.getInstance().currentPolarisActionId();
            if (strCurrentPolarisActionId3 == null) {
                strCurrentPolarisActionId3 = "";
            }
            Neurons.reportExposure$default(false, "playlist.playlist-detail.detailpage-contentlist.0.show", MapsKt.mapOf(new Pair[]{pair2, TuplesKt.to("action_id", strCurrentPolarisActionId3), TuplesKt.to("playlist_id", String.valueOf(j12)), TuplesKt.to("oid", String.valueOf(multitypeMediaB2.id)), TuplesKt.to("fav_type", String.valueOf(multitypeMediaB2.type))}), (List) null, 8, (Object) null);
        }
    }
}
