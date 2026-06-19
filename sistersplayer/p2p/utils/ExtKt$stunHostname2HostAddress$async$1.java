package com.bilibili.sistersplayer.p2p.utils;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequencesKt;
import kotlin.text.MatchGroup;
import kotlin.text.MatchGroupCollection;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/utils/ExtKt$stunHostname2HostAddress$async$1.class */
public final class ExtKt$stunHostname2HostAddress$async$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final List<String> $now;
    final List<String> $origin;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtKt$stunHostname2HostAddress$async$1(List<String> list, List<String> list2, Continuation<? super ExtKt$stunHostname2HostAddress$async$1> continuation) {
        super(2, continuation);
        this.$origin = list;
        this.$now = list2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ExtKt$stunHostname2HostAddress$async$1(this.$origin, this.$now, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        MatchGroupCollection groups;
        MatchGroup matchGroup;
        String value;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            List<String> list = this.$origin;
            List<String> list2 = this.$now;
            for (String str : list) {
                MatchResult matchResult = (MatchResult) SequencesKt.firstOrNull(Regex.findAll$default(new Regex("^stun:(.+?)(:\\d+)?$"), str, 0, 2, (Object) null));
                if (matchResult != null && (groups = matchResult.getGroups()) != null && (matchGroup = groups.get(1)) != null && (value = matchGroup.getValue()) != null) {
                    try {
                        InetAddress byName = InetAddress.getByName(value);
                        if (byName instanceof Inet4Address) {
                            Boxing.boxBoolean(list2.add(StringsKt.L(str, value, ((Inet4Address) byName).getHostAddress())));
                        } else if (byName instanceof Inet6Address) {
                            Boxing.boxBoolean(list2.add(StringsKt.L(str, value, "[" + ((Inet6Address) byName).getHostAddress() + "]")));
                        } else {
                            Unit unit = Unit.INSTANCE;
                        }
                    } catch (Exception e7) {
                    }
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return Unit.INSTANCE;
    }
}
