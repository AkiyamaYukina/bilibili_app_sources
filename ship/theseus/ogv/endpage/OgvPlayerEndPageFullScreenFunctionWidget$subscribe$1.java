package com.bilibili.ship.theseus.ogv.endpage;

import android.R;
import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.bilibili.community.follow.FollowSeasonRepository$flowOfFollowSeason$;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import tl0.C8669a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/endpage/OgvPlayerEndPageFullScreenFunctionWidget$subscribe$1.class */
final class OgvPlayerEndPageFullScreenFunctionWidget$subscribe$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final OgvPlayerEndPageFullScreenFunctionWidget this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/endpage/OgvPlayerEndPageFullScreenFunctionWidget$subscribe$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OgvPlayerEndPageFullScreenFunctionWidget f91996a;

        public a(OgvPlayerEndPageFullScreenFunctionWidget ogvPlayerEndPageFullScreenFunctionWidget) {
            this.f91996a = ogvPlayerEndPageFullScreenFunctionWidget;
        }

        public final Object emit(Object obj, Continuation continuation) {
            boolean z6 = ((com.bilibili.community.follow.b) obj).a;
            OgvPlayerEndPageFullScreenFunctionWidget ogvPlayerEndPageFullScreenFunctionWidget = this.f91996a;
            Context context = ogvPlayerEndPageFullScreenFunctionWidget.f91952d;
            OgvSeason ogvSeason = ogvPlayerEndPageFullScreenFunctionWidget.f91956i;
            String strA = C8669a.a(context, ogvSeason.f94450b, z6, ogvSeason.f94455g.e());
            TextView textView = ogvPlayerEndPageFullScreenFunctionWidget.f91933D;
            if (textView != null) {
                textView.setText(strA);
            }
            TextView textView2 = ogvPlayerEndPageFullScreenFunctionWidget.f91933D;
            if (textView2 != null) {
                textView2.setTextColor(ContextCompat.getColor(ogvPlayerEndPageFullScreenFunctionWidget.f91952d, R.color.white));
            }
            LinearLayout linearLayout = ogvPlayerEndPageFullScreenFunctionWidget.f91934E;
            if (linearLayout != null) {
                linearLayout.setBackgroundResource(z6 ? 2131240743 : 2131240744);
            }
            ImageView imageView = ogvPlayerEndPageFullScreenFunctionWidget.f91935F;
            if (imageView != null) {
                imageView.setVisibility(z6 ? 8 : 0);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvPlayerEndPageFullScreenFunctionWidget$subscribe$1(OgvPlayerEndPageFullScreenFunctionWidget ogvPlayerEndPageFullScreenFunctionWidget, Continuation<? super OgvPlayerEndPageFullScreenFunctionWidget$subscribe$1> continuation) {
        super(2, continuation);
        this.this$0 = ogvPlayerEndPageFullScreenFunctionWidget;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvPlayerEndPageFullScreenFunctionWidget$subscribe$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            long j7 = this.this$0.f91956i.f94449a;
            com.bilibili.community.follow.c cVar = com.bilibili.community.follow.c.a;
            MutableStateFlow mutableStateFlowB = com.bilibili.community.follow.c.c.b(com.bilibili.community.follow.c.a(j7));
            a aVar = new a(this.this$0);
            this.label = 1;
            Object objCollect = mutableStateFlowB.collect(new FollowSeasonRepository$flowOfFollowSeason$.inlined.map.1.2(aVar), this);
            if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objCollect = Unit.INSTANCE;
            }
            if (objCollect == coroutine_suspended) {
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
