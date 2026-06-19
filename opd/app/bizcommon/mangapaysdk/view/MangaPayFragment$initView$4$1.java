package com.bilibili.opd.app.bizcommon.mangapaysdk.view;

import com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.ComicShowUiStatus;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/view/MangaPayFragment$initView$4$1.class */
final class MangaPayFragment$initView$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final MangaPayFragment this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/view/MangaPayFragment$initView$4$1$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f74129a;

        static {
            int[] iArr = new int[ComicShowUiStatus.values().length];
            try {
                iArr[ComicShowUiStatus.OnlyVolumePurchase.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[ComicShowUiStatus.OnlySingleStoryPurchase.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[ComicShowUiStatus.BulkPurchase.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[ComicShowUiStatus.SingleStoryPurchaseWithBulk.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[ComicShowUiStatus.SingleStoryPurchaseWithVolume.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr[ComicShowUiStatus.VolumePurchaseWithSingleStory.ordinal()] = 6;
            } catch (NoSuchFieldError e12) {
            }
            f74129a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MangaPayFragment$initView$4$1(MangaPayFragment mangaPayFragment, Continuation<? super MangaPayFragment$initView$4$1> continuation) {
        super(2, continuation);
        this.this$0 = mangaPayFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MangaPayFragment$initView$4$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.mangapaysdk.view.MangaPayFragment$initView$4$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
