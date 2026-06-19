package com.bilibili.opd.app.bizcommon.mangapaysdk.view;

import com.bilibili.opd.app.bizcommon.mangapaysdk.adapter.MangaCommonAdapter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/view/MangaPayFragment$onClickAction$1.class */
final class MangaPayFragment$onClickAction$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $clickPosition;
    final MangaCommonAdapter.b $holderData;
    int label;
    final MangaPayFragment this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/view/MangaPayFragment$onClickAction$1$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f74131a;

        static {
            int[] iArr = new int[MangaCommonAdapter.MangaRVItemHolderType.values().length];
            try {
                iArr[MangaCommonAdapter.MangaRVItemHolderType.ChargingLevelType.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[MangaCommonAdapter.MangaRVItemHolderType.BulkLevelSubsequentType.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[MangaCommonAdapter.MangaRVItemHolderType.MoreLevelType.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f74131a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MangaPayFragment$onClickAction$1(MangaCommonAdapter.b bVar, MangaPayFragment mangaPayFragment, int i7, Continuation<? super MangaPayFragment$onClickAction$1> continuation) {
        super(2, continuation);
        this.$holderData = bVar;
        this.this$0 = mangaPayFragment;
        this.$clickPosition = i7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MangaPayFragment$onClickAction$1(this.$holderData, this.this$0, this.$clickPosition, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 604
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.mangapaysdk.view.MangaPayFragment$onClickAction$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
