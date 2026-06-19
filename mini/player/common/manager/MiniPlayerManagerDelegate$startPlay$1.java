package com.bilibili.mini.player.common.manager;

import android.content.SharedPreferences;
import android.view.WindowManager;
import com.bilibili.base.BiliContext;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.Video;
import uh0.C8734c;
import vh0.AbstractC8809a;
import xh0.C8978d;
import xh0.h;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mini/player/common/manager/MiniPlayerManagerDelegate$startPlay$1.class */
final class MiniPlayerManagerDelegate$startPlay$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final AbstractC8809a $currentPanel;
    final boolean $needSwitchPanel;
    final C8734c $req;
    private Object L$0;
    int label;

    /* JADX INFO: renamed from: com.bilibili.mini.player.common.manager.MiniPlayerManagerDelegate$startPlay$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mini/player/common/manager/MiniPlayerManagerDelegate$startPlay$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final AbstractC8809a $panel;
        final C8734c $req;
        private Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C8734c c8734c, AbstractC8809a abstractC8809a, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$req = c8734c;
            this.$panel = abstractC8809a;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$req, this.$panel, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            Set<String> stringSet;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (CoroutineScopeKt.isActive((CoroutineScope) this.L$0)) {
                Video.PlayableParams playableParams = (Video.PlayableParams) CollectionsKt.firstOrNull(this.$req.f127867a.getPlayableParamsList());
                if (playableParams != null) {
                    AbstractC8809a abstractC8809a = this.$panel;
                    e.f66066b.getClass();
                    final h hVarC = e.c();
                    float displayRotate = playableParams.getDisplayParams().getDisplayRotate();
                    C8978d c8978dH = hVarC.h();
                    if (c8978dH != null) {
                        float f7 = hVarC.f129255o;
                        float f8 = 1 / displayRotate;
                        hVarC.f129255o = f8;
                        if (hVarC.f129254n || hVarC.f129253m) {
                            BLog.i("MiniPlayerManager", "already has a view in window");
                            if (f7 != hVarC.f129255o) {
                                hVarC.q(c8978dH.getWidth());
                            }
                        } else {
                            hVarC.f129255o = f8;
                            SharedPreferences bLKVSharedPreference = BiliGlobalPreferenceHelper.getBLKVSharedPreference();
                            if (bLKVSharedPreference != null && (stringSet = bLKVSharedPreference.getStringSet("sp_mini_player_v2_coordinate", SetsKt.setOf(new String[]{CaptureSchema.OLD_INVALID_ID_STRING, CaptureSchema.OLD_INVALID_ID_STRING}))) != null) {
                                Set<String> set = stringSet;
                                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
                                Iterator<T> it = set.iterator();
                                while (true) {
                                    arrayList = arrayList2;
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    Integer intOrNull = StringsKt.toIntOrNull((String) it.next());
                                    arrayList2.add(Integer.valueOf(intOrNull != null ? intOrNull.intValue() : -1));
                                }
                            } else {
                                arrayList = null;
                            }
                            Pair<Integer, Integer> pair = (arrayList == null || arrayList.isEmpty()) ? new Pair<>(-1, -1) : arrayList.size() == 1 ? new Pair<>(arrayList.get(0), arrayList.get(0)) : new Pair<>(arrayList.get(0), arrayList.get(1));
                            hVarC.f129247f = pair;
                            if (((Number) pair.getFirst()).intValue() < 0 || ((Number) hVarC.f129247f.getSecond()).intValue() < 0) {
                                hVarC.e(0, 0);
                                int iJ = hVarC.f129242a ? hVarC.j() - hVarC.f129244c.width : hVarC.k().left;
                                int i7 = hVarC.i();
                                int i8 = hVarC.f129244c.height;
                                int i9 = hVarC.k().bottom;
                                WindowManager.LayoutParams layoutParams = hVarC.f129244c;
                                layoutParams.x = iJ;
                                layoutParams.y = (i7 - i8) - i9;
                            } else {
                                hVarC.e(((Number) hVarC.f129247f.getFirst()).intValue(), ((Number) hVarC.f129247f.getSecond()).intValue());
                            }
                            WindowManager.LayoutParams layoutParams2 = hVarC.f129244c;
                            layoutParams2.x = (layoutParams2.width / 2) + layoutParams2.x <= hVarC.j() / 2 ? hVarC.k().left : (hVarC.j() - hVarC.k().right) - hVarC.f129244c.width;
                            BLog.i("MiniPlayerManager", "show float view window manager:" + hVarC.l() + " floatParams:" + hVarC.f129244c + " maxWidth:" + hVarC.j() + " outRect:" + hVarC.k() + " local:" + arrayList + " displayRotate:" + displayRotate);
                            hVarC.d(true);
                            hVarC.f129254n = true;
                            c8978dH.post(new Runnable(hVarC) { // from class: xh0.g

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final h f129241a;

                                {
                                    this.f129241a = hVarC;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f129241a.o(0);
                                }
                            });
                        }
                    }
                    e.f66066b.getClass();
                    if (e.c().h() == null) {
                        BLog.e("MiniPlayerManager", "Error, dragview is null!!!");
                    }
                    abstractC8809a.f128251b = e.f66079p;
                    abstractC8809a.h();
                    if (!BiliContext.isVisible()) {
                        abstractC8809a.c();
                    }
                }
            } else {
                BLog.w("MiniPlayerManager", "show player job has been canceled");
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniPlayerManagerDelegate$startPlay$1(boolean z6, AbstractC8809a abstractC8809a, C8734c c8734c, Continuation<? super MiniPlayerManagerDelegate$startPlay$1> continuation) {
        super(2, continuation);
        this.$needSwitchPanel = z6;
        this.$currentPanel = abstractC8809a;
        this.$req = c8734c;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MiniPlayerManagerDelegate$startPlay$1 miniPlayerManagerDelegate$startPlay$1 = new MiniPlayerManagerDelegate$startPlay$1(this.$needSwitchPanel, this.$currentPanel, this.$req, continuation);
        miniPlayerManagerDelegate$startPlay$1.L$0 = obj;
        return miniPlayerManagerDelegate$startPlay$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        if (r10 != null) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 935
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.mini.player.common.manager.MiniPlayerManagerDelegate$startPlay$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
