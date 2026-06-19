package com.bilibili.playerbizcommon.features.ai;

import G3.E0;
import G3.F0;
import G3.G0;
import G3.H0;
import G3.I0;
import androidx.constraintlayout.motion.widget.p;
import com.bilibili.lib.performance.EntryPointKt;
import j4.o;
import kntr.base.config.PrimitiveSharedPreferencesProperty$asFlow$;
import kntr.base.config.SerializableSharedPreferencesProperty;
import kntr.base.config.SharedPreferences;
import kntr.base.config.e;
import kntr.base.config.h;
import kntr.base.localization.Localization;
import kntr.base.localization.Translation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayer.preload.repository.g;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/ai/PlayerMultiLangStore.class */
public final class PlayerMultiLangStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final PlayerMultiLangStore f79562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final KProperty<Object>[] f79563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Lazy f79564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Lazy f79565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final SerializableSharedPreferencesProperty<String> f79566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final h<String> f79567f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Flow<String> f79568g;

    @Nullable
    public static String h;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommon.features.ai.PlayerMultiLangStore$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/ai/PlayerMultiLangStore$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommon.features.ai.PlayerMultiLangStore$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/ai/PlayerMultiLangStore$1$1.class */
        public static final class C05161 extends SuspendLambda implements Function3<String, String, Continuation<? super String>, Object> {
            Object L$0;
            Object L$1;
            int label;

            public C05161(Continuation<? super C05161> continuation) {
                super(3, continuation);
            }

            public final Object invoke(String str, String str2, Continuation<? super String> continuation) {
                C05161 c05161 = new C05161(continuation);
                c05161.L$0 = str;
                c05161.L$1 = str2;
                return c05161.invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                String str = (String) this.L$0;
                String str2 = (String) this.L$1;
                if (!Intrinsics.areEqual(str2, str)) {
                    BLog.i("PlayerMultiLang", p.a("preferredLang changed from '", str, "' to '", str2, "', clearCache"));
                    g.a().a();
                }
                return str2;
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PlayerMultiLangStore.f79562a.getClass();
                Flow<String> flow = PlayerMultiLangStore.f79568g;
                C05161 c05161 = new C05161(null);
                this.label = 1;
                if (FlowKt.reduce(flow, c05161, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.playerbizcommon.features.ai.PlayerMultiLangStore$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/ai/PlayerMultiLangStore$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommon.features.ai.PlayerMultiLangStore$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/ai/PlayerMultiLangStore$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a<T> f79569a = (a<T>) new Object();

            public final Object emit(Object obj, Continuation continuation) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object value = Translation.INSTANCE.getAlwaysTranslateFlow().getValue();
                PlayerMultiLangStore playerMultiLangStore = PlayerMultiLangStore.f79562a;
                playerMultiLangStore.getClass();
                Localization localization = Localization.INSTANCE;
                BLog.i("PlayerMultiLang", "translation state changed:" + value + ", appLanguage " + localization.getCurrent().getLanguage());
                playerMultiLangStore.b(zBooleanValue ? localization.getCurrent().getLanguage() : null);
                return Unit.INSTANCE;
            }
        }

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDrop = FlowKt.drop(Translation.INSTANCE.getAlwaysTranslateFlow(), 1);
                FlowCollector flowCollector = a.f79569a;
                this.label = 1;
                if (flowDrop.collect(flowCollector, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.playerbizcommon.features.ai.PlayerMultiLangStore$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/ai/PlayerMultiLangStore$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommon.features.ai.PlayerMultiLangStore$3$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/ai/PlayerMultiLangStore$3$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a<T> f79570a = (a<T>) new Object();

            public final Object emit(Object obj, Continuation continuation) {
                String str = (String) obj;
                PlayerMultiLangStore.f79562a.getClass();
                if (!((Boolean) PlayerMultiLangStore.f79565d.getValue()).booleanValue()) {
                    str = null;
                }
                PlayerMultiLangStore.h = str;
                return Unit.INSTANCE;
            }
        }

        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PlayerMultiLangStore.f79562a.getClass();
                Flow<String> flow = PlayerMultiLangStore.f79568g;
                FlowCollector flowCollector = a.f79570a;
                this.label = 1;
                if (flow.collect(flowCollector, this) == coroutine_suspended) {
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

    static {
        Flow<String> flowFlowOf;
        KProperty<Object>[] kPropertyArr = {new MutablePropertyReference1Impl<>(PlayerMultiLangStore.class, "hasSyncAppTranslation", "getHasSyncAppTranslation()Z", 0), new MutablePropertyReference1Impl<>(PlayerMultiLangStore.class, "hasSyncAppTranslationOpt", "getHasSyncAppTranslationOpt()Ljava/lang/String;", 0)};
        f79563b = kPropertyArr;
        PlayerMultiLangStore playerMultiLangStore = new PlayerMultiLangStore();
        f79562a = playerMultiLangStore;
        Lazy lazy = LazyKt.lazy(new E0(8));
        f79564c = lazy;
        Lazy lazy2 = LazyKt.lazy(new F0(10));
        f79565d = lazy2;
        G0 g02 = new G0(9);
        KType kTypeTypeOf = Reflection.typeOf(Boolean.TYPE);
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        SerializableSharedPreferencesProperty serializableSharedPreferencesProperty = new SerializableSharedPreferencesProperty("ai-translation", false, SerializersKt.serializer(kTypeTypeOf), "player_multi_language_sync_app_translation", g02, (Function2) null);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
        SharedPreferences sharedPreferences = new SharedPreferences("ai-translation", false);
        Json json = e.a;
        if (!Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class)) && !Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE)) && !Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE)) && !Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE)) && !Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
            throw new IllegalStateException(com.bilibili.gripper.p.a("not support type ", orCreateKotlinClass).toString());
        }
        H0 h02 = new H0(8);
        KType kTypeNullableTypeOf = Reflection.nullableTypeOf(String.class);
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        SerializableSharedPreferencesProperty<String> serializableSharedPreferencesProperty2 = new SerializableSharedPreferencesProperty<>("ai-translation", false, SerializersKt.serializer(kTypeNullableTypeOf), "user-selected-lang", h02, (Function2) null);
        f79566e = serializableSharedPreferencesProperty2;
        h<String> hVar = new h<>("ai-translation", "user-selected-lang", Reflection.getOrCreateKotlinClass(String.class), false, new I0(8));
        f79567f = hVar;
        if (!((Boolean) lazy2.getValue()).booleanValue()) {
            flowFlowOf = FlowKt.flowOf((Object) null);
        } else if (EntryPointKt.getAwakeOptEnable()) {
            final PrimitiveSharedPreferencesProperty$asFlow$.inlined.map.1 r22 = new PrimitiveSharedPreferencesProperty$asFlow$.inlined.map.1(hVar.a.a(hVar.b, hVar.c), hVar);
            flowFlowOf = new Flow<String>(r22) { // from class: com.bilibili.playerbizcommon.features.ai.PlayerMultiLangStore$special$$inlined$map$1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PrimitiveSharedPreferencesProperty$asFlow$.inlined.map.1 f79571a;

                /* JADX INFO: renamed from: com.bilibili.playerbizcommon.features.ai.PlayerMultiLangStore$special$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/ai/PlayerMultiLangStore$special$$inlined$map$1$2.class */
                public static final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final FlowCollector f79572a;

                    /* JADX INFO: renamed from: com.bilibili.playerbizcommon.features.ai.PlayerMultiLangStore$special$$inlined$map$1$2$1, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/ai/PlayerMultiLangStore$special$$inlined$map$1$2$1.class */
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

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.f79572a = flowCollector;
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
                            boolean r0 = r0 instanceof com.bilibili.playerbizcommon.features.ai.PlayerMultiLangStore$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L29
                            r0 = r7
                            com.bilibili.playerbizcommon.features.ai.PlayerMultiLangStore$special$$inlined$map$1$2$1 r0 = (com.bilibili.playerbizcommon.features.ai.PlayerMultiLangStore$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
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
                            com.bilibili.playerbizcommon.features.ai.PlayerMultiLangStore$special$$inlined$map$1$2$1 r0 = new com.bilibili.playerbizcommon.features.ai.PlayerMultiLangStore$special$$inlined$map$1$2$1
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
                            goto L8e
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
                            java.lang.String r0 = (java.lang.String) r0
                            r6 = r0
                            r0 = r6
                            int r0 = r0.length()
                            if (r0 <= 0) goto L74
                            goto L76
                        L74:
                            r0 = 0
                            r6 = r0
                        L76:
                            r0 = r7
                            r1 = 1
                            r0.label = r1
                            r0 = r5
                            kotlinx.coroutines.flow.FlowCollector r0 = r0.f79572a
                            r1 = r6
                            r2 = r7
                            java.lang.Object r0 = r0.emit(r1, r2)
                            r1 = r9
                            if (r0 != r1) goto L8e
                            r0 = r9
                            return r0
                        L8e:
                            kotlin.Unit r0 = kotlin.Unit.INSTANCE
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.features.ai.PlayerMultiLangStore$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                {
                    this.f79571a = r22;
                }

                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object objCollect = this.f79571a.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
        } else {
            flowFlowOf = serializableSharedPreferencesProperty2.asFlow();
        }
        f79568g = flowFlowOf;
        h = ((Boolean) lazy2.getValue()).booleanValue() ? playerMultiLangStore.a() : null;
        if (((Boolean) lazy2.getValue()).booleanValue()) {
            if (EntryPointKt.getAwakeOptEnable()) {
                Object objB = sharedPreferences.b("player_multi_language_sync_app_translation", orCreateKotlinClass);
                Object obj = objB;
                if (objB == null) {
                    obj = "false";
                }
                if (!Intrinsics.areEqual((String) obj, "true")) {
                    String strA = playerMultiLangStore.a();
                    if ((strA == null || strA.length() == 0) && ((Boolean) Translation.INSTANCE.getAlwaysTranslateFlow().getValue()).booleanValue()) {
                        playerMultiLangStore.b(Localization.INSTANCE.getCurrent().getLanguage());
                    }
                    ga.b.a(Translation.INSTANCE.getAlwaysTranslateFlow().getValue(), "sync app translation state:", "PlayerMultiLang");
                    sharedPreferences.d("true", "player_multi_language_sync_app_translation", orCreateKotlinClass);
                }
            } else if (!((Boolean) serializableSharedPreferencesProperty.getValue(playerMultiLangStore, kPropertyArr[0])).booleanValue()) {
                String strA2 = playerMultiLangStore.a();
                if ((strA2 == null || strA2.length() == 0) && ((Boolean) Translation.INSTANCE.getAlwaysTranslateFlow().getValue()).booleanValue()) {
                    playerMultiLangStore.b(Localization.INSTANCE.getCurrent().getLanguage());
                }
                ga.b.a(Translation.INSTANCE.getAlwaysTranslateFlow().getValue(), "sync app translation state:", "PlayerMultiLang");
                serializableSharedPreferencesProperty.setValue(playerMultiLangStore, kPropertyArr[0], Boolean.TRUE);
            }
            BuildersKt.launch$default((CoroutineScope) lazy.getValue(), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(null), 3, (Object) null);
            BuildersKt.launch$default((CoroutineScope) lazy.getValue(), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(null), 3, (Object) null);
            BuildersKt.launch$default((CoroutineScope) lazy.getValue(), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(null), 3, (Object) null);
        }
    }

    public final String a() {
        String str;
        if (EntryPointKt.getAwakeOptEnable()) {
            Object value = f79567f.getValue(this, new PropertyReference0Impl(this) { // from class: com.bilibili.playerbizcommon.features.ai.PlayerMultiLangStore$selectedLangGet$1
                public Object get() {
                    return PlayerMultiLangStore.f79567f;
                }
            });
            if (((String) value).length() <= 0) {
                value = null;
            }
            str = (String) value;
        } else {
            str = (String) f79566e.getValue(this, new PropertyReference0Impl(this) { // from class: com.bilibili.playerbizcommon.features.ai.PlayerMultiLangStore$selectedLangGet$3
                public Object get() {
                    return PlayerMultiLangStore.f79566e;
                }
            });
        }
        return str;
    }

    public final void b(String str) {
        if (!EntryPointKt.getAwakeOptEnable()) {
            f79566e.setValue(this, new PropertyReference0Impl(this) { // from class: com.bilibili.playerbizcommon.features.ai.PlayerMultiLangStore$selectedLangSet$2
                public Object get() {
                    return PlayerMultiLangStore.f79566e;
                }
            }, str);
            return;
        }
        PropertyReference0Impl propertyReference0Impl = new PropertyReference0Impl(this) { // from class: com.bilibili.playerbizcommon.features.ai.PlayerMultiLangStore$selectedLangSet$1
            public Object get() {
                return PlayerMultiLangStore.f79567f;
            }
        };
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        f79567f.setValue(this, propertyReference0Impl, str2);
    }

    public final void c(@Nullable String str) {
        if (Intrinsics.areEqual(a(), str)) {
            return;
        }
        o.a("updateUserSelectedLang, old: ", a(), ", new: ", str, "PlayerMultiLang");
        b(str);
        if (!((Boolean) f79565d.getValue()).booleanValue()) {
            str = null;
        }
        h = str;
    }
}
