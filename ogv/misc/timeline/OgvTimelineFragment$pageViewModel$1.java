package com.bilibili.ogv.misc.timeline;

import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.search2.api.SearchBangumiItem;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/OgvTimelineFragment$pageViewModel$1.class */
public final /* synthetic */ class OgvTimelineFragment$pageViewModel$1 extends FunctionReferenceImpl implements Function3<Long, Boolean, Function0<? extends Unit>, Unit> {
    public OgvTimelineFragment$pageViewModel$1(Object obj) {
        super(3, obj, OgvTimelineFragment.class, "toggleFollow", "toggleFollow(JZLkotlin/jvm/functions/Function0;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke(((Number) obj).longValue(), ((Boolean) obj2).booleanValue(), (Function0<Unit>) obj3);
        return Unit.INSTANCE;
    }

    public final void invoke(long j7, boolean z6, Function0<Unit> function0) {
        OgvTimelineFragment ogvTimelineFragment = (OgvTimelineFragment) ((CallableReference) this).receiver;
        ogvTimelineFragment.getClass();
        if (com.bilibili.ogv.infra.account.a.f67852b.isLogin()) {
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(ogvTimelineFragment), (CoroutineContext) null, (CoroutineStart) null, new OgvTimelineFragment$toggleFollow$1(z6, j7, ogvTimelineFragment, function0, null), 3, (Object) null);
        } else {
            Nl0.h.c(ogvTimelineFragment.requireContext(), "activity://main/login/", 0, SearchBangumiItem.TYPE_FULLNET_VARIETY, null);
        }
    }
}
