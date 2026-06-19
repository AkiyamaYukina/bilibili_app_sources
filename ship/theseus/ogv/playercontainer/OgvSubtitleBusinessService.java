package com.bilibili.ship.theseus.ogv.playercontainer;

import android.content.SharedPreferences;
import androidx.compose.foundation.text.selection.C3751q;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.playerbizcommonv2.widget.subtitle.K0;
import com.bilibili.playerbizcommonv2.widget.subtitle.L0;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.ogv.w;
import com.bilibili.ship.theseus.united.player.ai.SubtitleBusinessService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import tv.danmaku.biliplayerv2.service.setting.Scope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playercontainer/OgvSubtitleBusinessService.class */
@StabilityInferred(parameters = 0)
public final class OgvSubtitleBusinessService implements L0, K0 {
    public static final KProperty<Object>[] h = {new MutablePropertyReference1Impl(OgvSubtitleBusinessService.class, "subtitleSeasonLru", "getSubtitleSeasonLru()Ljava/lang/String;", 0), new MutablePropertyReference1Impl(OgvSubtitleBusinessService.class, "aiSubtitleBubbleLastDisplayTime", "getAiSubtitleBubbleLastDisplayTime()J", 0), new MutablePropertyReference1Impl(OgvSubtitleBusinessService.class, "aiSubtitleBubbleDisplayCount", "getAiSubtitleBubbleDisplayCount()J", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f94306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Er0.a f94307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SubtitleBusinessService f94308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f94309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.playerbizcommonv2.service.ai.a f94310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Cj0.d f94311f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Cj0.d f94312g;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.playercontainer.OgvSubtitleBusinessService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playercontainer/OgvSubtitleBusinessService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvSubtitleBusinessService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.playercontainer.OgvSubtitleBusinessService$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playercontainer/OgvSubtitleBusinessService$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OgvSubtitleBusinessService f94313a;

            public a(OgvSubtitleBusinessService ogvSubtitleBusinessService) {
                this.f94313a = ogvSubtitleBusinessService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                K0.a aVar = K0.a.f83532a;
                OgvSubtitleBusinessService ogvSubtitleBusinessService = this.f94313a;
                if (zBooleanValue) {
                    ogvSubtitleBusinessService.f94307b.put(aVar, ogvSubtitleBusinessService);
                } else {
                    ogvSubtitleBusinessService.f94307b.put(aVar, ogvSubtitleBusinessService.f94308c);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(OgvSubtitleBusinessService ogvSubtitleBusinessService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = ogvSubtitleBusinessService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow mutableStateFlowU = this.this$0.f94310e.U();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (mutableStateFlowU.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.playercontainer.OgvSubtitleBusinessService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playercontainer/OgvSubtitleBusinessService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvSubtitleBusinessService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(OgvSubtitleBusinessService ogvSubtitleBusinessService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = ogvSubtitleBusinessService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
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
                this.this$0.f94307b.remove(L0.a.f83540a);
                this.this$0.f94307b.remove(K0.a.f83532a);
                throw th;
            }
        }
    }

    @Inject
    public OgvSubtitleBusinessService(@NotNull CoroutineScope coroutineScope, @NotNull Er0.a aVar, @NotNull SubtitleBusinessService subtitleBusinessService, @NotNull IPlayerSettingService iPlayerSettingService, @NotNull com.bilibili.playerbizcommonv2.service.ai.a aVar2, @NotNull OgvSeason ogvSeason) {
        this.f94306a = coroutineScope;
        this.f94307b = aVar;
        this.f94308c = subtitleBusinessService;
        this.f94309d = iPlayerSettingService;
        this.f94310e = aVar2;
        Cj0.e eVarE = Cj0.f.e(w.f94906a, "key_ogv_subtitle_season_lru");
        String strA = C3751q.a(ogvSeason.f94449a, "key_ogv_subtitle_lan_main_");
        StringBuilder sb = new StringBuilder("key_ogv_subtitle_lan_vice_");
        long j7 = ogvSeason.f94449a;
        sb.append(j7);
        String string = sb.toString();
        HashMap map = new HashMap();
        map.put(Scope.Persistent, CollectionsKt.listOf(new String[]{strA, string}));
        iPlayerSettingService.putKeysScope(map);
        aVar.put(L0.a.f83540a, this);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        KProperty<Object>[] kPropertyArr = h;
        List listR = StringsKt.R((String) eVarE.getValue(this, kPropertyArr[0]), new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listR) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Long longOrNull = StringsKt.toLongOrNull((String) it.next());
            if (longOrNull != null) {
                arrayList2.add(longOrNull);
            }
        }
        List mutableList = CollectionsKt.toMutableList(arrayList2);
        mutableList.remove(Long.valueOf(j7));
        mutableList.add(0, Long.valueOf(j7));
        if (mutableList.size() > 20) {
            Iterator it2 = mutableList.subList(20, mutableList.size()).iterator();
            while (it2.hasNext()) {
                long jLongValue = ((Number) it2.next()).longValue();
                String strA2 = C3751q.a(jLongValue, "key_ogv_subtitle_lan_main_");
                IPlayerSettingService iPlayerSettingService2 = this.f94309d;
                iPlayerSettingService2.putString(strA2, "");
                iPlayerSettingService2.putString("key_ogv_subtitle_lan_vice_" + jLongValue, "");
            }
            mutableList.subList(20, mutableList.size()).clear();
        }
        eVarE.setValue(this, kPropertyArr[0], CollectionsKt.p(mutableList, ",", (CharSequence) null, (CharSequence) null, (Function1) null, 62));
        SharedPreferences sharedPreferences = w.f94906a;
        this.f94311f = Cj0.f.d(sharedPreferences, "aiSubtitleBubbleLastDisplayTime");
        this.f94312g = Cj0.f.d(sharedPreferences, "aiSubtitleBubbleDisplayCount");
    }

    @Override // com.bilibili.playerbizcommonv2.widget.subtitle.L0
    public final boolean a() {
        return true;
    }

    @Override // com.bilibili.playerbizcommonv2.widget.subtitle.K0
    public final void b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        KProperty<Object>[] kPropertyArr = h;
        this.f94311f.setValue(this, kPropertyArr[1], Long.valueOf(jCurrentTimeMillis));
        KProperty<Object> kProperty = kPropertyArr[2];
        Cj0.d dVar = this.f94312g;
        dVar.setValue(this, kPropertyArr[2], Long.valueOf(((Number) dVar.getValue(this, kProperty)).longValue() + 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000f  */
    @Override // com.bilibili.playerbizcommonv2.widget.subtitle.L0
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String c(@org.jetbrains.annotations.Nullable com.bilibili.lib.media.resource.Languages r3) {
        /*
            r2 = this;
            r0 = r3
            if (r0 == 0) goto Lf
            r0 = r3
            java.lang.String r0 = r0.d()
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L12
        Lf:
            java.lang.String r0 = ""
            r3 = r0
        L12:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.playercontainer.OgvSubtitleBusinessService.c(com.bilibili.lib.media.resource.Languages):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x005e  */
    @Override // com.bilibili.playerbizcommonv2.widget.subtitle.K0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d() {
        /*
            r5 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r9 = r0
            kotlin.reflect.KProperty<java.lang.Object>[] r0 = com.bilibili.ship.theseus.ogv.playercontainer.OgvSubtitleBusinessService.h
            r11 = r0
            r0 = 1
            r6 = r0
            r0 = r11
            r1 = 1
            r0 = r0[r1]
            r12 = r0
            r0 = r5
            Cj0.d r0 = r0.f94311f
            r1 = r5
            r2 = r12
            java.lang.Object r0 = r0.getValue(r1, r2)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r7 = r0
            kotlin.time.Duration$Companion r0 = kotlin.time.Duration.Companion
            r12 = r0
            r0 = r9
            r1 = r7
            long r0 = r0 - r1
            r1 = 7
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.DAYS
            long r1 = kotlin.time.DurationKt.toDuration(r1, r2)
            long r1 = kotlin.time.Duration.getInWholeMilliseconds-impl(r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L3e
            goto L5e
        L3e:
            r0 = r11
            r1 = 2
            r0 = r0[r1]
            r11 = r0
            r0 = r5
            Cj0.d r0 = r0.f94312g
            r1 = r5
            r2 = r11
            java.lang.Object r0 = r0.getValue(r1, r2)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r1 = 3
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L5e
            goto L60
        L5e:
            r0 = 0
            r6 = r0
        L60:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.playercontainer.OgvSubtitleBusinessService.d():boolean");
    }
}
