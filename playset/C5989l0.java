package com.bilibili.playset;

import android.net.Uri;
import androidx.compose.ui.text.font.C4496a;
import androidx.core.os.EnvironmentCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.app.authorspace.ui.pages.b1;
import com.bilibili.app.comm.list.common.widget.bottomsheet.ListBottomSheetDialogV2;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.theme.R$color;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.playerbizcommonv2.web.PlayerWebNestedSwipeDismissLayout;
import com.bilibili.playset.MultiTypeListDetailActivityV2;
import com.bilibili.playset.api.MultitypeMedia;
import com.bilibili.playset.api.Upper;
import com.bilibili.playset.collection.enums.CollectionTypeEnum;
import com.bilibili.playset.playlist.helper.b;
import com.bilibili.playset.playlist.viewmodels.PlaylistViewModelV2;
import com.bilibili.video.story.player.StoryVideoPlayHandler;
import com.bilibili.video.story.player.panel.StoryV3WebDialogFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import os0.InterfaceC8258d;
import tv.danmaku.biliplayerv2.service.Video;
import vs0.InterfaceC8857a;

/* JADX INFO: renamed from: com.bilibili.playset.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/l0.class */
public final class C5989l0 implements InterfaceC8258d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultiTypeListDetailActivityV2 f85100a;

    /* JADX INFO: renamed from: com.bilibili.playset.l0$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/l0$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f85101a;

        static {
            int[] iArr = new int[CollectionTypeEnum.values().length];
            try {
                iArr[CollectionTypeEnum.SEASON.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[CollectionTypeEnum.UGC.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[CollectionTypeEnum.UGC_SEASON.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f85101a = iArr;
        }
    }

    public C5989l0(MultiTypeListDetailActivityV2 multiTypeListDetailActivityV2) {
        this.f85100a = multiTypeListDetailActivityV2;
    }

    @Override // os0.InterfaceC8258d
    public final void a(final com.bilibili.playset.api.c cVar) {
        int iL = cVar.l();
        final MultiTypeListDetailActivityV2 multiTypeListDetailActivityV2 = this.f85100a;
        if (iL != 302 && cVar.l() != 12) {
            MultitypeMedia multitypeMediaB = com.bilibili.playset.api.g.b(cVar);
            int i7 = MultiTypeListDetailActivityV2.f83940l1;
            multiTypeListDetailActivityV2.getClass();
            int i8 = MultiTypeListDetailActivityV2.a.f83983a[multitypeMediaB.getCardType().ordinal()];
            new H0("playlist.playlist-video-detail.0.0.pv", i8 != 1 ? i8 != 2 ? i8 != 3 ? "" : "ogv_new" : "ogv_playpage_share" : "ugc_playpage_share", (multitypeMediaB.getCardType() == CollectionTypeEnum.OGV || multitypeMediaB.getCardType() == CollectionTypeEnum.OGV_V2) ? "ogv_video_my_special_favorite_option_more_share" : "", "playlist.playlist-video-detail.0.0").h(multiTypeListDetailActivityV2, multitypeMediaB, com.bilibili.playset.api.g.a(cVar, multiTypeListDetailActivityV2), new Function1(multiTypeListDetailActivityV2, cVar) { // from class: com.bilibili.playset.k0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final MultiTypeListDetailActivityV2 f85098a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final com.bilibili.playset.api.c f85099b;

                {
                    this.f85098a = multiTypeListDetailActivityV2;
                    this.f85099b = cVar;
                }

                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    boolean zAreEqual = Intrinsics.areEqual(str, "delete_favorite");
                    MultiTypeListDetailActivityV2 multiTypeListDetailActivityV22 = this.f85098a;
                    com.bilibili.playset.api.c cVar2 = this.f85099b;
                    boolean z6 = true;
                    if (zAreEqual) {
                        int i9 = MultiTypeListDetailActivityV2.f83940l1;
                        multiTypeListDetailActivityV22.T6(cVar2);
                    } else if (Intrinsics.areEqual(str, "menu_translate")) {
                        Neurons.reportClick(false, "main.my-fav.content-card.more-translate.click", MapsKt.mapOf(new Pair[]{TuplesKt.to("action_type", com.bilibili.playset.api.e.a(cVar2) ? "original" : "translate"), TuplesKt.to("card_page", "playlist"), TuplesKt.to("oid", String.valueOf(cVar2.k())), TuplesKt.to("fav_type", String.valueOf(cVar2.l()))}));
                        int i10 = MultiTypeListDetailActivityV2.f83940l1;
                        multiTypeListDetailActivityV22.getClass();
                        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(multiTypeListDetailActivityV22), (CoroutineContext) null, (CoroutineStart) null, new MultiTypeListDetailActivityV2$switchTranslate$1(multiTypeListDetailActivityV22, cVar2, null), 3, (Object) null);
                    } else {
                        z6 = false;
                    }
                    return Boolean.valueOf(z6);
                }
            });
            return;
        }
        List<Pair> list = (List) os0.i.f124947b.getValue();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Pair pair : list) {
            final int i9 = 0;
            arrayList.add(new com.bilibili.app.comm.list.common.widget.bottomsheet.l(multiTypeListDetailActivityV2.getString(((Number) pair.getFirst()).intValue()), (String) null, (Integer) pair.getSecond(), R$color.Text1, false, new Function0(i9, multiTypeListDetailActivityV2, cVar) { // from class: com.bilibili.playset.j0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f85088a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f85089b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f85090c;

                {
                    this.f85088a = i9;
                    this.f85089b = multiTypeListDetailActivityV2;
                    this.f85090c = cVar;
                }

                public final Object invoke() {
                    Object obj = this.f85090c;
                    Object obj2 = this.f85089b;
                    switch (this.f85088a) {
                        case 0:
                            int i10 = MultiTypeListDetailActivityV2.f83940l1;
                            ((MultiTypeListDetailActivityV2) obj2).T6((com.bilibili.playset.api.c) obj);
                            return Unit.INSTANCE;
                        default:
                            return Boolean.valueOf(!((StoryV3WebDialogFragment) obj2).h && ((PlayerWebNestedSwipeDismissLayout) obj).isAttachedToWindow());
                    }
                }
            }, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_DET_SCORE_THRESHOLD));
        }
        ListBottomSheetDialogV2.hf(new ListBottomSheetDialogV2(), multiTypeListDetailActivityV2.getSupportFragmentManager(), (String) null, new ArrayList(arrayList), "FavoriteTab Article", 10);
    }

    @Override // os0.InterfaceC8258d
    public final void b(final com.bilibili.playset.api.c cVar) {
        MultitypeMedia multitypeMediaB = com.bilibili.playset.api.g.b(cVar);
        boolean zY = cVar.y();
        final MultiTypeListDetailActivityV2 multiTypeListDetailActivityV2 = this.f85100a;
        if (zY) {
            int i7 = MultiTypeListDetailActivityV2.f83940l1;
            final int i8 = 0;
            ListBottomSheetDialogV2.hf(new ListBottomSheetDialogV2(), multiTypeListDetailActivityV2.getSupportFragmentManager(), multiTypeListDetailActivityV2.getString(2131842551), CollectionsKt.listOf(new com.bilibili.app.comm.list.common.widget.bottomsheet.l[]{new com.bilibili.app.comm.list.common.widget.bottomsheet.l(multiTypeListDetailActivityV2.getString(2131842545), (String) null, 2131239027, R$color.Text1, true, new Function0(multiTypeListDetailActivityV2, cVar) { // from class: com.bilibili.playset.b0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final com.bilibili.playset.api.c f84110a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final MultiTypeListDetailActivityV2 f84111b;

                {
                    this.f84110a = cVar;
                    this.f84111b = multiTypeListDetailActivityV2;
                }

                public final Object invoke() {
                    int i9 = MultiTypeListDetailActivityV2.f83940l1;
                    Upper upperW = this.f84110a.w();
                    if (upperW != null) {
                        String str = upperW.jumpLink;
                        MultiTypeListDetailActivityV2 multiTypeListDetailActivityV22 = this.f84111b;
                        if (str == null || StringsKt.isBlank(str)) {
                            long j7 = upperW.mid;
                            multiTypeListDetailActivityV22.getClass();
                            if (j7 > 0) {
                                BLRouter.routeTo(RouteRequestKt.toRouteRequest("bilibili://space/" + j7), multiTypeListDetailActivityV22.getApplicationContext());
                            }
                        } else {
                            com.bilibili.playset.utils.d.c(multiTypeListDetailActivityV22.getApplicationContext(), upperW.jumpLink);
                        }
                    }
                    b.a aVar = b.a.f85324a;
                    aVar.a("main.my-fav.content-card.invalid-card-panel.click");
                    aVar.c("button_name", "up");
                    aVar.c("spmid", "playlist.playlist-detail.0.0");
                    b.a.b();
                    return Unit.INSTANCE;
                }
            }, 74), new com.bilibili.app.comm.list.common.widget.bottomsheet.l(multiTypeListDetailActivityV2.getString(2131842561), (String) null, 2131238906, R$color.Text1, true, new Function0(i8, cVar, multiTypeListDetailActivityV2) { // from class: com.bilibili.playset.c0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f84148a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f84149b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f84150c;

                {
                    this.f84148a = i8;
                    this.f84149b = cVar;
                    this.f84150c = multiTypeListDetailActivityV2;
                }

                public final Object invoke() {
                    Object obj = this.f84150c;
                    Object obj2 = this.f84149b;
                    switch (this.f84148a) {
                        case 0:
                            int i9 = MultiTypeListDetailActivityV2.f83940l1;
                            com.bilibili.playset.utils.d.c(((MultiTypeListDetailActivityV2) obj).getApplicationContext(), C4496a.a("bilibili://search?keyword=", Uri.encode(((com.bilibili.playset.api.c) obj2).t())));
                            b.a aVar = b.a.f85324a;
                            aVar.a("main.my-fav.content-card.invalid-card-panel.click");
                            aVar.c("button_name", "search");
                            aVar.c("spmid", "playlist.playlist-detail.0.0");
                            b.a.b();
                            break;
                        default:
                            ((StoryVideoPlayHandler) obj2).getMVideoPlayEventDispatcher().dispatchVideoStart((Video) obj);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, 74), new com.bilibili.app.comm.list.common.widget.bottomsheet.l(multiTypeListDetailActivityV2.getString(2131842560), (String) null, 2131242379, R$color.Text1, false, new b1(multiTypeListDetailActivityV2, cVar), BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_DET_SCORE_THRESHOLD), new com.bilibili.app.comm.list.common.widget.bottomsheet.l(multiTypeListDetailActivityV2.getString(2131851709), (String) null, 2131242379, R$color.Text1, false, new Function0(multiTypeListDetailActivityV2, cVar) { // from class: com.bilibili.playset.d0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final MultiTypeListDetailActivityV2 f84229a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final com.bilibili.playset.api.c f84230b;

                {
                    this.f84229a = multiTypeListDetailActivityV2;
                    this.f84230b = cVar;
                }

                public final Object invoke() {
                    PlaylistViewModelV2 playlistViewModelV2 = this.f84229a.f83970c0;
                    PlaylistViewModelV2 playlistViewModelV22 = playlistViewModelV2;
                    if (playlistViewModelV2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
                        playlistViewModelV22 = null;
                    }
                    playlistViewModelV22.M0(new InterfaceC8857a.C1370a(this.f84230b));
                    b.a aVar = b.a.f85324a;
                    aVar.a("main.my-fav.content-card.invalid-card-panel.click");
                    aVar.c("button_name", "clear_all");
                    aVar.c("spmid", "playlist.playlist-detail.0.0");
                    b.a.b();
                    return Unit.INSTANCE;
                }
            }, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_DET_SCORE_THRESHOLD)}), (String) null, 24);
        } else {
            String strI = cVar.i();
            if (strI != null) {
                if (cVar.x()) {
                    com.bilibili.playset.utils.d.a(multiTypeListDetailActivityV2, Uri.parse(strI), "");
                } else {
                    com.bilibili.playset.utils.d.a(multiTypeListDetailActivityV2, Uri.parse(strI), "playlist.playlist-detail.0.0");
                }
            }
        }
        int iL = cVar.l();
        if (iL == 2) {
            int i9 = a.f85101a[multitypeMediaB.getCardType().ordinal()];
            String str = i9 != 1 ? i9 != 2 ? i9 != 3 ? EnvironmentCompat.MEDIA_UNKNOWN : "drama_ugcvideo_detail" : "ugcvideo_detail" : "drama";
            long id = multitypeMediaB.getId();
            int i10 = MultiTypeListDetailActivityV2.f83940l1;
            com.bilibili.playset.utils.e.a(cVar, id, multiTypeListDetailActivityV2.b7(), str, multiTypeListDetailActivityV2.q7(multiTypeListDetailActivityV2.V6()) ? "1" : "2");
            return;
        }
        if (iL == 12) {
            long id2 = multitypeMediaB.getId();
            int i11 = MultiTypeListDetailActivityV2.f83940l1;
            com.bilibili.playset.utils.e.a(cVar, id2, multiTypeListDetailActivityV2.b7(), "music_detail", multiTypeListDetailActivityV2.q7(multiTypeListDetailActivityV2.V6()) ? "1" : "2");
        } else if (iL == 24 || iL == 42) {
            long id3 = multitypeMediaB.getId();
            int i12 = MultiTypeListDetailActivityV2.f83940l1;
            com.bilibili.playset.utils.e.a(cVar, id3, multiTypeListDetailActivityV2.b7(), "pgcvideo_detail", multiTypeListDetailActivityV2.q7(multiTypeListDetailActivityV2.V6()) ? "1" : "2");
        }
    }

    @Override // os0.InterfaceC8258d
    public final void c(com.bilibili.playset.api.c cVar) {
        MultiTypeListDetailActivityV2 multiTypeListDetailActivityV2 = this.f85100a;
        PlaylistViewModelV2 playlistViewModelV2 = multiTypeListDetailActivityV2.f83970c0;
        PlaylistViewModelV2 playlistViewModelV22 = playlistViewModelV2;
        if (playlistViewModelV2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlaylistViewModel");
            playlistViewModelV22 = null;
        }
        playlistViewModelV22.M0(new InterfaceC8857a.b(cVar, multiTypeListDetailActivityV2.b7()));
        Neurons.reportClick(false, "playlist.playlist-detail.detailpage-bottom.0.click", MapsKt.mapOf(TuplesKt.to("button_name", "remove_invalid")));
    }
}
