package com.bilibili.ship.theseus.cheese.biz.modules;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ImageBitmap;
import au0.C4911a;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.app.comm.supermenu.share.v2.ShareContentProvider;
import com.bilibili.app.gemini.player.feature.snapshot.PosterStyle;
import com.bilibili.app.gemini.share.SharePosition;
import com.bilibili.lib.sharewrapper.SocializeMedia;
import com.bilibili.lib.sharewrapper.basic.BiliExtraBuilder;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import com.bilibili.ogv.infra.coroutine.StateFlowTransformKt;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.player.tangram.basic.PlayNetworkEnv;
import com.bilibili.playerbizcommonv2.guideBubble.BiliGuideBubble;
import com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository;
import com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonDetailRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.story.StoryEntranceService;
import com.bilibili.ship.theseus.united.page.story.StoryTransitionAnimService;
import com.bilibili.ship.theseus.united.page.view.RelationRepository;
import com.bilibili.ship.theseus.united.page.view.d;
import com.bilibili.ship.theseus.united.player.oldway.UnitedGeminiPlayerCommonActionDelegate;
import com.google.gson.JsonObject;
import com.tencent.connect.common.Constants;
import eu0.C6985d;
import ev0.InterfaceC7008a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kntr.base.localization.NumberFormat_androidKt;
import kntr.common.share.core.model.ShareMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.interact.biz.model.viewprogress.uniteviewprogress.Material;
import tv.danmaku.biliplayerv2.service.interact.biz.model.viewprogress.uniteviewprogress.PageType;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/CheesePlayerActionDelegateImpl.class */
@StabilityInferred(parameters = 0)
public final class CheesePlayerActionDelegateImpl implements yk.c {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f90358w = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CheesePlayRepository f90359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f90360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final UnitedGeminiPlayerCommonActionDelegate f90361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.cheese.player.playselect.b f90362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C7893a f90363e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final C4911a f90364f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.cheese.biz.intro.primary.V f90365g;

    @NotNull
    public final Context h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final RelationRepository f90366i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.d f90367j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final CheesePlayRepository f90368k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.toolbar.j f90369l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final StoryEntranceService f90370m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final StoryEntranceService.a f90371n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final PageReportService f90372o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final StoryTransitionAnimService f90373p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final List<C6985d> f90374q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final UnitedSeasonDetailRepository f90375r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final InterfaceC7008a f90376s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.intro.module.season.E f90377t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final ArrayList<a> f90378u = new ArrayList<>();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final StateFlow<com.bilibili.app.gemini.player.widget.selector.f> f90379v;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/CheesePlayerActionDelegateImpl$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final com.bilibili.app.gemini.player.widget.selector.g f90380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f90381b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f90382c;

