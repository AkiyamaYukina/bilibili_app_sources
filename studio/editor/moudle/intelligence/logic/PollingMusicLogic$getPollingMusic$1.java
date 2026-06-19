package com.bilibili.studio.editor.moudle.intelligence.logic;

import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.studio.editor.moudle.intelligence.music.api.bean.PollingMusicResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/logic/PollingMusicLogic$getPollingMusic$1.class */
final class PollingMusicLogic$getPollingMusic$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $beginTime;
    final String $contentTags;
    final long $internalTime;
    final Ref.ObjectRef<BiliApiDataCallback<PollingMusicResponse>> $localCallback;
    final String $platfrom;
    final long $timeOut;
    final String $trackId;
    final int $upFrom;
    final String $uploadId;
    final String $zipUrl;
    long J$0;
    private Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollingMusicLogic$getPollingMusic$1(long j7, long j8, Ref.ObjectRef<BiliApiDataCallback<PollingMusicResponse>> objectRef, String str, String str2, int i7, String str3, String str4, String str5, long j9, Continuation<? super PollingMusicLogic$getPollingMusic$1> continuation) {
        super(2, continuation);
        this.$beginTime = j7;
        this.$timeOut = j8;
        this.$localCallback = objectRef;
        this.$uploadId = str;
        this.$zipUrl = str2;
        this.$upFrom = i7;
        this.$platfrom = str3;
        this.$contentTags = str4;
        this.$trackId = str5;
        this.$internalTime = j9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0$0(Ref.ObjectRef objectRef, PollingMusicResponse pollingMusicResponse) {
        BiliApiDataCallback biliApiDataCallback = (BiliApiDataCallback) objectRef.element;
        if (biliApiDataCallback != null) {
            biliApiDataCallback.onDataSuccess(pollingMusicResponse);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0$1(Ref.ObjectRef objectRef) {
        BiliApiDataCallback biliApiDataCallback = (BiliApiDataCallback) objectRef.element;
        if (biliApiDataCallback != null) {
            biliApiDataCallback.onError(new Throwable("Poll Music Service on Error"));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(Ref.ObjectRef objectRef) {
        BiliApiDataCallback biliApiDataCallback = (BiliApiDataCallback) objectRef.element;
        if (biliApiDataCallback != null) {
            biliApiDataCallback.onError(new Throwable("Poll Music Service timeout"));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(Ref.ObjectRef objectRef) {
        BiliApiDataCallback biliApiDataCallback = (BiliApiDataCallback) objectRef.element;
        if (biliApiDataCallback != null) {
            biliApiDataCallback.onError(new Throwable("Poll Music Service on Error"));
        }
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PollingMusicLogic$getPollingMusic$1 pollingMusicLogic$getPollingMusic$1 = new PollingMusicLogic$getPollingMusic$1(this.$beginTime, this.$timeOut, this.$localCallback, this.$uploadId, this.$zipUrl, this.$upFrom, this.$platfrom, this.$contentTags, this.$trackId, this.$internalTime, continuation);
        pollingMusicLogic$getPollingMusic$1.L$0 = obj;
        return pollingMusicLogic$getPollingMusic$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Not initialized variable reg: 15, insn: 0x049d: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r15 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:227:0x047c */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0243  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:200:0x0405 -> B:203:0x040b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 1222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.intelligence.logic.PollingMusicLogic$getPollingMusic$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
