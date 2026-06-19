package com.bilibili.studio.editor.moudle.caption.setting.presenter;

import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/setting/presenter/CaptionSettingPresenter$downloadBindFontAndAnim$1.class */
final class CaptionSettingPresenter$downloadBindFontAndAnim$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Function0<Unit> $callback;
    final CaptionListItem $captionListItem;
    private Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptionSettingPresenter$downloadBindFontAndAnim$1(CaptionListItem captionListItem, Function0<Unit> function0, e eVar, Continuation<? super CaptionSettingPresenter$downloadBindFontAndAnim$1> continuation) {
        super(2, continuation);
        this.$captionListItem = captionListItem;
        this.$callback = function0;
        this.this$0 = eVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CaptionSettingPresenter$downloadBindFontAndAnim$1 captionSettingPresenter$downloadBindFontAndAnim$1 = new CaptionSettingPresenter$downloadBindFontAndAnim$1(this.$captionListItem, this.$callback, this.this$0, continuation);
        captionSettingPresenter$downloadBindFontAndAnim$1.L$0 = obj;
        return captionSettingPresenter$downloadBindFontAndAnim$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0233  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 661
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.caption.setting.presenter.CaptionSettingPresenter$downloadBindFontAndAnim$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
