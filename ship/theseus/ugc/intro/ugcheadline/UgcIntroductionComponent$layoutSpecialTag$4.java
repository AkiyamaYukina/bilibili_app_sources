package com.bilibili.ship.theseus.ugc.intro.ugcheadline;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.bilibili.lib.theme.R$color;
import com.bilibili.ship.theseus.united.page.color.ActivityColorRepository;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcIntroductionComponent$layoutSpecialTag$4.class */
final class UgcIntroductionComponent$layoutSpecialTag$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final GradientDrawable $backgroundDrawable;
    final List<com.bilibili.ship.theseus.united.page.intro.module.tags.a> $cells;
    final ActivityColorRepository $colorRepo;
    final Context $context;
    final SpannableStringBuilder $descSb;
    final int $iconPadding;
    final int $iconTint;
    final boolean $isNight;
    final int $itemWidth;
    final GradientDrawable $leftIconHolderDrawable;
    final int $leftIconWidth;
    final GradientDrawable $rightIconHolderDrawable;
    final int $rightIconWidth;
    final int $rightMargin;
    final int $rightPadding;
    final int $tagHeight;
    final TextView $textView;
    final int $topMargin;
    private Object L$0;
    int label;
    final UgcIntroductionComponent this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcIntroductionComponent$layoutSpecialTag$4$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UgcIntroductionComponent f97295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.bilibili.ship.theseus.united.page.intro.module.tags.a f97296b;

        public a(UgcIntroductionComponent ugcIntroductionComponent, com.bilibili.ship.theseus.united.page.intro.module.tags.a aVar) {
            this.f97295a = ugcIntroductionComponent;
            this.f97296b = aVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcIntroductionComponent$layoutSpecialTag$4(List<com.bilibili.ship.theseus.united.page.intro.module.tags.a> list, boolean z6, int i7, int i8, int i9, int i10, int i11, int i12, GradientDrawable gradientDrawable, GradientDrawable gradientDrawable2, GradientDrawable gradientDrawable3, ActivityColorRepository activityColorRepository, Context context, SpannableStringBuilder spannableStringBuilder, UgcIntroductionComponent ugcIntroductionComponent, TextView textView, int i13, int i14, int i15, Continuation<? super UgcIntroductionComponent$layoutSpecialTag$4> continuation) {
        super(2, continuation);
        this.$cells = list;
        this.$isNight = z6;
        this.$tagHeight = i7;
        this.$rightPadding = i8;
        this.$iconPadding = i9;
        this.$topMargin = i10;
        this.$rightMargin = i11;
        this.$itemWidth = i12;
        this.$backgroundDrawable = gradientDrawable;
        this.$leftIconHolderDrawable = gradientDrawable2;
        this.$rightIconHolderDrawable = gradientDrawable3;
        this.$colorRepo = activityColorRepository;
        this.$context = context;
        this.$descSb = spannableStringBuilder;
        this.this$0 = ugcIntroductionComponent;
        this.$textView = textView;
        this.$iconTint = i13;
        this.$leftIconWidth = i14;
        this.$rightIconWidth = i15;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UgcIntroductionComponent$layoutSpecialTag$4 ugcIntroductionComponent$layoutSpecialTag$4 = new UgcIntroductionComponent$layoutSpecialTag$4(this.$cells, this.$isNight, this.$tagHeight, this.$rightPadding, this.$iconPadding, this.$topMargin, this.$rightMargin, this.$itemWidth, this.$backgroundDrawable, this.$leftIconHolderDrawable, this.$rightIconHolderDrawable, this.$colorRepo, this.$context, this.$descSb, this.this$0, this.$textView, this.$iconTint, this.$leftIconWidth, this.$rightIconWidth, continuation);
        ugcIntroductionComponent$layoutSpecialTag$4.L$0 = obj;
        return ugcIntroductionComponent$layoutSpecialTag$4;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        List<com.bilibili.ship.theseus.united.page.intro.module.tags.a> list = this.$cells;
        boolean z6 = this.$isNight;
        int i7 = this.$tagHeight;
        int i8 = this.$rightPadding;
        int i9 = this.$iconPadding;
        int i10 = this.$topMargin;
        int i11 = this.$rightMargin;
        int i12 = this.$itemWidth;
        GradientDrawable gradientDrawable = this.$backgroundDrawable;
        GradientDrawable gradientDrawable2 = this.$leftIconHolderDrawable;
        GradientDrawable gradientDrawable3 = this.$rightIconHolderDrawable;
        ActivityColorRepository activityColorRepository = this.$colorRepo;
        Context context = this.$context;
        SpannableStringBuilder spannableStringBuilder = this.$descSb;
        UgcIntroductionComponent ugcIntroductionComponent = this.this$0;
        TextView textView = this.$textView;
        int i13 = this.$iconTint;
        int i14 = this.$leftIconWidth;
        int i15 = this.$rightIconWidth;
        int i16 = 0;
        for (Object obj2 : list) {
            if (i16 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            com.bilibili.ship.theseus.united.page.intro.module.tags.a aVar = (com.bilibili.ship.theseus.united.page.intro.module.tags.a) obj2;
            String str = z6 ? aVar.f101931b : aVar.f101930a;
            String str2 = z6 ? aVar.f101942n : aVar.f101941m;
            yh1.b bVar = new yh1.b();
            bVar.a = i7;
            bVar.c = i8;
            bVar.d = i8;
            bVar.e = i9;
            bVar.f = 0;
            bVar.h = i10;
            bVar.g = i11;
            bVar.i = i10;
            bVar.b = i12 - i11;
            bVar.m = gradientDrawable;
            if (!StringsKt.isBlank(str)) {
                bVar.n = gradientDrawable2;
            }
            if (!StringsKt.isBlank(str2)) {
                bVar.o = gradientDrawable3;
            }
            String str3 = aVar.f101932c;
            String str4 = str3;
            if (str3 == null) {
                str4 = "";
            }
            bVar.k = str4;
            bVar.l = null;
            Integer numH = activityColorRepository.h();
            bVar.j = numH != null ? numH.intValue() : ContextCompat.getColor(context, R$color.Text2);
            bVar.p = new a(ugcIntroductionComponent, aVar);
            String str5 = aVar.f101932c;
            String str6 = str5;
            if (StringsKt.isBlank(str5)) {
                str6 = "   ";
            }
            SpannableString spannableString = new SpannableString(str6);
            spannableString.setSpan(bVar, 0, str6.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) "\n");
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new UgcIntroductionComponent$layoutSpecialTag$4$1$2(str, textView, i13, str2, i14, bVar, i15, null), 3, (Object) null);
            i16++;
        }
        return Unit.INSTANCE;
    }
}
