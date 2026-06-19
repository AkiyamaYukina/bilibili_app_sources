package com.bilibili.ship.theseus.united.page;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.lifecycle.Lifecycle;
import com.bilibili.ad.adview.story.card.card138.i;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import kntr.base.imageloader.BiliImageKt;
import kntr.base.imageloader.ImageRequest;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/AutoPlayService$showFirstFrame$1$1$3.class */
public final class AutoPlayService$showFirstFrame$1$1$3 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final String $firstFrameImage;
    int label;
    final AutoPlayService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.AutoPlayService$showFirstFrame$1$1$3$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/AutoPlayService$showFirstFrame$1$1$3$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
        boolean Z$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Boolean>) obj2);
        }

        public final Object invoke(boolean z6, Continuation<? super Boolean> continuation) {
            return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(this.Z$0);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/AutoPlayService$showFirstFrame$1$1$3$a.class */
    public static final class a extends com.bilibili.ship.theseus.united.utils.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f98796b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ThemeStrategy themeStrategy, String str) {
            super(themeStrategy);
            this.f98796b = str;
        }

        @Override // com.bilibili.ship.theseus.united.utils.a
        @Composable
        public final void a(Modifier.Companion companion, Composer composer) {
            composer.startReplaceGroup(1849522600);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1849522600, 6, -1, "com.bilibili.ship.theseus.united.utils.BiliComposeUIComponent.<no name provided>.Content (BiliComposeUIComponent.kt:18)");
            }
            composer.startReplaceGroup(-1779842348);
            BiliImageKt.BiliImage(i.a(ContentScale.Companion, new ImageRequest(this.f98796b)), SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), (String) null, (Lifecycle) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function2) null, (Function4) null, composer, 48, 1020);
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoPlayService$showFirstFrame$1$1$3(AutoPlayService autoPlayService, String str, Continuation<? super AutoPlayService$showFirstFrame$1$1$3> continuation) {
        super(1, continuation);
        this.this$0 = autoPlayService;
        this.$firstFrameImage = str;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new AutoPlayService$showFirstFrame$1$1$3(this.this$0, this.$firstFrameImage, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableStateFlow<Boolean> mutableStateFlow = this.this$0.f98787a.f91107a.f79284a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 1;
            if (FlowKt.first(mutableStateFlow, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        BLog.i("AutoPlayService$showFirstFrame$1$1$3-invokeSuspend", "[theseus-united-AutoPlayService$showFirstFrame$1$1$3-invokeSuspend] attach overlay");
        TheseusFloatLayerService theseusFloatLayerService = this.this$0.f98792f;
        a aVar = new a(ThemeStrategy.FollowApp, this.$firstFrameImage);
        this.label = 2;
        if (theseusFloatLayerService.i(aVar, null, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
