package com.bilibili.ship.theseus.united.page.danmaku;

import android.content.SharedPreferences;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/ChronosBusinessService$eyeProtectionFlow$1.class */
final class ChronosBusinessService$eyeProtectionFlow$1 extends SuspendLambda implements Function2<ProducerScope<? super Boolean>, Continuation<? super Unit>, Object> {
    private Object L$0;
    int label;
    final ChronosBusinessService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChronosBusinessService$eyeProtectionFlow$1(ChronosBusinessService chronosBusinessService, Continuation<? super ChronosBusinessService$eyeProtectionFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = chronosBusinessService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(SharedPreferences sharedPreferences, ProducerScope producerScope, SharedPreferences sharedPreferences2, String str) {
        if (str != null && str.hashCode() == 715083406 && str.equals("pref_player_eyes_protection_mode_key")) {
            ChannelsKt.trySendBlocking(producerScope, Boolean.valueOf(sharedPreferences.getBoolean("pref_player_eyes_protection_mode_key", false)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(SharedPreferences sharedPreferences, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        sharedPreferences.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChronosBusinessService$eyeProtectionFlow$1 chronosBusinessService$eyeProtectionFlow$1 = new ChronosBusinessService$eyeProtectionFlow$1(this.this$0, continuation);
        chronosBusinessService$eyeProtectionFlow$1.L$0 = obj;
        return chronosBusinessService$eyeProtectionFlow$1;
    }

    public final Object invoke(ProducerScope<? super Boolean> producerScope, Continuation<? super Unit> continuation) {
        return create(producerScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [android.content.SharedPreferences$OnSharedPreferenceChangeListener, com.bilibili.ship.theseus.united.page.danmaku.d] */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            final SharedPreferences bLKVSharedPreference = BiliGlobalPreferenceHelper.getBLKVSharedPreference(this.this$0.f99331b);
            final ?? r02 = new SharedPreferences.OnSharedPreferenceChangeListener(bLKVSharedPreference, producerScope) { // from class: com.bilibili.ship.theseus.united.page.danmaku.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final SharedPreferences f99525a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final ProducerScope f99526b;

                {
                    this.f99525a = bLKVSharedPreference;
                    this.f99526b = producerScope;
                }

                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    ChronosBusinessService$eyeProtectionFlow$1.invokeSuspend$lambda$0(this.f99525a, this.f99526b, sharedPreferences, str);
                }
            };
            bLKVSharedPreference.registerOnSharedPreferenceChangeListener(r02);
            Function0 function0 = new Function0(bLKVSharedPreference, r02) { // from class: com.bilibili.ship.theseus.united.page.danmaku.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final SharedPreferences f99527a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final SharedPreferencesOnSharedPreferenceChangeListenerC6285d f99528b;

                {
                    this.f99527a = bLKVSharedPreference;
                    this.f99528b = r02;
                }

                public final Object invoke() {
                    return ChronosBusinessService$eyeProtectionFlow$1.invokeSuspend$lambda$1(this.f99527a, this.f99528b);
                }
            };
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, function0, this) == coroutine_suspended) {
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
