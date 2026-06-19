package com.bilibili.ship.theseus.united.page.translate;

import androidx.compose.runtime.MutableState;
import com.bilibili.lib.media.resource.PlayConfig;
import com.bilibili.playerbizcommonv2.widget.setting.L;
import com.bilibili.ship.theseus.united.page.view.t;
import com.bilibili.ship.theseus.united.player.oldway.FullScreenThreePointEventRepository;
import j$.time.Clock;
import kntr.app.game.steam.SteamDetailPageKt;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.CoroutineScope;
import q91.i;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/translate/DetailPageTranslationService$2.class */
final class DetailPageTranslationService$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final b this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.translate.DetailPageTranslationService$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/translate/DetailPageTranslationService$2$1.class */
    public static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<Function0<? extends Unit>, L> {
        public AnonymousClass1(Object obj) {
            super(1, obj, b.class, "generatePlayerSettingTop", "generatePlayerSettingTop(Lkotlin/jvm/functions/Function0;)Lcom/bilibili/playerbizcommonv2/widget/setting/PlayerSettingTop;", 0);
        }

        public final L invoke(final Function0<Unit> function0) {
            L l7;
            PlayConfig playConfig;
            PlayConfig.PlayMenuConfig playMenuConfig;
            PlayConfig playConfig2;
            PlayConfig.PlayMenuConfig playMenuConfig2;
            final b bVar = (b) ((CallableReference) this).receiver;
            t tVar = bVar.f103467f;
            if (tVar.f104127c == null) {
                l7 = null;
            } else {
                Oi1.d cloudConfig = bVar.f103468g.getCloudConfig();
                final int i7 = 0;
                Function0 function02 = new Function0(i7, bVar, function0) { // from class: com.bilibili.ship.theseus.united.page.translate.a

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f103459a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f103460b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final Object f103461c;

                    {
                        this.f103459a = i7;
                        this.f103460b = bVar;
                        this.f103461c = function0;
                    }

                    public final Object invoke() {
                        switch (this.f103459a) {
                            case 0:
                                b bVar2 = (b) this.f103460b;
                                bVar2.a();
                                ((Function0) this.f103461c).invoke();
                                boolean z6 = true;
                                if (bVar2.f103467f.f104127c.f104032a != 1) {
                                    z6 = false;
                                }
                                bVar2.h.report(new NeuronsEvents.b("player.player.full-option-more.click.player", MapsKt.mapOf(TuplesKt.to("option", z6 ? "original" : "translate"))));
                                break;
                            default:
                                i.Companion.getClass();
                                long jE = new i(Clock.systemUTC().instant()).e();
                                long[] jArr = (long[]) this.f103460b;
                                if (jE - jArr[0] >= 300) {
                                    jArr[0] = jE;
                                    MutableState mutableState = (MutableState) this.f103461c;
                                    if (SteamDetailPageKt.g(mutableState)) {
                                        mutableState.setValue(Boolean.FALSE);
                                    }
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                int i8 = tVar.f104127c.f104032a;
                if (i8 == 1) {
                    l7 = new L(2131846660, 2131244214, cloudConfig.g(), (!cloudConfig.g() || (playConfig = cloudConfig.b) == null || (playMenuConfig = playConfig.L) == null || playMenuConfig.b) ? false : true, function02);
                } else if (i8 != 2) {
                    l7 = null;
                } else {
                    l7 = new L(2131846659, 2131244212, cloudConfig.g(), (!cloudConfig.g() || (playConfig2 = cloudConfig.b) == null || (playMenuConfig2 = playConfig2.L) == null || playMenuConfig2.b) ? false : true, function02);
                }
            }
            return l7;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailPageTranslationService$2(b bVar, Continuation<? super DetailPageTranslationService$2> continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DetailPageTranslationService$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            FullScreenThreePointEventRepository fullScreenThreePointEventRepository = this.this$0.f103463b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 1;
            if (fullScreenThreePointEventRepository.a(anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
