package com.bilibili.lib.projection.internal.search.searchv2;

import De0.C1592z;
import com.bilibili.lib.projection.internal.search.searchv2.SearchPanelContainer$manuallySearch$1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/searchv2/SearchPanelContainer$manuallySearch$1.class */
public final class SearchPanelContainer$manuallySearch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final boolean $firstRefresh;
    long J$0;
    int label;
    final SearchPanelContainer this$0;

    /* JADX INFO: renamed from: com.bilibili.lib.projection.internal.search.searchv2.SearchPanelContainer$manuallySearch$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/searchv2/SearchPanelContainer$manuallySearch$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final boolean $firstRefresh;
        int label;
        final SearchPanelContainer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SearchPanelContainer searchPanelContainer, boolean z6, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = searchPanelContainer;
            this.$firstRefresh = z6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0173  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final void invokeSuspend$lambda$0(com.bilibili.lib.projection.internal.search.searchv2.SearchPanelContainer r4, boolean r5) {
            /*
                Method dump skipped, instruction units count: 1400
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.search.searchv2.SearchPanelContainer$manuallySearch$1.AnonymousClass1.invokeSuspend$lambda$0(com.bilibili.lib.projection.internal.search.searchv2.SearchPanelContainer, boolean):void");
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$firstRefresh, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final SearchPanelContainer searchPanelContainer = this.this$0;
            final boolean z6 = this.$firstRefresh;
            return Boxing.boxBoolean(searchPanelContainer.postDelayed(new Runnable(searchPanelContainer, z6) { // from class: com.bilibili.lib.projection.internal.search.searchv2.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final SearchPanelContainer f63804a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean f63805b;

                {
                    this.f63804a = searchPanelContainer;
                    this.f63805b = z6;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    SearchPanelContainer$manuallySearch$1.AnonymousClass1.invokeSuspend$lambda$0(this.f63804a, this.f63805b);
                }
            }, 0L));
        }
    }

    /* JADX INFO: renamed from: com.bilibili.lib.projection.internal.search.searchv2.SearchPanelContainer$manuallySearch$1$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/searchv2/SearchPanelContainer$manuallySearch$1$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C1592z $offlineList;
        int label;
        final SearchPanelContainer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SearchPanelContainer searchPanelContainer, C1592z c1592z, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = searchPanelContainer;
            this.$offlineList = c1592z;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$offlineList, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00df  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00f2  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0100  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                Method dump skipped, instruction units count: 324
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.search.searchv2.SearchPanelContainer$manuallySearch$1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchPanelContainer$manuallySearch$1(boolean z6, SearchPanelContainer searchPanelContainer, Continuation<? super SearchPanelContainer$manuallySearch$1> continuation) {
        super(2, continuation);
        this.$firstRefresh = z6;
        this.this$0 = searchPanelContainer;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchPanelContainer$manuallySearch$1(this.$firstRefresh, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:0|2|(2:4|(2:6|(2:8|(2:10|(3:12|61|62)(2:13|14))(5:15|57|(2:59|60)|61|62))(15:16|29|63|30|(4:36|(5:40|(2:42|66)(1:67)|43|37|38)|65|46)|47|48|50|(1:52)|53|(2:55|56)|57|(0)|61|62))(1:17))(2:18|(2:20|(2:22|23))(1:24))|25|(2:27|28)|29|63|30|(6:32|34|36|(2:37|38)|65|46)|47|48|50|(0)|53|(0)|57|(0)|61|62) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0151, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0194, code lost:
    
        r0 = kotlin.Result.Companion;
        r7 = kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(r14));
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011b A[Catch: all -> 0x0151, TryCatch #0 {all -> 0x0151, blocks: (B:30:0x00c8, B:32:0x00d8, B:34:0x00e4, B:36:0x00f4, B:38:0x0113, B:40:0x011b, B:42:0x0146, B:46:0x0156, B:47:0x018a, B:47:0x018a, B:48:0x018d), top: B:63:0x00c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0201  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.search.searchv2.SearchPanelContainer$manuallySearch$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
