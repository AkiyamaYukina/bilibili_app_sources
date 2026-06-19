package com.bilibili.ship.theseus.playlist.di.driver;

import android.os.SystemClock;
import com.bilibili.app.gemini.base.player.GeminiCommonResolverParams;
import com.bilibili.lib.accountinfo.model.AccountInfo;
import com.bilibili.lib.moss.api.BusinessException;
import com.bilibili.lib.moss.api.NetworkException;
import com.bilibili.playerbizcommonv2.utils.f;
import com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl;
import com.bilibili.ship.theseus.sail.ArcPrivacyException;
import com.bilibili.ship.theseus.sail.TeenagerException;
import com.bilibili.ship.theseus.sail.ViewNotFoundException;
import com.bilibili.ship.theseus.united.bean.d;
import com.bilibili.ship.theseus.united.bean.e;
import com.bilibili.ship.theseus.united.page.ad.PageAdRepository;
import com.bilibili.ship.theseus.united.page.error.a;
import ev0.InterfaceC7008a;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import mv0.C8044b;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.videopage.common.performance.PerformanceTracerImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/PlayListBusinessScopeDriverImpl$switchToNewVideo$1.class */
public final class PlayListBusinessScopeDriverImpl$switchToNewVideo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final InterfaceC7008a.C1258a $startParams;
    Object L$0;
    int label;
    final PlayListBusinessScopeDriverImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayListBusinessScopeDriverImpl$switchToNewVideo$1(PlayListBusinessScopeDriverImpl playListBusinessScopeDriverImpl, InterfaceC7008a.C1258a c1258a, Continuation<? super PlayListBusinessScopeDriverImpl$switchToNewVideo$1> continuation) {
        super(2, continuation);
        this.this$0 = playListBusinessScopeDriverImpl;
        this.$startParams = c1258a;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlayListBusinessScopeDriverImpl$switchToNewVideo$1(this.this$0, this.$startParams, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        String strB;
        Object objA;
        Object bVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC7008a.C1258a c1258a = this.$startParams;
            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
            d dVar = (d) e.f98758a.a(c1258a);
            if (dVar != null) {
                mapCreateMapBuilder.putAll(e.b(dVar));
            }
            com.bilibili.ship.theseus.united.bean.b bVar2 = (com.bilibili.ship.theseus.united.bean.b) com.bilibili.ship.theseus.united.bean.c.f98751a.a(c1258a);
            if (bVar2 != null) {
                mapCreateMapBuilder.putAll(com.bilibili.ship.theseus.united.bean.c.a(bVar2));
            }
            com.bilibili.ship.theseus.united.page.translate.d dVar2 = (com.bilibili.ship.theseus.united.page.translate.d) com.bilibili.ship.theseus.united.page.translate.c.f103471a.a(c1258a);
            if (dVar2 != null) {
                Map mapCreateMapBuilder2 = MapsKt.createMapBuilder();
                mapCreateMapBuilder2.put("translate_switch", dVar2.f103472a);
                Map mapBuild = MapsKt.build(mapCreateMapBuilder2);
                if (mapBuild != null) {
                    mapCreateMapBuilder.putAll(mapBuild);
                }
            }
            mapCreateMapBuilder.put("video_bg_play_listen", (String) f.f81920i.getValue());
            Map mapBuild2 = MapsKt.build(mapCreateMapBuilder);
            strB = com.bilibili.ship.theseus.united.utils.e.b();
            PlayListBusinessScopeDriverImpl playListBusinessScopeDriverImpl = this.this$0;
            com.bilibili.ship.theseus.sail.f fVar = playListBusinessScopeDriverImpl.f95413d;
            InterfaceC7008a.C1258a c1258a2 = this.$startParams;
            long j7 = c1258a2.f117620b;
            PageAdRepository pageAdRepository = playListBusinessScopeDriverImpl.f95420l;
            String str = pageAdRepository.f98944g;
            String str2 = pageAdRepository.f98943f;
            C8044b c8044bA = playListBusinessScopeDriverImpl.f95421m.a();
            InterfaceC7008a.C1258a c1258a3 = this.$startParams;
            String str3 = c1258a3.f117623e;
            String str4 = c1258a3.h;
            String str5 = str4;
            if (str4 == null) {
                str5 = "";
            }
            C8044b c8044bA2 = C8044b.a(c8044bA, str3, c1258a3.f117624f, str5, null, 0, 114);
            GeminiCommonResolverParams.Scene scene = this.this$0.f95426r.f129026b;
            this.L$0 = strB;
            this.label = 1;
            objA = fVar.a(j7, c1258a2.f117621c, strB, c1258a2.f117625g, str, str2, mapBuild2, c8044bA2, scene, this);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            strB = (String) this.L$0;
            ResultKt.throwOnFailure(obj);
            objA = ((Result) obj).unbox-impl();
        }
        this.this$0.f95418j.b(PerformanceTracerImpl.Entry.ON_THESEUS_PAGE_DETAIL_DATA_DISPATCHED.attach(SystemClock.elapsedRealtime()));
        BLog.i("PlayListBusinessScopeDriverImpl$switchToNewVideo$1-invokeSuspend", "[theseus-playlist-detail-PlayListBusinessScopeDriverImpl$switchToNewVideo$1-invokeSuspend] View call end.");
        PlayListBusinessScopeDriverImpl playListBusinessScopeDriverImpl2 = this.this$0;
        InterfaceC7008a.C1258a c1258a4 = this.$startParams;
        playListBusinessScopeDriverImpl2.getClass();
        BusinessException businessException = Result.exceptionOrNull-impl(objA);
        if (businessException == null) {
            bVar = new PlayListBusinessScopeDriverImpl.a.d((com.bilibili.ship.theseus.sail.e) objA, strB, c1258a4);
        } else {
            defpackage.a.b("[theseus-playlist-detail-PlayListBusinessScopeDriverImpl-processViewReplyResult] ", O4.d.a("view request failed: ", businessException), "PlayListBusinessScopeDriverImpl-processViewReplyResult");
            if (playListBusinessScopeDriverImpl2.f95427s.f95092O) {
                bVar = businessException instanceof TeenagerException ? PlayListBusinessScopeDriverImpl.a.h.f95446a : PlayListBusinessScopeDriverImpl.a.C0775a.f95433a;
            } else if (businessException instanceof ViewNotFoundException) {
                bVar = new PlayListBusinessScopeDriverImpl.a.f(((ViewNotFoundException) businessException).getJumpUrl());
            } else if (businessException instanceof TeenagerException) {
                bVar = PlayListBusinessScopeDriverImpl.a.h.f95446a;
            } else if (businessException instanceof ArcPrivacyException) {
                bVar = new PlayListBusinessScopeDriverImpl.a.g(((ArcPrivacyException) businessException).getHint());
            } else if (businessException instanceof NetworkException) {
                bVar = new PlayListBusinessScopeDriverImpl.a.b(c1258a4, businessException, a.b.f99586a);
            } else {
                boolean z6 = businessException instanceof BusinessException;
                a.d dVar3 = a.d.f99588a;
                if (z6) {
                    int code = businessException.getCode();
                    if (code == -404) {
                        bVar = new PlayListBusinessScopeDriverImpl.a.f(null);
                    } else if (code != -403) {
                        bVar = new PlayListBusinessScopeDriverImpl.a.b(c1258a4, businessException, dVar3);
                    } else {
                        com.bilibili.ship.theseus.united.page.error.a aVar = dVar3;
                        if (playListBusinessScopeDriverImpl2.f95422n.isLogin()) {
                            AccountInfo accountInfoFromCache = playListBusinessScopeDriverImpl2.f95424p.getAccountInfoFromCache();
                            aVar = dVar3;
                            if (accountInfoFromCache != null) {
                                aVar = accountInfoFromCache.isFormalAccount() ? dVar3 : a.C0984a.f99585a;
                            }
                        }
                        bVar = new PlayListBusinessScopeDriverImpl.a.b(c1258a4, businessException, aVar);
                    }
                } else {
                    bVar = new PlayListBusinessScopeDriverImpl.a.b(c1258a4, businessException, dVar3);
                }
            }
        }
        playListBusinessScopeDriverImpl2.f95429u.setValue(bVar);
        return Unit.INSTANCE;
    }
}
