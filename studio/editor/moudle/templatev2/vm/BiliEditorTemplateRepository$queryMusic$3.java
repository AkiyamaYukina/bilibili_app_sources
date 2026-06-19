package com.bilibili.studio.editor.moudle.templatev2.vm;

import com.bilibili.studio.editor.moudle.music.model.EditorMusicItem;
import com.bilibili.studio.editor.moudle.templatev2.vm.BiliEditorTemplateRepository;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/vm/BiliEditorTemplateRepository$queryMusic$3.class */
final class BiliEditorTemplateRepository$queryMusic$3 extends SuspendLambda implements Function2<Integer, Continuation<? super Boolean>, Object> {
    final BiliEditorTemplateRepository.c $bindMusicCache;
    final boolean $forceUpdate;
    final BiliEditorTemplateRepository.a $recMusicCache;
    final String $recMusicSids;
    final Ref.ObjectRef<Pair<BiliEditorTemplateRepository.c, BiliEditorTemplateRepository.a>> $result;
    final Ref.BooleanRef $retryWithForceUpdate;
    final String $templateBindIdStr;
    final List<String> $templateBindIds;
    int label;

    /* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.templatev2.vm.BiliEditorTemplateRepository$queryMusic$3$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/vm/BiliEditorTemplateRepository$queryMusic$3$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final BiliEditorTemplateRepository.c $bindMusicCache;
        final boolean $forceUpdate;
        final BiliEditorTemplateRepository.a $recMusicCache;
        final String $recMusicSids;
        final Ref.ObjectRef<Pair<BiliEditorTemplateRepository.c, BiliEditorTemplateRepository.a>> $result;
        final Ref.BooleanRef $retryWithForceUpdate;
        final String $templateBindIdStr;
        final List<String> $templateBindIds;
        private Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.BooleanRef booleanRef, String str, List<String> list, boolean z6, BiliEditorTemplateRepository.c cVar, BiliEditorTemplateRepository.a aVar, Ref.ObjectRef<Pair<BiliEditorTemplateRepository.c, BiliEditorTemplateRepository.a>> objectRef, String str2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$retryWithForceUpdate = booleanRef;
            this.$recMusicSids = str;
            this.$templateBindIds = list;
            this.$forceUpdate = z6;
            this.$bindMusicCache = cVar;
            this.$recMusicCache = aVar;
            this.$result = objectRef;
            this.$templateBindIdStr = str2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$retryWithForceUpdate, this.$recMusicSids, this.$templateBindIds, this.$forceUpdate, this.$bindMusicCache, this.$recMusicCache, this.$result, this.$templateBindIdStr, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:49:0x0193  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x01c8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 493
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.templatev2.vm.BiliEditorTemplateRepository$queryMusic$3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliEditorTemplateRepository$queryMusic$3(Ref.ObjectRef<Pair<BiliEditorTemplateRepository.c, BiliEditorTemplateRepository.a>> objectRef, Ref.BooleanRef booleanRef, String str, List<String> list, boolean z6, BiliEditorTemplateRepository.c cVar, BiliEditorTemplateRepository.a aVar, String str2, Continuation<? super BiliEditorTemplateRepository$queryMusic$3> continuation) {
        super(2, continuation);
        this.$result = objectRef;
        this.$retryWithForceUpdate = booleanRef;
        this.$recMusicSids = str;
        this.$templateBindIds = list;
        this.$forceUpdate = z6;
        this.$bindMusicCache = cVar;
        this.$recMusicCache = aVar;
        this.$templateBindIdStr = str2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliEditorTemplateRepository$queryMusic$3(this.$result, this.$retryWithForceUpdate, this.$recMusicSids, this.$templateBindIds, this.$forceUpdate, this.$bindMusicCache, this.$recMusicCache, this.$templateBindIdStr, continuation);
    }

    public final Object invoke(int i7, Continuation<? super Boolean> continuation) {
        return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (Continuation<? super Boolean>) obj2);
    }

    public final Object invokeSuspend(Object obj) {
        BiliEditorTemplateRepository.c cVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineContext context = getContext();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$retryWithForceUpdate, this.$recMusicSids, this.$templateBindIds, this.$forceUpdate, this.$bindMusicCache, this.$recMusicCache, this.$result, this.$templateBindIdStr, null);
            this.label = 1;
            if (BuildersKt.withContext(context, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Pair pair = (Pair) this.$result.element;
        List<EditorMusicItem> list = (pair == null || (cVar = (BiliEditorTemplateRepository.c) pair.getFirst()) == null) ? null : cVar.f108141b;
        if (list == null || list.isEmpty()) {
            Pair pair2 = (Pair) this.$result.element;
            List<EditorMusicItem> list2 = null;
            if (pair2 != null) {
                BiliEditorTemplateRepository.a aVar = (BiliEditorTemplateRepository.a) pair2.getSecond();
                list2 = null;
                if (aVar != null) {
                    list2 = aVar.f108135b;
                }
            }
            List<EditorMusicItem> list3 = list2;
            if (list3 == null || list3.isEmpty()) {
                this.$retryWithForceUpdate.element = true;
                return Boxing.boxBoolean(false);
            }
        }
        return Boxing.boxBoolean(true);
    }
}
