package com.bilibili.ship.theseus.united.page.autofloat;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.playerbizcommon.utils.PlayerSettingHelper;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.biz.IWatchPointsLoadListener;
import tv.danmaku.biliplayerv2.service.interact.biz.model.ChronosThumbnailInfo;
import uv0.C8768a;
import uv0.C8769b;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/autofloat/AutoFloatLayerService.class */
@StabilityInferred(parameters = 0)
public final class AutoFloatLayerService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f98967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final a f98968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.autofloat.a f98969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C8769b f98970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final IInteractLayerService f98971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f98972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public As.b f98973g;

    @NotNull
    public final b h = new b(this);

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.autofloat.AutoFloatLayerService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/autofloat/AutoFloatLayerService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final AutoFloatLayerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AutoFloatLayerService autoFloatLayerService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = autoFloatLayerService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    AutoFloatLayerService autoFloatLayerService = this.this$0;
                    autoFloatLayerService.f98971e.addWatchPointsLoadListener(autoFloatLayerService.h);
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th) {
                AutoFloatLayerService autoFloatLayerService2 = this.this$0;
                autoFloatLayerService2.f98971e.removeWatchPointsLoadListener(autoFloatLayerService2.h);
                throw th;
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/autofloat/AutoFloatLayerService$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f98974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f98975b;

        public a(int i7, @Nullable String str) {
            this.f98974a = i7;
            this.f98975b = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f98974a == aVar.f98974a && Intrinsics.areEqual(this.f98975b, aVar.f98975b);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f98974a);
            String str = this.f98975b;
            return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Initial(type=");
            sb.append(this.f98974a);
            sb.append(", extra=");
            return C8770a.a(sb, this.f98975b, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/autofloat/AutoFloatLayerService$b.class */
    public static final class b implements IWatchPointsLoadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AutoFloatLayerService f98976a;

        public b(AutoFloatLayerService autoFloatLayerService) {
            this.f98976a = autoFloatLayerService;
        }

        public final void onLoaded(List<ChronosThumbnailInfo.WatchPoint> list) {
            List<ChronosThumbnailInfo.WatchPoint> list2;
            AutoFloatLayerService autoFloatLayerService = this.f98976a;
            if (autoFloatLayerService.f98972f == 1) {
                if (!PlayerSettingHelper.INSTANCE.shouldAutoFullscreenWhenEnterDetailPage() && (list2 = list) != null && !list2.isEmpty()) {
                    autoFloatLayerService.f98969c.f98984i.tryEmit(list);
                }
                autoFloatLayerService.f98972f = -1;
            }
        }
    }

    @Inject
    public AutoFloatLayerService(@NotNull CoroutineScope coroutineScope, @Nullable a aVar, @NotNull com.bilibili.ship.theseus.united.page.autofloat.a aVar2, @NotNull C8769b c8769b, @NotNull IInteractLayerService iInteractLayerService) {
        this.f98967a = coroutineScope;
        this.f98968b = aVar;
        this.f98969c = aVar2;
        this.f98970d = c8769b;
        this.f98971e = iInteractLayerService;
        int i7 = -1;
        this.f98972f = -1;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        this.f98972f = aVar != null ? aVar.f98974a : i7;
        a(1000L);
    }

    public final void a(long j7) {
        String str;
        String asString;
        if (j7 > 0) {
            if (this.f98973g == null) {
                this.f98973g = new As.b(this, 3);
            }
            As.b bVar = this.f98973g;
            if (bVar != null) {
                HandlerThreads.postDelayed(0, bVar, 1000L);
                return;
            }
            return;
        }
        int i7 = this.f98972f;
        if (i7 == -1) {
            BLog.i("AutoFloatLayerService", "handleAutoFloatLayerShowing, type is none");
            return;
        }
        bilibili.live.app.service.resolver.c.a(i7, "handleAutoFloatLayerShowing, type is ", "AutoFloatLayerService");
        if (PlayerSettingHelper.INSTANCE.shouldAutoFullscreenWhenEnterDetailPage()) {
            BLog.i("AutoFloatLayerService", "AutoFullscreenWhenEnterDetailPage, clear type");
            this.f98972f = -1;
            return;
        }
        int i8 = this.f98972f;
        com.bilibili.ship.theseus.united.page.autofloat.a aVar = this.f98969c;
        if (i8 != 1) {
            String str2 = null;
            a aVar2 = this.f98968b;
            try {
                if (i8 != 2) {
                    if (i8 == 3) {
                        BLog.i("AutoFloatLayerService", "showSeasonLayer");
                        aVar.f98977a.tryEmit(Unit.INSTANCE);
                    } else if (i8 == 5) {
                        BLog.i("AutoFloatLayerService", "showDownloadLayer");
                        aVar.f98983g.tryEmit(Unit.INSTANCE);
                    } else if (i8 == 6) {
                        BLog.i("AutoFloatLayerService", "showShareLayer");
                        aVar.f98981e.tryEmit(Unit.INSTANCE);
                    } else if (i8 == 8) {
                        if (aVar2 != null) {
                            str2 = aVar2.f98975b;
                        }
                        if (str2 != null && str2.length() != 0) {
                            JsonElement jsonElement = ((JsonObject) JsonUtilKt.parseJson(str2, new com.bilibili.ship.theseus.united.page.autofloat.b().getType())).get("url");
                            if (jsonElement != null && (asString = jsonElement.getAsString()) != null) {
                                aVar.f98979c.tryEmit(asString);
                            }
                        }
                    }
                } else if (aVar2 != null && (str = aVar2.f98975b) != null) {
                    JsonObject jsonObject = (JsonObject) JsonUtilKt.parseJson(str, new c().getType());
                    JsonElement jsonElement2 = jsonObject.get("cvid");
                    C8769b c8769b = this.f98970d;
                    if (jsonElement2 != null) {
                        long asLong = jsonElement2.getAsLong();
                        if (asLong > 0) {
                            c8769b.f127998c.tryEmit(new C8768a("", asLong));
                        } else {
                            c8769b.f127996a.tryEmit((Object) null);
                        }
                    } else if (jsonObject.get("edit").getAsBoolean()) {
                        c8769b.f127996a.tryEmit((Object) null);
                    } else {
                        c8769b.f127998c.tryEmit(new C8768a(jsonObject.get("url").getAsString()));
                    }
                }
            } catch (Exception e7) {
            }
        } else {
            List watchPoints = this.f98971e.getWatchPoints();
            if (watchPoints != null && !watchPoints.isEmpty()) {
                this.f98972f = -1;
                aVar.f98984i.tryEmit(watchPoints);
            }
        }
        if (this.f98972f != 1) {
            this.f98972f = -1;
        }
    }
}
