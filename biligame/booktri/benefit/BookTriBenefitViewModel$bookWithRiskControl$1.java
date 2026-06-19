package com.bilibili.biligame.booktri.benefit;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/booktri/benefit/BookTriBenefitViewModel$bookWithRiskControl$1.class */
final class BookTriBenefitViewModel$bookWithRiskControl$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $adSource;
    final String $captcha;
    final String $challenge;
    final String $extra;
    final int $gameBaseId;
    final Integer $geeType;
    final String $secCode;
    final String $token;
    final String $userId;
    final String $validate;
    private Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final h0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BookTriBenefitViewModel$bookWithRiskControl$1(h0 h0Var, int i7, String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, Continuation<? super BookTriBenefitViewModel$bookWithRiskControl$1> continuation) {
        super(2, continuation);
        this.this$0 = h0Var;
        this.$gameBaseId = i7;
        this.$adSource = str;
        this.$challenge = str2;
        this.$validate = str3;
        this.$secCode = str4;
        this.$userId = str5;
        this.$geeType = num;
        this.$token = str6;
        this.$captcha = str7;
        this.$extra = str8;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BookTriBenefitViewModel$bookWithRiskControl$1 bookTriBenefitViewModel$bookWithRiskControl$1 = new BookTriBenefitViewModel$bookWithRiskControl$1(this.this$0, this.$gameBaseId, this.$adSource, this.$challenge, this.$validate, this.$secCode, this.$userId, this.$geeType, this.$token, this.$captcha, this.$extra, continuation);
        bookTriBenefitViewModel$bookWithRiskControl$1.L$0 = obj;
        return bookTriBenefitViewModel$bookWithRiskControl$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0502 A[Catch: Exception -> 0x005d, TRY_LEAVE, TryCatch #0 {Exception -> 0x005d, blocks: (B:7:0x0050, B:113:0x0534, B:115:0x0540, B:120:0x055c, B:122:0x0564, B:118:0x0555, B:12:0x007c, B:96:0x04ca, B:99:0x04d9, B:104:0x04eb, B:106:0x04fa, B:108:0x0502, B:15:0x00ad, B:91:0x0487, B:18:0x00de, B:63:0x03d4, B:65:0x03e0, B:67:0x03f5, B:73:0x0408, B:75:0x0411, B:77:0x041e, B:83:0x0431, B:85:0x0439, B:21:0x0118, B:38:0x030b, B:40:0x031d, B:42:0x0329, B:44:0x0337, B:46:0x033f, B:48:0x035c, B:52:0x036b, B:54:0x0378, B:56:0x038a, B:58:0x0395, B:24:0x0152, B:32:0x02b8, B:27:0x017a), top: B:126:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0540 A[Catch: Exception -> 0x005d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x005d, blocks: (B:7:0x0050, B:113:0x0534, B:115:0x0540, B:120:0x055c, B:122:0x0564, B:118:0x0555, B:12:0x007c, B:96:0x04ca, B:99:0x04d9, B:104:0x04eb, B:106:0x04fa, B:108:0x0502, B:15:0x00ad, B:91:0x0487, B:18:0x00de, B:63:0x03d4, B:65:0x03e0, B:67:0x03f5, B:73:0x0408, B:75:0x0411, B:77:0x041e, B:83:0x0431, B:85:0x0439, B:21:0x0118, B:38:0x030b, B:40:0x031d, B:42:0x0329, B:44:0x0337, B:46:0x033f, B:48:0x035c, B:52:0x036b, B:54:0x0378, B:56:0x038a, B:58:0x0395, B:24:0x0152, B:32:0x02b8, B:27:0x017a), top: B:126:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0555 A[Catch: Exception -> 0x005d, TRY_ENTER, TryCatch #0 {Exception -> 0x005d, blocks: (B:7:0x0050, B:113:0x0534, B:115:0x0540, B:120:0x055c, B:122:0x0564, B:118:0x0555, B:12:0x007c, B:96:0x04ca, B:99:0x04d9, B:104:0x04eb, B:106:0x04fa, B:108:0x0502, B:15:0x00ad, B:91:0x0487, B:18:0x00de, B:63:0x03d4, B:65:0x03e0, B:67:0x03f5, B:73:0x0408, B:75:0x0411, B:77:0x041e, B:83:0x0431, B:85:0x0439, B:21:0x0118, B:38:0x030b, B:40:0x031d, B:42:0x0329, B:44:0x0337, B:46:0x033f, B:48:0x035c, B:52:0x036b, B:54:0x0378, B:56:0x038a, B:58:0x0395, B:24:0x0152, B:32:0x02b8, B:27:0x017a), top: B:126:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x038a A[Catch: Exception -> 0x005d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x005d, blocks: (B:7:0x0050, B:113:0x0534, B:115:0x0540, B:120:0x055c, B:122:0x0564, B:118:0x0555, B:12:0x007c, B:96:0x04ca, B:99:0x04d9, B:104:0x04eb, B:106:0x04fa, B:108:0x0502, B:15:0x00ad, B:91:0x0487, B:18:0x00de, B:63:0x03d4, B:65:0x03e0, B:67:0x03f5, B:73:0x0408, B:75:0x0411, B:77:0x041e, B:83:0x0431, B:85:0x0439, B:21:0x0118, B:38:0x030b, B:40:0x031d, B:42:0x0329, B:44:0x0337, B:46:0x033f, B:48:0x035c, B:52:0x036b, B:54:0x0378, B:56:0x038a, B:58:0x0395, B:24:0x0152, B:32:0x02b8, B:27:0x017a), top: B:126:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03e0 A[Catch: Exception -> 0x005d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x005d, blocks: (B:7:0x0050, B:113:0x0534, B:115:0x0540, B:120:0x055c, B:122:0x0564, B:118:0x0555, B:12:0x007c, B:96:0x04ca, B:99:0x04d9, B:104:0x04eb, B:106:0x04fa, B:108:0x0502, B:15:0x00ad, B:91:0x0487, B:18:0x00de, B:63:0x03d4, B:65:0x03e0, B:67:0x03f5, B:73:0x0408, B:75:0x0411, B:77:0x041e, B:83:0x0431, B:85:0x0439, B:21:0x0118, B:38:0x030b, B:40:0x031d, B:42:0x0329, B:44:0x0337, B:46:0x033f, B:48:0x035c, B:52:0x036b, B:54:0x0378, B:56:0x038a, B:58:0x0395, B:24:0x0152, B:32:0x02b8, B:27:0x017a), top: B:126:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04d9 A[Catch: Exception -> 0x005d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x005d, blocks: (B:7:0x0050, B:113:0x0534, B:115:0x0540, B:120:0x055c, B:122:0x0564, B:118:0x0555, B:12:0x007c, B:96:0x04ca, B:99:0x04d9, B:104:0x04eb, B:106:0x04fa, B:108:0x0502, B:15:0x00ad, B:91:0x0487, B:18:0x00de, B:63:0x03d4, B:65:0x03e0, B:67:0x03f5, B:73:0x0408, B:75:0x0411, B:77:0x041e, B:83:0x0431, B:85:0x0439, B:21:0x0118, B:38:0x030b, B:40:0x031d, B:42:0x0329, B:44:0x0337, B:46:0x033f, B:48:0x035c, B:52:0x036b, B:54:0x0378, B:56:0x038a, B:58:0x0395, B:24:0x0152, B:32:0x02b8, B:27:0x017a), top: B:126:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 1488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.booktri.benefit.BookTriBenefitViewModel$bookWithRiskControl$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