        public a(@NotNull com.bilibili.app.gemini.player.widget.selector.g gVar, long j7, long j8) {
            this.f90380a = gVar;
            this.f90381b = j7;
            this.f90382c = j8;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f90380a, aVar.f90380a) && this.f90381b == aVar.f90381b && this.f90382c == aVar.f90382c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f90382c) + C3554n0.a(this.f90380a.a.hashCode() * 31, 31, this.f90381b);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("LocalVideoItem(videoListItem=");
            sb.append(this.f90380a);
            sb.append(", avid=");
            sb.append(this.f90381b);
            sb.append(", cid=");
            return android.support.v4.media.session.a.a(sb, this.f90382c, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/CheesePlayerActionDelegateImpl$b.class */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f90383a;

        static {
            int[] iArr = new int[SharePosition.values().length];
            try {
                iArr[SharePosition.POSITION_FULLSCREEN_SNAPSHOT.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[SharePosition.POSITION_FULLSCREEN_SNAPSHOT_COMBINATION.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[SharePosition.POSITION_LAND_FULLSCREEN_SHARE_WIDGET.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[SharePosition.POSITION_LAND_FULLSCREEN_END_PAGE_SHARE_WIDGET.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[SharePosition.POSITION_VERTICAL_FULLSCREEN_SHARE_WIDGET.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr[SharePosition.POSITION_VERTICAL_FULLSCREEN_END_PAGE_SHARE_WIDGET.ordinal()] = 6;
            } catch (NoSuchFieldError e12) {
            }
            try {
                iArr[SharePosition.POSITION_HALF_SCREEN_END_PAGE_SHARE_WIDGET.ordinal()] = 7;
            } catch (NoSuchFieldError e13) {
            }
            try {
                iArr[SharePosition.POSITION_FULLSCREEN_GIF.ordinal()] = 8;
            } catch (NoSuchFieldError e14) {
            }
            f90383a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/CheesePlayerActionDelegateImpl$c.class */
    public static final class c implements ShareContentProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CheesePlayerActionDelegateImpl f90384a;

        public c(CheesePlayerActionDelegateImpl cheesePlayerActionDelegateImpl) {
            this.f90384a = cheesePlayerActionDelegateImpl;
        }

        public final Bundle getShareContent(String str) {
            CheesePlayerActionDelegateImpl cheesePlayerActionDelegateImpl = this.f90384a;
            C4911a c4911a = cheesePlayerActionDelegateImpl.f90364f;
            String str2 = c4911a.f54249n;
            int length = str2.length();
            String str3 = c4911a.f54252q;
            if (length == 0 && str3.length() == 0) {
                return new Bundle();
            }
            if (str3.length() == 0) {
                str3 = "";
            }
            C4911a c4911a2 = cheesePlayerActionDelegateImpl.f90364f;
            String str4 = c4911a2.f54250o;
            String strA = str4.length() != 0 ? str4 : "";
            String str5 = c4911a2.f54251p;
            if (SocializeMedia.isDynamic(str)) {
                JSONObject jSONObject = new JSONObject();
                pl.h.a(301, jSONObject, "biz_type", "cover_url", str5);
                jSONObject.put("target_url", str3);
                jSONObject.put("title", str2);
                jSONObject.put("desc_text", strA);
                return new BiliExtraBuilder().title(str2).description(strA).contentId(c4911a2.f54237a).contentType(21).contentUrl(str3).editContent(NumberFormat_androidKt.format$default("#%s#", str2, 0, 2, (Object) null)).cover(c4911a2.f54251p).sketchParam(jSONObject.toJSONString()).publish(false).from("pugv").build();
            }
            String strR0 = CheesePlayerActionDelegateImpl.r0(str3, str);
            if (Intrinsics.areEqual(str, SocializeMedia.GENERIC)) {
                strA = B0.a.a(str2, ", ", strR0);
            } else if (Intrinsics.areEqual(str, SocializeMedia.COPY)) {
                strA = strR0;
            }
            return (TextUtils.equals(SocializeMedia.GENERIC, str) || TextUtils.equals(SocializeMedia.COPY, str)) ? new ThirdPartyExtraBuilder().title(str2).content(strA).shareType(ThirdPartyExtraBuilder.PARAMS_TYPE_TEXT).build() : new Bundle();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/CheesePlayerActionDelegateImpl$d.class */
    public static final class d implements ShareContentProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CheesePlayerActionDelegateImpl f90385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Function0<String> f90386b;

        public d(CheesePlayerActionDelegateImpl cheesePlayerActionDelegateImpl, Function0<String> function0) {
            this.f90385a = cheesePlayerActionDelegateImpl;
            this.f90386b = function0;
        }

        public final Bundle getShareContent(String str) {
            Bundle bundleBuild;
            String str2 = (String) this.f90386b.invoke();
            String str3 = str2;
            if (str2 == null) {
                str3 = "";
            }
            CheesePlayerActionDelegateImpl cheesePlayerActionDelegateImpl = this.f90385a;
            cheesePlayerActionDelegateImpl.getClass();
            BLog.d("buildPicBiliInternalSharingContent imagePath: " + str3 + ", target: " + str);
            boolean zIsDynamic = SocializeMedia.isDynamic(str);
            C4911a c4911a = cheesePlayerActionDelegateImpl.f90364f;
            if (zIsDynamic || SocializeMedia.isIm(str)) {
                BiliExtraBuilder biliExtraBuilderContentType = new BiliExtraBuilder().contentType(SocializeMedia.isDynamic(str) ? 21 : 5);
                Context context = cheesePlayerActionDelegateImpl.h;
                String str4 = c4911a.f54249n;
                d.a aVar = (d.a) cheesePlayerActionDelegateImpl.f90367j.f104057d.getValue();
                String str5 = "";
                if (aVar != null) {
                    str5 = aVar.f104061d;
                    if (str5 == null) {
                        str5 = "";
                    }
                }
                C6985d c6985dA = cheesePlayerActionDelegateImpl.f90368k.a();
                bundleBuild = biliExtraBuilderContentType.description(context.getString(2131847363, str4, str5, com.bilibili.app.comment3.ui.i.a(c6985dA != null ? Long.valueOf(c6985dA.f117510e) : null, "av"))).publish(true).localImages(new String[]{str3}).from("pugv_play").build();
            } else {
                bundleBuild = new ThirdPartyExtraBuilder().title(c4911a.f54249n).content(cheesePlayerActionDelegateImpl.h.getString(2131845776)).targetUrl(cheesePlayerActionDelegateImpl.b0()).imagePath(str3).shareType(ThirdPartyExtraBuilder.PARAMS_TYPE_IMAGE).build();
            }
            return bundleBuild;
        }
    }

    @Inject
    public CheesePlayerActionDelegateImpl(@NotNull CheesePlayRepository cheesePlayRepository, @NotNull CoroutineScope coroutineScope, @NotNull UnitedGeminiPlayerCommonActionDelegate unitedGeminiPlayerCommonActionDelegate, @NotNull com.bilibili.ship.theseus.cheese.player.playselect.b bVar, @NotNull C7893a c7893a, @NotNull C4911a c4911a, @NotNull com.bilibili.ship.theseus.cheese.biz.intro.primary.V v7, @NotNull Context context, @NotNull RelationRepository relationRepository, @NotNull com.bilibili.ship.theseus.united.page.view.d dVar, @NotNull CheesePlayRepository cheesePlayRepository2, @NotNull com.bilibili.ship.theseus.united.page.toolbar.j jVar, @NotNull StoryEntranceService storyEntranceService, @NotNull StoryEntranceService.a aVar, @NotNull PageReportService pageReportService, @NotNull StoryTransitionAnimService storyTransitionAnimService, @NotNull List<C6985d> list, @NotNull UnitedSeasonDetailRepository unitedSeasonDetailRepository, @NotNull InterfaceC7008a interfaceC7008a, @NotNull com.bilibili.ship.theseus.united.page.intro.module.season.E e7) {
        this.f90359a = cheesePlayRepository;
        this.f90360b = coroutineScope;
        this.f90361c = unitedGeminiPlayerCommonActionDelegate;
        this.f90362d = bVar;
        this.f90363e = c7893a;
        this.f90364f = c4911a;
        this.f90365g = v7;
        this.h = context;
        this.f90366i = relationRepository;
        this.f90367j = dVar;
        this.f90368k = cheesePlayRepository2;
        this.f90369l = jVar;
        this.f90370m = storyEntranceService;
        this.f90371n = aVar;
        this.f90372o = pageReportService;
        this.f90373p = storyTransitionAnimService;
        this.f90374q = list;
        this.f90375r = unitedSeasonDetailRepository;
        this.f90376s = interfaceC7008a;
        this.f90377t = e7;
        final StateFlow<C7893a.C1318a> stateFlow = c7893a.f123393f;
        this.f90379v = FlowKt.stateIn(new Flow<com.bilibili.app.gemini.player.widget.selector.f>(stateFlow, this) { // from class: com.bilibili.ship.theseus.cheese.biz.modules.CheesePlayerActionDelegateImpl$special$$inlined$map$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Flow f90387a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CheesePlayerActionDelegateImpl f90388b;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.modules.CheesePlayerActionDelegateImpl$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/CheesePlayerActionDelegateImpl$special$$inlined$map$1$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f90389a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final CheesePlayerActionDelegateImpl f90390b;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.modules.CheesePlayerActionDelegateImpl$special$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/CheesePlayerActionDelegateImpl$special$$inlined$map$1$2$1.class */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    Object result;
                    final AnonymousClass2 this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(AnonymousClass2 anonymousClass2, Continuation continuation) {
                        super(continuation);
                        this.this$0 = anonymousClass2;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return this.this$0.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, CheesePlayerActionDelegateImpl cheesePlayerActionDelegateImpl) {
                    this.f90389a = flowCollector;
                    this.f90390b = cheesePlayerActionDelegateImpl;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        r0 = r7
                        boolean r0 = r0 instanceof com.bilibili.ship.theseus.cheese.biz.modules.CheesePlayerActionDelegateImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r7
                        com.bilibili.ship.theseus.cheese.biz.modules.CheesePlayerActionDelegateImpl$special$$inlined$map$1$2$1 r0 = (com.bilibili.ship.theseus.cheese.biz.modules.CheesePlayerActionDelegateImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        r9 = r0
                        r0 = r9
                        int r0 = r0.label
                        r8 = r0
                        r0 = r8
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r0 & r1
                        if (r0 == 0) goto L29
                        r0 = r9
                        r1 = r8
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        int r1 = r1 + r2
                        r0.label = r1
                        r0 = r9
                        r7 = r0
                        goto L33
                    L29:
                        com.bilibili.ship.theseus.cheese.biz.modules.CheesePlayerActionDelegateImpl$special$$inlined$map$1$2$1 r0 = new com.bilibili.ship.theseus.cheese.biz.modules.CheesePlayerActionDelegateImpl$special$$inlined$map$1$2$1
                        r1 = r0
                        r2 = r5
                        r3 = r7
                        r1.<init>(r2, r3)
                        r7 = r0
                    L33:
                        r0 = r7
                        java.lang.Object r0 = r0.result
                        r10 = r0
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        r9 = r0
                        r0 = r7
                        int r0 = r0.label
                        r8 = r0
                        r0 = r8
                        if (r0 == 0) goto L5e
                        r0 = r8
                        r1 = 1
                        if (r0 != r1) goto L54
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        goto L88
                    L54:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        r1 = r0
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r0
                    L5e:
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        r0 = r6
                        lv0.a$a r0 = (lv0.C7893a.C1318a) r0
                        r6 = r0
                        r0 = r5
                        com.bilibili.ship.theseus.cheese.biz.modules.CheesePlayerActionDelegateImpl r0 = r0.f90390b
                        com.bilibili.app.gemini.player.widget.selector.f r0 = r0.s0()
                        r6 = r0
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r5
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f90389a
                        r1 = r6
                        r2 = r7
                        java.lang.Object r0 = r0.emit(r1, r2)
                        r1 = r9
                        if (r0 != r1) goto L88
                        r0 = r9
                        return r0
                    L88:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.modules.CheesePlayerActionDelegateImpl$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f90387a = stateFlow;
                this.f90388b = this;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f90387a.collect(new AnonymousClass2(flowCollector, this.f90388b), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, coroutineScope, SharingStarted.Companion.getEagerly(), s0());
    }

    public static String r0(String str, String str2) {
        String strA;
        String strA2 = G.p.a(G.p.a(str, StringsKt.n(str, "?") ? "&" : "?"), "bsource=");
        if (Intrinsics.areEqual(str2, SocializeMedia.GENERIC)) {
            strA = G.p.a(strA2, "more");
        } else {
            strA = strA2;
            if (Intrinsics.areEqual(str2, SocializeMedia.COPY)) {
                strA = G.p.a(strA2, "link_copy");
            }
        }
        return strA;
    }

    public final boolean A() {
        return true;
    }

    @NotNull
    public final com.bilibili.app.gemini.share.i B(@NotNull SharePosition sharePosition) {
        return new com.bilibili.app.gemini.share.i(95, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, this.f90369l.f103398b);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.bilibili.ship.theseus.cheese.biz.modules.A] */
    @NotNull
    public final kntr.common.share.domain.model.e C(@NotNull String str) {
        C4911a c4911a = this.f90364f;
        final String str2 = c4911a.f54249n;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        String str3 = c4911a.f54252q;
        objectRef.element = str3;
        if (str3.length() == 0) {
            objectRef.element = "";
        }
        c4911a.f54250o.getClass();
        final kntr.common.share.domain.model.a aVar = new kntr.common.share.domain.model.a((String) null, (String) null, 7);
        final String str4 = c4911a.f54251p;
        ?? r02 = new Function1(aVar, str2, this, objectRef, str4) { // from class: com.bilibili.ship.theseus.cheese.biz.modules.A

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final kntr.common.share.domain.model.a f90321a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f90322b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final CheesePlayerActionDelegateImpl f90323c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Ref.ObjectRef f90324d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final String f90325e;

            {
                this.f90321a = aVar;
                this.f90322b = str2;
                this.f90323c = this;
                this.f90324d = objectRef;
                this.f90325e = str4;
            }

            public final Object invoke(Object obj) {
                kntr.common.share.domain.model.f fVar = (kntr.common.share.domain.model.f) obj;
                kntr.common.share.common.handler.copy.e eVar = kntr.common.share.common.handler.copy.e.b;
                final kntr.common.share.domain.model.a aVar2 = this.f90321a;
                final Ref.ObjectRef objectRef2 = this.f90324d;
                final String str5 = this.f90322b;
                final CheesePlayerActionDelegateImpl cheesePlayerActionDelegateImpl = this.f90323c;
                fVar.a(eVar, new Function0(aVar2, str5, cheesePlayerActionDelegateImpl, objectRef2) { // from class: com.bilibili.ship.theseus.cheese.biz.modules.w

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final kntr.common.share.domain.model.a f90425a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final String f90426b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final CheesePlayerActionDelegateImpl f90427c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final Ref.ObjectRef f90428d;

                    {
                        this.f90425a = aVar2;
                        this.f90426b = str5;
                        this.f90427c = cheesePlayerActionDelegateImpl;
                        this.f90428d = objectRef2;
                    }

                    public final Object invoke() {
                        String str6 = (String) this.f90428d.element;
                        this.f90427c.getClass();
                        return new kntr.common.share.common.handler.copy.b(kntr.common.share.domain.model.a.a(this.f90425a, (String) null, androidx.fragment.app.D.a(this.f90426b, ", ", CheesePlayerActionDelegateImpl.r0(str6, SocializeMedia.COPY), new StringBuilder()), (String) null, 5).b);
                    }
                });
                fVar.a(y71.f.b, new Function0(cheesePlayerActionDelegateImpl, objectRef2, str5) { // from class: com.bilibili.ship.theseus.cheese.biz.modules.x

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final CheesePlayerActionDelegateImpl f90429a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Ref.ObjectRef f90430b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final String f90431c;

                    {
                        this.f90429a = cheesePlayerActionDelegateImpl;
                        this.f90430b = objectRef2;
                        this.f90431c = str5;
                    }

                    public final Object invoke() {
                        String str6 = (String) this.f90430b.element;
                        this.f90429a.getClass();
                        return v71.c.d(new kntr.common.share.domain.model.a(this.f90431c, CheesePlayerActionDelegateImpl.r0(str6, SocializeMedia.GENERIC), 4), ShareMode.Text, 4);
                    }
                });
                kntr.common.share.common.handler.dynamic.f fVar2 = kntr.common.share.common.handler.dynamic.f.b;
                final String str6 = this.f90325e;
                fVar.a(fVar2, new Function0(str5, objectRef2, cheesePlayerActionDelegateImpl, str6) { // from class: com.bilibili.ship.theseus.cheese.biz.modules.y

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final String f90432a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Ref.ObjectRef f90433b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final CheesePlayerActionDelegateImpl f90434c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final String f90435d;

                    {
                        this.f90432a = str5;
                        this.f90433b = objectRef2;
                        this.f90434c = cheesePlayerActionDelegateImpl;
                        this.f90435d = str6;
                    }

                    public final Object invoke() {
                        String str7 = this.f90432a;
                        return v71.c.a(new kntr.common.share.domain.model.a(str7, NumberFormat_androidKt.format$default("#%s#", str7, 0, 2, (Object) null), (String) this.f90433b.element), ShareMode.Link, this.f90435d, (String) null, (String) null, String.valueOf(this.f90434c.f90364f.f54237a), Constants.VIA_REPORT_TYPE_QQFAVORITES, false, "pugv", (String) null, (String) null, false, (String) null, (String) null, (String) null, (ImageBitmap) null, (String) null, 1046168);
                    }
                });
                fVar.a(kntr.common.share.common.handler.web.bihuo.b.b, new WS0.m(aVar2, 2));
                fVar.a(kntr.common.share.common.handler.wx.j.b, new WS0.n(aVar2, 2));
                fVar.a(kntr.common.share.common.handler.wx.c.b, new Gi.a(aVar2, 2));
                fVar.a(kntr.common.share.common.handler.qq.i.b, new WS0.o(aVar2, 4));
                fVar.a(kntr.common.share.common.handler.qq.k.b, new WS0.p(aVar2, 4));
                fVar.a(kntr.common.share.common.handler.sina.g.b, new WS0.q(aVar2, 4));
                fVar.a(kntr.common.share.common.handler.facebook.e.b, new WS0.r(aVar2, 2));
                fVar.a(kntr.common.share.common.handler.whatsapp.f.b, new Gg.g(aVar2, 2));
                fVar.a(kntr.common.share.common.handler.x.f.b, new WS0.i(aVar2, 1));
                return Unit.INSTANCE;
            }
        };
        kntr.common.share.domain.model.g gVar = new kntr.common.share.domain.model.g();
        r02.invoke(gVar);
        return new kntr.common.share.domain.model.e(gVar.a);
    }

    public final boolean D() {
        this.f90361c.getClass();
        return false;
    }

    @Nullable
    public final StateFlow<Long> E() {
        return this.f90361c.E();
    }

    @Nullable
    public final Function3<Modifier, Composer, Integer, Unit> F() {
        this.f90361c.getClass();
        return null;
    }

    @Nullable
    public final StateFlow<Boolean> H() {
        return this.f90361c.f104707c.f103998f;
    }

    @Nullable
    public final StateFlow<Long> I() {
        return this.f90361c.I();
    }

    @Nullable
    public final Deferred<Boolean> J() {
        return this.f90361c.f104708d.f100330g;
    }

    public final boolean K() {
        return this.f90361c.f104713j.b();
    }

    public final void L() {
        this.f90361c.L();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Type inference failed for: r0v32, types: [com.bilibili.ship.theseus.cheese.biz.modules.z] */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kntr.common.share.domain.model.e M(@org.jetbrains.annotations.NotNull java.lang.String r16, @org.jetbrains.annotations.Nullable final kotlin.jvm.functions.Function0<android.graphics.Bitmap> r17, @org.jetbrains.annotations.Nullable final kotlin.jvm.functions.Function0<java.lang.String> r18) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.modules.CheesePlayerActionDelegateImpl.M(java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0):kntr.common.share.domain.model.e");
    }

    @NotNull
    public final String N() {
        this.f90361c.getClass();
        return "";
    }

    @Nullable
    public final StateFlow<Long> O() {
        return this.f90361c.O();
    }

    @NotNull
    public final String P() {
        C7893a.C1318a c1318aC = this.f90363e.c();
        return String.valueOf(c1318aC != null ? Long.valueOf(c1318aC.f123395a.f123397a) : null);
    }

    public final boolean Q() {
        return this.f90361c.Q();
    }

    public final boolean R() {
        this.f90361c.getClass();
        return false;
    }

    @NotNull
    public final StateFlow<com.bilibili.app.gemini.player.widget.selector.f> S() {
        return this.f90379v;
    }

    public final void T() {
        this.f90361c.getClass();
    }

    @NotNull
    public final PosterStyle U() {
        this.f90361c.getClass();
        return PosterStyle.STYLE_DEFAULT;
    }

    public final void V(@NotNull com.bilibili.app.gemini.player.widget.selector.g gVar, int i7) {
        a aVar = (a) CollectionsKt.getOrNull(this.f90378u, i7);
        if (aVar != null) {
            if (this.f90375r.d()) {
                InterfaceC7008a.e(this.f90376s, aVar.f90381b, aVar.f90382c, null, "united.player-video-detail.drama-player-episode.0", null, 0, null, false, 426);
            } else {
                CheesePlayRepository.e(this.f90359a, aVar.f90381b, aVar.f90382c, 0, 28);
            }
        }
    }

    @NotNull
    public final String W() {
        JsonObject jsonObject = new JsonObject();
        C6985d c6985dA = this.f90359a.a();
        jsonObject.addProperty("epid", c6985dA != null ? String.valueOf(c6985dA.f117521q) : null);
        C7893a.C1318a c1318aC = this.f90363e.c();
        String strValueOf = null;
        if (c1318aC != null) {
            strValueOf = String.valueOf(c1318aC.f123395a.f123398b);
        }
        jsonObject.addProperty("cid", strValueOf);
        return JsonUtilKt.toJson(jsonObject);
    }

    @Nullable
    public final StateFlow<Boolean> X() {
        return this.f90361c.f104707c.f103999g;
    }

    @Nullable
    public final String Y() {
        return this.f90361c.Y();
    }

    public final void Z() {
        Long l7 = this.f90371n.f103038a;
        boolean z6 = l7 != null && l7.longValue() > 0;
        if (z6) {
            PageReportService.g(this.f90372o, "united.player-video-detail.story-back.type.click", MapsKt.mapOf(TuplesKt.to("back_way", "4")), 4);
        }
        BuildersKt.launch$default(this.f90360b, (CoroutineContext) null, (CoroutineStart) null, new CheesePlayerActionDelegateImpl$fullscreen2Story$1(this, z6, null), 3, (Object) null);
    }

    @Nullable
    public final com.bilibili.app.gemini.player.widget.like.z a() {
        return this.f90361c.a();
    }

    public final boolean a0() {
        return this.f90361c.a0();
    }

    @Nullable
    public final Drawable b() {
        return this.f90361c.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String b0() {
        /*
            r4 = this;
            r0 = r4
            com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository r0 = r0.f90368k
            eu0.d r0 = r0.a()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L17
            r0 = r5
            java.lang.String r0 = r0.f117522r
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L25
        L17:
            r0 = r4
            au0.a r0 = r0.f90364f
            long r0 = r0.f54237a
            java.lang.String r1 = "https://www.bilibili.com/cheese/play/ss"
            java.lang.String r0 = androidx.compose.foundation.text.selection.C3751q.a(r0, r1)
            r5 = r0
        L25:
            r0 = r5
            java.lang.String r1 = "csource"
            java.lang.String r2 = "common_share_screenshot_null"
            java.lang.String r0 = com.bilibili.ad.adview.pegasus.holders.inline.pegasus.m.a(r0, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.modules.CheesePlayerActionDelegateImpl.b0():java.lang.String");
    }

    public final boolean c() {
        return false;
    }

    @NotNull
    public final String c0() {
        this.f90361c.getClass();
        return "";
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @NotNull
    public final String d(@NotNull SharePosition sharePosition) throws NoWhenBranchMatchedException {
        String str;
        switch (b.f90383a[sharePosition.ordinal()]) {
            case 1:
                str = "lesson1";
                break;
            case 2:
                str = "lesson3";
                break;
            case 3:
                str = "fullplayer_horizontal";
                break;
            case 4:
                str = "fullplayer_horizontal_playfinish";
                break;
            case 5:
                str = "fullplayer_vertical";
                break;
            case 6:
                str = "fullplayer_vertical_playfinish";
                break;
            case 7:
                str = "vinfo_playfinish";
                break;
            case 8:
                str = "2";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return str;
    }

    public final void d0() {
        this.f90361c.getClass();
    }

    @Nullable
    public final StateFlow<PlayNetworkEnv> e() {
        return this.f90361c.e();
    }

    public final boolean e0() {
        this.f90361c.getClass();
        return false;
    }

    @Nullable
    public final Flow<com.bilibili.app.gemini.player.widget.online.a> f() {
        return null;
    }

    @Nullable
    public final StateFlow<Boolean> f0() {
        return this.f90361c.f104707c.f104002k;
    }

    public final void g() {
        this.f90362d.c();
    }

    @Nullable
    public final StateFlow<Long> g0() {
        return this.f90361c.g0();
    }

    @Nullable
    public final String getArcTitle() {
        C6985d c6985dA = this.f90359a.a();
        return c6985dA != null ? c6985dA.f117512g : null;
    }

    @Nullable
    public final com.bilibili.app.gemini.player.widget.coin.a getCoinStyle() {
        return this.f90361c.getCoinStyle();
    }

    @Nullable
    public final Drawable getLikeIcon() {
        return this.f90361c.getLikeIcon();
    }

    @Nullable
    public final Drawable getLikedIcon() {
        return this.f90361c.f104708d.a();
    }

    public final int getTemplateId() {
        return 21;
    }

    public final long getTypeId() {
        this.f90361c.getClass();
        return 0L;
    }

    public final void h() {
        this.f90362d.b(false);
    }

    @NotNull
    public final ShareContentProvider h0(@NotNull String str) {
        return new c(this);
    }

    @Nullable
    public final StateFlow<Boolean> i() {
        return this.f90361c.i();
    }

    public final boolean i0() {
        this.f90361c.getClass();
        return false;
    }

    @Nullable
    public final Pair<Class<? extends AbsFunctionWidget>, AbsFunctionWidget.Configuration> j(@NotNull String str) {
        this.f90361c.getClass();
        return null;
    }

    @NotNull
    public final CoroutineScope j0() {
        return this.f90361c.f104705a;
    }

    @NotNull
    public final ShareContentProvider k(@NotNull String str, @NotNull Function0<String> function0) {
        return new d(this, function0);
    }

    public final void k0(@NotNull Material material, @Nullable Function1<? super Material, Unit> function1) {
        this.f90361c.getClass();
    }

    public final void l(@NotNull String str, @Nullable String str2, @Nullable String str3) {
        this.f90361c.l(str, str2, str3);
    }

    public final boolean l0() {
        if (!this.f90375r.d()) {
            return false;
        }
        this.f90377t.f101456e.tryEmit(Boolean.TRUE);
        return true;
    }

    @Nullable
    public final String m() {
        this.f90361c.getClass();
        return "";
    }

    @NotNull
    public final String m0() {
        String quantityString;
        com.bilibili.ship.theseus.cheese.biz.intro.primary.a0 a0Var = this.f90365g.f89692c;
        if (Intrinsics.areEqual(a0Var.f89710d, "playtime-square-line@500")) {
            quantityString = a0Var.f89709c;
        } else {
            Resources resources = this.h.getResources();
            long j7 = a0Var.f89707a;
            quantityString = resources.getQuantityString(2131689608, (int) j7, NumberFormat_androidKt.format$default(Long.valueOf(j7), "0", 0, 2, (Object) null));
        }
        Resources resources2 = this.h.getResources();
        RelationRepository relationRepository = this.f90366i;
        return B0.a.a(quantityString, "·", resources2.getQuantityString(2131689756, (int) relationRepository.b(), NumberFormat_androidKt.format$default(Long.valueOf(relationRepository.b()), "0", 0, 2, (Object) null)));
    }

    @Nullable
    public final MutableSharedFlow<yk.e> n() {
        return this.f90361c.f104721r;
    }

    @NotNull
    public final Integer n0(@Nullable String str) {
        return 4;
    }

    public final boolean o() {
        this.f90361c.getClass();
        return false;
    }

    @NotNull
    public final Pair<Boolean, String> o0() {
        return this.f90361c.o0();
    }

    @NotNull
    public final String p() {
        return String.valueOf(this.f90364f.f54237a);
    }

    public final boolean p0() {
        this.f90361c.getClass();
        return true;
    }

    public final int q() {
        return this.f90361c.q();
    }

    @NotNull
    public final String q0(@NotNull SharePosition sharePosition) {
        int i7 = b.f90383a[sharePosition.ordinal()];
        String str = "player.player.shots.0.player";
        if (i7 != 1) {
            str = "player.player.shots.0.player";
            if (i7 != 2) {
                str = "pugv.pugv-video-detail.0.0.pv";
            }
        }
        return str;
    }

    public final boolean r() {
        this.f90361c.getClass();
        return false;
    }

    @Nullable
    public final Integer s() {
        return this.f90361c.s();
    }

    public final com.bilibili.app.gemini.player.widget.selector.f s0() {
        ArrayList arrayList = new ArrayList();
        this.f90378u.clear();
        Iterator<T> it = this.f90374q.iterator();
        com.bilibili.app.gemini.player.widget.selector.g gVar = null;
        while (true) {
            com.bilibili.app.gemini.player.widget.selector.g gVar2 = gVar;
            if (!it.hasNext()) {
                return new com.bilibili.app.gemini.player.widget.selector.f(arrayList, CollectionsKt.indexOf(arrayList, gVar2));
            }
            C6985d c6985d = (C6985d) it.next();
            long j7 = c6985d.f117508c;
            String str = c6985d.f117512g;
            String strA = str;
            if (j7 > 0) {
                strA = ec.b.a(j7, "  ", str);
            }
            com.bilibili.app.gemini.player.widget.selector.g gVar3 = new com.bilibili.app.gemini.player.widget.selector.g(strA);
            C7893a.C1318a c1318aC = this.f90363e.c();
            com.bilibili.app.gemini.player.widget.selector.g gVar4 = gVar2;
            if (c1318aC != null) {
                gVar4 = gVar2;
                if (c6985d.f117511f == c1318aC.f123395a.f123398b) {
                    gVar4 = gVar3;
                }
            }
            gVar3.c = new com.bilibili.app.gemini.player.widget.selector.c(!c6985d.f117517m, c6985d.f117518n);
            arrayList.add(gVar3);
            this.f90378u.add(new a(gVar3, c6985d.f117510e, c6985d.f117511f));
            gVar = gVar4;
        }
    }

    public final boolean t() {
        this.f90361c.getClass();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String u() {
        /*
            r2 = this;
            r0 = r2
            com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository r0 = r0.f90359a
            eu0.d r0 = r0.a()
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L17
            r0 = r3
            java.lang.String r0 = r0.f117512g
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L1a
        L17:
            java.lang.String r0 = ""
            r3 = r0
        L1a:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.modules.CheesePlayerActionDelegateImpl.u():java.lang.String");
    }

    public final void v(@Nullable String str, @NotNull PageType pageType) {
        this.f90361c.v(str, pageType);
    }

    @Nullable
    public final BiliGuideBubble w(@NotNull View view) {
        return this.f90361c.w(view);
    }

    @NotNull
    public final StateFlow<wk.a> x() {
        return StateFlowTransformKt.a(this.f90367j.f104057d, this.f90360b, new Xi1.l(this, 2));
    }

    @NotNull
    public final String y() {
        return "";
    }

    public final boolean z(@Nullable String str, @NotNull PageType pageType) {
        this.f90361c.z(str, pageType);
        return true;
    }
}
