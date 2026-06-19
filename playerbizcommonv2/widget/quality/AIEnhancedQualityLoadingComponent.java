package com.bilibili.playerbizcommonv2.widget.quality;

import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.lib.foundation.FoundationAlias;
import com.opensource.svgaplayer.SVGAImageView;
import com.opensource.svgaplayer.SVGAParser;
import com.opensource.svgaplayer.SVGAVideoEntity;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/AIEnhancedQualityLoadingComponent.class */
@StabilityInferred(parameters = 0)
public final class AIEnhancedQualityLoadingComponent implements UIComponent<UIComponent.b<SVGAImageView>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f82632c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ExposureEntry f82633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f82634b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/AIEnhancedQualityLoadingComponent$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final KProperty<Object>[] f82635a = {new MutablePropertyReference0Impl(a.class, "lastSeenDate", "<v#0>", 0)};

        public static boolean a(long j7) {
            Cj0.e eVarE = Cj0.f.e(BiliGlobalPreferenceHelper.getBLKVSharedPreference(FoundationAlias.getFapp()), "lastSeenAIEnhancedQualityLoadingDate_" + j7);
            String str = DateTimeFormatter.BASIC_ISO_DATE.withZone(ZoneId.systemDefault()).format(Instant.now());
            KProperty<Object>[] kPropertyArr = f82635a;
            if (Intrinsics.areEqual(str, (String) eVarE.getValue(null, kPropertyArr[0]))) {
                Log.i("AIEnhancedQualityLoadingComponent$Companion-checkNotTooFrequentAndMark", "[playerbizcommonv2-AIEnhancedQualityLoadingComponent$Companion-checkNotTooFrequentAndMark] Has checked in same day.");
                return false;
            }
            eVarE.setValue(null, kPropertyArr[0], str);
            return true;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/AIEnhancedQualityLoadingComponent$b.class */
    public static final class b implements SVGAParser.ParseCompletion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CancellableContinuationImpl f82636a;

        public b(CancellableContinuationImpl cancellableContinuationImpl) {
            this.f82636a = cancellableContinuationImpl;
        }

        public final void onCacheExist() {
        }

        public final void onComplete(SVGAVideoEntity sVGAVideoEntity) {
            this.f82636a.resumeWith(Result.constructor-impl(sVGAVideoEntity));
        }

        public final void onError() {
            this.f82636a.resumeWith(Result.constructor-impl((Object) null));
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.quality.AIEnhancedQualityLoadingComponent$bindToView$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/AIEnhancedQualityLoadingComponent$bindToView$1.class */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        Object result;
        final AIEnhancedQualityLoadingComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AIEnhancedQualityLoadingComponent aIEnhancedQualityLoadingComponent, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = aIEnhancedQualityLoadingComponent;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.bindToView(null, this);
        }
    }

    public AIEnhancedQualityLoadingComponent(@NotNull ExposureEntry exposureEntry, @NotNull Function0<Unit> function0) {
        this.f82633a = exposureEntry;
        this.f82634b = function0;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object bindToView(@org.jetbrains.annotations.NotNull com.bilibili.app.gemini.ui.UIComponent.b<com.opensource.svgaplayer.SVGAImageView> r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.quality.AIEnhancedQualityLoadingComponent.bindToView(com.bilibili.app.gemini.ui.UIComponent$b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        SVGAImageView sVGAImageView = new SVGAImageView(context);
        sVGAImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        sVGAImageView.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        sVGAImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        return new UIComponent.b(sVGAImageView);
    }
}
