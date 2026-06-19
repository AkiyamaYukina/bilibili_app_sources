package com.bilibili.ogv.bdesign.color;

import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.ui.graphics.Color;
import com.bilibili.compose.theme.ThemeDayNight;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/bdesign/color/ImageDominantColorKt$imageDominantColor$dominantColor$2$1.class */
public final class ImageDominantColorKt$imageDominantColor$dominantColor$2$1 extends SuspendLambda implements Function2<ProduceStateScope<Color>, Continuation<? super Unit>, Object> {
    final BiImageThemeColorMode $colorMode;
    final ThemeDayNight $uiMode;
    final String $url;
    private Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageDominantColorKt$imageDominantColor$dominantColor$2$1(String str, BiImageThemeColorMode biImageThemeColorMode, ThemeDayNight themeDayNight, Continuation<? super ImageDominantColorKt$imageDominantColor$dominantColor$2$1> continuation) {
        super(2, continuation);
        this.$url = str;
        this.$colorMode = biImageThemeColorMode;
        this.$uiMode = themeDayNight;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ImageDominantColorKt$imageDominantColor$dominantColor$2$1 imageDominantColorKt$imageDominantColor$dominantColor$2$1 = new ImageDominantColorKt$imageDominantColor$dominantColor$2$1(this.$url, this.$colorMode, this.$uiMode, continuation);
        imageDominantColorKt$imageDominantColor$dominantColor$2$1.L$0 = obj;
        return imageDominantColorKt$imageDominantColor$dominantColor$2$1;
    }

    public final Object invoke(ProduceStateScope<Color> produceStateScope, Continuation<? super Unit> continuation) {
        return create(produceStateScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            String str = this.$url;
            BiImageThemeColorMode biImageThemeColorMode = this.$colorMode;
            boolean z6 = this.$uiMode == ThemeDayNight.Night;
            this.L$0 = produceStateScope;
            this.label = 1;
            Object objA = ImageDominantColorKt.a(str, biImageThemeColorMode, z6, this);
            obj = objA;
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        long jM2639unboximpl = ((Color) obj).m2639unboximpl();
        if (jM2639unboximpl != 16) {
            produceStateScope.setValue(Color.m2619boximpl(jM2639unboximpl));
        }
        return Unit.INSTANCE;
    }
}
